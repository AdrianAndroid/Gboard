package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: nvd  reason: default package */
/* loaded from: classes2.dex */
public final class nvd extends nxp {
    private final ihw a;
    private final long b;
    private final nxp c;

    public nvd() {
    }

    public nvd(nxp nxpVar, ihw ihwVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = nxpVar;
        this.a = ihwVar;
        this.b = j;
    }

    @Override // defpackage.nxp
    public final void e(num numVar) {
        this.c.e(numVar);
    }

    @Override // defpackage.nxp
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.nxp
    public final void g(Object obj) {
        this.c.g(obj);
    }

    @Override // defpackage.nxp
    public final void h(nvu nvuVar, num numVar) {
        this.c.h(nvuVar, numVar);
        this.a.e(SystemClock.elapsedRealtime() - this.b);
        this.a.c(nvuVar);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("delegate", this.c);
        return S.toString();
    }
}
