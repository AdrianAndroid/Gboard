package j$.util.function;

/* loaded from: classes3.dex */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T, R> {
        public static <T> Function<T, T> identity() {
            return new e();
        }
    }

    /* renamed from: andThen */
    <V> Function<T, V> mo40andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
