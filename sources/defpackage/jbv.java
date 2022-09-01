package defpackage;

/* compiled from: PG */
/* renamed from: jbv  reason: default package */
/* loaded from: classes.dex */
public final class jbv {
    public static final jbv a = a(false, false);
    public final boolean b;
    public final boolean c;

    public jbv() {
    }

    public jbv(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public static jbv a(boolean z, boolean z2) {
        return new jbv(z, z2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbv) {
            jbv jbvVar = (jbv) obj;
            if (this.b == jbvVar.b && this.c == jbvVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.b;
        boolean z2 = this.c;
        return "VoiceTextMode{addAlternates=" + z + ", replaceComposingText=" + z2 + "}";
    }
}
