package defpackage;

/* compiled from: PG */
/* renamed from: gkg  reason: default package */
/* loaded from: classes.dex */
public final class gkg {
    private final Long a;
    private final int b;

    public gkg() {
    }

    public gkg(Long l, int i) {
        this.a = l;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gkg) {
            gkg gkgVar = (gkg) obj;
            if (this.a.equals(gkgVar.a) && this.b == gkgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        Long l = this.a;
        String num = Integer.toString(ndb.ai(this.b));
        return "VerificationFailureKey{protoId=" + l + ", verificationFailure=" + num + "}";
    }
}
