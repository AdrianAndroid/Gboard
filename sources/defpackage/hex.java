package defpackage;

/* compiled from: PG */
/* renamed from: hex  reason: default package */
/* loaded from: classes.dex */
public final class hex {
    public final String a;
    public final int b;
    public final int c;

    public hex() {
    }

    public hex(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static hew a() {
        hew hewVar = new hew();
        hewVar.d("");
        hewVar.b(0);
        hewVar.c(0);
        return hewVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hex) {
            hex hexVar = (hex) obj;
            if (this.a.equals(hexVar.a) && this.b == hexVar.b && this.c == hexVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        return "EntityItem{text=" + str + ", entityType=" + i + ", start=" + i2 + "}";
    }
}
