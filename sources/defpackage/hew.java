package defpackage;

/* compiled from: PG */
/* renamed from: hew  reason: default package */
/* loaded from: classes.dex */
public final class hew {
    public String a;
    public int b;
    private int c;
    private byte d;

    public hew() {
    }

    public hew(cru cruVar) {
        this.a = cruVar.b;
        this.c = cruVar.c;
        this.b = cruVar.d;
        this.d = (byte) 1;
    }

    public final hex a() {
        String str;
        if (this.d != 3 || (str = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" text");
            }
            if ((this.d & 1) == 0) {
                sb.append(" entityType");
            }
            if ((this.d & 2) == 0) {
                sb.append(" start");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hex(str, this.c, this.b);
    }

    public final void b(int i) {
        this.c = i;
        this.d = (byte) (this.d | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public final cru e() {
        if (this.d != 1 || this.a == null || this.b == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" query");
            }
            if (this.d == 0) {
                sb.append(" page");
            }
            if (this.b == 0) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cru(this.a, this.c, this.b);
    }

    public final void f(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public final cqn g() {
        if (this.d != 3 || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" width");
            }
            if ((this.d & 2) == 0) {
                sb.append(" height");
            }
            if (this.a == null) {
                sb.append(" mimeType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new cqn(this.b, this.c, this.a);
    }

    public final void h(int i) {
        this.c = i;
        this.d = (byte) (this.d | 2);
    }

    public final void i(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null mimeType");
    }

    public final void j(int i) {
        this.b = i;
        this.d = (byte) (this.d | 1);
    }
}
