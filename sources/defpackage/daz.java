package defpackage;

/* compiled from: PG */
/* renamed from: daz  reason: default package */
/* loaded from: classes.dex */
public final class daz {
    public final day a;
    private final lfe b;

    public daz(int i, leq leqVar, his hisVar, lfe lfeVar) {
        this.a = new day(i, leqVar, hisVar);
        this.b = lfeVar;
    }

    public final int a() {
        return this.a.maxSize();
    }

    public final int b() {
        return this.a.size();
    }

    public final Object c(Object obj) {
        Object obj2;
        synchronized (this.a) {
            obj2 = this.a.get(obj);
            if (obj2 != null && this.b.a(obj2)) {
                this.a.remove(obj);
                obj2 = this.a.get(obj);
            }
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Cache miss and creator returned null");
    }

    public final void d() {
        this.a.evictAll();
    }

    public final void e(int i) {
        this.a.resize(i);
    }

    public final String toString() {
        return this.a.toString();
    }
}
