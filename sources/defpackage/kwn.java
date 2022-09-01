package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kwn  reason: default package */
/* loaded from: classes.dex */
public final class kwn extends kvp {
    public final int g;
    public final int h;
    public boolean i;

    public kwn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f14020_resource_name_obfuscated_res_0x7f040529, R.style.f207490_resource_name_obfuscated_res_0x7f150a35);
        boolean z = false;
        TypedArray a = kve.a(context, attributeSet, kwo.c, R.attr.f14020_resource_name_obfuscated_res_0x7f040529, R.style.f207490_resource_name_obfuscated_res_0x7f150a35, new int[0]);
        this.g = a.getInt(0, 1);
        int i = a.getInt(1, 0);
        this.h = i;
        a.recycle();
        a();
        this.i = i == 1 ? true : z;
    }

    @Override // defpackage.kvp
    public final void a() {
        if (this.g == 0) {
            if (this.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
