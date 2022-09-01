package defpackage;

/* compiled from: PG */
/* renamed from: eip  reason: default package */
/* loaded from: classes.dex */
final class eip {
    public final String a;
    public final int b;

    public eip(String str, int i) {
        if (str != null) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null categoryId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eip) {
            eip eipVar = (eip) obj;
            if (this.a.equals(eipVar.a) && this.b == eipVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.a;
        String o = lwm.o(this.b);
        return "CategoryIdAndTabState{categoryId=" + str + ", tabState=" + o + "}";
    }

    public eip() {
    }
}
