package defpackage;

/* compiled from: PG */
/* renamed from: jri  reason: default package */
/* loaded from: classes.dex */
final class jri extends jss {
    private final jsr b;
    private final int c;
    private volatile transient String d;

    public jri(jsr jsrVar, int i) {
        if (jsrVar != null) {
            this.b = jsrVar;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null qualifiedName");
    }

    @Override // defpackage.jss
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jss
    public final jsr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jss) {
            jss jssVar = (jss) obj;
            if (this.b.equals(jssVar.b()) && this.c == jssVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c;
    }

    @Override // defpackage.jss
    public final String toString() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    lfa T = jdg.T("");
                    T.b("name", this.b);
                    T.f("version", this.c);
                    this.d = T.toString();
                    if (this.d == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.d;
    }
}
