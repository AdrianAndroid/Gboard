package defpackage;

/* compiled from: PG */
/* renamed from: ipd  reason: default package */
/* loaded from: classes.dex */
public final class ipd {
    private int a;
    private int b;
    private int c;
    private byte d;

    public final ipe a() {
        if (this.d != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" ttlDays");
            }
            if ((this.d & 2) == 0) {
                sb.append(" maxCount");
            }
            if ((this.d & 4) == 0) {
                sb.append(" maxCountHardLimit");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ipe(this.a, this.b, this.c);
    }

    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(int i) {
        this.c = i;
        this.d = (byte) (this.d | 4);
    }

    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }
}
