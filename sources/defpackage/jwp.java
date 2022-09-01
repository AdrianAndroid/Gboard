package defpackage;

/* compiled from: PG */
/* renamed from: jwp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jwp implements jnf {
    public final /* synthetic */ jsr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jwp(jsr jsrVar, String str, jtr jtrVar, long j, int i) {
        this.e = i;
        this.a = jsrVar;
        this.b = str;
        this.d = jtrVar;
        this.c = j;
    }

    public /* synthetic */ jwp(jsr jsrVar, String str, juc jucVar, long j, int i) {
        this.e = i;
        this.a = jsrVar;
        this.b = str;
        this.d = jucVar;
        this.c = j;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        int i = this.e;
        if (i == 0) {
            jwt jwtVar = (jwt) obj;
            jwtVar.x(this.a, this.b, (jtr) this.d, this.c);
        } else if (i == 1) {
            jsr jsrVar = this.a;
            String str = this.b;
            Object obj2 = this.d;
            ((jwt) obj).f(jsrVar, str, ((juc) obj2).e(), this.c);
        } else if (i == 2) {
            jwt jwtVar2 = (jwt) obj;
            jwtVar2.x(this.a, this.b, (jtr) this.d, this.c);
        } else {
            jwt jwtVar3 = (jwt) obj;
            jwtVar3.f(this.a, this.b, (jtr) this.d, this.c);
        }
    }
}
