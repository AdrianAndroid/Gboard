package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: axw  reason: default package */
/* loaded from: classes.dex */
public final class axw implements axn {
    private final axs a;
    private final axv b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public axw() {
        this.a = new axs();
        this.b = new axv();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    private final axm f(Class cls) {
        axm axmVar = (axm) this.d.get(cls);
        if (axmVar == null) {
            if (cls.equals(int[].class)) {
                axmVar = new axt(0);
            } else if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
            } else {
                axmVar = new axt(1);
            }
            this.d.put(cls, axmVar);
        }
        return axmVar;
    }

    private final Object g(axu axuVar, Class cls) {
        axm f = f(cls);
        Object a = this.a.a(axuVar);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            i(f.a(a), cls);
        }
        return a == null ? f.c(axuVar.a) : a;
    }

    private final NavigableMap h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.c.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    private final void i(int i, Class cls) {
        NavigableMap h = h(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) h.get(valueOf);
        if (num == null) {
            String obj = toString();
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + obj);
        } else if (num.intValue() == 1) {
            h.remove(valueOf);
        } else {
            h.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private final void j(int i) {
        while (this.f > i) {
            Object b = this.a.b();
            ce.m(b);
            axm f = f(b.getClass());
            this.f -= f.a(b) * f.b();
            i(f.a(b), b.getClass());
        }
    }

    @Override // defpackage.axn
    public final synchronized Object a(int i, Class cls) {
        axu d;
        Integer num = (Integer) h(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2 && num.intValue() > i * 8) {
            }
            d = this.b.d(num.intValue(), cls);
        }
        d = this.b.d(i, cls);
        return g(d, cls);
    }

    @Override // defpackage.axn
    public final synchronized void b() {
        j(0);
    }

    @Override // defpackage.axn
    public final synchronized void c(Object obj) {
        Class<?> cls = obj.getClass();
        axm f = f(cls);
        int a = f.a(obj);
        int b = f.b() * a;
        int i = 1;
        if (b <= (this.e >> 1)) {
            axu d = this.b.d(a, cls);
            this.a.c(d, obj);
            NavigableMap h = h(cls);
            Integer num = (Integer) h.get(Integer.valueOf(d.a));
            Integer valueOf = Integer.valueOf(d.a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            h.put(valueOf, Integer.valueOf(i));
            this.f += b;
            j(this.e);
        }
    }

    @Override // defpackage.axn
    public final synchronized void d(int i) {
        if (i >= 40) {
            b();
        } else if (i < 20 && i != 15) {
        } else {
            j(this.e >> 1);
        }
    }

    @Override // defpackage.axn
    public final synchronized Object e(Class cls) {
        return g(this.b.d(8, cls), cls);
    }

    public axw(int i) {
        this.a = new axs();
        this.b = new axv();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
