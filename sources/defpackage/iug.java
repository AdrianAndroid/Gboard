package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iug  reason: default package */
/* loaded from: classes.dex */
public final class iug implements ivu {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/impls/menesresulthandlers/MenesBaselineResultHandler");
    public final Context b;
    private final Executor c;

    public iug(Context context, Executor executor) {
        this.b = context;
        this.c = executor;
    }

    @Override // defpackage.ivu
    public final String a() {
        return "menes_baseline_handler";
    }

    @Override // defpackage.ivu
    public final mko b(fwm fwmVar, mxc mxcVar) {
        try {
            return mio.g(mkh.q(iwy.a.b()), new fyn(this, fwmVar, 14), this.c);
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/trainingcache/impls/menesresulthandlers/MenesBaselineResultHandler", "handleResult", 'V', "MenesBaselineResultHandler.java")).t("Failed to handle result.");
            return kcu.J(e);
        }
    }
}
