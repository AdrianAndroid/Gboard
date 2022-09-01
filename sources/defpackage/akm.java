package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* compiled from: PG */
/* renamed from: akm  reason: default package */
/* loaded from: classes.dex */
final class akm {
    public static final Matrix a = new Matrix();
    Paint b;
    Paint c;
    final akk d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final qo l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;

    public akm() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new qo();
        this.d = new akk();
        this.m = new Path();
        this.n = new Path();
    }

    public final void a(akk akkVar, Matrix matrix, Canvas canvas, int i, int i2) {
        akkVar.a.set(matrix);
        akkVar.a.preConcat(akkVar.j);
        canvas.save();
        for (int i3 = 0; i3 < akkVar.b.size(); i3++) {
            wg wgVar = (wg) akkVar.b.get(i3);
            if (wgVar instanceof akk) {
                a((akk) wgVar, akkVar.a, canvas, i, i2);
            } else if (wgVar instanceof akl) {
                akl aklVar = (akl) wgVar;
                float f = i / this.g;
                float f2 = i2 / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = akkVar.a;
                this.o.set(matrix2);
                this.o.postScale(f, f2);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                double hypot = Math.hypot(fArr[0], fArr[1]);
                double hypot2 = Math.hypot(fArr[2], fArr[3]);
                float f3 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) hypot, (float) hypot2);
                float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.m;
                    path.reset();
                    vt[] vtVarArr = aklVar.m;
                    if (vtVarArr != null) {
                        vt.a(vtVarArr, path);
                    }
                    Path path2 = this.m;
                    this.n.reset();
                    if (aklVar.e()) {
                        this.n.setFillType(aklVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        this.n.addPath(path2, this.o);
                        canvas.clipPath(this.n);
                    } else {
                        akj akjVar = (akj) aklVar;
                        float f4 = akjVar.e;
                        if (f4 != 0.0f || akjVar.f != 1.0f) {
                            float f5 = akjVar.g;
                            float f6 = (f4 + f5) % 1.0f;
                            float f7 = (akjVar.f + f5) % 1.0f;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            float length = this.p.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path2.reset();
                            if (f8 > f9) {
                                this.p.getSegment(f8, length, path2, true);
                                this.p.getSegment(0.0f, f9, path2, true);
                            } else {
                                this.p.getSegment(f8, f9, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(path2, this.o);
                        if (akjVar.l.g()) {
                            knf knfVar = akjVar.l;
                            if (this.c == null) {
                                Paint paint = new Paint(1);
                                this.c = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.c;
                            if (knfVar.d()) {
                                Shader shader = (Shader) knfVar.c;
                                shader.setLocalMatrix(this.o);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(akjVar.d * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                paint2.setColor(akp.a(knfVar.a, akjVar.d));
                            }
                            paint2.setColorFilter(null);
                            this.n.setFillType(akjVar.o == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(this.n, paint2);
                        }
                        if (akjVar.k.g()) {
                            knf knfVar2 = akjVar.k;
                            if (this.b == null) {
                                Paint paint3 = new Paint(1);
                                this.b = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.b;
                            Paint.Join join = akjVar.i;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = akjVar.h;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(akjVar.j);
                            if (knfVar2.d()) {
                                Shader shader2 = (Shader) knfVar2.c;
                                shader2.setLocalMatrix(this.o);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(akjVar.c * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                paint4.setColor(akp.a(knfVar2.a, akjVar.c));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(akjVar.b * abs * min);
                            canvas.drawPath(this.n, paint4);
                        }
                    }
                }
            }
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.i;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.i = i;
    }

    public akm(akm akmVar) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        qo qoVar = new qo();
        this.l = qoVar;
        this.d = new akk(akmVar.d, qoVar);
        this.m = new Path(akmVar.m);
        this.n = new Path(akmVar.n);
        this.e = akmVar.e;
        this.f = akmVar.f;
        this.g = akmVar.g;
        this.h = akmVar.h;
        int i = akmVar.q;
        this.q = 0;
        this.i = akmVar.i;
        this.j = akmVar.j;
        String str = akmVar.j;
        if (str != null) {
            qoVar.put(str, this);
        }
        this.k = akmVar.k;
    }
}
