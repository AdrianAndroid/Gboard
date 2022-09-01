package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: gmo  reason: default package */
/* loaded from: classes.dex */
public final class gmo implements bmm {
    public final fxa a;
    public final fxa b;
    private final gms c;
    private final gmg d;
    private final bmf e;
    private final lfb f;
    private final gnn g;
    private bmn h;
    private final gni i;
    private final opu j = new opu(this);

    public gmo(gms gmsVar, gmg gmgVar, bmf bmfVar, fxa fxaVar, fxa fxaVar2, lfb lfbVar, gnn gnnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        gni gniVar = new gni();
        this.i = gniVar;
        new AtomicReference();
        this.c = gmsVar;
        this.d = gmgVar;
        this.e = bmfVar;
        gmsVar.k = gniVar;
        this.a = fxaVar;
        this.b = fxaVar2;
        this.f = lfbVar;
        this.g = gnnVar;
    }

    @Override // defpackage.bmm
    public final void a() {
        gmg gmgVar = this.d;
        gmgVar.b.a(gmgVar.d.a(), new gmr(gmgVar, 1));
    }

    @Override // defpackage.bmm
    public final void b(bmn bmnVar) {
        this.h = bmnVar;
        gll gllVar = (gll) bmnVar;
        kcu.U(gllVar.a(), new fel(gllVar, this.j, 3, null, null, null, null), mjl.a);
    }

    @Override // defpackage.bmm
    public final boolean c() {
        return Build.VERSION.SDK_INT >= 24 && this.c.e.getRestrictBackgroundStatus() == 3;
    }

    @Override // defpackage.bmm
    public final blq d(blu bluVar) {
        lfb lfbVar = this.f;
        bmn bmnVar = this.h;
        if (bmnVar != null) {
            ((gll) bmnVar).e(fxd.i);
            ((gll) this.h).e(fxd.j);
        }
        return new gmk(bluVar, this.e, this.c, lfbVar, this.g);
    }
}
