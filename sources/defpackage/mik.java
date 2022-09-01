package defpackage;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: mik  reason: default package */
/* loaded from: classes.dex */
public abstract class mik extends mlm implements mko {
    private static final Logger a;
    private static final Object b;
    static final boolean h;
    public static final mhv i;
    public volatile mhz listeners;
    public volatile Object value;
    public volatile mij waiters;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        mhv midVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        h = z;
        a = Logger.getLogger(mik.class.getName());
        try {
            midVar = new mii();
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                midVar = new mib(AtomicReferenceFieldUpdater.newUpdater(mij.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(mij.class, mij.class, "next"), AtomicReferenceFieldUpdater.newUpdater(mik.class, mij.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(mik.class, mhz.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(mik.class, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                midVar = new mid();
            }
        }
        i = midVar;
        if (th != null) {
            Logger logger = a;
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        b = new Object();
    }

    private static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void f(StringBuilder sb) {
        try {
            Object e = e(this);
            sb.append("SUCCESS, result=[");
            if (e == null) {
                sb.append("null");
            } else if (e == this) {
                sb.append("this future");
            } else {
                sb.append(e.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(e)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private final void g(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof mic) {
            sb.append(", setFuture=[");
            h(sb, ((mic) obj).b);
            sb.append("]");
        } else {
            try {
                concat = b();
                if (true == lfd.e(concat)) {
                    concat = null;
                }
            } catch (RuntimeException | StackOverflowError e) {
                StringBuilder sb2 = new StringBuilder("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                sb2.append(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            f(sb);
        }
    }

    private final void h(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    public static Object i(mko mkoVar) {
        Throwable j;
        if (mkoVar instanceof mie) {
            Object obj = ((mik) mkoVar).value;
            if (obj instanceof mhw) {
                mhw mhwVar = (mhw) obj;
                if (mhwVar.c) {
                    Throwable th = mhwVar.d;
                    obj = th != null ? new mhw(false, th) : mhw.b;
                }
            }
            return Objects.requireNonNull(obj);
        } else if (!(mkoVar instanceof mlm) || (j = ((mlm) mkoVar).j()) == null) {
            boolean isCancelled = mkoVar.isCancelled();
            if ((!h) & isCancelled) {
                return Objects.requireNonNull(mhw.b);
            }
            try {
                Object e = e(mkoVar);
                if (!isCancelled) {
                    return e == null ? b : e;
                }
                return new mhw(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + mkoVar));
            } catch (Error e2) {
                e = e2;
                return new mhy(e);
            } catch (CancellationException e3) {
                if (!isCancelled) {
                    new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ").append(mkoVar);
                    return new mhy(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(mkoVar)), e3));
                }
                return new mhw(false, e3);
            } catch (RuntimeException e4) {
                e = e4;
                return new mhy(e);
            } catch (ExecutionException e5) {
                if (isCancelled) {
                    new StringBuilder("get() did not throw CancellationException, despite reporting isCancelled() == true: ").append(mkoVar);
                    return new mhw(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(mkoVar)), e5));
                }
                return new mhy(e5.getCause());
            }
        } else {
            return new mhy(j);
        }
    }

    public static void k(mik mikVar) {
        mhz mhzVar = null;
        while (true) {
            for (mij b2 = i.b(mikVar, mij.a); b2 != null; b2 = b2.next) {
                Thread thread = b2.thread;
                if (thread != null) {
                    b2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            mikVar.a();
            mhz mhzVar2 = mhzVar;
            mhz a2 = i.a(mikVar, mhz.a);
            mhz mhzVar3 = mhzVar2;
            while (a2 != null) {
                mhz mhzVar4 = a2.next;
                a2.next = mhzVar3;
                mhzVar3 = a2;
                a2 = mhzVar4;
            }
            while (mhzVar3 != null) {
                mhzVar = mhzVar3.next;
                Runnable runnable = (Runnable) Objects.requireNonNull(mhzVar3.b);
                if (runnable instanceof mic) {
                    mic micVar = (mic) runnable;
                    mikVar = micVar.a;
                    if (mikVar.value == micVar) {
                        if (i.f(mikVar, micVar, i(micVar.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    q(runnable, (Executor) Objects.requireNonNull(mhzVar3.c));
                }
                mhzVar3 = mhzVar;
            }
            return;
        }
    }

    private static void q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    private final void r(mij mijVar) {
        mijVar.thread = null;
        while (true) {
            mij mijVar2 = this.waiters;
            if (mijVar2 != mij.a) {
                mij mijVar3 = null;
                while (mijVar2 != null) {
                    mij mijVar4 = mijVar2.next;
                    if (mijVar2.thread != null) {
                        mijVar3 = mijVar2;
                    } else if (mijVar3 != null) {
                        mijVar3.next = mijVar4;
                        if (mijVar3.thread == null) {
                            break;
                        }
                    } else if (!i.g(this, mijVar2, mijVar4)) {
                        break;
                    }
                    mijVar2 = mijVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object s(Object obj) {
        if (obj instanceof mhw) {
            Throwable th = ((mhw) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof mhy) {
            throw new ExecutionException(((mhy) obj).b);
        } else {
            if (obj != b) {
                return obj;
            }
            return null;
        }
    }

    protected void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c(Object obj) {
        if (obj == null) {
            obj = b;
        }
        if (i.f(this, null, obj)) {
            k(this);
            return true;
        }
        return false;
    }

    public boolean cancel(boolean z) {
        mhw mhwVar;
        Object requireNonNull;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof mic)) {
            if (h) {
                requireNonNull = new mhw(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    mhwVar = mhw.a;
                } else {
                    mhwVar = mhw.b;
                }
                requireNonNull = Objects.requireNonNull(mhwVar);
            }
            boolean z2 = false;
            mik mikVar = this;
            while (true) {
                if (i.f(mikVar, obj, requireNonNull)) {
                    if (z) {
                        mikVar.l();
                    }
                    k(mikVar);
                    if (!(obj instanceof mic)) {
                        break;
                    }
                    mko mkoVar = ((mic) obj).b;
                    if (mkoVar instanceof mie) {
                        mikVar = (mik) mkoVar;
                        obj = mikVar.value;
                        if (!(obj == null) && !(obj instanceof mic)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        mkoVar.cancel(z);
                        break;
                    }
                } else {
                    obj = mikVar.value;
                    if (!(obj instanceof mic)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mko
    public void d(Runnable runnable, Executor executor) {
        mhz mhzVar;
        jdg.Q(runnable, "Runnable was null.");
        jdg.Q(executor, "Executor was null.");
        if (isDone() || (mhzVar = this.listeners) == mhz.a) {
            q(runnable, executor);
        }
        mhz mhzVar2 = new mhz(runnable, executor);
        do {
            mhzVar2.next = mhzVar;
            if (i.e(this, mhzVar, mhzVar2)) {
                return;
            }
            mhzVar = this.listeners;
        } while (mhzVar != mhz.a);
        q(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        r0 = r6.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        if ((r4 & (!(r0 instanceof defpackage.mic))) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        return s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        r(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L65
            java.lang.Object r0 = r6.value
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            boolean r4 = r0 instanceof defpackage.mic
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = s(r0)
            return r0
        L1a:
            mij r0 = r6.waiters
            mij r3 = defpackage.mij.a
            if (r0 == r3) goto L5a
            mij r3 = new mij
            r3.<init>()
        L25:
            r3.a(r0)
            mhv r4 = defpackage.mik.i
            boolean r0 = r4.g(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.value
            if (r0 == 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = 0
        L40:
            boolean r5 = r0 instanceof defpackage.mic
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = s(r0)
            return r0
        L4b:
            r6.r(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            mij r0 = r6.waiters
            mij r4 = defpackage.mij.a
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.value
            java.lang.Object r0 = j$.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = s(r0)
            return r0
        L65:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            goto L6c
        L6b:
            throw r0
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mik.get():java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof mhw;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof mic)) & (obj != null);
    }

    @Override // defpackage.mlm
    public final Throwable j() {
        if (this instanceof mie) {
            Object obj = this.value;
            if (!(obj instanceof mhy)) {
                return null;
            }
            return ((mhy) obj).b;
        }
        return null;
    }

    protected void l() {
    }

    public final void m(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(o());
        }
    }

    public final boolean n(Throwable th) {
        jdg.u(th);
        if (i.f(this, null, new mhy(th))) {
            k(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o() {
        Object obj = this.value;
        return (obj instanceof mhw) && ((mhw) obj).c;
    }

    public final void p(mko mkoVar) {
        mhy mhyVar;
        jdg.u(mkoVar);
        Object obj = this.value;
        if (obj == null) {
            if (mkoVar.isDone()) {
                if (!i.f(this, null, i(mkoVar))) {
                    return;
                }
                k(this);
                return;
            }
            mic micVar = new mic(this, mkoVar);
            if (i.f(this, null, micVar)) {
                try {
                    mkoVar.d(micVar, mjl.a);
                    return;
                } catch (Error | RuntimeException e) {
                    try {
                        mhyVar = new mhy(e);
                    } catch (Error | RuntimeException unused) {
                        mhyVar = mhy.a;
                    }
                    i.f(this, micVar, mhyVar);
                    return;
                }
            }
            obj = this.value;
        }
        if (obj instanceof mhw) {
            mkoVar.cancel(((mhw) obj).c);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            g(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, java.lang.Math.min(r4, 2147483647999999999L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (java.lang.Thread.interrupted() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        r4 = r18.value;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        if ((r5 & (!(r4 instanceof defpackage.mic))) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        r4 = r11 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r4 >= 1000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        return s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        r(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mik.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
