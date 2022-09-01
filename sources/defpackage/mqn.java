package defpackage;

/* compiled from: PG */
/* renamed from: mqn  reason: default package */
/* loaded from: classes2.dex */
public final class mqn extends nfm implements nha {
    public static final mqn j;
    private static volatile nhf k;
    public int a;
    public int f;
    public float h;
    public float i;
    public float b = 1.0f;
    public float c = 0.8f;
    public float d = 0.7f;
    public float e = 0.6f;
    public int g = 12;

    static {
        mqn mqnVar = new mqn();
        j = mqnVar;
        nfm.L(mqn.class, mqnVar);
    }

    private mqn() {
    }

    public static nfh b() {
        return j.t();
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0000\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bခ\u0007\tခ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new mqn();
            }
            if (i2 == 4) {
                return new nfh(j);
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = k;
            if (nhfVar == null) {
                synchronized (mqn.class) {
                    nhfVar = k;
                    if (nhfVar == null) {
                        nhfVar = new nfi(j);
                        k = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
