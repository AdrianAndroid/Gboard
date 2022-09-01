package j$.util.stream;

import j$.util.function.BinaryOperator;

/* loaded from: classes3.dex */
final class C0 extends E {
    final /* synthetic */ BinaryOperator h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(EnumC0056p1 enumC0056p1, j$.util.function.a aVar) {
        super(enumC0056p1);
        this.h = aVar;
    }

    @Override // j$.util.stream.E
    public final L0 I() {
        return new D0(this.h);
    }
}
