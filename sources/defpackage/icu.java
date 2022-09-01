package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: icu  reason: default package */
/* loaded from: classes.dex */
public final class icu {
    public static final void a(String str, String str2, ics icsVar, Context context, jfy jfyVar, icv icvVar) {
        try {
            icsVar.e(context, str, str2, icsVar.p);
            for (iak iakVar : icsVar.b) {
                iakVar.e(context, str, str2, icsVar.p);
            }
            icvVar.b.add(icsVar.c());
        } catch (XmlPullParserException e) {
            throw jfyVar.c(e.getMessage());
        }
    }

    public static int b(long j) {
        int i = h(j) ? 1048576 : f(j) ? 1 : 0;
        if ((j & 4) == 4) {
            i |= 2;
        }
        if ((j & 8) == 8) {
            i |= 4096;
        }
        return (j & 16) == 16 ? 65536 | i : i;
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if ((j3 & 2) == 2) {
            return h(j2) ? R.string.f148550_resource_name_obfuscated_res_0x7f1400b4 : R.string.f166230_resource_name_obfuscated_res_0x7f1408c3;
        } else if ((j3 & 64) != 64) {
            return 0;
        } else {
            if (f(j2)) {
                return R.string.f166240_resource_name_obfuscated_res_0x7f1408c4;
            }
            if (i(j2)) {
                return 0;
            }
            return R.string.f166230_resource_name_obfuscated_res_0x7f1408c3;
        }
    }

    public static boolean d(long j) {
        return (j & 17592186044419L) == 17592186044419L;
    }

    public static boolean e(long j) {
        return (j & 512) == 512;
    }

    public static boolean f(long j) {
        return (j & 65) == 65;
    }

    public static boolean g(long j) {
        return (j & 33) == 33;
    }

    public static boolean h(long j) {
        return (j & 3) == 3;
    }

    public static boolean i(long j) {
        return (j & 1) == 1;
    }

    public static boolean j(jfy jfyVar, iaq iaqVar) {
        if ("attrs".equals(jfyVar.b())) {
            iaqVar.b(jfyVar);
            return true;
        }
        return false;
    }

    public static hzr k(hiu hiuVar, Executor executor) {
        hzt hztVar = new hzt(hiuVar);
        hztVar.d(executor);
        return hztVar;
    }

    public static hzr l(hiu hiuVar) {
        return k(hiuVar, gyc.b);
    }

    public static boolean m(int i) {
        return i != 20;
    }

    public static hel n(String str) {
        str.getClass();
        return new hea(str);
    }

    public static hel o(String str) {
        str.getClass();
        return new heb(str);
    }

    public static hei q(hcq hcqVar, int i, int i2, int i3, hbg hbgVar) {
        String c;
        String str = hcqVar.d;
        if (hcqVar.f && (c = hbgVar.c(str)) != null && hdz.a().g(c, hdn.instance.h)) {
            str = c;
        }
        return hei.b(str, i, i2, i3);
    }
}
