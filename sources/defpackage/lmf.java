package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lmf  reason: default package */
/* loaded from: classes.dex */
public final class lmf extends lsz {
    final Iterator a;
    Object b = null;
    Iterator c = loc.a;
    final /* synthetic */ lmn d;

    public lmf(lmn lmnVar) {
        this.d = lmnVar;
        this.a = lmnVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((llg) entry.getValue()).iterator();
        }
        return lre.u(Objects.requireNonNull(this.b), this.c.next());
    }
}
