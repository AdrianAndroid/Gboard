package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: klh  reason: default package */
/* loaded from: classes.dex */
public final class klh {
    public final String a;
    private final List b;

    public klh() {
    }

    public klh(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String[] a() {
        return (String[]) this.b.toArray(new String[0]);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klh) {
            klh klhVar = (klh) obj;
            if (this.a.equals(klhVar.a) && this.b.equals(klhVar.b)) {
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
        String obj = this.b.toString();
        return "SafeSql{query=" + str + ", queryArgs=" + obj + "}";
    }
}
