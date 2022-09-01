package defpackage;

/* compiled from: PG */
/* renamed from: evi  reason: default package */
/* loaded from: classes.dex */
public final class evi {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final evj a() {
        if (this.d != 7) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" taskSuccess");
            }
            if ((this.d & 2) == 0) {
                sb.append(" deploySuccess");
            }
            if ((this.d & 4) == 0) {
                sb.append(" resultSuccess");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new evj(this.a, this.b, this.c);
    }

    public final void b(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
