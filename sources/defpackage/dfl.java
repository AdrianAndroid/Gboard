package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dfl  reason: default package */
/* loaded from: classes.dex */
public final class dfl {
    public static final int[] a = {2, 3, 4};

    public static void a(ino inoVar, boolean z, boolean z2) {
        int i = true != z ? 2 : 1;
        if (z2) {
            inoVar.s(R.string.f162340_resource_name_obfuscated_res_0x7f14070b, i);
            if (z) {
                inoVar.t(R.string.f162110_resource_name_obfuscated_res_0x7f1406f4, System.currentTimeMillis());
            }
            ieh.j().e(dda.NATIVE_LANGUAGE_HINT_SEARCH_OVERLAY_RESULT, Boolean.valueOf(z));
            return;
        }
        inoVar.s(R.string.f162270_resource_name_obfuscated_res_0x7f140704, i);
        if (z) {
            inoVar.t(R.string.f162090_resource_name_obfuscated_res_0x7f1406f2, System.currentTimeMillis());
        }
        ieh.j().e(dda.NATIVE_LANGUAGE_HINT_OVERLAY_RESULT, Boolean.valueOf(z));
    }
}
