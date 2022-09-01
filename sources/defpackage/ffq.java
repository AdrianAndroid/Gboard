package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ffq  reason: default package */
/* loaded from: classes.dex */
public final class ffq implements fes {
    public final feo c;
    lmz d;
    private final Executor g;
    private final ino h;
    private final hhk i;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider");
    private static final long e = gvu.MEBIBYTES.b(50);
    private static final lfy f = lfy.c(',').h().b();
    static final long b = TimeUnit.DAYS.toMillis(30);

    public ffq(Context context) {
        feo c = feo.c(context, "gboard-small-speech-packs");
        ino K = ino.K(context, null);
        mks a2 = gxo.a(10);
        ffp ffpVar = new ffp(this, 0);
        this.i = ffpVar;
        this.c = c;
        this.g = a2;
        this.h = K;
        c(fbh.i);
        fbh.i.e(ffpVar);
    }

    private static long h() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    @Override // defpackage.fet
    public final fex a(Context context, ffd ffdVar) {
        if (b(context, ffdVar)) {
            jav javVar = ffdVar.a;
            Collection<jav> collection = ffdVar.b;
            if (javVar == null && (collection == null || collection.isEmpty())) {
                return null;
            }
            File e2 = javVar != null ? this.c.e(javVar) : null;
            if (e2 == null && collection != null) {
                for (jav javVar2 : collection) {
                    e2 = this.c.e(javVar2);
                    if (e2 != null) {
                        break;
                    }
                }
            }
            if (e2 == null) {
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider", "getRecognizer", 169, "FallbackOnDeviceRecognitionProvider.java")).t("newRecognizer() : No speech pack.");
                return null;
            }
            return new fej(context, e2, null);
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider", "getRecognizer", 146, "FallbackOnDeviceRecognitionProvider.java")).t("newRecognizer() : cannot handle.");
        return null;
    }

    @Override // defpackage.fet
    public final boolean b(Context context, ffd ffdVar) {
        boolean z = false;
        if (((Boolean) ffa.e.c()).booleanValue()) {
            jav javVar = ffdVar.a;
            if (javVar != null) {
                z = this.c.k(javVar);
            }
            Collection<jav> collection = ffdVar.b;
            if (!z && !hgw.f(collection)) {
                for (jav javVar2 : collection) {
                    z = this.c.k(javVar2);
                    if (z) {
                        break;
                    }
                }
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider", "canHandle", 138, "FallbackOnDeviceRecognitionProvider.java")).w("canHandle(): pack availability = %b", Boolean.valueOf(z));
            return z;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider", "canHandle", 118, "FallbackOnDeviceRecognitionProvider.java")).t("canHandle() : Fallback on-device recognition not enabled.");
        return false;
    }

    public final void c(hhl hhlVar) {
        String str = (String) hhlVar.c();
        if (TextUtils.isEmpty(str)) {
            this.d = lrr.a;
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str2 : f.k(str)) {
            jav f2 = jav.f(str2);
            if (f2 == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider", "updateOnDeviceVoiceFlag", 104, "FallbackOnDeviceRecognitionProvider.java")).G("updateOnDeviceVoiceFlag() : Invalid tag '%s' in list '%s'", str2, str2);
            } else {
                hashSet.add(f2);
            }
        }
        this.d = lmz.p(hashSet);
    }

    final boolean d(jav javVar) {
        return this.d.contains(javVar);
    }

    @Override // defpackage.fes
    public final String e() {
        return this.c.f();
    }

    @Override // defpackage.fes
    public final void f() {
        throw null;
    }

    protected final void finalize() {
        fbh.i.g(this.i);
        super.finalize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
        if (h() > defpackage.ffq.e) goto L7;
     */
    @Override // defpackage.fes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.jav r6) {
        /*
            r5 = this;
            ltg r0 = defpackage.ffq.a
            ltv r0 = r0.b()
            ltd r0 = (defpackage.ltd) r0
            r1 = 197(0xc5, float:2.76E-43)
            java.lang.String r2 = "FallbackOnDeviceRecognitionProvider.java"
            java.lang.String r3 = "com/google/android/apps/inputmethod/libs/voiceime/fallback/FallbackOnDeviceRecognitionProvider"
            java.lang.String r4 = "maybeScheduleAutoPackDownload"
            ltv r0 = r0.k(r3, r4, r1, r2)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r1 = "maybeScheduleAutoPackDownload() for language tag %s"
            r0.w(r1, r6)
            boolean r0 = r5.d(r6)
            if (r0 == 0) goto L3f
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = defpackage.ffq.b
            ino r4 = r5.h
            long r0 = r0 - r2
            int r0 = defpackage.fby.a(r4, r0)
            long r0 = (long) r0
            r2 = 5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L3f
            long r0 = h()
            long r2 = defpackage.ffq.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L5d
        L3f:
            boolean r0 = r5.d(r6)
            if (r0 == 0) goto L6e
            hhl r0 = defpackage.ffa.b
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            long r0 = h()
            long r2 = defpackage.ffq.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6e
        L5d:
            feo r0 = r5.c
            mko r0 = r0.d(r6)
            fel r1 = new fel
            r2 = 2
            r1.<init>(r5, r6, r2)
            java.util.concurrent.Executor r6 = r5.g
            defpackage.kcu.U(r0, r1, r6)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffq.g(jav):void");
    }
}
