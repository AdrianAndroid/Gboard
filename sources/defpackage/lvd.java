package defpackage;

import android.view.View;
import android.view.ViewGroup;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lvd  reason: default package */
/* loaded from: classes.dex */
public final class lvd implements Iterator, j$.util.Iterator {
    final /* synthetic */ Object a;
    private int b;
    private final /* synthetic */ int c;

    public lvd(ViewGroup viewGroup, int i) {
        this.c = i;
        this.a = viewGroup;
    }

    public lvd(lve lveVar, int i) {
        this.c = i;
        this.a = lveVar;
        this.b = 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.b < ((ViewGroup) this.a).getChildCount() : this.b < ((lve) this.a).a.b;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.c == 0) {
            throw new UnsupportedOperationException();
        }
        Object obj = this.a;
        int i = this.b - 1;
        this.b = i;
        ((ViewGroup) obj).removeViewAt(i);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        if (this.c != 0) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.c == 0) {
            lvg lvgVar = ((lve) this.a).a;
            int[] iArr = lvgVar.a;
            int i = this.b;
            this.b = i + 1;
            return lvgVar.e(iArr[i] & 31);
        }
        Object obj = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        View childAt = ((ViewGroup) obj).getChildAt(i2);
        if (childAt == null) {
            throw new IndexOutOfBoundsException();
        }
        return childAt;
    }
}
