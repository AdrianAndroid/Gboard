package defpackage;

/* compiled from: PG */
/* renamed from: duc  reason: default package */
/* loaded from: classes.dex */
public final class duc {
    public final hpy a;
    public final boolean b;

    public duc(hpy hpyVar, boolean z) {
        if (hpyVar != null) {
            this.a = hpyVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null inputContext");
    }

    public static duc a(hpy hpyVar) {
        return b(hpyVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static duc b(hpy hpyVar, boolean z) {
        return new duc(hpyVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duc) {
            duc ducVar = (duc) obj;
            if (this.a.equals(ducVar.a) && this.b == ducVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.a.toString();
        boolean z = this.b;
        return "State{inputContext=" + obj + ", lastChangeWasPunctuationDeletion=" + z + "}";
    }

    public duc() {
    }
}
