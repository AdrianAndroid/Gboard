package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lmg  reason: default package */
/* loaded from: classes.dex */
public final class lmg extends lsz {
    final Iterator a;
    Iterator b = loc.a;
    final /* synthetic */ lmn c;

    public lmg(lmn lmnVar) {
        this.c = lmnVar;
        this.a = lmnVar.map.values().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((llg) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
