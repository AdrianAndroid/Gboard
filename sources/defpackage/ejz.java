package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ejz  reason: default package */
/* loaded from: classes.dex */
public final class ejz {
    public static final hhl a = hhq.a("enable_variants_popup_in_universal_media", true);
    public static final hhl b = hhq.a("enable_variants_indicator_in_universal_media", false);
    private static hhl c;

    public static hhl a(Context context) {
        if (c == null) {
            c = hhq.f("universal_media_m2_max_num_stickers", jbt.h(context, R.attr.f7280_resource_name_obfuscated_res_0x7f04020e));
        }
        return c;
    }
}
