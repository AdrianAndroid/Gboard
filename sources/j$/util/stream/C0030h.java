package j$.util.stream;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0030h implements Consumer, Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0030h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 1:
            default:
                ((t1) obj3).m((Consumer) obj2, obj);
                return;
            case 2:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(consumer);
            case 1:
            default:
                return Objects.requireNonNull(consumer);
            case 2:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        return new A((Predicate) this.c, (B) this.b);
    }
}
