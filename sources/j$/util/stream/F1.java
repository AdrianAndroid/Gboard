package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class F1 extends H1 implements j$.util.r, Consumer {
    Object f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F1(j$.util.r rVar, long j, long j2) {
        super(rVar, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F1(j$.util.r rVar, F1 f1) {
        super(rVar, f1);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (n() != G1.NO_MORE && this.a.f(this)) {
            if (m(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0061r1 c0061r1 = null;
        while (true) {
            G1 n = n();
            if (n != G1.NO_MORE) {
                G1 g1 = G1.MAYBE_MORE;
                j$.util.r rVar = this.a;
                if (n == g1) {
                    int i = this.c;
                    if (c0061r1 == null) {
                        c0061r1 = new C0061r1(i);
                    } else {
                        c0061r1.a = 0;
                    }
                    long j = 0;
                    while (rVar.f(c0061r1)) {
                        j++;
                        if (j >= i) {
                            break;
                        }
                    }
                    if (j == 0) {
                        return;
                    }
                    long m = m(j);
                    for (int i2 = 0; i2 < m; i2++) {
                        consumer.accept(c0061r1.b[i2]);
                    }
                } else {
                    rVar.forEachRemaining(consumer);
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.r
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0002b.h(this);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0002b.j(this, i);
    }
}
