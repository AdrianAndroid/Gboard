package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jrf  reason: default package */
/* loaded from: classes.dex */
public final class jrf extends jrp {
    private final int b;
    private final int c;
    private volatile transient String d;

    public jrf(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.jrp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jrp
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jrp) {
            jrp jrpVar = (jrp) obj;
            if (this.b == jrpVar.b() && this.c == jrpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c;
    }

    @Override // defpackage.jrp
    public final String toString() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    String str = "absolute:";
                    if (this.c != 1) {
                        str = "relative:";
                    }
                    int i = this.b;
                    this.d = "{" + str + i + "}";
                    if (this.d == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }
}
