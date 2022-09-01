package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0054p extends AbstractC0018d {
    private final C0042l j;
    private final boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0054p(C0042l c0042l, boolean z, E e, j$.util.r rVar) {
        super(e, rVar);
        this.k = z;
        this.j = c0042l;
    }

    C0054p(C0054p c0054p, j$.util.r rVar) {
        super(c0054p, rVar);
        this.k = c0054p.k;
        this.j = c0054p.j;
    }

    @Override // j$.util.stream.AbstractC0024f
    protected final Object a() {
        boolean z;
        Q1 q1 = (Q1) this.j.d.get();
        this.a.K(this.b, q1);
        Object obj = q1.get();
        AtomicReference atomicReference = this.h;
        if (!this.k) {
            if (obj != null) {
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            C0054p c0054p = this;
            while (true) {
                if (c0054p != null) {
                    AbstractC0024f d = c0054p.d();
                    if (d != null && d.d != c0054p) {
                        z = false;
                        break;
                    }
                    c0054p = d;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            } else {
                i();
            }
            return obj;
        }
    }

    @Override // j$.util.stream.AbstractC0024f
    protected final AbstractC0024f e(j$.util.r rVar) {
        return new C0054p(this, rVar);
    }

    @Override // j$.util.stream.AbstractC0018d
    protected final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.AbstractC0024f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        AtomicReference atomicReference;
        if (this.k) {
            C0054p c0054p = (C0054p) this.d;
            C0054p c0054p2 = null;
            while (true) {
                if (c0054p == c0054p2) {
                    break;
                }
                Object c = c0054p.c();
                if (c != null && this.j.c.test(c)) {
                    f(c);
                    C0054p c0054p3 = this;
                    while (true) {
                        if (c0054p3 != null) {
                            AbstractC0024f d = c0054p3.d();
                            if (d != null && d.d != c0054p3) {
                                z = false;
                                break;
                            }
                            c0054p3 = d;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        do {
                            atomicReference = this.h;
                            if (atomicReference.compareAndSet(null, c)) {
                                break;
                            }
                        } while (atomicReference.get() == null);
                    } else {
                        i();
                    }
                } else {
                    c0054p2 = c0054p;
                    c0054p = (C0054p) this.e;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
