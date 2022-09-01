package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* renamed from: gq  reason: default package */
/* loaded from: classes.dex */
final class gq extends gp implements ActionProvider.VisibilityListener {
    private opu c;

    public gq(ActionProvider actionProvider) {
        super(actionProvider);
    }

    @Override // defpackage.ye
    public final View e(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }

    @Override // defpackage.ye
    public final boolean f() {
        return this.a.isVisible();
    }

    @Override // defpackage.ye
    public final boolean g() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.ye
    public final void h(opu opuVar) {
        this.c = opuVar;
        this.a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        opu opuVar = this.c;
        if (opuVar != null) {
            ((go) opuVar.a).j.C();
        }
    }
}
