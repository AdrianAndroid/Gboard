package j$.util.concurrent;

import j$.util.Objects;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements BiConsumer, BiFunction, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.b).accept(obj);
        ((Consumer) this.c).accept(obj);
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(biConsumer);
            default:
                return Objects.requireNonNull(biConsumer);
        }
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    public /* synthetic */ u(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }
}
