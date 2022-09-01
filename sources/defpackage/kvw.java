package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kvw  reason: default package */
/* loaded from: classes.dex */
public final class kvw extends kvp {
    public final int g;
    public final int h;
    public final int i;

    public kvw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f9040_resource_name_obfuscated_res_0x7f0402ed, R.style.f207400_resource_name_obfuscated_res_0x7f150a29);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f40670_resource_name_obfuscated_res_0x7f070554);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f40660_resource_name_obfuscated_res_0x7f07054f);
        TypedArray a = kve.a(context, attributeSet, kwo.b, R.attr.f9040_resource_name_obfuscated_res_0x7f0402ed, R.style.f207400_resource_name_obfuscated_res_0x7f150a29, new int[0]);
        int a2 = kws.a(context, a, 2, dimensionPixelSize);
        int i = this.a;
        this.g = Math.max(a2, i + i);
        this.h = kws.a(context, a, 1, dimensionPixelSize2);
        this.i = a.getInt(0, 0);
        a.recycle();
    }

    @Override // defpackage.kvp
    public final void a() {
    }
}
