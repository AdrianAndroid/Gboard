package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: lhm  reason: default package */
/* loaded from: classes.dex */
public final class lhm extends ReentrantLock {
    final lig a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;

    public lhm(lig ligVar, int i, long j, jez jezVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Queue queue;
        Queue queue2;
        this.a = ligVar;
        this.g = j;
        jdg.u(jezVar);
        AtomicReferenceArray r = r(i);
        this.e = (r.length() * 3) / 4;
        if (!ligVar.i()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = r;
        ReferenceQueue referenceQueue = null;
        this.h = ligVar.p() ? new ReferenceQueue() : null;
        this.i = ligVar.q() ? new ReferenceQueue() : referenceQueue;
        if (ligVar.o()) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = lig.c;
        }
        this.j = queue;
        if (ligVar.l()) {
            queue2 = new lie();
        } else {
            queue2 = lig.c;
        }
        this.l = queue2;
        this.m = ligVar.o() ? new lgw() : lig.c;
    }

    static final AtomicReferenceArray r(int i) {
        return new AtomicReferenceArray(i);
    }

    final lih a(lih lihVar, lih lihVar2) {
        if (lihVar.j() == null) {
            return null;
        }
        lhv d = lihVar.d();
        Object obj = d.get();
        if (obj == null && d.d()) {
            return null;
        }
        lih a = this.a.s.a(this, lihVar, lihVar2);
        a.p(d.b(this.i, obj, a));
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lih b(Object obj, int i, long j) {
        AtomicReferenceArray atomicReferenceArray;
        lih lihVar = (lih) this.f.get((atomicReferenceArray.length() - 1) & i);
        while (true) {
            if (lihVar == null) {
                lihVar = null;
                break;
            }
            if (lihVar.a() == i) {
                Object j2 = lihVar.j();
                if (j2 == null) {
                    n();
                } else if (this.a.h.d(obj, j2)) {
                    break;
                }
            }
            lihVar = lihVar.e();
        }
        if (lihVar == null) {
            return null;
        }
        if (!this.a.m(lihVar, j)) {
            return lihVar;
        }
        o(j);
        return null;
    }

    public final Object c(Object obj, int i) {
        try {
            if (this.b != 0) {
                long a = this.a.r.a();
                lih b = b(obj, i, a);
                if (b == null) {
                    return null;
                }
                Object obj2 = b.d().get();
                if (obj2 != null) {
                    if (this.a.k()) {
                        b.k(a);
                    }
                    this.j.add(b);
                    b.j();
                    jez jezVar = this.a.w;
                    return obj2;
                }
                n();
            }
            return null;
        } finally {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(Object obj, int i, Object obj2, boolean z) {
        int i2;
        AtomicReferenceArray atomicReferenceArray;
        int length;
        AtomicReferenceArray atomicReferenceArray2;
        lock();
        try {
            long a = this.a.r.a();
            l(a);
            if (this.b + 1 > this.e && (length = (atomicReferenceArray = this.f).length()) < 1073741824) {
                int i3 = this.b;
                AtomicReferenceArray r = r(length + length);
                this.e = (r.length() * 3) / 4;
                int length2 = r.length() - 1;
                int i4 = 0;
                while (i4 < length) {
                    lih lihVar = (lih) atomicReferenceArray.get(i4);
                    if (lihVar != null) {
                        lih e = lihVar.e();
                        int a2 = lihVar.a() & length2;
                        if (e == null) {
                            r.set(a2, lihVar);
                        } else {
                            lih lihVar2 = lihVar;
                            while (e != null) {
                                AtomicReferenceArray atomicReferenceArray3 = atomicReferenceArray;
                                int a3 = e.a() & length2;
                                int i5 = a3 != a2 ? a3 : a2;
                                if (a3 != a2) {
                                    lihVar2 = e;
                                }
                                e = e.e();
                                a2 = i5;
                                atomicReferenceArray = atomicReferenceArray3;
                            }
                            atomicReferenceArray2 = atomicReferenceArray;
                            r.set(a2, lihVar2);
                            while (lihVar != lihVar2) {
                                int a4 = lihVar.a() & length2;
                                lih a5 = a(lihVar, (lih) r.get(a4));
                                if (a5 != null) {
                                    r.set(a4, a5);
                                } else {
                                    k(lihVar);
                                    i3--;
                                }
                                lihVar = lihVar.e();
                            }
                            i4++;
                            atomicReferenceArray = atomicReferenceArray2;
                        }
                    }
                    atomicReferenceArray2 = atomicReferenceArray;
                    i4++;
                    atomicReferenceArray = atomicReferenceArray2;
                }
                this.f = r;
                this.b = i3;
            }
            AtomicReferenceArray atomicReferenceArray4 = this.f;
            int length3 = (atomicReferenceArray4.length() - 1) & i;
            lih lihVar3 = (lih) atomicReferenceArray4.get(length3);
            lih lihVar4 = lihVar3;
            while (true) {
                if (lihVar4 == null) {
                    this.d++;
                    lhd lhdVar = this.a.s;
                    jdg.u(obj);
                    lih c = lhdVar.c(this, obj, i, lihVar3);
                    t(c, obj2, a);
                    atomicReferenceArray4.set(length3, c);
                    this.b++;
                    g(c);
                    break;
                }
                Object j = lihVar4.j();
                if (lihVar4.a() != i || j == null || !this.a.h.d(obj, j)) {
                    lihVar4 = lihVar4.e();
                } else {
                    lhv d = lihVar4.d();
                    Object obj3 = d.get();
                    if (obj3 != null) {
                        if (z) {
                            j(lihVar4, a);
                        } else {
                            this.d++;
                            q(obj, obj3, d.a(), lii.REPLACED);
                            t(lihVar4, obj2, a);
                            g(lihVar4);
                        }
                        return obj3;
                    }
                    this.d++;
                    if (d.d()) {
                        q(obj, null, d.a(), lii.COLLECTED);
                        t(lihVar4, obj2, a);
                        i2 = this.b;
                    } else {
                        t(lihVar4, obj2, a);
                        i2 = this.b + 1;
                    }
                    this.b = i2;
                    g(lihVar4);
                }
            }
            return null;
        } finally {
            unlock();
            m();
        }
    }

    final void e() {
        while (true) {
            lih lihVar = (lih) this.j.poll();
            if (lihVar != null) {
                if (this.m.contains(lihVar)) {
                    this.m.add(lihVar);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void f() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhm.f():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (p(r0, r0.a(), defpackage.lii.SIZE) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.lih r6) {
        /*
            r5 = this;
            lig r0 = r5.a
            boolean r0 = r0.j()
            if (r0 != 0) goto L9
            return
        L9:
            r5.e()
            lhv r0 = r6.d()
            int r0 = r0.a()
            long r0 = (long) r0
            long r2 = r5.g
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L1c
            goto L28
        L1c:
            int r0 = r6.a()
            lii r1 = defpackage.lii.SIZE
            boolean r6 = r5.p(r6, r0, r1)
            if (r6 == 0) goto L66
        L28:
            long r0 = r5.c
            long r2 = r5.g
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L65
            java.util.Queue r6 = r5.m
            java.util.Iterator r6 = r6.iterator()
        L36:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            lih r0 = (defpackage.lih) r0
            lhv r1 = r0.d()
            int r1 = r1.a()
            if (r1 <= 0) goto L36
            int r6 = r0.a()
            lii r1 = defpackage.lii.SIZE
            boolean r6 = r5.p(r0, r6, r1)
            if (r6 == 0) goto L59
            goto L28
        L59:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L5f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            throw r6
        L65:
            return
        L66:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>()
            goto L6d
        L6c:
            throw r6
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhm.g(lih):void");
    }

    final void h(long j) {
        lih lihVar;
        lih lihVar2;
        e();
        do {
            lihVar = (lih) this.l.peek();
            if (lihVar == null || !this.a.m(lihVar, j)) {
                do {
                    lihVar2 = (lih) this.m.peek();
                    if (lihVar2 == null || !this.a.m(lihVar2, j)) {
                        return;
                    }
                } while (p(lihVar2, lihVar2.a(), lii.EXPIRED));
                throw new AssertionError();
            }
        } while (p(lihVar, lihVar.a(), lii.EXPIRED));
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            l(this.a.r.a());
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(lih lihVar, long j) {
        if (this.a.k()) {
            lihVar.k(j);
        }
        this.m.add(lihVar);
    }

    final void k(lih lihVar) {
        Object j = lihVar.j();
        lihVar.a();
        q(j, lihVar.d().get(), lihVar.d().a(), lii.COLLECTED);
        this.l.remove(lihVar);
        this.m.remove(lihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(long j) {
        if (tryLock()) {
            try {
                f();
                h(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (!isHeldByCurrentThread()) {
            lig ligVar = this.a;
            while (true) {
                lik likVar = (lik) ligVar.p.poll();
                if (likVar == null) {
                    return;
                }
                try {
                    ligVar.q.a(likVar);
                } catch (Throwable th) {
                    lig.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n() {
        if (tryLock()) {
            try {
                f();
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(long j) {
        if (tryLock()) {
            try {
                h(j);
            } finally {
                unlock();
            }
        }
    }

    final boolean p(lih lihVar, int i, lii liiVar) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = i & (atomicReferenceArray.length() - 1);
        lih lihVar2 = (lih) atomicReferenceArray.get(length);
        for (lih lihVar3 = lihVar2; lihVar3 != null; lihVar3 = lihVar3.e()) {
            if (lihVar3 == lihVar) {
                this.d++;
                lih s = s(lihVar2, lihVar3, lihVar3.j(), lihVar3.d().get(), lihVar3.d(), liiVar);
                int i2 = this.b;
                atomicReferenceArray.set(length, s);
                this.b = i2 - 1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(Object obj, Object obj2, int i, lii liiVar) {
        this.c -= i;
        int ordinal = liiVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            if (this.a.p == lig.c) {
                return;
            }
            this.a.p.offer(new lik(obj, obj2, liiVar));
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lih s(lih lihVar, lih lihVar2, Object obj, Object obj2, lhv lhvVar, lii liiVar) {
        q(obj, obj2, lhvVar.a(), liiVar);
        this.l.remove(lihVar2);
        this.m.remove(lihVar2);
        lhvVar.f();
        int i = this.b;
        lih e = lihVar2.e();
        while (lihVar != lihVar2) {
            lih a = a(lihVar, e);
            if (a == null) {
                k(lihVar);
                i--;
            } else {
                e = a;
            }
            lihVar = lihVar.e();
        }
        this.b = i;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(lih lihVar, Object obj, long j) {
        lhv lhsVar;
        lhv d = lihVar.d();
        this.a.m.a();
        jdg.G(true, "Weights must be non-negative");
        int ordinal = this.a.k.ordinal();
        if (ordinal == 0) {
            lhsVar = new lhs(obj);
        } else if (ordinal == 1) {
            lhsVar = new lhn(this.i, obj, lihVar);
        } else if (ordinal == 2) {
            lhsVar = new lia(this.i, obj, lihVar);
        } else {
            throw null;
        }
        lihVar.p(lhsVar);
        e();
        this.c++;
        if (this.a.k()) {
            lihVar.k(j);
        }
        if (this.a.n()) {
            lihVar.q(j);
        }
        this.m.add(lihVar);
        this.l.add(lihVar);
        d.e();
    }
}
