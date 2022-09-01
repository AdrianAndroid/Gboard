package com.google.android.libraries.inputmethod.preferencewidgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.SwitchPreference;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ColoredBackgroundSwitchPreference extends SwitchPreference {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/preferencewidgets/ColoredBackgroundSwitchPreference");
    private final boolean d = kts.a();
    private View e;
    private TextView f;

    public ColoredBackgroundSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jgw jgwVar = jgx.a;
    }

    private static Switch ag(ViewGroup viewGroup) {
        Switch ag;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof Switch)) {
                if ((childAt instanceof ViewGroup) && (ag = ag((ViewGroup) childAt)) != null) {
                    return ag;
                }
            } else {
                return (Switch) childAt;
            }
        }
        return null;
    }

    private final void ah(boolean z) {
        int a;
        Context context = this.j;
        if (this.d) {
            this.e.setBackground(new InsetDrawable(context.getDrawable(z ? R.drawable.f46440_resource_name_obfuscated_res_0x7f080151 : R.drawable.f46430_resource_name_obfuscated_res_0x7f080150), context.getResources().getDimensionPixelSize(R.dimen.f42620_resource_name_obfuscated_res_0x7f0706ca)));
            this.f.setTextColor(jbt.k(context.getTheme(), 0, true != z ? R.attr.f18360_resource_name_obfuscated_res_0x7f04075d : R.attr.f18350_resource_name_obfuscated_res_0x7f04075c));
            return;
        }
        View view = this.e;
        if (!z) {
            a = us.a(context, R.color.f21410_resource_name_obfuscated_res_0x7f0600de);
        } else {
            a = itb.c(context, 16843829, -1);
        }
        view.setBackgroundColor(a);
    }

    @Override // androidx.preference.Preference
    public final boolean U(Object obj) {
        ah(((Boolean) obj).booleanValue());
        return super.U(obj);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(ais aisVar) {
        super.a(aisVar);
        Context context = this.j;
        Resources resources = context.getResources();
        this.f = (TextView) aisVar.F(16908310);
        Switch ag = ag((ViewGroup) aisVar.a);
        if (!this.d) {
            try {
                Drawable mutate = ((Drawable.ConstantState) Objects.requireNonNull(ag.getThumbDrawable().getConstantState())).newDrawable().mutate();
                mutate.setTint(us.a(context, R.color.f21420_resource_name_obfuscated_res_0x7f0600df));
                ag.setThumbDrawable(mutate);
                Drawable mutate2 = ((Drawable.ConstantState) Objects.requireNonNull(ag.getTrackDrawable().getConstantState())).newDrawable().mutate();
                mutate2.setTint(us.a(context, R.color.f21430_resource_name_obfuscated_res_0x7f0600e0));
                ag.setTrackDrawable(mutate2);
            } catch (RuntimeException e) {
                ((ltd) ((ltd) ((ltd) c.c()).i(e)).k("com/google/android/libraries/inputmethod/preferencewidgets/ColoredBackgroundSwitchPreference", "onBindViewHolder", '9', "ColoredBackgroundSwitchPreference.java")).t("Failed to update colored switch style.");
            }
        }
        View view = aisVar.a;
        this.e = view;
        view.setMinimumHeight(resources.getDimensionPixelSize(true != this.d ? R.dimen.f32970_resource_name_obfuscated_res_0x7f0700f7 : R.dimen.f39690_resource_name_obfuscated_res_0x7f070491));
        ah(ag.isChecked());
    }
}
