package defpackage;

import android.util.SparseArray;
import android.util.TypedValue;

/* compiled from: PG */
/* renamed from: iap  reason: default package */
/* loaded from: classes.dex */
public final class iap {
    public static final lug a = hin.a;
    public static final iap b = new iap(null);
    public final SparseArray c;

    public iap(SparseArray sparseArray) {
        this.c = sparseArray;
    }

    public static iao b() {
        return new iao();
    }

    public final TypedValue a(int i) {
        SparseArray sparseArray = this.c;
        if (sparseArray != null) {
            return (TypedValue) sparseArray.get(i);
        }
        return null;
    }

    public final CharSequence c(int i, String str) {
        TypedValue a2 = a(i);
        return a2 != null ? a2.coerceToString() : str;
    }

    public final boolean d(int i, boolean z) {
        TypedValue a2 = a(i);
        if (a2 != null) {
            if (a2.type == 18) {
                return a2.data != 0;
            } else if (a2.type != 3) {
                throw new IllegalArgumentException(String.valueOf(a2.toString()).concat(" not a boolean"));
            } else {
                return a2.string != null && Boolean.parseBoolean(a2.string.toString());
            }
        }
        return z;
    }

    public final String toString() {
        lfa S = jdg.S(this);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (sparseArray == null || i >= sparseArray.size()) {
                break;
            }
            S.b(jbi.h(this.c.keyAt(i)), this.c.valueAt(i));
            i++;
        }
        return S.toString();
    }
}
