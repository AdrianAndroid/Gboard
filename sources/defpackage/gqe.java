package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gqe  reason: default package */
/* loaded from: classes.dex */
public final class gqe {
    public final Map a = new EnumMap(iah.class);
    public final Map b = new HashMap();
    public llp c;
    public gqg d;
    public gqf e;
    public llw f;
    public doi g;
    private String h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private byte m;

    public final gqh a() {
        String str;
        llw llwVar = null;
        this.c = this.a.isEmpty() ? null : llp.o(this.a.values());
        if (!this.b.isEmpty()) {
            llwVar = llw.k(this.b);
        }
        this.f = llwVar;
        if (this.m != 15 || (str = this.h) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.h == null) {
                sb.append(" stringId");
            }
            if ((this.m & 1) == 0) {
                sb.append(" icon");
            }
            if ((this.m & 2) == 0) {
                sb.append(" label");
            }
            if ((this.m & 4) == 0) {
                sb.append(" contentDescription");
            }
            if ((this.m & 8) == 0) {
                sb.append(" hideOnDeviceLock");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gqh(str, this.i, this.j, this.k, this.l, this.c, this.d, this.e, this.g, this.f, null);
    }

    public final void b(String str, Object obj) {
        this.b.put(str, obj);
    }

    public final void c(ial ialVar) {
        this.a.put(ialVar.c, ialVar);
    }

    public final void d(int i) {
        this.k = i;
        this.m = (byte) (this.m | 4);
    }

    public final void e(boolean z) {
        this.l = z;
        this.m = (byte) (this.m | 8);
    }

    public final void f(int i) {
        this.i = i;
        this.m = (byte) (this.m | 1);
    }

    public final void g(int i) {
        this.j = i;
        this.m = (byte) (this.m | 2);
    }

    public final void h(iay iayVar) {
        iah iahVar = iah.PRESS;
        iaj c = ial.c();
        c.b = iahVar;
        c.c = new iay[]{iayVar};
        c(c.b());
    }

    public final void i(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null stringId");
    }

    public final void j() {
        this.a.clear();
        this.b.clear();
        i("");
        f(0);
        g(0);
        d(0);
        e(false);
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.f = null;
    }

    public final void k(int i, Object obj) {
        h(new iay(i, null, obj));
    }

    public final void l(Runnable runnable) {
        h(new iay(-40009, null, runnable));
    }
}
