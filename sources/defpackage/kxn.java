package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* renamed from: kxn  reason: default package */
/* loaded from: classes.dex */
final class kxn extends kxs {
    private final kxp a;

    public kxn(kxp kxpVar) {
        this.a = kxpVar;
    }

    @Override // defpackage.kxs
    public final void a(Matrix matrix, kwx kwxVar, int i, Canvas canvas) {
        kxp kxpVar = this.a;
        float f = kxpVar.e;
        float f2 = kxpVar.f;
        RectF rectF = new RectF(kxpVar.a, kxpVar.b, kxpVar.c, kxpVar.d);
        Path path = kwxVar.k;
        if (f2 < 0.0f) {
            int[] iArr = kwx.c;
            iArr[0] = 0;
            iArr[1] = kwxVar.j;
            iArr[2] = kwxVar.i;
            iArr[3] = kwxVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = kwx.c;
            iArr2[0] = 0;
            iArr2[1] = kwxVar.h;
            iArr2[2] = kwxVar.i;
            iArr2[3] = kwxVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = kwx.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        kwxVar.f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, kwx.c, kwx.d, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (f2 >= 0.0f) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, kwxVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, kwxVar.f);
        canvas.restore();
    }
}
