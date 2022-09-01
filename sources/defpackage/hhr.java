package defpackage;

import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hhr  reason: default package */
/* loaded from: classes.dex */
public final class hhr implements hhl {
    private static final int d = hie.values().length;
    public final String a;
    public final Class b;
    public volatile Object c;
    private final Object[] e;
    private Map f;
    private boolean g;

    public hhr(String str, Class cls) {
        this.a = str;
        this.b = cls;
        this.e = (Object[]) Array.newInstance(cls, d);
    }

    private final synchronized Object n() {
        Object obj;
        obj = null;
        for (int i = d - 1; i >= 0 && obj == null; i--) {
            obj = this.e[i];
        }
        return obj;
    }

    private static Object o(Object obj) {
        return obj instanceof byte[] ? lyk.d.i((byte[]) obj) : obj;
    }

    private final synchronized boolean p() {
        Object obj = this.c;
        this.c = n();
        if (obj == null || this.c == null || Objects.deepEquals(obj, this.c)) {
            return false;
        }
        j();
        return true;
    }

    @Override // defpackage.hhl
    public final Object a() {
        return b(hie.DEFAULT);
    }

    @Override // defpackage.hhl
    public final synchronized Object b(hie hieVar) {
        return this.e[hieVar.g];
    }

    @Override // defpackage.hhl
    public final Object c() {
        if (this.c != null) {
            return this.c;
        }
        throw new IllegalStateException("Invalid flag: ".concat(toString()));
    }

    @Override // defpackage.hhl
    public final String d() {
        return this.a;
    }

    @Override // defpackage.hhl
    public final synchronized void e(hhk hhkVar) {
        f(hhkVar, gyc.b);
    }

    @Override // defpackage.hhl
    public final synchronized void f(hhk hhkVar, Executor executor) {
        if (this.f == null) {
            this.f = new WeakHashMap();
        }
        this.f.put(hhkVar, executor);
    }

    @Override // defpackage.hhl
    public final synchronized void g(hhk hhkVar) {
        Map map = this.f;
        if (map == null) {
            return;
        }
        map.remove(hhkVar);
        if (!this.f.isEmpty()) {
            return;
        }
        this.f = null;
    }

    @Override // defpackage.hhl
    public final synchronized void h() {
        k(hie.OVERRIDE);
    }

    @Override // defpackage.hhl
    public final synchronized void i() {
        k(hie.PHENOTYPE);
    }

    final synchronized void j() {
        Map map = this.f;
        if (map != null) {
            Set<Map.Entry> entrySet = map.entrySet();
            lna lnaVar = new lna();
            for (Map.Entry entry : entrySet) {
                lnaVar.c(entry);
            }
            lnd f = lnaVar.f();
            lnd lndVar = f.b;
            if (lndVar == null) {
                lna g = lnd.g();
                lsz it = f.x().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    g.g(entry2.getValue(), entry2.getKey());
                }
                lndVar = g.f();
                lndVar.b = f;
                f.b = lndVar;
            }
            lsz it2 = lndVar.u().iterator();
            while (it2.hasNext()) {
                Executor executor = (Executor) it2.next();
                executor.execute(new gxi(this, lndVar.d(executor), 8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean k(hie hieVar) {
        if (hieVar != hie.DEFAULT) {
            Object[] objArr = this.e;
            int i = hieVar.g;
            if (objArr[i] == null) {
                return false;
            }
            objArr[i] = null;
            return p();
        }
        String str = this.a;
        throw new IllegalStateException("Clearing default value is disallowed [" + str + "].");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean l(Object obj, boolean z) {
        int i = hie.DEFAULT.g;
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        if (obj2 != null) {
            if (!Objects.deepEquals(obj2, obj)) {
                String str = this.a;
                throw new IllegalStateException("Resetting default value is disallowed [" + str + "].");
            }
            if (!z) {
                if (this.g) {
                    this.g = false;
                } else {
                    String str2 = this.a;
                    throw new IllegalStateException("Flag [" + str2 + "] was already created.");
                }
            }
            return false;
        }
        objArr[i] = obj;
        if (z) {
            this.g = true;
        }
        return p();
    }

    public final synchronized boolean m(hie hieVar, Object obj) {
        if (hieVar == hie.DEFAULT) {
            return l(obj, false);
        }
        this.e[hieVar.g] = obj;
        return p();
    }

    public final synchronized String toString() {
        lfa T;
        hie[] values;
        String simpleName = this.b.getSimpleName();
        T = jdg.T(this.a);
        T.b("type", simpleName);
        T.b("finalValue", o(this.c));
        for (hie hieVar : hie.values()) {
            Object b = b(hieVar);
            if (b != null) {
                T.b(hieVar.name(), o(b));
            }
        }
        return T.toString();
    }
}
