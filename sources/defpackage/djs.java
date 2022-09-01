package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: djs  reason: default package */
/* loaded from: classes.dex */
public final class djs implements Iterator, j$.util.Iterator {
    private final Iterator a;
    private final HashSet b = new HashSet();
    private hln c;

    public djs(Iterator it) {
        this.a = it;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        hln hlnVar;
        if (this.c == null) {
            while (true) {
                if (!this.a.hasNext()) {
                    hlnVar = null;
                    break;
                }
                hlnVar = ((bty) this.a).next();
                if (!this.b.contains(hlnVar.a)) {
                    CharSequence charSequence = hlnVar.a;
                    if (charSequence != null) {
                        this.b.add(charSequence);
                    }
                }
            }
            this.c = hlnVar;
            return hlnVar != null;
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            hln hlnVar = this.c;
            this.c = null;
            return hlnVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
