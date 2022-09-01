package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epq  reason: default package */
/* loaded from: classes.dex */
public final class epq implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ epr a;

    public epq(epr eprVar) {
        this.a = eprVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        epr eprVar = this.a;
        eprVar.l = true;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float f = eprVar.k;
        eprVar.g(scaleFactor * f);
        if (f != eprVar.k) {
            Matrix imageMatrix = eprVar.a.getImageMatrix();
            float f2 = eprVar.k / f;
            imageMatrix.postScale(f2, f2, focusX, focusY);
            float[] fArr = new float[9];
            imageMatrix.getValues(fArr);
            float f3 = fArr[2];
            float f4 = fArr[5];
            int i = eprVar.i;
            float f5 = eprVar.k;
            float f6 = (i * f5) / 2.0f;
            float f7 = (eprVar.j * f5) / 2.0f;
            eprVar.g = epr.b(f3 + f6, eprVar.e - f6, eprVar.d + f6);
            eprVar.h = epr.b(f4 + f7, eprVar.f - f7, eprVar.c + f7);
            eprVar.e();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
