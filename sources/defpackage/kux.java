package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* renamed from: kux  reason: default package */
/* loaded from: classes.dex */
public final class kux {
    public final TextPaint A;
    public TimeInterpolator B;
    public TimeInterpolator C;
    public float D;
    public bdz F;
    public bdz G;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private Typeface P;
    private boolean Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private int W;
    private final TextPaint X;
    private float Y;
    private float Z;
    public final View a;
    private float aa;
    private ColorStateList ab;
    private float ac;
    private float ad;
    private float ae;
    private ColorStateList af;
    private float ag;
    private float ah;
    private StaticLayout ai;
    private float aj;
    private float ak;
    private float al;
    private CharSequence am;
    public float b;
    public boolean c;
    public float d;
    public int f;
    public ColorStateList l;
    public ColorStateList m;
    public int n;
    public Typeface o;
    public Typeface p;
    public Typeface q;
    public Typeface r;
    public Typeface s;
    public Typeface t;
    public CharSequence v;
    public CharSequence w;
    public int[] y;
    public boolean z;
    public int i = 16;
    public int j = 16;
    public float k = 15.0f;
    private float I = 15.0f;
    public TextUtils.TruncateAt u = TextUtils.TruncateAt.END;
    public boolean x = true;
    public int E = 1;
    public final Rect h = new Rect();
    public final Rect g = new Rect();
    private final RectF H = new RectF();
    public float e = a();

    public kux(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.X = textPaint;
        this.A = new TextPaint(textPaint);
        e(view.getContext().getResources().getConfiguration());
    }

    public static boolean j(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private static float k(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return krt.a(f, f2, f3);
    }

    private static int l(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.y;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
        if (r10.Q != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(float r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kux.n(float, boolean):void");
    }

    private final void o(float f) {
        n(f, false);
        aad.G(this.a);
    }

    private static boolean p(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private final boolean q() {
        if (this.E > 1) {
            return !this.Q || this.c;
        }
        return false;
    }

    private static final float r(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float a() {
        float f = this.d;
        return f + ((1.0f - f) * 0.5f);
    }

    public final int b() {
        return m(this.m);
    }

    public final void c() {
        float f;
        float f2 = this.b;
        if (this.c) {
            this.H.set(f2 < this.e ? this.g : this.h);
        } else {
            this.H.left = k(this.g.left, this.h.left, f2, this.B);
            this.H.top = k(this.J, this.K, f2, this.B);
            this.H.right = k(this.g.right, this.h.right, f2, this.B);
            this.H.bottom = k(this.g.bottom, this.h.bottom, f2, this.B);
        }
        if (!this.c) {
            this.N = k(this.L, this.M, f2, this.B);
            this.O = k(this.J, this.K, f2, this.B);
            o(f2);
            f = f2;
        } else if (f2 < this.e) {
            this.N = this.L;
            this.O = this.J;
            o(0.0f);
            f = 0.0f;
        } else {
            this.N = this.M;
            this.O = this.K - Math.max(0, this.f);
            o(1.0f);
            f = 1.0f;
        }
        this.ak = 1.0f - k(0.0f, 1.0f, 1.0f - f2, krt.b);
        aad.G(this.a);
        this.al = k(1.0f, 0.0f, f2, krt.b);
        aad.G(this.a);
        ColorStateList colorStateList = this.m;
        ColorStateList colorStateList2 = this.l;
        if (colorStateList != colorStateList2) {
            this.X.setColor(l(m(colorStateList2), b(), f));
        } else {
            this.X.setColor(b());
        }
        float f3 = this.ag;
        float f4 = this.D;
        if (f3 != f4) {
            this.X.setLetterSpacing(k(f4, f3, f2, krt.b));
        } else {
            this.X.setLetterSpacing(f3);
        }
        this.T = k(this.ac, this.Y, f2, null);
        this.U = k(this.ad, this.Z, f2, null);
        this.V = k(this.ae, this.aa, f2, null);
        int l = l(m(this.af), m(this.ab), f2);
        this.W = l;
        this.X.setShadowLayer(this.T, this.U, this.V, l);
        if (this.c) {
            int alpha = this.X.getAlpha();
            float f5 = this.e;
            this.X.setAlpha((int) ((f2 <= f5 ? krt.b(1.0f, 0.0f, this.d, f5, f2) : krt.b(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
        }
        aad.G(this.a);
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.w == null || this.H.width() <= 0.0f || this.H.height() <= 0.0f) {
            return;
        }
        this.X.setTextSize(this.S);
        float f = this.N;
        float f2 = this.O;
        float f3 = this.R;
        if (f3 != 1.0f && !this.c) {
            canvas.scale(f3, f3, f, f2);
        }
        if (!q() || (this.c && this.b <= this.e)) {
            canvas.translate(f, f2);
            this.ai.draw(canvas);
        } else {
            float f4 = this.N;
            int lineStart = this.ai.getLineStart(0);
            int alpha = this.X.getAlpha();
            canvas.translate(f4 - lineStart, f2);
            float f5 = alpha;
            this.X.setAlpha((int) (this.al * f5));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.X;
                textPaint.setShadowLayer(this.T, this.U, this.V, kxc.e(this.W, textPaint.getAlpha()));
            }
            this.ai.draw(canvas);
            this.X.setAlpha((int) (this.ak * f5));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint2 = this.X;
                textPaint2.setShadowLayer(this.T, this.U, this.V, kxc.e(this.W, textPaint2.getAlpha()));
            }
            int lineBaseline = this.ai.getLineBaseline(0);
            CharSequence charSequence = this.am;
            float f6 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, this.X);
            if (Build.VERSION.SDK_INT >= 31) {
                this.X.setShadowLayer(this.T, this.U, this.V, this.W);
            }
            if (!this.c) {
                String trim = this.am.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                String str = trim;
                this.X.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.ai.getLineEnd(0), str.length()), 0.0f, f6, (Paint) this.X);
            }
        }
        canvas.restoreToCount(save);
    }

    public final void e(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.q;
            if (typeface != null) {
                this.p = kxc.c(configuration, typeface);
            }
            Typeface typeface2 = this.t;
            if (typeface2 != null) {
                this.s = kxc.c(configuration, typeface2);
            }
            Typeface typeface3 = this.p;
            if (typeface3 == null) {
                typeface3 = this.q;
            }
            this.o = typeface3;
            Typeface typeface4 = this.s;
            if (typeface4 == null) {
                typeface4 = this.t;
            }
            this.r = typeface4;
            g(true);
        }
    }

    public final void f() {
        g(false);
    }

    public final void g(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            if (!z) {
                return;
            }
            z = true;
        }
        n(1.0f, z);
        CharSequence charSequence = this.w;
        if (charSequence != null && (staticLayout2 = this.ai) != null) {
            this.am = TextUtils.ellipsize(charSequence, this.X, staticLayout2.getWidth(), this.u);
        }
        CharSequence charSequence2 = this.am;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.aj = r(this.X, charSequence2);
        } else {
            this.aj = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.j, this.Q ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.K = this.h.top;
        } else if (i == 80) {
            this.K = this.h.bottom + this.X.ascent();
        } else {
            this.K = this.h.centerY() - ((this.X.descent() - this.X.ascent()) / 2.0f);
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.M = this.h.centerX() - (this.aj / 2.0f);
        } else if (i2 == 5) {
            this.M = this.h.right - this.aj;
        } else {
            this.M = this.h.left;
        }
        n(0.0f, z);
        float height = this.ai != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.ai;
        if (staticLayout3 != null && this.E > 1) {
            f = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.w;
            if (charSequence3 != null) {
                f = r(this.X, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.ai;
        this.n = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.i, this.Q ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 == 48) {
            this.J = this.g.top;
        } else if (i3 == 80) {
            this.J = (this.g.bottom - height) + this.X.descent();
        } else {
            this.J = this.g.centerY() - (height / 2.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.L = this.g.centerX() - (f / 2.0f);
        } else if (i4 == 5) {
            this.L = this.g.right - f;
        } else {
            this.L = this.g.left;
        }
        o(this.b);
        c();
    }

    public final void h(int i) {
        kwv kwvVar = new kwv(this.a.getContext(), i);
        ColorStateList colorStateList = kwvVar.i;
        if (colorStateList != null) {
            this.m = colorStateList;
        }
        float f = kwvVar.j;
        if (f != 0.0f) {
            this.I = f;
        }
        ColorStateList colorStateList2 = kwvVar.a;
        if (colorStateList2 != null) {
            this.ab = colorStateList2;
        }
        this.Z = kwvVar.e;
        this.aa = kwvVar.f;
        this.Y = kwvVar.g;
        this.ag = kwvVar.h;
        bdz bdzVar = this.G;
        if (bdzVar != null) {
            bdzVar.h();
        }
        this.G = new bdz(new kuw(this, 1), kwvVar.a());
        kwvVar.d(this.a.getContext(), this.G);
        f();
    }

    public final void i(int i) {
        kwv kwvVar = new kwv(this.a.getContext(), i);
        ColorStateList colorStateList = kwvVar.i;
        if (colorStateList != null) {
            this.l = colorStateList;
        }
        float f = kwvVar.j;
        if (f != 0.0f) {
            this.k = f;
        }
        ColorStateList colorStateList2 = kwvVar.a;
        if (colorStateList2 != null) {
            this.af = colorStateList2;
        }
        this.ad = kwvVar.e;
        this.ae = kwvVar.f;
        this.ac = kwvVar.g;
        this.D = kwvVar.h;
        bdz bdzVar = this.F;
        if (bdzVar != null) {
            bdzVar.h();
        }
        this.F = new bdz(new kuw(this, 0), kwvVar.a());
        kwvVar.d(this.a.getContext(), this.F);
        f();
    }
}
