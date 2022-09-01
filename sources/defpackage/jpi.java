package defpackage;

/* compiled from: PG */
/* renamed from: jpi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jpi implements jnf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpi(String str, Throwable th, int i) {
        this.c = i;
        this.a = str;
        this.b = th;
    }

    public /* synthetic */ jpi(juc jucVar, juu juuVar, int i) {
        this.c = i;
        this.a = jucVar;
        this.b = juuVar;
    }

    public /* synthetic */ jpi(juc jucVar, jwu jwuVar, int i) {
        this.c = i;
        this.a = jucVar;
        this.b = jwuVar;
    }

    public /* synthetic */ jpi(juc jucVar, jzl jzlVar, int i) {
        this.c = i;
        this.a = jucVar;
        this.b = jzlVar;
    }

    public /* synthetic */ jpi(juu juuVar, jsz jszVar, int i) {
        this.c = i;
        this.b = juuVar;
        this.a = jszVar;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [jwu, java.lang.Object] */
    @Override // defpackage.jnf
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                ((jra) obj).b((String) this.a, (Throwable) this.b);
                return;
            case 1:
                ((jra) obj).z((String) this.a, (Throwable) this.b);
                return;
            case 2:
                ((jra) obj).n((String) this.a, (Throwable) this.b);
                return;
            case 3:
                ((jra) obj).b((String) this.a, (Throwable) this.b);
                return;
            case 4:
                ((jra) obj).n((String) this.a, (Throwable) this.b);
                return;
            case 5:
                Object obj2 = this.a;
                Object obj3 = this.b;
                int i = jvr.o;
                ((jvo) obj).z((String) obj2, (Throwable) obj3);
                return;
            case 6:
                ((jwt) obj).g(((juc) this.a).o(), this.b.c());
                return;
            case 7:
                Object obj4 = this.a;
                Object obj5 = this.b;
                long j = jzc.a;
                juc jucVar = (juc) obj4;
                llp g = jucVar.g();
                jtr e = jucVar.e();
                jsw e2 = jsx.e();
                juu juuVar = (juu) obj5;
                e2.c(juuVar.o());
                e2.e(juuVar.q());
                e2.d(juuVar.p());
                e2.b(juuVar.n());
                e2.a();
                ((jzd) obj).s(g, e);
                return;
            case 8:
                Object obj6 = this.a;
                Object obj7 = this.b;
                long j2 = jzc.a;
                juc jucVar2 = (juc) obj6;
                ((jzd) obj).t(jucVar2.g(), jucVar2.e(), (Throwable) obj7);
                return;
            default:
                Object obj8 = this.b;
                Object obj9 = this.a;
                Object obj10 = jzg.a;
                juu juuVar2 = (juu) obj8;
                jsr f = juuVar2.f();
                juuVar2.i();
                juuVar2.g();
                ((jzd) obj).h(f, ((jrl) obj9).b);
                return;
        }
    }
}
