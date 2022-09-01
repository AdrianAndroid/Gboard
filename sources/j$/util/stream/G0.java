package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G0 extends E {
    final /* synthetic */ BiConsumer h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(EnumC0056p1 enumC0056p1, C0012b c0012b, C0012b c0012b2, C0012b c0012b3) {
        super(enumC0056p1);
        this.h = c0012b;
        this.i = c0012b2;
        this.j = c0012b3;
    }

    @Override // j$.util.stream.E
    public final L0 I() {
        return new H0(this.j, this.i, this.h);
    }
}
