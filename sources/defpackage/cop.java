package defpackage;

/* compiled from: PG */
/* renamed from: cop  reason: default package */
/* loaded from: classes.dex */
public final class cop {
    public final int a;

    public cop() {
    }

    public cop(int i) {
        this.a = i;
    }

    public static cop a(int i) {
        return new cop(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cop) && this.a == ((cop) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        return "TextResourceInfo{textId=" + i + "}";
    }
}
