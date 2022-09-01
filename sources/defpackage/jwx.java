package defpackage;

/* compiled from: PG */
/* renamed from: jwx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jwx implements jnf {
    public final /* synthetic */ jwz a;
    public final /* synthetic */ jsr b;
    public final /* synthetic */ juc c;
    public final /* synthetic */ jsr d;
    public final /* synthetic */ Throwable e;
    private final /* synthetic */ int f;

    public /* synthetic */ jwx(jwz jwzVar, jsr jsrVar, juc jucVar, jsr jsrVar2, Throwable th, int i) {
        this.f = i;
        this.a = jwzVar;
        this.b = jsrVar;
        this.c = jucVar;
        this.d = jsrVar2;
        this.e = th;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        if (this.f == 0) {
            jwz jwzVar = this.a;
            jsr jsrVar = this.b;
            juc jucVar = this.c;
            jsr jsrVar2 = this.d;
            ((jxa) obj).q(jsrVar, jucVar.e(), jwzVar.c.k(jsrVar2), this.e);
            return;
        }
        jwz jwzVar2 = this.a;
        jsr jsrVar3 = this.b;
        juc jucVar2 = this.c;
        jsr jsrVar4 = this.d;
        ((jxa) obj).r(jsrVar3, jucVar2.e(), jwzVar2.c.k(jsrVar4), this.e);
    }
}
