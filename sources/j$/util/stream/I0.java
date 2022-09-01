package j$.util.stream;

/* loaded from: classes3.dex */
final class I0 extends E {
    /* JADX INFO: Access modifiers changed from: package-private */
    public I0(EnumC0056p1 enumC0056p1) {
        super(enumC0056p1);
    }

    @Override // j$.util.stream.E
    public final L0 I() {
        return new N0();
    }

    @Override // j$.util.stream.E, j$.util.stream.P1
    public final Object a(E e, j$.util.r rVar) {
        return EnumC0053o1.SIZED.d(e.F()) ? Long.valueOf(rVar.getExactSizeIfKnown()) : (Long) super.a(e, rVar);
    }

    @Override // j$.util.stream.E, j$.util.stream.P1
    public final int b() {
        return EnumC0053o1.p;
    }

    @Override // j$.util.stream.E, j$.util.stream.P1
    public final Object f(E e, j$.util.r rVar) {
        return EnumC0053o1.SIZED.d(e.F()) ? Long.valueOf(rVar.getExactSizeIfKnown()) : (Long) super.f(e, rVar);
    }
}
