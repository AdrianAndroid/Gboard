package defpackage;

/* compiled from: PG */
/* renamed from: dut  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dut implements duy {
    public final /* synthetic */ nfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ dut(bkj bkjVar, int i) {
        this.b = i;
        this.a = bkjVar;
    }

    public /* synthetic */ dut(bkl bklVar, int i) {
        this.b = i;
        this.a = bklVar;
    }

    @Override // defpackage.duy
    public final void a(dui duiVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                nfm nfmVar = this.a;
                ltg ltgVar = duz.a;
                duiVar.c((bkl) nfmVar);
                return;
            }
            nfm nfmVar2 = this.a;
            ltg ltgVar2 = duz.a;
            duiVar.c((bkl) nfmVar2);
            return;
        }
        nfm nfmVar3 = this.a;
        ltg ltgVar3 = duz.a;
        nfh t = fht.b.t();
        ndy ndyVar = ((bkj) nfmVar3).e;
        if (ndyVar != null) {
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((fht) t.b).a = ndyVar;
        }
        nfh h = ebl.h();
        if (h.c) {
            h.cD();
            h.c = false;
        }
        fhy fhyVar = (fhy) h.b;
        fht fhtVar = (fht) t.cz();
        fhy fhyVar2 = fhy.d;
        fhtVar.getClass();
        fhyVar.b = fhtVar;
        fhyVar.a = 3;
        duiVar.f((fhy) h.cz());
    }
}
