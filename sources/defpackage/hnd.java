package defpackage;

/* compiled from: PG */
/* renamed from: hnd  reason: default package */
/* loaded from: classes.dex */
public final class hnd {
    public final CharSequence a;
    public final int b;
    public final int c;

    public hnd() {
    }

    public hnd(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
    }

    public static hnd a(CharSequence charSequence, int i, int i2) {
        return new hnd(charSequence, i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hnd) {
            hnd hndVar = (hnd) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(hndVar.a) : hndVar.a == null) {
                if (this.b == hndVar.b && this.c == hndVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return (((((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        return "DeleteAction{undoText=" + valueOf + ", numCharsBefore=" + i + ", numCharsAfter=" + i2 + "}";
    }
}
