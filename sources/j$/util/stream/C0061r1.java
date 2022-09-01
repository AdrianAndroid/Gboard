package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0061r1 extends AbstractC0064s1 implements Consumer {
    final Object[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0061r1(int i) {
        this.b = new Object[i];
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }
}
