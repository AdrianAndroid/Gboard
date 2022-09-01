package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.keyboard.client.delight5.ModelSxSEvaluationToolWrapper;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cca  reason: default package */
/* loaded from: classes.dex */
public final class cca implements mix {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/delight5/MainLanguageModelLoader");
    private final Delight5Facilitator c;
    private final cbh d;
    private final idk e;
    private final ino f;
    private final List g;
    private final int h;
    private final ModelSxSEvaluationToolWrapper i;
    private final cdx j;
    private final long k = SystemClock.elapsedRealtime();
    public volatile boolean a = false;

    public cca(Context context, Delight5Facilitator delight5Facilitator, cbh cbhVar, idk idkVar, List list, int i) {
        ino K = ino.K(context, "lm_tracker");
        ModelSxSEvaluationToolWrapper orCreateInstance = ModelSxSEvaluationToolWrapper.getOrCreateInstance();
        cdx b2 = cdx.b(context);
        this.c = delight5Facilitator;
        this.e = idkVar;
        this.d = cbhVar;
        this.f = K;
        this.g = list;
        this.h = i;
        this.i = orCreateInstance;
        this.j = b2;
        idkVar.e(cap.LANGUAGE_MODEL_LOADER_CREATED, Integer.valueOf(i));
    }

    static String b(Locale locale) {
        return "lm_available_".concat(String.valueOf(locale.toString().toLowerCase(Locale.US)));
    }

    static String c(Locale locale) {
        return "lm_change_".concat(String.valueOf(locale.toString().toLowerCase(Locale.US)));
    }

    private final int d(Locale locale) {
        return this.f.D(b(locale));
    }

    private static String e(int i) {
        return i != 1 ? i != 2 ? "UNKNOWN" : "NOT_AVAILABLE" : "AVAILABLE";
    }

    private final void f(Locale locale, int i) {
        int i2;
        int d = d(locale);
        ltg ltgVar = b;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/MainLanguageModelLoader", "updateLmAvailableState", 392, "MainLanguageModelLoader.java")).G("updateLmAvailableState(): locale? %s prevState? %s", locale, e(d));
        int i3 = 2;
        if (d == 0) {
            if (i == 2) {
                this.f.i(c(locale), System.currentTimeMillis());
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/MainLanguageModelLoader", "updateLmAvailableState", 428, "MainLanguageModelLoader.java")).G("updateLmAvailableState(): locale? %s newState? %s", locale, e(i));
                this.f.h(b(locale), i);
            }
            d = 0;
        }
        long j = 0;
        if (d != 2) {
            i3 = d;
            i2 = i;
        } else if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long I = this.f.I(c(locale));
            if (I > 0) {
                long j2 = currentTimeMillis - I;
                if (j2 > 0) {
                    j = TimeUnit.MILLISECONDS.toHours(j2);
                }
                this.e.g(caq.LANGUAGE_MODEL_AVAILABILITY_LATENCY, j);
            }
            this.f.i(c(locale), currentTimeMillis);
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/MainLanguageModelLoader", "updateLmAvailableState", 428, "MainLanguageModelLoader.java")).G("updateLmAvailableState(): locale? %s newState? %s", locale, e(i));
            this.f.h(b(locale), i);
        } else {
            i2 = 2;
        }
        if (i3 == 0 && i == 1) {
            this.e.g(caq.LANGUAGE_MODEL_AVAILABILITY_LATENCY, 0L);
            this.f.i(c(locale), System.currentTimeMillis());
        }
        i = i2;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/MainLanguageModelLoader", "updateLmAvailableState", 428, "MainLanguageModelLoader.java")).G("updateLmAvailableState(): locale? %s newState? %s", locale, e(i));
        this.f.h(b(locale), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x025a, code lost:
        if (r5 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0261, code lost:
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0277  */
    @Override // defpackage.mix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mko a() {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cca.a():mko");
    }
}
