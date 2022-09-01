package defpackage;

import android.view.MenuItem;

/* compiled from: PG */
/* renamed from: gt  reason: default package */
/* loaded from: classes.dex */
final class gt implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ gu a;
    private final MenuItem.OnMenuItemClickListener b;

    public gt(gu guVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.a = guVar;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.b.onMenuItemClick(this.a.a(menuItem));
    }
}
