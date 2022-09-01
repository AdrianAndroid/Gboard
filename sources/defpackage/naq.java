package defpackage;

/* compiled from: PG */
/* renamed from: naq  reason: default package */
/* loaded from: classes2.dex */
public final class naq implements nap {
    private final int a;

    public naq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof naq) && this.a == ((naq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return "ExpressionIndex(index=" + i + ")";
    }
}
