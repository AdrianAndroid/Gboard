package com.google.android.libraries.inputmethod.launchericon;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LauncherIconVisibilityInitializer extends hxz {
    public static void a(Context context) {
        new LauncherIconVisibilityInitializer().d(context);
    }

    public static boolean b(Context context) {
        return (jam.z(context) && (jbt.B(context, R.string.f175210_resource_name_obfuscated_res_0x7f140c57, false) || !jbt.B(context, R.string.f175320_resource_name_obfuscated_res_0x7f140c62, true))) || jam.E(context);
    }

    @Override // defpackage.hxz
    public final boolean c(Context context) {
        if (jam.E(context)) {
            return true;
        }
        return ino.L().aj(R.string.f162530_resource_name_obfuscated_res_0x7f14071e);
    }
}
