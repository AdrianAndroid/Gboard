package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ktw  reason: default package */
/* loaded from: classes.dex */
public final class ktw {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public ktw(Context context) {
        boolean f = kws.f(context, R.attr.f11190_resource_name_obfuscated_res_0x7f0403e0, false);
        int g = kxc.g(context, R.attr.f11180_resource_name_obfuscated_res_0x7f0403df, 0);
        int g2 = kxc.g(context, R.attr.f11170_resource_name_obfuscated_res_0x7f0403de, 0);
        int g3 = kxc.g(context, R.attr.f10000_resource_name_obfuscated_res_0x7f040356, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = f;
        this.d = g;
        this.e = g2;
        this.b = g3;
        this.f = f2;
    }

    public final int b(int i, float f) {
        return (!this.a || vo.d(i, 255) != this.b) ? i : a(i, f);
    }

    public final int a(int i, float f) {
        int i2;
        float f2 = this.f;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int h = kxc.h(vo.d(i, 255), this.d, min);
        if (min > 0.0f && (i2 = this.e) != 0) {
            h = vo.c(vo.d(i2, c), h);
        }
        return vo.d(h, alpha);
    }
}
