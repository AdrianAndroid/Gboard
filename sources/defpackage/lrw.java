package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lrw  reason: default package */
/* loaded from: classes.dex */
final class lrw extends lim {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ lrx c;

    public lrw(lrx lrxVar) {
        this.c = lrxVar;
        this.a = lrxVar.a.iterator();
        this.b = lrxVar.b.iterator();
    }

    @Override // defpackage.lim
    protected final Object a() {
        if (!this.a.hasNext()) {
            while (this.b.hasNext()) {
                Object next = this.b.next();
                if (!this.c.a.contains(next)) {
                    return next;
                }
            }
            b();
            return null;
        }
        return this.a.next();
    }
}
