package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: krv  reason: default package */
/* loaded from: classes.dex */
public class krv implements TypeEvaluator {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            float f2 = fArr[i];
            float f3 = this.a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
