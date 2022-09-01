package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bgf  reason: default package */
/* loaded from: classes.dex */
public class bgf {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public bgf(long j) {
        this.b = j;
        this.c = j;
    }

    private final void b() {
        k(this.c);
    }

    protected int a(Object obj) {
        return 1;
    }

    protected void c(Object obj, Object obj2) {
    }

    public final synchronized long e() {
        return this.c;
    }

    public final synchronized Object f(Object obj) {
        krm krmVar = (krm) this.a.get(obj);
        if (krmVar != null) {
            return krmVar.b;
        }
        return null;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int a = a(obj2);
        long j = a;
        if (j >= this.c) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        krm krmVar = (krm) this.a.put(obj, obj2 == null ? null : new krm(obj2, a));
        if (krmVar != null) {
            this.d -= krmVar.a;
            if (!krmVar.b.equals(obj2)) {
                c(obj, krmVar.b);
            }
        }
        b();
        if (krmVar == null) {
            return null;
        }
        return krmVar.b;
    }

    public final synchronized Object h(Object obj) {
        krm krmVar = (krm) this.a.remove(obj);
        if (krmVar == null) {
            return null;
        }
        this.d -= krmVar.a;
        return krmVar.b;
    }

    public final void i() {
        k(0L);
    }

    public final synchronized void j(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.c = Math.round(((float) this.b) * f);
        b();
    }

    public final synchronized void k(long j) {
        while (this.d > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            krm krmVar = (krm) entry.getValue();
            this.d -= krmVar.a;
            Object key = entry.getKey();
            it.remove();
            c(key, krmVar.b);
        }
    }
}
