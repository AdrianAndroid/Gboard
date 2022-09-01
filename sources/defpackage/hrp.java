package defpackage;

/* compiled from: PG */
/* renamed from: hrp  reason: default package */
/* loaded from: classes.dex */
final class hrp implements mka {
    final /* synthetic */ mko a;
    final /* synthetic */ jav b;
    final /* synthetic */ hrx c;

    public hrp(hrx hrxVar, mko mkoVar, jav javVar) {
        this.c = hrxVar;
        this.a = mkoVar;
        this.b = javVar;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        hrx hrxVar = this.c;
        if (hrxVar.K != this.a) {
            return;
        }
        hrxVar.K = null;
    }

    @Override // defpackage.mka
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        hqt hqtVar = (hqt) obj;
        hrx hrxVar = this.c;
        if (hrxVar.K != this.a) {
            return;
        }
        hrxVar.K = null;
        if (hqtVar == null) {
            ((ltd) ((ltd) hrx.a.d()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$6", "onSuccess", 1833, "InputMethodEntryManager.java")).w("Failed to get the entry of %s", this.b);
            return;
        }
        hrx hrxVar2 = this.c;
        llp b = hqr.b();
        if (!b.contains(hqtVar)) {
            llk e = llp.e();
            hsc hscVar = hrxVar2.J;
            if (hscVar == null) {
                e.j(b);
            } else {
                e.j(lre.Z(b, new ein(hscVar, 12)));
            }
            e.h(hqtVar);
            hrxVar2.J = hsc.a(hqtVar);
            llp g = e.g();
            hrxVar2.Q = new ijk(hrxVar2.Q, g, null);
            hrxVar2.P(g);
        }
        this.c.ab(hqtVar);
    }
}
