package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class d extends a implements Iterator, j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, concurrentHashMap);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        l lVar = this.b;
        if (lVar != null) {
            Object obj = lVar.b;
            Object obj2 = lVar.c;
            this.j = lVar;
            c();
            return new k(obj, obj2, this.i);
        }
        throw new NoSuchElementException();
    }
}
