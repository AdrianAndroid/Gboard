package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: jar  reason: default package */
/* loaded from: classes.dex */
public final class jar {
    private static final lug a = hin.a;

    public static jav a(InputMethodSubtype inputMethodSubtype) {
        if (inputMethodSubtype == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            String languageTag = inputMethodSubtype.getLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                try {
                    return jav.f(languageTag);
                } catch (RuntimeException e) {
                    ((luc) ((luc) ((luc) a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/InputMethodSubtypeUtil", "getLanguageTagCompat", 135, "InputMethodSubtypeUtil.java")).w("fail to get language tag for %s", languageTag);
                }
            }
        }
        String locale = inputMethodSubtype.getLocale();
        if (!TextUtils.isEmpty(locale)) {
            try {
                return jav.e(locale);
            } catch (RuntimeException e2) {
                ((luc) ((luc) ((luc) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/InputMethodSubtypeUtil", "getLanguageTagCompat", 145, "InputMethodSubtypeUtil.java")).w("fail to get language tag for %s", locale);
            }
        }
        return null;
    }
}
