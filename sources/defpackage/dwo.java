package defpackage;

/* compiled from: PG */
/* renamed from: dwo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dwo implements hlb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dwo(cjt cjtVar, int i) {
        this.b = i;
        this.a = cjtVar;
    }

    public /* synthetic */ dwo(dwq dwqVar, int i) {
        this.b = i;
        this.a = dwqVar;
    }

    @Override // defpackage.hlb
    public final void a(int i) {
        if (this.b == 0) {
            ((dwq) this.a).a();
            return;
        }
        Object obj = this.a;
        ((ltd) ((ltd) cjt.a.c()).k("com/google/android/apps/inputmethod/libs/expression/candidatesupplier/ImageCandidatePopupController", "onIgnoreShowing", 280, "ImageCandidatePopupController.java")).w("Ignored popup: %s", i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "pending interrupted" : "display failed" : "max wait timeout" : "already pending" : "already displaying");
        cjt cjtVar = (cjt) obj;
        cjtVar.c();
        cjtVar.g.e(ciu.IMAGE_CANDIDATE_USAGE, 5);
    }
}
