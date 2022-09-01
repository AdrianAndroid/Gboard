package j$.util.stream;

/* renamed from: j$.util.stream.i  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0033i extends V0 {
    public final /* synthetic */ int b = 1;
    boolean c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033i(P0 p0, X0 x0) {
        super(x0);
        this.d = p0;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        X0 x0 = this.a;
        switch (i) {
            case 0:
                if (obj == null) {
                    if (!this.c) {
                        this.c = true;
                        obj = null;
                    } else {
                        return;
                    }
                } else {
                    Object obj2 = this.d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                }
                this.d = obj;
                x0.accept((X0) obj);
                return;
            default:
                Stream stream = (Stream) ((P0) this.d).t.apply(obj);
                if (stream != null) {
                    try {
                        if (!this.c) {
                            ((Stream) stream.sequential()).forEach(x0);
                        } else {
                            j$.util.r spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!x0.e() && spliterator.f(x0)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        int i = this.b;
        X0 x0 = this.a;
        switch (i) {
            case 0:
                this.c = false;
                this.d = null;
                x0.c(-1L);
                return;
            default:
                x0.c(-1L);
                return;
        }
    }

    @Override // j$.util.stream.V0, j$.util.stream.X0
    public final boolean e() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.V0, j$.util.stream.X0
    public final void j() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.j();
                return;
            default:
                super.j();
                return;
        }
    }

    public C0033i(X0 x0) {
        super(x0);
    }
}
