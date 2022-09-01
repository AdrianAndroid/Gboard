package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hrr  reason: default package */
/* loaded from: classes.dex */
public final class hrr implements mka {
    final /* synthetic */ hrv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hrx c;

    public hrr(hrx hrxVar, hrv hrvVar, boolean z) {
        this.c = hrxVar;
        this.a = hrvVar;
        this.b = z;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        hrx hrxVar = this.c;
        if (hrxVar.v == this.a) {
            hrxVar.v = null;
        }
        ((ltd) ((ltd) ((ltd) hrx.a.c()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$8", "onFailure", (char) 3258, "InputMethodEntryManager.java")).t("Failed to reload entry settings after restore");
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        llp llpVar = (llp) obj;
        hrx hrxVar = this.c;
        if (hrxVar.v != this.a) {
            return;
        }
        hqt hqtVar = null;
        hrxVar.v = null;
        if (!hrxVar.n) {
            this.c.X(true);
        }
        if (this.b) {
            llpVar = hrx.D(llpVar);
        }
        hrx hrxVar2 = this.c;
        hrxVar2.K(llpVar);
        hsc a = hrxVar2.k.a();
        if (a != null) {
            hqtVar = hrx.w(llpVar, a.a, a.b);
        }
        if (hqtVar == null) {
            hqtVar = (hqt) llpVar.get(0);
        }
        if (hqtVar.equals(hrxVar2.x())) {
            return;
        }
        hrxVar2.J(hqtVar);
    }
}
