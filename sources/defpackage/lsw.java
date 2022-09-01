package defpackage;

import java.util.Map;
import java.util.NavigableMap;

/* compiled from: PG */
/* renamed from: lsw  reason: default package */
/* loaded from: classes.dex */
public final class lsw implements lri {
    public final NavigableMap a = lre.w();

    private final void c(lkp lkpVar, lkp lkpVar2, Object obj) {
        this.a.put(lkpVar, new lsp(lrh.g(lkpVar, lkpVar2), obj));
    }

    public final void a(lrh lrhVar) {
        if (lrhVar.q()) {
            return;
        }
        Map.Entry lowerEntry = this.a.lowerEntry(lrhVar.b);
        if (lowerEntry != null) {
            lsp lspVar = (lsp) lowerEntry.getValue();
            if (lspVar.b().compareTo(lrhVar.b) > 0) {
                if (lspVar.b().compareTo(lrhVar.c) > 0) {
                    c(lrhVar.c, lspVar.b(), ((lsp) lowerEntry.getValue()).b);
                }
                c(lspVar.a(), lrhVar.b, ((lsp) lowerEntry.getValue()).b);
            }
        }
        Map.Entry lowerEntry2 = this.a.lowerEntry(lrhVar.c);
        if (lowerEntry2 != null) {
            lsp lspVar2 = (lsp) lowerEntry2.getValue();
            if (lspVar2.b().compareTo(lrhVar.c) > 0) {
                c(lrhVar.c, lspVar2.b(), ((lsp) lowerEntry2.getValue()).b);
            }
        }
        this.a.subMap(lrhVar.b, lrhVar.c).clear();
    }

    @Override // defpackage.lri
    public final Map b() {
        return new lqk(this, this.a.values());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lri) {
            return b().equals(((lri) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
