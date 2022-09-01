package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: gpd  reason: default package */
/* loaded from: classes.dex */
public class gpd {
    private boolean a;
    public final List b;

    public gpd(gpc... gpcVarArr) {
        this.b = lre.D(gpcVarArr);
    }

    public nks a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gpc gpcVar = (gpc) it.next();
            gpcVar.b();
            nks hK = gpcVar.hK();
            if (hK != null) {
                return hK;
            }
            lyz.a(gpcVar);
            it.remove();
        }
        if (!this.a) {
            b();
            nfj b = bnt.b();
            if (b.c) {
                b.cD();
                b.c = false;
            }
            nks.f((nks) b.b);
            return (nks) b.cz();
        }
        return null;
    }

    public void b() {
        this.a = true;
        for (gpc gpcVar : this.b) {
            lyz.a(gpcVar);
        }
        this.b.clear();
    }
}
