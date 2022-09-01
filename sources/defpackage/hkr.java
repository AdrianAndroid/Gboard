package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: hkr  reason: default package */
/* loaded from: classes.dex */
public final class hkr {
    public Runnable a;
    public Runnable b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public hks f;
    public int g;
    public short h;
    private long i;
    private String j;
    private long k;
    private String l;
    private int m;
    private int n;
    private int o;
    private boolean p;

    public hkr() {
    }

    public hkr(hkt hktVar) {
        this.a = hktVar.a;
        this.b = hktVar.b;
        this.c = hktVar.c;
        this.d = hktVar.d;
        this.e = hktVar.e;
        this.f = hktVar.f;
        this.i = hktVar.h;
        this.j = hktVar.i;
        this.k = hktVar.j;
        this.l = hktVar.k;
        this.m = hktVar.l;
        this.g = hktVar.m;
        this.n = hktVar.n;
        this.o = hktVar.o;
        this.p = hktVar.p;
        this.h = (short) 1023;
    }

    public final hkt a() {
        String str;
        String str2;
        if ((this.h & 8) != 0) {
            if (this.k < 0) {
                throw new IllegalArgumentException("Notice timeout must be zero or positive");
            }
            String str3 = this.l;
            if (str3 == null) {
                throw new IllegalStateException("Property \"label\" has not been set");
            }
            if (TextUtils.isEmpty(str3)) {
                if ((this.h & 16) != 0) {
                    if (this.m == 0) {
                        throw new IllegalArgumentException("Notice must have a label or label res");
                    }
                } else {
                    throw new IllegalStateException("Property \"labelRes\" has not been set");
                }
            }
            String str4 = this.j;
            if (str4 == null) {
                throw new IllegalStateException("Property \"tag\" has not been set");
            }
            if (!TextUtils.isEmpty(str4)) {
                long currentTimeMillis = System.currentTimeMillis();
                int i = this.h | 1;
                this.h = (short) i;
                if (i != 1023 || (str = this.j) == null || (str2 = this.l) == null) {
                    StringBuilder sb = new StringBuilder();
                    if ((this.h & 1) == 0) {
                        sb.append(" creationTime");
                    }
                    if ((this.h & 2) == 0) {
                        sb.append(" initialDisplayTime");
                    }
                    if (this.j == null) {
                        sb.append(" tag");
                    }
                    if ((this.h & 4) == 0) {
                        sb.append(" iconId");
                    }
                    if ((this.h & 8) == 0) {
                        sb.append(" timeout");
                    }
                    if (this.l == null) {
                        sb.append(" label");
                    }
                    if ((this.h & 16) == 0) {
                        sb.append(" labelRes");
                    }
                    if ((this.h & 32) == 0) {
                        sb.append(" importance");
                    }
                    if ((this.h & 64) == 0) {
                        sb.append(" timeoutPolicy");
                    }
                    if ((this.h & 128) == 0) {
                        sb.append(" layoutId");
                    }
                    if ((this.h & 256) == 0) {
                        sb.append(" isDismissible");
                    }
                    if ((this.h & 512) == 0) {
                        sb.append(" hasBeenDisplayed");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                return new hkt(this.a, this.b, this.c, this.d, this.e, this.f, currentTimeMillis, this.i, str, this.k, str2, this.m, this.g, this.n, this.o, this.p);
            }
            throw new IllegalArgumentException("Notice must have a tag");
        }
        throw new IllegalStateException("Property \"timeout\" has not been set");
    }

    public final void b(boolean z) {
        this.p = z;
        this.h = (short) (this.h | 512);
    }

    public final void c(int i) {
        this.m = i;
        this.h = (short) (this.h | 16);
    }

    public final void d(int i) {
        this.o = i;
        this.h = (short) (this.h | 128);
    }

    public final void e(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null tag");
    }

    public final void f(long j) {
        this.k = j;
        this.h = (short) (this.h | 8);
    }

    public final void g(int i) {
        this.n = i;
        this.h = (short) (this.h | 64);
    }

    public final void h(long j) {
        this.i = j;
        this.h = (short) (this.h | 2);
    }

    public final void i(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null label");
    }
}
