package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class B0 extends CountedCompleter {
    protected final N a;
    protected final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(B0 b0, N n, int i) {
        super(b0);
        this.a = n;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B0(N n) {
        this.a = n;
        this.b = 0;
    }

    abstract void a();

    abstract A0 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        B0 b0 = this;
        while (b0.a.k() != 0) {
            N n = b0.a;
            b0.setPendingCount(n.k() - 1);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int k = n.k() - 1;
                i = b0.b + i2;
                if (i3 < k) {
                    A0 b = b0.b(i3, i);
                    i2 = (int) (i2 + b.a.count());
                    b.fork();
                    i3++;
                }
            }
            b0 = b0.b(i3, i);
        }
        b0.a();
        b0.propagateCompletion();
    }
}
