package com.google.android.apps.inputmethod.libs.preferencewidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class SeekBarDialogPreference extends DialogPreferenceCompat {
    private final String K;
    private final String M;
    public final int g;
    public final gqa h;
    protected SeekBar i;

    public SeekBarDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = gqa.a(context);
        ((DialogPreference) this).f = R.layout.f144880_resource_name_obfuscated_res_0x7f0e0512;
        ((DialogPreference) this).d = this.j.getString(17039370);
        ((DialogPreference) this).e = this.j.getString(17039360);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843062});
        this.g = obtainStyledAttributes.getInt(0, 100);
        obtainStyledAttributes.recycle();
        this.K = jgd.k(context, attributeSet, null, "seek_bar_text_left");
        this.M = jgd.k(context, attributeSet, null, "seek_bar_text_right");
    }

    protected abstract Object af(int i);

    public String ag(int i) {
        return String.valueOf(af(i));
    }

    public final int ai() {
        SeekBar seekBar = this.i;
        if (seekBar != null) {
            return seekBar.getProgress();
        }
        return 0;
    }

    public void aj(int i) {
    }

    public final void ak(int i) {
        SeekBar seekBar = this.i;
        if (seekBar != null) {
            seekBar.setProgress(i);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferencewidgets.DialogPreferenceCompat
    public void k(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.f68240_resource_name_obfuscated_res_0x7f0b08d3);
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.f68210_resource_name_obfuscated_res_0x7f0b08d0);
        this.i = seekBar;
        seekBar.setMax(this.g);
        this.i.setOnSeekBarChangeListener(new dyb(this, textView3));
        if (TextUtils.isEmpty(m())) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(m());
        }
        if (this.K != null && (textView2 = (TextView) view.findViewById(R.id.f68220_resource_name_obfuscated_res_0x7f0b08d1)) != null) {
            textView2.setText(this.K);
            textView2.setVisibility(0);
        }
        if (this.M == null || (textView = (TextView) view.findViewById(R.id.f68230_resource_name_obfuscated_res_0x7f0b08d2)) == null) {
            return;
        }
        textView.setText(this.M);
        textView.setVisibility(0);
    }
}
