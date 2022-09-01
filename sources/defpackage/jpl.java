package defpackage;

/* compiled from: PG */
/* renamed from: jpl  reason: default package */
/* loaded from: classes.dex */
public final class jpl implements jra {
    private final jls a;

    public jpl(jls jlsVar, byte[] bArr) {
        this.a = jlsVar;
    }

    @Override // defpackage.jra
    public final void a(String str) {
        this.a.a(new jpg(str, 4));
    }

    @Override // defpackage.jra
    public final void b(String str, Throwable th) {
        this.a.a(new jpi(str, th, 0));
    }

    @Override // defpackage.jul
    public final void j(Throwable th) {
        this.a.a(new jpg(th, 2));
    }

    @Override // defpackage.jvo
    public final void k(jsr jsrVar, jtr jtrVar, String str, jxz jxzVar) {
        this.a.a(new jpk(jsrVar, jtrVar, str, jxzVar, 2));
    }

    @Override // defpackage.jra
    public final void l(jtr jtrVar, String str, Throwable th) {
        this.a.a(new jqn(jtrVar, str, th, 1));
    }

    @Override // defpackage.jra
    public final void m(final jsr jsrVar, final jtr jtrVar, final String str, final boolean z) {
        this.a.a(new jnf() { // from class: jpj
            @Override // defpackage.jnf
            public final void a(Object obj) {
                ((jra) obj).m(jsr.this, jtrVar, str, z);
            }
        });
    }

    @Override // defpackage.jra
    public final void n(String str, Throwable th) {
        this.a.a(new jpi(str, th, 2));
    }

    @Override // defpackage.jra
    public final void o(String str) {
        this.a.a(new jpg(str, 3));
    }

    @Override // defpackage.jxa
    public final void q(jsr jsrVar, jtr jtrVar, String str, Throwable th) {
        this.a.a(new jpk(jsrVar, jtrVar, str, th, 1));
    }

    @Override // defpackage.jxa
    public final void r(jsr jsrVar, jtr jtrVar, String str, Throwable th) {
        this.a.a(new jpk(jsrVar, jtrVar, str, th, 0));
    }

    @Override // defpackage.jvo
    public final void y(jsr jsrVar, int i) {
        this.a.a(new jvq(jsrVar, i, 1));
    }

    @Override // defpackage.jvo
    public final void z(String str, Throwable th) {
        this.a.a(new jpi(str, th, 1));
    }
}
