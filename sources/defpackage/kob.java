package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kob  reason: default package */
/* loaded from: classes.dex */
public final class kob extends mo {
    public final ImageView s;
    public final /* synthetic */ koc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kob(koc kocVar, View view) {
        super(view);
        this.t = kocVar;
        int i = view.getContext().getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.f39580_resource_name_obfuscated_res_0x7f070483);
        int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.f39560_resource_name_obfuscated_res_0x7f070481);
        ImageView imageView = (ImageView) view.findViewById(R.id.f129190_resource_name_obfuscated_res_0x7f0b213b);
        this.s = imageView;
        double d = i / (dimensionPixelSize + dimensionPixelSize2);
        Double.isNaN(d);
        double d2 = d - 0.5d;
        double d3 = i;
        Double.isNaN(d3);
        double d4 = dimensionPixelSize2;
        Double.isNaN(d4);
        int i2 = (int) ((d3 / d2) - (d4 * d2));
        imageView.getLayoutParams().height = i2;
        imageView.getLayoutParams().width = i2;
        imageView.requestLayout();
    }
}
