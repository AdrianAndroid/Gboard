package defpackage;

/* compiled from: PG */
/* renamed from: jyq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jyq implements jnf {
    public final /* synthetic */ jsr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jtr c;
    public final /* synthetic */ long d;
    public final /* synthetic */ jsx e;
    private final /* synthetic */ int f;

    public /* synthetic */ jyq(jsr jsrVar, String str, jtr jtrVar, long j, jsx jsxVar, int i) {
        this.f = i;
        this.a = jsrVar;
        this.b = str;
        this.c = jtrVar;
        this.d = j;
        this.e = jsxVar;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        if (this.f == 0) {
            ((jwt) obj).e(this.a, this.b, this.c, this.d, this.e);
            return;
        }
        ((jwt) obj).e(this.a, this.b, this.c, this.d, this.e);
    }
}
