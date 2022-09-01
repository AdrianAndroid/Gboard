package j$.util.function;

import j$.util.Objects;
import j$.util.function.BiFunction;
import j$.util.function.IntPredicate;
import j$.util.function.Predicate;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements BinaryOperator, IntPredicate, Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return Objects.requireNonNull(intPredicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 2:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        if (((Comparator) this.b).compare(obj, obj2) < 0) {
            return obj2;
        }
        return obj;
    }

    @Override // j$.util.function.IntPredicate
    /* renamed from: negate */
    public final /* synthetic */ IntPredicate mo33negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.IntPredicate
    /* renamed from: negate  reason: collision with other method in class */
    public final /* synthetic */ Predicate mo33negate() {
        switch (this.a) {
            case 2:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return Objects.requireNonNull(intPredicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 2:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.IntPredicate
    public final boolean test(int i) {
        return !((IntPredicate) this.b).test(i);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                return obj2.equals(obj);
            default:
                return !((Predicate) obj2).test(obj);
        }
    }
}
