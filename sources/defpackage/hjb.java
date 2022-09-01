package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hjb  reason: default package */
/* loaded from: classes.dex */
public final class hjb implements hja {
    private final Iterator a;

    public hjb(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return hiz.k((mko) this.a.next());
    }
}
