package defpackage;

/* compiled from: PG */
/* renamed from: jvv  reason: default package */
/* loaded from: classes.dex */
public final class jvv {
    public jrp a;
    private jsr b;
    private long c;
    private int d;
    private int e;
    private byte f;

    public final jvw a() {
        jsr jsrVar;
        jrp jrpVar;
        if (this.f != 7 || (jsrVar = this.b) == null || (jrpVar = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" name");
            }
            if ((this.f & 1) == 0) {
                sb.append(" reservedSize");
            }
            if ((this.f & 2) == 0) {
                sb.append(" gcPriority");
            }
            if ((this.f & 4) == 0) {
                sb.append(" reservationState");
            }
            if (this.a == null) {
                sb.append(" baseGcPriority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jvm(jsrVar, this.c, this.d, this.e, jrpVar);
    }

    public final void b(int i) {
        this.d = i;
        this.f = (byte) (this.f | 2);
    }

    public final void c(jsr jsrVar) {
        if (jsrVar != null) {
            this.b = jsrVar;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void d(int i) {
        this.e = i;
        this.f = (byte) (this.f | 4);
    }

    public final void e(long j) {
        this.c = j;
        this.f = (byte) (this.f | 1);
    }
}
