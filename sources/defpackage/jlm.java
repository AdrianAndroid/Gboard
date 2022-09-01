package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jlm  reason: default package */
/* loaded from: classes.dex */
public final class jlm implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;

    public jlm(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5) {
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
    }

    @Override // defpackage.oiy
    /* renamed from: b */
    public final jll a() {
        jlu jluVar = (jlu) this.c.a();
        return new jll(((lba) this.a).b(), (jjd) this.b.a(), (lfb) this.d.a(), (Executor) this.e.a());
    }
}
