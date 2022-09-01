package defpackage;

import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gre  reason: default package */
/* loaded from: classes.dex */
public final class gre implements jdc {
    final /* synthetic */ grg a;

    public gre(grg grgVar) {
        this.a = grgVar;
    }

    @Override // defpackage.jdc
    public final gqc a() {
        jdc jdcVar = this.a.c;
        return jdcVar != null ? jdcVar.a() : gqc.b;
    }

    @Override // defpackage.jdc
    public final void b(MotionEvent motionEvent) {
        int actionMasked;
        int actionIndex = motionEvent.getActionIndex();
        grg grgVar = this.a;
        int i = grgVar.d;
        if (i == -1) {
            grgVar.d = actionIndex;
            i = actionIndex;
        }
        if (i < motionEvent.getPointerCount()) {
            grg grgVar2 = this.a;
            grgVar2.b(motionEvent.getX(grgVar2.d), motionEvent.getY(this.a.d));
        }
        if (actionIndex == this.a.d && ((actionMasked = motionEvent.getActionMasked()) == 2 || actionMasked == 7)) {
            return;
        }
        this.a.c(motionEvent);
    }

    @Override // defpackage.jdc
    public final void c() {
    }

    @Override // defpackage.jdc
    public final void d() {
    }

    @Override // defpackage.jdc
    public final void e(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // defpackage.jdc
    public final void f(MotionEvent motionEvent) {
    }

    @Override // defpackage.jdc
    public final boolean g(MotionEvent motionEvent) {
        b(motionEvent);
        return true;
    }
}
