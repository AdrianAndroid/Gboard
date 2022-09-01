package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;
import com.google.android.inputmethod.latin.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ecx  reason: default package */
/* loaded from: classes.dex */
public final class ecx extends ecu {
    private final View.OnClickListener j;
    private final View.OnClickListener k;

    public ecx(ect ectVar, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        super(ectVar, view);
        this.g = new int[]{R.string.f151900_resource_name_obfuscated_res_0x7f140245, R.string.f151920_resource_name_obfuscated_res_0x7f140247};
        this.h = view.getResources().getDimensionPixelSize(R.dimen.f34120_resource_name_obfuscated_res_0x7f070185);
        this.k = onClickListener;
        this.j = onClickListener2;
    }

    @Override // defpackage.ecu
    protected final void c() {
        super.c();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        if (layoutParams.height != 0) {
            int i = layoutParams.height;
            int i2 = this.h;
            if (i != i2) {
                layoutParams.height = i2;
                this.c.setLayoutParams(layoutParams);
            }
        }
        this.f.setVisibility(8);
        BidiViewPager bidiViewPager = this.e;
        bidiViewPager.k(new edh(dbf.a(bidiViewPager.getContext()), this.g, this.k, this.j));
        this.e.setOnTouchListener(cnn.d);
    }
}
