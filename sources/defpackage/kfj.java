package defpackage;

/* compiled from: PG */
/* renamed from: kfj  reason: default package */
/* loaded from: classes.dex */
public final class kfj {
    public int a;
    public byte b;
    public int c;

    public final kfk a() {
        int i;
        if (this.b != 1 || (i = this.c) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.c == 0) {
                sb.append(" enablement");
            }
            if (this.b == 0) {
                sb.append(" rateLimitPerSecond");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kfk(i, this.a);
    }

    public final void b() {
        this.c = 2;
    }
}
