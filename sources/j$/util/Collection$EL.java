package j$.util;

import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.Collection;

/* renamed from: j$.util.Collection$-EL  reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Collection$EL {
    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof AbstractC0003c ? ((AbstractC0003c) collection).a(predicate) : AbstractC0002b.m(collection, predicate);
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof AbstractC0003c ? ((AbstractC0003c) collection).stream() : AbstractC0002b.n(collection);
    }
}
