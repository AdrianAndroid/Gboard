package defpackage;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lmb  reason: default package */
/* loaded from: classes.dex */
public final class lmb extends lsz {
    final lsz a;
    final /* synthetic */ lme b;

    public lmb(lme lmeVar) {
        this.b = lmeVar;
        this.a = lmeVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.a.next()).getValue();
    }
}
