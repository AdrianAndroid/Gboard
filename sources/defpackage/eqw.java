package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: eqw  reason: default package */
/* loaded from: classes.dex */
public final class eqw {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/StyleResolver");
    public static final kp d = new kp(8);
    public final SparseArray b;
    public final llp c;

    public eqw(SparseArray sparseArray) {
        this.b = sparseArray;
        llk e = llp.e();
        for (int i = 0; i < sparseArray.size(); i++) {
            e.h(euu.b(sparseArray.keyAt(i)));
        }
        this.c = e.g();
    }
}
