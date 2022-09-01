package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: dyp  reason: default package */
/* loaded from: classes.dex */
public final class dyp {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager");
    public int b;
    public final hws c = new dyn(this);
    public final hwu d;
    public dye e;
    public iou f;
    public hwv g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public iou l;
    public hwv m;
    public final cir n;
    public final cir o;

    public dyp() {
        dyo dyoVar = new dyo(this);
        this.d = dyoVar;
        cir cirVar = new cir(this, 11);
        this.n = cirVar;
        cir cirVar2 = new cir(this, 10);
        this.o = cirVar2;
        hsx.c().a(ice.HEADER, dyoVar);
        ijl.b().h(cirVar, ior.class, gyc.a);
        ijl.b().h(cirVar2, ioq.class, gyc.a);
    }

    private static void j(iou iouVar) {
        Runnable runnable;
        if (iouVar == null || (runnable = iouVar.e) == null) {
            return;
        }
        runnable.run();
    }

    public final void a(boolean z) {
        if (this.f != null) {
            if (g(z)) {
                b();
                dye dyeVar = this.e;
                if (dyeVar != null) {
                    dyeVar.c();
                }
            }
            e();
        }
    }

    public final void b() {
        if (!this.k) {
            return;
        }
        this.k = false;
        j(this.f);
    }

    public final void c(iou iouVar) {
        Runnable runnable = iouVar.c;
        Runnable runnable2 = iouVar.d;
        if (!this.j) {
            if (runnable != null) {
                runnable.run();
            }
            this.k = false;
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        this.k = true;
        if (runnable2 == null) {
            return;
        }
        runnable2.run();
    }

    public final void d() {
        iou iouVar = this.f;
        if (iouVar != null) {
            if (iouVar.h) {
                this.l = iouVar;
                this.m = this.g;
            }
            a(false);
        }
    }

    public final void e() {
        this.f = null;
        this.g = null;
        this.h = false;
    }

    public final void f() {
        this.l = null;
        this.m = null;
    }

    public final boolean g(boolean z) {
        if (this.e == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager", "doHideProactiveSuggestions", 461, "ProactiveSuggestionsHolderManager.java")).t("trying to hide proactive suggestions in a keyboard which doesn't have a view key_pos_proactive_suggestions or no keyboard view has been attached.");
            return false;
        }
        hww c = hsx.c();
        if (c != null) {
            return c.e(ice.HEADER, this.b, false, z);
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager", "doHideProactiveSuggestions", 469, "ProactiveSuggestionsHolderManager.java")).t("trying to show proactive suggestions when keyboardViewController is null");
        return false;
    }

    public final boolean h(iou iouVar, hwv hwvVar) {
        iou iouVar2;
        dye dyeVar;
        iou iouVar3;
        if (this.e == null) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager", "maybeDisplaySuggestions", 234, "ProactiveSuggestionsHolderManager.java")).t("The proactive suggestions holder view should not be null here.");
            return false;
        }
        hsk b = hsx.b();
        if (b != null) {
            b.at(hfd.d(new iay(-10127, null, ice.HEADER)));
        }
        if (!this.h && (iouVar3 = this.f) != null && iouVar3.a.ordinal() < iouVar.a.ordinal()) {
            return false;
        }
        boolean z = this.k;
        if (iouVar != this.f || this.g != hwvVar || ((dyeVar = this.e) != null && !((View) dyeVar).isShown())) {
            if (z && (iouVar2 = this.f) != iouVar) {
                j(iouVar2);
            }
            if (i(iouVar, hwvVar)) {
                this.f = iouVar;
                this.g = hwvVar;
                this.h = false;
                return true;
            }
        }
        return false;
    }

    public final boolean i(iou iouVar, hwv hwvVar) {
        dye dyeVar = this.e;
        if (dyeVar == null || dyeVar.b(iouVar) <= 0) {
            return false;
        }
        if (hsx.c().i(ice.HEADER, this.b, false, hwvVar, true)) {
            iot iotVar = iouVar.a;
            c(iouVar);
            return true;
        }
        dye dyeVar2 = this.e;
        if (dyeVar2 != null) {
            dyeVar2.c();
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager", "showProactiveSuggestions", 378, "ProactiveSuggestionsHolderManager.java")).t("trying to show proactive suggestions via KeyboardViewController failed.");
        return false;
    }
}
