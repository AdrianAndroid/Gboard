package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lqg  reason: default package */
/* loaded from: classes.dex */
final class lqg extends lsz {
    final /* synthetic */ Iterator a;

    public lqg(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        jdg.u(entry);
        return new lqf(entry);
    }
}
