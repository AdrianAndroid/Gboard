package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dhr  reason: default package */
/* loaded from: classes.dex */
public final class dhr {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacksUtil");

    public static boolean a(hqt hqtVar) {
        return hqtVar != null && TextUtils.equals(hqtVar.p(), "handwriting");
    }

    public static String b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("pack_mapping_v1_lstm")) {
                return str;
            }
        }
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingSuperpacksUtil", "getPackMappingPackName", 39, "HandwritingSuperpacksUtil.java")).w("No pack mapping pack found in %s", set);
        return null;
    }
}
