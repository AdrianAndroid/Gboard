package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O0 extends AbstractC0024f {
    private final E h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O0(E e, E e2, j$.util.r rVar) {
        super(e2, rVar);
        this.h = e;
    }

    O0(O0 o0, j$.util.r rVar) {
        super(o0, rVar);
        this.h = o0.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final Object a() {
        L0 I = this.h.I();
        this.a.K(this.b, I);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final AbstractC0024f e(j$.util.r rVar) {
        return new O0(this, rVar);
    }

    @Override // j$.util.stream.AbstractC0024f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        AbstractC0024f abstractC0024f = this.d;
        if (abstractC0024f == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            L0 l0 = (L0) ((O0) abstractC0024f).c();
            l0.h((L0) ((O0) this.e).c());
            f(l0);
        }
        super.onCompletion(countedCompleter);
    }
}
