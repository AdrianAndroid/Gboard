package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fej  reason: default package */
/* loaded from: classes.dex */
public final class fej implements fex {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper");
    public final feg b;
    private final Context c;
    private final ino d;
    private final ExecutorService e = fbg.a();

    public fej(Context context, File file, File file2) {
        this.c = context;
        this.d = ino.M(context);
        this.b = new feg(context, file, file2);
    }

    private final void f(int i) {
        ker.l(this.c, i, new Object[0]);
    }

    @Override // defpackage.fex
    public final few a() {
        return few.ON_DEVICE;
    }

    @Override // defpackage.fex
    public final void b() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper", "shutdown", 62, "SodaRecognizerWrapper.java")).t("shutdown()");
        feg fegVar = this.b;
        synchronized (fegVar) {
            fegVar.i.a();
        }
    }

    @Override // defpackage.fex
    public final void c(fff fffVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper", "stopListening", 143, "SodaRecognizerWrapper.java")).t("stopListening()");
        feg fegVar = this.b;
        synchronized (fegVar) {
            int i = fegVar.k;
            if (i == 0) {
                fegVar.k = 3;
            } else if (i == 1) {
                fegVar.i.b();
                hjf hjfVar = fegVar.l;
                if (hjfVar != null) {
                    hjfVar.b();
                }
                fds fdsVar = fegVar.e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (fdsVar.b > 0 && fdsVar.i < 0) {
                    fdsVar.i = elapsedRealtime - fdsVar.b;
                    fdsVar.l.g(fbp.ON_DEVICE_RECOGNIZER_LISTENING_TIME, fdsVar.i);
                }
                fegVar.k = 2;
            }
        }
    }

    @Override // defpackage.fex
    public final void d() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper", "stopRecognition", 149, "SodaRecognizerWrapper.java")).t("stopRecognition()");
        feg fegVar = this.b;
        synchronized (fegVar) {
            hjf hjfVar = fegVar.l;
            if (hjfVar != null) {
                hjfVar.b();
            }
            fegVar.a();
            fds fdsVar = fegVar.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (fdsVar.b > 0 && fdsVar.j < 0) {
                fdsVar.j = elapsedRealtime - fdsVar.b;
                fdsVar.l.g(fbp.ON_DEVICE_RECOGNIZER_SESSION_TIME, fdsVar.j);
            }
        }
    }

    @Override // defpackage.fex
    public final void e(ffd ffdVar, final fcp fcpVar, final fev fevVar, final boolean z) {
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper", "startRecognition", 72, "SodaRecognizerWrapper.java")).t("startRecognition()");
        kcu.U(kcu.P(new mix() { // from class: fei
            /* JADX WARN: Code restructure failed: missing block: B:158:0x042e, code lost:
                if (r2.l == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
                if (r2.l != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0430, code lost:
                r2.l.a();
                r2.l = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x024e, code lost:
                if (r2.l != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0402, code lost:
                if (r2.l != null) goto L24;
             */
            @Override // defpackage.mix
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.mko a() {
                /*
                    Method dump skipped, instructions count: 1131
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fei.a():mko");
            }
        }, this.e), new eay(fevVar, 13), this.e);
        if (this.d.aj(R.string.f162200_resource_name_obfuscated_res_0x7f1406fd)) {
            if (!((Boolean) ffa.d.c()).booleanValue()) {
                return;
            }
            feo c = feo.c(this.c, "speech-packs");
            String str = (String) ((hhl) feo.b.get(c.e)).c();
            if (TextUtils.equals(c.g, str)) {
                return;
            }
            ((ltd) ((ltd) feo.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "isRegisteredManifestUpToDate", 180, "SpeechPackManager.java")).G("Manifest URL [%s] should be updated to [%s]", c.g, str);
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper", "maybeForceLanguagePackUpdate", 123, "SodaRecognizerWrapper.java")).t("maybeForceLanguagePackUpdate() : Forcing update in the foreground");
            fao.e();
            f(R.string.f152580_resource_name_obfuscated_res_0x7f14028d);
            return;
        }
        f(R.string.f152120_resource_name_obfuscated_res_0x7f14025b);
        this.d.q(R.string.f162200_resource_name_obfuscated_res_0x7f1406fd, true);
    }
}
