package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: dpv  reason: default package */
/* loaded from: classes.dex */
final class dpv extends gxu {
    final /* synthetic */ dpw a;
    private final lex b = lex.d("\n").e();
    private final lex c = lex.d(" ").e();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpv(dpw dpwVar) {
        super("DelightProblemReporter");
        this.a = dpwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        this.a.j.set(null);
        hrx.y(this.a.b);
        hqt b = hqp.b();
        if (b == null) {
            ((ltd) ((ltd) dpw.a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor$DelightProblemReporter", "run", 699, "LatinCommonCountersMetricsProcessor.java")).t("No current IME. Maybe the manager is still loading XML.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str2 = b.h().g;
        if (str2 != null) {
            arrayList.add(str2);
        }
        lsz it = b.k().iterator();
        while (it.hasNext()) {
            String str3 = ((jav) it.next()).g;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        Delight5Facilitator h = Delight5Facilitator.h(this.a.b);
        boolean I = h.I();
        ArrayList A = lre.A();
        ArrayList arrayList2 = new ArrayList();
        for (mvm mvmVar : h.o()) {
            arrayList2.add(jav.d(jaz.b(mvmVar.g, mvmVar.h)));
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            String str4 = ((jav) arrayList2.get(i)).g;
            if (str4 != null) {
                A.add(str4);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(A);
        if (arrayList3.isEmpty()) {
            this.a.d.b("LanguageModel.dictionary.loaded", true);
        } else {
            if (I) {
                this.a.d.c("LanuguageModel.dictionary.loading");
            }
            this.a.d.b("LanguageModel.dictionary.loaded", false);
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str5 = (String) arrayList3.get(i2);
                ((ltd) ((ltd) dpw.a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor$DelightProblemReporter", "run", 740, "LatinCommonCountersMetricsProcessor.java")).w("Missing LM for '%s'", str5);
                this.a.d.d("LanguageModel.dictionary.missing", dpy.c(str5));
            }
        }
        ino K = ino.K(this.a.b, "delight_problem");
        String str6 = true != arrayList3.isEmpty() ? "lm_missing" : "lm_loaded";
        String[] split = K.Q(str6).split("\n");
        String format = String.format("%s: loaded: %s, missing %s", new SimpleDateFormat("yyyyMMdd_HH:mm:ss", Locale.US).format(new Date()), this.c.f(A), this.c.f(arrayList3));
        ArrayList D = lre.D(split);
        D.add(format);
        if (D.size() > 5) {
            D.remove(0);
        }
        K.V(str6, this.b.f(D));
        if (!this.a.c.ak("pref_key_use_personalized_dicts")) {
            return;
        }
        ArrayList A2 = lre.A();
        for (mvm mvmVar2 : h.r()) {
            mvl b2 = mvl.b(mvmVar2.b);
            if (b2 == null) {
                b2 = mvl.UNKNOWN;
            }
            if (b2 == mvl.USER_HISTORY && (str = jav.d(jaz.b(mvmVar2.g, mvmVar2.h)).g) != null) {
                A2.add(str);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList4.removeAll(A2);
        if (arrayList4.isEmpty()) {
            this.a.d.b("LanguageModel.userhistorydictionary.loaded", true);
        } else {
            this.a.d.b("LanguageModel.userhistorydictionary.loaded", false);
        }
    }
}
