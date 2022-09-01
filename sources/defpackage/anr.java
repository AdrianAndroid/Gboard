package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* renamed from: anr  reason: default package */
/* loaded from: classes.dex */
public final class anr extends ank {
    private final String c;
    private final boolean d;
    private final qs e = new qs();
    private final qs f = new qs();
    private final RectF g = new RectF();
    private final int h;
    private final aoh i;
    private final aoh j;
    private final aoh k;
    private aov l;
    private final int m;

    public anr(amy amyVar, aqf aqfVar, apt aptVar) {
        super(amyVar, aqfVar, wt.d(aptVar.l), xa.b(aptVar.m), aptVar.g, aptVar.c, aptVar.f, aptVar.h, aptVar.i);
        this.c = aptVar.a;
        this.m = aptVar.k;
        this.d = aptVar.j;
        this.h = (int) (amyVar.a.a() / 32.0f);
        aoh a = aptVar.b.a();
        this.i = a;
        a.g(this);
        aqfVar.h(a);
        aoh a2 = aptVar.d.a();
        this.j = a2;
        a2.g(this);
        aqfVar.h(a2);
        aoh a3 = aptVar.e.a();
        this.k = a3;
        a3.g(this);
        aqfVar.h(a3);
    }

    private final int h() {
        int round = Math.round(this.j.c * this.h);
        int round2 = Math.round(this.k.c * this.h);
        int round3 = Math.round(this.i.c * this.h);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        aov aovVar = this.l;
        if (aovVar != null) {
            Integer[] numArr = (Integer[]) aovVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.ank, defpackage.apa
    public final void a(Object obj, asj asjVar) {
        super.a(obj, asjVar);
        if (obj == and.F) {
            aov aovVar = this.l;
            if (aovVar != null) {
                this.a.j(aovVar);
            }
            aov aovVar2 = new aov(asjVar);
            this.l = aovVar2;
            aovVar2.g(this);
            this.a.h(this.l);
        }
    }

    @Override // defpackage.ank, defpackage.ann
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        float f2;
        if (this.d) {
            return;
        }
        c(this.g, matrix, false);
        if (this.m != 1) {
            long h = h();
            shader = (RadialGradient) this.f.d(h);
            if (shader == null) {
                PointF pointF = (PointF) this.j.e();
                PointF pointF2 = (PointF) this.k.e();
                azp azpVar = (azp) this.i.e();
                int[] i2 = i((int[]) azpVar.a);
                Object obj = azpVar.b;
                RadialGradient radialGradient = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - f, pointF2.y - f2), i2, (float[]) obj, Shader.TileMode.CLAMP);
                this.f.j(h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.e.d(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.j.e();
                PointF pointF4 = (PointF) this.k.e();
                azp azpVar2 = (azp) this.i.e();
                shader = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i((int[]) azpVar2.a), (float[]) azpVar2.b, Shader.TileMode.CLAMP);
                this.e.j(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.anl
    public final String g() {
        return this.c;
    }
}
