package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cnf  reason: default package */
/* loaded from: classes.dex */
public final class cnf {
    public Runnable a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private byte h;

    public final cng a() {
        if (b() == 0) {
            if ((this.h & 1) != 0) {
                int i = this.b;
                h((i == 1 || i == 2) ? R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a : 0);
            } else {
                throw new IllegalStateException("Property \"cardType\" has not been set");
            }
        }
        if (b() != 0) {
            if (this.h == 63) {
                return new cng(this.b, this.c, this.d, this.e, this.f, this.g, this.a);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.h) == 0) {
                sb.append(" cardType");
            }
            if ((2 & this.h) == 0) {
                sb.append(" layout");
            }
            if ((this.h & 4) == 0) {
                sb.append(" icon");
            }
            if ((this.h & 8) == 0) {
                sb.append(" errorMessage");
            }
            if ((this.h & 16) == 0) {
                sb.append(" buttonMessage");
            }
            if ((this.h & 32) == 0) {
                sb.append(" announceOnInflate");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new IllegalStateException("layout is missing");
    }

    public final int b() {
        if ((this.h & 2) != 0) {
            return this.c;
        }
        throw new IllegalStateException("Property \"layout\" has not been set");
    }

    public final void c(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 32);
    }

    public final void d(int i) {
        this.f = i;
        this.h = (byte) (this.h | 16);
    }

    public final void e(int i) {
        this.b = i;
        this.h = (byte) (this.h | 1);
    }

    public final void f(int i) {
        this.e = i;
        this.h = (byte) (this.h | 8);
    }

    public final void g(int i) {
        this.d = i;
        this.h = (byte) (this.h | 4);
    }

    public final void h(int i) {
        this.c = i;
        this.h = (byte) (this.h | 2);
    }
}
