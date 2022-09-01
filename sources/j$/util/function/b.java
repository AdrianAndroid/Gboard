package j$.util.function;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer {
    final /* synthetic */ java.util.function.Consumer a;

    private /* synthetic */ b(java.util.function.Consumer consumer) {
        this.a = consumer;
    }

    public static /* synthetic */ Consumer a(java.util.function.Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof Consumer.Wrapper ? Consumer.this : new b(consumer);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.a.accept(obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return a(this.a.andThen(Consumer.Wrapper.convert(consumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return this.a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
