package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.inputmethod.libs.expression.header.ConstraintHeaderViewImpl;

/* compiled from: PG */
/* renamed from: coe  reason: default package */
/* loaded from: classes.dex */
public final class coe extends LinearLayoutManager {
    final /* synthetic */ ConstraintHeaderViewImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coe(ConstraintHeaderViewImpl constraintHeaderViewImpl) {
        super(0);
        this.a = constraintHeaderViewImpl;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.ly
    public final boolean ae() {
        return super.ae() && this.a.l.c().d == 3;
    }
}
