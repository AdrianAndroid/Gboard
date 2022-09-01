package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lqk  reason: default package */
/* loaded from: classes.dex */
public final class lqk extends AbstractMap {
    final Iterable a;
    final /* synthetic */ lsw b;

    public lqk() {
    }

    public final Iterator a() {
        return this.a.iterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        lre.T(a());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new lqj(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof lrh) {
            lrh lrhVar = (lrh) obj;
            lsp lspVar = (lsp) this.b.a.get(lrhVar.b);
            if (lspVar != null && lspVar.a.equals(lrhVar)) {
                return lspVar.b;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b.a.size();
    }

    public lqk(lsw lswVar, Iterable iterable) {
        this.b = lswVar;
        this.a = iterable;
    }
}
