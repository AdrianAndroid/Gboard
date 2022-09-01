package com.google.android.apps.inputmethod.libs.japanese.keyboard.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiLabelPopupView extends ill {
    private static final lug c = hin.a;
    private static final int[] d = {R.id.f67330_resource_name_obfuscated_res_0x7f0b0851, R.id.f67340_resource_name_obfuscated_res_0x7f0b0852, R.id.f67350_resource_name_obfuscated_res_0x7f0b0853, R.id.f67360_resource_name_obfuscated_res_0x7f0b0854, R.id.f67370_resource_name_obfuscated_res_0x7f0b0855};
    private static final lfy e = lfy.c(' ');
    private final AppCompatTextView[] f;
    private iay g;
    private View h;
    private final ilp i;

    public MultiLabelPopupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // defpackage.ill, defpackage.ilv
    public final iay a(float f, float f2, boolean z) {
        return this.g;
    }

    @Override // defpackage.ill, defpackage.ilv
    public final iay b(SoftKeyboardView softKeyboardView, View view, float f, float f2, ial ialVar, int[] iArr, boolean z) {
        c();
        if (ialVar == null || !ialVar.f()) {
            return null;
        }
        int i = 0;
        this.g = ialVar.d[0];
        AppCompatTextView[] appCompatTextViewArr = this.f;
        String e2 = ialVar.e(0);
        int length = appCompatTextViewArr.length;
        String[] strArr = new String[5];
        if (e2 != null) {
            Iterator it = e.i(e2).iterator();
            for (int i2 = 0; i2 < 5 && it.hasNext(); i2++) {
                strArr[i2] = (String) it.next();
            }
            if (it.hasNext()) {
                ((luc) c.a(hip.a).k("com/google/android/apps/inputmethod/libs/japanese/keyboard/widget/MultiLabelPopupView", "splitToStringArray", 150, "MultiLabelPopupView.java")).w("Too many labels are provided: %s", e2);
            }
        }
        int i3 = 0;
        while (true) {
            int length2 = appCompatTextViewArr.length;
            if (i3 >= 5) {
                break;
            }
            AppCompatTextView appCompatTextView = appCompatTextViewArr[i3];
            if (appCompatTextView != null) {
                String str = strArr[i3];
                if (TextUtils.isEmpty(str)) {
                    appCompatTextView.setVisibility(8);
                } else {
                    appCompatTextView.setText(str);
                    appCompatTextView.setVisibility(0);
                }
            }
            i3++;
        }
        iArr[2] = 19;
        iArr[0] = 0;
        View view2 = this.h;
        if (view2 != null) {
            i = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
        }
        iArr[1] = i - this.i.b;
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ill, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = 0;
        while (true) {
            int[] iArr = d;
            int length = iArr.length;
            if (i < 5) {
                this.f[i] = (AppCompatTextView) findViewById(iArr[i]);
                i++;
            } else {
                this.h = findViewById(R.id.f67380_resource_name_obfuscated_res_0x7f0b0856);
                return;
            }
        }
    }

    public MultiLabelPopupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int length = d.length;
        this.f = new AppCompatTextView[5];
        this.i = new ilp(context, attributeSet);
    }
}
