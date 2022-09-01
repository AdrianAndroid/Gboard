package defpackage;

/* compiled from: PG */
/* renamed from: hjd  reason: default package */
/* loaded from: classes.dex */
public final class hjd {
    public final Object a;
    public final boolean b;

    public hjd(Object obj, boolean z) {
        if (obj != null) {
            this.a = obj;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public static hjd a(Object obj, boolean z) {
        return new hjd(obj, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hjd) {
            hjd hjdVar = (hjd) obj;
            if (this.a.equals(hjdVar.a) && this.b == hjdVar.b) {
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
        return "PageResult{result=" + obj + ", hasNext=" + z + "}";
    }

    public hjd() {
    }
}
