package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cej  reason: default package */
/* loaded from: classes.dex */
public final class cej {
    static {
        lug.i("SuperDelight");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static juc a(Context context, Locale locale, Collection collection, boolean z) {
        for (Locale locale2 : jaz.a(context, locale)) {
            juc c = c(locale2, collection, z);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    public static List b(jsq jsqVar) {
        return jsqVar.c("enabledLocales");
    }

    private static juc d(Locale locale, Collection collection) {
        Iterator it = collection.iterator();
        juc jucVar = null;
        long j = 0;
        while (it.hasNext()) {
            juc jucVar2 = (juc) it.next();
            Locale g = cei.g(jucVar2);
            if (g != null && g.equals(locale)) {
                long longValue = cei.f(jucVar2).longValue();
                if (longValue >= j) {
                    jucVar = jucVar2;
                    j = longValue;
                }
            }
        }
        return jucVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static juc c(Locale locale, Collection collection, boolean z) {
        if (z) {
            cdx cdxVar = cdx.a;
            juc jucVar = null;
            Locale c = (cdxVar != null && cdx.f()) ? cdxVar.c(locale) : null;
            if (c != null) {
                jucVar = d(c, collection);
            }
            return (jucVar != null || locale.equals(c)) ? jucVar : d(locale, collection);
        }
        return d(locale, collection);
    }
}
