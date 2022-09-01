package defpackage;

import android.text.TextUtils;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.inputmethod.libs.preferencewidgets.SeekBarDialogPreference;

/* compiled from: PG */
/* renamed from: dyb  reason: default package */
/* loaded from: classes.dex */
public final class dyb implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ SeekBarDialogPreference b;

    public dyb(SeekBarDialogPreference seekBarDialogPreference, TextView textView) {
        this.b = seekBarDialogPreference;
        this.a = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        String ag = this.b.ag(i);
        this.a.setText(ag);
        if (!this.b.h.g || TextUtils.isEmpty(ag)) {
            return;
        }
        this.b.h.m(ag);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.aj(seekBar.getProgress());
    }
}
