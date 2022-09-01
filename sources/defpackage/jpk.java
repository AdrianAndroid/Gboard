package defpackage;

/* compiled from: PG */
/* renamed from: jpk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jpk implements jnf {
    public final /* synthetic */ jsr a;
    public final /* synthetic */ jtr b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jpk(jsr jsrVar, String str, jtr jtrVar, Exception exc, int i) {
        this.e = i;
        this.a = jsrVar;
        this.d = str;
        this.b = jtrVar;
        this.c = exc;
    }

    public /* synthetic */ jpk(jsr jsrVar, String str, jtr jtrVar, Throwable th, int i) {
        this.e = i;
        this.a = jsrVar;
        this.c = str;
        this.b = jtrVar;
        this.d = th;
    }

    public /* synthetic */ jpk(jsr jsrVar, jtr jtrVar, String str, Throwable th, int i) {
        this.e = i;
        this.a = jsrVar;
        this.b = jtrVar;
        this.c = str;
        this.d = th;
    }

    public /* synthetic */ jpk(jsr jsrVar, jtr jtrVar, String str, jxz jxzVar, int i) {
        this.e = i;
        this.a = jsrVar;
        this.b = jtrVar;
        this.d = str;
        this.c = jxzVar;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            ((jra) obj).r(this.a, this.b, (String) this.c, (Throwable) this.d);
        } else if (i == 1) {
            ((jra) obj).q(this.a, this.b, (String) this.c, (Throwable) this.d);
        } else if (i == 2) {
            ((jra) obj).k(this.a, this.b, (String) this.d, (jxz) this.c);
        } else if (i == 3) {
            jwt jwtVar = (jwt) obj;
            jwtVar.c(this.a, (String) this.d, this.b, (Throwable) this.c);
        } else {
            jwt jwtVar2 = (jwt) obj;
            jwtVar2.c(this.a, (String) this.c, this.b, (Throwable) this.d);
        }
    }
}
