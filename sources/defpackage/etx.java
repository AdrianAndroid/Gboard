package defpackage;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: etx  reason: default package */
/* loaded from: classes.dex */
final class etx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingHelper");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final juc a(String str, Collection collection) {
        Iterator it = collection.iterator();
        juc jucVar = null;
        while (it.hasNext()) {
            juc jucVar2 = (juc) it.next();
            String b = jucVar2.n().b("locale", "");
            if (TextUtils.isEmpty(b)) {
                if (jucVar != null) {
                    ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingHelper", "getSuitablePackManifest", 49, "ThemeListingHelper.java")).t("Found more than one default manifest.");
                }
                jucVar = jucVar2;
            } else if (str.equals(b)) {
                return jucVar2;
            }
        }
        return jucVar;
    }
}
