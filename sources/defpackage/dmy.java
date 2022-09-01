package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dmy  reason: default package */
/* loaded from: classes.dex */
public final class dmy extends mo {
    public final ImageView s;
    public final FrameLayout t;
    public final AppCompatTextView u;
    public final ImageView v;

    public dmy(View view) {
        super(view);
        this.s = (ImageView) view.findViewById(R.id.f65480_resource_name_obfuscated_res_0x7f0b076a);
        this.t = (FrameLayout) view.findViewById(R.id.f68340_resource_name_obfuscated_res_0x7f0b08de);
        this.u = (AppCompatTextView) view.findViewById(R.id.f65470_resource_name_obfuscated_res_0x7f0b0769);
        this.v = (ImageView) view.findViewById(R.id.f65490_resource_name_obfuscated_res_0x7f0b076b);
    }

    public final void F(boolean z) {
        this.a.setSelected(z);
    }
}
