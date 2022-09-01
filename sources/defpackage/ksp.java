package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* renamed from: ksp  reason: default package */
/* loaded from: classes.dex */
final class ksp implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public ksp(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        opu opuVar;
        ada adaVar = this.a.a;
        if (adaVar == null || !adaVar.l()) {
            if (!this.c || (opuVar = this.a.f) == null) {
                return;
            }
            opuVar.c(this.b);
            return;
        }
        aad.H(this.b, this);
    }
}
