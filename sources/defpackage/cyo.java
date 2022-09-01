package defpackage;

/* compiled from: PG */
/* renamed from: cyo  reason: default package */
/* loaded from: classes.dex */
public final class cyo {
    public String a;
    public String b;
    public int c;

    public final cyp a() {
        String str;
        int i;
        String str2;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) cyj.n.c();
            } else {
                str = (String) cyj.m.c();
            }
            if (str != null) {
                this.a = str;
                if (str == null || (i = this.c) == 0 || (str2 = this.b) == null) {
                    StringBuilder sb = new StringBuilder();
                    if (this.a == null) {
                        sb.append(" baseUrl");
                    }
                    if (this.c == 0) {
                        sb.append(" type");
                    }
                    if (this.b == null) {
                        sb.append(" id");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                return new cyp(str, i, str2);
            }
            throw new NullPointerException("Null baseUrl");
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }
}
