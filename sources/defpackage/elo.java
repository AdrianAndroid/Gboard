package defpackage;

/* compiled from: PG */
/* renamed from: elo  reason: default package */
/* loaded from: classes.dex */
public final class elo {
    public final hhl a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public elo() {
    }

    public elo(hhl hhlVar, int i, boolean z, int i2, int i3) {
        this.a = hhlVar;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elo) {
            elo eloVar = (elo) obj;
            if (this.a.equals(eloVar.a) && this.b == eloVar.b && this.c == eloVar.c && this.d == eloVar.d && this.e == eloVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        int i2 = this.d;
        int i3 = this.e;
        return "TallViewConfig{enableFlag=" + valueOf + ", strategy=" + i + ", isTallViewEnabled=" + z + ", expressionTallViewExtraHeight=" + i2 + ", contentSuggestionStripHeight=" + i3 + "}";
    }
}
