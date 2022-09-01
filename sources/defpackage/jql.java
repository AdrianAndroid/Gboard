package defpackage;

/* compiled from: PG */
/* renamed from: jql  reason: default package */
/* loaded from: classes.dex */
public final class jql {
    public lls a;
    public llw b;
    private String c;
    private int d;
    private llp e;
    private lls f;
    private llw g;
    private byte h;

    public final jqm a() {
        String str;
        lls llsVar = this.a;
        if (llsVar != null) {
            this.b = llsVar.l();
        } else if (this.b == null) {
            this.b = lrq.b;
        }
        lls llsVar2 = this.f;
        if (llsVar2 != null) {
            this.g = llsVar2.l();
        } else if (this.g == null) {
            this.g = lrq.b;
        }
        if (this.h != 1 || (str = this.c) == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" name");
            }
            if (this.h == 0) {
                sb.append(" version");
            }
            if (this.e == null) {
                sb.append(" indexSpecs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        jpd jpdVar = new jpd(str, this.d, this.b, this.g);
        jsi.e(jpdVar.a);
        jtq.s("version", jpdVar.b);
        return jpdVar;
    }

    public final void b(juc jucVar) {
        if (this.f == null) {
            if (this.g == null) {
                this.f = llw.h();
            } else {
                lls h = llw.h();
                this.f = h;
                h.j(this.g);
                this.g = null;
            }
        }
        this.f.a(jucVar.i(), jucVar);
    }

    public final void c(llp llpVar) {
        if (llpVar != null) {
            this.e = llpVar;
            return;
        }
        throw new NullPointerException("Null indexSpecs");
    }

    public final void d(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void e(int i) {
        this.d = i;
        this.h = (byte) 1;
    }
}
