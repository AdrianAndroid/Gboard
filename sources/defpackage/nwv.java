package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: nwv  reason: default package */
/* loaded from: classes2.dex */
final class nwv extends nwy {
    private final nwm a;

    public nwv(nwm nwmVar, nry nryVar, int i) {
        super(nwmVar, nryVar, i);
        this.a = nwmVar;
    }

    @Override // defpackage.nwy
    protected final void a(nvu nvuVar) {
        ((oex) this.g).a(nvuVar);
    }

    @Override // defpackage.nwy
    protected final void b() {
        ((oex) this.g).b();
    }

    @Override // defpackage.nwy
    public final void c(int i, Parcel parcel) {
        oew nxcVar;
        String readString = parcel.readString();
        num K = nxp.K(parcel, this.c);
        nxh nxhVar = new nxh(this.a, this.d, ofg.m(this.a.a));
        if ((i & 16) != 0) {
            nxcVar = new nxn(this, nxhVar, this.c);
        } else {
            nxcVar = new nxc(this, nxhVar, this.c);
        }
        nvu a = this.a.a(nxcVar, readString, K);
        if (a.k()) {
            jdg.u((oex) this.g);
            if (!this.b.r()) {
                return;
            }
            ((oex) this.g).e();
            return;
        }
        h(a);
    }

    @Override // defpackage.nwy
    public final void d(int i, Parcel parcel) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(nvu nvuVar) {
        if (!p()) {
            m(nww.CLOSED);
            this.f.e(nvuVar);
            ((oex) this.g).a(nvu.b);
        }
    }
}
