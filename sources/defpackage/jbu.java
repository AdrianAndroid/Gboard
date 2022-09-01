package defpackage;

/* compiled from: PG */
/* renamed from: jbu  reason: default package */
/* loaded from: classes.dex */
public final class jbu {
    public static final jbu a = a().f();
    public final boolean b;
    public final lmz c;

    public jbu() {
    }

    public jbu(boolean z, lmz lmzVar) {
        this.b = z;
        this.c = lmzVar;
    }

    public static jsy a() {
        jsy jsyVar = new jsy();
        jsyVar.a = (byte) (jsyVar.a | 1);
        jsyVar.g(false);
        jsyVar.h(lrr.a);
        return jsyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbu) {
            jbu jbuVar = (jbu) obj;
            if (this.b == jbuVar.b && this.c.equals(jbuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.b ? 1237 : 1231) ^ 385623362) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        return "VoiceCapabilities{noCapitalization=false, noPunctuation=" + z + ", supportedKeycodes=" + valueOf + "}";
    }
}
