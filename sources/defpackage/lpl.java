package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lpl  reason: default package */
/* loaded from: classes.dex */
public class lpl extends ReentrantLock {
    final lqc a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final int f;
    final AtomicInteger g;

    public lpl(lqc lqcVar, int i) {
        this.g = new AtomicInteger();
        this.a = lqcVar;
        this.f = -1;
        AtomicReferenceArray o = o(i);
        int length = (o.length() * 3) / 4;
        this.d = length;
        if (length == -1) {
            this.d = length + 1;
        }
        this.e = o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(lpg lpgVar) {
        return lpgVar.d() == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void n(ReferenceQueue referenceQueue) {
        do {
        } while (referenceQueue.poll() != null);
    }

    static final AtomicReferenceArray o(int i) {
        return new AtomicReferenceArray(i);
    }

    final lpg a(lpg lpgVar, lpg lpgVar2) {
        return this.a.g.a(this, lpgVar, lpgVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lpg b(Object obj, int i) {
        if (this.b != 0) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            for (lpg lpgVar = (lpg) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); lpgVar != null; lpgVar = lpgVar.b()) {
                if (lpgVar.a() == i) {
                    Object c = lpgVar.c();
                    if (c == null) {
                        l();
                    } else if (this.a.f.d(obj, c)) {
                        return lpgVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lpg c(lpg lpgVar, lpg lpgVar2) {
        int i = this.b;
        lpg b = lpgVar2.b();
        while (lpgVar != lpgVar2) {
            lpg a = a(lpgVar, b);
            if (a == null) {
                i--;
            } else {
                b = a;
            }
            lpgVar = lpgVar.b();
        }
        this.b = i;
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object d(Object obj, int i, Object obj2, boolean z) {
        lock();
        try {
            j();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                AtomicReferenceArray atomicReferenceArray = this.e;
                int length = atomicReferenceArray.length();
                if (length < 1073741824) {
                    int i3 = this.b;
                    AtomicReferenceArray o = o(length + length);
                    this.d = (o.length() * 3) / 4;
                    int length2 = o.length() - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        lpg lpgVar = (lpg) atomicReferenceArray.get(i4);
                        if (lpgVar != null) {
                            lpg b = lpgVar.b();
                            int a = lpgVar.a() & length2;
                            if (b == null) {
                                o.set(a, lpgVar);
                            } else {
                                lpg lpgVar2 = lpgVar;
                                while (b != null) {
                                    int a2 = b.a() & length2;
                                    int i5 = a2 != a ? a2 : a;
                                    if (a2 != a) {
                                        lpgVar2 = b;
                                    }
                                    b = b.b();
                                    a = i5;
                                }
                                o.set(a, lpgVar2);
                                while (lpgVar != lpgVar2) {
                                    int a3 = lpgVar.a() & length2;
                                    lpg a4 = a(lpgVar, (lpg) o.get(a3));
                                    if (a4 != null) {
                                        o.set(a3, a4);
                                    } else {
                                        i3--;
                                    }
                                    lpgVar = lpgVar.b();
                                }
                            }
                        }
                    }
                    this.e = o;
                    this.b = i3;
                }
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            int length3 = (atomicReferenceArray2.length() - 1) & i;
            lpg lpgVar3 = (lpg) atomicReferenceArray2.get(length3);
            for (lpg lpgVar4 = lpgVar3; lpgVar4 != null; lpgVar4 = lpgVar4.b()) {
                Object c = lpgVar4.c();
                if (lpgVar4.a() == i && c != null && this.a.f.d(obj, c)) {
                    Object d = lpgVar4.d();
                    if (d == null) {
                        this.c++;
                        k(lpgVar4, obj2);
                        this.b = this.b;
                        return null;
                    } else if (z) {
                        return d;
                    } else {
                        this.c++;
                        k(lpgVar4, obj2);
                        return d;
                    }
                }
            }
            this.c++;
            lpg b2 = this.a.g.b(this, obj, i, lpgVar3);
            k(b2, obj2);
            atomicReferenceArray2.set(length3, b2);
            this.b = i2;
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            lpg lpgVar = (lpg) poll;
            lqc lqcVar = this.a;
            int a = lpgVar.a();
            lpl c = lqcVar.c(a);
            c.lock();
            try {
                int i2 = c.b;
                AtomicReferenceArray atomicReferenceArray = c.e;
                int length = a & (atomicReferenceArray.length() - 1);
                lpg lpgVar2 = (lpg) atomicReferenceArray.get(length);
                lpg lpgVar3 = lpgVar2;
                while (true) {
                    if (lpgVar3 == null) {
                        break;
                    } else if (lpgVar3 == lpgVar) {
                        c.c++;
                        atomicReferenceArray.set(length, c.c(lpgVar2, lpgVar3));
                        c.b--;
                        break;
                    } else {
                        lpgVar3 = lpgVar3.b();
                    }
                }
                c.unlock();
                i++;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } while (i != 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                return;
            }
            lpz lpzVar = (lpz) poll;
            lqc lqcVar = this.a;
            lpg a = lpzVar.a();
            int a2 = a.a();
            lpl c = lqcVar.c(a2);
            Object c2 = a.c();
            c.lock();
            try {
                int i2 = c.b;
                AtomicReferenceArray atomicReferenceArray = c.e;
                int length = (atomicReferenceArray.length() - 1) & a2;
                lpg lpgVar = (lpg) atomicReferenceArray.get(length);
                lpg lpgVar2 = lpgVar;
                while (true) {
                    if (lpgVar2 == null) {
                        break;
                    }
                    Object c3 = lpgVar2.c();
                    if (lpgVar2.a() != a2 || c3 == null || !c.a.f.d(c2, c3)) {
                        lpgVar2 = lpgVar2.b();
                    } else if (((lpy) lpgVar2).e() == lpzVar) {
                        c.c++;
                        atomicReferenceArray.set(length, c.c(lpgVar, lpgVar2));
                        c.b--;
                    }
                }
                c.unlock();
                i++;
            } catch (Throwable th) {
                c.unlock();
                throw th;
            }
        } while (i != 16);
    }

    public void g() {
    }

    public void h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        if ((this.g.incrementAndGet() & 63) == 0) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        if (tryLock()) {
            try {
                h();
                this.g.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(lpg lpgVar, Object obj) {
        this.a.g.e(this, lpgVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        if (tryLock()) {
            try {
                h();
            } finally {
                unlock();
            }
        }
    }

    public lpl(lqc lqcVar, int i, byte[] bArr) {
        this(lqcVar, i);
    }
}
