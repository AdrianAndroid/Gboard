package j$.util.stream;

import java.util.ArrayDeque;

/* renamed from: j$.util.stream.p0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0055p0 extends AbstractC0060r0 implements j$.util.q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0055p0(M m) {
        super(m);
    }

    @Override // j$.util.q
    /* renamed from: forEachRemaining */
    public final void l(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            do {
            } while (k(obj));
            return;
        }
        j$.util.r rVar = this.c;
        if (rVar != null) {
            ((j$.util.q) rVar).forEachRemaining(obj);
            return;
        }
        ArrayDeque d = d();
        while (true) {
            M m = (M) AbstractC0060r0.c(d);
            if (m == null) {
                this.a = null;
                return;
            }
            m.g(obj);
        }
    }

    @Override // j$.util.q
    /* renamed from: tryAdvance */
    public final boolean k(Object obj) {
        M m;
        if (!e()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.q) this.d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.c == null && (m = (M) AbstractC0060r0.c(this.e)) != null) {
                j$.util.q mo59spliterator = m.mo59spliterator();
                this.d = mo59spliterator;
                return mo59spliterator.tryAdvance(obj);
            }
            this.a = null;
        }
        return tryAdvance;
    }
}
