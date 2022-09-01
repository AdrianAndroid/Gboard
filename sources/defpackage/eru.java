package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* renamed from: eru  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eru {
    public static String b(Context context, eve eveVar) {
        char c;
        Locale locale = context.getResources().getConfiguration().locale;
        Iterator it = eveVar.f.iterator();
        String str = null;
        char c2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            evb evbVar = (evb) it.next();
            Locale forLanguageTag = Locale.forLanguageTag(evbVar.c);
            if (forLanguageTag.equals(locale)) {
                str = evbVar.b;
                break;
            } else if (forLanguageTag.getLanguage().equals(locale.getLanguage())) {
                if (forLanguageTag.getCountry().equals(locale.getCountry())) {
                    c = forLanguageTag.getVariant().equals(locale.getVariant()) ? (char) 3 : (char) 2;
                } else {
                    c = 1;
                }
                if (c > c2) {
                    str = evbVar.b;
                    c2 = c;
                }
            }
        }
        return str != null ? str : eveVar.e;
    }

    public static List c(eve eveVar, Set set) {
        ArrayList arrayList = new ArrayList(eveVar.c);
        for (evd evdVar : eveVar.d) {
            evc b = evc.b(evdVar.b);
            if (b == null) {
                b = evc.INVALID;
            }
            if (set.contains(b)) {
                arrayList.addAll(evdVar.c);
            }
        }
        return arrayList;
    }
}
