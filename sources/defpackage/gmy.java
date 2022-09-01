package defpackage;

/* compiled from: PG */
/* renamed from: gmy  reason: default package */
/* loaded from: classes.dex */
public final class gmy implements oiy {
    private final /* synthetic */ int a;
    private final Object b;

    public gmy(gnd gndVar, int i) {
        this.a = i;
        this.b = gndVar;
    }

    private gmy(oiy oiyVar, int i) {
        this.a = i;
        nxp.V(oiyVar);
        this.b = oiyVar;
    }

    public static oiy c(oiy oiyVar) {
        return new gmy(oiyVar, 1);
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        return this.a != 0 ? b() : b();
    }

    public final lfb b() {
        if (this.a != 0) {
            return lfb.g(this.b);
        }
        lfb lfbVar = (lfb) ((gnc) this.b).e.a();
        nxp.W(lfbVar);
        return lfbVar;
    }
}
