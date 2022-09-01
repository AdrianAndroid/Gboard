package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: eg  reason: default package */
/* loaded from: classes.dex */
public final class eg extends fm implements gk {
    public final gm a;
    public fl b;
    final /* synthetic */ eh c;
    private final Context f;
    private WeakReference g;

    public eg(eh ehVar, Context context, fl flVar) {
        this.c = ehVar;
        this.f = context;
        this.b = flVar;
        gm gmVar = new gm(context);
        gmVar.D();
        this.a = gmVar;
        gmVar.b = this;
    }

    @Override // defpackage.gk
    public final void L(gm gmVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.gk
    public final boolean N(gm gmVar, MenuItem menuItem) {
        fl flVar = this.b;
        if (flVar != null) {
            return flVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.fm
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.fm
    public final MenuInflater b() {
        return new ft(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.fm
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.fm
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.fm
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.fm
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fm
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.fm
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.fm
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.fm
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.fm
    public final boolean n() {
        return this.c.e.j;
    }

    @Override // defpackage.fm
    public final void f() {
        eh ehVar = this.c;
        if (ehVar.g != this) {
            return;
        }
        if (!eh.x(ehVar.l, false)) {
            ehVar.h = this;
            ehVar.i = this.b;
        } else {
            this.b.a(this);
        }
        this.b = null;
        this.c.u(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        eh ehVar2 = this.c;
        ehVar2.b.k(ehVar2.n);
        this.c.g = null;
    }
}
