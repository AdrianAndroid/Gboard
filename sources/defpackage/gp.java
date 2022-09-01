package defpackage;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: gp  reason: default package */
/* loaded from: classes.dex */
class gp extends ye {
    final ActionProvider a;

    public gp(ActionProvider actionProvider) {
        this.a = actionProvider;
    }

    @Override // defpackage.ye
    public final View a() {
        return this.a.onCreateActionView();
    }

    @Override // defpackage.ye
    public final void b(SubMenu subMenu) {
        this.a.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.ye
    public final boolean c() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.ye
    public final boolean d() {
        return this.a.onPerformDefaultAction();
    }
}
