package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: kvp  reason: default package */
/* loaded from: classes.dex */
public abstract class kvp {
    public final int a;
    public final int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: Access modifiers changed from: protected */
    public kvp(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f40690_resource_name_obfuscated_res_0x7f07055a);
        TypedArray a = kve.a(context, attributeSet, kwo.a, i, i2, new int[0]);
        int a2 = kws.a(context, a, 8, dimensionPixelSize);
        this.a = a2;
        this.b = Math.min(kws.a(context, a, 7, 0), a2 / 2);
        this.e = a.getInt(4, 0);
        this.f = a.getInt(1, 0);
        if (!a.hasValue(2)) {
            this.c = new int[]{kxc.g(context, R.attr.f9790_resource_name_obfuscated_res_0x7f040340, -1)};
        } else if (a.peekValue(2).type != 1) {
            this.c = new int[]{a.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(6)) {
            this.d = a.getColor(6, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = kxc.e(this.d, (int) (f * 255.0f));
        }
        a.recycle();
    }

    public abstract void a();

    public final boolean b() {
        return this.f != 0;
    }

    public final boolean c() {
        return this.e != 0;
    }
}
