package defpackage;

/* compiled from: PG */
/* renamed from: ffp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ffp implements hhk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ffp(ffn ffnVar, int i) {
        this.b = i;
        this.a = ffnVar;
    }

    public /* synthetic */ ffp(ffq ffqVar, int i) {
        this.b = i;
        this.a = ffqVar;
    }

    public /* synthetic */ ffp(hoe hoeVar, int i) {
        this.b = i;
        this.a = hoeVar;
    }

    public ffp(hor horVar, int i) {
        this.b = i;
        this.a = horVar;
    }

    public /* synthetic */ ffp(idz idzVar, int i) {
        this.b = i;
        this.a = idzVar;
    }

    public /* synthetic */ ffp(iqg iqgVar, int i) {
        this.b = i;
        this.a = iqgVar;
    }

    public /* synthetic */ ffp(irr irrVar, int i) {
        this.b = i;
        this.a = irrVar;
    }

    public /* synthetic */ ffp(jft jftVar, int i) {
        this.b = i;
        this.a = jftVar;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        switch (this.b) {
            case 0:
                ((ffq) this.a).c(hhlVar);
                return;
            case 1:
                ((ffn) this.a).d(hhlVar);
                return;
            case 2:
                ((hoe) this.a).f();
                return;
            case 3:
                ((hoe) this.a).e();
                return;
            case 4:
                ((hoe) this.a).g(hhlVar);
                return;
            case 5:
                boolean booleanValue = ((Boolean) hhlVar.c()).booleanValue();
                hor horVar = (hor) this.a;
                if (horVar.e == booleanValue) {
                    return;
                }
                horVar.e = booleanValue;
                if (!horVar.d) {
                    return;
                }
                if (booleanValue) {
                    horVar.b.d(gyc.b);
                    return;
                } else {
                    horVar.b.e();
                    return;
                }
            case 6:
                ((idz) this.a).h();
                return;
            case 7:
                ((iqg) this.a).a.set(null);
                return;
            case 8:
                ((irr) this.a).c(false);
                return;
            default:
                ((jft) this.a).i();
                return;
        }
    }
}
