package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: llf  reason: default package */
/* loaded from: classes.dex */
public class llf {
    Object[] a;
    int b = 0;
    boolean c;

    public llf(int i) {
        jez.W(i, "initialCapacity");
        this.a = new Object[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    private final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, a(length, i));
            this.c = false;
        } else if (!this.c) {
        } else {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final void b(Object[] objArr, int i) {
        lre.i(objArr, i);
        g(this.b + i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void c(Object obj) {
        jdg.u(obj);
        g(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    public final void e(Object... objArr) {
        b(objArr, objArr.length);
    }

    public final void f(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(this.b + collection.size());
            if (collection instanceof llg) {
                this.b = ((llg) collection).b(this.a, this.b);
                return;
            }
        }
        for (Object obj : iterable) {
            d(obj);
        }
    }
}
