package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* renamed from: ezh  reason: default package */
/* loaded from: classes.dex */
public final class ezh implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ ezi b;

    public ezh(ezi eziVar, int i) {
        this.b = eziVar;
        this.a = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        View view3;
        AppCompatTextView appCompatTextView;
        int i9;
        int i10;
        ezi eziVar = this.b;
        int i11 = this.a;
        SoftKeyView softKeyView = eziVar.o;
        if (softKeyView == null || (view2 = eziVar.h) == null || (view3 = eziVar.f) == null || (appCompatTextView = (AppCompatTextView) softKeyView.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745)) == null) {
            return;
        }
        int e = ((Boolean) iho.a(eziVar.a).c()).booleanValue() ? jbt.e(eziVar.a, R.attr.f7200_resource_name_obfuscated_res_0x7f040206) : 0;
        view2.measure(ViewGroup.getChildMeasureSpec(view3.getWidth(), 0, view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(view3.getHeight(), 0, view2.getLayoutParams().height));
        if (view2.getMeasuredWidth() > view3.getWidth() - e) {
            i10 = (appCompatTextView.getMeasuredWidth() + view3.getWidth()) - view2.getMeasuredWidth();
            i9 = 0;
        } else {
            i9 = e;
            i10 = Integer.MAX_VALUE;
        }
        if (appCompatTextView.getMaxWidth() != i10) {
            appCompatTextView.setMaxWidth(i10);
        }
        if (i11 == 0) {
            if (view3.getPaddingRight() == i9) {
                return;
            }
            view3.setPadding(0, 0, i9, 0);
        } else if (view3.getPaddingLeft() == i9) {
        } else {
            view3.setPadding(i9, 0, 0, 0);
        }
    }
}
