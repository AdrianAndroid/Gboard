package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: drl  reason: default package */
/* loaded from: classes.dex */
public final class drl {
    private static final lug a = lug.i("MozcShortcutsData");

    public static String a(List list, String str) {
        if (list.size() > 2000) {
            ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcShortcutsUtil", "toUserDictionaryStringWithPos", 132, "MozcShortcutsUtil.java")).u("Too many records exist: %d", list.size());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            drk drkVar = (drk) it.next();
            sb.append(drkVar.a.toLowerCase(Locale.US));
            sb.append('\t');
            sb.append(drkVar.b);
            sb.append('\t');
            sb.append(str);
            if (!TextUtils.isEmpty(drkVar.c)) {
                sb.append(':');
                sb.append(drkVar.c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static List b(List list) {
        return list.size() > 2000 ? list.subList(0, 2000) : list;
    }

    public static boolean c(String str) {
        if (d(str)) {
            int i = 0;
            while (i < str.length()) {
                int codePointAt = str.codePointAt(i);
                if ((codePointAt < 33 || codePointAt > 126) && ((codePointAt < 12353 || codePointAt > 12438) && ((codePointAt < 12443 || codePointAt > 12444) && ((codePointAt < 12449 || codePointAt > 12534) && ((codePointAt < 12539 || codePointAt > 12540) && ((codePointAt < 12289 || codePointAt > 12290) && ((codePointAt < 12300 || codePointAt > 12303) && ((codePointAt < 12316 || codePointAt > 12316) && ((codePointAt < 65281 || codePointAt > 65374) && (codePointAt < 65377 || codePointAt > 65439)))))))))) {
                    return false;
                }
                i += Character.charCount(codePointAt);
            }
            return true;
        }
        return false;
    }

    public static boolean d(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 256;
    }

    public static byte[] e(List list) {
        lxv b = lxy.b().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            drk drkVar = (drk) it.next();
            b.e(drkVar.a);
            b.e(drkVar.b);
        }
        return b.k().e();
    }
}
