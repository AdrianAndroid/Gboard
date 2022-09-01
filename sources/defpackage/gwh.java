package defpackage;

/* compiled from: PG */
/* renamed from: gwh  reason: default package */
/* loaded from: classes.dex */
public final class gwh {
    public final String a;
    public final long b;

    public gwh() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gwh) {
            gwh gwhVar = (gwh) obj;
            if (this.a.equals(gwhVar.a) && this.b == gwhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("OS", this.a);
        long j = this.b;
        S.b("versionCode", j + "");
        return S.toString();
    }

    public gwh(String str, long j) {
        if (str != null) {
            this.a = str;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null osVersion");
    }
}
