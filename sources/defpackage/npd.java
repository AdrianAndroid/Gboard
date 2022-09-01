package defpackage;

/* compiled from: PG */
/* renamed from: npd  reason: default package */
/* loaded from: classes2.dex */
public final class npd implements oiy, nox {
    private static final Object a = new Object();
    private volatile oiy b;
    private volatile Object c = a;

    private npd(oiy oiyVar) {
        this.b = oiyVar;
    }

    public static nox b(oiy oiyVar) {
        if (oiyVar instanceof nox) {
            return (nox) oiyVar;
        }
        nxp.V(oiyVar);
        return new npd(oiyVar);
    }

    public static oiy c(oiy oiyVar) {
        nxp.V(oiyVar);
        return oiyVar instanceof npd ? oiyVar : new npd(oiyVar);
    }

    @Override // defpackage.oiy
    public final Object a() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.c;
                if (obj == obj2) {
                    obj = this.b.a();
                    Object obj3 = this.c;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }
}
