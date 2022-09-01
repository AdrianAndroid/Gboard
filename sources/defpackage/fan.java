package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: fan  reason: default package */
/* loaded from: classes.dex */
public final class fan {
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/SpeechRecognitionFacilitator");
    public final ExecutorService a;
    public final ino b;
    public final fao c;
    public final fab d;
    public boolean e;
    public volatile fex f;
    volatile ffd g;
    volatile fev h;
    private final hzr j;

    public fan(Context context) {
        ExecutorService executorService = fbg.b;
        if (executorService == null) {
            synchronized (fbg.a) {
                executorService = fbg.b;
                if (executorService == null) {
                    executorService = gxp.a().f("voice-control", 11);
                    fbg.b = executorService;
                }
            }
        }
        ino M = ino.M(context);
        fao faoVar = new fao(context);
        fab fabVar = new fab(context);
        fak fakVar = new fak(this);
        this.j = fakVar;
        this.a = executorService;
        this.b = M;
        this.c = faoVar;
        this.d = fabVar;
        fakVar.d(executorService);
    }

    public static boolean c(few fewVar) {
        return (fewVar == few.VOICE_IME || fewVar == few.AIAI) ? false : true;
    }

    public final few a(ffd ffdVar) {
        Context context = this.c.g;
        if (fao.l(context, ffdVar)) {
            return few.AIAI;
        }
        if (fao.n(context, ffdVar)) {
            return few.ON_DEVICE;
        }
        if (fao.o(context, ffdVar)) {
            return few.S3;
        }
        if (fao.m(context, ffdVar)) {
            return few.FALLBACK_ON_DEVICE;
        }
        return few.VOICE_IME;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(ffd ffdVar) {
        if (a(ffdVar) == few.ON_DEVICE) {
            jav javVar = ffdVar.a;
            fes fesVar = fao.b;
            if (fesVar != null && ((feb) fesVar).d(javVar) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.ffd r8, defpackage.fcp r9) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fan.d(ffd, fcp):void");
    }
}
