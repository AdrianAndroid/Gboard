package defpackage;

/* compiled from: PG */
/* renamed from: igj  reason: default package */
/* loaded from: classes.dex */
public final class igj implements mka {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public igj(cdv cdvVar, boolean z, int i) {
        this.c = i;
        this.b = cdvVar;
        this.a = z;
    }

    public igj(igk igkVar, boolean z, int i) {
        this.c = i;
        this.b = igkVar;
        this.a = z;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (this.c != 0) {
            ((ltd) ((ltd) ((ltd) cdv.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/delight5/langid/LanguageIdentifierWrapper$2", "onFailure", (char) 212, "LanguageIdentifierWrapper.java")).t("asyncStoreLanguageIdentifierState(): Error saving langid state.");
            ((cdv) this.b).b(this.a);
        }
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        if (this.c == 0) {
            ifw ifwVar = (ifw) obj;
            if (ifwVar == null) {
                return;
            }
            ifwVar.gn();
            igg iggVar = ((igk) this.b).a;
            ijl.b().g(new igi(iggVar.a, iggVar.b, this.a));
        } else if (((Boolean) obj).booleanValue()) {
        } else {
            ((cdv) this.b).b(this.a);
        }
    }
}
