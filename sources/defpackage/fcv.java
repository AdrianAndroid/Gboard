package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fcv  reason: default package */
/* loaded from: classes.dex */
public final class fcv implements fex {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognizer");
    private final Context b;
    private final ffe c;
    private final fcw d;
    private volatile fcu e;
    private volatile fev f;

    public fcv(Context context) {
        Context applicationContext = context.getApplicationContext();
        ffe ffeVar = new ffe(context);
        fcw fcwVar = fcw.a;
        this.b = applicationContext;
        this.c = ffeVar;
        this.d = fcwVar;
    }

    @Override // defpackage.fex
    public final few a() {
        return few.AIAI;
    }

    @Override // defpackage.fex
    public final void b() {
        this.e = null;
    }

    @Override // defpackage.fex
    public final void c(fff fffVar) {
        fcu fcuVar = this.e;
        if (fcuVar != null) {
            fcuVar.a();
            this.f.h();
        }
        fcw fcwVar = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (fcwVar.b <= 0 || fcwVar.i >= 0) {
            return;
        }
        fcwVar.i = elapsedRealtime - fcwVar.b;
        fcwVar.l.g(fbp.AIAI_RECOGNIZER_LISTENING_TIME, fcwVar.i);
    }

    @Override // defpackage.fex
    public final void d() {
        fcu fcuVar = this.e;
        if (fcuVar != null) {
            fcuVar.a();
            this.f.h();
        }
        fcw fcwVar = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (fcwVar.b <= 0 || fcwVar.j >= 0) {
            return;
        }
        fcwVar.j = elapsedRealtime - fcwVar.b;
        fcwVar.l.g(fbp.AIAI_RECOGNIZER_SESSION_TIME, fcwVar.j);
    }

    @Override // defpackage.fex
    public final void e(ffd ffdVar, fcp fcpVar, fev fevVar, boolean z) {
        Intent intent;
        if (!fcpVar.d() || !fcpVar.e()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognizer", "startRecognition", 65, "AiAiRecognizer.java")).w("startRecognition(): Cannot run with %s", fcpVar);
            return;
        }
        this.f = fevVar;
        fcw fcwVar = this.d;
        fcwVar.b = SystemClock.elapsedRealtime();
        fcwVar.k = -1L;
        fcwVar.d = -1L;
        fcwVar.j = -1L;
        fcwVar.i = -1L;
        fcwVar.h = -1L;
        fcwVar.g = -1L;
        fcwVar.f = -1L;
        fcwVar.c = -1L;
        fcwVar.e = -1L;
        jav javVar = ffdVar.a;
        Context context = this.b;
        this.e = new fcu(context, javVar, fevVar, this.c, this.d, ino.M(context).aj(R.string.f160400_resource_name_obfuscated_res_0x7f140645));
        fcu fcuVar = this.e;
        SpeechRecognizer speechRecognizer = fcuVar.b;
        if (speechRecognizer == null || (intent = fcuVar.c) == null) {
            fcuVar.e.onError(7);
            return;
        }
        speechRecognizer.startListening(intent);
        fcuVar.d.b();
    }
}
