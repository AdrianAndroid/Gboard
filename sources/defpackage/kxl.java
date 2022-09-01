package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: kxl  reason: default package */
/* loaded from: classes.dex */
public final class kxl {
    private final kxt[] a = new kxt[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final kxt g = new kxt();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public kxl() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new kxt();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float d(int i) {
        return (i + 1) * 90;
    }

    public final void a(kxj kxjVar, float f, RectF rectF, Path path) {
        b(kxjVar, f, rectF, null, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    public final void b(kxj kxjVar, float f, RectF rectF, opu opuVar, Path path) {
        int i;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        ?? r5 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            (i2 != 1 ? i2 != 2 ? i2 != 3 ? kxjVar.k : kxjVar.j : kxjVar.m : kxjVar.l).a(this.a[i2], f, (i2 != 1 ? i2 != 2 ? i2 != 3 ? kxjVar.c : kxjVar.b : kxjVar.e : kxjVar.d).a(rectF));
            float d = d(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            this.b[i2].setTranslate(this.d.x, this.d.y);
            this.b[i2].preRotate(d);
            float[] fArr = this.h;
            kxt kxtVar = this.a[i2];
            fArr[0] = kxtVar.b;
            fArr[1] = kxtVar.c;
            this.b[i2].mapPoints(fArr);
            this.c[i2].reset();
            Matrix matrix = this.c[i2];
            float[] fArr2 = this.h;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.c[i2].preRotate(d(i2));
            i2++;
        }
        int i3 = 0;
        for (i = 4; i3 < i; i = 4) {
            float[] fArr3 = this.h;
            kxt kxtVar2 = this.a[i3];
            char c = r5 == true ? 1 : 0;
            char c2 = r5 == true ? 1 : 0;
            fArr3[c] = 0.0f;
            fArr3[1] = kxtVar2.a;
            this.b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[r5], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[r5], fArr5[1]);
            }
            this.a[i3].c(this.b[i3], path);
            if (opuVar != null) {
                kxt kxtVar3 = this.a[i3];
                Matrix matrix2 = this.b[i3];
                ((kxe) opuVar.a).d.set(i3, (boolean) r5);
                ((kxe) opuVar.a).b[i3] = kxtVar3.a(matrix2);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.h;
            kxt kxtVar4 = this.a[i3];
            fArr6[r5] = kxtVar4.b;
            fArr6[1] = kxtVar4.c;
            this.b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            kxt kxtVar5 = this.a[i5];
            fArr7[r5] = 0.0f;
            fArr7[1] = kxtVar5.a;
            this.b[i5].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f2 = fArr8[r5];
            float[] fArr9 = this.i;
            int i6 = i3;
            float max = Math.max(((float) Math.hypot(f2 - fArr9[r5], fArr8[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            kxt kxtVar6 = this.a[i6];
            fArr10[0] = kxtVar6.b;
            fArr10[1] = kxtVar6.c;
            this.b[i6].mapPoints(fArr10);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - this.h[0]);
            } else {
                Math.abs(rectF.centerY() - this.h[1]);
            }
            this.g.e();
            if (i6 == 1) {
                kxc kxcVar = kxjVar.h;
            } else if (i6 == 2) {
                kxc kxcVar2 = kxjVar.i;
            } else if (i6 != 3) {
                kxc kxcVar3 = kxjVar.g;
            } else {
                kxc kxcVar4 = kxjVar.f;
            }
            this.g.d(max, 0.0f);
            this.j.reset();
            this.g.c(this.c[i6], this.j);
            if (!this.l || (!c(this.j, i6) && !c(this.j, i5))) {
                this.g.c(this.c[i6], path);
            } else {
                Path path2 = this.j;
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                fArr11[0] = 0.0f;
                fArr11[1] = this.g.a;
                this.c[i6].mapPoints(fArr11);
                Path path3 = this.e;
                float[] fArr12 = this.h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i6], this.e);
            }
            if (opuVar != null) {
                kxt kxtVar7 = this.g;
                Matrix matrix3 = this.c[i6];
                ((kxe) opuVar.a).d.set(i6 + 4, false);
                ((kxe) opuVar.a).c[i6] = kxtVar7.a(matrix3);
            }
            i3 = i4;
            r5 = 0;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
