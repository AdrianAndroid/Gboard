package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: lka  reason: default package */
/* loaded from: classes.dex */
final class lka extends lje {
    final /* synthetic */ lkc a;
    private final Object b;
    private int c;

    public lka(lkc lkcVar, int i) {
        this.a = lkcVar;
        this.b = lkcVar.h(i);
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i == -1 || i >= this.a.size() || !jdg.W(this.b, this.a.h(this.c))) {
            this.c = this.a.f(this.b);
        }
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object getValue() {
        Map o = this.a.o();
        if (o != null) {
            return o.get(this.b);
        }
        a();
        int i = this.c;
        if (i != -1) {
            return this.a.k(i);
        }
        return null;
    }

    @Override // defpackage.lje, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map o = this.a.o();
        if (o != null) {
            return o.put(this.b, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            this.a.put(this.b, obj);
            return null;
        }
        Object k = this.a.k(i);
        this.a.u(this.c, obj);
        return k;
    }
}
