package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: dkx  reason: default package */
/* loaded from: classes.dex */
public final class dkx implements Iterator {
    private final deh a;
    private final deb b;
    private final llp c;
    private final int d;
    private final int e;
    private int f = 0;

    public dkx(deb debVar, llp llpVar, int i, int i2, int i3) {
        deh dehVar = new deh();
        this.a = dehVar;
        this.b = debVar;
        this.c = llpVar;
        this.d = i;
        this.e = i2;
        dehVar.b(i, i2, i3);
    }

    private final mhe b() {
        this.a.a(true);
        mhd b = mhe.b(this.a.a.size());
        for (View view : this.a.a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = layoutParams != null ? layoutParams.width : -2;
            int i2 = b.a + 1;
            int[] iArr = (int[]) b.b;
            int length = iArr.length;
            if (i2 > length) {
                int i3 = length + (length >> 1) + 1;
                if (i3 < i2) {
                    int highestOneBit = Integer.highestOneBit(i2 - 1);
                    i3 = highestOneBit + highestOneBit;
                }
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                b.b = Arrays.copyOf(iArr, i3);
            }
            Object obj = b.b;
            int i4 = b.a;
            ((int[]) obj)[i4] = i;
            b.a = i4 + 1;
            this.b.k((SoftKeyView) view);
        }
        this.a.b(this.d, this.e, 0);
        int i5 = b.a;
        return i5 == 0 ? mhe.a : new mhe((int[]) b.b, i5);
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final mhe next() {
        mhe mheVar;
        if (hasNext()) {
            while (this.f != this.c.size()) {
                deb debVar = this.b;
                int i = this.f;
                SoftKeyView g = debVar.g(i, (hln) this.c.get(i));
                this.f++;
                if (this.a.c(g)) {
                    mheVar = null;
                    continue;
                } else {
                    mhe b = b();
                    this.a.c(g);
                    mheVar = b;
                    continue;
                }
                if (mheVar != null) {
                    return mheVar;
                }
            }
            return b();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != this.c.size() || !this.a.a.isEmpty();
    }
}
