package defpackage;

/* compiled from: PG */
/* renamed from: jot  reason: default package */
/* loaded from: classes.dex */
public final class jot {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private double i;
    private short j;

    public final jou a() {
        if (this.j != 511) {
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" connectTimeoutMs");
            }
            if ((this.j & 2) == 0) {
                sb.append(" readTimeoutMs");
            }
            if ((this.j & 4) == 0) {
                sb.append(" requestBodyChunkSizeBytes");
            }
            if ((this.j & 8) == 0) {
                sb.append(" responseBodyChunkSizeBytes");
            }
            if ((this.j & 16) == 0) {
                sb.append(" responseBodyGzipBufferSizeBytes");
            }
            if ((this.j & 32) == 0) {
                sb.append(" callDisconnectWhenCancelled");
            }
            if ((this.j & 64) == 0) {
                sb.append(" supportAcceptEncodingHeader");
            }
            if ((this.j & 128) == 0) {
                sb.append(" estimateSentReceivedBytes");
            }
            if ((this.j & 256) == 0) {
                sb.append(" estimatedHttp2HeaderCompressionRatio");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new jou(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final void b(boolean z) {
        this.f = z;
        this.j = (short) (this.j | 32);
    }

    public final void c(int i) {
        this.a = i;
        this.j = (short) (this.j | 1);
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (short) (this.j | 128);
    }

    public final void e(double d) {
        this.i = d;
        this.j = (short) (this.j | 256);
    }

    public final void f(int i) {
        this.b = i;
        this.j = (short) (this.j | 2);
    }

    public final void g(int i) {
        this.c = i;
        this.j = (short) (this.j | 4);
    }

    public final void h(int i) {
        this.d = i;
        this.j = (short) (this.j | 8);
    }

    public final void i(int i) {
        this.e = i;
        this.j = (short) (this.j | 16);
    }

    public final void j(boolean z) {
        this.g = z;
        this.j = (short) (this.j | 64);
    }
}
