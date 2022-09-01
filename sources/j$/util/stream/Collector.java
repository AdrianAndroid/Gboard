package j$.util.stream;

import j$.util.Objects;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes3.dex */
public interface Collector<T, A, R> {

    /* renamed from: j$.util.stream.Collector$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T, A, R> {
        public static <T, A, R> Collector<T, A, R> of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            Objects.requireNonNull(supplier);
            Objects.requireNonNull(biConsumer);
            Objects.requireNonNull(binaryOperator);
            Objects.requireNonNull(function);
            Objects.requireNonNull(characteristicsArr);
            Set set = Collectors.c;
            if (characteristicsArr.length > 0) {
                EnumSet noneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(noneOf, characteristicsArr);
                set = Collections.unmodifiableSet(noneOf);
            }
            return new C0027g(supplier, biConsumer, binaryOperator, function, set);
        }
    }

    /* loaded from: classes3.dex */
    public enum Characteristics {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();
}
