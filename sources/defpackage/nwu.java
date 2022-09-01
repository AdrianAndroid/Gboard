package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* renamed from: nwu  reason: default package */
/* loaded from: classes2.dex */
final class nwu extends nwy {
    public final boolean a;
    private nvu h;
    private num i;

    public nwu(nwn nwnVar, nry nryVar, int i, boolean z) {
        super(nwnVar, nryVar, i);
        this.a = z;
    }

    @Override // defpackage.nwy
    protected final void a(nvu nvuVar) {
        ((nyw) this.g).a(nvuVar, nyv.PROCESSED, new num());
    }

    @Override // defpackage.nwy
    protected final void b() {
        this.f.f();
        this.f.e(this.h);
        m(nww.CLOSED);
        ((nyw) this.g).a(this.h, nyv.PROCESSED, this.i);
        o();
    }

    @Override // defpackage.nwy
    public final void c(int i, Parcel parcel) {
        num K = nxp.K(parcel, this.c);
        this.f.a();
        ((nyw) this.g).c(K);
    }

    @Override // defpackage.nwy
    public final void d(int i, Parcel parcel) {
        this.h = nxp.G(i, parcel);
        this.i = nxp.K(parcel, this.c);
    }

    @Override // defpackage.nwy
    public final boolean e() {
        return this.a;
    }
}
