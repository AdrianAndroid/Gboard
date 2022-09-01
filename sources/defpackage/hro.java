package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hro  reason: default package */
/* loaded from: classes.dex */
public final class hro implements mka {
    final /* synthetic */ hrv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ hrx c;

    public hro(hrx hrxVar, hrv hrvVar, boolean z) {
        this.c = hrxVar;
        this.a = hrvVar;
        this.b = z;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        if (this.c.v == this.a) {
            ((ltd) ((ltd) hrx.a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$5", "onFailure", 902, "InputMethodEntryManager.java")).w("Fail load entries %s", this.a.b);
            this.c.w = false;
            this.c.v = null;
            if (th instanceof CancellationException) {
                return;
            }
            ((ltd) ((ltd) ((ltd) hrx.a.d()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$5", "onFailure", (char) 909, "InputMethodEntryManager.java")).t("Failed to load input method entry settings");
        }
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        llp llpVar = (llp) obj;
        if (this.c.v != this.a) {
            return;
        }
        ((ltd) ((ltd) hrx.a.b()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$5", "onSuccess", 880, "InputMethodEntryManager.java")).H("Success load entries: %s, resetImplicitlyEnabledEntries=%b", this.a.b, this.c.w);
        hrx hrxVar = this.c;
        boolean z = hrxVar.w;
        hrxVar.w = false;
        hqt hqtVar = null;
        this.c.v = null;
        if (this.b) {
            llpVar = hrx.D(llpVar);
        }
        if (!this.c.n) {
            this.c.X(true);
            hrx hrxVar2 = this.c;
            hrxVar2.K(llpVar);
            hqt x = hrxVar2.t ? hrxVar2.x() : null;
            if (x != null) {
                hqtVar = hrx.w(llpVar, x.i(), x.p());
            }
            if (hqtVar != null) {
                hrxVar2.J(hqtVar);
                return;
            }
            hsc a = hrxVar2.k.a();
            if (a != null) {
                hqtVar = hrx.w(llpVar, a.a, a.b);
            }
            if (hqtVar == null) {
                hqtVar = (hqt) llpVar.get(0);
            }
            hrxVar2.J(hqtVar);
        } else if (!this.c.q || !z) {
            hrx hrxVar3 = this.c;
            lmz lmzVar = this.a.b;
            if (lmzVar.isEmpty()) {
                return;
            }
            llp b = hqr.b();
            llk e = llp.e();
            hqt x2 = hrxVar3.x();
            int size = b.size();
            hqt hqtVar2 = x2;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                hqt hqtVar3 = (hqt) b.get(i);
                hqt w = hrx.w(llpVar, hqtVar3.i(), hqtVar3.p());
                if (w != null) {
                    e.h(w);
                    if (!hqtVar3.equals(w)) {
                        if (hqtVar3.equals(x2)) {
                            hqtVar2 = w;
                        }
                        z2 = true;
                    }
                } else if (lmzVar.contains(hsc.a(hqtVar3))) {
                    if (true == hqtVar3.equals(x2)) {
                        hqtVar2 = null;
                    }
                    hrxVar3.U(hqtVar3);
                    z2 = true;
                } else {
                    e.h(hqtVar3);
                }
            }
            llp g = e.g();
            if (g.isEmpty()) {
                hrxVar3.k.g(llp.q());
                hrxVar3.Y();
                hrxVar3.aa(hrxVar3.B(hrxVar3.E()), true);
            } else if (z2) {
                hrxVar3.Q = new ijk(hrxVar3.Q, g, null);
                if (hqtVar2 == null) {
                    hqtVar2 = (hqt) g.get(0);
                }
                hrxVar3.P(g);
                if (hqtVar2.equals(x2)) {
                    return;
                }
                hrxVar3.N(hqtVar2);
            }
        } else {
            hrx hrxVar4 = this.c;
            hrxVar4.K(llpVar);
            int size2 = llpVar.size();
            for (int i2 = 0; i2 < size2; i2++) {
                iin.p(hrxVar4.i, (hqt) llpVar.get(i2), 1);
            }
            hrxVar4.W((hqt) llpVar.get(0));
        }
    }
}
