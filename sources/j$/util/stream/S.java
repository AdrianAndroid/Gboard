package j$.util.stream;

import j$.util.AbstractC0003c;
import j$.util.Collection$EL;
import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S implements N {
    private final Collection a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.N
    /* renamed from: a */
    public final N mo61a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.N
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.N
    public final void forEach(Consumer consumer) {
        Collection<Object> collection = this.a;
        if (collection instanceof AbstractC0003c) {
            ((AbstractC0003c) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.stream.N
    public final void i(Object[] objArr, int i) {
        for (Object obj : this.a) {
            objArr[i] = obj;
            i++;
        }
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ int k() {
        return 0;
    }

    @Override // j$.util.stream.N
    public final Object[] l(IntFunction intFunction) {
        Collection collection = this.a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ N m(long j, long j2, IntFunction intFunction) {
        return E.q(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.N
    /* renamed from: spliterator */
    public final j$.util.r mo59spliterator() {
        return Collection$EL.stream(this.a).spliterator();
    }

    public final String toString() {
        Collection collection = this.a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
