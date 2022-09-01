package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* renamed from: hlk  reason: default package */
/* loaded from: classes.dex */
public final class hlk {
    public CharSequence a;
    public CharSequence b;
    public String c;
    public CharSequence d;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public Object j;
    public Object k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public hll r;
    public hlm e = hlm.RECOMMENDATION;
    public int s = 1;

    public final hln a() {
        if (this.s != 7 || ict.g(this.k)) {
            if (this.s == 4) {
                Object obj = this.k;
                if (!(obj instanceof hln[]) || ((hln[]) obj).length < 2) {
                    throw new IllegalStateException(String.format(Locale.US, "Emoji group ui model %s must be Candidate[2+]", this.k));
                }
            }
            return new hln(this);
        }
        throw new IllegalStateException(String.format(Locale.US, "Image model %s is not supported", this.k));
    }

    public final void b(hln hlnVar) {
        this.a = hlnVar.a;
        this.b = hlnVar.b;
        this.c = hlnVar.c;
        this.d = hlnVar.d;
        this.e = hlnVar.e;
        this.s = hlnVar.s;
        this.f = hlnVar.f;
        this.g = hlnVar.g;
        this.h = hlnVar.h;
        this.i = hlnVar.i;
        this.j = hlnVar.j;
        this.k = hlnVar.k;
        this.l = hlnVar.l;
        this.m = hlnVar.m;
        this.n = hlnVar.n;
        this.o = hlnVar.o;
        this.p = hlnVar.p;
        this.q = hlnVar.q;
        this.r = hlnVar.r;
    }

    public final void c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = hlm.RECOMMENDATION;
        this.s = 1;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = null;
    }
}
