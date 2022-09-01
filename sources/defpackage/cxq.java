package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cxq  reason: default package */
/* loaded from: classes.dex */
public final class cxq {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/expression/superpackscommon/ExpressionSuperpacksUtils");
    public static final lfy a = lfy.c(',').b().h();

    public static juc a(Context context, Locale locale, Collection collection) {
        juc jucVar;
        llp g;
        Iterator it = jaz.a(context, locale).iterator();
        do {
            jucVar = null;
            if (!it.hasNext()) {
                break;
            }
            Locale locale2 = (Locale) it.next();
            Iterator it2 = collection.iterator();
            while (true) {
                if (it2.hasNext()) {
                    juc jucVar2 = (juc) it2.next();
                    String b2 = b(jucVar2);
                    if (!TextUtils.isEmpty(b2)) {
                        Iterable<String> i = a.i(b2);
                        llk e = llp.e();
                        for (String str : i) {
                            e.h(jay.f(str));
                        }
                        g = e.g();
                    } else {
                        ((ltd) b.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/superpackscommon/ExpressionSuperpacksUtils", "getSupportedLocalesList", 116, "ExpressionSuperpacksUtils.java")).t("getSupportedLocalesList() : Could not get supported locales from manifest.");
                        g = null;
                    }
                    if (g != null) {
                        int i2 = ((lrl) g).c;
                        int i3 = 0;
                        while (i3 < i2) {
                            int i4 = i3 + 1;
                            if (jay.i(locale2, (Locale) g.get(i3))) {
                                jucVar = jucVar2;
                                continue;
                                break;
                            }
                            i3 = i4;
                        }
                        continue;
                    }
                }
            }
        } while (jucVar == null);
        return jucVar;
    }

    public static String b(juc jucVar) {
        return jucVar.n().b("locales", "");
    }
}
