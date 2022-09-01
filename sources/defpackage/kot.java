package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: kot  reason: default package */
/* loaded from: classes.dex */
public final class kot {
    public static final lfy a = lfy.e(".");

    public static boolean a(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return TextUtils.equals(str, "*.lease");
    }

    public static boolean b(String str) {
        return str.endsWith(".lease");
    }
}
