package defpackage;

/* compiled from: PG */
/* renamed from: kgs  reason: default package */
/* loaded from: classes.dex */
public final class kgs {
    public lfb a;
    public int b;
    private byte c;

    public kgs() {
    }

    public kgs(byte[] bArr) {
        this.a = ldu.a;
    }

    public final kgt a() {
        int i;
        if (this.c != 1 || (i = this.b) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" enablement");
            }
            if (this.c == 0) {
                sb.append(" manualCapture");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new kgt(i, this.a);
    }

    public final void b() {
        this.c = (byte) 1;
    }

    public final void c(boolean z) {
        this.b = true != z ? 2 : 3;
    }
}
