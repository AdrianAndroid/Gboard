package defpackage;

/* compiled from: PG */
/* renamed from: kba  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kba implements oiy {
    private final /* synthetic */ int l;
    public static final /* synthetic */ kba k = new kba(10);
    public static final /* synthetic */ kba j = new kba(9);
    public static final /* synthetic */ kba i = new kba(8);
    public static final /* synthetic */ kba h = new kba(7);
    public static final /* synthetic */ kba g = new kba(6);
    public static final /* synthetic */ kba f = new kba(5);
    public static final /* synthetic */ kba e = new kba(4);
    public static final /* synthetic */ kba d = new kba(3);
    public static final /* synthetic */ kba c = new kba(2);
    public static final /* synthetic */ kba b = new kba(1);
    public static final /* synthetic */ kba a = new kba(0);

    private /* synthetic */ kba(int i2) {
        this.l = i2;
    }

    @Override // defpackage.oiy
    public final Object a() {
        switch (this.l) {
            case 0:
                mhd c2 = kct.c();
                c2.b(false);
                return c2.a();
            case 1:
                khd c3 = ked.c();
                c3.d(false);
                return c3.c();
            case 2:
                kgs c4 = kgt.c();
                c4.c(false);
                return c4.a();
            case 3:
                kfj c5 = kfk.c();
                c5.b();
                return c5.a();
            case 4:
                return new ken(null);
            case 5:
                kge kgeVar = new kge(ldu.a);
                jdg.w(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
                return kgeVar;
            case 6:
                khd c6 = khe.c();
                c6.b(false);
                return c6.a();
            case 7:
                kgw c7 = kgx.c();
                c7.b();
                return c7.a();
            case 8:
                return new kdy(null);
            case 9:
                return new khb(new kfl((byte[]) null), ldu.a, null, null);
            default:
                kfp c8 = kfq.c();
                c8.b(false);
                return c8.a();
        }
    }
}
