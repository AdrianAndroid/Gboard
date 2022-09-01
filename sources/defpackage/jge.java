package defpackage;

/* compiled from: PG */
/* renamed from: jge  reason: default package */
/* loaded from: classes.dex */
public final class jge {
    public final String a;

    public jge(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jge)) {
            return false;
        }
        return this.a.equals(((jge) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Zwieback";
    }

    public jge() {
    }
}
