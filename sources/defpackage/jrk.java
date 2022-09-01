package defpackage;

/* compiled from: PG */
/* renamed from: jrk  reason: default package */
/* loaded from: classes.dex */
public final class jrk extends jsx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private volatile transient String e;

    public jrk(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // defpackage.jsx
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.jsx
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.jsx
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.jsx
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsx) {
            jsx jsxVar = (jsx) obj;
            if (this.a == jsxVar.d() && this.b == jsxVar.b() && this.c == jsxVar.c() && this.d == jsxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    @Override // defpackage.jsx
    public final String toString() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = jtq.c(this.a, this.b, this.c, this.d);
                    if (this.e == null) {
                        throw new NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }
}
