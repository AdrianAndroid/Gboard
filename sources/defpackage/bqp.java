package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bqp  reason: default package */
/* loaded from: classes.dex */
public final class bqp {
    public static final hhl a = hhq.a("native_language_hint_show_overlay", false);
    public static final hhl b = hhq.a("native_language_hint_show_search_overlay", false);
    public static final hhl c = hhq.a("native_language_hint_by_sim_country", false);
    public static final hhl d = hhq.a("native_language_hint_by_system_locales", false);
    static final hhl e = hhq.f("native_language_hint_show_notice_max_times", 3);
    static final hhl f = hhq.f("native_language_hint_show_search_notice_max_times", 0);
    static final hhl g = hhq.f("native_language_hint_delay", 3);
    public final Map h = new qo();
    public final Context i;

    public bqp(Context context) {
        this.i = context;
    }

    public static int a(ino inoVar, boolean z) {
        boolean x;
        int g2;
        long o;
        if (z) {
            x = inoVar.x(R.string.f162140_resource_name_obfuscated_res_0x7f1406f7, false);
        } else {
            x = inoVar.x(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8, false);
        }
        if (x && (g2 = g(inoVar, z)) < f(z)) {
            if (z) {
                o = inoVar.o(R.string.f162120_resource_name_obfuscated_res_0x7f1406f5, 0L);
            } else {
                o = inoVar.o(R.string.f162100_resource_name_obfuscated_res_0x7f1406f3, 0L);
            }
            if (o > 0) {
                if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - o) < ((Long) g.c()).intValue()) {
                    return -1;
                }
            }
            return g2 + 1;
        }
        return -1;
    }

    public static void b(ino inoVar, idk idkVar, int i, boolean z) {
        if (inoVar.n(R.string.f160290_resource_name_obfuscated_res_0x7f14063a, 0) == i) {
            return;
        }
        if (z) {
            inoVar.s(R.string.f160300_resource_name_obfuscated_res_0x7f14063b, i);
            inoVar.t(R.string.f162120_resource_name_obfuscated_res_0x7f1406f5, System.currentTimeMillis());
            idkVar.e(dda.NATIVE_LANGUAGE_HINT_SEARCH_USER_EVENTS, 1);
            return;
        }
        inoVar.s(R.string.f160290_resource_name_obfuscated_res_0x7f14063a, i);
        inoVar.t(R.string.f162100_resource_name_obfuscated_res_0x7f1406f3, System.currentTimeMillis());
        idkVar.e(dda.NATIVE_LANGUAGE_HINT_USER_EVENTS, 1);
    }

    public static boolean c(hqt hqtVar) {
        if (hqtVar != null) {
            return hqtVar.i().r("en");
        }
        return false;
    }

    public static boolean d(EditorInfo editorInfo) {
        return jbt.D(editorInfo) || ham.B(editorInfo);
    }

    public static boolean e(ino inoVar, boolean z) {
        return !z && ((Boolean) a.c()).booleanValue() && !inoVar.x(R.string.f160280_resource_name_obfuscated_res_0x7f140639, false) && g(inoVar, false) < f(false);
    }

    private static int f(boolean z) {
        if (z) {
            return ((Long) f.c()).intValue();
        }
        return ((Long) e.c()).intValue();
    }

    private static int g(ino inoVar, boolean z) {
        if (z) {
            return inoVar.n(R.string.f160300_resource_name_obfuscated_res_0x7f14063b, 0);
        }
        return inoVar.n(R.string.f160290_resource_name_obfuscated_res_0x7f14063a, 0);
    }
}
