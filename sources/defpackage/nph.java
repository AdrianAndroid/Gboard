package defpackage;

/* compiled from: PG */
/* renamed from: nph  reason: default package */
/* loaded from: classes2.dex */
public final class nph implements oiy {
    private static final Object a = new Object();
    private volatile oiy b;
    private volatile Object c = a;

    private nph(oiy oiyVar) {
        this.b = oiyVar;
    }

    public static oiy b(oiy oiyVar) {
        if ((oiyVar instanceof nph) || (oiyVar instanceof npd)) {
            return oiyVar;
        }
        nxp.V(oiyVar);
        return new nph(oiyVar);
    }

    @Override // defpackage.oiy
    public final Object a() {
        Object obj = this.c;
        if (obj == a) {
            oiy oiyVar = this.b;
            if (oiyVar == null) {
                return this.c;
            }
            Object a2 = oiyVar.a();
            this.c = a2;
            this.b = null;
            return a2;
        }
        return obj;
    }
}
