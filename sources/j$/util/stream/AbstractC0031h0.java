package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0031h0 implements N {
    @Override // j$.util.stream.N
    /* renamed from: a */
    public N mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.N
    public final long count() {
        return 0L;
    }

    public final void f(int i, Object obj) {
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final Object[] l(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.N
    public /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.q(this, j, j2, intFunction);
    }
}
