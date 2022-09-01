package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* renamed from: dtl  reason: default package */
/* loaded from: classes.dex */
public final class dtl {
    public final idk c;
    public boolean g;
    public boolean h;
    public ibz i;
    public boolean j;
    public long m;
    public final dxs n;
    private boolean p;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager");
    private static final lmz o = lmz.w(ibz.a, ibz.h, ibz.c, ibz.b, dko.a, dko.c, dko.b);
    static final Duration b = Duration.ofHours(1);
    public llw d = lrq.b;
    public fgt e = fgt.UNKNOWN;
    public fgt f = fgt.UNKNOWN;
    public dsx k = dsx.a;
    public dsx l = dsx.a;

    public dtl(dxs dxsVar, byte[] bArr) {
        ieh j = ieh.j();
        this.n = dxsVar;
        this.c = j;
    }

    public static fgt a(fgt fgtVar) {
        return fgt.UNRECOGNIZED.equals(fgtVar) ? fgt.UNKNOWN : fgtVar;
    }

    public final boolean b() {
        dsw a2 = dsx.a();
        a2.b(this.p);
        a2.h(this.h);
        a2.g(o.contains(this.i));
        a2.e(c());
        a2.c(this.g);
        a2.f(!fgt.ELIGIBLE.equals(this.e) ? lrq.b : this.d);
        a2.d(this.j);
        dsx a3 = a2.a();
        if (a3.equals(this.k)) {
            return false;
        }
        this.l = this.k;
        this.k = a3;
        return true;
    }

    public final boolean c() {
        return fgt.ELIGIBLE.equals(this.f);
    }

    public final boolean d(boolean z) {
        if (z != this.p) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setConnected", 122, "NgaStateManager.java")).I("Connected %s -> %s", this.p, z);
        }
        this.p = z;
        this.g = false;
        if (!z) {
            this.j = false;
            this.f = fgt.UNKNOWN;
            this.d = lrq.b;
            this.e = fgt.UNKNOWN;
        }
        return b();
    }
}
