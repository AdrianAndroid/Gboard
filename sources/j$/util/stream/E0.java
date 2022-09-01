package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Supplier;
import j$.util.stream.Collector;

/* loaded from: classes3.dex */
final class E0 extends E {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(EnumC0056p1 enumC0056p1, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC0056p1);
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.E
    public final L0 I() {
        return new F0(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.E, j$.util.stream.P1
    public final int b() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC0053o1.p;
        }
        return 0;
    }
}
