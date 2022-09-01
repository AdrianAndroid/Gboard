package j$.util.stream;

/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0070v0 extends AbstractC0074x0 implements W0 {
    private final int[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0070v0(j$.util.r rVar, E e, int[] iArr) {
        super(rVar, e, iArr.length);
        this.h = iArr;
    }

    C0070v0(C0070v0 c0070v0, j$.util.r rVar, long j, long j2) {
        super(c0070v0, rVar, j, j2, c0070v0.h.length);
        this.h = c0070v0.h;
    }

    @Override // j$.util.stream.AbstractC0074x0
    final AbstractC0074x0 a(j$.util.r rVar, long j, long j2) {
        return new C0070v0(this, rVar, j, j2);
    }

    @Override // j$.util.stream.AbstractC0074x0, j$.util.stream.X0
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 < this.g) {
            this.f = i2 + 1;
            this.h[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        E.d(this, num);
    }
}
