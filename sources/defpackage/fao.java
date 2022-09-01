package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: fao  reason: default package */
/* loaded from: classes.dex */
public final class fao {
    public static final lug a = lug.i("SpeechFactory");
    public static volatile fes b;
    public static volatile fet c;
    public static volatile fet d;
    public static volatile fet e;
    public static volatile fes f;
    public final Context g;
    public volatile WeakReference h = new WeakReference(null);

    public fao(Context context) {
        this.g = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(ffd ffdVar) {
        String d2 = d(ffdVar.a);
        Collection collection = ffdVar.b;
        if (d2 == null && !hgw.f(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext() && (d2 = d((jav) it.next())) == null) {
            }
        }
        return d2;
    }

    public static String c() {
        StringBuilder sb = new StringBuilder();
        p(b, sb, "Primary");
        p(f, sb, "Fallback");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(jav javVar) {
        byy byyVar;
        juc b2;
        fes fesVar = b;
        if (fesVar != null) {
            feb febVar = (feb) fesVar;
            if (febVar.d.k(javVar) && (byyVar = febVar.d.f) != null && (b2 = feq.b(byyVar.g(), javVar)) != null) {
                return b2.i();
            }
            return null;
        }
        return null;
    }

    public static void e() {
        fes fesVar = b;
        if (fesVar != null) {
            ((feb) fesVar).d.j(hqp.b().i());
        } else {
            ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "downloadPacksNow", 322, "SpeechRecognitionFactory.java")).t("downloadPacksNow() triggered without a provider.");
        }
    }

    public static synchronized void f(fet fetVar) {
        synchronized (fao.class) {
            e = fetVar;
        }
    }

    public static synchronized void g(fes fesVar) {
        synchronized (fao.class) {
            f = fesVar;
        }
    }

    public static synchronized void h(fes fesVar) {
        synchronized (fao.class) {
            fes fesVar2 = b;
            b = fesVar;
            if (fesVar2 == null || fesVar != null) {
                return;
            }
            fesVar2.f();
        }
    }

    public static void i(boolean z) {
        if (z) {
            ((luc) ((luc) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "updateOnDeviceUserPreference", 309, "SpeechRecognitionFactory.java")).t("On-device switch enabled by user. Triggering download.");
            e();
            return;
        }
        lug lugVar = a;
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "updateOnDeviceUserPreference", 312, "SpeechRecognitionFactory.java")).t("On-device switch disabled by user. Releasing packs and downloads.");
        fes fesVar = b;
        if (fesVar != null) {
            fesVar.f();
        } else {
            ((luc) ((luc) lugVar.c()).k("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFactory", "cancelDownloadsAndDeletePacks", 331, "SpeechRecognitionFactory.java")).t("cancelDownloadsAndDeletePacks() triggered without a provider.");
        }
    }

    public static synchronized void j(fet fetVar) {
        synchronized (fao.class) {
            c = fetVar;
        }
    }

    public static synchronized void k(fet fetVar) {
        synchronized (fao.class) {
            d = fetVar;
        }
    }

    public static boolean l(Context context, ffd ffdVar) {
        return q(e, context, ffdVar);
    }

    public static boolean m(Context context, ffd ffdVar) {
        return q(f, context, ffdVar);
    }

    public static boolean n(Context context, ffd ffdVar) {
        return q(b, context, ffdVar);
    }

    public static boolean o(Context context, ffd ffdVar) {
        return q(c, context, ffdVar);
    }

    private static void p(fes fesVar, StringBuilder sb, String str) {
        if (fesVar == null) {
            return;
        }
        sb.append(String.format(str.concat(" on-device:\n%s"), fesVar.e()));
    }

    private static boolean q(fet fetVar, Context context, ffd ffdVar) {
        return fetVar != null && fetVar.b(context, ffdVar);
    }

    public final fex a(fet fetVar, ffd ffdVar) {
        if (fetVar == null) {
            return null;
        }
        return fetVar.a(this.g, ffdVar);
    }
}
