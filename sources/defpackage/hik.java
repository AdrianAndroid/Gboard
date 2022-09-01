package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: hik  reason: default package */
/* loaded from: classes.dex */
public final class hik {
    public static final /* synthetic */ int a = 0;
    private static final String b = "\\{type=|, finalValue=|, ";
    private static final String c = "=|, ";
    private static final String d = "=|\\}$";
    private static final String e;
    private static final Map f;
    private static final String g;

    static {
        String E = nxp.E(hie.values(), c, b, d, kls.b, 24);
        e = E;
        lfy.g(E);
        Map l = nxp.l(oix.b(hie.DEFAULT, "defaultValue"), oix.b(hie.PHENOTYPE, "flagValue"), oix.b(hie.OVERRIDE, "overrideValue"), oix.b(hie.HERMETRIC_OVERRIDE, "hermeticFileOverrideVale"));
        f = l;
        String w = nxp.w(l.values(), c, b, d, null, 56);
        g = w;
        lfy.g(w);
    }

    public static final hih a(Object obj) {
        if (obj instanceof Boolean) {
            nfh t = hih.c.t();
            oll.d(t, "newBuilder()");
            hek e2 = oll.e(t, "builder");
            boolean booleanValue = ((Boolean) obj).booleanValue();
            nfh nfhVar = (nfh) e2.b;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            hih hihVar = (hih) nfhVar.b;
            hihVar.a = 1;
            hihVar.b = Boolean.valueOf(booleanValue);
            return e2.a();
        } else if (obj instanceof Long) {
            nfh t2 = hih.c.t();
            oll.d(t2, "newBuilder()");
            hek e3 = oll.e(t2, "builder");
            e3.c(((Number) obj).longValue());
            return e3.a();
        } else if (obj instanceof Integer) {
            nfh t3 = hih.c.t();
            oll.d(t3, "newBuilder()");
            hek e4 = oll.e(t3, "builder");
            e4.c(((Number) obj).intValue());
            return e4.a();
        } else if (obj instanceof Double) {
            nfh t4 = hih.c.t();
            oll.d(t4, "newBuilder()");
            hek e5 = oll.e(t4, "builder");
            e5.b(((Number) obj).doubleValue());
            return e5.a();
        } else if (obj instanceof Float) {
            nfh t5 = hih.c.t();
            oll.d(t5, "newBuilder()");
            hek e6 = oll.e(t5, "builder");
            e6.b(((Number) obj).floatValue());
            return e6.a();
        } else if (obj instanceof String) {
            nfh t6 = hih.c.t();
            oll.d(t6, "newBuilder()");
            hek e7 = oll.e(t6, "builder");
            String str = (String) obj;
            oll.e(str, "value");
            nfh nfhVar2 = (nfh) e7.b;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            hih hihVar2 = (hih) nfhVar2.b;
            str.getClass();
            hihVar2.a = 4;
            hihVar2.b = str;
            return e7.a();
        } else if (!(obj instanceof byte[])) {
            return null;
        } else {
            nfh t7 = hih.c.t();
            oll.d(t7, "newBuilder()");
            hek e8 = oll.e(t7, "builder");
            nem u = nem.u((byte[]) obj);
            nfh nfhVar3 = (nfh) e8.b;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            hih hihVar3 = (hih) nfhVar3.b;
            hihVar3.a = 5;
            hihVar3.b = u;
            return e8.a();
        }
    }
}
