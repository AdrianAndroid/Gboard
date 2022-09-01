package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cqc  reason: default package */
/* loaded from: classes.dex */
public final class cqc {
    public static final hhl a = hhq.a("enable_expression_data_pruning", false);
    static final hhl b = hhq.f("expression_data_pruning_period_in_seconds", TimeUnit.DAYS.toSeconds(7));
    static final hhl c = hhq.a("expression_data_pruning_require_device_idle", true);
    static final hhl d = hhq.a("expression_data_pruning_require_charging", true);
    static final hhl e = hhq.f("expression_data_prune_previous_months", 6);
}
