package defpackage;

/* compiled from: PG */
/* renamed from: bxf  reason: default package */
/* loaded from: classes.dex */
public final class bxf {
    public final String a;
    public final int b;
    public final int c;

    public bxf(String str, int i, int i2) {
        if (str != null) {
            this.a = str;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxf) {
            bxf bxfVar = (bxf) obj;
            if (this.a.equals(bxfVar.a) && this.b == bxfVar.b && this.c == bxfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        return "WordInfo{text=" + str + ", startIndex=" + i + ", endIndex=" + i2 + "}";
    }

    public bxf() {
    }
}
