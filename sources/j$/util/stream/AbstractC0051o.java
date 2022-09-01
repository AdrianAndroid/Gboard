package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC0051o implements Q1 {
    boolean a;
    Object b;

    @Override // j$.util.stream.X0
    public /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        if (!this.a) {
            this.a = true;
            this.b = obj;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.X0
    public final boolean e() {
        return this.a;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }
}
