package defpackage;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: lig  reason: default package */
/* loaded from: classes.dex */
public final class lig extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(lig.class.getName());
    static final lhv b = new lgq();
    static final Queue c = new lgr();
    final int d;
    final int e;
    final lhm[] f;
    final int g;
    final lep h;
    final lep i;
    final lho j;
    final lho k;
    final long l;
    final lil m;
    final long n;
    final long o;
    final Queue p;
    final lij q;
    final lgh r;
    final lhd s;
    Set t;
    Collection u;
    Set v;
    final jez w;

    public lig(lgo lgoVar) {
        long j;
        int i = lgoVar.d;
        this.g = Math.min(i == -1 ? 4 : i, 65536);
        lho c2 = lgoVar.c();
        this.j = c2;
        this.k = lgoVar.d();
        this.h = (lep) jdg.U(lgoVar.l, lgoVar.c().a());
        this.i = (lep) jdg.U(lgoVar.m, lgoVar.d().a());
        long j2 = 0;
        if (lgoVar.j == 0 || lgoVar.k == 0) {
            j = 0;
        } else {
            j = lgoVar.g == null ? lgoVar.e : lgoVar.f;
        }
        this.l = j;
        this.m = (lil) jdg.U(lgoVar.g, lgn.a);
        long j3 = lgoVar.k;
        this.n = j3 == -1 ? 0L : j3;
        long j4 = lgoVar.j;
        this.o = j4 != -1 ? j4 : j2;
        lij lijVar = (lij) jdg.U(lgoVar.n, lgm.a);
        this.q = lijVar;
        this.p = lijVar == lgm.a ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = n() || k();
        lgh lghVar = lgoVar.o;
        this.r = lghVar == null ? z ? lgh.a : lgo.b : lghVar;
        this.s = lhd.b(c2, o() || k(), l() || n());
        jez jezVar = (jez) ((lge) lgoVar.p).a;
        this.w = null;
        int min = Math.min(16, 1073741824);
        if (j() && !i()) {
            min = (int) Math.min(min, j);
        }
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.g && (!j() || i4 * 20 <= this.l)) {
            i5++;
            i4 += i4;
        }
        this.e = 32 - i5;
        this.d = i4 - 1;
        this.f = new lhm[i4];
        int i6 = min / i4;
        while (i3 < (i6 * i4 < min ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (j()) {
            long j5 = this.l;
            long j6 = i4;
            long j7 = (j5 / j6) + 1;
            long j8 = j5 % j6;
            while (true) {
                lhm[] lhmVarArr = this.f;
                if (i2 >= lhmVarArr.length) {
                    return;
                }
                if (i2 == j8) {
                    j7--;
                }
                lhmVarArr[i2] = r(i3, j7, (jez) ((lge) lgoVar.p).a);
                i2++;
            }
        } else {
            while (true) {
                lhm[] lhmVarArr2 = this.f;
                if (i2 >= lhmVarArr2.length) {
                    return;
                }
                lhmVarArr2[i2] = r(i3, -1L, (jez) ((lge) lgoVar.p).a);
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static lih c() {
        return lhl.a;
    }

    public static ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        lre.U(arrayList, collection.iterator());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(lih lihVar, lih lihVar2) {
        lihVar.l(lihVar2);
        lihVar2.n(lihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(lih lihVar, lih lihVar2) {
        lihVar.m(lihVar2);
        lihVar2.o(lihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(lih lihVar) {
        lhl lhlVar = lhl.a;
        lihVar.l(lhlVar);
        lihVar.n(lhlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(lih lihVar) {
        lhl lhlVar = lhl.a;
        lihVar.m(lhlVar);
        lihVar.o(lhlVar);
    }

    public final int a(Object obj) {
        int c2 = this.h.c(obj);
        int i = c2 + ((c2 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    public final lhm b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089 A[Catch: all -> 0x00b0, LOOP:5: B:44:0x0089->B:46:0x0091, LOOP_START, TryCatch #0 {all -> 0x00b0, blocks: (B:7:0x0010, B:8:0x001e, B:10:0x0024, B:12:0x002c, B:14:0x0036, B:18:0x0047, B:19:0x004c, B:22:0x004a, B:21:0x005a, B:25:0x005f, B:28:0x0063, B:30:0x0069, B:32:0x0070, B:34:0x0078, B:37:0x0080, B:40:0x0092, B:44:0x0089), top: B:6:0x0010 }] */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r12 = this;
            lhm[] r0 = r12.f
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto Lbc
            r4 = r0[r3]
            int r5 = r4.b
            if (r5 == 0) goto Lb8
            r4.lock()
            lig r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            lgh r5 = r5.r     // Catch: java.lang.Throwable -> Lb0
            long r5 = r5.a()     // Catch: java.lang.Throwable -> Lb0
            r4.l(r5)     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r4.f     // Catch: java.lang.Throwable -> Lb0
            r6 = 0
        L1e:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L62
            java.lang.Object r7 = r5.get(r6)     // Catch: java.lang.Throwable -> Lb0
            lih r7 = (defpackage.lih) r7     // Catch: java.lang.Throwable -> Lb0
        L2a:
            if (r7 == 0) goto L5f
            lhv r8 = r7.d()     // Catch: java.lang.Throwable -> Lb0
            boolean r8 = r8.d()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r7.j()     // Catch: java.lang.Throwable -> Lb0
            lhv r9 = r7.d()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L4a
            if (r9 != 0) goto L47
            goto L4a
        L47:
            lii r10 = defpackage.lii.EXPLICIT     // Catch: java.lang.Throwable -> Lb0
            goto L4c
        L4a:
            lii r10 = defpackage.lii.COLLECTED     // Catch: java.lang.Throwable -> Lb0
        L4c:
            r7.a()     // Catch: java.lang.Throwable -> Lb0
            lhv r11 = r7.d()     // Catch: java.lang.Throwable -> Lb0
            int r11 = r11.a()     // Catch: java.lang.Throwable -> Lb0
            r4.q(r8, r9, r11, r10)     // Catch: java.lang.Throwable -> Lb0
        L5a:
            lih r7 = r7.e()     // Catch: java.lang.Throwable -> Lb0
            goto L2a
        L5f:
            int r6 = r6 + 1
            goto L1e
        L62:
            r6 = 0
        L63:
            int r7 = r5.length()     // Catch: java.lang.Throwable -> Lb0
            if (r6 >= r7) goto L70
            r7 = 0
            r5.set(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            int r6 = r6 + 1
            goto L63
        L70:
            lig r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.p()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L80
        L78:
            java.lang.ref.ReferenceQueue r5 = r4.h     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L78
        L80:
            lig r5 = r4.a     // Catch: java.lang.Throwable -> Lb0
            boolean r5 = r5.q()     // Catch: java.lang.Throwable -> Lb0
            if (r5 != 0) goto L89
            goto L92
        L89:
            java.lang.ref.ReferenceQueue r5 = r4.i     // Catch: java.lang.Throwable -> Lb0
            java.lang.ref.Reference r5 = r5.poll()     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L92
            goto L89
        L92:
            java.util.Queue r5 = r4.l     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.Queue r5 = r4.m     // Catch: java.lang.Throwable -> Lb0
            r5.clear()     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.atomic.AtomicInteger r5 = r4.k     // Catch: java.lang.Throwable -> Lb0
            r5.set(r2)     // Catch: java.lang.Throwable -> Lb0
            int r5 = r4.d     // Catch: java.lang.Throwable -> Lb0
            int r5 = r5 + 1
            r4.d = r5     // Catch: java.lang.Throwable -> Lb0
            r4.b = r2     // Catch: java.lang.Throwable -> Lb0
            r4.unlock()
            r4.m()
            goto Lb8
        Lb0:
            r0 = move-exception
            r4.unlock()
            r4.m()
            throw r0
        Lb8:
            int r3 = r3 + 1
            goto L5
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.clear():void");
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
        lih b2;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int a2 = a(obj);
        lhm b3 = b(a2);
        try {
            if (b3.b != 0 && (b2 = b3.b(obj, a2, b3.a.r.a())) != null) {
                if (b2.d().get() != null) {
                    z = true;
                }
            }
            return z;
        } finally {
            b3.i();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        Object obj2;
        lhm[] lhmVarArr;
        Object obj3;
        if (obj == null) {
            return false;
        }
        long a2 = this.r.a();
        lhm[] lhmVarArr2 = this.f;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = lhmVarArr2.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                lhm lhmVar = lhmVarArr2[i2];
                int i3 = lhmVar.b;
                AtomicReferenceArray atomicReferenceArray = lhmVar.f;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    lih lihVar = (lih) atomicReferenceArray.get(i4);
                    while (lihVar != null) {
                        if (lihVar.j() == null || (obj2 = lihVar.d().get()) == null) {
                            lhmVar.n();
                            lhmVarArr = lhmVarArr2;
                        } else {
                            lhmVarArr = lhmVarArr2;
                            if (lhmVar.a.m(lihVar, a2)) {
                                lhmVar.o(a2);
                            } else {
                                obj3 = obj2;
                                long j3 = a2;
                                if (obj3 == null && this.i.d(obj, obj3)) {
                                    return true;
                                }
                                lihVar = lihVar.e();
                                a2 = j3;
                                lhmVarArr2 = lhmVarArr;
                            }
                        }
                        obj3 = null;
                        long j32 = a2;
                        if (obj3 == null) {
                        }
                        lihVar = lihVar.e();
                        a2 = j32;
                        lhmVarArr2 = lhmVarArr;
                    }
                }
                j2 += lhmVar.d;
                i2++;
                a2 = a2;
            }
            long j4 = a2;
            lhm[] lhmVarArr3 = lhmVarArr2;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            a2 = j4;
            lhmVarArr2 = lhmVarArr3;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set = this.v;
        if (set != null) {
            return set;
        }
        lhf lhfVar = new lhf(this);
        this.v = lhfVar;
        return lhfVar;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int a2 = a(obj);
        return b(a2).c(obj, a2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.m != lgn.a;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        lhm[] lhmVarArr = this.f;
        long j = 0;
        for (lhm lhmVar : lhmVarArr) {
            if (lhmVar.b != 0) {
                return false;
            }
            j += lhmVar.d;
        }
        if (j != 0) {
            for (lhm lhmVar2 : lhmVarArr) {
                if (lhmVar2.b != 0) {
                    return false;
                }
                j -= lhmVar2.d;
            }
            return j == 0;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.l >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        return this.n > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set = this.t;
        if (set != null) {
            return set;
        }
        lhi lhiVar = new lhi(this);
        this.t = lhiVar;
        return lhiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.o > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(lih lihVar, long j) {
        jdg.u(lihVar);
        if (!k() || j - lihVar.b() < this.n) {
            return l() && j - lihVar.c() >= this.o;
        }
        return true;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        return l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean o() {
        return k() || j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        return this.j != lho.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        jdg.u(obj);
        jdg.u(obj2);
        int a2 = a(obj);
        return b(a2).d(obj, a2, obj2, false);
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
        return b(a2).d(obj, a2, obj2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.k != lho.STRONG;
    }

    final lhm r(int i, long j, jez jezVar) {
        return new lhm(this, i, j, jezVar, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        r7 = r4.d();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r13 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        r0 = defpackage.lii.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        r9.d++;
        r10.set(r11, r9.s(r3, r4, r5, r13, r7, r8));
        r9.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r7.d() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r0 = defpackage.lii.COLLECTED;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            int r1 = r12.a(r13)
            lhm r9 = r12.b(r1)
            r9.lock()
            lig r2 = r9.a     // Catch: java.lang.Throwable -> L86
            lgh r2 = r2.r     // Catch: java.lang.Throwable -> L86
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L86
            r9.l(r2)     // Catch: java.lang.Throwable -> L86
            int r2 = r9.b     // Catch: java.lang.Throwable -> L86
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f     // Catch: java.lang.Throwable -> L86
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L86
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L86
            r3 = r2
            lih r3 = (defpackage.lih) r3     // Catch: java.lang.Throwable -> L86
            r4 = r3
        L2e:
            if (r4 == 0) goto L7f
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L86
            int r2 = r4.a()     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L7a
            if (r5 == 0) goto L7a
            lig r2 = r9.a     // Catch: java.lang.Throwable -> L86
            lep r2 = r2.h     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.d(r13, r5)     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L7a
            lhv r7 = r4.d()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L54
            lii r0 = defpackage.lii.EXPLICIT     // Catch: java.lang.Throwable -> L86
        L52:
            r8 = r0
            goto L5d
        L54:
            boolean r1 = r7.d()     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L7f
            lii r0 = defpackage.lii.COLLECTED     // Catch: java.lang.Throwable -> L86
            goto L52
        L5d:
            int r0 = r9.d     // Catch: java.lang.Throwable -> L86
            int r0 = r0 + 1
            r9.d = r0     // Catch: java.lang.Throwable -> L86
            r2 = r9
            r6 = r13
            lih r0 = r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L86
            int r1 = r9.b     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> L86
            r9.b = r1     // Catch: java.lang.Throwable -> L86
            r9.unlock()
            r9.m()
            r0 = r13
            goto L85
        L7a:
            lih r4 = r4.e()     // Catch: java.lang.Throwable -> L86
            goto L2e
        L7f:
            r9.unlock()
            r9.m()
        L85:
            return r0
        L86:
            r13 = move-exception
            r9.unlock()
            r9.m()
            goto L8f
        L8e:
            throw r13
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        jdg.u(obj);
        jdg.u(obj2);
        int a2 = a(obj);
        lhm b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.r.a();
            b2.l(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            lih lihVar = (lih) atomicReferenceArray.get(length);
            lih lihVar2 = lihVar;
            while (true) {
                if (lihVar2 == null) {
                    break;
                }
                Object j = lihVar2.j();
                if (lihVar2.a() != a2 || j == null || !b2.a.h.d(obj, j)) {
                    lihVar2 = lihVar2.e();
                } else {
                    lhv d = lihVar2.d();
                    Object obj3 = d.get();
                    if (obj3 != null) {
                        b2.d++;
                        b2.q(obj, obj3, d.a(), lii.REPLACED);
                        b2.t(lihVar2, obj2, a3);
                        b2.g(lihVar2);
                        return obj3;
                    } else if (d.d()) {
                        int i = b2.b;
                        b2.d++;
                        atomicReferenceArray.set(length, b2.s(lihVar, lihVar2, j, null, d, lii.COLLECTED));
                        b2.b--;
                    }
                }
            }
            return null;
        } finally {
            b2.unlock();
            b2.m();
        }
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        long j = 0;
        for (lhm lhmVar : this.f) {
            j += Math.max(0, lhmVar.b);
        }
        return mhq.m(j);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection values() {
        Collection collection = this.u;
        if (collection != null) {
            return collection;
        }
        lhw lhwVar = new lhw(this);
        this.u = lhwVar;
        return lhwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        r7 = r4.d();
        r13 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r9.a.i.d(r14, r13) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        r14 = defpackage.lii.EXPLICIT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        r9.d++;
        r10.set(r11, r9.s(r3, r4, r5, r6, r7, r14));
        r9.b--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r14 != defpackage.lii.EXPLICIT) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r13 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r7.d() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        r14 = defpackage.lii.COLLECTED;
        r13 = null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L9a
            if (r14 != 0) goto L7
            goto L9a
        L7:
            int r1 = r12.a(r13)
            lhm r9 = r12.b(r1)
            r9.lock()
            lig r2 = r9.a     // Catch: java.lang.Throwable -> L92
            lgh r2 = r2.r     // Catch: java.lang.Throwable -> L92
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L92
            r9.l(r2)     // Catch: java.lang.Throwable -> L92
            int r2 = r9.b     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.f     // Catch: java.lang.Throwable -> L92
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L92
            int r2 = r2 + (-1)
            r11 = r1 & r2
            java.lang.Object r2 = r10.get(r11)     // Catch: java.lang.Throwable -> L92
            r3 = r2
            lih r3 = (defpackage.lih) r3     // Catch: java.lang.Throwable -> L92
            r4 = r3
        L31:
            if (r4 == 0) goto L8b
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> L92
            int r2 = r4.a()     // Catch: java.lang.Throwable -> L92
            if (r2 != r1) goto L86
            if (r5 == 0) goto L86
            lig r2 = r9.a     // Catch: java.lang.Throwable -> L92
            lep r2 = r2.h     // Catch: java.lang.Throwable -> L92
            boolean r2 = r2.d(r13, r5)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L86
            lhv r7 = r4.d()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r13 = r7.get()     // Catch: java.lang.Throwable -> L92
            lig r1 = r9.a     // Catch: java.lang.Throwable -> L92
            lep r1 = r1.i     // Catch: java.lang.Throwable -> L92
            boolean r14 = r1.d(r14, r13)     // Catch: java.lang.Throwable -> L92
            if (r14 == 0) goto L5f
            lii r14 = defpackage.lii.EXPLICIT     // Catch: java.lang.Throwable -> L92
        L5d:
            r6 = r13
            goto L6b
        L5f:
            if (r13 != 0) goto L8b
            boolean r13 = r7.d()     // Catch: java.lang.Throwable -> L92
            if (r13 == 0) goto L8b
            lii r14 = defpackage.lii.COLLECTED     // Catch: java.lang.Throwable -> L92
            r13 = 0
            goto L5d
        L6b:
            int r13 = r9.d     // Catch: java.lang.Throwable -> L92
            r1 = 1
            int r13 = r13 + r1
            r9.d = r13     // Catch: java.lang.Throwable -> L92
            r2 = r9
            r8 = r14
            lih r13 = r2.s(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L92
            int r2 = r9.b     // Catch: java.lang.Throwable -> L92
            int r2 = r2 + (-1)
            r10.set(r11, r13)     // Catch: java.lang.Throwable -> L92
            r9.b = r2     // Catch: java.lang.Throwable -> L92
            lii r13 = defpackage.lii.EXPLICIT     // Catch: java.lang.Throwable -> L92
            if (r14 != r13) goto L8b
            r0 = 1
            goto L8b
        L86:
            lih r4 = r4.e()     // Catch: java.lang.Throwable -> L92
            goto L31
        L8b:
            r9.unlock()
            r9.m()
            return r0
        L92:
            r13 = move-exception
            r9.unlock()
            r9.m()
            throw r13
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        jdg.u(obj);
        jdg.u(obj3);
        if (obj2 == null) {
            return false;
        }
        int a2 = a(obj);
        lhm b2 = b(a2);
        b2.lock();
        try {
            long a3 = b2.a.r.a();
            b2.l(a3);
            AtomicReferenceArray atomicReferenceArray = b2.f;
            int length = a2 & (atomicReferenceArray.length() - 1);
            lih lihVar = (lih) atomicReferenceArray.get(length);
            lih lihVar2 = lihVar;
            while (true) {
                if (lihVar2 == null) {
                    break;
                }
                Object j = lihVar2.j();
                if (lihVar2.a() != a2 || j == null || !b2.a.h.d(obj, j)) {
                    lihVar2 = lihVar2.e();
                } else {
                    lhv d = lihVar2.d();
                    Object obj4 = d.get();
                    if (obj4 == null) {
                        if (d.d()) {
                            int i = b2.b;
                            b2.d++;
                            atomicReferenceArray.set(length, b2.s(lihVar, lihVar2, j, null, d, lii.COLLECTED));
                            b2.b--;
                        }
                    } else if (b2.a.i.d(obj2, obj4)) {
                        b2.d++;
                        b2.q(obj, obj4, d.a(), lii.REPLACED);
                        b2.t(lihVar2, obj3, a3);
                        b2.g(lihVar2);
                        b2.unlock();
                        b2.m();
                        return true;
                    } else {
                        b2.j(lihVar2, a3);
                    }
                }
            }
            return false;
        } finally {
            b2.unlock();
            b2.m();
        }
    }
}
