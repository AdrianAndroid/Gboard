package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eqx  reason: default package */
/* loaded from: classes.dex */
public final class eqx {
    public static final /* synthetic */ int a = 0;
    private static Set d;
    private static Set e;
    private static final gwa b = new gwa();
    private static String c = "";
    private static Map f = lrq.b;
    private static eqw g = null;

    static {
        lrr lrrVar = lrr.a;
        d = lrrVar;
        e = lrrVar;
    }

    private eqx() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0236 A[Catch: all -> 0x035f, TryCatch #1 {, blocks: (B:50:0x012f, B:52:0x0137, B:54:0x013f, B:56:0x0147, B:58:0x014f, B:60:0x0153, B:63:0x0155, B:66:0x0162, B:68:0x0179, B:69:0x0194, B:70:0x01ad, B:72:0x01b3, B:74:0x01bf, B:76:0x01c7, B:77:0x01c9, B:80:0x01cf, B:82:0x01d6, B:84:0x01e0, B:86:0x0202, B:88:0x0206, B:90:0x0236, B:91:0x0238, B:92:0x023e, B:94:0x0244, B:96:0x0252, B:97:0x0254, B:99:0x026d, B:103:0x0314, B:107:0x028b, B:109:0x0293, B:110:0x02ea, B:112:0x02f0, B:113:0x030d, B:114:0x029b, B:116:0x02ad, B:117:0x02c9, B:119:0x02ce, B:123:0x0209, B:125:0x020e, B:127:0x021c, B:128:0x021e, B:129:0x0228, B:131:0x022c, B:133:0x0230, B:137:0x0319, B:138:0x032a, B:140:0x0330, B:142:0x0344, B:144:0x0352, B:147:0x0356, B:148:0x035d), top: B:49:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0244 A[Catch: all -> 0x035f, TryCatch #1 {, blocks: (B:50:0x012f, B:52:0x0137, B:54:0x013f, B:56:0x0147, B:58:0x014f, B:60:0x0153, B:63:0x0155, B:66:0x0162, B:68:0x0179, B:69:0x0194, B:70:0x01ad, B:72:0x01b3, B:74:0x01bf, B:76:0x01c7, B:77:0x01c9, B:80:0x01cf, B:82:0x01d6, B:84:0x01e0, B:86:0x0202, B:88:0x0206, B:90:0x0236, B:91:0x0238, B:92:0x023e, B:94:0x0244, B:96:0x0252, B:97:0x0254, B:99:0x026d, B:103:0x0314, B:107:0x028b, B:109:0x0293, B:110:0x02ea, B:112:0x02f0, B:113:0x030d, B:114:0x029b, B:116:0x02ad, B:117:0x02c9, B:119:0x02ce, B:123:0x0209, B:125:0x020e, B:127:0x021c, B:128:0x021e, B:129:0x0228, B:131:0x022c, B:133:0x0230, B:137:0x0319, B:138:0x032a, B:140:0x0330, B:142:0x0344, B:144:0x0352, B:147:0x0356, B:148:0x035d), top: B:49:0x012f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eqw a(android.content.Context r13, defpackage.eri r14, java.util.Set r15) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqx.a(android.content.Context, eri, java.util.Set):eqw");
    }

    static gwk b(Context context) {
        return (gwk) b.a(new drf(context, 20));
    }

    static String c(eri eriVar, List list, Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append(eriVar.f());
        llp y = llp.y(set);
        int i = ((lrl) y).c;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append('_');
            sb.append(((evc) y.get(i2)).o);
        }
        lex c2 = lex.c('_');
        String a2 = jbs.a(c2.f(list));
        sb.append('_');
        sb.append(a2);
        c2.f(list);
        return sb.toString();
    }

    private static float d(Context context) {
        if (itb.n()) {
            return -1.0f;
        }
        return jbt.a(context, R.string.f175040_resource_name_obfuscated_res_0x7f140c46, -1.0f);
    }
}
