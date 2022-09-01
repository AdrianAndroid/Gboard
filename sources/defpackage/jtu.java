package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jtu  reason: default package */
/* loaded from: classes.dex */
public final class jtu extends jug {
    private final juc a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private volatile transient String g;

    public jtu(juc jucVar, int i, int i2, int i3, int i4, int i5) {
        this.a = jucVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // defpackage.jug
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jug
    public final int b() {
        return this.c;
    }

    @Override // defpackage.jug
    public final int c() {
        return this.b;
    }

    @Override // defpackage.jug
    public final int d() {
        return this.d;
    }

    @Override // defpackage.jug
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jug) {
            jug jugVar = (jug) obj;
            if (this.a.equals(jugVar.f()) && this.b == jugVar.c() && this.c == jugVar.b() && this.d == jugVar.d() && this.e == jugVar.a() && this.f == jugVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jug
    public final juc f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    @Override // defpackage.jug
    public final String toString() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = super.i(false, true);
                    if (this.g == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }
}
