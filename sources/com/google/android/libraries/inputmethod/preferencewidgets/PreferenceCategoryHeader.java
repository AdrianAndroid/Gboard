package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategoryHeader extends PreferenceCategory {
    public PreferenceCategoryHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        K(false);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(ais aisVar) {
        View view;
        super.a(aisVar);
        TextView textView = (TextView) aisVar.F(16908310);
        if (textView == null || (view = (View) textView.getParent()) == null) {
            return;
        }
        view.setPadding(0, textView.getPaddingTop(), 0, textView.getPaddingBottom());
    }
}
