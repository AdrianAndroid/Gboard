package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.CrossProfileApps;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: fjn  reason: default package */
/* loaded from: classes.dex */
public final class fjn {
    public static final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private static final BroadcastReceiver q = new fjl();
    private static final AtomicBoolean r = new AtomicBoolean(false);
    public final ScheduledExecutorService b;
    public final Context c;
    public final ComponentName d;
    public final boolean e;
    public final fjx f;
    public final fjd p;
    private final fjg s;
    private final fjf t;
    private volatile CountDownLatch x;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    private final Set u = Collections.newSetFromMap(new WeakHashMap());
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public final Map k = new WeakHashMap();
    public final Set l = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentLinkedDeque m = new ConcurrentLinkedDeque();
    private final AtomicBoolean v = new AtomicBoolean(true);
    public final ServiceConnection n = new fjk(this);
    private final AtomicReference w = new AtomicReference();
    private long y = 500;
    public int o = 0;
    private int z = 0;

    public fjn(Context context, String str, fjd fjdVar, fjg fjgVar, fjf fjfVar, ScheduledExecutorService scheduledExecutorService, fjx fjxVar) {
        boolean z = false;
        this.c = context.getApplicationContext();
        if (fjxVar == null || scheduledExecutorService == null) {
            throw null;
        }
        this.p = fjdVar;
        this.s = fjgVar;
        this.t = fjfVar;
        this.d = new ComponentName(context.getPackageName(), str);
        if (fjw.a) {
            z = fjw.b;
        } else {
            try {
                Context.class.getMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class);
                fjw.b = true;
                fjw.a = true;
                z = true;
            } catch (NoSuchMethodException e) {
                Log.e("ReflectionUtilities", "canUseReflectedApis is false", e);
                fjw.b = false;
                fjw.a = true;
            }
        }
        this.e = z;
        this.b = scheduledExecutorService;
        this.f = fjxVar;
        a.add(this);
        if (r.getAndSet(true)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNLOCKED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_AVAILABLE");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNAVAILABLE");
        this.c.registerReceiver(q, intentFilter);
    }

    public static UserHandle a(Context context, fjx fjxVar) {
        if (Build.VERSION.SDK_INT < 28) {
            UserHandle myUserHandle = Process.myUserHandle();
            ArrayList arrayList = new ArrayList();
            for (UserHandle userHandle : ((UserManager) context.getSystemService(UserManager.class)).getUserProfiles()) {
                if (!userHandle.equals(myUserHandle)) {
                    arrayList.add(userHandle);
                }
            }
            return fji.a(context, fji.b(context, arrayList, fjxVar));
        }
        return fji.a(context, fji.b(context, ((CrossProfileApps) context.getSystemService(CrossProfileApps.class)).getTargetUserProfiles(), fjxVar));
    }

    private final void s() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.i.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void b() {
        this.y = 500L;
        this.b.execute(new fci(this, 11));
    }

    public final void c() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.w.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void d() {
        if (!p() || this.z == 2) {
            if (p() || this.z == 1) {
                return;
            }
            this.s.c();
            this.z = 1;
            return;
        }
        this.s.c();
        this.z = 2;
    }

    public final void e() {
        if (!this.j.isEmpty() || !p()) {
            return;
        }
        Log.i("CrossProfileSender", "Scheduling automatic disconnection");
        ScheduledFuture schedule = this.b.schedule(new evl(this, 7), 30L, TimeUnit.SECONDS);
        AtomicReference atomicReference = this.w;
        while (!atomicReference.compareAndSet(null, schedule)) {
            if (atomicReference.get() != null) {
                Log.i("CrossProfileSender", "Already scheduled");
                schedule.cancel(true);
                return;
            }
        }
    }

    public final void f(String str) {
        g(str, null, false);
    }

    public final void g(String str, Exception exc, boolean z) {
        s();
        if (exc == null) {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)));
            k(new fka(str));
        } else {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)), exc);
            k(new fka(str, exc));
        }
        if (z || this.j.isEmpty()) {
            m();
            return;
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.h.get();
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            return;
        }
        long j = this.y;
        long j2 = j + j;
        this.y = j2;
        this.h.set(this.b.schedule(new fci(this, 11), j2, TimeUnit.MILLISECONDS));
    }

    public final void h() {
        s();
        Log.i("CrossProfileSender", "Binding attempt succeeded");
    }

    public final void i(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Connection holder cannot be null");
        }
        this.b.execute(new elr(this, obj, 18));
    }

    public final void j(Object obj) {
        Set<Object> set = (Set) this.k.get(obj);
        if (set != null) {
            this.k.remove(obj);
            for (Object obj2 : set) {
                j(obj2);
            }
        }
        this.u.remove(obj);
        this.v.set(this.u.isEmpty());
        this.j.remove(obj);
        this.l.remove(obj);
    }

    public final void k(Throwable th) {
        for (fjm fjmVar : this.l) {
            i(fjmVar);
            fjo fjoVar = fjmVar.d;
            Bundle bundle = new Bundle(fkd.class.getClassLoader());
            fgy.c(bundle, th);
            fjoVar.a(bundle);
        }
    }

    public final void l() {
        Log.i("CrossProfileSender", "tryMakeAsyncCalls");
        if (!p()) {
            return;
        }
        this.b.execute(new fci(this, 13));
    }

    public final void m() {
        Log.i("CrossProfileSender", "Unbind");
        if (p()) {
            this.c.unbindService(this.n);
            this.g.set(null);
            d();
            c();
        }
        s();
        k(new fka("No profile available"));
    }

    public final void n() {
        this.t.b();
        int i = 1;
        if (true == o()) {
            i = 2;
        }
        this.o = i;
    }

    public final boolean o() {
        return a(this.c, this.f) != null;
    }

    public final boolean p() {
        return this.g.get() != null;
    }

    public final void r(final long j, final int i, final Bundle bundle, final fjo fjoVar, final Object obj) {
        if (!o()) {
            k(new fka("Profile not available"));
        }
        this.b.execute(new Runnable() { // from class: fjj
            @Override // java.lang.Runnable
            public final void run() {
                fjn fjnVar = fjn.this;
                long j2 = j;
                int i2 = i;
                Bundle bundle2 = bundle;
                fjo fjoVar2 = fjoVar;
                Object obj2 = obj;
                fjm fjmVar = new fjm(j2, i2, bundle2, fjoVar2);
                fjnVar.j.add(fjmVar);
                fjnVar.c();
                fjnVar.b.execute(new epv(fjnVar, obj2, fjmVar, 7));
                fjnVar.l.add(fjmVar);
                fjnVar.m.add(fjmVar);
                fjnVar.l();
                fjnVar.b();
            }
        });
    }
}
