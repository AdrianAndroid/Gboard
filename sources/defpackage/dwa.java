package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwa  reason: default package */
/* loaded from: classes.dex */
public final class dwa extends dwc {
    final /* synthetic */ hsk a;
    final /* synthetic */ imn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwa(Context context, imn imnVar, hsk hskVar, imn imnVar2) {
        super(context, imnVar);
        this.a = hskVar;
        this.b = imnVar2;
    }

    @Override // defpackage.dwc
    protected final View g() {
        ViewGroup L = this.a.L(ice.HEADER);
        if (L != null) {
            return (L.getChildCount() <= 0 || !(L.getChildAt(0) instanceof SoftKeyboardView)) ? L : L.getChildAt(0);
        }
        ((ltd) ((ltd) dwc.c.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/ui/NgaPopupViewContainer$1", "getAnchorView", 55, "NgaPopupViewContainer.java")).t("keyboardHeader is null");
        return null;
    }

    @Override // defpackage.dwc
    public final void h(View view) {
        View view2 = this.d;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        super.h(view);
    }

    @Override // defpackage.dwc
    protected final void i(View view, View view2) {
        this.b.e(view, view2, 614, 0, 0, null);
        view2.setVisibility(4);
    }
}
