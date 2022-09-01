package j$.util.function;

/* loaded from: classes3.dex */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$negate(Predicate predicate) {
            return new a(3, predicate);
        }

        public static <T> Predicate<T> isEqual(Object obj) {
            return obj == null ? new e() : new a(2, obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
