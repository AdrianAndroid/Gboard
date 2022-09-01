package defpackage;

/* compiled from: PG */
/* renamed from: ftc  reason: default package */
/* loaded from: classes.dex */
public final class ftc {
    public final String a;

    public ftc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ftc) {
            return this.a.equals(((ftc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
