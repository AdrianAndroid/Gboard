package j$.util.stream;

import j$.util.function.Consumer;
import java.util.ArrayDeque;

/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0058q0 extends AbstractC0060r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0058q0(N n) {
        super(n);
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        N c;
        if (!e()) {
            return false;
        }
        boolean f = this.d.f(consumer);
        if (!f) {
            if (this.c == null && (c = AbstractC0060r0.c(this.e)) != null) {
                j$.util.r mo59spliterator = c.mo59spliterator();
                this.d = mo59spliterator;
                return mo59spliterator.f(consumer);
            }
            this.a = null;
        }
        return f;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            do {
            } while (f(consumer));
            return;
        }
        j$.util.r rVar = this.c;
        if (rVar != null) {
            rVar.forEachRemaining(consumer);
            return;
        }
        ArrayDeque d = d();
        while (true) {
            N c = AbstractC0060r0.c(d);
            if (c == null) {
                this.a = null;
                return;
            }
            c.forEach(consumer);
        }
    }
}
