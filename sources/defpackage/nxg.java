package defpackage;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: nxg  reason: default package */
/* loaded from: classes2.dex */
final class nxg extends nxi {
    private final nuq a;
    private final num b;
    private final ofg c;

    public nxg(nwn nwnVar, int i, nuq nuqVar, num numVar, ofg ofgVar) {
        super(nwnVar, i, ofgVar);
        this.a = nuqVar;
        this.b = numVar;
        this.c = ofgVar;
    }

    @Override // defpackage.nxi
    protected final int a(Parcel parcel) {
        parcel.writeString(this.a.b);
        nxp.L(parcel, this.b);
        this.c.b();
        return this.a.a.b() ? 16 : 0;
    }

    @Override // defpackage.nxi
    protected final int b(Parcel parcel) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(nsv nsvVar) {
        this.b.d(oao.b);
        this.b.f(oao.b, Long.valueOf(Math.max(0L, nsvVar.b(TimeUnit.NANOSECONDS))));
    }
}
