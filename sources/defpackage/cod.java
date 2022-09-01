package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;

/* compiled from: PG */
/* renamed from: cod  reason: default package */
/* loaded from: classes.dex */
public final class cod extends dz {
    final /* synthetic */ ConstraintHeaderViewImpl a;

    public cod(ConstraintHeaderViewImpl constraintHeaderViewImpl) {
        this.a = constraintHeaderViewImpl;
    }

    @Override // defpackage.dz
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if ((this.a.getLayoutDirection() != 0 || i <= 0) && (this.a.getLayoutDirection() != 1 || i >= 0)) {
            return;
        }
        this.a.l();
        this.a.k.aC(this);
    }
}
