package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lss  reason: default package */
/* loaded from: classes.dex */
public final class lss extends lim {
    final /* synthetic */ Iterator a;
    final /* synthetic */ lsu b;

    public lss(lsu lsuVar, Iterator it) {
        this.b = lsuVar;
        this.a = it;
    }

    @Override // defpackage.lim
    protected final /* bridge */ /* synthetic */ Object a() {
        while (this.a.hasNext()) {
            lsp lspVar = (lsp) this.a.next();
            if (lspVar.a().compareTo(this.b.a.a.c) < 0) {
                if (lspVar.b().compareTo(this.b.a.a.b) > 0) {
                    return lre.u(lspVar.a.h(this.b.a.a), lspVar.b);
                }
            } else {
                b();
                return null;
            }
        }
        b();
        return null;
    }
}
