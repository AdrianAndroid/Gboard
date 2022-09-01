package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cy  reason: default package */
/* loaded from: classes.dex */
public final class cy {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static final int b(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public static final boolean c(Context context) {
        return context.getResources().getBoolean(R.bool.f19290_resource_name_obfuscated_res_0x7f050000);
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }
}
