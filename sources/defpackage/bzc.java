package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bzc  reason: default package */
/* loaded from: classes.dex */
public final class bzc extends jrb {
    final idk a;

    public bzc(idk idkVar) {
        this.a = idkVar;
    }

    private static int v(jtr jtrVar) {
        if (jtrVar != null) {
            return jtrVar.a();
        }
        return -1;
    }

    private static String w(jtr jtrVar) {
        return jtrVar != null ? jtrVar.b() : "";
    }

    @Override // defpackage.jrb, defpackage.jra
    public final void a(String str) {
        this.a.e(bzs.c, str);
    }

    @Override // defpackage.jrb, defpackage.jwt
    public final void c(jsr jsrVar, String str, jtr jtrVar, Throwable th) {
        this.a.e(bzs.m, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), th);
    }

    @Override // defpackage.jrb, defpackage.jwt
    public final void e(jsr jsrVar, String str, jtr jtrVar, long j, jsx jsxVar) {
        if (j == 0) {
            this.a.e(bzs.i, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)));
        } else {
            this.a.e(bzs.k, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), Long.valueOf(j));
        }
    }

    @Override // defpackage.jrb, defpackage.jwt
    public final void f(jsr jsrVar, String str, jtr jtrVar, long j) {
        this.a.e(bzs.l, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), Long.valueOf(j));
    }

    @Override // defpackage.jrb, defpackage.jwt
    public final void i(String str, jtr jtrVar, jxy jxyVar, long j) {
        bzs bzsVar;
        if (jxyVar == jxy.CANCELLATION) {
            bzsVar = bzs.h;
        } else {
            bzsVar = bzs.j;
        }
        this.a.e(bzsVar, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), Long.valueOf(j), jxyVar);
    }

    @Override // defpackage.jrb, defpackage.jul
    public final void j(Throwable th) {
        this.a.e(bzs.e, th);
    }

    @Override // defpackage.jrb, defpackage.jvo
    public final void k(jsr jsrVar, jtr jtrVar, String str, jxz jxzVar) {
        this.a.e(bzs.q, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), jxzVar);
    }

    @Override // defpackage.jrb, defpackage.jra
    public final void l(jtr jtrVar, String str, Throwable th) {
        this.a.e(bzs.r, w(jtrVar), str, str, Integer.valueOf(v(jtrVar)), th);
    }

    @Override // defpackage.jrb, defpackage.jra
    public final void m(jsr jsrVar, jtr jtrVar, String str, boolean z) {
        if (!z) {
            return;
        }
        this.a.e(bzs.p, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)));
    }

    @Override // defpackage.jrb, defpackage.jra
    public final void n(String str, Throwable th) {
        this.a.e(bzs.u, str);
    }

    @Override // defpackage.jrb, defpackage.jra
    public final void o(String str) {
        this.a.e(bzs.t, str);
    }

    @Override // defpackage.jrb, defpackage.jzd
    public final void p(Throwable th) {
        this.a.e(bzs.d, th);
    }

    @Override // defpackage.jrb, defpackage.jxa
    public final void q(jsr jsrVar, jtr jtrVar, String str, Throwable th) {
        this.a.e(bzs.o, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), th);
    }

    @Override // defpackage.jrb, defpackage.jxa
    public final void r(jsr jsrVar, jtr jtrVar, String str, Throwable th) {
        this.a.e(bzs.n, w(jtrVar), str, null, Integer.valueOf(v(jtrVar)), th);
    }

    @Override // defpackage.jrb, defpackage.jzd
    public final void s(List list, jtr jtrVar) {
        lta listIterator = ((llp) list).listIterator();
        while (listIterator.hasNext()) {
            this.a.e(bzs.g, w(jtrVar), (String) listIterator.next(), null, Integer.valueOf(v(jtrVar)));
        }
    }

    @Override // defpackage.jrb, defpackage.jzd
    public final void t(List list, jtr jtrVar, Throwable th) {
        lta listIterator = ((llp) list).listIterator();
        while (listIterator.hasNext()) {
            this.a.e(bzs.s, w(jtrVar), (String) listIterator.next(), null, Integer.valueOf(v(jtrVar)), th);
        }
    }
}
