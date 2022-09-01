package defpackage;

/* compiled from: PG */
/* renamed from: ito  reason: default package */
/* loaded from: classes.dex */
final class ito implements mka {
    final /* synthetic */ fwg a;
    final /* synthetic */ long b;
    final /* synthetic */ itp c;

    public ito(itp itpVar, fwg fwgVar, long j) {
        this.c = itpVar;
        this.a = fwgVar;
        this.b = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) itp.a.c()).i(th)).k("com/google/android/libraries/inputmethod/trainingcache/consumer/materializermanager/MaterializerIterator$1", "onFailure", 82, "MaterializerIterator.java")).w("Materializer [%s] failed to fetch the next example batch.", this.c.b);
        this.a.a(8, String.format("Failed to fetch next example batch for collection %s with error: %s", this.c.b, th));
        this.c.close();
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        llp llpVar = (llp) obj;
        if (llpVar != null) {
            this.c.d.addAll(llpVar);
        }
        jls jlsVar = (jls) this.c.d.poll();
        if (jlsVar != null) {
            this.a.b((byte[]) jlsVar.a, (byte[]) jlsVar.b);
            ieh.j().e(iwc.MATERIALIZER_TF_EXAMPLE, this.c.b);
        } else {
            this.a.b(null, null);
        }
        ieh.j().g(iwe.MATERIALIZER_ITERATOR_NEXT, System.currentTimeMillis() - this.b);
    }
}
