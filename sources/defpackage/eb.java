package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eb  reason: default package */
/* loaded from: classes.dex */
public final class eb extends cm {
    public final jt a;
    public final Window.Callback b;
    boolean c;
    private boolean e;
    private boolean f;
    private final opu i;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new az(this, 6);
    public final opu d = new opu(this);

    public eb(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        opu opuVar = new opu(this);
        this.i = opuVar;
        ob obVar = new ob(toolbar, false);
        this.a = obVar;
        nq.g(callback);
        this.b = callback;
        obVar.d = callback;
        toolbar.A = opuVar;
        obVar.n(charSequence);
    }

    @Override // defpackage.cm
    public final int a() {
        return ((ob) this.a).b;
    }

    @Override // defpackage.cm
    public final Context b() {
        return this.a.b();
    }

    @Override // defpackage.cm
    public final void d(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((cl) this.g.get(i)).a();
        }
    }

    @Override // defpackage.cm
    public final void e() {
        ((ob) this.a).a.removeCallbacks(this.h);
    }

    @Override // defpackage.cm
    public final void f(boolean z) {
    }

    @Override // defpackage.cm
    public final void g(boolean z) {
        v(4, 4);
    }

    @Override // defpackage.cm
    public final void h(boolean z) {
    }

    @Override // defpackage.cm
    public final void i(CharSequence charSequence) {
        this.a.k(charSequence);
    }

    @Override // defpackage.cm
    public final void j(CharSequence charSequence) {
        this.a.n(charSequence);
    }

    @Override // defpackage.cm
    public final boolean k() {
        return this.a.q();
    }

    @Override // defpackage.cm
    public final boolean l() {
        if (this.a.p()) {
            this.a.c();
            return true;
        }
        return false;
    }

    @Override // defpackage.cm
    public final boolean m() {
        ((ob) this.a).a.removeCallbacks(this.h);
        aad.H(((ob) this.a).a, this.h);
        return true;
    }

    @Override // defpackage.cm
    public final boolean n(int i, KeyEvent keyEvent) {
        Menu u = u();
        if (u != null) {
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            u.setQwertyMode(z);
            return u.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // defpackage.cm
    public final boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // defpackage.cm
    public final boolean p() {
        return this.a.t();
    }

    @Override // defpackage.cm
    public final void q() {
    }

    @Override // defpackage.cm
    public final void r() {
        v(2, 2);
    }

    @Override // defpackage.cm
    public final void s() {
        this.a.h(null);
    }

    @Override // defpackage.cm
    public final void t() {
    }

    public final Menu u() {
        if (!this.e) {
            jt jtVar = this.a;
            ea eaVar = new ea(this);
            hw hwVar = new hw(this, 1);
            Toolbar toolbar = ((ob) jtVar).a;
            toolbar.x = eaVar;
            toolbar.y = hwVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(eaVar, hwVar);
            }
            this.e = true;
        }
        return ((ob) this.a).a.g();
    }

    public final void v(int i, int i2) {
        jt jtVar = this.a;
        jtVar.g((i & i2) | ((i2 ^ (-1)) & ((ob) jtVar).b));
    }
}
