package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ksg  reason: default package */
/* loaded from: classes.dex */
public final class ksg implements Runnable {
    final /* synthetic */ ksh a;
    private final CoordinatorLayout b;
    private final View c;

    public ksg(ksh kshVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = kshVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.e) == null) {
            return;
        }
        if (overScroller.computeScrollOffset()) {
            ksh kshVar = this.a;
            kshVar.E(this.b, this.c, kshVar.e.getCurrY());
            aad.H(this.c, this);
            return;
        }
        this.a.z(this.b, this.c);
    }
}
