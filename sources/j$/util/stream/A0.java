package j$.util.stream;

/* loaded from: classes3.dex */
class A0 extends B0 {
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(M m, Object obj) {
        this(m, obj, 0);
        this.c = 0;
    }

    @Override // j$.util.stream.B0
    final void a() {
        int i = this.c;
        int i2 = this.b;
        Object obj = this.d;
        N n = this.a;
        switch (i) {
            case 0:
                ((M) n).f(i2, obj);
                return;
            default:
                n.i((Object[]) obj, i2);
                return;
        }
    }

    @Override // j$.util.stream.B0
    final A0 b(int i, int i2) {
        int i3 = this.c;
        N n = this.a;
        switch (i3) {
            case 0:
                return new A0(this, ((M) n).mo61a(i), i2);
            default:
                return new A0(this, n.mo61a(i), i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(N n, Object obj, int i) {
        super(n);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(N n, Object[] objArr) {
        this(n, objArr, 1);
        this.c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(A0 a0, M m, int i) {
        super(a0, m, i);
        this.c = 0;
        this.d = a0.d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(A0 a0, N n, int i) {
        super(a0, n, i);
        this.c = 1;
        this.d = (Object[]) a0.d;
    }
}
