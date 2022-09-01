package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Objects;
import j$.util.function.Supplier;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dps  reason: default package */
/* loaded from: classes.dex */
public final class dps implements ivu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/menes/paramsweep/ParamSweepResultHandler");
    public final idk b;
    public final Context c;
    public final Supplier d;
    private final Executor e;
    private final Supplier f;

    public dps(Context context, Executor executor, Supplier supplier, Supplier supplier2, idk idkVar) {
        this.c = context;
        this.e = executor;
        this.f = supplier;
        this.d = supplier2;
        this.b = idkVar;
    }

    @Override // defpackage.ivu
    public final String a() {
        return "param_sweep_handler";
    }

    @Override // defpackage.ivu
    public final mko b(fwm fwmVar, mxc mxcVar) {
        String str = mxcVar.b;
        try {
            final Uri uri = fwmVar.j;
            Supplier supplier = this.f;
            Objects.requireNonNull(supplier);
            return mio.g(kcu.O(new bof(supplier, 17), this.e), new leq() { // from class: dpr
                /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // defpackage.leq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 333
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dpr.a(java.lang.Object):java.lang.Object");
                }
            }, this.e);
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/menes/paramsweep/ParamSweepResultHandler", "handleResult", 'r', "ParamSweepResultHandler.java")).t("Failed to handle result.");
            return kcu.J(e);
        }
    }
}
