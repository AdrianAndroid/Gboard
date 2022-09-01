package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ccd  reason: default package */
/* loaded from: classes.dex */
public final class ccd implements mix {
    public static final lug a = lug.i("Delight5Facilitator");
    public final Delight5Facilitator b;
    private final Context c;
    private final List d;
    private final ino e;
    private final Executor f;

    public ccd(Context context, List list, ino inoVar, Executor executor, Delight5Facilitator delight5Facilitator) {
        this.c = context;
        this.d = list;
        this.e = inoVar;
        this.f = executor;
        this.b = delight5Facilitator;
    }

    public static mvm b(Context context, Locale locale) {
        return cbw.c(mvl.NEURAL_RESCORING, c(context, jav.d(locale)), locale);
    }

    public static File c(Context context, jav javVar) {
        return new File(new File(cbd.a(context), "p13n/neural_rescoring_model_".concat(String.valueOf(String.valueOf(javVar)))), "p13n.nrm");
    }

    public static mko d(ijk ijkVar, Context context, Executor executor) {
        return kcu.O(new brs(ijkVar, context, 8, null, null, null, null), executor);
    }

    @Override // defpackage.mix
    public final mko a() {
        lug lugVar = a;
        ((luc) ((luc) lugVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/PersonalizedNeuralRescoringModelLoader", "call", 56, "PersonalizedNeuralRescoringModelLoader.java")).t("Running PersonalizedNeuralRescoringModelLoader");
        if (!((Boolean) cas.N.c()).booleanValue()) {
            ((luc) ((luc) lugVar.d()).k("com/google/android/apps/inputmethod/libs/delight5/PersonalizedNeuralRescoringModelLoader", "call", 60, "PersonalizedNeuralRescoringModelLoader.java")).t("nrm: Loader was created when disabled; model will be unloaded");
        }
        boolean z = ((Boolean) cas.N.c()).booleanValue() && this.e.ak("pref_key_use_personalized_dicts");
        ArrayList arrayList = new ArrayList(this.d.size());
        cdx b = cdx.b(this.c);
        for (Locale locale : this.d) {
            mvm b2 = b(this.c, b.d(locale));
            String str = b2.d;
            if (z) {
                arrayList.add(hiz.p(new bof(str, 5), this.f).v(new bxo(this, b2, 6), this.f));
            } else {
                arrayList.add(this.b.h.d(b2));
                this.b.B(b2, mvk.UNUSED);
                this.b.A(b2, false);
            }
        }
        return hiz.K(arrayList).f();
    }
}
