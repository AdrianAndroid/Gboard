package defpackage;

/* compiled from: PG */
/* renamed from: iyi  reason: default package */
/* loaded from: classes.dex */
public final class iyi {
    public final int a;
    public final String b;

    public iyi(int i, String str) {
        this.a = i;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null namespace");
    }

    public static iyi a(int i, String str) {
        return new iyi(i, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iyi) {
            iyi iyiVar = (iyi) obj;
            if (this.a == iyiVar.a && this.b.equals(iyiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        return "FeatureInfo{protoId=" + i + ", namespace=" + str + "}";
    }

    public iyi() {
    }
}
