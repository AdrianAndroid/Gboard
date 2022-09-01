package j$.util.stream;

import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Y extends P implements M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y(M m, M m2) {
        super(m, m2);
    }

    @Override // j$.util.stream.M
    public final Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.M
    public final void f(int i, Object obj) {
        N n = this.a;
        ((M) n).f(i, obj);
        ((M) this.b).f(i + ((int) ((M) n).count()), obj);
    }

    @Override // j$.util.stream.M
    public final void g(Object obj) {
        ((M) this.a).g(obj);
        ((M) this.b).g(obj);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ Object[] l(IntFunction intFunction) {
        return E.g(this, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
