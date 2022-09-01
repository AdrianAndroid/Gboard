package j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0018d extends AbstractC0024f {
    protected final AtomicReference h;
    protected volatile boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0018d(E e, j$.util.r rVar) {
        super(e, rVar);
        this.h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0018d(AbstractC0018d abstractC0018d, j$.util.r rVar) {
        super(abstractC0018d, rVar);
        this.h = abstractC0018d.h;
    }

    @Override // j$.util.stream.AbstractC0024f
    public final Object c() {
        boolean z;
        if (d() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj = this.h.get();
            if (obj == null) {
                return j();
            }
            return obj;
        }
        return super.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        r8 = r7.a();
     */
    @Override // j$.util.stream.AbstractC0024f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void compute() {
        /*
            r10 = this;
            j$.util.r r0 = r10.b
            long r1 = r0.estimateSize()
            long r3 = r10.c
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto Lf
            goto L15
        Lf:
            long r3 = j$.util.stream.AbstractC0024f.g(r1)
            r10.c = r3
        L15:
            java.util.concurrent.atomic.AtomicReference r5 = r10.h
            r6 = 0
            r7 = r10
        L19:
            java.lang.Object r8 = r5.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.i
            if (r8 != 0) goto L34
            j$.util.stream.f r9 = r7.d()
        L27:
            j$.util.stream.d r9 = (j$.util.stream.AbstractC0018d) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.i
            j$.util.stream.f r9 = r9.d()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.j()
            goto L6f
        L3b:
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L6b
            j$.util.r r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.f r2 = r7.e(r1)
            j$.util.stream.d r2 = (j$.util.stream.AbstractC0018d) r2
            r7.d = r2
            j$.util.stream.f r8 = r7.e(r0)
            j$.util.stream.d r8 = (j$.util.stream.AbstractC0018d) r8
            r7.e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r6 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r6 = r6 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.a()
        L6f:
            r7.f(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC0018d.compute():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final void f(Object obj) {
        boolean z;
        AtomicReference atomicReference;
        if (d() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (obj != null) {
                do {
                    atomicReference = this.h;
                    if (atomicReference.compareAndSet(null, obj)) {
                        return;
                    }
                } while (atomicReference.get() == null);
                return;
            }
            return;
        }
        super.f(obj);
    }

    @Override // j$.util.stream.AbstractC0024f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC0018d abstractC0018d = this;
        for (AbstractC0018d abstractC0018d2 = (AbstractC0018d) d(); abstractC0018d2 != null; abstractC0018d2 = (AbstractC0018d) abstractC0018d2.d()) {
            if (abstractC0018d2.d == abstractC0018d) {
                AbstractC0018d abstractC0018d3 = (AbstractC0018d) abstractC0018d2.e;
                if (!abstractC0018d3.i) {
                    abstractC0018d3.h();
                }
            }
            abstractC0018d = abstractC0018d2;
        }
    }

    protected abstract Object j();
}
