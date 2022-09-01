package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ctp  reason: default package */
/* loaded from: classes.dex */
public final class ctp {
    private static final hhl a = hhq.a("enable_nav_redesign_tablet", true);

    public static void a(View view, int i) {
        if (((Boolean) a.c()).booleanValue()) {
            View findViewById = view.findViewById(R.id.f66130_resource_name_obfuscated_res_0x7f0b07c3);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                findViewById.setOnClickListener(bwk.d);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.f66140_resource_name_obfuscated_res_0x7f0b07c4);
            if (appCompatTextView == null) {
                return;
            }
            appCompatTextView.setText(appCompatTextView.getContext().getString(i));
        }
    }
}
