package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* renamed from: duh  reason: default package */
/* loaded from: classes.dex */
public final class duh implements oin {
    public final /* synthetic */ dui a;

    public duh(dui duiVar) {
        this.a = duiVar;
    }

    @Override // defpackage.oin
    public final void a() {
        ((ltd) ((ltd) dui.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardActiveSessionStreamManager$AssistantEventObserver", "onCompleted", 236, "KeyboardActiveSessionStreamManager.java")).t("Assistant event stream completed.");
    }

    @Override // defpackage.oin
    public final void b(Throwable th) {
        ((ltd) ((ltd) ((ltd) dui.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardActiveSessionStreamManager$AssistantEventObserver", "onError", (char) 229, "KeyboardActiveSessionStreamManager.java")).t("Assistant event stream closed with error.");
        duz duzVar = this.a.c;
        Objects.requireNonNull(duzVar);
        kki.j(new dvd(duzVar, 1));
    }

    @Override // defpackage.oin
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        int i;
        fha fhaVar;
        fgz fgzVar = (fgz) obj;
        ltg ltgVar = dui.a;
        int i2 = fgzVar.a;
        switch (i2) {
            case 0:
                i = 7;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0) {
                kki.j(new dod(this, fgzVar, 10));
                return;
            } else if (i3 == 1) {
                kki.j(new dod(this, fgzVar, 11));
                return;
            } else if (i3 == 2) {
                kki.j(new dod(this, fgzVar, 12));
                return;
            } else if (i3 == 3) {
                kki.j(new dod(this, fgzVar, 14));
                return;
            } else if (i3 == 4) {
                kki.j(new dod(this, fgzVar, 13));
                return;
            } else if (i3 != 5) {
                ((ltd) ((ltd) dui.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/KeyboardActiveSessionStreamManager$AssistantEventObserver", "onNext", 224, "KeyboardActiveSessionStreamManager.java")).t("Unknown event");
                return;
            } else {
                dui duiVar = this.a;
                if (i2 == 5) {
                    fhaVar = (fha) fgzVar.b;
                } else {
                    fhaVar = fha.b;
                }
                duiVar.b(fhaVar.a);
                return;
            }
        }
        throw null;
    }
}
