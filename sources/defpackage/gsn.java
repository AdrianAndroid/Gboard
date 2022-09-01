package defpackage;

/* compiled from: PG */
/* renamed from: gsn  reason: default package */
/* loaded from: classes.dex */
public final class gsn {
    private boolean a;
    private boolean b;
    private byte c;

    public final gso a() {
        if (this.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" openedOnZeroState");
            }
            if ((this.c & 2) == 0) {
                sb.append(" inputBoxHasContent");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gso(this.a, this.b);
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }
}
