package defpackage;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: feo  reason: default package */
/* loaded from: classes.dex */
public final class feo {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager");
    public static final llw b = llw.n("speech-packs", ffa.q, "gboard-small-speech-packs", ffa.r, "ondevice-eval-audio-packs", ffa.s);
    private static final llw h = llw.n("speech-packs", llp.s(ffa.a, ffa.q), "gboard-small-speech-packs", llp.r(ffa.r), "ondevice-eval-audio-packs", llp.r(ffa.s));
    private static final qo i = new qo();
    private static volatile feu j;
    public final bze c;
    public final Executor d;
    public final String e;
    public volatile byy f;
    volatile String g;
    private final hho k;

    private feo(Context context, String str, bze bzeVar, Executor executor) {
        bya byaVar = new bya(this, 4);
        this.k = byaVar;
        this.c = bzeVar;
        this.e = str;
        this.d = executor;
        bzt a2 = bzu.a(str);
        a2.e = 300;
        a2.f = 300;
        a2.g = new fen(this, context);
        bzeVar.i(a2.a());
        llp llpVar = (llp) h.get(str);
        if (llpVar != null) {
            hhq.o(byaVar, llpVar);
        }
    }

    protected static int a(String str) {
        return Objects.hashCode(str) & Integer.MAX_VALUE;
    }

    public static synchronized feo c(Context context, String str) {
        synchronized (feo.class) {
            qo qoVar = i;
            feo feoVar = (feo) qoVar.get(str);
            if (feoVar == null) {
                Context applicationContext = context.getApplicationContext();
                bze a2 = bzd.a(applicationContext);
                hrx.y(applicationContext);
                feo feoVar2 = new feo(applicationContext, str, a2, gxo.a(10));
                qoVar.put(str, feoVar2);
                return feoVar2;
            }
            return feoVar;
        }
    }

    public static List l(File file) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                arrayList.addAll(l(file2));
            } else if (file2.getName().endsWith("wav")) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    private final void m(Pair pair) {
        kcu.U(mio.h((mko) pair.second, new eoi(this, 13), this.d), new fel(this, pair, 0), this.d);
    }

    public final Pair b() {
        String str = (String) ((hhl) b.get(this.e)).c();
        int a2 = a(str);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "registerManifest", 454, "SpeechPackManager.java")).w("registerManifest() : %s", str);
        return Pair.create(str, mio.h(this.c.c(this.e), new dke(this, a2, str, 2), this.d));
    }

    public final mko d(jav javVar) {
        String str = (String) ((hhl) b.get(this.e)).c();
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "isPackAvailableToDownload", 217, "SpeechPackManager.java")).G("isPackAvailableToDownload() : LanguageTag = %s : ManifestUrl = %s", javVar, str);
        return mio.h(this.c.d(this.e, a(str)), new dvb(str, javVar, 13), this.d);
    }

    public final File e(jav javVar) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "getSpeechPack", 242, "SpeechPackManager.java")).w("getSpeechPack() : LanguageTag = %s", javVar);
        byy byyVar = this.f;
        if (byyVar == null) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "getSpeechPack", 250, "SpeechPackManager.java")).t("getSpeechPack() : PackSet cache is null");
            return null;
        }
        juc b2 = feq.b(byyVar.g(), javVar);
        if (b2 == null) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "getSpeechPack", 257, "SpeechPackManager.java")).t("getSpeechPack() : Pack manifest is null");
            return null;
        }
        File f = byyVar.f(b2.i());
        if (!f.exists()) {
            return null;
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "getSpeechPack", 263, "SpeechPackManager.java")).w("getSpeechPack() : Returning %s", f.getAbsolutePath());
        return f;
    }

    public final String f() {
        int parseInt;
        StringBuilder sb = new StringBuilder();
        if (((Boolean) ffa.d.c()).booleanValue()) {
            sb.append(String.format(Locale.US, "  Manifest URL: %s\n", this.g));
        }
        byy byyVar = this.f;
        if (byyVar == null || byyVar.g().isEmpty()) {
            sb.append("  No packs\n");
            return sb.toString();
        }
        sb.append("  Packs:\n");
        for (juc jucVar : byyVar.g()) {
            jav a2 = feq.a(jucVar);
            String b2 = jucVar.n().b("version", null);
            if (b2 == null) {
                ((ltd) ((ltd) feq.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackUtils", "getVersion", 74, "SpeechPackUtils.java")).w("getVersion() : Missing field '%s'", "version");
            } else {
                try {
                    parseInt = Integer.parseInt(b2);
                } catch (NumberFormatException e) {
                    ((ltd) ((ltd) ((ltd) feq.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackUtils", "getVersion", 80, "SpeechPackUtils.java")).G("getVersion() : Invalid '%s' = '%s'", "version", b2);
                }
                if (a2 != null && parseInt > 0) {
                    sb.append(String.format(Locale.US, "    %s : %d\n", a2, Integer.valueOf(parseInt)));
                }
            }
            parseInt = 0;
            if (a2 != null) {
                sb.append(String.format(Locale.US, "    %s : %d\n", a2, Integer.valueOf(parseInt)));
            }
        }
        return sb.toString();
    }

    public final void g() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "init", 170, "SpeechPackManager.java")).t("init()");
        m(b());
    }

    public final void h(final boolean z, final boolean z2, final boolean z3, jav javVar) {
        llp b2 = hqr.b();
        final ArrayList arrayList = new ArrayList();
        arrayList.add(javVar);
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            jav i3 = ((hqt) b2.get(i2)).i();
            if (!i3.equals(javVar) && k(i3)) {
                arrayList.add(i3);
            }
        }
        Pair b3 = b();
        m(Pair.create((String) b3.first, mio.h((mko) b3.second, new miy() { // from class: fek
            @Override // defpackage.miy
            public final mko a(Object obj) {
                feo feoVar = feo.this;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                List list = arrayList;
                bze bzeVar = feoVar.c;
                String str = feoVar.e;
                fep fepVar = new fep(((bzr) bzeVar).j);
                boolean booleanValue = ((Boolean) ffa.d.c()).booleanValue();
                jyu g = jsq.g();
                g.e("FORCE_UPDATES", Boolean.valueOf(booleanValue));
                g.e("FOREGROUND", Boolean.valueOf(z4));
                g.e("WIFI_ONLY", Boolean.valueOf(z5));
                g.e("CHARGING_ONLY", Boolean.valueOf(z6));
                g.e("LANGUAGE_TAGS", list);
                return bzeVar.h(str, fepVar, g.b());
            }
        }, this.d)));
    }

    public final void i(jav javVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "syncPacks", 328, "SpeechPackManager.java")).t("syncPacks()");
        h(false, true, true, javVar);
    }

    public final void j(jav javVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "syncPacksNow", 309, "SpeechPackManager.java")).t("syncPacksNow()");
        h(true, false, false, javVar);
    }

    public final boolean k(jav javVar) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "isPackAvailableOnDisk", 198, "SpeechPackManager.java")).w("isPackAvailableOnDisk() : LanguageTag = %s", javVar);
        byy byyVar = this.f;
        if (byyVar != null) {
            return feq.b(byyVar.g(), javVar) != null;
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "isPackAvailableOnDisk", 206, "SpeechPackManager.java")).t("isPackAvailableOnDisk(): PackSet cache is null");
        return false;
    }
}
