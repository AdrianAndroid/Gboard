package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: nhn  reason: default package */
/* loaded from: classes2.dex */
public final class nhn extends nem {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final nem e;
    public final nem f;
    public final int g;
    private final int h;

    public nhn(nem nemVar, nem nemVar2) {
        this.e = nemVar;
        this.f = nemVar2;
        int d = nemVar.d();
        this.h = d;
        this.d = d + nemVar2.d();
        this.g = Math.max(nemVar.f(), nemVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static nem g(nem nemVar, nem nemVar2) {
        int d = nemVar.d();
        int d2 = nemVar2.d();
        byte[] bArr = new byte[d + d2];
        nemVar.E(bArr, 0, d);
        nemVar2.E(bArr, d, d2);
        return nem.y(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.nem
    public final byte a(int i) {
        B(i, this.d);
        return b(i);
    }

    @Override // defpackage.nem
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.nem
    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.h;
        if (i + i3 <= i4) {
            this.e.e(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f.e(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.e.e(bArr, i, i2, i5);
            this.f.e(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // defpackage.nem
    public final boolean equals(Object obj) {
        boolean g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nem)) {
            return false;
        }
        nem nemVar = (nem) obj;
        if (this.d != nemVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = nemVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        nhm nhmVar = new nhm(this);
        nej next = nhmVar.next();
        nhm nhmVar2 = new nhm(nemVar);
        nej next2 = nhmVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = next.d() - i3;
            int d2 = next2.d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                g = next.g(next2, i4, min);
            } else {
                g = next2.g(next, i3, min);
            }
            if (!g) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 != i6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if (min == d) {
                next = nhmVar.next();
                i3 = 0;
            } else {
                i3 += min;
            }
            if (min == d2) {
                next2 = nhmVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final int f() {
        return this.g;
    }

    @Override // defpackage.nem
    public final boolean h() {
        return this.d >= c(this.g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final int i(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.i(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.i(this.e.i(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.nem, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nem
    public final int j(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.j(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.j(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.j(this.e.j(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.nem
    public final nem k(int i, int i2) {
        int q = q(i, i2, this.d);
        if (q == 0) {
            return nem.b;
        }
        if (q == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.k(i, i2);
        }
        if (i >= i3) {
            return this.f.k(i - i3, i2 - i3);
        }
        nem nemVar = this.e;
        return new nhn(nemVar.k(i, nemVar.d()), this.f.k(0, i2 - this.h));
    }

    @Override // defpackage.nem
    public final ner l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        nhm nhmVar = new nhm(this);
        while (nhmVar.hasNext()) {
            arrayList.add(nhmVar.next().n());
        }
        int i = ner.e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new neo(arrayList, i2);
        }
        return ner.H(new nge(arrayList));
    }

    @Override // defpackage.nem
    protected final String m(Charset charset) {
        return new String(D(), charset);
    }

    @Override // defpackage.nem
    public final ByteBuffer n() {
        return ByteBuffer.wrap(D()).asReadOnlyBuffer();
    }

    @Override // defpackage.nem
    public final void o(nee neeVar) {
        this.e.o(neeVar);
        this.f.o(neeVar);
    }

    @Override // defpackage.nem
    public final boolean p() {
        int j = this.e.j(0, 0, this.h);
        nem nemVar = this.f;
        return nemVar.j(j, 0, nemVar.d()) == 0;
    }

    @Override // defpackage.nem
    public final nei r() {
        return new nhl(this);
    }

    Object writeReplace() {
        return nem.y(D());
    }
}
