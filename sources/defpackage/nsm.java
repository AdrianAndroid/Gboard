package defpackage;

/* compiled from: PG */
/* renamed from: nsm  reason: default package */
/* loaded from: classes2.dex */
public final class nsm {
    public final nsl a;
    public final nvu b;

    public nsm(nsl nslVar, nvu nvuVar) {
        jdg.Q(nslVar, "state is null");
        this.a = nslVar;
        jdg.Q(nvuVar, "status is null");
        this.b = nvuVar;
    }

    public static nsm a(nsl nslVar) {
        jdg.w(nslVar != nsl.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new nsm(nslVar, nvu.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nsm)) {
            return false;
        }
        nsm nsmVar = (nsm) obj;
        return this.a.equals(nsmVar.a) && this.b.equals(nsmVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.k()) {
            return this.a.toString();
        }
        return this.a + "(" + this.b + ")";
    }
}
