package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.inputmethod.libs.preferencewidgets.InlineSeekBarPreference;
import java.text.DecimalFormat;

/* compiled from: PG */
/* renamed from: dya  reason: default package */
/* loaded from: classes.dex */
public final class dya implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ InlineSeekBarPreference a;
    private final TextView b;

    public dya(InlineSeekBarPreference inlineSeekBarPreference, TextView textView) {
        this.a = inlineSeekBarPreference;
        this.b = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        TextView textView = this.b;
        if (textView != null) {
            DecimalFormat decimalFormat = InlineSeekBarPreference.a;
            InlineSeekBarPreference inlineSeekBarPreference = this.a;
            textView.setText(decimalFormat.format((i + inlineSeekBarPreference.b) * inlineSeekBarPreference.e));
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        InlineSeekBarPreference inlineSeekBarPreference = this.a;
        int i = progress + inlineSeekBarPreference.b;
        inlineSeekBarPreference.l(i);
        this.a.ae(i);
    }
}
