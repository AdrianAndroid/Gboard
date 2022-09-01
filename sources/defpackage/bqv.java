package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bqv  reason: default package */
/* loaded from: classes.dex */
public final class bqv implements ier {
    public final Context a;
    public final nfh b = mcc.aB.t();
    private final llp c;

    public bqv(Context context, idi idiVar) {
        String[] strArr;
        ino M = ino.M(context);
        ieh j = ieh.j();
        this.a = context;
        String x = jbt.x(context, R.string.f163150_resource_name_obfuscated_res_0x7f140768);
        String x2 = jbt.x(context, R.string.f163140_resource_name_obfuscated_res_0x7f140767);
        if (!TextUtils.isEmpty(x2)) {
            strArr = x2.toUpperCase(Locale.ROOT).split(",");
        } else {
            strArr = gvw.g;
        }
        if (!TextUtils.isEmpty(x) && !brd.a(context) && strArr.length > 0) {
            j.u(new brd(context, strArr));
        }
        try {
            j.u(new ctj(context, ino.M(context), idiVar));
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) ctj.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionMetricsProcessor", "addToMetricsManager", 'q', "ExpressionMetricsProcessor.java")).t("Failed to create ExpressionMetricsProcessor");
            j.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
        llk e2 = llp.e();
        bqs bqsVar = new bqs(this, M, j, idiVar);
        bqsVar.d();
        e2.h(bqsVar);
        bqt bqtVar = new bqt(M, j, idiVar);
        bqtVar.d();
        e2.h(bqtVar);
        bqu bquVar = new bqu(this, M, j, idiVar);
        bquVar.d();
        bquVar.d.add(new ieu(bquVar));
        e2.h(bquVar);
        this.c = e2.g();
    }

    @Override // defpackage.ier
    public final void e() {
        llp llpVar = this.c;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ier) llpVar.get(i2)).e();
        }
    }
}
