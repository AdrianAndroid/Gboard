package defpackage;

/* compiled from: PG */
/* renamed from: bgh  reason: default package */
/* loaded from: classes.dex */
public final class bgh {
    private Class a;
    private Class b;
    private Class c;

    public bgh() {
    }

    public bgh(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgh bghVar = (bgh) obj;
        return this.a.equals(bghVar.a) && this.b.equals(bghVar.b) && bgj.m(this.c, bghVar.c);
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "MultiClassKey{first=" + valueOf + ", second=" + valueOf2 + "}";
    }
}
