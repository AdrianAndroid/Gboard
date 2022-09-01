package j$.util.function;

/* loaded from: classes3.dex */
public interface IntPredicate {

    /* renamed from: j$.util.function.IntPredicate$-CC */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static IntPredicate $default$negate(IntPredicate intPredicate) {
            return new a(1, intPredicate);
        }
    }

    IntPredicate and(IntPredicate intPredicate);

    /* renamed from: negate */
    IntPredicate mo33negate();

    IntPredicate or(IntPredicate intPredicate);

    boolean test(int i);
}
