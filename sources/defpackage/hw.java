package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: hw  reason: default package */
/* loaded from: classes.dex */
public final class hw implements gk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hw(ActionMenuView actionMenuView, int i) {
        this.b = i;
        this.a = actionMenuView;
    }

    public hw(eb ebVar, int i) {
        this.b = i;
        this.a = ebVar;
    }

    @Override // defpackage.gk
    public final boolean N(gm gmVar, MenuItem menuItem) {
        opu opuVar;
        if (this.b == 0 && (opuVar = ((ActionMenuView) this.a).e) != null) {
            if (((Toolbar) opuVar.a).z.n()) {
                return true;
            }
            opu opuVar2 = ((Toolbar) opuVar.a).A;
            return opuVar2 != null && ((eb) opuVar2.a).b.onMenuItemSelected(0, menuItem);
        }
        return false;
    }

    @Override // defpackage.gk
    public final void L(gm gmVar) {
        if (this.b == 0) {
            gk gkVar = ((ActionMenuView) this.a).d;
            if (gkVar == null) {
                return;
            }
            gkVar.L(gmVar);
        } else if (((eb) this.a).a.s()) {
            ((eb) this.a).b.onPanelClosed(108, gmVar);
        } else if (!((eb) this.a).b.onPreparePanel(0, null, gmVar)) {
        } else {
            ((eb) this.a).b.onMenuOpened(108, gmVar);
        }
    }
}
