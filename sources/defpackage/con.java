package defpackage;

/* compiled from: PG */
/* renamed from: con  reason: default package */
/* loaded from: classes.dex */
public final class con {
    private String a;
    private String b;
    private int c;
    private byte d;

    public final coo a() {
        String str;
        String str2;
        if (this.d != 1 || (str = this.a) == null || (str2 = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" text");
            }
            if (this.b == null) {
                sb.append(" contentDescription");
            }
            if (this.d == 0) {
                sb.append(" drawableRes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new coo(str, str2, this.c);
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }

    public final void c(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
