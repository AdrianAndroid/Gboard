package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* renamed from: ku  reason: default package */
/* loaded from: classes.dex */
public abstract class ku {
    final SparseIntArray a = new SparseIntArray();
    final SparseIntArray b = new SparseIntArray();

    public int a(int i, int i2) {
        int b = b(i);
        if (b != i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int b2 = b(i4);
                i3 += b2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = b2;
                }
            }
            if (b + i3 <= i2) {
                return i3;
            }
        }
        return 0;
    }

    public abstract int b(int i);

    public final int c(int i, int i2) {
        int b = b(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int b2 = b(i5);
            i3 += b2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = b2;
            }
        }
        return i3 + b > i2 ? i4 + 1 : i4;
    }

    public final void d() {
        this.b.clear();
    }

    public final void e() {
        this.a.clear();
    }
}
