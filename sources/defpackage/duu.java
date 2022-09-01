package defpackage;

/* compiled from: PG */
/* renamed from: duu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class duu implements duy {
    private final /* synthetic */ int e;
    public static final /* synthetic */ duu d = new duu(3);
    public static final /* synthetic */ duu c = new duu(2);
    public static final /* synthetic */ duu b = new duu(1);
    public static final /* synthetic */ duu a = new duu(0);

    private /* synthetic */ duu(int i) {
        this.e = i;
    }

    @Override // defpackage.duy
    public final void a(dui duiVar) {
        int i = this.e;
        if (i == 0) {
            ltg ltgVar = duz.a;
            duiVar.d(duiVar.e);
        } else if (i != 1) {
            if (i == 2) {
                duiVar.e();
            } else {
                duiVar.a();
            }
        } else {
            nfh h = ebl.h();
            nez nezVar = nez.a;
            if (h.c) {
                h.cD();
                h.c = false;
            }
            fhy fhyVar = (fhy) h.b;
            fhy fhyVar2 = fhy.d;
            nezVar.getClass();
            fhyVar.b = nezVar;
            fhyVar.a = 5;
            duiVar.f((fhy) h.cz());
        }
    }
}
