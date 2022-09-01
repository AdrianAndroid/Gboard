package defpackage;

/* compiled from: PG */
/* renamed from: jrn  reason: default package */
/* loaded from: classes.dex */
public final class jrn extends jtr {
    public final String a;
    public final int b;
    private volatile transient String c;

    public jrn(String str, int i) {
        if (str != null) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.jtr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.jtr
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jtr) {
            jtr jtrVar = (jtr) obj;
            if (this.a.equals(jtrVar.b()) && this.b == jtrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    @Override // defpackage.jtr
    public final String toString() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    String str = this.a;
                    int i = this.b;
                    this.c = str + "." + i;
                    if (this.c == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
