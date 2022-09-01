package defpackage;

/* compiled from: PG */
/* renamed from: how  reason: default package */
/* loaded from: classes.dex */
final class how {
    private final ibz a;
    private final ice b;

    public how(ibz ibzVar, ice iceVar) {
        if (ibzVar != null) {
            this.a = ibzVar;
            if (iceVar != null) {
                this.b = iceVar;
                return;
            }
            throw new NullPointerException("Null keyboardViewType");
        }
        throw new NullPointerException("Null keyboardType");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static how a(ibz ibzVar, ice iceVar) {
        return new how(ibzVar, iceVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof how) {
            how howVar = (how) obj;
            if (this.a.equals(howVar.a) && this.b.equals(howVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a.l;
        String obj = this.b.toString();
        return "KeyboardTypeViewTypeTuple{keyboardType=" + str + ", keyboardViewType=" + obj + "}";
    }

    public how() {
    }
}
