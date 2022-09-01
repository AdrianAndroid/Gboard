package defpackage;

/* compiled from: PG */
/* renamed from: bxt  reason: default package */
/* loaded from: classes.dex */
final class bxt {
    private String a;
    private String b;
    private String c;
    private float d;
    private float e;
    private boolean f;
    private int g;
    private byte h;

    public final bxu a() {
        if (this.h != 15 || this.a == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" emojiMappingPath");
            }
            if (this.b == null) {
                sb.append(" modelPath");
            }
            if (this.c == null) {
                sb.append(" blocklistPath");
            }
            if ((this.h & 1) == 0) {
                sb.append(" threshold");
            }
            if ((this.h & 2) == 0) {
                sb.append(" scalingFactor");
            }
            if ((this.h & 4) == 0) {
                sb.append(" isQrnnModel");
            }
            if ((this.h & 8) == 0) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new bxu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null blocklistPath");
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null emojiMappingPath");
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 4);
    }

    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null modelPath");
    }

    public final void f(float f) {
        this.e = f;
        this.h = (byte) (this.h | 2);
    }

    public final void g(float f) {
        this.d = f;
        this.h = (byte) (this.h | 1);
    }

    public final void h(int i) {
        this.g = i;
        this.h = (byte) (this.h | 8);
    }
}
