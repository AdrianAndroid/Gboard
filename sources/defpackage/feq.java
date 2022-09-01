package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: feq  reason: default package */
/* loaded from: classes.dex */
public final class feq {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackUtils");

    public static jav a(juc jucVar) {
        String b = jucVar.n().b("language-tag", null);
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackUtils", "getLanguageTag", 48, "SpeechPackUtils.java")).w("getLanguageTag() : Missing field '%s'", "language-tag");
            return null;
        }
        try {
            return jav.f(b);
        } catch (IllegalArgumentException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackUtils", "getLanguageTag", 55, "SpeechPackUtils.java")).G("getLanguageTag() : Invalid '%s' = '%s'", "language-tag", b);
            return null;
        }
    }

    public static juc b(Collection collection, jav javVar) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            juc jucVar = (juc) it.next();
            if (javVar.equals(a(jucVar))) {
                return jucVar;
            }
        }
        return null;
    }
}
