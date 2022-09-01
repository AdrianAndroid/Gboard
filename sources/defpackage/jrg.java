package defpackage;

/* compiled from: PG */
/* renamed from: jrg  reason: default package */
/* loaded from: classes.dex */
public final class jrg extends jsp {
    public final long a;
    public final long b;
    public volatile transient String c;
    public volatile transient String d;
    private volatile transient float e;
    private volatile transient boolean f;

    public jrg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.jsp
    public final long a() {
        return this.a;
    }

    @Override // defpackage.jsp
    public final long b() {
        return this.b;
    }

    @Override // defpackage.jsp
    public final void d() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsp) {
            jsp jspVar = (jsp) obj;
            if (this.a == jspVar.a() && this.b == jspVar.b()) {
                jspVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ 80;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        return "Progress{current=" + j + ", total=" + j2 + ", progressBarMaxWidth=80}";
    }

    @Override // defpackage.jsp
    public final float c() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    long j = this.b;
                    float f = -1.0f;
                    if (j >= 0) {
                        long j2 = this.a;
                        if (j2 >= 0) {
                            f = Math.max(0.0f, Math.min(1.0f, ((float) j2) / ((float) j)));
                        }
                    }
                    this.e = f;
                    this.f = true;
                }
            }
        }
        return this.e;
    }
}
