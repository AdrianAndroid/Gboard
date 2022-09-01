package defpackage;

/* compiled from: PG */
/* renamed from: htf  reason: default package */
/* loaded from: classes.dex */
public final class htf {
    public final hsy a;
    public final ibm b;

    public htf() {
    }

    public htf(hsy hsyVar, ibm ibmVar) {
        this.a = hsyVar;
        this.b = ibmVar;
    }

    public static htf a(hsy hsyVar, ibm ibmVar) {
        return new htf(hsyVar, ibmVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof htf) {
            htf htfVar = (htf) obj;
            if (this.a.equals(htfVar.a) && this.b.equals(htfVar.b)) {
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
        return "KeyboardDefTuple{keyboard=" + obj + ", keyboardDef=" + obj2 + "}";
    }
}
