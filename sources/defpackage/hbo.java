package defpackage;

/* compiled from: PG */
/* renamed from: hbo  reason: default package */
/* loaded from: classes.dex */
final class hbo {
    public final int a;
    public final hcg b;
    public final knf c;

    public hbo(int i, knf knfVar, hcg hcgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.c = knfVar;
        if (hcgVar != null) {
            this.b = hcgVar;
            return;
        }
        throw new NullPointerException("Null delegate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbo) {
            hbo hboVar = (hbo) obj;
            if (this.a == hboVar.a && this.c.equals(hboVar.c) && this.b.equals(hboVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String obj = this.c.toString();
        String obj2 = this.b.toString();
        return "EmojiBodyViewInitParams{spanCount=" + i + ", recycledViewPool=" + obj + ", delegate=" + obj2 + "}";
    }

    public hbo() {
    }
}
