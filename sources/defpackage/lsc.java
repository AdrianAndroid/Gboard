package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: lsc  reason: default package */
/* loaded from: classes.dex */
final class lsc extends lim {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ lsd c;

    public lsc(lsd lsdVar, Iterator it, Iterator it2) {
        this.c = lsdVar;
        this.a = it;
        this.b = it2;
    }

    @Override // defpackage.lim
    public final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (!this.c.b.contains(next)) {
                return next;
            }
        }
        while (this.b.hasNext()) {
            Object next2 = this.b.next();
            if (!this.c.a.contains(next2)) {
                return next2;
            }
        }
        b();
        return null;
    }
}
