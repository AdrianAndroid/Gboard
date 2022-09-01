package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: dyo  reason: default package */
/* loaded from: classes.dex */
final class dyo implements hwu {
    final /* synthetic */ dyp a;

    public dyo(dyp dypVar) {
        this.a = dypVar;
    }

    @Override // defpackage.hwu
    public final void a(ibz ibzVar, ice iceVar, View view) {
        this.a.e = (dye) ((SoftKeyboardView) view).d(R.id.key_pos_proactive_suggestions);
        if (this.a.e != null) {
            if (view.findViewById(R.id.key_pos_proactive_suggestions_strip) != null) {
                dyp dypVar = this.a;
                dypVar.b = R.id.key_pos_proactive_suggestions_strip;
                ((View) dypVar.e).setVisibility(0);
            } else {
                this.a.b = R.id.key_pos_proactive_suggestions;
            }
            hww c = hsx.c();
            ice iceVar2 = ice.HEADER;
            dyp dypVar2 = this.a;
            c.h(ibzVar, iceVar2, dypVar2.b, dypVar2.c);
        }
    }

    @Override // defpackage.hwu
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.hwu
    public final void d(View view) {
        dyp dypVar = this.a;
        dypVar.i = true;
        iou iouVar = dypVar.l;
        hwv hwvVar = dypVar.m;
        if (iouVar == null || hwvVar == null || dypVar.e == null) {
            return;
        }
        lgb lgbVar = iouVar.f;
        if (lgbVar == null || ((Boolean) lgbVar.a()).booleanValue()) {
            if (!this.a.h(iouVar, hwvVar)) {
                return;
            }
            this.a.f();
            return;
        }
        if (this.a.g(false)) {
            this.a.b();
            dye dyeVar = this.a.e;
            if (dyeVar != null) {
                dyeVar.c();
            }
        }
        this.a.f();
    }

    @Override // defpackage.hwu
    public final void e() {
        dyp dypVar;
        iou iouVar;
        dyp dypVar2 = this.a;
        dypVar2.j = true;
        if (dypVar2.k) {
            ((ltd) ((ltd) dyp.a.c()).k("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsHolderManager", "hasSuggestionsPendingShown", 197, "ProactiveSuggestionsHolderManager.java")).t("The suggestions should not be shown before keyboard view is shown.");
        }
        if (dypVar2.h || dypVar2.f == null || (iouVar = (dypVar = this.a).f) == null) {
            return;
        }
        dypVar.c(iouVar);
    }

    @Override // defpackage.hwu
    public final void f(ibz ibzVar) {
        dyp dypVar = this.a;
        dypVar.i = false;
        if (dypVar.e != null) {
            hsx.c().c(ibzVar, ice.HEADER, this.a.b);
            this.a.d();
            this.a.e = null;
        }
    }

    @Override // defpackage.hwu
    public final void c(boolean z) {
        dyp dypVar = this.a;
        dypVar.i = false;
        dypVar.j = false;
        if (dypVar.e == null) {
            return;
        }
        if (!z) {
            dypVar.d();
            return;
        }
        dypVar.l = dypVar.f;
        dypVar.m = dypVar.g;
        dypVar.b();
        dypVar.f = null;
    }
}
