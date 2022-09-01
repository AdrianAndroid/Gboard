package defpackage;

/* compiled from: PG */
/* renamed from: itq  reason: default package */
/* loaded from: classes.dex */
final class itq implements mka {
    final /* synthetic */ fwi a;
    final /* synthetic */ String b;
    final /* synthetic */ itv c;
    final /* synthetic */ long d;
    final /* synthetic */ its e;

    public itq(its itsVar, fwi fwiVar, String str, itv itvVar, long j) {
        this.e = itsVar;
        this.a = fwiVar;
        this.b = str;
        this.c = itvVar;
        this.d = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        this.a.a(8, String.format("Failed to start query for collection %s with error: %s", this.b, th));
        ((ltd) ((ltd) ((ltd) its.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerManager$2", "onFailure", 230, "MaterializerManager.java")).w("Failed to start query for materializer %s.", this.c.a);
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        itt ittVar = (itt) obj;
        if (ittVar != null) {
            this.a.b(new itp(this.b, ittVar, this.e.b));
            ieh.j().e(iwc.MATERIALIZER_START, this.b);
            ieh.j().g(iwe.MATERIALIZER_ITERATOR_START, System.currentTimeMillis() - this.d);
        }
    }
}
