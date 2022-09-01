package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;

/* compiled from: PG */
/* renamed from: ddk  reason: default package */
/* loaded from: classes.dex */
public class ddk extends LinearLayout {
    public ddk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.f55420_resource_name_obfuscated_res_0x7f0b0207);
        if (findViewById != null) {
            findViewById.setOnClickListener(new cjr(this, 11));
        }
        LinkableTextView linkableTextView = (LinkableTextView) findViewById(R.id.f55430_resource_name_obfuscated_res_0x7f0b0208);
        if (linkableTextView != null) {
            linkableTextView.a = new bwd(this, 2);
        }
    }
}
