package defpackage;

import android.content.Context;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: cqd  reason: default package */
/* loaded from: classes.dex */
public final class cqd implements ifw {
    private final idk a = ieh.j();
    private Context b;

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b = context;
        if (((Long) cqc.b.c()).longValue() <= 0) {
            ((ltd) ((ltd) cqf.a.b()).k("com/google/android/apps/inputmethod/libs/expression/history/ExpressionDataPrunePeriodicTask", "scheduleTask", 155, "ExpressionDataPrunePeriodicTask.java")).t("Skip scheduling expression data pruning task due to invalid flag value.");
        } else if (ism.a(context).c(cqf.c())) {
            return;
        }
        this.a.e(ctf.EXPRESSION_DATA_PRUNE_EVENT, ctb.TASK_SCHEDULED_FAILURE);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
