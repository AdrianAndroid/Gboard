package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: huc  reason: default package */
/* loaded from: classes.dex */
public final class huc implements igy {
    public igx a;
    final /* synthetic */ hud b;

    public huc(hud hudVar) {
        this.b = hudVar;
    }

    @Override // defpackage.igy
    public final int a() {
        return this.b.b.b();
    }

    @Override // defpackage.igy
    public final long b() {
        return this.b.e.gi();
    }

    @Override // defpackage.igy
    public final long c() {
        return this.b.p;
    }

    @Override // defpackage.igy
    public final View e(ice iceVar) {
        return this.b.e.X(iceVar);
    }

    @Override // defpackage.igy
    public final View f() {
        return this.b.b.d();
    }

    @Override // defpackage.igy
    public final gqc g() {
        return this.b.b.h();
    }

    @Override // defpackage.igy
    public final ibm h() {
        return this.b.c;
    }

    @Override // defpackage.igy
    public final icf i() {
        return this.b.d;
    }

    @Override // defpackage.igy
    public final idk j() {
        return this.b.b.hO();
    }

    @Override // defpackage.igy
    public final imn k() {
        return this.b.b.s();
    }

    @Override // defpackage.igy
    public final void l(hfh hfhVar) {
        this.b.e.Z(hfhVar);
    }

    @Override // defpackage.igy
    public final void m() {
        hud hudVar = this.b;
        igx igxVar = this.a;
        if (!hudVar.m || hudVar.k != null) {
            return;
        }
        hudVar.k = igxVar;
        for (int i = 0; i < hudVar.g.length; i++) {
            igx h = hudVar.h(i);
            if (h != null && h != igxVar && !h.gR()) {
                h.m();
            }
        }
    }

    @Override // defpackage.igy
    public final void n(hfd hfdVar) {
        if (hfdVar.i > 0) {
            this.b.b.hO().g(idv.USER_ACTION_TO_EVENT_FIRED, hfdVar.h - hfdVar.i);
        }
        this.b.b.z(hfdVar);
    }

    @Override // defpackage.igy
    public final void o(hfh hfhVar) {
        this.b.e.ad(hfhVar);
    }

    @Override // defpackage.igy
    public final boolean p() {
        return this.b.n;
    }

    @Override // defpackage.igy
    public final View d(MotionEvent motionEvent, int i) {
        hud hudVar = this.b;
        igz igzVar = hudVar.l;
        if (igzVar == null || igzVar == this.a) {
            SoftKeyboardView softKeyboardView = hudVar.j;
            if (softKeyboardView != null) {
                return softKeyboardView.c(motionEvent, i);
            }
            return null;
        }
        return igzVar.a(motionEvent, i);
    }
}
