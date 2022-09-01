package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: khh  reason: default package */
/* loaded from: classes.dex */
public final class khh implements npe {
    private final oiy a;
    private final oiy b;
    private final oiy c;
    private final oiy d;
    private final oiy e;
    private final oiy f;
    private final /* synthetic */ int g;

    public khh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, int i) {
        this.g = i;
        this.a = oiyVar;
        this.b = oiyVar2;
        this.c = oiyVar3;
        this.d = oiyVar4;
        this.e = oiyVar5;
        this.f = oiyVar6;
    }

    public khh(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4, oiy oiyVar5, oiy oiyVar6, int i, byte[] bArr) {
        this.g = i;
        this.b = oiyVar;
        this.d = oiyVar2;
        this.c = oiyVar3;
        this.a = oiyVar4;
        this.e = oiyVar5;
        this.f = oiyVar6;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        if (this.g == 0) {
            kdr a = ((kds) this.a).a();
            mks mksVar = (mks) this.b.a();
            npd.b(this.c);
            return new khg(a, mksVar, npd.b(this.d), this.e, ((kho) this.f).a(), null, null);
        }
        ((lba) this.b).b();
        jlu jluVar = (jlu) this.c.a();
        jhy jhyVar = (jhy) this.f.a();
        return new jkw((jjd) this.d.a(), (kqr) this.a.a(), (Executor) this.e.a());
    }
}
