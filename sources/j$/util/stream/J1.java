package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J1 extends AbstractC0059q1 {
    J1(E e, j$.util.r rVar, boolean z) {
        super(e, rVar, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(E e, C0009a c0009a, boolean z) {
        super(e, c0009a, z);
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean c = c();
        if (c) {
            C0044l1 c0044l1 = (C0044l1) this.h;
            long j = this.g;
            if (c0044l1.b == 0) {
                if (j < c0044l1.a) {
                    obj = c0044l1.d[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < c0044l1.count()) {
                for (int i = 0; i <= c0044l1.b; i++) {
                    long j2 = c0044l1.c[i];
                    Object[] objArr = c0044l1.e[i];
                    if (j < objArr.length + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return c;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            do {
            } while (f(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        e();
        Objects.requireNonNull(consumer);
        I1 i1 = new I1(consumer, 1);
        this.b.K(this.d, i1);
        this.i = true;
    }

    @Override // j$.util.stream.AbstractC0059q1
    final void h() {
        C0044l1 c0044l1 = new C0044l1();
        this.h = c0044l1;
        Objects.requireNonNull(c0044l1);
        this.e = this.b.L(new I1(c0044l1, 0));
        this.f = new C0009a(4, this);
    }

    @Override // j$.util.stream.AbstractC0059q1
    final AbstractC0059q1 j(j$.util.r rVar) {
        return new J1(this.b, rVar, this.a);
    }
}
