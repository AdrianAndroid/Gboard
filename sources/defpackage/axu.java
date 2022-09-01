package defpackage;

/* compiled from: PG */
/* renamed from: axu  reason: default package */
/* loaded from: classes.dex */
final class axu implements axz {
    int a;
    public Class b;
    private final axv c;

    public axu(axv axvVar) {
        this.c = axvVar;
    }

    @Override // defpackage.axz
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axu) {
            axu axuVar = (axu) obj;
            if (this.a == axuVar.a && this.b == axuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        return "Key{size=" + i + "array=" + valueOf + "}";
    }
}
