package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: feb  reason: default package */
/* loaded from: classes.dex */
public final class feb implements fes {
    public final feo d;
    public final Executor e;
    public final ino f;
    public final ino g;
    public final Context h;
    public final fdy i;
    lmz j;
    private final hhk l;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider");
    static final long b = gvu.GIBIBYTES.b(2);
    private static final lfy k = lfy.c(',');
    static final long c = Duration.ofDays(30).toMillis();

    public feb(Context context) {
        feo c2 = feo.c(context, "speech-packs");
        ino K = ino.K(context, null);
        mks a2 = gxo.a(10);
        fdy fdyVar = new fdy(context, fea.a);
        bvl bvlVar = new bvl(this, 20);
        this.l = bvlVar;
        this.h = context;
        this.d = c2;
        this.e = a2;
        this.f = K;
        this.i = fdyVar;
        h(fbh.h);
        fbh.h.e(bvlVar);
        this.g = ino.M(context);
    }

    public static Instant c(File file) {
        Instant instant = Instant.EPOCH;
        for (File file2 : file.listFiles(exs.d)) {
            Instant ofEpochMilli = Instant.ofEpochMilli(file2.lastModified());
            if (true == instant.isBefore(ofEpochMilli)) {
                instant = ofEpochMilli;
            }
        }
        return instant;
    }

    @Override // defpackage.fet
    public final fex a(Context context, ffd ffdVar) {
        jav javVar;
        File e;
        if (!b(context, ffdVar) || (javVar = ffdVar.a) == null || (e = this.d.e(javVar)) == null) {
            return null;
        }
        return new fej(context, e, d(javVar));
    }

    @Override // defpackage.fet
    public final boolean b(Context context, ffd ffdVar) {
        jav javVar;
        ieh j = ieh.j();
        if (!fdz.b()) {
            j.e(fbm.REASON_ON_DEVICE_RECOGNIZER_CANNOT_HANDLE_VOICE_SESSION, 1);
            return false;
        } else if (!fdz.a(context)) {
            if (!hgw.f(ffdVar.b) || (javVar = ffdVar.a) == null) {
                j.e(fbm.REASON_ON_DEVICE_RECOGNIZER_CANNOT_HANDLE_VOICE_SESSION, 3);
                return false;
            }
            boolean k2 = this.d.k(javVar);
            if (!k2) {
                if (i()) {
                    j.e(fbm.REASON_ON_DEVICE_RECOGNIZER_CANNOT_HANDLE_VOICE_SESSION, 5);
                } else {
                    j.e(fbm.REASON_ON_DEVICE_RECOGNIZER_CANNOT_HANDLE_VOICE_SESSION, 6);
                }
            }
            return k2;
        } else {
            j.e(fbm.REASON_ON_DEVICE_RECOGNIZER_CANNOT_HANDLE_VOICE_SESSION, 2);
            return false;
        }
    }

    public final File d(jav javVar) {
        if (!k(javVar)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "getPersonalizedResourcesDir", 581, "OnDeviceRecognitionProvider.java")).t("Speech personalization is disabled.");
            return null;
        }
        File a2 = exr.a(this.h, javVar);
        if (!a2.isDirectory()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "getPersonalizedResourcesDir", 587, "OnDeviceRecognitionProvider.java")).w("Personalized resources directory does not exist: %s", a2);
            return null;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "getPersonalizedResourcesDir", 591, "OnDeviceRecognitionProvider.java")).w("Using personalized resources directory: %s", a2);
        return a2;
    }

    @Override // defpackage.fes
    public final String e() {
        return this.d.f();
    }

    @Override // defpackage.fes
    public final void f() {
        feo feoVar = this.d;
        ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "cancelDownloadsAndDeletePacks", 335, "SpeechPackManager.java")).t("cancelDownloadsAndDeletePacks()");
        kcu.U(feoVar.c.f(feoVar.e), new eay(feoVar, 14), feoVar.d);
        this.f.f("ondevice_pack_auto_download_started", false);
        if (fdu.d(this.f)) {
            this.f.q(R.string.f162190_resource_name_obfuscated_res_0x7f1406fc, false);
            ieh.j().e(fbm.ON_DEVICE_OPT_OUT_AFTER_AUTO_DOWNLOAD, new Object[0]);
        }
    }

    protected final void finalize() {
        fbh.h.g(this.l);
        super.finalize();
    }

    @Override // defpackage.fes
    public final void g(jav javVar) {
        throw null;
    }

    public final void h(hhl hhlVar) {
        String str = (String) hhlVar.c();
        if (TextUtils.isEmpty(str)) {
            this.j = lrr.a;
        } else {
            this.j = lmz.p(k.k(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0060, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r6 = this;
            llp r0 = defpackage.hqr.b()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L23
            java.lang.Object r4 = r0.get(r3)
            hqt r4 = (defpackage.hqt) r4
            int r3 = r3 + 1
            lmz r5 = r6.j
            jav r4 = r4.i()
            java.lang.String r4 = r4.n
            boolean r4 = r5.contains(r4)
            if (r4 != 0) goto La
            goto L60
        L23:
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = defpackage.feb.c
            ino r5 = r6.f
            long r0 = r0 - r3
            int r0 = defpackage.fby.a(r5, r0)
            long r0 = (long) r0
            r3 = 5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L60
            ino r0 = r6.f
            java.lang.String r1 = "voice_word_commit_number_meets_target"
            boolean r0 = r0.al(r1, r2, r2)
            if (r0 == 0) goto L60
            android.os.StatFs r0 = new android.os.StatFs
            java.io.File r1 = android.os.Environment.getDataDirectory()
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            long r3 = r0.getBlockSizeLong()
            long r0 = r0.getAvailableBlocksLong()
            long r3 = r3 * r0
            long r0 = defpackage.feb.b
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L60
            r0 = 1
            return r0
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feb.i():boolean");
    }

    public final boolean j(jav javVar) {
        return this.d.k(javVar);
    }

    public final boolean k(jav javVar) {
        return ((Boolean) evs.b.c()).booleanValue() && this.g.ak("pref_key_use_personalized_dicts") && javVar.equals(exr.a);
    }
}
