package com.google.android.apps.inputmethod.libs.latin5.handler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinPreemptiveDecodeHandler extends AbstractMotionEventHandler {
    public LatinPreemptiveDecodeHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final boolean gR() {
        return true;
    }

    @Override // defpackage.igx
    public final void h(MotionEvent motionEvent) {
        ial c;
        if (this.l.g().o()) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        View d = this.l.d(motionEvent, actionIndex);
        if (!(d instanceof SoftKeyView)) {
            return;
        }
        SoftKeyView softKeyView = (SoftKeyView) d;
        if (!softKeyView.isEnabled() || (c = softKeyView.c(iah.PRESS)) == null) {
            return;
        }
        iay d2 = c.d();
        if (d2.c != -10043 || d2.d != iax.DECODE) {
            return;
        }
        igy igyVar = this.l;
        hfd b = hfd.b();
        b.j(new iay(-20003, d2.d, d2.e));
        b.a = iah.DOWN;
        b.l(motionEvent.getX(actionIndex), motionEvent.getY(actionIndex));
        b.i = motionEvent.getEventTime();
        b.c = softKeyView.b;
        b.d = softKeyView.getId();
        b.g = x();
        b.n = motionEvent.getPressure(actionIndex);
        b.e = softKeyView.e;
        igyVar.n(b);
    }
}
