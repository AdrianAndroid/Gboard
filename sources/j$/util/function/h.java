package j$.util.function;

import j$.util.function.IntPredicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements IntPredicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntPredicate b;
    public final /* synthetic */ IntPredicate c;

    public /* synthetic */ h(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
        this.a = i;
        this.b = intPredicate;
        this.c = intPredicate2;
    }

    @Override // j$.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                return IntPredicate.CC.$default$and(this, intPredicate);
            default:
                return IntPredicate.CC.$default$and(this, intPredicate);
        }
    }

    @Override // j$.util.function.IntPredicate
    /* renamed from: negate */
    public final /* synthetic */ IntPredicate mo33negate() {
        switch (this.a) {
            case 0:
                return IntPredicate.CC.$default$negate(this);
            default:
                return IntPredicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        switch (this.a) {
            case 0:
                return IntPredicate.CC.$default$or(this, intPredicate);
            default:
                return IntPredicate.CC.$default$or(this, intPredicate);
        }
    }

    @Override // j$.util.function.IntPredicate
    public final boolean test(int i) {
        int i2 = this.a;
        IntPredicate intPredicate = this.c;
        IntPredicate intPredicate2 = this.b;
        switch (i2) {
            case 0:
                if (intPredicate2.test(i) || intPredicate.test(i)) {
                    return true;
                }
                return false;
            default:
                if (intPredicate2.test(i) && intPredicate.test(i)) {
                    return true;
                }
                return false;
        }
    }
}
