package com.google.android.apps.inputmethod.libs.expression.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FixedHeightNavigationRow extends LinearLayout implements hhk {
    public static final hhl a = hhq.a("auto_hide_expression_nav_footer_text_content", false);
    private static final ice[] b = {ice.BODY};
    private final int c;
    private final ctr d;
    private int e = 0;

    public FixedHeightNavigationRow(Context context) {
        super(context);
        throw new IllegalArgumentException("FixedHeightNavigationRow needs attributes.");
    }

    private final void c() {
        boolean booleanValue = ((Boolean) iho.a.c()).booleanValue();
        SoftKeyView softKeyView = (SoftKeyView) findViewById(R.id.key_pos_back_to_prime);
        int i = 8;
        if (booleanValue == (softKeyView.getVisibility() == 8)) {
            return;
        }
        if (true != booleanValue) {
            i = 0;
        }
        softKeyView.setVisibility(i);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.f54650_resource_name_obfuscated_res_0x7f0b01b8);
        th thVar = new th();
        thVar.d(constraintLayout);
        for (int i2 = 0; i2 < constraintLayout.getChildCount(); i2++) {
            int id = constraintLayout.getChildAt(i2).getId();
            if (id != R.id.key_pos_back_to_prime && id != R.id.key_pos_del) {
                if (booleanValue) {
                    thVar.g(id, 1.0f);
                    thVar.b(id).d.Z = 0;
                } else {
                    thVar.g(id, 0.12f);
                }
            }
        }
        thVar.c(constraintLayout);
    }

    private final void d(ctr ctrVar) {
        ViewGroup.LayoutParams layoutParams;
        if ((getParent() instanceof CoordinatorLayout) && (layoutParams = getLayoutParams()) != null && (layoutParams instanceof tr)) {
            ((tr) layoutParams).b(ctrVar);
        }
    }

    public final void b() {
        this.e = 1;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d((this.e == 0 || ((Boolean) a.c()).booleanValue()) ? this.d : null);
        iho.a.f(this, gyc.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.t(this, 0L);
        d(null);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
    }

    public FixedHeightNavigationRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 1;
        float fraction = context.getResources().getFraction(R.fraction.f51420_resource_name_obfuscated_res_0x7f0a0003, 1, 1);
        ice[] iceVarArr = b;
        hsk b2 = hsx.b();
        this.c = Math.round(fraction * Math.min(dds.c(context, gvv.d(context), false), dds.b(context, iceVarArr, b2 != null ? b2.y() : i)));
        this.d = new ctr(context);
    }
}
