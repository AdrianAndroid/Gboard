package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface N {
    /* renamed from: a */
    N mo61a(int i);

    long count();

    void forEach(Consumer consumer);

    void i(Object[] objArr, int i);

    int k();

    Object[] l(IntFunction intFunction);

    N m(long j, long j2, IntFunction intFunction);

    /* renamed from: spliterator */
    j$.util.r mo59spliterator();
}
