package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lwr  reason: default package */
/* loaded from: classes.dex */
public final class lwr extends AbstractMap {
    public static final Comparator a = new jpf(9);
    public final Object[] b;
    public final int[] c;
    public final Set d = new lwq(this, -1);
    private Integer e = null;
    private String f = null;

    public lwr(lwr lwrVar, lwr lwrVar2) {
        int i;
        int i2;
        Object obj;
        Object[] objArr;
        int size = lwrVar.size() + lwrVar2.size();
        int b = lwrVar.b() + lwrVar2.b();
        Object[] objArr2 = new Object[b];
        int i3 = size + 1;
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        int i5 = size;
        Map.Entry c = lwrVar.c(0);
        Map.Entry c2 = lwrVar2.c(0);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (c == null && c2 == null) {
                break;
            }
            int i9 = c == null ? 1 : c2 == null ? -1 : 0;
            if (i9 == 0 && (i9 = ((String) c.getKey()).compareTo((String) c2.getKey())) == 0) {
                objArr2[i6] = d((String) c.getKey(), i6);
                int i10 = i6 + 1;
                lwq lwqVar = (lwq) c.getValue();
                lwq lwqVar2 = (lwq) c2.getValue();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= lwqVar.size() && i12 >= lwqVar2.size()) {
                        break;
                    }
                    int i13 = i11 == lwqVar.size() ? 1 : i12 == lwqVar2.size() ? -1 : 0;
                    i13 = i13 == 0 ? lwt.a.compare(lwqVar.c(i11), lwqVar2.c(i12)) : i13;
                    if (i13 < 0) {
                        i2 = i11 + 1;
                        obj = lwqVar.c(i11);
                    } else {
                        int i14 = i12 + 1;
                        Object c3 = lwqVar2.c(i12);
                        i2 = i13 == 0 ? i11 + 1 : i11;
                        i12 = i14;
                        obj = c3;
                    }
                    objArr2[i5] = obj;
                    i11 = i2;
                    i5++;
                    i4 = 0;
                }
                iArr[i10] = i5;
                int i15 = i7 + 1;
                c = lwrVar.c(i15);
                int i16 = i8 + 1;
                c2 = lwrVar2.c(i16);
                i7 = i15;
                i8 = i16;
                i6 = i10;
            } else {
                if (i9 < 0) {
                    i = i6 + 1;
                    int a2 = a(c, i6, i5, objArr2, iArr);
                    int i17 = i7 + 1;
                    c = lwrVar.c(i17);
                    i5 = a2;
                    i7 = i17;
                } else {
                    i = i6 + 1;
                    int a3 = a(c2, i6, i5, objArr2, iArr);
                    int i18 = i8 + 1;
                    c2 = lwrVar2.c(i18);
                    i5 = a3;
                    i8 = i18;
                }
                i6 = i;
                i4 = 0;
            }
        }
        int i19 = iArr[i4];
        int i20 = i19 - i6;
        if (i20 != 0) {
            for (int i21 = 0; i21 <= i6; i21++) {
                iArr[i21] = iArr[i21] - i20;
            }
            int i22 = iArr[i6];
            int i23 = i22 - i6;
            if (e(b, i22)) {
                objArr = new Object[i22];
                System.arraycopy(objArr2, i4, objArr, i4, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i19, objArr, i6, i23);
            objArr2 = objArr;
        }
        this.b = objArr2;
        int i24 = iArr[i4] + 1;
        this.c = e(i3, i24) ? Arrays.copyOf(iArr, i24) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        lwq lwqVar = (lwq) entry.getValue();
        int a2 = lwqVar.a() - lwqVar.b();
        System.arraycopy(lwqVar.b.b, lwqVar.b(), objArr, i2, a2);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + a2;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new lwq(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.e == null) {
            this.e = Integer.valueOf(super.hashCode());
        }
        return this.e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }

    public lwr(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Object obj = ((kdg) it2.next()).a;
                throw null;
            }
            iArr[0] = 0;
            this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
            this.c = iArr;
            return;
        }
        Object obj2 = ((kdg) it.next()).a;
        throw null;
    }
}
