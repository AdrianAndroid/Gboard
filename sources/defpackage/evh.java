package defpackage;

/* compiled from: PG */
/* renamed from: evh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class evh implements lfr {
    public final /* synthetic */ nfm a;
    private final /* synthetic */ int b;

    public /* synthetic */ evh(nnt nntVar, int i) {
        this.b = i;
        this.a = nntVar;
    }

    public /* synthetic */ evh(nnu nnuVar, int i) {
        this.b = i;
        this.a = nnuVar;
    }

    @Override // defpackage.lfr
    public final void a(Object obj) {
        if (this.b == 0) {
            ((gil) obj).a(this.a);
            return;
        }
        ((gil) obj).a(this.a);
    }
}
