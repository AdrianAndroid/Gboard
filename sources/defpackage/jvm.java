package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jvm  reason: default package */
/* loaded from: classes.dex */
public final class jvm extends jvw {
    private final jsr a;
    private final long b;
    private final int c;
    private final int d;
    private final jrp e;
    private volatile transient int f;
    private volatile transient boolean g;
    private volatile transient String h;

    public jvm(jsr jsrVar, long j, int i, int i2, jrp jrpVar) {
        this.a = jsrVar;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = jrpVar;
    }

    @Override // defpackage.jvw
    public final int a() {
        return this.c;
    }

    @Override // defpackage.jvw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.jvw
    public final long c() {
        return this.b;
    }

    @Override // defpackage.jvw
    public final jrp d() {
        return this.e;
    }

    @Override // defpackage.jvw
    public final jsr e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jvw) {
            jvw jvwVar = (jvw) obj;
            if (this.a.equals(jvwVar.e()) && this.b == jvwVar.c() && this.c == jvwVar.a() && this.d == jvwVar.b() && this.e.equals(jvwVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jvw
    public final int f() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    this.f = this.e.c(this.c);
                    this.g = true;
                }
            }
        }
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.jvw
    public final String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    String obj = this.a.toString();
                    long j = this.b;
                    this.h = "{" + obj + ": " + j + " bytes}";
                    if (this.h == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
