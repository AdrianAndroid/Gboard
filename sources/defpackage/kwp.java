package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kwp  reason: default package */
/* loaded from: classes.dex */
public final class kwp extends ik {
    private static final int[][] a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public kwp(Context context, AttributeSet attributeSet) {
        super(kzb.a(context, attributeSet, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b, R.style.f207430_resource_name_obfuscated_res_0x7f150a2f), attributeSet);
        Context context2 = getContext();
        TypedArray a2 = kve.a(context2, attributeSet, kwq.a, R.attr.f16260_resource_name_obfuscated_res_0x7f04064b, R.style.f207430_resource_name_obfuscated_res_0x7f150a2f, new int[0]);
        if (a2.hasValue(0)) {
            ace.c(this, kws.b(context2, a2, 0));
        }
        this.c = a2.getBoolean(1, false);
        a2.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.c || ace.a(this) != null) {
            return;
        }
        this.c = true;
        if (this.b == null) {
            int f = kxc.f(this, R.attr.f9400_resource_name_obfuscated_res_0x7f040317);
            int f2 = kxc.f(this, R.attr.f9670_resource_name_obfuscated_res_0x7f040334);
            int f3 = kxc.f(this, R.attr.f10000_resource_name_obfuscated_res_0x7f040356);
            int[][] iArr = a;
            int length = iArr.length;
            this.b = new ColorStateList(iArr, new int[]{kxc.h(f3, f, 1.0f), kxc.h(f3, f2, 0.54f), kxc.h(f3, f2, 0.38f), kxc.h(f3, f2, 0.38f)});
        }
        ace.c(this, this.b);
    }
}
