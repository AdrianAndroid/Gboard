package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: crg  reason: default package */
/* loaded from: classes.dex */
public final class crg implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;

    public crg(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4) {
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
    }

    public static crg c(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4) {
        return new crg(oiyVar, oiyVar2, oiyVar3, oiyVar4);
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final crf a() {
        return new crf((Context) this.a.a(), ciz.h(), ((cql) this.b).a(), ((crm) this.c).a(), ((cqr) this.d).a(), ciz.i());
    }
}
