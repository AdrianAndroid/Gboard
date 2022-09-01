package defpackage;

import android.content.Context;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: fdq  reason: default package */
/* loaded from: classes.dex */
public final class fdq implements fdj {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDictationPerformanceEvaluationModule");
    public static final long b = TimeUnit.DAYS.toMillis(1);
    public Context c;
    public ino d;
    public ino e;
    private final hhk g = new bvl(this, 19);
    public final irw f = new fdp(this);
    private final inm h = new fdo(this, 0);

    public final boolean c() {
        return this.d.b("number_of_perf_eval_completed_times", 0) >= 5;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Feature enabled: ".concat(String.valueOf(String.valueOf(fbh.z.c()))));
        printer.println("Speechpack manifest url = ".concat(String.valueOf((String) ffa.r.c())));
        printer.println("Audio sample manifest url = ".concat(String.valueOf((String) ffa.s.c())));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "OnDeviceDictationPerformanceEvaluationModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDictationPerformanceEvaluationModule", "onCreate", 68, "OnDeviceDictationPerformanceEvaluationModule.java")).t("onCreate()");
        this.c = context;
        feo.c(context, "gboard-small-speech-packs").g();
        feo.c(context, "ondevice-eval-audio-packs").g();
        this.d = ino.K(this.c, null);
        ino M = ino.M(context);
        this.e = M;
        M.X(this.h, R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
        this.d.Y(this.h, "number_of_perf_eval_completed_times");
        ffa.t.e(this.g);
        if (!this.e.x(R.string.f161110_resource_name_obfuscated_res_0x7f14068f, false) || c()) {
            return;
        }
        this.f.f(gxo.a(10));
    }

    @Override // defpackage.ifw
    public final void gn() {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDictationPerformanceEvaluationModule", "onDestroy", 94, "OnDeviceDictationPerformanceEvaluationModule.java")).t("onDestroy()");
        this.e.ae(this.h, R.string.f161110_resource_name_obfuscated_res_0x7f14068f);
        this.d.af(this.h, "number_of_perf_eval_completed_times");
        this.f.g();
    }
}
