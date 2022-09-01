package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hrq  reason: default package */
/* loaded from: classes.dex */
public final class hrq implements mka {
    final /* synthetic */ hqt a;
    final /* synthetic */ mko b;
    final /* synthetic */ hrx c;

    public hrq(hrx hrxVar, hqt hqtVar, mko mkoVar) {
        this.c = hrxVar;
        this.a = hqtVar;
        this.b = mkoVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) hrx.a.c()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$7", "onFailure", 2869, "InputMethodEntryManager.java")).w("Failed to load addition ImeDefs for entry[%s]", this.a);
        synchronized (this.c.y) {
            if (this.c.z.get(this.a) == this.b) {
                this.c.z.remove(this.a);
            }
        }
        if (this.a.equals(this.c.H)) {
            this.c.H = null;
        }
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        llp llpVar = (llp) obj;
        synchronized (this.c.y) {
            if (this.c.z.get(this.a) != this.b) {
                return;
            }
            this.c.z.remove(this.a);
            this.c.y.put(this.a, llpVar);
            if (!this.a.equals(this.c.H)) {
                return;
            }
            this.c.H = null;
            this.c.A = llpVar;
            this.c.O(this.a, true);
        }
    }
}
