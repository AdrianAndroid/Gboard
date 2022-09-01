package defpackage;

/* compiled from: PG */
/* renamed from: icn  reason: default package */
/* loaded from: classes.dex */
public final class icn {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final boolean d;

    public icn() {
    }

    public icn(int i, int i2, CharSequence charSequence, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = z;
    }

    public static kfp a() {
        kfp kfpVar = new kfp();
        kfpVar.g(false);
        return kfpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icn) {
            icn icnVar = (icn) obj;
            if (this.a == icnVar.a && this.b == icnVar.b && this.c.equals(icnVar.c) && this.d == icnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        return "ReplaceTextInfo{beforeLength=" + i + ", afterLength=" + i2 + ", newText=" + valueOf + ", composing=false, forwardToDecoder=" + z + "}";
    }
}
