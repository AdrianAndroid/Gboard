package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: pbe  reason: default package */
/* loaded from: classes2.dex */
public class pbe extends ozk implements ozu {
    private static final boolean a;
    private static volatile Object g;
    public final ScheduledExecutorService c;
    volatile boolean d;
    private static final Object h = new Object();
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private static final AtomicReference f = new AtomicReference();
    public static final int b = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i = pbi.a;
        boolean z2 = false;
        if (!z && (i == 0 || i >= 21)) {
            z2 = true;
        }
        a = z2;
    }

    public pbe(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool;
        ScheduledExecutorService newScheduledThreadPool2 = Executors.newScheduledThreadPool(1, threadFactory);
        if (!f(newScheduledThreadPool2) && (newScheduledThreadPool2 instanceof ScheduledThreadPoolExecutor)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) newScheduledThreadPool2;
            loop0: while (true) {
                AtomicReference atomicReference = f;
                if (((ScheduledExecutorService) atomicReference.get()) == null) {
                    newScheduledThreadPool = Executors.newScheduledThreadPool(1, new pbj("RxSchedulerPurge-"));
                    while (!atomicReference.compareAndSet(null, newScheduledThreadPool)) {
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    mkm mkmVar = new mkm(6);
                    long j = b;
                    newScheduledThreadPool.scheduleAtFixedRate(mkmVar, j, j, TimeUnit.MILLISECONDS);
                    break loop0;
                }
                break;
                newScheduledThreadPool.shutdownNow();
            }
            e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
        }
        this.c = newScheduledThreadPool2;
    }

    static Method b(ScheduledExecutorService scheduledExecutorService) {
        Method[] methods;
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public static void c() {
        try {
            Iterator it = e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (!scheduledThreadPoolExecutor.isShutdown()) {
                    scheduledThreadPoolExecutor.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            ols.p(th);
            pbp.b(th);
        }
    }

    public static boolean f(ScheduledExecutorService scheduledExecutorService) {
        Method b2;
        if (a) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = g;
                Object obj2 = h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    b2 = b(scheduledExecutorService);
                    if (b2 != null) {
                        obj2 = b2;
                    }
                    g = obj2;
                } else {
                    b2 = (Method) obj;
                }
            } else {
                b2 = b(scheduledExecutorService);
            }
            if (b2 != null) {
                try {
                    b2.invoke(scheduledExecutorService, true);
                    return true;
                } catch (IllegalAccessException e2) {
                    pbp.b(e2);
                } catch (IllegalArgumentException e3) {
                    pbp.b(e3);
                } catch (InvocationTargetException e4) {
                    pbp.b(e4);
                }
            }
        }
        return false;
    }

    @Override // defpackage.ozu
    public final void d() {
        this.d = true;
        this.c.shutdownNow();
        e.remove(this.c);
    }

    @Override // defpackage.ozu
    public final boolean e() {
        return this.d;
    }

    public final pbh g(pam pamVar) {
        if (pbp.i != null) {
            pbq.a.d();
        }
        pbh pbhVar = new pbh(pamVar);
        pbhVar.a.a(new pbf(pbhVar, this.c.submit(pbhVar)));
        return pbhVar;
    }

    @Override // defpackage.ozk
    public final void im(pam pamVar) {
        if (this.d) {
            return;
        }
        g(pamVar);
    }
}
