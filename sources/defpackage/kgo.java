package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kgo  reason: default package */
/* loaded from: classes.dex */
public final class kgo {
    public int a;
    public llp b;
    public byte c;
    public int d;
    public Object e;

    public final void a(Pattern pattern) {
        if (this.e == null) {
            if (this.b == null) {
                this.e = llp.e();
            } else {
                llk e = llp.e();
                this.e = e;
                e.j(this.b);
                this.b = null;
            }
        }
        ((llk) this.e).h(new opu(pattern));
    }

    public final void b() {
        this.a = 5;
        this.c = (byte) (this.c | 1);
    }

    public final crv c() {
        llp llpVar;
        Object obj;
        if (this.c != 3 || (llpVar = this.b) == null || (obj = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" results");
            }
            if (this.e == null) {
                sb.append(" httpResponse");
            }
            if ((this.c & 1) == 0) {
                sb.append(" totalResults");
            }
            if ((this.c & 2) == 0) {
                sb.append(" page");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new crv(llpVar, (iij) obj, this.a, this.d);
    }

    public final void d(iij iijVar) {
        if (iijVar != null) {
            this.e = iijVar;
            return;
        }
        throw new NullPointerException("Null httpResponse");
    }

    public final void e(int i) {
        this.d = i;
        this.c = (byte) (this.c | 2);
    }

    public final void f(llp llpVar) {
        if (llpVar != null) {
            this.b = llpVar;
            return;
        }
        throw new NullPointerException("Null results");
    }

    public final void g(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }
}
