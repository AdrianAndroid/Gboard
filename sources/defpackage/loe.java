package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: loe  reason: default package */
/* loaded from: classes.dex */
final class loe extends Enum implements Iterator, j$.util.Iterator {
    public static final loe a;
    private static final /* synthetic */ loe[] b;

    static {
        loe loeVar = new loe();
        a = loeVar;
        b = new loe[]{loeVar};
    }

    private loe() {
    }

    public static loe[] values() {
        return (loe[]) b.clone();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        jez.V(false);
    }
}
