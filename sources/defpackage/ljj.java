package defpackage;

/* compiled from: PG */
/* renamed from: ljj  reason: default package */
/* loaded from: classes.dex */
abstract class ljj implements lrj {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lrj)) {
            return false;
        }
        return b().equals(((lrj) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
