package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0044l1 extends AbstractC0021e implements Consumer, Iterable {
    protected Object[] d = new Object[16];
    protected Object[][] e;

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.a;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            if (this.e == null) {
                Object[][] objArr2 = new Object[8];
                this.e = objArr2;
                this.c = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.e;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i2].length + this.c[i2];
                }
                n(length + 1);
            }
            this.a = 0;
            int i4 = this.b + 1;
            this.b = i4;
            this.d = this.e[i4];
        }
        Object[] objArr4 = this.d;
        int i5 = this.a;
        this.a = i5 + 1;
        objArr4[i5] = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.AbstractC0021e
    public final void clear() {
        Object[][] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.e = null;
            this.c = null;
        } else {
            for (int i2 = 0; i2 < this.a; i2++) {
                this.d[i2] = null;
            }
        }
        this.a = 0;
        this.b = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            for (Object obj : this.e[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            consumer.accept(this.d[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.F.i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(long j) {
        long length;
        int i;
        Object[][] objArr;
        int i2;
        int i3 = this.b;
        if (i3 == 0) {
            length = this.d.length;
        } else {
            length = this.c[i3] + this.e[i3].length;
        }
        if (j > length) {
            if (this.e == null) {
                Object[][] objArr2 = new Object[8];
                this.e = objArr2;
                this.c = new long[8];
                objArr2[0] = this.d;
            }
            while (true) {
                i3++;
                if (j > length) {
                    Object[][] objArr3 = this.e;
                    if (i3 >= objArr3.length) {
                        int length2 = objArr3.length * 2;
                        this.e = (Object[][]) Arrays.copyOf(objArr3, length2);
                        this.c = Arrays.copyOf(this.c, length2);
                    }
                    if (i3 != 0 && i3 != 1) {
                        i = Math.min((i3 + 4) - 1, 30);
                    } else {
                        i = 4;
                    }
                    int i4 = 1 << i;
                    this.e[i3] = new Object[i4];
                    long[] jArr = this.c;
                    jArr[i3] = jArr[i3 - 1] + objArr[i2].length;
                    length += i4;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public j$.util.r spliterator() {
        return new C0017c1(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C0009a(5, arrayList));
        return j$.net.a.a("SpinedBuffer:", arrayList.toString());
    }
}
