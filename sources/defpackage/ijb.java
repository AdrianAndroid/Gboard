package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijb  reason: default package */
/* loaded from: classes.dex */
public final class ijb extends iiz {
    final /* synthetic */ ijc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijb(ijc ijcVar, Class cls) {
        super(cls);
        this.b = ijcVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        iiy iiyVar = (iiy) ijgVar;
        synchronized (this.b) {
            if (!this.b.a.add(iiyVar.getClass())) {
                String a = a();
                throw new IllegalStateException(a + " component was already ready");
            } else if (this.b.g()) {
                this.b.b();
            }
        }
    }

    @Override // defpackage.iiz, defpackage.ijj
    public final void fe(Class cls) {
        synchronized (this.b) {
            boolean g = this.b.g();
            if (!this.b.a.remove(cls)) {
                String a = a();
                throw new IllegalStateException(a + " component was not ready");
            } else if (g) {
                this.b.c();
            }
        }
    }
}
