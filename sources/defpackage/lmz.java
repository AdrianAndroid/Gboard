package defpackage;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: lmz  reason: default package */
/* loaded from: classes.dex */
public abstract class lmz extends llg implements Set {
    private transient llp a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < max);
            return highestOneBit;
        }
        jdg.w(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static lmx g() {
        return new lmx();
    }

    public static lmx h(int i) {
        jez.W(i, "expectedSize");
        return new lmx(i);
    }

    public static lmz o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return lrr.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        lmx lmxVar = new lmx();
        lmxVar.d(next);
        jdg.u(it);
        while (it.hasNext()) {
            lmxVar.d(it.next());
        }
        return lmxVar.g();
    }

    public static lmz p(Collection collection) {
        if ((collection instanceof lmz) && !(collection instanceof SortedSet)) {
            lmz lmzVar = (lmz) collection;
            if (!lmzVar.m()) {
                return lmzVar;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static lmz q(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return r(objArr[0]);
            }
            return i(length, (Object[]) objArr.clone());
        }
        return lrr.a;
    }

    public static lmz r(Object obj) {
        return new lsg(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static lmz s(Object obj, Object obj2) {
        return i(2, obj, obj2);
    }

    public static lmz t(Object obj, Object obj2, Object obj3) {
        return i(3, obj, obj2, obj3);
    }

    public static lmz u(Object obj, Object obj2, Object obj3, Object obj4) {
        return i(4, obj, obj2, obj3, obj4);
    }

    public static lmz v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static lmz w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        jdg.w(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return i(i, objArr2);
    }

    public static boolean x(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean d() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof lmz) && d() && ((lmz) obj).d() && hashCode() != obj.hashCode()) {
            return false;
        }
        return lvw.p(this, obj);
    }

    public llp f() {
        return llp.g(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return lvw.h(this);
    }

    @Override // defpackage.llg
    public llp k() {
        llp llpVar = this.a;
        if (llpVar == null) {
            llp f = f();
            this.a = f;
            return f;
        }
        return llpVar;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public abstract lsz iterator();

    @Override // defpackage.llg
    Object writeReplace() {
        return new lmy(toArray());
    }

    public static lmz i(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                return r(Objects.requireNonNull(objArr[0]));
            }
            int e = e(i);
            Object[] objArr2 = new Object[e];
            int i2 = e - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                lre.g(obj, i5);
                int hashCode = obj.hashCode();
                int G = jez.G(hashCode);
                while (true) {
                    int i6 = G & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        G++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new lsg(Objects.requireNonNull(objArr[0]));
            }
            if (e(i4) < e / 2) {
                return i(i4, objArr);
            }
            if (x(i4, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new lrr(objArr, i3, objArr2, i2, i4);
        }
        return lrr.a;
    }
}
