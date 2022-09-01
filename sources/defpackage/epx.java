package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* renamed from: epx  reason: default package */
/* loaded from: classes.dex */
public final class epx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/builder/ZipThemePackageFileBuilder");

    public static final void a(String str, byte[] bArr, Map map) {
        if (TextUtils.isEmpty(str)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/builder/ZipThemePackageFileBuilder", "addByteArray", 65, "ZipThemePackageFileBuilder.java")).t("name is empty.");
        } else {
            map.put(str, bArr);
        }
    }
}
