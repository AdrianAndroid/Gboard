package j$.util.concurrent.atomic;

import j$.util.function.UnaryOperator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class DesugarAtomicReference {
    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        boolean z;
        do {
            V v2 = atomicReference.get();
            v = (V) unaryOperator.apply(v2);
            while (true) {
                if (atomicReference.compareAndSet(v2, v)) {
                    z = true;
                    continue;
                    break;
                } else if (atomicReference.get() != v2) {
                    z = false;
                    continue;
                    break;
                }
            }
        } while (!z);
        return v;
    }
}
