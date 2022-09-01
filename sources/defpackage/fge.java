package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fge  reason: default package */
/* loaded from: classes.dex */
public final class fge {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/s3/S3ResponseProcessor");
    public final fev b;
    public final ffx c;
    private final AtomicReference d = new AtomicReference();

    public fge(fev fevVar) {
        ffx ffxVar = ffx.a;
        this.b = fevVar;
        this.c = ffxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bnb bnbVar) {
        ((ltd) ((ltd) ((ltd) a.d()).i(bnbVar)).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3ResponseProcessor", "handleOnError", 'O', "S3ResponseProcessor.java")).t("Recognition Error.");
        int i = bnbVar.a;
        int i2 = 1;
        if ((i <= 131072 || i >= 262144) && (i <= 393216 || i >= 458752)) {
            i2 = 2;
            if (i >= 131072 && (i <= 262144 || i >= 393216)) {
                i2 = 3;
            }
        }
        this.b.j(i2);
    }

    public final void b(nkj nkjVar, String str, String str2) {
        boolean z = (nkjVar == null || nkjVar.a.size() == 0) ? false : true;
        if (!TextUtils.isEmpty(str) || z) {
            if (!z && ((Boolean) ffa.o.c()).booleanValue()) {
                String str3 = (String) this.d.get();
                if (!TextUtils.isEmpty(str3) && str3.contains(str)) {
                    return;
                }
            }
            this.d.set(true != z ? str : null);
            if (z) {
                str = ((nka) nkjVar.a.get(0)).a;
            }
            nfh t = bns.f.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bns bnsVar = (bns) t.b;
            str.getClass();
            int i = 1 | bnsVar.a;
            bnsVar.a = i;
            bnsVar.b = str;
            int i2 = i | 2;
            bnsVar.a = i2;
            bnsVar.c = z;
            str2.getClass();
            bnsVar.a = i2 | 4;
            bnsVar.d = str2;
            fev fevVar = this.b;
            nfh t2 = bnq.b.t();
            t2.dH(t);
            fevVar.i((bnq) t2.cz());
            ffx ffxVar = this.c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (ffxVar.b <= 0 || ffxVar.f >= 0) {
                return;
            }
            ffxVar.f = elapsedRealtime - ffxVar.b;
            ffxVar.l.g(fbp.S3_RECOGNIZER_MIC_START_TO_FIRST_TEXT_TIME, ffxVar.f);
            if (ffxVar.c > 0 && ffxVar.h < 0) {
                ffxVar.h = elapsedRealtime - ffxVar.c;
                ffxVar.l.g(fbp.S3_RECOGNIZER_SPEECH_START_TO_FIRST_TEXT_TIME, ffxVar.h);
            }
            if (ffxVar.d <= 0 || ffxVar.k >= 0) {
                return;
            }
            ffxVar.k = elapsedRealtime - ffxVar.d;
            ffxVar.l.g(fbp.S3_RECOGNIZER_MIC_OPEN_TO_FIRST_TEXT_TIME, ffxVar.k);
        }
    }
}
