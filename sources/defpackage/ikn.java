package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import j$.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ikn  reason: default package */
/* loaded from: classes.dex */
public final class ikn {
    private static final lug a = hin.a;

    public static void a(Context context, Bundle bundle, ikl iklVar) {
        ikh ikhVar = new ikh();
        try {
            Cursor query = ikhVar.a.getReadableDatabase().query("entry", new String[]{"locale"}, null, null, "locale", null, null);
            HashSet<jav> m = lvw.m(query.getCount());
            while (query.moveToNext()) {
                m.add(jav.f(query.getString(0)));
            }
            query.close();
            ikhVar.close();
            m.addAll(ijz.b(context));
            ArrayList parcelableArrayList = bundle == null ? null : bundle.getParcelableArrayList("ARG_KEY_LANGUAGE_TAG_LIST");
            if (parcelableArrayList != null) {
                m.addAll(parcelableArrayList);
            }
            if (m.isEmpty()) {
                ((luc) ((luc) a.d()).k("com/google/android/libraries/inputmethod/personaldictionary/PersonalDictionaryFragmentHelper", "addLanguagesToDelegate", 48, "PersonalDictionaryFragmentHelper.java")).t("Fragment argument ARG_KEY_LANGUAGE_TAG_LIST should not be empty.");
                iklVar.a(ikb.b(context, jav.d), jav.d);
                return;
            }
            ArrayList arrayList = new ArrayList(m.size());
            if (m.size() >= 2 || m.contains(jav.d)) {
                iklVar.a(ikb.b(context, jav.d), jav.d);
            }
            for (jav javVar : m) {
                if (!jav.d.equals(javVar)) {
                    arrayList.add(new ikm(ikb.b(context, javVar), javVar));
                }
            }
            Collections.sort(arrayList, Comparator.CC.comparing(eoe.j));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ikm ikmVar = (ikm) arrayList.get(i);
                iklVar.a(ikmVar.a, ikmVar.b);
            }
        } catch (Throwable th) {
            try {
                ikhVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
