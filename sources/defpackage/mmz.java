package defpackage;

/* compiled from: PG */
/* renamed from: mmz  reason: default package */
/* loaded from: classes2.dex */
public final class mmz {
    public final Class a;
    public final int b;
    private final int c;

    public mmz(Class cls, int i, int i2) {
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public static mmz a(Class cls) {
        return new mmz(cls, 1, 0);
    }

    public static mmz b(Class cls) {
        return new mmz(cls, 2, 0);
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean d() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mmz) {
            mmz mmzVar = (mmz) obj;
            if (this.a == mmzVar.a && this.b == mmzVar.b && this.c == mmzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }
}
