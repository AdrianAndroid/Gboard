package defpackage;

/* compiled from: PG */
/* renamed from: jrl  reason: default package */
/* loaded from: classes.dex */
public final class jrl extends jsz {
    public final jsx a;
    public final boolean b;
    private volatile transient String c;

    public jrl(jsx jsxVar, boolean z) {
        this.a = jsxVar;
        this.b = z;
    }

    @Override // defpackage.jsz
    public final jsx a() {
        return this.a;
    }

    @Override // defpackage.jsz
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsz) {
            jsz jszVar = (jsz) obj;
            if (this.a.equals(jszVar.a()) && this.b == jszVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    @Override // defpackage.jsz
    public final String toString() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    String obj = this.a.toString();
                    String str = "fg";
                    if (true != this.b) {
                        str = "bg";
                    }
                    this.c = "{" + obj + ", " + str + "}";
                    if (this.c == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
