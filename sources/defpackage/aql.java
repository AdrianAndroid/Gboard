package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: aql  reason: default package */
/* loaded from: classes.dex */
public final class aql extends aqf {
    private final Paint i;
    private final aqi l;
    private aoh m;
    private final RectF h = new RectF();
    private final float[] j = new float[8];
    private final Path k = new Path();

    public aql(amy amyVar, aqi aqiVar) {
        super(amyVar, aqiVar);
        anj anjVar = new anj();
        this.i = anjVar;
        this.l = aqiVar;
        anjVar.setAlpha(0);
        anjVar.setStyle(Paint.Style.FILL);
        anjVar.setColor(aqiVar.k);
    }

    @Override // defpackage.aqf, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.E) {
            this.m = new aov(asjVar);
        }
    }

    @Override // defpackage.aqf, defpackage.ann
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        RectF rectF2 = this.h;
        aqi aqiVar = this.l;
        rectF2.set(0.0f, 0.0f, aqiVar.i, aqiVar.j);
        this.a.mapRect(this.h);
        rectF.set(this.h);
    }

    @Override // defpackage.aqf
    public final void i(Canvas canvas, Matrix matrix, int i) {
        aoh aohVar;
        int alpha = Color.alpha(this.l.k);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.g.e == null ? 100 : ((Integer) aohVar.e()).intValue())) / 100.0f) * 255.0f);
        this.i.setAlpha(intValue);
        aoh aohVar2 = this.m;
        if (aohVar2 != null) {
            this.i.setColorFilter((ColorFilter) aohVar2.e());
        }
        if (intValue <= 0) {
            return;
        }
        float[] fArr = this.j;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        aqi aqiVar = this.l;
        float f = aqiVar.i;
        fArr[2] = f;
        fArr[3] = 0.0f;
        fArr[4] = f;
        float f2 = aqiVar.j;
        fArr[5] = f2;
        fArr[6] = 0.0f;
        fArr[7] = f2;
        matrix.mapPoints(fArr);
        this.k.reset();
        Path path = this.k;
        float[] fArr2 = this.j;
        path.moveTo(fArr2[0], fArr2[1]);
        Path path2 = this.k;
        float[] fArr3 = this.j;
        path2.lineTo(fArr3[2], fArr3[3]);
        Path path3 = this.k;
        float[] fArr4 = this.j;
        path3.lineTo(fArr4[4], fArr4[5]);
        Path path4 = this.k;
        float[] fArr5 = this.j;
        path4.lineTo(fArr5[6], fArr5[7]);
        Path path5 = this.k;
        float[] fArr6 = this.j;
        path5.lineTo(fArr6[0], fArr6[1]);
        this.k.close();
        canvas.drawPath(this.k, this.i);
    }
}
