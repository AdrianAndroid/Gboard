package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0029g1 extends AbstractC0041k1 implements j$.util.function.g {
    @Override // j$.util.function.g
    public void accept(int i) {
        r();
        int i2 = this.a;
        this.a = i2 + 1;
        ((int[]) this.d)[i2] = i;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.g) {
            g((j$.util.function.g) consumer);
        } else if (!S1.a) {
            s().forEachRemaining(consumer);
        } else {
            S1.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.F.g(s());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final void n(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.g gVar = (j$.util.function.g) obj2;
        while (i < i2) {
            gVar.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.AbstractC0041k1
    public final Object newArray(int i) {
        return new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0041k1
    public final int o(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0041k1
    protected final Object[] q() {
        return new int[8];
    }

    public j$.util.o s() {
        return new C0026f1(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
