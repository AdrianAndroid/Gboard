package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: eyg  reason: default package */
/* loaded from: classes.dex */
public final class eyg {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksUtils");

    public static jav a(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksUtils", "getLanguageTag", 45, "SanityCheckEvalSuperpacksUtils.java")).t("getLocaleFromManifest() : Received null or empty locale");
            return null;
        }
        Parcelable.Creator creator = jav.CREATOR;
        try {
            return jav.f(str);
        } catch (IllegalArgumentException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksUtils", "getLanguageTag", 53, "SanityCheckEvalSuperpacksUtils.java")).w("getLocaleFromManifest() : Invalid language tag: %s", str);
            return null;
        }
    }

    public static juc b(jav javVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            juc jucVar = (juc) it.next();
            if (jdg.W(a(jucVar.n().b("locale", null)), javVar)) {
                return jucVar;
            }
        }
        return null;
    }
}
