package defpackage;

/* compiled from: PG */
/* renamed from: bxw  reason: default package */
/* loaded from: classes.dex */
final class bxw {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private float f;
    private boolean g;
    private float h;
    private boolean i;
    private float j;
    private boolean k;
    private byte l;

    public final bxx a() {
        if (this.l != 63 || this.a == null || this.b == null || this.c == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" tokenSymbolTablePath");
            }
            if (this.b == null) {
                sb.append(" modelPath");
            }
            if (this.c == null) {
                sb.append(" blocklistPath");
            }
            if (this.d == null) {
                sb.append(" allowlistPath");
            }
            if (this.e == null) {
                sb.append(" peopleNamesPath");
            }
            if ((this.l & 1) == 0) {
                sb.append(" triggeringThreshold");
            }
            if ((this.l & 2) == 0) {
                sb.append(" hasTriggeringThreshold");
            }
            if ((this.l & 4) == 0) {
                sb.append(" neutralTriggeringWeight");
            }
            if ((this.l & 8) == 0) {
                sb.append(" hasNeutralTriggeringWeight");
            }
            if ((this.l & 16) == 0) {
                sb.append(" incompleteSentenceWeight");
            }
            if ((this.l & 32) == 0) {
                sb.append(" hasIncompleteSentenceWeight");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new bxx(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null allowlistPath");
    }

    public final void c(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null blocklistPath");
    }

    public final void d(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 32);
    }

    public final void e(boolean z) {
        this.i = z;
        this.l = (byte) (this.l | 8);
    }

    public final void f(boolean z) {
        this.g = z;
        this.l = (byte) (this.l | 2);
    }

    public final void g(float f) {
        this.j = f;
        this.l = (byte) (this.l | 16);
    }

    public final void h(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null modelPath");
    }

    public final void i(float f) {
        this.h = f;
        this.l = (byte) (this.l | 4);
    }

    public final void j(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null peopleNamesPath");
    }

    public final void k(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null tokenSymbolTablePath");
    }

    public final void l(float f) {
        this.f = f;
        this.l = (byte) (this.l | 1);
    }
}
