package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* compiled from: PG */
/* renamed from: kxe  reason: default package */
/* loaded from: classes.dex */
public class kxe extends Drawable implements kxu {
    private static final String h = "kxe";
    private static final Paint i;
    public kxd a;
    public final kxs[] b;
    public final kxs[] c;
    public final BitSet d;
    public boolean e;
    public int f;
    public boolean g;
    private final Matrix j;
    private final Path k;
    private final Path l;
    private final RectF m;
    private final RectF n;
    private final Region o;
    private final Region p;
    private kxj q;
    private final Paint r;
    private final Paint s;
    private final kwx t;
    private final kxl u;
    private PorterDuffColorFilter v;
    private PorterDuffColorFilter w;
    private final RectF x;
    private final opu y;

    static {
        Paint paint = new Paint(1);
        i = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public kxe() {
        this(new kxj());
    }

    private final void A(Canvas canvas, Paint paint, Path path, kxj kxjVar, RectF rectF) {
        if (kxjVar.e(rectF)) {
            float a = kxjVar.c.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private final boolean B() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.s.getStrokeWidth() > 0.0f;
    }

    private final boolean C(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.r.getColor())))) {
            this.r.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.s.getColor())))) {
            return z;
        }
        this.s.setColor(colorForState);
        return true;
    }

    private final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter = this.v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        kxd kxdVar = this.a;
        this.v = w(kxdVar.g, kxdVar.h, this.r, true);
        kxd kxdVar2 = this.a;
        ColorStateList colorStateList = kxdVar2.f;
        this.w = w(null, kxdVar2.h, this.s, false);
        boolean z = this.a.u;
        return !xu.b(porterDuffColorFilter, this.v) || !xu.b(porterDuffColorFilter2, this.w);
    }

    private final float u() {
        if (B()) {
            return this.s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static int v(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private final RectF x() {
        this.n.set(h());
        float u = u();
        this.n.inset(u, u);
        return this.n;
    }

    private final void y(RectF rectF, Path path) {
        kxl kxlVar = this.u;
        kxd kxdVar = this.a;
        kxlVar.b(kxdVar.a, kxdVar.k, rectF, this.y, path);
        if (this.a.j != 1.0f) {
            this.j.reset();
            Matrix matrix = this.j;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.j);
        }
        path.computeBounds(this.x, true);
    }

    private final void z(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(h, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.k, this.t.e);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.b[i2].c(this.t, this.a.r, canvas);
            this.c[i2].c(this.t, this.a.r, canvas);
        }
        if (this.g) {
            int f = f();
            int g = g();
            canvas.translate(-f, -g);
            canvas.drawPath(this.k, i);
            canvas.translate(f, g);
        }
    }

    public final float a() {
        return this.a.o;
    }

    public final float b() {
        return this.a.a.b.a(h());
    }

    public final float c() {
        float a = a();
        float f = this.a.p;
        return a + 0.0f;
    }

    protected final int d(int i2) {
        float c = c();
        kxd kxdVar = this.a;
        float f = c + kxdVar.n;
        ktw ktwVar = kxdVar.b;
        return ktwVar != null ? ktwVar.b(i2, f) : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.r.setColorFilter(this.v);
        int alpha = this.r.getAlpha();
        this.r.setAlpha(v(alpha, this.a.m));
        this.s.setColorFilter(this.w);
        this.s.setStrokeWidth(this.a.l);
        int alpha2 = this.s.getAlpha();
        this.s.setAlpha(v(alpha2, this.a.m));
        if (this.e) {
            float f = -u();
            kxj i2 = i();
            kxi c = i2.c();
            c.a = kxc.b(i2.b, f);
            c.b = kxc.b(i2.c, f);
            c.d = kxc.b(i2.e, f);
            c.c = kxc.b(i2.d, f);
            kxj a = c.a();
            this.q = a;
            this.u.a(a, this.a.k, x(), this.l);
            y(h(), this.k);
            this.e = false;
        }
        kxd kxdVar = this.a;
        int i3 = kxdVar.q;
        if (kxdVar.r > 0 && !r() && !this.k.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate(f(), g());
            if (!this.g) {
                z(canvas);
                canvas.restore();
            } else {
                int width = (int) (this.x.width() - getBounds().width());
                int height = (int) (this.x.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                float width2 = this.x.width();
                int i4 = this.a.r;
                float height2 = this.x.height();
                int i5 = this.a.r;
                Bitmap createBitmap = Bitmap.createBitmap(((int) width2) + i4 + i4 + width, ((int) height2) + i5 + i5 + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (getBounds().left - this.a.r) - width;
                float f3 = (getBounds().top - this.a.r) - height;
                canvas2.translate(-f2, -f3);
                z(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
            }
        }
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            A(canvas, this.r, this.k, this.a.a, h());
        }
        if (B()) {
            A(canvas, this.s, this.l, this.q, x());
        }
        this.r.setAlpha(alpha);
        this.s.setAlpha(alpha2);
    }

    public final int f() {
        kxd kxdVar = this.a;
        int i2 = kxdVar.s;
        int i3 = kxdVar.t;
        double d = i2;
        double sin = Math.sin(Math.toRadians(0.0d));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public final int g() {
        kxd kxdVar = this.a;
        int i2 = kxdVar.s;
        int i3 = kxdVar.t;
        double d = i2;
        double cos = Math.cos(Math.toRadians(0.0d));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i2 = this.a.q;
        if (r()) {
            outline.setRoundRect(getBounds(), b() * this.a.k);
            return;
        }
        y(h(), this.k);
        if (!this.k.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.k);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.o.set(getBounds());
        y(h(), this.k);
        this.p.setPath(this.k, this.o);
        this.o.op(this.p, Region.Op.DIFFERENCE);
        return this.o;
    }

    public final RectF h() {
        this.m.set(getBounds());
        return this.m;
    }

    public final kxj i() {
        return this.a.a;
    }

    @Override // defpackage.kxu
    public final void ic(kxj kxjVar) {
        this.a.a = kxjVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.a.g;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
            kxd kxdVar = this.a;
            ColorStateList colorStateList2 = kxdVar.f;
            ColorStateList colorStateList3 = kxdVar.e;
            if (colorStateList3 != null && colorStateList3.isStateful()) {
                return true;
            }
            ColorStateList colorStateList4 = this.a.d;
            return colorStateList4 != null && colorStateList4.isStateful();
        }
        return true;
    }

    public final void j(Context context) {
        this.a.b = new ktw(context);
        q();
    }

    public final void k(float f) {
        kxd kxdVar = this.a;
        if (kxdVar.o != f) {
            kxdVar.o = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        kxd kxdVar = this.a;
        if (kxdVar.d != colorStateList) {
            kxdVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        kxd kxdVar = this.a;
        if (kxdVar.k != f) {
            kxdVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new kxd(this.a);
        return this;
    }

    public final void n(float f, ColorStateList colorStateList) {
        p(f);
        o(colorStateList);
    }

    public final void o(ColorStateList colorStateList) {
        kxd kxdVar = this.a;
        if (kxdVar.e != colorStateList) {
            kxdVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean C = C(iArr);
        boolean D = D();
        boolean z = true;
        if (!C && !D) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void q() {
        float c = c();
        this.a.r = (int) Math.ceil(0.75f * c);
        this.a.s = (int) Math.ceil(c * 0.25f);
        D();
        super.invalidateSelf();
    }

    public final boolean r() {
        return this.a.a.e(h());
    }

    public final void s() {
        this.t.a(-12303292);
        this.a.u = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        kxd kxdVar = this.a;
        if (kxdVar.m != i2) {
            kxdVar.m = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        kxd kxdVar = this.a;
        if (kxdVar.h != mode) {
            kxdVar.h = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t(float f) {
        p(f);
        o(ColorStateList.valueOf(0));
    }

    public kxe(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(kxj.a(context, attributeSet, i2, i3).a());
    }

    public kxe(kxd kxdVar) {
        kxl kxlVar;
        this.b = new kxs[4];
        this.c = new kxs[4];
        this.d = new BitSet(8);
        this.j = new Matrix();
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new Region();
        this.p = new Region();
        Paint paint = new Paint(1);
        this.r = paint;
        Paint paint2 = new Paint(1);
        this.s = paint2;
        this.t = new kwx();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kxlVar = kxk.a;
        } else {
            kxlVar = new kxl();
        }
        this.u = kxlVar;
        this.x = new RectF();
        this.g = true;
        this.a = kxdVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        C(getState());
        this.y = new opu(this);
    }

    private final PorterDuffColorFilter w(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = d(colorForState);
            }
            this.f = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z) {
            int color = paint.getColor();
            int d = d(color);
            this.f = d;
            if (d != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
            }
        }
        return porterDuffColorFilter;
    }

    public kxe(kxj kxjVar) {
        this(new kxd(kxjVar));
    }
}
