package defpackage;

/* compiled from: PG */
/* renamed from: jqp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jqp implements jnf {
    private final /* synthetic */ int d;
    public static final /* synthetic */ jqp c = new jqp(5);
    public static final /* synthetic */ jqp b = new jqp(4);
    public static final /* synthetic */ jqp a = new jqp(3);

    public /* synthetic */ jqp(int i) {
        this.d = i;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((jrc) obj).a();
        } else if (i == 1) {
            ((jrc) obj).c();
        } else if (i == 2) {
            ((jrc) obj).a();
        } else if (i == 3) {
            ((Runnable) obj).run();
        } else if (i != 4) {
            ((jzd) obj).u();
        } else {
            jsx jsxVar = (jsx) obj;
            int i2 = jyy.a;
            lug lugVar = jsh.a;
        }
    }
}
