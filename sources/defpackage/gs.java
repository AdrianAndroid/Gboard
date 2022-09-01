package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: gs  reason: default package */
/* loaded from: classes.dex */
final class gs implements MenuItem.OnActionExpandListener {
    final /* synthetic */ gu a;
    private final MenuItem.OnActionExpandListener b;

    public gs(gu guVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.a = guVar;
        this.b = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.b.onMenuItemActionCollapse(this.a.a(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.b.onMenuItemActionExpand(this.a.a(menuItem));
    }
}
