package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: oqi  reason: default package */
/* loaded from: classes2.dex */
public final class oqi {
    public final opz a;
    public final String b;
    public final opx c;
    public final oqj d;
    public final Map e;
    private volatile ope f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public oqi(osr osrVar, byte[] bArr) {
        this.a = (opz) osrVar.c;
        this.b = (String) osrVar.e;
        this.c = ((mlu) osrVar.d).D();
        this.d = (oqj) osrVar.b;
        this.e = oqs.n(osrVar.a);
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final ope b() {
        ope opeVar = this.f;
        if (opeVar != null) {
            return opeVar;
        }
        ope a = ope.a(this.c);
        this.f = a;
        return a;
    }

    public final boolean c() {
        return this.a.q();
    }

    public final osr d() {
        return new osr(this);
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.e);
        return "Request{method=" + str + ", url=" + valueOf + ", tags=" + valueOf2 + "}";
    }
}        p = b;
                    this.e = p;
                }
            }
            int i5 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = ipxVar.a;
                    int i7 = ipxVar.b;
                    int i8 = ipxVar.c;
                    int a2 = a(count, i6, i7);
                    int a3 = a(count, i6, i8);
                    iArr = new int[a3 - a2];
                    for (int i9 = a2; i9 < a3; i9++) {
                        iArr[i9 - a2] = i9;
                    }
                } else if (!ipxVar.d) {
                    p = gvw.b;
                    this.e = p;
                } else {
                    iArr = new int[count];
                    for (int i10 = 0; i10 < count; i10++) {
                        iArr[i10] = i10;
                    }
                }
                p = iArr;
            } else {
                int i11 = ipxVar.a;
                int i12 = ipxVar.b;
                int i13 = ipxVar.c;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < count; i14++) {
                    int i15 = i14 % i11;
                    if (i15 >= i12 && i15 < i13) {
                        arrayList.add(Integer.valueOf(i14));
                    }
                }
                p = mhq.p(arrayList);
            }
            if (ipxVar.d) {
                Collections.shuffle(mhq.n(p));
            }
            this.e = p;
        } else {
            this.e = gvw.b;
        }
        this.f = this.e == b ? true : z;
    }

    private static int a(int i, int i2, int i3) {
        int i4 = i / i2;
        int i5 = i % i2;
        if (i3 <= i5) {
            return i3 * (i4 + 1);
        }
        return ((i3 - i5) * i4) + ((i4 + 1) * i5);
    }

    @Override // defpackage.iph, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f) {
            return false;
        }
        int length = this.e.length;
        return length == 0 ? !this.c.isLast() && !this.c.isAfterLast() : this.g < length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f) {
            throw new IllegalStateException("Iterator config is invalid, so the iterator is empty.");
        }
        int[] iArr = this.e;
        if (iArr.length == 0) {
            this.c.moveToNext();
        } else {
            Cursor cursor = this.c;
            int i = this.g;
            this.g = i + 1;
            cursor.moveToPosition(iArr[i]);
        }
        return this.d.a(this.c);
    }
}
