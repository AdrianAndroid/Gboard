package j$.util.function;

import j$.util.Objects;
import j$.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function, Predicate {
    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        return obj;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return obj == null;
    }
}
