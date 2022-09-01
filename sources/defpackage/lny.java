package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lny  reason: default package */
/* loaded from: classes.dex */
public final class lny extends lim {
    final /* synthetic */ Iterator a;
    final /* synthetic */ lfe b;

    public lny(Iterator it, lfe lfeVar) {
        this.a = it;
        this.b = lfeVar;
    }

    @Override // defpackage.lim
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
