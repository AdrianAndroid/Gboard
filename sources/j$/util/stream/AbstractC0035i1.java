package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0035i1 extends AbstractC0041k1 implements j$.util.function.i {
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.i) {
            g((j$.util.function.i) consumer);
        } else if (!S1.a) {
            AbstractC0002b.e((C0032h1) mo51spliterator(), consumer);
        } else {
            S1.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.F.h(mo51spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final void n(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.i iVar = (j$.util.function.i) obj2;
        while (i < i2) {
            iVar.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.AbstractC0041k1
    public final Object newArray(int i) {
        return new long[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final int o(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0041k1
    protected final Object[] q() {
        return new long[8];
    }

    @Override // java.lang.Iterable
    /* renamed from: s */
    public abstract j$.util.p mo51spliterator();

    public final String toString() {
        long[] jArr = (long[]) b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
