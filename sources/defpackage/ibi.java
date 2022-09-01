package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: ibi  reason: default package */
/* loaded from: classes.dex */
public final class ibi {
    public static final lug a = hin.a;
    public final SparseArray b;
    public final SparseArray c;
    public final long d;
    public volatile int e;

    public ibi(SparseArray sparseArray, SparseArray sparseArray2, int i) {
        this.b = sparseArray;
        this.c = sparseArray2;
        this.d = b(sparseArray2) | b(sparseArray);
        this.e = i;
    }

    public static ibd a() {
        return new ibd();
    }

    private static long b(SparseArray sparseArray) {
        int size = sparseArray.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j |= ((icy) sparseArray.valueAt(i)).c;
        }
        return j;
    }
}
