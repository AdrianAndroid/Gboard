package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.g  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0027g implements Collector {
    private final Supplier a;
    private final BiConsumer b;
    private final BinaryOperator c;
    private final Function d;
    private final Set e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0027g(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0027g(Supplier supplier, C0012b c0012b, C0012b c0012b2, Set set) {
        this(supplier, c0012b, c0012b2, new C0012b(1), set);
        Set set2 = Collectors.a;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }
}
