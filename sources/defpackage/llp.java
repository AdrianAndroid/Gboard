package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: llp  reason: default package */
/* loaded from: classes.dex */
public abstract class llp extends llg implements List, RandomAccess {
    private static final lta a = new lll(lrl.a, 0);

    public static llp C() {
        return E("⚕️", "♀️", "♂️", "♟️", "♾️");
    }

    public static llp D() {
        return E("😂", "😀", "😘", "🤔", "🙄", "😭", "😞", "🔥", "👍");
    }

    private static llp E(Object... objArr) {
        lre.h(objArr);
        return g(objArr);
    }

    public static llk e() {
        return new llk();
    }

    public static llk f(int i) {
        jez.W(i, "expectedSize");
        return new llk(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static llp g(Object[] objArr) {
        return h(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static llp h(Object[] objArr, int i) {
        if (i == 0) {
            return lrl.a;
        }
        return new lrl(objArr, i);
    }

    public static llp i(Iterable iterable) {
        jdg.u(iterable);
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return lrl.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        llk llkVar = new llk();
        llkVar.h(next);
        llkVar.k(it);
        return llkVar.g();
    }

    public static llp o(Collection collection) {
        if (collection instanceof llg) {
            llp k = ((llg) collection).k();
            return k.m() ? g(k.toArray()) : k;
        }
        return E(collection.toArray());
    }

    public static llp p(Object[] objArr) {
        if (objArr.length == 0) {
            return lrl.a;
        }
        return E((Object[]) objArr.clone());
    }

    public static llp q() {
        return lrl.a;
    }

    public static llp r(Object obj) {
        return E(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static llp s(Object obj, Object obj2) {
        return E(obj, obj2);
    }

    public static llp t(Object obj, Object obj2, Object obj3) {
        return E(obj, obj2, obj3);
    }

    public static llp u(Object obj, Object obj2, Object obj3, Object obj4) {
        return E(obj, obj2, obj3, obj4);
    }

    public static llp v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return E(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static llp w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return E(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @SafeVarargs
    public static llp x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        jdg.w(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return E(objArr2);
    }

    public static llp y(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) lre.al(iterable, new Comparable[0]);
        lre.h(comparableArr);
        Arrays.sort(comparableArr);
        return g(comparableArr);
    }

    public static llp z(Comparator comparator, Iterable iterable) {
        jdg.u(comparator);
        Object[] aj = lre.aj(iterable);
        lre.h(aj);
        Arrays.sort(aj, comparator);
        return g(aj);
    }

    @Override // java.util.List
    /* renamed from: A */
    public final lta listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: B */
    public final lta listIterator(int i) {
        jdg.P(i, size());
        return isEmpty() ? a : new lll(this, i);
    }

    public llp a() {
        return size() <= 1 ? this : new llm(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.llg
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: d */
    public llp subList(int i, int i2) {
        jdg.E(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new llo(this, i, i3);
        }
        return lrl.a;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return lre.I(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.llg
    @Deprecated
    public final llp k() {
        return this;
    }

    @Override // defpackage.llg
    public final lsz l() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.llg
    Object writeReplace() {
        return new lln(toArray());
    }
}
