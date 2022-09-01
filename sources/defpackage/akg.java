package defpackage;

import android.animation.TypeEvaluator;

/* compiled from: PG */
/* renamed from: akg  reason: default package */
/* loaded from: classes.dex */
public final class akg implements TypeEvaluator {
    private vt[] a;

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        vt[] vtVarArr = (vt[]) obj;
        vt[] vtVarArr2 = (vt[]) obj2;
        if (!kd.c(vtVarArr, vtVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!kd.c(this.a, vtVarArr)) {
            this.a = kd.e(vtVarArr);
        }
        for (int i = 0; i < vtVarArr.length; i++) {
            vt vtVar = this.a[i];
            vt vtVar2 = vtVarArr[i];
            vt vtVar3 = vtVarArr2[i];
            vtVar.a = vtVar2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = vtVar2.b;
                if (i2 < fArr.length) {
                    vtVar.b[i2] = (fArr[i2] * (1.0f - f)) + (vtVar3.b[i2] * f);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
