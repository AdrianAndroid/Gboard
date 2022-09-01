package j$.util.stream;

import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Collectors {
    static final Set a;
    static final Set b;
    static final Set c = Collections.emptySet();

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0027g(supplier, new C0012b(14), new C0012b(2), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C0027g(new C0012b(15), new C0012b(16), new C0012b(3), b);
    }
}
