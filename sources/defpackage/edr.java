package defpackage;

import android.content.res.Resources;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: edr  reason: default package */
/* loaded from: classes.dex */
public final class edr {
    private static final hhl a = hhq.a("enable_proactive_gif_categories_with_icon", false);

    public static int a(cnz cnzVar) {
        mba mbaVar = mba.UNKNOWN;
        int ordinal = cnzVar.b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2 || !((Boolean) a.c()).booleanValue()) {
                return 0;
            }
            return R.drawable.f51020_resource_name_obfuscated_res_0x7f08039e;
        }
        return R.drawable.f49970_resource_name_obfuscated_res_0x7f08031f;
    }

    public static String b(cnz cnzVar, Resources resources) {
        mba mbaVar = mba.UNKNOWN;
        return resources.getString(cnzVar.b.ordinal() != 1 ? R.string.f153000_resource_name_obfuscated_res_0x7f1402b7 : R.string.f152910_resource_name_obfuscated_res_0x7f1402ae, cnzVar.a);
    }

    public static int c(cnz cnzVar) {
        mba mbaVar = mba.UNKNOWN;
        int ordinal = cnzVar.b.ordinal();
        if (ordinal != 1) {
            return (ordinal == 2 && ((Boolean) a.c()).booleanValue()) ? 2 : 1;
        }
        return 3;
    }
}
