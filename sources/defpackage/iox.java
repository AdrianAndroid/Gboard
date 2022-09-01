package defpackage;

/* compiled from: PG */
/* renamed from: iox  reason: default package */
/* loaded from: classes.dex */
final class iox {
    public final ioy a;
    public final boolean b;
    public final boolean c;

    public iox(ioy ioyVar, boolean z, boolean z2) {
        if (ioyVar != null) {
            this.a = ioyVar;
            this.b = z;
            this.c = z2;
            return;
        }
        throw new NullPointerException("Null sqliteColumnType");
    }

    public static iox a(ioy ioyVar, boolean z, boolean z2) {
        return new iox(ioyVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iox) {
            iox ioxVar = (iox) obj;
            if (this.a.equals(ioxVar.a) && this.b == ioxVar.b && this.c == ioxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.a.toString();
        boolean z = this.b;
        boolean z2 = this.c;
        return "SQLiteColumnMetadata{sqliteColumnType=" + obj + ", primaryKey=" + z + ", nullable=" + z2 + "}";
    }

    public iox() {
    }
}
