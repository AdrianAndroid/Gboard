package defpackage;

/* compiled from: PG */
/* renamed from: nal  reason: default package */
/* loaded from: classes2.dex */
public final class nal implements nap {
    private final String a;
    private final String b;
    private final String c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nal(String str) {
        this(null, null, str);
        oll.e(str, "columnName");
    }

    public nal(String str, String str2, String str3) {
        oll.e(str3, "columnName");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nal)) {
            return false;
        }
        nal nalVar = (nal) obj;
        return oll.g(this.a, nalVar.a) && oll.g(this.b, nalVar.b) && oll.g(this.c, nalVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return nxp.w(nxp.z(new String[]{this.a, this.b, this.c}), ".", null, null, null, 62);
    }
}
