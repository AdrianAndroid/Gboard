package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: deh  reason: default package */
/* loaded from: classes.dex */
public final class deh {
    public final List a;
    private int b = 1;
    private int c;
    private int[] d;
    private final List e;
    private int[] f;

    public deh() {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = Collections.unmodifiableList(arrayList);
    }

    private static void d(int[] iArr, int i, int i2, boolean z) {
        if (i == 0) {
            return;
        }
        int i3 = i2 / i;
        int i4 = i2 % i;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            int i7 = 1;
            if (z) {
                if (i5 < i4) {
                    iArr[i5] = i6 + i7 + i3;
                }
                i7 = 0;
                iArr[i5] = i6 + i7 + i3;
            } else {
                if (i5 >= i - i4) {
                    iArr[i5] = i6 + i7 + i3;
                }
                i7 = 0;
                iArr[i5] = i6 + i7 + i3;
            }
        }
    }

    public final void a(boolean z) {
        if (z && this.c != this.b) {
            d(this.f, this.e.size(), this.b - this.c, false);
            this.c = this.b;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f[i2]; i4++) {
                i3 += this.d[i];
                i++;
            }
            View view = (View) this.e.get(i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(i3, -1));
            } else {
                layoutParams.width = i3;
                view.requestLayout();
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        if (i2 <= i3) {
            i3 = 0;
        }
        int i4 = i / i2;
        int i5 = i2 - i3;
        this.b = i5;
        int[] iArr = new int[i5];
        this.d = iArr;
        this.f = new int[i5];
        int i6 = (i - (i3 * i4)) % i4;
        if (i6 != 0) {
            d(iArr, iArr.length, i6, true);
        }
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                iArr2[i7] = iArr2[i7] + i4;
                i7++;
            } else {
                this.e.clear();
                this.c = 0;
                return;
            }
        }
    }

    public final boolean c(View view) {
        if (this.c >= this.b) {
            return false;
        }
        view.forceLayout();
        view.measure(0, 0);
        int max = Math.max(1, view.getMeasuredWidth());
        int i = this.c;
        int i2 = 0;
        while (i < this.b && i2 < max) {
            i2 += this.d[i];
            i++;
        }
        int i3 = this.c;
        if (i3 > 0 && i2 < max) {
            return false;
        }
        this.c = i;
        this.e.add(view);
        this.f[this.e.size() - 1] = i - i3;
        return true;
    }
}
