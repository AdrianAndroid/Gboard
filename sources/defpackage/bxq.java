package defpackage;

/* compiled from: PG */
/* renamed from: bxq  reason: default package */
/* loaded from: classes.dex */
public final class bxq {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private float k;
    private float l;
    private boolean m;
    private float n;
    private boolean o;
    private float p;
    private float q;
    private float r;
    private byte s;

    public final bxr a() {
        if (this.s != -1 || this.a == null || this.b == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" tokenTablePath");
            }
            if (this.b == null) {
                sb.append(" modelPath");
            }
            if (this.c == null) {
                sb.append(" emojiMappingPath");
            }
            if (this.d == null) {
                sb.append(" ruleBasedPredictionPath");
            }
            if (this.e == null) {
                sb.append(" conceptTablePath");
            }
            if (this.f == null) {
                sb.append(" querySetPath");
            }
            if (this.g == null) {
                sb.append(" queryMappingPath");
            }
            if (this.h == null) {
                sb.append(" emojiToEntityPath");
            }
            if (this.i == null) {
                sb.append(" blocklistFilePath");
            }
            if (this.j == null) {
                sb.append(" conceptDisplayNameFilePath");
            }
            if ((this.s & 1) == 0) {
                sb.append(" unkThreshold");
            }
            if ((this.s & 2) == 0) {
                sb.append(" bitmojiQueryThreshold");
            }
            if ((this.s & 4) == 0) {
                sb.append(" hasBitmojiQueryThreshold");
            }
            if ((this.s & 8) == 0) {
                sb.append(" tenorQueryThreshold");
            }
            if ((this.s & 16) == 0) {
                sb.append(" hasTenorQueryThreshold");
            }
            if ((this.s & 32) == 0) {
                sb.append(" queryPredictionSlope");
            }
            if ((this.s & 64) == 0) {
                sb.append(" queryPredictionIntercept");
            }
            if ((this.s & 128) == 0) {
                sb.append(" contextualEmojiKitchenThreshold");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new bxr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final void b(float f) {
        this.l = f;
        this.s = (byte) (this.s | 2);
    }

    public final void c(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null blocklistFilePath");
    }

    public final void d(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null conceptDisplayNameFilePath");
    }

    public final void e(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null conceptTablePath");
    }

    public final void f(float f) {
        this.r = f;
        this.s = (byte) (this.s | 128);
    }

    public final void g(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null emojiMappingPath");
    }

    public final void h(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null emojiToEntityPath");
    }

    public final void i(boolean z) {
        this.m = z;
        this.s = (byte) (this.s | 4);
    }

    public final void j(boolean z) {
        this.o = z;
        this.s = (byte) (this.s | 16);
    }

    public final void k(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null modelPath");
    }

    public final void l(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null queryMappingPath");
    }

    public final void m(float f) {
        this.q = f;
        this.s = (byte) (this.s | 64);
    }

    public final void n(float f) {
        this.p = f;
        this.s = (byte) (this.s | 32);
    }

    public final void o(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null querySetPath");
    }

    public final void p(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null ruleBasedPredictionPath");
    }

    public final void q(float f) {
        this.n = f;
        this.s = (byte) (this.s | 8);
    }

    public final void r(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null tokenTablePath");
    }

    public final void s(float f) {
        this.k = f;
        this.s = (byte) (this.s | 1);
    }
}
