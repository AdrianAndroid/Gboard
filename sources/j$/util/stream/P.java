package j$.util.stream;

/* loaded from: classes3.dex */
abstract class P implements N {
    protected final N a;
    protected final N b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(N n, N n2) {
        this.a = n;
        this.b = n2;
        this.c = n.count() + n2.count();
    }

    @Override // j$.util.stream.N
    /* renamed from: a */
    public /* bridge */ /* synthetic */ M mo61a(int i) {
        return (M) mo61a(i);
    }

    @Override // j$.util.stream.N
    /* renamed from: a  reason: collision with other method in class */
    public final N mo61a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.b;
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.N
    public final int k() {
        return 2;
    }
}
