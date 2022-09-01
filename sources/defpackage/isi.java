package defpackage;

/* compiled from: PG */
/* renamed from: isi  reason: default package */
/* loaded from: classes.dex */
public final class isi {
    public final isc a;
    public final ish b;

    public isi() {
    }

    public isi(isc iscVar, ish ishVar) {
        this.a = iscVar;
        this.b = ishVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof isi) {
            isi isiVar = (isi) obj;
            if (this.a.equals(isiVar.a) && this.b.equals(isiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "TaskRunnerCallbackTuple{taskRunner=" + obj + ", callback=" + obj2 + "}";
    }
}
