package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: ixf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ixf implements lgb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ixf(Context context, blc blcVar, ble bleVar, int i) {
        this.d = i;
        this.a = context;
        this.c = blcVar;
        this.b = bleVar;
    }

    public /* synthetic */ ixf(ngz ngzVar, byte[] bArr, Class cls, int i) {
        this.d = i;
        this.a = ngzVar;
        this.b = bArr;
        this.c = cls;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ngz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [blc, java.lang.Object] */
    @Override // defpackage.lgb
    public final Object a() {
        if (this.d == 0) {
            ?? r1 = this.a;
            Object obj = this.b;
            Object obj2 = this.c;
            int i = ixg.e;
            try {
                ngz cz = r1.fk().cr((byte[]) obj, nfb.b()).cz();
                return ((Class) obj2).isInstance(cz) ? (ngz) ((Class) obj2).cast(cz) : r1;
            } catch (ngd unused) {
                return r1;
            }
        }
        Object obj3 = this.a;
        ?? r4 = this.c;
        Object obj4 = this.b;
        gnt gntVar = new gnt(pm.class, new Handler(Looper.getMainLooper()));
        gns gnsVar = new gns(gnu.class, gom.a, gom.b);
        gns gnsVar2 = new gns(gnv.class, gom.a, gom.b);
        nxp.V(obj3);
        nxp.U(obj3, Context.class);
        nxp.U(r4, blc.class);
        nxp.U(obj4, ble.class);
        nxp.U(false, Boolean.class);
        nxp.U(gntVar, gnn.class);
        nxp.U(gnsVar, gnn.class);
        nxp.U(gnsVar2, gnn.class);
        gnc gncVar = new gnc((Context) obj3, r4, false, gntVar, gnsVar, gnsVar2);
        ldu lduVar = ldu.a;
        nxp.U(gncVar, gnd.class);
        nxp.U(lduVar, lfb.class);
        gmw gmwVar = new gmw(gncVar);
        oiy c = npd.c(new csm(npf.a, 8));
        npe b = npf.b(lduVar);
        oiy c2 = npd.c(new csm(npf.a, 5));
        oiy c3 = npd.c(new csm(npf.a, 6));
        gmx gmxVar = new gmx(gncVar);
        gna gnaVar = new gna(gncVar);
        gnb gnbVar = new gnb(gncVar);
        gmu gmuVar = new gmu(gncVar);
        gmy gmyVar = new gmy(gncVar, 0);
        return (bmc) npd.c(new glw(gmwVar, c, b, c2, c3, gmxVar, new glp(gnaVar, gnbVar, gmuVar, gmwVar, gmyVar, new gmt(gncVar), gmxVar, new gmv(gncVar)), gnaVar, gnbVar, npd.c(new csm(npf.a, 7)), gmyVar, gmuVar, new gmz(gncVar))).a();
    }
}
