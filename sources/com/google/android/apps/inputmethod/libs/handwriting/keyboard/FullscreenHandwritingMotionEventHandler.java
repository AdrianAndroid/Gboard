package com.google.android.apps.inputmethod.libs.handwriting.keyboard;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FullscreenHandwritingMotionEventHandler extends HandwritingMotionEventHandler {
    private static final iay m = new iay(-10038, null, false);
    private static final ice[] n = {ice.HEADER, ice.BODY};
    private View o;
    private ice q;
    private final Matrix[] p = new Matrix[ice.values().length];
    private final float[] r = new float[2];

    public FullscreenHandwritingMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler
    public final void b(View view) {
        this.o = view;
        if (view == null) {
            o(10.0f, 10.0f);
        } else {
            super.b(view);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler
    public final boolean c(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            return u(motionEvent) || super.c(motionEvent);
        }
        return false;
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler
    public final boolean d(MotionEvent motionEvent) {
        ice iceVar;
        if (!t(motionEvent)) {
            return false;
        }
        if (u(motionEvent) && motionEvent.getActionMasked() != 9) {
            ice[] iceVarArr = n;
            int length = iceVarArr.length;
            for (int i = 0; i < 2; i++) {
                ice iceVar2 = iceVarArr[i];
                int ordinal = iceVar2.ordinal();
                View e = this.l.e(iceVar2);
                Matrix[] matrixArr = this.p;
                if (matrixArr[ordinal] == null) {
                    matrixArr[ordinal] = new Matrix();
                }
                if (e != null) {
                    jdy.c(this.p[ordinal], this.c, e);
                }
            }
            ice[] iceVarArr2 = n;
            int length2 = iceVarArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    iceVar = null;
                    break;
                }
                iceVar = iceVarArr2[i2];
                View e2 = this.l.e(iceVar);
                if (e2 != null) {
                    int ordinal2 = iceVar.ordinal();
                    this.r[0] = motionEvent.getX();
                    this.r[1] = motionEvent.getY();
                    this.p[ordinal2].mapPoints(this.r);
                    float f = this.r[0];
                    if (f >= 0.0f && f <= e2.getWidth()) {
                        float f2 = this.r[1];
                        if (f2 >= 0.0f && f2 <= e2.getHeight()) {
                            break;
                        }
                    }
                }
                i2++;
            }
            this.q = iceVar;
            if (iceVar != null || !this.h.g()) {
                return false;
            }
        }
        return super.d(motionEvent);
    }

    @Override // com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler
    public final void a() {
        if (this.b == 1 && this.o == null) {
            ice iceVar = this.q;
            if (iceVar != null) {
                View e = this.l.e(iceVar);
                if (e != null) {
                    int ordinal = iceVar.ordinal();
                    for (MotionEvent motionEvent : this.g) {
                        motionEvent.transform(this.p[ordinal]);
                        e.dispatchTouchEvent(motionEvent);
                    }
                }
            } else {
                l();
                this.l.n(f(m));
            }
        }
        super.a();
    }
}
