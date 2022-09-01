package j$.util.stream;

import j$.util.AbstractC0002b;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class t1 implements j$.util.r, Consumer {
    private static final Object d = new Object();
    private final j$.util.r a;
    private final ConcurrentHashMap b;
    private Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t1(j$.util.r rVar) {
        this(rVar, new ConcurrentHashMap());
    }

    private t1(j$.util.r rVar, ConcurrentHashMap concurrentHashMap) {
        this.a = rVar;
        this.b = concurrentHashMap;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.c = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.r
    public final int characteristics() {
        return (this.a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.r
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.r
    public final boolean f(Consumer consumer) {
        while (this.a.f(this)) {
            Object obj = this.c;
            if (obj == null) {
                obj = d;
            }
            if (this.b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.c);
                this.c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.r
    public final void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(new C0030h(3, this, consumer));
    }

    @Override // j$.util.r
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.r
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0002b.h(this);
    }

    @Override // j$.util.r
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0002b.j(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(Consumer consumer, Object obj) {
        Object obj2;
        if (obj != null) {
            obj2 = obj;
        } else {
            obj2 = d;
        }
        if (this.b.putIfAbsent(obj2, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.r
    public final j$.util.r trySplit() {
        j$.util.r trySplit = this.a.trySplit();
        if (trySplit != null) {
            return new t1(trySplit, this.b);
        }
        return null;
    }
}
