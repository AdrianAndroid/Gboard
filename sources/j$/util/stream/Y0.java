package j$.util.stream;

/* loaded from: classes3.dex */
final class Y0 extends V0 {
    long b;
    long c;
    final /* synthetic */ Z0 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(Z0 z0, X0 x0) {
        super(x0);
        this.d = z0;
        this.b = z0.s;
        long j = z0.t;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 <= 0) {
            return;
        }
        this.c = j2 - 1;
        this.a.accept((X0) obj);
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        long j2 = this.d.s;
        long j3 = this.c;
        long j4 = -1;
        if (j >= 0) {
            j4 = Math.max(-1L, Math.min(j - j2, j3));
        }
        this.a.c(j4);
    }

    @Override // j$.util.stream.V0, j$.util.stream.X0
    public final boolean e() {
        return this.c == 0 || this.a.e();
    }
}
