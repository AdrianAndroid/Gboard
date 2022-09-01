package defpackage;

/* compiled from: PG */
/* renamed from: juv  reason: default package */
/* loaded from: classes.dex */
public final class juv {
    public jtr a;
    private String b;
    private int c;
    private llp d;
    private long e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private String k;
    private long l;
    private byte m;

    public final juw a() {
        if (this.m != -1 || this.b == null || this.d == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" id");
            }
            if ((this.m & 1) == 0) {
                sb.append(" priority");
            }
            if (this.d == null) {
                sb.append(" urls");
            }
            if ((this.m & 2) == 0) {
                sb.append(" startTimestampMillis");
            }
            if ((this.m & 4) == 0) {
                sb.append(" requiresUnmeteredNetwork");
            }
            if ((this.m & 8) == 0) {
                sb.append(" requiresCharging");
            }
            if ((this.m & 16) == 0) {
                sb.append(" requiresIdle");
            }
            if ((this.m & 32) == 0) {
                sb.append(" requiresBatteryNotLow");
            }
            if ((this.m & 64) == 0) {
                sb.append(" schedulingFlags");
            }
            if (this.k == null) {
                sb.append(" filePath");
            }
            if ((this.m & 128) == 0) {
                sb.append(" ttlMillis");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        juj jujVar = new juj(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        jtq.s("startTimestampMillis", jujVar.e);
        jtq.s("ttlMillis", jujVar.l);
        return jujVar;
    }

    public final void b(String str) {
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null filePath");
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void d(int i) {
        this.c = i;
        this.m = (byte) (this.m | 1);
    }

    public final void e(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 32);
    }

    public final void f(boolean z) {
        this.g = z;
        this.m = (byte) (this.m | 8);
    }

    public final void g(boolean z) {
        this.h = z;
        this.m = (byte) (this.m | 16);
    }

    public final void h(boolean z) {
        this.f = z;
        this.m = (byte) (this.m | 4);
    }

    public final void i(int i) {
        this.j = i;
        this.m = (byte) (this.m | 64);
    }

    public final void j(long j) {
        this.e = j;
        this.m = (byte) (this.m | 2);
    }

    public final void k(long j) {
        this.l = j;
        this.m = (byte) (this.m | 128);
    }

    public final void l(llp llpVar) {
        if (llpVar != null) {
            this.d = llpVar;
            return;
        }
        throw new NullPointerException("Null urls");
    }
}
