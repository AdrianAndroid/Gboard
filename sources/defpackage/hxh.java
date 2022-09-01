package defpackage;

/* compiled from: PG */
/* renamed from: hxh  reason: default package */
/* loaded from: classes.dex */
public final class hxh {
    public final ice a;
    public final int b;
    private final ibz c;

    public hxh(ibz ibzVar, ice iceVar, int i) {
        this.c = ibzVar;
        if (iceVar != null) {
            this.a = iceVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null keyboardViewType");
    }

    public static hxh a(ibz ibzVar, ice iceVar, int i) {
        return new hxh(ibzVar, iceVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxh) {
            hxh hxhVar = (hxh) obj;
            ibz ibzVar = this.c;
            if (ibzVar != null ? ibzVar.equals(hxhVar.c) : hxhVar.c == null) {
                if (this.a.equals(hxhVar.a) && this.b == hxhVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String obj = this.a.toString();
        int i = this.b;
        return "SubViewInfo{keyboardType=" + valueOf + ", keyboardViewType=" + obj + ", subViewId=" + i + "}";
    }

    public hxh() {
    }

    public final int hashCode() {
        ibz ibzVar = this.c;
        return (((((ibzVar == null ? 0 : ibzVar.hashCode()) ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b;
    }
}
