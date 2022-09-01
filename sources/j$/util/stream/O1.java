package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O1 extends L1 implements Consumer {
    Object b;
    C0044l1 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O1(Object obj) {
        this.b = obj;
        this.a = -2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else if (i <= 0) {
            throw new IllegalStateException();
        } else {
            if (this.c == null) {
                C0044l1 c0044l1 = new C0044l1();
                this.c = c0044l1;
                c0044l1.accept(this.b);
                this.a++;
            }
            this.c.accept(obj);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
            return true;
        }
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.a == -2) {
            consumer.accept(this.b);
            this.a = -1;
        }
    }
}
