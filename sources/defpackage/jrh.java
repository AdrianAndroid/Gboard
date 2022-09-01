package defpackage;

/* compiled from: PG */
/* renamed from: jrh  reason: default package */
/* loaded from: classes.dex */
public final class jrh extends jsr {
    public final String a;
    public final String b;
    private volatile transient String c;

    public jrh(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null namespace");
    }

    @Override // defpackage.jsr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jsr
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsr) {
            jsr jsrVar = (jsr) obj;
            if (this.a.equals(jsrVar.b()) && this.b.equals(jsrVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.jsr
    public final String toString() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = jsr.h(this.a, this.b);
                    if (this.c == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }
}
