package com.google.android.apps.inputmethod.libs.search.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VariableHeightSoftKeyboardView extends SoftKeyboardView {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/widget/VariableHeightSoftKeyboardView");
    public elo b;
    public Animator c = null;
    private final hhk v = new bvl(this, 16);

    public VariableHeightSoftKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        hhl hhlVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ele.c);
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        kfp kfpVar = new kfp();
        if (i == 0) {
            hhlVar = cvb.c;
        } else if (i == 1) {
            hhlVar = cvb.b;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Tall view strategy [%d] is not valid", Integer.valueOf(i)));
        }
        if (hhlVar != null) {
            kfpVar.e = hhlVar;
            kfpVar.a = i;
            kfpVar.c = (byte) (kfpVar.c | 1);
            this.b = kfpVar.i();
            return;
        }
        throw new NullPointerException("Null enableFlag");
    }

    @Override // com.google.android.libraries.inputmethod.widgets.SoftKeyboardView
    public final int a() {
        int a2 = super.a();
        elo eloVar = this.b;
        if (!eloVar.c) {
            return a2;
        }
        if (a2 <= 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/widget/VariableHeightSoftKeyboardView$TallViewConfig", "calculateHeight", 180, "VariableHeightSoftKeyboardView.java")).t("Tall view should not be enabled with WRAP_CONTENT or MATCH_PARENT height");
        } else {
            a2 += eloVar.d;
            if (eloVar.b == 1) {
                return a2 - eloVar.e;
            }
        }
        return a2;
    }

    public final void b(SoftKeyboardView softKeyboardView) {
        ViewGroup.LayoutParams layoutParams = softKeyboardView.getLayoutParams();
        if (layoutParams == null || layoutParams.height <= 0 || this.f <= 0) {
            return;
        }
        int a2 = a();
        int a3 = super.a() + layoutParams.height;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams2.height = a3;
        if (a2 < a3) {
            setPadding(getPaddingLeft(), a3 - a2, getPaddingRight(), getPaddingBottom());
        }
        setLayoutParams(layoutParams2);
        post(new esy(this, a2, a3, 1));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.widgets.SoftKeyboardView, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (this.b.c) {
            g();
        }
        this.b.a.e(this.v);
    }
}
