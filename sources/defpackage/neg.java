package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: neg  reason: default package */
/* loaded from: classes2.dex */
abstract class neg implements Iterator, nei {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
