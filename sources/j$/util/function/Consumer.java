package j$.util.function;

/* loaded from: classes3.dex */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T> {
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
            Consumer.this = r1;
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof b ? ((b) consumer).a : new Wrapper();
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.andThen(b.a(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof Wrapper) {
                obj = Consumer.this;
            }
            return Consumer.this.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return Consumer.this.hashCode();
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
