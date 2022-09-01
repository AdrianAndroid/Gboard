package j$.util.stream;

import j$.util.stream.BaseStream;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator<T> iterator();

    BaseStream sequential();

    j$.util.r spliterator();
}
