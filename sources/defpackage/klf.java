package defpackage;

/* compiled from: PG */
/* renamed from: klf  reason: default package */
/* loaded from: classes.dex */
public final class klf extends nfm implements nha {
    public static final klf h;
    private static volatile nhf i;
    public int a;
    public long e;
    public long f;
    public String b = "";
    public nem c = nem.b;
    public String d = "";
    public nga g = nhi.b;

    static {
        klf klfVar = new klf();
        h = klfVar;
        nfm.L(klf.class, klfVar);
    }

    private klf() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return K(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", klg.class, "f"});
            }
            if (i3 == 3) {
                return new klf();
            }
            if (i3 == 4) {
                return new nfh(h);
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            nhf nhfVar = i;
            if (nhfVar == null) {
                synchronized (klf.class) {
                    nhfVar = i;
                    if (nhfVar == null) {
                        nhfVar = new nfi(h);
                        i = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
