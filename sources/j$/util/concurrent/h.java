package j$.util.concurrent;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h extends a implements Iterator, Enumeration, j$.util.Iterator {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(lVarArr, i, i2, concurrentHashMap);
        this.k = i3;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                l lVar = this.b;
                if (lVar != null) {
                    this.j = lVar;
                    c();
                    return lVar.b;
                }
                throw new NoSuchElementException();
            default:
                l lVar2 = this.b;
                if (lVar2 != null) {
                    Object obj = lVar2.c;
                    this.j = lVar2;
                    c();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
