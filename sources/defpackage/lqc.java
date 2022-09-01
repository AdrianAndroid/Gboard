package defpackage;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lqc  reason: default package */
/* loaded from: classes.dex */
public final class lqc extends AbstractMap implements ConcurrentMap, Serializable, j$.util.concurrent.ConcurrentMap {
    static final lpz a = new loy();
    public static final /* synthetic */ int k = 0;
    private static final long serialVersionUID = 5;
    final transient int b;
    final transient int c;
    final transient lpl[] d;
    final int e;
    final lep f;
    final transient lph g;
    transient Set h;
    transient Collection i;
    transient Set j;

    public lqc(lox loxVar, lph lphVar) {
        this.e = Math.min(loxVar.a(), 65536);
        this.f = (lep) jdg.U(loxVar.f, loxVar.c().a());
        this.g = lphVar;
        int min = Math.min(loxVar.b(), 1073741824);
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.e) {
            i4++;
            i3 += i3;
        }
        this.c = 32 - i4;
        this.b = i3 - 1;
        this.d = new lpl[i3];
        int i5 = min / i3;
        while (i2 < (i3 * i5 < min ? i5 + 1 : i5)) {
            i2 += i2;
        }
        while (true) {
            lpl[] lplVarArr = this.d;
            if (i < lplVarArr.length) {
                lplVarArr[i] = this.g.f(this, i2);
                i++;
            } else {
                return;
            }
        }
    }

    public static ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        lre.U(arrayList, collection.iterator());
        return arrayList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    final int a(Object obj) {
        int c = this.f.c(obj);
        int i = c + ((c << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lep b() {
        return this.g.d().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lpl c(int i) {
        return this.d[(i >>> this.c) & this.b];
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        lpl[] lplVarArr = this.d;
        int length = lplVarArr.length;
        for (int i = 0; i < length; i++) {
            lpl lplVar = lplVarArr[i];
            if (lplVar.b != 0) {
                lplVar.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = lplVar.e;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    lplVar.g();
                    lplVar.g.set(0);
                    lplVar.c++;
                    lplVar.b = 0;
                } finally {
                    lplVar.unlock();
                }
            }
        }
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        lpg b;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        lpl c = c(a2);
        try {
            if (c.b != 0 && (b = c.b(obj, a2)) != null) {
                if (b.d() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            c.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        Object d;
        if (obj == null) {
            return false;
        }
        lpl[] lplVarArr = this.d;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (lpl lplVar : lplVarArr) {
                int i2 = lplVar.b;
                AtomicReferenceArray atomicReferenceArray = lplVar.e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (lpg lpgVar = (lpg) atomicReferenceArray.get(i3); lpgVar != null; lpgVar = lpgVar.b()) {
                        if (lpgVar.c() == null || (d = lpgVar.d()) == null) {
                            lplVar.l();
                            d = null;
                        }
                        if (d != null && b().d(obj, d)) {
                            return true;
                        }
                    }
                }
                j2 += lplVar.c;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set = this.j;
        if (set != null) {
            return set;
        }
        lpe lpeVar = new lpe(this);
        this.j = lpeVar;
        return lpeVar;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        lpl c = c(a2);
        try {
            lpg b = c.b(obj, a2);
            if (b != null && (obj2 = b.d()) == null) {
                c.l();
            }
            return obj2;
        } finally {
            c.i();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        lpl[] lplVarArr = this.d;
        long j = 0;
        for (int i = 0; i < lplVarArr.length; i++) {
            if (lplVarArr[i].b != 0) {
                return false;
            }
            j += lplVarArr[i].c;
        }
        if (j != 0) {
            for (int i2 = 0; i2 < lplVarArr.length; i2++) {
                if (lplVarArr[i2].b != 0) {
                    return false;
                }
                j -= lplVarArr[i2].c;
            }
            return j == 0;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        lpj lpjVar = new lpj(this);
        this.h = lpjVar;
        return lpjVar;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        jdg.u(obj);
        jdg.u(obj2);
        int a2 = a(obj);
        return c(a2).d(obj, a2, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        jdg.u(obj);
        jdg.u(obj2);
        int a2 = a(obj);
        return c(a2).d(obj, a2, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        r10 = r6.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        r2.c++;
        r3.set(r4, r2.c(r5, r6));
        r2.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (defpackage.lpl.m(r6) != false) goto L18;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r9.a(r10)
            lpl r2 = r9.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L6b
            int r3 = r2.b     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L6b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L6b
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L6b
            lpg r5 = (defpackage.lpg) r5     // Catch: java.lang.Throwable -> L6b
            r6 = r5
        L24:
            if (r6 == 0) goto L67
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L6b
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L62
            if (r7 == 0) goto L62
            lqc r8 = r2.a     // Catch: java.lang.Throwable -> L6b
            lep r8 = r8.f     // Catch: java.lang.Throwable -> L6b
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L62
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L6b
            if (r10 == 0) goto L43
            goto L4a
        L43:
            boolean r1 = defpackage.lpl.m(r6)     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L4a
            goto L67
        L4a:
            int r0 = r2.c     // Catch: java.lang.Throwable -> L6b
            int r0 = r0 + 1
            r2.c = r0     // Catch: java.lang.Throwable -> L6b
            lpg r0 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L6b
            int r1 = r2.b     // Catch: java.lang.Throwable -> L6b
            int r1 = r1 + (-1)
            r3.set(r4, r0)     // Catch: java.lang.Throwable -> L6b
            r2.b = r1     // Catch: java.lang.Throwable -> L6b
            r2.unlock()
            r0 = r10
            goto L6a
        L62:
            lpg r6 = r6.b()     // Catch: java.lang.Throwable -> L6b
            goto L24
        L67:
            r2.unlock()
        L6a:
            return r0
        L6b:
            r10 = move-exception
            r2.unlock()
            goto L71
        L70:
            throw r10
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object replace(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            defpackage.jdg.u(r10)
            defpackage.jdg.u(r11)
            int r0 = r9.a(r10)
            lpl r1 = r9.c(r0)
            r1.lock()
            r1.j()     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.e     // Catch: java.lang.Throwable -> L76
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + (-1)
            r3 = r3 & r0
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> L76
            lpg r4 = (defpackage.lpg) r4     // Catch: java.lang.Throwable -> L76
            r5 = r4
        L24:
            r6 = 0
            if (r5 == 0) goto L72
            java.lang.Object r7 = r5.c()     // Catch: java.lang.Throwable -> L76
            int r8 = r5.a()     // Catch: java.lang.Throwable -> L76
            if (r8 != r0) goto L6d
            if (r7 == 0) goto L6d
            lqc r8 = r1.a     // Catch: java.lang.Throwable -> L76
            lep r8 = r8.f     // Catch: java.lang.Throwable -> L76
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L6d
            java.lang.Object r10 = r5.d()     // Catch: java.lang.Throwable -> L76
            if (r10 != 0) goto L5f
            boolean r10 = defpackage.lpl.m(r5)     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L72
            int r10 = r1.b     // Catch: java.lang.Throwable -> L76
            int r10 = r1.c     // Catch: java.lang.Throwable -> L76
            int r10 = r10 + 1
            r1.c = r10     // Catch: java.lang.Throwable -> L76
            lpg r10 = r1.c(r4, r5)     // Catch: java.lang.Throwable -> L76
            int r11 = r1.b     // Catch: java.lang.Throwable -> L76
            int r11 = r11 + (-1)
            r2.set(r3, r10)     // Catch: java.lang.Throwable -> L76
            r1.b = r11     // Catch: java.lang.Throwable -> L76
            goto L72
        L5f:
            int r0 = r1.c     // Catch: java.lang.Throwable -> L76
            int r0 = r0 + 1
            r1.c = r0     // Catch: java.lang.Throwable -> L76
            r1.k(r5, r11)     // Catch: java.lang.Throwable -> L76
            r1.unlock()
            r6 = r10
            goto L75
        L6d:
            lpg r5 = r5.b()     // Catch: java.lang.Throwable -> L76
            goto L24
        L72:
            r1.unlock()
        L75:
            return r6
        L76:
            r10 = move-exception
            r1.unlock()
            goto L7c
        L7b:
            throw r10
        L7c:
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        long j = 0;
        for (lpl lplVar : this.d) {
            j += lplVar.b;
        }
        return mhq.m(j);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        lpt lptVar = new lpt(this);
        this.i = lptVar;
        return lptVar;
    }

    Object writeReplace() {
        lpn c = this.g.c();
        lpn d = this.g.d();
        lep lepVar = this.f;
        this.g.d().a();
        return new lpm(c, d, lepVar, this.e, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r2.a.b().d(r11, r6.d()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        r2.c++;
        r3.set(r4, r2.c(r5, r6));
        r2.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (defpackage.lpl.m(r6) == false) goto L18;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L79
            if (r11 != 0) goto L7
            goto L79
        L7:
            int r1 = r9.a(r10)
            lpl r2 = r9.c(r1)
            r2.lock()
            r2.j()     // Catch: java.lang.Throwable -> L74
            int r3 = r2.b     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r2.e     // Catch: java.lang.Throwable -> L74
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L74
            int r4 = r4 + (-1)
            r4 = r4 & r1
            java.lang.Object r5 = r3.get(r4)     // Catch: java.lang.Throwable -> L74
            lpg r5 = (defpackage.lpg) r5     // Catch: java.lang.Throwable -> L74
            r6 = r5
        L27:
            if (r6 == 0) goto L70
            java.lang.Object r7 = r6.c()     // Catch: java.lang.Throwable -> L74
            int r8 = r6.a()     // Catch: java.lang.Throwable -> L74
            if (r8 != r1) goto L6b
            if (r7 == 0) goto L6b
            lqc r8 = r2.a     // Catch: java.lang.Throwable -> L74
            lep r8 = r8.f     // Catch: java.lang.Throwable -> L74
            boolean r7 = r8.d(r10, r7)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L6b
            java.lang.Object r10 = r6.d()     // Catch: java.lang.Throwable -> L74
            lqc r1 = r2.a     // Catch: java.lang.Throwable -> L74
            lep r1 = r1.b()     // Catch: java.lang.Throwable -> L74
            boolean r10 = r1.d(r11, r10)     // Catch: java.lang.Throwable -> L74
            r11 = 1
            if (r10 == 0) goto L52
            r0 = 1
            goto L58
        L52:
            boolean r10 = defpackage.lpl.m(r6)     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L70
        L58:
            int r10 = r2.c     // Catch: java.lang.Throwable -> L74
            int r10 = r10 + r11
            r2.c = r10     // Catch: java.lang.Throwable -> L74
            lpg r10 = r2.c(r5, r6)     // Catch: java.lang.Throwable -> L74
            int r11 = r2.b     // Catch: java.lang.Throwable -> L74
            int r11 = r11 + (-1)
            r3.set(r4, r10)     // Catch: java.lang.Throwable -> L74
            r2.b = r11     // Catch: java.lang.Throwable -> L74
            goto L70
        L6b:
            lpg r6 = r6.b()     // Catch: java.lang.Throwable -> L74
            goto L27
        L70:
            r2.unlock()
            return r0
        L74:
            r10 = move-exception
            r2.unlock()
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        jdg.u(obj);
        jdg.u(obj3);
        if (obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        lpl c = c(a2);
        c.lock();
        try {
            c.j();
            AtomicReferenceArray atomicReferenceArray = c.e;
            int length = (atomicReferenceArray.length() - 1) & a2;
            lpg lpgVar = (lpg) atomicReferenceArray.get(length);
            lpg lpgVar2 = lpgVar;
            while (true) {
                if (lpgVar2 == null) {
                    break;
                }
                Object c2 = lpgVar2.c();
                if (lpgVar2.a() != a2 || c2 == null || !c.a.f.d(obj, c2)) {
                    lpgVar2 = lpgVar2.b();
                } else {
                    Object d = lpgVar2.d();
                    if (d == null) {
                        if (lpl.m(lpgVar2)) {
                            int i = c.b;
                            c.c++;
                            atomicReferenceArray.set(length, c.c(lpgVar, lpgVar2));
                            c.b--;
                        }
                    } else if (c.a.b().d(obj2, d)) {
                        c.c++;
                        c.k(lpgVar2, obj3);
                        c.unlock();
                        return true;
                    }
                }
            }
            return false;
        } finally {
            c.unlock();
        }
    }
}
