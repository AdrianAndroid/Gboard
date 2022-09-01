package defpackage;

/* compiled from: PG */
/* renamed from: dws  reason: default package */
/* loaded from: classes.dex */
final class dws {
    public int a;
    private String b;
    private boolean c;
    private Runnable d;
    private byte e;

    public final dwt a() {
        String str;
        int i;
        Runnable runnable;
        if (this.e != 1 || (str = this.b) == null || (i = this.a) == 0 || (runnable = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" title");
            }
            if (this.e == 0) {
                sb.append(" isSelected");
            }
            if (this.a == 0) {
                sb.append(" status");
            }
            if (this.d == null) {
                sb.append(" onSelected");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new dwt(str, this.c, i, runnable);
    }

    public final void b(boolean z) {
        this.c = z;
        this.e = (byte) 1;
    }

    public final void c(Runnable runnable) {
        if (runnable != null) {
            this.d = runnable;
            return;
        }
        throw new NullPointerException("Null onSelected");
    }

    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null title");
    }
}
