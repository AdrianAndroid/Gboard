package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0023e1 extends AbstractC0041k1 implements j$.util.function.c {
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.c) {
            g((j$.util.function.c) consumer);
        } else if (!S1.a) {
            AbstractC0002b.c((C0020d1) mo48spliterator(), consumer);
        } else {
            S1.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.F.f(mo48spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final void n(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        j$.util.function.c cVar = (j$.util.function.c) obj2;
        while (i < i2) {
            cVar.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.AbstractC0041k1
    public final Object newArray(int i) {
        return new double[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final int o(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0041k1
    protected final Object[] q() {
        return new double[8];
    }

    @Override // java.lang.Iterable
    /* renamed from: s */
    public abstract j$.util.n mo48spliterator();

    public final String toString() {
        double[] dArr = (double[]) b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
