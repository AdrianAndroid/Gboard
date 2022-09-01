package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public final class hg extends gm implements SubMenu {
    public final gm j;
    public final go k;

    public hg(Context context, gm gmVar, go goVar) {
        super(context);
        this.j = gmVar;
        this.k = goVar;
    }

    @Override // defpackage.gm
    public final gm a() {
        return this.j.a();
    }

    @Override // defpackage.gm
    public final String d() {
        int i = this.k.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.k;
    }

    @Override // defpackage.gm
    public final void p(gk gkVar) {
        this.j.p(gkVar);
    }

    @Override // defpackage.gm, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.k.setIcon(i);
        return this;
    }

    @Override // defpackage.gm, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.j.setQwertyMode(z);
    }

    @Override // defpackage.gm
    public final boolean t(go goVar) {
        return this.j.t(goVar);
    }

    @Override // defpackage.gm
    public final boolean u(gm gmVar, MenuItem menuItem) {
        return super.u(gmVar, menuItem) || this.j.u(gmVar, menuItem);
    }

    @Override // defpackage.gm
    public final boolean v(go goVar) {
        return this.j.v(goVar);
    }

    @Override // defpackage.gm
    public final boolean w() {
        return this.j.w();
    }

    @Override // defpackage.gm
    public final boolean x() {
        return this.j.x();
    }

    @Override // defpackage.gm
    public final boolean y() {
        return this.j.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.k.setIcon(drawable);
        return this;
    }
}
