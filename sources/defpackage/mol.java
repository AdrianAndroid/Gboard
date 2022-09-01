package defpackage;

/* compiled from: PG */
/* renamed from: mol  reason: default package */
/* loaded from: classes2.dex */
public final class mol {
    public final String a;
    public final String b;

    public mol() {
    }

    public mol(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public static mol a(String str, String str2) {
        return new mol(str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mol) {
            mol molVar = (mol) obj;
            if (this.a.equals(molVar.a) && this.b.equals(molVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "LibraryVersion{libraryName=" + str + ", version=" + str2 + "}";
    }
}
