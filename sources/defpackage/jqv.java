package defpackage;

/* compiled from: PG */
/* renamed from: jqv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jqv implements jnf {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ jqv(String str, int i, String str2, jpz jpzVar, int i2) {
        this.e = i2;
        this.c = str;
        this.a = i;
        this.b = str2;
        this.d = jpzVar;
    }

    public /* synthetic */ jqv(jsr jsrVar, juc jucVar, String str, int i, int i2) {
        this.e = i2;
        this.d = jsrVar;
        this.c = jucVar;
        this.b = str;
        this.a = i;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        if (this.e == 0) {
            Object obj2 = this.c;
            int i = this.a;
            ((jra) obj).l(jtr.c((String) obj2, i), this.b, (Throwable) this.d);
            return;
        }
        Object obj3 = this.d;
        Object obj4 = this.c;
        String str = this.b;
        int i2 = this.a;
        jra jraVar = (jra) obj;
        jtr e = ((juc) obj4).e();
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        jraVar.m((jsr) obj3, e, str, z);
    }
}
