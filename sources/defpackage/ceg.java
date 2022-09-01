package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ceg  reason: default package */
/* loaded from: classes.dex */
public final class ceg {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/personaldictionary/PersonalLanguageModelUpdater");
    public final Context b;
    public Delight5Facilitator c;
    public final Map d = new HashMap();

    public ceg(Context context) {
        this.b = context;
    }

    public static String c(Locale locale) {
        String valueOf = String.valueOf(locale);
        return "Personal." + valueOf + ".dict";
    }

    public final mvm a(Locale locale) {
        return cbw.c(mvl.PERSONAL_DICTIONARY, new File(cbd.c.d(this.b), c(locale)), locale);
    }

    public final mwf b(List list) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            if (list.contains(entry.getKey())) {
                hashMap.putAll((Map) entry.getValue());
            }
        }
        nfh t = mwf.d.t();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            t.dU((String) entry2.getKey());
            t.dV((String) entry2.getValue());
        }
        return (mwf) t.cz();
    }
}
