package defpackage;

import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: esl  reason: default package */
/* loaded from: classes.dex */
public final class esl implements eqs {
    private final Resources a;
    private final boolean b;

    public esl(Resources resources, boolean z) {
        this.a = resources;
        this.b = z;
    }

    private final int b(int i) {
        float b = jbt.b(this.a, i, 0.0f);
        if (b <= 0.0f) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, b, this.a.getDisplayMetrics());
    }

    @Override // defpackage.eqs
    public final /* bridge */ /* synthetic */ eqr a(SparseArray sparseArray) {
        int b;
        int b2;
        if (era.i(sparseArray, euu.KEYBOARD_PADDING) != null && !this.b) {
            if (this.a.getConfiguration().orientation == 2) {
                b = b(R.string.f175240_resource_name_obfuscated_res_0x7f140c5a);
                b2 = b(R.string.f175250_resource_name_obfuscated_res_0x7f140c5b);
            } else {
                b = b(R.string.f175270_resource_name_obfuscated_res_0x7f140c5d);
                b2 = b(R.string.f175280_resource_name_obfuscated_res_0x7f140c5e);
            }
            if (b == 0) {
                if (b2 == 0) {
                    return null;
                }
                b = 0;
            }
            return new esm(b, b2);
        }
        return null;
    }
}
