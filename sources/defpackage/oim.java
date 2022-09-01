package defpackage;

/* compiled from: PG */
/* renamed from: oim  reason: default package */
/* loaded from: classes2.dex */
final class oim extends nxo {
    final /* synthetic */ oil a;
    private final nvl b;
    private boolean c = true;
    private boolean d;
    private Object e;
    private final oij f;

    public oim(oil oilVar, oij oijVar, nvl nvlVar, byte[] bArr) {
        this.a = oilVar;
        this.b = nvlVar;
        this.f = oijVar;
    }

    @Override // defpackage.nxo
    public final void j() {
        this.f.b = true;
    }

    @Override // defpackage.nxo
    public final void k() {
        if (!this.c) {
            return;
        }
        Object obj = this.e;
        if (obj == null) {
            this.b.a(nvu.k.f("Half-closed without a request"), new num());
            return;
        }
        Object obj2 = this.a.a;
        oij oijVar = this.f;
        krm krmVar = (krm) obj2;
        switch (krmVar.a) {
            case 0:
                fit fitVar = (fit) obj;
                if (!((duk) krmVar.b).c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    duk.b(oijVar, new chd(fitVar, 5));
                    break;
                }
            case 1:
                fiq fiqVar = (fiq) obj;
                if (!((duk) krmVar.b).c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    duk.b(oijVar, new chd(fiqVar, 7));
                    break;
                }
            case 2:
                fiu fiuVar = (fiu) obj;
                if (!((duk) krmVar.b).c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    duk.b(oijVar, new chd(fiuVar, 6));
                    break;
                }
            case 3:
                fhd fhdVar = (fhd) obj;
                duk dukVar = (duk) krmVar.b;
                if (!dukVar.c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    gyc.b.execute(new bue(dukVar, fhdVar, oijVar, 11));
                    break;
                }
            case 4:
                nez nezVar = (nez) obj;
                gyc.b.execute(new dod((duk) krmVar.b, oijVar, 16));
                break;
            case 5:
                fik fikVar = (fik) obj;
                duk dukVar2 = (duk) krmVar.b;
                if (!dukVar2.c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    dukVar2.g.e(ctd.DICTATION_RANKED_EMOJI_PREDICTION_REQUEST, new Object[0]);
                    gyc.b.execute(new bue(dukVar2, fikVar, oijVar, 12));
                    break;
                }
            case 6:
                fhg fhgVar = (fhg) obj;
                duk dukVar3 = (duk) krmVar.b;
                if (!dukVar3.c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    dukVar3.g.e(ctd.DICTATION_GET_EMOJI_FROM_CONCEPT_REQUEST, new Object[0]);
                    gyc.b.execute(new bue(dukVar3, fhgVar, oijVar, 13));
                    break;
                }
            case 7:
                fhf fhfVar = (fhf) obj;
                duk dukVar4 = (duk) krmVar.b;
                if (!dukVar4.c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    gyc.b.execute(new bue(dukVar4, fhfVar, oijVar, 10));
                    break;
                }
            case 8:
                fio fioVar = (fio) obj;
                duk dukVar5 = (duk) krmVar.b;
                if (!dukVar5.c()) {
                    oijVar.b(nvu.l.f("Not the default keyboard.").g());
                    break;
                } else {
                    dukVar5.g.e(ctd.DICTATION_GET_EMOJI_FROM_QUERY_REQUEST, new Object[0]);
                    gyc.b.execute(new bue(dukVar5, fioVar, oijVar, 14));
                    break;
                }
            default:
                throw new AssertionError();
        }
        this.e = null;
        if (!this.d) {
            return;
        }
        m();
    }

    @Override // defpackage.nxo
    public final void l(Object obj) {
        if (this.e == null) {
            this.e = obj;
            return;
        }
        this.b.a(nvu.k.f("Too many requests"), new num());
        this.c = false;
    }

    @Override // defpackage.nxo
    public final void m() {
        this.d = true;
    }
}
