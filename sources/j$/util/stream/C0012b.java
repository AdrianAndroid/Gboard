package j$.util.stream;

import j$.util.Objects;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0012b implements IntFunction, Function, BinaryOperator, Supplier, j$.util.function.j, Consumer, BiConsumer, Predicate, j$.util.function.f {
    public final /* synthetic */ int a;

    public /* synthetic */ C0012b(int i) {
        this.a = i;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Collection) obj).add(obj2);
                return;
            case 15:
            case 17:
            default:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 16:
                ((Set) obj).add(obj2);
                return;
            case 18:
                ((LinkedHashSet) obj).add(obj2);
                return;
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 20:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Objects.requireNonNull(biConsumer);
            case 15:
            case 17:
            default:
                return Objects.requireNonNull(biConsumer);
            case 16:
                return Objects.requireNonNull(biConsumer);
            case 18:
                return Objects.requireNonNull(biConsumer);
        }
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen  reason: collision with other method in class */
    public final /* synthetic */ Function mo40andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Object[i];
            case 6:
                int i2 = r.h;
                return new Object[i];
            case 7:
                return new Integer[i];
            default:
                return new Object[i];
        }
    }

    @Override // j$.util.function.j
    public final Object apply(long j) {
        return E.G(j);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        Set set = Collectors.a;
        return obj;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 4:
                return new C0045m();
            case 5:
                return new C0048n();
            case 15:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 20:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 20:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 20:
                return ((OptionalInt) obj).isPresent();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ BiFunction mo40andThen(Function function) {
        switch (this.a) {
            case 2:
                return Objects.requireNonNull(function);
            case 3:
                return Objects.requireNonNull(function);
            case 10:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                Collection collection = (Collection) obj;
                Set set = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 3:
                Set set2 = (Set) obj;
                Set set3 = (Set) obj2;
                Set set4 = Collectors.a;
                if (set2.size() < set3.size()) {
                    set3.addAll(set2);
                    return set3;
                }
                set2.addAll(set3);
                return set2;
            case 10:
                return new W((K) obj, (K) obj2);
            default:
                return new Z((N) obj, (N) obj2);
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Objects.requireNonNull(consumer);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }
}
