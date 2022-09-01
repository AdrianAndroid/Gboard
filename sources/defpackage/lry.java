package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lry  reason: default package */
/* loaded from: classes.dex */
final class lry extends lim {
    final Iterator a;
    final /* synthetic */ lrz b;

    public lry(lrz lrzVar) {
        this.b = lrzVar;
        this.a = lrzVar.a.iterator();
    }

    @Override // defpackage.lim
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.b.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
