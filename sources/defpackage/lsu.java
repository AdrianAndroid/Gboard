package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lsu  reason: default package */
/* loaded from: classes.dex */
public final class lsu extends AbstractMap {
    final /* synthetic */ lsv a;

    public lsu(lsv lsvVar) {
        this.a = lsvVar;
    }

    public final boolean a(lfe lfeVar) {
        ArrayList A = lre.A();
        for (Map.Entry entry : entrySet()) {
            if (lfeVar.a(entry)) {
                A.add((lrh) entry.getKey());
            }
        }
        int size = A.size();
        for (int i = 0; i < size; i++) {
            this.a.b.a((lrh) A.get(i));
        }
        return !A.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        lsv lsvVar = this.a;
        lsvVar.b.a(lsvVar.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new lsr(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        lsp lspVar;
        try {
            if (obj instanceof lrh) {
                lrh lrhVar = (lrh) obj;
                if (this.a.a.m(lrhVar) && !lrhVar.q()) {
                    if (lrhVar.b.compareTo(this.a.a.b) == 0) {
                        Map.Entry floorEntry = this.a.b.a.floorEntry(lrhVar.b);
                        lspVar = floorEntry != null ? (lsp) floorEntry.getValue() : null;
                    } else {
                        lspVar = (lsp) this.a.b.a.get(lrhVar.b);
                    }
                    if (lspVar != null && lspVar.a.p(this.a.a) && lspVar.a.h(this.a.a).equals(lrhVar)) {
                        return lspVar.b;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new lsq(this, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object obj2 = get(obj);
        if (obj2 != null) {
            this.a.b.a((lrh) Objects.requireNonNull(obj));
            return obj2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new lst(this, this);
    }
}
