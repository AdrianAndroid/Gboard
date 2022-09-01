package defpackage;

/* compiled from: PG */
/* renamed from: cla  reason: default package */
/* loaded from: classes.dex */
public final class cla {
    public final lmz a;
    public final int b;

    public cla(lmz lmzVar, int i) {
        if (lmzVar != null) {
            this.a = lmzVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null packFiles");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cla) {
            cla claVar = (cla) obj;
            if (this.a.equals(claVar.a) && this.b == claVar.b) {
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
        return "VersionedPacks{packFiles=" + obj + ", manifestVersion=" + i + "}";
    }

    public cla() {
    }
}
