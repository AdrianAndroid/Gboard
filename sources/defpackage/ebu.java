package defpackage;

import com.google.learning.expander.pod.inferenceapi.expressiveconcepts.BaseExpressiveConceptsPredictor;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: ebu  reason: default package */
/* loaded from: classes.dex */
public final class ebu implements AutoCloseable {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModel");
    public final BaseExpressiveConceptsPredictor b;
    public final int c;
    public final Locale d;
    public ebt e = ebt.a;

    public ebu(BaseExpressiveConceptsPredictor baseExpressiveConceptsPredictor, int i, Locale locale) {
        this.b = baseExpressiveConceptsPredictor;
        this.c = i;
        this.d = locale;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.a();
            this.e = ebt.a;
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/search/expressiveconcepts/ExpressiveConceptsPredictionModel", "close", 'V', "ExpressiveConceptsPredictionModel.java")).t("Failed to close the Predictor.");
        }
    }
}
