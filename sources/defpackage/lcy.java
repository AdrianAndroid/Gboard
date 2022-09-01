package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: lcy  reason: default package */
/* loaded from: classes.dex */
public final class lcy implements npe {
    private final oiy a;
    private final oiy b;

    public lcy(oiy oiyVar, oiy oiyVar2) {
        this.a = oiyVar;
        this.b = oiyVar2;
    }

    @Override // defpackage.oiy
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = this.a.a();
        nxp.X(lde.REALTIME);
        jco jcoVar = (jco) a;
        return new jco((Set) ((npf) this.b).b);
    }
}
