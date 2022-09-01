package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntFunction;
import j$.util.function.IntPredicate;

/* loaded from: classes3.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* renamed from: j$.util.stream.IntStream$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.o c = j$.util.F.c();
                return new C0073x(c, EnumC0053o1.c(c));
            }
            N1 n1 = new N1(i, i2, 0);
            return new C0073x(n1, EnumC0053o1.c(n1));
        }
    }

    IntStream filter(IntPredicate intPredicate);

    OptionalInt findFirst();

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    int sum();

    int[] toArray();
}
