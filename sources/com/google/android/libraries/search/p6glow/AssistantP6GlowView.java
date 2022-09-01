package com.google.android.libraries.search.p6glow;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.inputmethod.latin.R;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AssistantP6GlowView extends View {
    static final /* synthetic */ ome[] a;
    private final LinearGradient A;
    private Shader B;
    private Shader C;
    private Shader D;
    private Shader E;
    private Shader F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private boolean L;
    private Instant M;
    private final Path[] N;
    public Duration b;
    private final Paint c;
    private final Paint d;
    private final int[] e;
    private final olu f;
    private final olu g;
    private final olu h;
    private final olu i;
    private final olu j;
    private final olu k;
    private final olu l;
    private final olu m;
    private final olu n;
    private final olu o;
    private final olu p;
    private final float q;
    private final olu r;
    private final Path s;
    private PathMeasure t;
    private final RectF u;
    private final int[] v;
    private final int[] w;
    private final float[] x;
    private final float[] y;
    private final int z;

    static {
        olo oloVar = new olo(AssistantP6GlowView.class, "lightThickness", "getLightThickness()F", 1);
        int i = olr.a;
        a = new ome[]{oloVar, new olo(AssistantP6GlowView.class, "lightOpacity", "getLightOpacity()F", 1), new olo(AssistantP6GlowView.class, "gradientGlowBackgroundThickness", "getGradientGlowBackgroundThickness()F", 1), new olo(AssistantP6GlowView.class, "gradientGlowBackgroundOpacity", "getGradientGlowBackgroundOpacity()F", 1), new olo(AssistantP6GlowView.class, "gradientGlowForegroundThickness", "getGradientGlowForegroundThickness()F", 1), new olo(AssistantP6GlowView.class, "gradientGlowForegroundOpacity", "getGradientGlowForegroundOpacity()F", 1), new olo(AssistantP6GlowView.class, "lineSize", "getLineSize()F", 1), new olo(AssistantP6GlowView.class, "endRadius", "getEndRadius()F", 1), new olo(AssistantP6GlowView.class, "endAngle", "getEndAngle()F", 1), new olo(AssistantP6GlowView.class, "kind", "getKind()Lcom/google/android/libraries/search/p6glow/AssistantP6GlowView$Kind;", 1), new olo(AssistantP6GlowView.class, "blurLine", "getBlurLine()Z", 1), new olo(AssistantP6GlowView.class, "colorWeights", "getColorWeights()[F", 1)};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context) {
        this(context, null, 0, 0, 14, null);
        oll.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        oll.e(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        oll.e(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantP6GlowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        oll.e(context, "context");
        this.c = new Paint();
        this.d = new Paint();
        Float valueOf = Float.valueOf(0.0f);
        olu w = w(valueOf, new klr(this, 9));
        this.f = w;
        olu w2 = w(valueOf, kls.c);
        this.g = w2;
        this.h = w(valueOf, new klr(this, 5));
        olu w3 = w(valueOf, new klr(this, 4));
        this.i = w3;
        olu w4 = w(valueOf, new klr(this, 7));
        this.j = w4;
        olu w5 = w(valueOf, new klr(this, 6));
        this.k = w5;
        olu w6 = w(valueOf, new klr(this, 10));
        this.l = w6;
        this.m = w(valueOf, new klr(this, 3));
        olu w7 = w(Float.valueOf(90.0f), new klr(this, 2));
        this.n = w7;
        olu w8 = w(klp.LINE, new klr(this, 8));
        this.o = w8;
        this.p = w(false, new klr(this, 0));
        this.q = vm.f(context.getResources());
        LinearInterpolator linearInterpolator = klu.a;
        this.r = new klq(klu.f, kls.a, this);
        this.s = new Path();
        this.t = new PathMeasure();
        this.u = new RectF();
        int length = p().length - 1;
        this.x = new float[length + length];
        int length2 = p().length - 1;
        this.y = new float[length2 + length2];
        this.z = 255;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = linearGradient;
        this.C = linearGradient;
        this.D = linearGradient;
        this.E = linearGradient;
        this.F = linearGradient;
        this.L = true;
        mho mhoVar = mho.a;
        Instant now = Instant.now();
        oll.d(now, "system().now()");
        this.M = now;
        Duration ofMillis = Duration.ofMillis(8L);
        oll.d(ofMillis, "ofMillis(8)");
        this.b = ofMillis;
        this.N = new Path[]{new Path(), new Path(), new Path(), new Path(), new Path(), new Path()};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kmc.a);
        float dimension = obtainStyledAttributes.getDimension(8, 0.0f);
        ome[] omeVarArr = a;
        w.b(omeVarArr[0], Float.valueOf(dimension));
        w2.b(omeVarArr[1], Float.valueOf(obtainStyledAttributes.getFloat(7, 1.0f)));
        o(obtainStyledAttributes.getDimension(3, 0.0f));
        w3.b(omeVarArr[3], Float.valueOf(obtainStyledAttributes.getFloat(2, 0.0f)));
        w4.b(omeVarArr[4], Float.valueOf(obtainStyledAttributes.getDimension(5, 0.0f)));
        w5.b(omeVarArr[5], Float.valueOf(obtainStyledAttributes.getFloat(4, 0.0f)));
        w6.b(omeVarArr[6], Float.valueOf(obtainStyledAttributes.getDimension(9, 0.0f)));
        n(obtainStyledAttributes.getDimension(1, 0.0f));
        w7.b(omeVarArr[8], Float.valueOf(obtainStyledAttributes.getFloat(0, 90.0f)));
        klp klpVar = klp.values()[obtainStyledAttributes.getInt(6, 0)];
        oll.e(klpVar, "<set-?>");
        w8.b(omeVarArr[9], klpVar);
        obtainStyledAttributes.recycle();
        Resources resources = context.getResources();
        int[] iArr = {0, resources.getColor(R.color.f20960_resource_name_obfuscated_res_0x7f0600a5, null), resources.getColor(R.color.f20980_resource_name_obfuscated_res_0x7f0600a7, null), resources.getColor(R.color.f20990_resource_name_obfuscated_res_0x7f0600a8, null), resources.getColor(R.color.f20970_resource_name_obfuscated_res_0x7f0600a6, null), 0};
        this.e = iArr;
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int[] iArr2 = {iArr[0], iArr[1], iArr[1], i3, i3, i4, i4, i5, i5, iArr[5]};
        this.v = iArr2;
        int[] copyOf = Arrays.copyOf(iArr2, 10);
        oll.d(copyOf, "copyOf(this, size)");
        this.w = copyOf;
        oll.e(iArr2, "<this>");
        int[] iArr3 = new int[10];
        oll.e(iArr2, "<this>");
        oju it = new olw(0, 9).iterator();
        while (it.a) {
            int a2 = it.a();
            iArr3[9 - a2] = iArr2[a2];
        }
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeCap(Paint.Cap.BUTT);
        this.c.setAntiAlias(true);
        this.d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private final int[] A() {
        int i = 1;
        while (i < 9) {
            int i2 = i + 1;
            int i3 = i2 / 2;
            this.w[i] = p()[i3] > 0.0f ? this.e[i3] : 0;
            i = i2;
        }
        return this.w;
    }

    private static final void B(Canvas canvas, float f, Paint paint) {
        canvas.drawLine(0.0f, 0.0f, f, 0.0f, paint);
    }

    public static final /* synthetic */ void q(AssistantP6GlowView assistantP6GlowView) {
        assistantP6GlowView.L = true;
    }

    private final float s(int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += p()[i2];
        }
        return f;
    }

    private final float t() {
        return (p()[1] + p()[2] + p()[3] + p()[4]) * h() * 0.5f;
    }

    private final Shader u(int i) {
        float f;
        float f2;
        float f3;
        float b;
        float s = s(i);
        float f4 = this.K;
        float f5 = 1.0f - f4;
        if (s < 0.5f) {
            f = s + s;
        } else {
            float f6 = 1.0f - s;
            f = f6 + f6;
        }
        float d = d() * ((f * 1.1f) + 0.6f);
        if (s < f4) {
            float b2 = (s * this.J) / b();
            float sin = (-b()) * ((float) Math.sin(this.H - b2));
            b = (b() * ((float) Math.cos(this.H - b2))) - b();
            f2 = sin;
        } else if (s > f5) {
            float f7 = this.J;
            float b3 = (f7 - (s * f7)) / b();
            float b4 = (b() * ((float) Math.sin(this.H - b3))) + h();
            b = (b() * ((float) Math.cos(this.H - b3))) - b();
            f2 = b4;
        } else {
            f2 = (s * this.J) - this.I;
            f3 = 0.0f;
            return new RadialGradient(f2, f3, d, -1, 0, Shader.TileMode.CLAMP);
        }
        f3 = b;
        return new RadialGradient(f2, f3, d, -1, 0, Shader.TileMode.CLAMP);
    }

    private final SweepGradient v(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr) {
        float f7;
        float f8;
        float f9;
        int[] iArr;
        if (f5 >= 0.0f) {
            if (f6 <= 1.0f) {
                float f10 = f3 / 360.0f;
                float f11 = f4 / 360.0f;
                if (f3 < 0.0f) {
                    f11 -= f10;
                    f9 = f3 + 0.0f;
                    f7 = f4 + f3;
                    f8 = 0.0f;
                } else {
                    f7 = f4;
                    f8 = f10;
                    f9 = 0.0f;
                }
                if (f7 < 0.0f) {
                    f8 -= f11;
                    f9 += f7;
                    f11 = 0.0f;
                }
                if (Math.max(f11, f8) >= 1.0f) {
                    throw new IllegalStateException("More than 360 not supported");
                }
                if (f11 <= f8) {
                    int i = 1;
                    while (i < 9) {
                        int i2 = i + 1;
                        int i3 = 5 - (i2 / 2);
                        this.w[i] = p()[i3] > 0.0f ? this.e[i3] : 0;
                        i = i2;
                    }
                    iArr = this.w;
                    int i4 = 0;
                    for (int length = fArr.length; i4 < length; length = length) {
                        this.y[(fArr.length - 1) - i4] = ols.a(kmj.b(fArr[i4], f5, f6, f8, f11), 0.0f, 1.0f);
                        i4++;
                    }
                } else {
                    iArr = A();
                    int length2 = fArr.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        this.y[i5] = ols.a(kmj.b(fArr[i5], f5, f6, f8, f11), 0.0f, 1.0f);
                    }
                }
                SweepGradient sweepGradient = new SweepGradient(f, f2, iArr, this.y);
                if (f9 != 0.0f) {
                    Matrix matrix = new Matrix();
                    matrix.setRotate(f9, f, f2);
                    sweepGradient.setLocalMatrix(matrix);
                }
                return sweepGradient;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    private final olu w(Object obj, okq okqVar) {
        return new klt(obj, okqVar, this);
    }

    private final void x(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr) {
        paint.setShader(v(f, f2, f4, f5, f6, f7, fArr));
        canvas.drawArc(f - f3, f2 - f3, f + f3, f2 + f3, f4, f5 - f4, false, paint);
    }

    private final void y(Canvas canvas, Shader shader, float f, float f2, float f3) {
        this.c.setShader(shader);
        this.c.setAlpha(this.z);
        canvas.save();
        float t = (t() / f) * f3;
        canvas.scale(t, 1.0f);
        canvas.translate((f2 / t) - f2, 0.0f);
        B(canvas, h(), this.c);
        canvas.restore();
        this.c.setShader(null);
    }

    public final float[] z(float f) {
        float f2 = f * 0.5f;
        float min = Math.min(f2, ((1.0f - p()[0]) - p()[p().length - 1]) / 8.0f);
        int length = this.e.length;
        float f3 = 0.0f;
        int i = 0;
        while (i < 6) {
            float f4 = p()[i] + f3;
            float f5 = (f3 + f4) / 2.0f;
            if (i == 0) {
                this.x[0] = Math.max(f5, f4 - min);
            } else {
                int length2 = this.e.length;
                if (i == 5) {
                    this.x[9] = Math.min(f5, f3 + min);
                } else {
                    int i2 = i + i;
                    this.x[i2 - 1] = Math.min(f5, f3 + f2);
                    this.x[i2] = Math.max(f5, f4 - f2);
                }
            }
            i++;
            f3 = f4;
        }
        return this.x;
    }

    public final float a() {
        return ((Number) this.n.c(a[8])).floatValue();
    }

    public final float b() {
        return ((Number) this.m.c(a[7])).floatValue();
    }

    public final float c() {
        return ((Number) this.i.c(a[3])).floatValue();
    }

    public final float d() {
        return ((Number) this.h.c(a[2])).floatValue();
    }

    public final float e() {
        return ((Number) this.j.c(a[4])).floatValue();
    }

    public final float f() {
        return ((Number) this.g.c(a[1])).floatValue();
    }

    public final float g() {
        return ((Number) this.f.c(a[0])).floatValue();
    }

    public final float h() {
        return ((Number) this.l.c(a[6])).floatValue();
    }

    public final klp i() {
        return (klp) this.o.c(a[9]);
    }

    public final void j() {
        this.s.reset();
    }

    public final void k() {
        mho mhoVar = mho.a;
        if (Instant.now().minus(this.b).isAfter(this.M)) {
            Instant now = Instant.now();
            oll.d(now, "system().now()");
            this.M = now;
            postInvalidateOnAnimation();
        }
    }

    public final void l(boolean z) {
        this.p.b(a[10], Boolean.valueOf(z));
    }

    public final void m(float[] fArr) {
        oll.e(fArr, "<set-?>");
        this.r.b(a[11], fArr);
    }

    public final void n(float f) {
        this.m.b(a[7], Float.valueOf(f));
    }

    public final void o(float f) {
        this.h.b(a[2], Float.valueOf(f));
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x073c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r42) {
        /*
            Method dump skipped, instructions count: 1863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p6glow.AssistantP6GlowView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
        }
    }

    public final float[] p() {
        return (float[]) this.r.c(a[11]);
    }

    public /* synthetic */ AssistantP6GlowView(Context context, AttributeSet attributeSet, int i, int i2, int i3, oli oliVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
