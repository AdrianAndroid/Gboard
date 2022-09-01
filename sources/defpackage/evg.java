package defpackage;

/* compiled from: PG */
/* renamed from: evg  reason: default package */
/* loaded from: classes.dex */
public final class evg {
    public final boolean a;

    public evg() {
    }

    public evg(boolean z) {
        this.a = z;
    }

    public static haz a() {
        haz hazVar = new haz();
        hazVar.e(false);
        return hazVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof evg) && this.a == ((evg) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        return "TrainerConfig{shouldUseDebugConfig=" + z + "}";
    }
}
