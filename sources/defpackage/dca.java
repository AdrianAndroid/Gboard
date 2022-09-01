package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dca  reason: default package */
/* loaded from: classes.dex */
public final class dca {
    public static final hhl a = hhq.f("reduce_logging_max_candidates_to_log", 3);
    public static final hhl b = hhq.a("transparent_nav_bar_in_floating", false);
    public static final hhl c = hhq.a("enable_avt_by_default_for_multilang", false);
    private static hhl d;

    public static hhl a(Context context) {
        if (d == null) {
            d = hhq.c(context, R.string.f151510_resource_name_obfuscated_res_0x7f14020f);
        }
        return d;
    }

    public static boolean b(Context context) {
        return ((Boolean) a(context).c()).booleanValue();
    }
}
