package com.google.android.apps.inputmethod.libs.expression.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ResizeSiblingViewsOfFooterBehavior extends tp {
    public ResizeSiblingViewsOfFooterBehavior(Context context, AttributeSet attributeSet) {
    }

    private static final void t(CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, View view) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof tr)) {
            return;
        }
        tr trVar = (tr) layoutParams;
        trVar.height = (int) ((coordinatorLayout.getMeasuredHeight() - (view.getMeasuredHeight() + trVar.bottomMargin)) + view.getTranslationY());
        viewGroup.setLayoutParams(trVar);
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        t(coordinatorLayout, (ViewGroup) view, view2);
        return true;
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view;
        t(coordinatorLayout, viewGroup, coordinatorLayout.findViewById(R.id.f54670_resource_name_obfuscated_res_0x7f0b01ba));
        coordinatorLayout.l(viewGroup, i);
        return true;
    }

    @Override // defpackage.tp
    public final /* synthetic */ boolean k(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view;
        return view2 instanceof FixedHeightNavigationRow;
    }
}
