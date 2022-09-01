package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lsa  reason: default package */
/* loaded from: classes.dex */
final class lsa extends lim {
    final Iterator a;
    final /* synthetic */ lsb b;

    public lsa(lsb lsbVar) {
        this.b = lsbVar;
        this.a = lsbVar.a.iterator();
    }

    @Override // defpackage.lim
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
