package j$.util.function;

import j$.util.Objects;
import j$.util.concurrent.u;

/* loaded from: classes3.dex */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T, U, R> {
        public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
            Objects.requireNonNull(function);
            return new u(biFunction, function);
        }
    }

    <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t, U u);
}
