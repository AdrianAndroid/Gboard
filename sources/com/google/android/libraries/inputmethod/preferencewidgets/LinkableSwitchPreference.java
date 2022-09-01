package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.preference.SwitchPreference;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinkableSwitchPreference extends SwitchPreference {
    public CharSequence c = "";

    public LinkableSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static AppCompatTextView ag(ais aisVar) {
        View F = aisVar.F(R.id.f67550_resource_name_obfuscated_res_0x7f0b0869);
        if (F instanceof AppCompatTextView) {
            return (AppCompatTextView) F;
        }
        return null;
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        TextView textView = (TextView) aisVar.F(16908304);
        if (textView != null) {
            textView.setMaxLines(Integer.MAX_VALUE);
            jcq.a(textView);
        }
        if (!TextUtils.isEmpty(this.c)) {
            AppCompatTextView ag = ag(aisVar);
            if (ag == null) {
                TextView textView2 = (TextView) aisVar.F(16908304);
                ag = null;
                if (textView2 != null) {
                    ViewParent parent = textView2.getParent();
                    if (parent instanceof ViewGroup) {
                        LayoutInflater.from(aisVar.a.getContext()).inflate(R.layout.f143320_resource_name_obfuscated_res_0x7f0e0454, (ViewGroup) parent);
                        ag = (AppCompatTextView) aisVar.F(R.id.f67550_resource_name_obfuscated_res_0x7f0b0869);
                    }
                }
            }
            if (ag == null) {
                return;
            }
            jcq.a(ag);
            ag.setText(this.c);
            ag.setVisibility(0);
            ag.setEnabled(true);
            return;
        }
        AppCompatTextView ag2 = ag(aisVar);
        if (ag2 == null) {
            return;
        }
        ag2.setVisibility(8);
    }
}
