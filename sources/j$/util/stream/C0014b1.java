package j$.util.stream;

import j$.util.function.IntFunction;

/* renamed from: j$.util.stream.b1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0014b1 extends AbstractC0018d {
    private final AbstractC0015c j;
    private final IntFunction k;
    private final long l;
    private final long m;
    private long n;
    private volatile boolean o;

    C0014b1(C0014b1 c0014b1, j$.util.r rVar) {
        super(c0014b1, rVar);
        this.j = c0014b1.j;
        this.k = c0014b1.k;
        this.l = c0014b1.l;
        this.m = c0014b1.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0014b1(AbstractC0015c abstractC0015c, AbstractC0015c abstractC0015c2, j$.util.r rVar, IntFunction intFunction, long j, long j2) {
        super(abstractC0015c2, rVar);
        this.j = abstractC0015c;
        this.k = intFunction;
        this.l = j;
        this.m = j2;
    }

    private long k(long j) {
        if (this.o) {
            return this.n;
        }
        C0014b1 c0014b1 = (C0014b1) this.d;
        C0014b1 c0014b12 = (C0014b1) this.e;
        if (c0014b1 == null || c0014b12 == null) {
            return this.n;
        }
        long k = c0014b1.k(j);
        return k >= j ? k : k + c0014b12.k(j);
    }

    @Override // j$.util.stream.AbstractC0024f
    protected final Object a() {
        boolean z;
        if (d() == null) {
            z = true;
        } else {
            z = false;
        }
        long j = -1;
        if (z) {
            if (EnumC0053o1.SIZED.e(this.j.j)) {
                j = this.j.C(this.b);
            }
            I H = this.j.H(j, this.k);
            X0 Z = this.j.Z(this.a.F(), H);
            E e = this.a;
            e.A(this.b, e.L(Z));
            return H.mo62build();
        }
        I H2 = this.j.H(-1L, this.k);
        if (this.l == 0) {
            X0 Z2 = this.j.Z(this.a.F(), H2);
            E e2 = this.a;
            e2.A(this.b, e2.L(Z2));
        } else {
            this.a.K(this.b, H2);
        }
        N mo62build = H2.mo62build();
        this.n = mo62build.count();
        this.o = true;
        this.b = null;
        return mo62build;
    }

    @Override // j$.util.stream.AbstractC0024f
    protected final AbstractC0024f e(j$.util.r rVar) {
        return new C0014b1(this, rVar);
    }

    @Override // j$.util.stream.AbstractC0018d
    protected final void h() {
        this.i = true;
        if (this.o) {
            f(j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0018d
    /* renamed from: l */
    public final AbstractC0031h0 j() {
        return E.B(this.j.R());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // j$.util.stream.AbstractC0024f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0014b1.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
