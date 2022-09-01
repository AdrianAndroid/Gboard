package defpackage;

/* compiled from: PG */
/* renamed from: cug  reason: default package */
/* loaded from: classes.dex */
public final class cug {
    public final hiz a;
    public final int b;

    public cug(hiz hizVar, int i) {
        if (hizVar != null) {
            this.a = hizVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null loadModelFuture");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cug a(hiz hizVar, int i) {
        return new cug(hizVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cug) {
            cug cugVar = (cug) obj;
            if (this.a.equals(cugVar.a) && this.b == cugVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String obj = this.a.toString();
        int i = this.b;
        return "VersionedModelFuture{loadModelFuture=" + obj + ", manifestVersion=" + i + "}";
    }

    public cug() {
    }
}
