package defpackage;

/* compiled from: PG */
/* renamed from: jwa  reason: default package */
/* loaded from: classes.dex */
public final class jwa {
    public final String a;
    public final long b;
    public final boolean c;

    public jwa(String str, long j, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = j;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public static jwa a(String str, long j, boolean z) {
        return new jwa(str, j, z);
    }

    public final void b() {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException("Operation is not supported in detached namespace: ".concat(this.a));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jwa) {
            jwa jwaVar = (jwa) obj;
            if (this.a.equals(jwaVar.a) && this.b == jwaVar.b && this.c == jwaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        boolean z = this.c;
        return "NamespaceInfo{name=" + str + ", quota=" + j + ", isDetached=" + z + "}";
    }

    public jwa() {
    }
}
