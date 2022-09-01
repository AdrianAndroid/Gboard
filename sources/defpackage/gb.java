package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb extends ko {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.ko
    public final hd a() {
        ho hoVar;
        opu opuVar = this.a.c;
        if (opuVar == null || (hoVar = ((hs) opuVar.a).j) == null) {
            return null;
        }
        return hoVar.a();
    }

    @Override // defpackage.ko
    public final boolean b() {
        hd a;
        ActionMenuItemView actionMenuItemView = this.a;
        gl glVar = actionMenuItemView.b;
        return glVar != null && glVar.b(actionMenuItemView.a) && (a = a()) != null && a.u();
    }
}
