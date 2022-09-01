package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bve  reason: default package */
/* loaded from: classes.dex */
final class bve extends mo {
    final AppCompatTextView s;
    final nk t;

    public bve(View view) {
        super(view);
        this.s = (AppCompatTextView) view.findViewById(R.id.f53160_resource_name_obfuscated_res_0x7f0b0101);
        nk nkVar = (nk) this.a.getLayoutParams();
        this.t = nkVar;
        nkVar.b = true;
    }

    public final void F(int i) {
        this.a.setVisibility(i);
        if (i == 8) {
            this.a.setLayoutParams(new nk(0, 0));
        } else if (i != 0) {
        } else {
            this.a.setLayoutParams(this.t);
        }
    }
}
