package defpackage;

/* compiled from: PG */
/* renamed from: cyr  reason: default package */
/* loaded from: classes.dex */
public final class cyr {
    public final llw a;

    public cyr(llw llwVar) {
        if (llwVar != null) {
            this.a = llwVar;
            return;
        }
        throw new NullPointerException("Null media");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cyr)) {
            return false;
        }
        return this.a.equals(((cyr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "TenorMediaCollection{media=" + obj + "}";
    }

    public cyr() {
    }
}
