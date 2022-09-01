package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bqs  reason: default package */
/* loaded from: classes.dex */
final class bqs extends iew {
    final /* synthetic */ ieh a;
    final /* synthetic */ idi b;
    final /* synthetic */ bqv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqs(bqv bqvVar, ino inoVar, ieh iehVar, idi idiVar) {
        super(inoVar);
        this.c = bqvVar;
        this.a = iehVar;
        this.b = idiVar;
    }

    @Override // defpackage.iew
    protected final void a() {
        bqv bqvVar = this.c;
        bqy.l(bqvVar.a, this.a, this.b, bqvVar.b);
        bqv bqvVar2 = this.c;
        Context context = bqvVar2.a;
        ieh iehVar = this.a;
        try {
            iehVar.u(new dqa(context, this.b, bqvVar2.b));
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) dqa.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonMetricsProcessor", "addToMetricsManager", (char) 268, "LatinCommonMetricsProcessor.java")).t("Failed to create LatinCommonMetricsProcessor");
            iehVar.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
        bqq.d(this.c.a, this.a, this.b);
        Context context2 = this.c.a;
        ieh iehVar2 = this.a;
        try {
            iehVar2.u(new dpw(context2, this.b, ino.M(context2), gxo.c(11)));
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) dpw.a.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "addToMetricsManager", (char) 187, "LatinCommonCountersMetricsProcessor.java")).t("Failed to create LatinCommonCountersMetricsProcessor");
            iehVar2.e(idd.METRICS_PROCESSOR_CRASH_INIT, e2);
        }
        ieh iehVar3 = this.a;
        try {
            iehVar3.u(new ctm(this.b));
        } catch (RuntimeException e3) {
            ((ltd) ((ltd) ((ltd) ctm.a.c()).i(e3)).k("com/google/android/apps/inputmethod/libs/expression/metrics/impl/ExpressionSimpleCountersMetricsProcessor", "addToMetricsManager", (char) 184, "ExpressionSimpleCountersMetricsProcessor.java")).t("Failed to create LatinCountersMetricsProcessor");
            iehVar3.e(idd.METRICS_PROCESSOR_CRASH_INIT, e3);
        }
        Context context3 = this.c.a;
        this.a.u(new brb(context3, ino.M(context3), this.b));
    }

    @Override // defpackage.iew
    protected final void b() {
        bqy.h(this.a);
        this.a.x(dqa.class);
        bqq.q(this.a);
        this.a.x(dpw.class);
        this.a.x(ctm.class);
        brb.b(this.a);
    }
}
