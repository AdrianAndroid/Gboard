package defpackage;

import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ida  reason: default package */
/* loaded from: classes.dex */
final class ida {
    private static final lfy f = lfy.c(',').h();
    public final char[] a = new char[2];
    public final int b;
    public final int c;
    public final int[] d;
    public final String e;

    private ida(int i, int i2, int[] iArr, String str) {
        this.b = i;
        this.c = i2;
        this.d = iArr;
        this.e = str;
    }

    public static ida a(AttributeSet attributeSet, lfy lfyVar) {
        int h;
        int h2 = jgd.h(attributeSet.getAttributeValue(null, "from"));
        if (h2 > 0 && (h = jgd.h(attributeSet.getAttributeValue(null, "to"))) > 0) {
            String attributeValue = attributeSet.getAttributeValue(null, "param");
            if (TextUtils.isEmpty(attributeValue)) {
                return null;
            }
            String attributeValue2 = attributeSet.getAttributeValue(null, "skip");
            if (lfyVar == null) {
                lfyVar = f;
            }
            int[] q = jgd.q(attributeValue2, lfyVar);
            if (q != null) {
                Arrays.sort(q);
            }
            return new ida(h2, h, q, attributeValue);
        }
        return null;
    }
}
