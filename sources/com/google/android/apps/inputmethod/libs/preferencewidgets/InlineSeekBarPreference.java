package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.inputmethod.latin.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InlineSeekBarPreference extends Preference {
    public static final DecimalFormat a = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
    private final String K;
    private final int L;
    public final int b;
    public final int c;
    public float d;
    public float e;
    private int f;
    private final String g;
    private final String h;
    private final String i;

    public InlineSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = jgd.d(context, attributeSet, null, "seek_bar_min_value", 0);
        this.c = jgd.d(context, attributeSet, null, "seek_bar_max_value", 100);
        String k = jgd.k(context, attributeSet, null, "seek_bar_scale");
        float f = 1.0f;
        this.d = k != null ? Float.parseFloat(k) : 1.0f;
        String k2 = jgd.k(context, attributeSet, null, "seek_bar_display_scale");
        this.e = k2 != null ? Float.parseFloat(k2) : f;
        this.g = jgd.k(context, attributeSet, null, "seek_bar_unit");
        this.h = jgd.k(context, attributeSet, null, "seek_bar_text_left");
        this.i = jgd.k(context, attributeSet, null, "seek_bar_text_center");
        this.K = jgd.k(context, attributeSet, null, "seek_bar_text_right");
        this.L = this.F;
        this.F = R.layout.f144950_resource_name_obfuscated_res_0x7f0e0519;
    }

    private static void af(String str, ais aisVar, int i) {
        TextView textView;
        if (str == null || (textView = (TextView) aisVar.F(i)) == null) {
            return;
        }
        textView.setText(str);
    }

    private static void ag(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            view.setLayoutParams(layoutParams);
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
    }

    @Override // androidx.preference.Preference
    public final void a(ais aisVar) {
        LayoutInflater from = LayoutInflater.from(this.j);
        ViewGroup viewGroup = (ViewGroup) aisVar.F(R.id.f67530_resource_name_obfuscated_res_0x7f0b0867);
        if (viewGroup.getChildCount() == 0) {
            from.inflate(this.L, viewGroup);
        }
        View findViewById = viewGroup.findViewById(16908304);
        if (findViewById != null) {
            ag(findViewById);
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                ag(view);
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    ((View) parent2).setMinimumHeight(0);
                    View findViewById2 = viewGroup.findViewById(16908312);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                }
            }
        }
        TextView textView = (TextView) aisVar.F(R.id.f67460_resource_name_obfuscated_res_0x7f0b0860);
        SeekBar seekBar = (SeekBar) aisVar.F(R.id.f67410_resource_name_obfuscated_res_0x7f0b085b);
        if (seekBar != null) {
            seekBar.setMax(this.c - this.b);
            seekBar.setProgress(this.f - this.b);
            seekBar.setOnSeekBarChangeListener(new dya(this, textView));
        }
        if (textView != null) {
            textView.setText(a.format(this.f * this.e));
        }
        TextView textView2 = (TextView) aisVar.F(R.id.f67450_resource_name_obfuscated_res_0x7f0b085f);
        if (textView2 != null) {
            if (this.g == null) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(this.g);
            }
        }
        af(this.h, aisVar, R.id.f67430_resource_name_obfuscated_res_0x7f0b085d);
        af(this.i, aisVar, R.id.f67420_resource_name_obfuscated_res_0x7f0b085c);
        af(this.K, aisVar, R.id.f67440_resource_name_obfuscated_res_0x7f0b085e);
        super.a(aisVar);
    }

    public final void ae(int i) {
        this.f = i;
        z(j());
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        int i = 0;
        if (obj instanceof String) {
            i = k((String) obj, 0);
        }
        ae(o(i));
    }

    protected int k(String str, int i) {
        return !TextUtils.isEmpty(str) ? Math.round(Float.parseFloat(str) / this.d) : i;
    }

    public void l(int i) {
        String f;
        int round = Math.round(this.d);
        float f2 = this.d;
        if (round == f2) {
            f = Integer.toString(i * ((int) f2));
        } else {
            f = Float.toString(i * f2);
        }
        ab(f);
    }

    public int o(int i) {
        return k(u(null), i);
    }
}
