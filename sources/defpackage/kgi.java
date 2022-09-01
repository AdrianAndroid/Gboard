package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: kgi  reason: default package */
/* loaded from: classes.dex */
public final class kgi implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;
    private final oiy g;
    private final oiy h;
    private final /* synthetic */ int i;

    public kgi(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, int i) {
        this.i = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
        this.f = oiyVar6;
        this.g = oiyVar7;
        this.h = oiyVar8;
    }

    public kgi(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, oiy oiyVar7, oiy oiyVar8, int i, byte[] bArr) {
        this.i = i;
        this.a = oiyVar;
        this.d = oiyVar2;
        this.f = oiyVar3;
        this.h = oiyVar4;
        this.g = oiyVar5;
        this.b = oiyVar6;
        this.c = oiyVar7;
        this.e = oiyVar8;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        if (this.i == 0) {
            kdr a = ((kds) this.a).a();
            ((lba) this.b).b();
            return new kgh(a, (kcl) this.c.a(), (mks) this.d.a(), npd.b(this.e), npd.b(this.f), this.g, (Executor) this.h.a());
        }
        return new kew(((kds) this.a).a(), ((lba) this.d).b(), (Executor) this.f.a(), ((keq) this.h).a(), this.g, npd.b(this.b), this.c, this.e);
    }
}
