package defpackage;

/* compiled from: PG */
/* renamed from: mxr  reason: default package */
/* loaded from: classes2.dex */
public final class mxr extends nfm implements nha {
    public static final mxr l;
    private static volatile nhf n;
    public String a = "global/gboard_version_code";
    public String b = "global/system_locales";
    public String c = "global/enabled_ime_locales";
    public String d = "census/session_total_count";
    public String e = "census/count/";
    public String f = "census/sum/";
    public String g = "census/fetched_local_lms";
    public String h = "build/model";
    public String i = "build/manufacturer";
    public String j = "country/sim";
    public String k = "country/network";
    private int m;

    static {
        mxr mxrVar = new mxr();
        l = mxrVar;
        nfm.L(mxr.class, mxrVar);
    }

    private mxr() {
    }

    @Override // defpackage.nfm
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return K(l, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n", new Object[]{"m", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new mxr();
            }
            if (i2 == 4) {
                return new nfh(l);
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            nhf nhfVar = n;
            if (nhfVar == null) {
                synchronized (mxr.class) {
                    nhfVar = n;
                    if (nhfVar == null) {
                        nhfVar = new nfi(l);
                        n = nhfVar;
                    }
                }
            }
            return nhfVar;
        }
        return (byte) 1;
    }
}
