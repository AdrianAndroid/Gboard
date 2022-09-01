package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iks  reason: default package */
/* loaded from: classes.dex */
public final class iks extends mo {
    private final AppCompatTextView s;
    private final AppCompatTextView t;

    public iks(View view) {
        super(view);
        this.s = (AppCompatTextView) view.findViewById(R.id.f129560_resource_name_obfuscated_res_0x7f0b2175);
        this.t = (AppCompatTextView) view.findViewById(R.id.f129550_resource_name_obfuscated_res_0x7f0b2174);
    }

    public final void F(String str) {
        this.t.setText(str);
        this.t.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
    }

    public final void G(String str) {
        this.s.setText(str);
        this.s.setVisibility(0);
    }
}
