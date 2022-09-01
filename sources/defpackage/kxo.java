package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* renamed from: kxo  reason: default package */
/* loaded from: classes.dex */
final class kxo extends kxs {
    private final kxq a;
    private final float b;
    private final float e;

    public kxo(kxq kxqVar, float f, float f2) {
        this.a = kxqVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.kxs
    public final void a(Matrix matrix, kwx kwxVar, int i, Canvas canvas) {
        kxq kxqVar = this.a;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(kxqVar.b - this.e, kxqVar.a - this.b), 0.0f);
        this.d.set(matrix);
        this.d.preTranslate(this.b, this.e);
        this.d.preRotate(b());
        Matrix matrix2 = this.d;
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = kwx.a;
        iArr[0] = kwxVar.j;
        iArr[1] = kwxVar.i;
        iArr[2] = kwxVar.h;
        kwxVar.g.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, kwx.a, kwx.b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, kwxVar.g);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float b() {
        kxq kxqVar = this.a;
        return (float) Math.toDegrees(Math.atan((kxqVar.b - this.e) / (kxqVar.a - this.b)));
    }
}
