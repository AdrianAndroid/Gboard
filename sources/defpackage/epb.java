package defpackage;

import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.google.android.apps.inputmethod.libs.swissarmyknife.DecoderStateReportActivity;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: epb  reason: default package */
/* loaded from: classes.dex */
public final class epb implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ DecoderStateReportActivity a;

    public epb(DecoderStateReportActivity decoderStateReportActivity) {
        this.a = decoderStateReportActivity;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) this.a.findViewById(R.id.f53670_resource_name_obfuscated_res_0x7f0b0139);
        LinearLayout linearLayout2 = (LinearLayout) this.a.findViewById(R.id.f130390_resource_name_obfuscated_res_0x7f0b21e0);
        int i2 = 0;
        linearLayout.setVisibility(i == R.id.f53660_resource_name_obfuscated_res_0x7f0b0138 ? 0 : 8);
        if (i != R.id.f130380_resource_name_obfuscated_res_0x7f0b21df) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
    }
}
