package defpackage;

import android.content.Context;
import android.util.Pair;
import j$.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* renamed from: dte  reason: default package */
/* loaded from: classes.dex */
final class dte extends hhf {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/NgaFeedbackData");
    private final Context b;
    private final dup c;

    public dte(Context context, dup dupVar) {
        this.b = context;
        this.c = dupVar;
    }

    private static boolean g(boolean z) {
        return dxe.e() && !z;
    }

    @Override // defpackage.hhf
    public final void a(List list, boolean z) {
        nuq nuqVar;
        if (!g(z)) {
            return;
        }
        try {
            dup dupVar = this.c;
            oqv oqvVar = ((duz) dupVar).g;
            if (oqvVar == null) {
                synchronized (dupVar) {
                    if (((duz) dupVar).g == null) {
                        ((duz) dupVar).g = new oqv(((duz) dupVar).g(), nsa.a.d(oig.b, oid.BLOCKING));
                    }
                }
                oqvVar = ((duz) dupVar).g;
            }
            nez nezVar = nez.a;
            Object obj = oqvVar.b;
            nuq nuqVar2 = fgy.c;
            if (nuqVar2 == null) {
                synchronized (fgy.class) {
                    nuqVar = fgy.c;
                    if (nuqVar == null) {
                        nun a2 = nuq.a();
                        a2.c = nup.UNARY;
                        a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.AssistantDictationService", "GetAssistantFeedbackDebugData");
                        a2.b();
                        a2.a = ohw.b(nez.a);
                        a2.b = ohw.b(fhl.b);
                        nuqVar = a2.a();
                        fgy.c = nuqVar;
                    }
                }
                nuqVar2 = nuqVar;
            }
            byte[] bytes = ((fhl) oig.c((nsb) obj, nuqVar2, (nsa) oqvVar.a, nezVar)).a.getBytes(StandardCharsets.UTF_8);
            if (bytes == null || bytes.length <= 0) {
                return;
            }
            list.add(new fun(bytes));
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaFeedbackData", "fillFeedbackPsbd", '6', "NgaFeedbackData.java")).t("Failed to attach Nga feedback data.");
        }
    }

    @Override // defpackage.hhf
    public final void d(List list, boolean z) {
        if (!g(z)) {
            return;
        }
        list.add(Pair.create("app-version-agsa", byo.a(this.b)));
    }
}
