package defpackage;

/* compiled from: PG */
/* renamed from: azh  reason: default package */
/* loaded from: classes.dex */
final class azh {
    public final String a;

    public azh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azh) {
            return this.a.equals(((azh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "StringHeaderFactory{value='" + str + "'}";
    }
}
