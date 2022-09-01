package defpackage;

/* compiled from: PG */
/* renamed from: jtx  reason: default package */
/* loaded from: classes.dex */
public final class jtx {
    public final String a;

    public jtx() {
    }

    public jtx(String str) {
        this.a = str;
    }

    public static jtx a(String str) {
        return new jtx(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jtx)) {
            return false;
        }
        String str = this.a;
        String str2 = ((jtx) obj).a;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String str = this.a;
        return str == null ? "" : str;
    }
}
