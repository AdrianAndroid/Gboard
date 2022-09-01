package defpackage;

/* compiled from: PG */
/* renamed from: ckl  reason: default package */
/* loaded from: classes.dex */
final class ckl extends clo {
    private final cll a;

    public ckl(cll cllVar) {
        this.a = cllVar;
    }

    @Override // defpackage.clo
    public final cll b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof clo)) {
            return false;
        }
        return this.a.equals(((clo) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.a.toString();
        return "MappingUpdatedNotification{keywordMappings=" + obj + "}";
    }
}
