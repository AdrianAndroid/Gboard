package defpackage;

/* compiled from: PG */
/* renamed from: jti  reason: default package */
/* loaded from: classes.dex */
public final class jti {
    public String a;
    public boolean b;
    public byte c;
    private int d;
    private int e;
    private char f;
    private boolean g;

    public final jtj a() {
        if (this.c != 63) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" width");
            }
            if ((this.c & 2) == 0) {
                sb.append(" minWidth");
            }
            if ((this.c & 4) == 0) {
                sb.append(" maxWidth");
            }
            if ((this.c & 8) == 0) {
                sb.append(" border");
            }
            if ((this.c & 16) == 0) {
                sb.append(" autoWidth");
            }
            if ((this.c & 32) == 0) {
                sb.append(" leftAligned");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jtj(this.a, this.d, this.e, this.f, this.b, this.g);
    }

    public final void b(char c) {
        this.f = c;
        this.c = (byte) (this.c | 8);
    }

    public final void c(boolean z) {
        this.g = z;
        this.c = (byte) (this.c | 32);
    }

    public final void d(int i) {
        this.e = i;
        this.c = (byte) (this.c | 4);
    }

    public final void e(int i) {
        this.d = i;
        this.c = (byte) (this.c | 2);
    }
}
