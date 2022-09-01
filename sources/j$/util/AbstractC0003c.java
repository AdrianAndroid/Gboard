package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;

/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface AbstractC0003c {
    boolean a(Predicate predicate);

    void forEach(Consumer consumer);

    r spliterator();

    Stream stream();
}
