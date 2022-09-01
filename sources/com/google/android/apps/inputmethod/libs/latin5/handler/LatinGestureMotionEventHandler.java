package com.google.android.apps.inputmethod.libs.latin5.handler;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinGestureMotionEventHandler extends AbstractGestureMotionEventHandler {
    public final AtomicBoolean j = new AtomicBoolean(false);
    private Delight5Facilitator m;

    public LatinGestureMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar, 100);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler, defpackage.hfh
    public boolean c(hfd hfdVar) {
        iay[] iayVarArr = hfdVar.b;
        if (iayVarArr != null && iayVarArr.length > 0) {
            int i = iayVarArr[0].c;
            if (i == -20002) {
                this.j.set(false);
                return true;
            } else if (i == -20001) {
                this.j.set(true);
                return true;
            }
        }
        super.c(hfdVar);
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public ViewGroup d(View view) {
        if (view == null) {
            return null;
        }
        return (ViewGroup) view.findViewById(R.id.input_area);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final synchronized void g() {
        super.g();
        this.j.set(false);
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    protected boolean p(SoftKeyView softKeyView) {
        ial c;
        return (softKeyView.c(iah.DOWN) != null || (c = softKeyView.c(iah.PRESS)) == null || c.e || c.d() == null || c.d().c == 67) ? false : true;
    }

    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final boolean q() {
        Delight5Facilitator delight5Facilitator;
        if (this.m == null) {
            this.m = Delight5Facilitator.g();
        }
        return this.j.get() && (delight5Facilitator = this.m) != null && delight5Facilitator.h.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.inputmethod.libs.gestureui.AbstractGestureMotionEventHandler
    public final boolean s() {
        ial c;
        if (!super.s()) {
            return false;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.a.keyAt(i);
            mwj mwjVar = (mwj) this.a.valueAt(i);
            View view = (View) this.d.get(keyAt);
            if (view != null && (view instanceof SoftKeyView) && (c = ((SoftKeyView) view).c(iah.PRESS)) != null && c.d() != null && c.d().c == 62) {
                mwj mwjVar2 = (mwj) this.b.get(keyAt);
                Rect rect = new Rect();
                jdy.i(view, this.e, rect);
                if (mwjVar2.e >= rect.top && mwjVar2.e <= rect.bottom) {
                    float abs = Math.abs(mwjVar2.d - mwjVar.d);
                    float abs2 = Math.abs(mwjVar2.e - mwjVar.e);
                    if (abs == 0.0f) {
                        if (abs2 == 0.0f) {
                            return false;
                        }
                    } else if (abs2 / abs < 0.4f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
