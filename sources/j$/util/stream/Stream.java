package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.ToIntFunction;
import java.util.Comparator;

/* loaded from: classes3.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* renamed from: j$.util.stream.Stream$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T> {
        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            boolean z;
            Objects.requireNonNull(stream);
            Objects.requireNonNull(stream2);
            M1 m1 = new M1(stream.spliterator(), stream2.spliterator());
            if (!stream.isParallel() && !stream2.isParallel()) {
                z = false;
            } else {
                z = true;
            }
            AbstractC0015c abstractC0015c = (AbstractC0015c) E.J(m1, z);
            abstractC0015c.V(new K1(1, stream, stream2));
            return (Stream) abstractC0015c;
        }

        public static <T> Stream<T> of(T t) {
            return E.J(new O1(t), false);
        }
    }

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> distinct();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer<? super T> consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    Optional<T> max(Comparator<? super T> comparator);

    <A> A[] toArray(IntFunction<A[]> intFunction);
}
