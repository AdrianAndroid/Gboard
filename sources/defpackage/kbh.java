package defpackage;

/* compiled from: PG */
/* renamed from: kbh  reason: default package */
/* loaded from: classes.dex */
public final class kbh {
    public final String a;

    public kbh(String str) {
        this.a = str;
    }

    public static kbh a(String str) {
        return new kbh(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kbh) {
            return this.a.equals(((kbh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
