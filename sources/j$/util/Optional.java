package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    private Optional(Object obj) {
        this.a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        Object obj = (Object) this.a;
        if (obj != 0) {
            consumer.accept(obj);
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        return !isPresent() ? empty() : ofNullable(function.apply((Object) this.a));
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.a;
        return t != null ? t : supplier.get();
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
