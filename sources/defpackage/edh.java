package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* renamed from: edh  reason: default package */
/* loaded from: classes.dex */
public final class edh extends ddz {
    private final int[] a;
    private final LayoutInflater c;
    private final View.OnClickListener d;
    private final View.OnClickListener e;

    public edh(LayoutInflater layoutInflater, int[] iArr, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.c = layoutInflater;
        this.a = iArr;
        this.e = onClickListener;
        this.d = onClickListener2;
    }

    @Override // defpackage.ald
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ald
    public final Object b(ViewGroup viewGroup, int i) {
        int l = l(i);
        ViewGroup viewGroup2 = (ViewGroup) this.c.inflate(R.layout.f134530_resource_name_obfuscated_res_0x7f0e00a6, viewGroup, false);
        AppCompatTextView appCompatTextView = (AppCompatTextView) aad.q(viewGroup2, R.id.f56720_resource_name_obfuscated_res_0x7f0b02a2);
        appCompatTextView.setBreakStrategy(2);
        appCompatTextView.setText(this.a[l]);
        ImageView imageView = (ImageView) aad.q(viewGroup2, R.id.f56690_resource_name_obfuscated_res_0x7f0b029f);
        imageView.setVisibility(l == 0 ? 4 : 0);
        if (l == a() - 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginEnd(imageView.getResources().getDimensionPixelSize(R.dimen.f34000_resource_name_obfuscated_res_0x7f070179));
            imageView.setLayoutParams(marginLayoutParams);
        }
        if (this.e != null || this.d != null) {
            View q = aad.q(viewGroup2, R.id.f55190_resource_name_obfuscated_res_0x7f0b01f0);
            int i2 = l == 0 ? 0 : 8;
            q.setVisibility(i2);
            if (this.e != null) {
                View q2 = aad.q(viewGroup2, R.id.f55180_resource_name_obfuscated_res_0x7f0b01ef);
                q2.setVisibility(i2);
                q2.setOnClickListener(new dbg(this.e, 0));
            }
            if (this.d != null) {
                MaterialButton materialButton = (MaterialButton) aad.q(viewGroup2, R.id.f55200_resource_name_obfuscated_res_0x7f0b01f1);
                materialButton.setVisibility(i2);
                materialButton.setOnClickListener(new dbg(this.d, 0));
            }
        }
        viewGroup.addView(viewGroup2);
        return viewGroup2;
    }

    @Override // defpackage.ald
    public final void c(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // defpackage.ald
    public final boolean h(View view, Object obj) {
        return view == obj;
    }
}
