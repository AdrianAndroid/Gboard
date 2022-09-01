package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0072w0 extends AbstractC0074x0 {
    private final Object[] h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0072w0(j$.util.r rVar, E e, Object[] objArr) {
        super(rVar, e, objArr.length);
        this.h = objArr;
    }

    C0072w0(C0072w0 c0072w0, j$.util.r rVar, long j, long j2) {
        super(c0072w0, rVar, j, j2, c0072w0.h.length);
        this.h = c0072w0.h;
    }

    @Override // j$.util.stream.AbstractC0074x0
    final AbstractC0074x0 a(j$.util.r rVar, long j, long j2) {
        return new C0072w0(this, rVar, j, j2);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i < this.g) {
            this.f = i + 1;
            this.h[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f));
    }
}
