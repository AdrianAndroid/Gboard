package defpackage;

/* compiled from: PG */
/* renamed from: gso  reason: default package */
/* loaded from: classes.dex */
public final class gso {
    public final boolean a;
    public final boolean b;

    public gso() {
    }

    public gso(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static gsn a() {
        return new gsn();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gso) {
            gso gsoVar = (gso) obj;
            if (this.a == gsoVar.a && this.b == gsoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        return "AccessPointsSetting{openedOnZeroState=" + z + ", inputBoxHasContent=" + z2 + "}";
    }
}
