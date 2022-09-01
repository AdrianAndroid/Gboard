package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fgf  reason: default package */
/* loaded from: classes.dex */
public final class fgf implements fex {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer");
    volatile fgc b;
    private final Context c;
    private final ExecutorService d;
    private final ffx e;
    private boolean f;

    public fgf(Context context) {
        ExecutorService a2 = fbg.a();
        ffx ffxVar = ffx.a;
        this.c = context;
        this.d = a2;
        this.e = ffxVar;
    }

    @Override // defpackage.fex
    public final few a() {
        return few.S3;
    }

    @Override // defpackage.fex
    public final synchronized void b() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer", "shutdown", 50, "S3SpeechRecognizer.java")).t("shutdown()");
        this.b = null;
    }

    @Override // defpackage.fex
    public final synchronized void c(fff fffVar) {
        fgc fgcVar = this.b;
        if (fgcVar != null) {
            fgcVar.h.c();
            if (!fgcVar.o && ((Boolean) ffa.l.c()).booleanValue() && !fgcVar.p && fffVar.i) {
                ker.m(fgcVar.b, 1, R.string.f163200_resource_name_obfuscated_res_0x7f14076d, new Object[0]);
            }
            goh gohVar = fgcVar.l;
            if (gohVar != null) {
                gohVar.j.a();
            }
            fgcVar.d.c(fgcVar.u);
            ffx ffxVar = this.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ffxVar.b > 0 && ffxVar.i < 0) {
                ffxVar.i = elapsedRealtime - ffxVar.b;
                ffxVar.l.g(fbp.S3_RECOGNIZER_LISTENING_TIME, ffxVar.i);
            }
        }
    }

    @Override // defpackage.fex
    public final synchronized void d() {
        fgc fgcVar = this.b;
        if (fgcVar != null) {
            fgcVar.e.e(fga.ON_STOP_RECOGNITION, Integer.valueOf(fgcVar.n));
            gon gonVar = fgcVar.c;
            gnw gnwVar = gonVar.d;
            if (gnwVar != null) {
                gnwVar.b();
                gonVar.d = null;
            }
            ffx ffxVar = this.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ffxVar.b > 0 && ffxVar.j < 0) {
                ffxVar.j = elapsedRealtime - ffxVar.b;
                ffxVar.l.g(fbp.S3_RECOGNIZER_SESSION_TIME, ffxVar.j);
            }
        }
        this.f = false;
    }

    @Override // defpackage.fex
    public final synchronized void e(ffd ffdVar, fcp fcpVar, fev fevVar, boolean z) {
        if (this.f) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer", "startRecognition", 67, "S3SpeechRecognizer.java")).t("Duplicated startRecognition() is called , stopping ahead.");
            d();
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer", "startRecognition", 70, "S3SpeechRecognizer.java")).G("startRecognition() : %s : %s", ffdVar, fcpVar);
        ffx ffxVar = this.e;
        ffxVar.b = SystemClock.elapsedRealtime();
        ffxVar.k = -1L;
        ffxVar.d = -1L;
        ffxVar.j = -1L;
        ffxVar.i = -1L;
        ffxVar.h = -1L;
        ffxVar.g = -1L;
        ffxVar.f = -1L;
        ffxVar.c = -1L;
        ffxVar.e = -1L;
        kcu.U(kcu.P(new iiq(this, ffdVar, fcpVar, fevVar, 1), this.d), new eay(fevVar, 16), this.d);
        this.f = true;
    }

    public final synchronized void f(ffd ffdVar, fcp fcpVar, fev fevVar) {
        goh gohVar;
        if (fcpVar.d() && fcpVar.f()) {
            if (!fcpVar.e()) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer", "startRecognitionOnBgThread", 115, "S3SpeechRecognizer.java")).t("startRecognitionOnBgThread() : Not Running - Exit");
                return;
            }
            fgc fgcVar = this.b;
            if (fgcVar == null) {
                fgcVar = new fgc(this.c, this.d);
                this.b = fgcVar;
            }
            boolean z = false;
            fgcVar.e.e(fga.ON_START_RECOGNITION, new Object[0]);
            fgcVar.n = 0;
            fgcVar.o = false;
            fgcVar.q = true;
            if (((Boolean) ffa.m.c()).booleanValue()) {
                fgcVar.p = ffdVar.g;
            } else {
                fgcVar.p = false;
            }
            fgcVar.s = fcpVar;
            fgcVar.j = fevVar;
            fgcVar.k = false;
            fgcVar.m = new fge(fgcVar.j);
            fgcVar.i.d();
            fgcVar.i.e();
            Context applicationContext = fgcVar.b.getApplicationContext();
            if (((Boolean) ffa.l.c()).booleanValue()) {
                gohVar = new fft(applicationContext, new fgd(applicationContext, ffdVar), ffv.a(ffdVar), fgcVar.t, fgcVar.d, ffv.c(), blg.b, fgcVar.i, ffdVar.h, null, null, null, null, null);
            } else {
                gohVar = new goh(applicationContext, new fgd(applicationContext, ffdVar), ffv.a(ffdVar), fgcVar.t, fgcVar.d, ffv.c(), blg.b, null, null, null, null, null);
            }
            fgcVar.l = gohVar;
            if (!ffdVar.h) {
                int i = gohVar.k;
                Context context = gohVar.b;
                int e = goh.e(i);
                int i2 = gohVar.i;
                goj gojVar = new goj(context, e, i2);
                int i3 = gohVar.h;
                int bitCount = Integer.bitCount(i2);
                int i4 = gohVar.k;
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                int i6 = 20;
                if (i5 == 0 || i5 == 3 || i5 == 9) {
                    if (i4 == 4) {
                        i6 = 1;
                    } else if (i4 != 10) {
                        throw new RuntimeException("Unsupported AMR encoding: ".concat(ndb.ac(i4)));
                    }
                } else if (i5 != 10) {
                    throw new RuntimeException("Unsupported encoding: ".concat(ndb.ac(i4)));
                }
                gohVar.j = new gol(i3, bitCount, i6, gojVar, gohVar.g, gohVar.m, null, null, null, null, null);
                if (gohVar.g != null) {
                    gol golVar = gohVar.j;
                    lty ltyVar = luh.a;
                    golVar.e = true;
                    if (golVar.d == null) {
                        ((ltd) ((ltd) gol.a.d().h(luh.a, "MultipleReaderAudioSrc")).k("com/google/android/libraries/gsa/s3/lib/S3LibAudioSource", "setShouldReportSoundLevels", 109, "S3LibAudioSource.java")).t("SpeechLevelGenerator not set, setShouldReportSoundLevels has no effect.");
                    }
                    gok gokVar = golVar.f;
                    if (gokVar != null && golVar.d != null) {
                        gokVar.a = true;
                    }
                }
            }
            gon gonVar = fgcVar.c;
            if (gonVar.d == null) {
                if (gon.a != null) {
                    z = true;
                }
                jdg.G(z, "HttpEngineCachedSupplier should be initialized in the constructor!");
                bmc bmcVar = (bmc) gon.a.a();
                gonVar.d = new gnw(gom.c, gonVar.b, bmcVar, bmcVar.b(blu.a), (mpa) ((lge) gonVar.c).a, new etm(gohVar, 9), null);
                gonVar.d.a();
            }
            fgcVar.d.d(fgcVar.u);
            if (!fgcVar.p) {
                return;
            }
            fgcVar.h.b();
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer", "startRecognitionOnBgThread", 107, "S3SpeechRecognizer.java")).w("startRecognitionOnBgThread(): Cannot run with %s", fcpVar);
    }
}
