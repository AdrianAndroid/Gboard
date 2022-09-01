package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: bts  reason: default package */
/* loaded from: classes.dex */
public final class bts implements Iterator, j$.util.Iterator {
    public hln a;
    private final Iterator b;

    public bts(Iterator it) {
        this.b = it;
        a();
    }

    private final void a() {
        while (this.b.hasNext()) {
            hln hlnVar = (hln) this.b.next();
            this.a = hlnVar;
            CharSequence charSequence = hlnVar.a;
            if (charSequence != null && charSequence.toString().codePointCount(0, hlnVar.a.length()) == 1) {
                return;
            }
        }
        this.a = null;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        hln hlnVar = this.a;
        a();
        return hlnVar;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
