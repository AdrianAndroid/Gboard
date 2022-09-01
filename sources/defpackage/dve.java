package defpackage;

/* compiled from: PG */
/* renamed from: dve  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dve implements duo {
    public final /* synthetic */ oin a;
    private final /* synthetic */ int b;

    public /* synthetic */ dve(dvf dvfVar, int i) {
        this.b = i;
        this.a = dvfVar;
    }

    public /* synthetic */ dve(oin oinVar, int i) {
        this.b = i;
        this.a = oinVar;
    }

    @Override // defpackage.duo
    public final void a(Object obj) {
        if (this.b == 0) {
            ((dvf) this.a).f(fhz.KEYBOARD_ACTION, ((Boolean) obj).booleanValue() ? nvu.b : nvu.k.f("keyboard action failed"));
            return;
        }
        oin oinVar = this.a;
        nfh t = fhe.b.t();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ((fhe) t.b).a = booleanValue;
        oinVar.c((fhe) t.cz());
        oinVar.a();
    }
}
