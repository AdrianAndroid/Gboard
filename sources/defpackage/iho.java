package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iho  reason: default package */
/* loaded from: classes.dex */
public final class iho {
    public static final hhl a = hhq.a("hide_abc_key_on_expression_nav_footer", false);
    public static final hhl b = hhq.a("enable_nav_redesign_for_voice", false);
    private static volatile hhl c;

    public static hhl a(Context context) {
        if (c == null) {
            c = hhq.c(context, R.string.f151550_resource_name_obfuscated_res_0x7f140213);
        }
        return c;
    }
}
