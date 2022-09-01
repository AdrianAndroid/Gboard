package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: fo  reason: default package */
/* loaded from: classes.dex */
public final class fo extends fm implements gk {
    public final gm a;
    private final Context b;
    private final ActionBarContextView c;
    private final fl f;
    private WeakReference g;
    private boolean h;

    public fo(Context context, ActionBarContextView actionBarContextView, fl flVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = flVar;
        gm gmVar = new gm(actionBarContextView.getContext());
        gmVar.D();
        this.a = gmVar;
        gmVar.b = this;
    }

    @Override // defpackage.gk
    public final void L(gm gmVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.gk
    public final boolean N(gm gmVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.fm
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fm
    public final MenuInflater b() {
        return new ft(this.c.getContext());
    }

    @Override // defpackage.fm
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.fm
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.fm
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.fm
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.fm
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.fm
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.fm
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.fm
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.fm
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.fm
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.fm
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.fm
    public final boolean n() {
        return this.c.j;
    }
}
