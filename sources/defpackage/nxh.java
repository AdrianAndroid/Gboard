package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: nxh  reason: default package */
/* loaded from: classes2.dex */
final class nxh extends nxi {
    public num a;
    public nvu b;
    public num c;

    public nxh(nwn nwnVar, int i, ofg ofgVar) {
        super(nwnVar, i, ofgVar);
    }

    @Override // defpackage.nxi
    protected final int a(Parcel parcel) {
        nxp.L(parcel, this.a);
        return 0;
    }

    @Override // defpackage.nxi
    protected final int b(Parcel parcel) {
        int F = nxp.F(parcel, this.b);
        nxp.L(parcel, this.c);
        this.d.q(this.e);
        return F;
    }
}
