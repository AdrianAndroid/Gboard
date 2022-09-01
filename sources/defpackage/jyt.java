package defpackage;

/* compiled from: PG */
/* renamed from: jyt  reason: default package */
/* loaded from: classes.dex */
public final class jyt implements jwt {
    private final jls a;

    private jyt(jls jlsVar, byte[] bArr) {
        this.a = jlsVar;
    }

    public static jyt a(jls jlsVar) {
        return new jyt(jlsVar, null);
    }

    @Override // defpackage.jwt
    public final void c(jsr jsrVar, String str, jtr jtrVar, Throwable th) {
        this.a.a(new jpk(jsrVar, str, jtrVar, th, 4));
    }

    @Override // defpackage.jwt
    public final void d(final jsr jsrVar, final String str, final jtr jtrVar, final long j, final long j2) {
        this.a.a(new jnf() { // from class: jys
            @Override // defpackage.jnf
            public final void a(Object obj) {
                ((jwt) obj).d(jsr.this, str, jtrVar, j, j2);
            }
        });
    }

    @Override // defpackage.jwt
    public final void e(jsr jsrVar, String str, jtr jtrVar, long j, jsx jsxVar) {
        this.a.a(new jyq(jsrVar, str, jtrVar, j, jsxVar, 0));
    }

    @Override // defpackage.jwt
    public final void f(jsr jsrVar, String str, jtr jtrVar, long j) {
        this.a.a(new jwp(jsrVar, str, jtrVar, j, 3));
    }

    @Override // defpackage.jwt
    public final void g(final jsr jsrVar, final boolean z) {
        this.a.a(new jnf() { // from class: jyr
            @Override // defpackage.jnf
            public final void a(Object obj) {
                ((jwt) obj).g(jsr.this, z);
            }
        });
    }

    @Override // defpackage.jwt
    public final void i(String str, jtr jtrVar, jxy jxyVar, long j) {
        throw null;
    }

    @Override // defpackage.jwt
    public final void x(jsr jsrVar, String str, jtr jtrVar, long j) {
        this.a.a(new jwp(jsrVar, str, jtrVar, j, 2));
    }
}
