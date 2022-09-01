package j$.time.chrono;

import j$.time.q;
import j$.time.temporal.n;
import j$.time.temporal.r;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static int a(f fVar, n nVar) {
        if (nVar instanceof j$.time.temporal.a) {
            int i = e.a[((j$.time.temporal.a) nVar).ordinal()];
            if (i == 1) {
                throw new r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            q qVar = (q) fVar;
            return i != 2 ? qVar.s().b(nVar) : qVar.k().k();
        }
        return j$.desugar.sun.nio.fs.a.a(fVar, nVar);
    }
}
