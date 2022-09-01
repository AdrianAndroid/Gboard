package j$.util.stream;

import j$.util.function.BinaryOperator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class U extends AbstractC0024f {
    protected final E h;
    protected final j$.util.function.j i;
    protected final BinaryOperator j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(E e, j$.util.r rVar, j$.util.function.j jVar, C0012b c0012b) {
        super(e, rVar);
        this.h = e;
        this.i = jVar;
        this.j = c0012b;
    }

    U(U u, j$.util.r rVar) {
        super(u, rVar);
        this.h = u.h;
        this.i = u.i;
        this.j = u.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final Object a() {
        j$.util.r rVar = this.b;
        E e = this.h;
        I i = (I) this.i.apply(e.C(rVar));
        e.K(this.b, i);
        return i.mo62build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0024f
    public final AbstractC0024f e(j$.util.r rVar) {
        return new U(this, rVar);
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
            f((N) this.j.apply((N) ((U) abstractC0024f).c(), (N) ((U) this.e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
