package j$.util.function;

import j$.util.Objects;
import j$.util.function.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Predicate c;

    public /* synthetic */ k(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Predicate predicate = this.c;
        Predicate predicate2 = this.b;
        switch (i) {
            case 0:
                if (!predicate2.test(obj) || !predicate.test(obj)) {
                    return false;
                }
                return true;
            default:
                if (!predicate2.test(obj) && !predicate.test(obj)) {
                    return false;
                }
                return true;
        }
    }
}
