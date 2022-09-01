package defpackage;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jub  reason: default package */
/* loaded from: classes.dex */
public final class jub {
    public jtr a;
    public String b;
    public String c;
    private String d;
    private long e;
    private long f;
    private int g;
    private int h;
    private llk i;
    private llp j;
    private llk k;
    private llp l;
    private boolean m;
    private Date n;
    private lls o;
    private llw p;
    private byte q;

    public jub() {
    }

    public jub(juc jucVar) {
        jtt jttVar = (jtt) jucVar;
        this.a = jttVar.a;
        this.d = jttVar.b;
        this.b = jttVar.c;
        this.e = jttVar.d;
        this.f = jttVar.e;
        this.g = jttVar.f;
        this.h = jttVar.g;
        this.j = jttVar.h;
        this.l = jttVar.i;
        this.c = jttVar.j;
        this.m = jttVar.k;
        this.n = jttVar.l;
        this.p = jttVar.m;
        this.q = (byte) 31;
    }

    public final juc a() {
        llk llkVar = this.i;
        if (llkVar != null) {
            this.j = llkVar.g();
        } else if (this.j == null) {
            this.j = llp.q();
        }
        llk llkVar2 = this.k;
        if (llkVar2 != null) {
            this.l = llkVar2.g();
        } else if (this.l == null) {
            this.l = llp.q();
        }
        lls llsVar = this.o;
        if (llsVar != null) {
            this.p = llsVar.l();
        } else if (this.p == null) {
            this.p = lrq.b;
        }
        if (this.q != 31 || this.d == null || this.b == null || this.n == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" namespace");
            }
            if (this.b == null) {
                sb.append(" name");
            }
            if ((this.q & 1) == 0) {
                sb.append(" size");
            }
            if ((this.q & 2) == 0) {
                sb.append(" compressedSize");
            }
            if ((this.q & 4) == 0) {
                sb.append(" gcPriority");
            }
            if ((this.q & 8) == 0) {
                sb.append(" downloadPriority");
            }
            if ((this.q & 16) == 0) {
                sb.append(" verifySizes");
            }
            if (this.n == null) {
                sb.append(" expiryDate");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        jtt jttVar = new jtt(this.a, this.d, this.b, this.e, this.f, this.g, this.h, this.j, this.l, this.c, this.m, this.n, this.p);
        jrp.e(jttVar.g);
        jrp.e(jttVar.f);
        jsi.e(jttVar.b);
        jsi.e(jttVar.c);
        jsi.f(jttVar.j);
        jtq.s("compressedSize", jttVar.e);
        jtq.s("size", jttVar.d);
        return jttVar;
    }

    public final llk b() {
        if (this.k == null) {
            if (this.l == null) {
                this.k = llp.e();
            } else {
                llk e = llp.e();
                this.k = e;
                e.j(this.l);
                this.l = null;
            }
        }
        return this.k;
    }

    public final lls c() {
        if (this.o == null) {
            if (this.p == null) {
                this.o = llw.h();
            } else {
                lls h = llw.h();
                this.o = h;
                h.j(this.p);
                this.p = null;
            }
        }
        return this.o;
    }

    public final void d(String str) {
        if (this.i == null) {
            if (this.j == null) {
                this.i = llp.e();
            } else {
                llk e = llp.e();
                this.i = e;
                e.j(this.j);
                this.j = null;
            }
        }
        this.i.h(str);
    }

    public final void e(String str, Object obj) {
        c().a(str, obj);
    }

    public final void f(String str) {
        jsi.f(str);
        b().h(str);
    }

    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jsi.f((String) it.next());
        }
        b().j(list);
    }

    public final void h(long j) {
        this.f = j;
        this.q = (byte) (this.q | 2);
    }

    public final void i(int i) {
        this.h = i;
        this.q = (byte) (this.q | 8);
    }

    public final void j(Date date) {
        if (date != null) {
            this.n = date;
            return;
        }
        throw new NullPointerException("Null expiryDate");
    }

    public final void k(int i) {
        this.g = i;
        this.q = (byte) (this.q | 4);
    }

    public final void l(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void m(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null namespace");
    }

    public final void n(long j) {
        this.e = j;
        this.q = (byte) (this.q | 1);
    }

    public final void o(boolean z) {
        this.m = z;
        this.q = (byte) (this.q | 16);
    }
}
