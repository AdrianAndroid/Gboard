package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lmo  reason: default package */
/* loaded from: classes.dex */
final class lmo extends lsz {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public lmo(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            lqw lqwVar = (lqw) this.c.next();
            this.b = lqwVar.b();
            i = lqwVar.a();
        }
        this.a = i - 1;
        return Objects.requireNonNull(this.b);
    }
}
