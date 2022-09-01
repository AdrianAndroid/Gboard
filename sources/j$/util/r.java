package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public interface r {
    int characteristics();

    long estimateSize();

    boolean f(Consumer consumer);

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    r trySplit();
}
