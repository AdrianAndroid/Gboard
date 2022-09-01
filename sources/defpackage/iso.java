package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iso  reason: default package */
/* loaded from: classes.dex */
public final class iso {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/taskscheduler/TaskSpec");
    public static final long b = TimeUnit.SECONDS.toMillis(30);
    public static final long c = TimeUnit.SECONDS.toMillis(30);
    public static final long d = TimeUnit.HOURS.toMillis(5);
    public static final long e = TimeUnit.MINUTES.toMillis(5);
    public static final long f = TimeUnit.MINUTES.toMillis(15);
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public static final long h = TimeUnit.MINUTES.toMillis(5);
    public static final long i = TimeUnit.DAYS.toMillis(365);
    public final String j;
    public final int k;
    public final long l;
    public final long m;
    public final boolean n;
    public final long o;
    public final long p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final long u;
    public final long v;
    public final boolean w;
    public final jls x;

    public iso(isn isnVar) {
        this.x = new jls(isnVar.a, isnVar.i);
        this.j = isnVar.b;
        this.k = isnVar.c;
        this.l = isnVar.d;
        this.m = isnVar.e;
        this.n = isnVar.f;
        this.o = isnVar.g;
        this.p = isnVar.h;
        this.q = isnVar.j;
        this.r = isnVar.k;
        this.s = isnVar.l;
        this.t = isnVar.m;
        this.u = isnVar.n;
        this.v = isnVar.o;
        this.w = isnVar.p;
    }

    public static isn a(String str, String str2) {
        return new isn(str, str2);
    }

    public final synchronized String toString() {
        lfa T;
        T = jdg.T(this.j);
        T.f("retryPolicy", this.k);
        T.g("initialRetryMillis", this.l);
        T.g("maximumRetryMillis", this.m);
        T.h("requiredPeriodic", this.n);
        T.g("periodMillis", this.o);
        T.g("flexMillis", this.p);
        T.h("requiredPersisted", this.q);
        T.f("requiredNetworkType", this.r);
        T.h("requiredCharging", this.s);
        T.h("requiredDeviceIdle", this.t);
        T.g("maxExecutionDelayMillis", this.u);
        T.g("minDelayMillis", this.v);
        T.h("replaceCurrent", this.w);
        return T.toString();
    }
}
