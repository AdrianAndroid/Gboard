package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: edg  reason: default package */
/* loaded from: classes.dex */
public final class edg extends cum {
    private final ImageView s;
    private final View.OnClickListener u;

    public edg(View view, View.OnClickListener onClickListener) {
        super(view);
        this.s = (ImageView) aad.q(view, R.id.f55110_resource_name_obfuscated_res_0x7f0b01e8);
        this.u = onClickListener;
    }

    @Override // defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        this.s.setOnClickListener(this.u);
        ImageView imageView = this.s;
        ((ecz) obj).c();
        imageView.setImageResource(R.drawable.f49190_resource_name_obfuscated_res_0x7f08029f);
    }

    @Override // defpackage.cum
    public final void G() {
        this.s.setOnClickListener(null);
    }
}
