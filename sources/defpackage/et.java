package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: et  reason: default package */
/* loaded from: classes.dex */
public class et extends Drawable implements Drawable.Callback {
    public es a;
    public Drawable b;
    private Rect d;
    private Drawable e;
    private boolean g;
    private boolean h;
    private Runnable i;
    private long j;
    private long k;
    private er l;
    private int f = 255;
    public int c = -1;

    private final void a(Drawable drawable) {
        if (this.l == null) {
            this.l = new er();
        }
        er erVar = this.l;
        erVar.a = drawable.getCallback();
        drawable.setCallback(erVar);
        try {
            if (this.a.B <= 0 && this.g) {
                drawable.setAlpha(this.f);
            }
            es esVar = this.a;
            if (!esVar.F) {
                if (esVar.I) {
                    wf.g(drawable, esVar.G);
                }
                es esVar2 = this.a;
                if (esVar2.J) {
                    wf.h(drawable, esVar2.H);
                }
            } else {
                drawable.setColorFilter(esVar.E);
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            wg.b(drawable, wg.a(this));
            we.d(drawable, this.a.D);
            Rect rect = this.d;
            if (rect != null) {
                wf.e(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.l.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        es esVar = this.a;
        if (theme != null) {
            esVar.i();
            int i = esVar.j;
            Drawable[] drawableArr = esVar.i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && wf.i(drawable)) {
                    wf.b(drawableArr[i2], theme);
                    esVar.g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            esVar.l(theme.getResources());
        }
    }

    public es c() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(es esVar) {
        this.a = esVar;
        int i = this.c;
        if (i >= 0) {
            Drawable g = esVar.g(i);
            this.b = g;
            if (g != null) {
                a(g);
            }
        }
        this.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.b
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f
            r3.setAlpha(r9)
            r13.j = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            es r9 = r13.a
            int r9 = r9.B
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.j = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.e
            if (r9 == 0) goto L65
            long r10 = r13.k
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.e = r0
            r13.k = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            es r4 = r13.a
            int r4 = r4.C
            int r3 = r3 / r4
            int r4 = r13.f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.k = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.g(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.d;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        es esVar = this.a;
        if (esVar.n) {
            if (!esVar.o) {
                esVar.h();
            }
            return esVar.q;
        }
        Drawable drawable = this.b;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        es esVar = this.a;
        if (esVar.n) {
            if (!esVar.o) {
                esVar.h();
            }
            return esVar.p;
        }
        Drawable drawable = this.b;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        es esVar = this.a;
        if (esVar.n) {
            if (!esVar.o) {
                esVar.h();
            }
            return esVar.s;
        }
        Drawable drawable = this.b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        es esVar = this.a;
        if (esVar.n) {
            if (!esVar.o) {
                esVar.h();
            }
            return esVar.r;
        }
        Drawable drawable = this.b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        es esVar = this.a;
        if (esVar.t) {
            return esVar.u;
        }
        esVar.i();
        int i2 = esVar.j;
        Drawable[] drawableArr = esVar.i;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        esVar.u = i;
        esVar.t = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            es r0 = r9.a
            int r0 = r0.C
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L29
            r9.e = r0
            es r0 = r9.a
            int r0 = r0.C
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.k = r0
            goto L35
        L29:
            r9.e = r4
            r9.k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.b
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            es r0 = r9.a
            int r1 = r0.j
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.b = r0
            r9.c = r10
            if (r0 == 0) goto L5a
            es r10 = r9.a
            int r10 = r10.B
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L51:
            r9.a(r0)
            goto L5a
        L55:
            r9.b = r4
            r10 = -1
            r9.c = r10
        L5a:
            long r0 = r9.j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7a
        L67:
            java.lang.Runnable r0 = r9.i
            if (r0 != 0) goto L74
            az r0 = new az
            r1 = 7
            r0.<init>(r9, r1)
            r9.i = r0
            goto L77
        L74:
            r9.unscheduleSelf(r0)
        L77:
            r9.g(r10)
        L7a:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.h(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        es esVar = this.a;
        if (esVar != null) {
            esVar.k();
        }
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.D;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        es esVar = this.a;
        if (esVar.v) {
            return esVar.w;
        }
        esVar.i();
        int i = esVar.j;
        Drawable[] drawableArr = esVar.i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        esVar.w = z;
        esVar.v = true;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.g) {
                this.b.setAlpha(this.f);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
        } else {
            z2 = z;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else if (!z2) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            es c = c();
            c.d();
            e(c);
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        es esVar = this.a;
        int i2 = this.c;
        int i3 = esVar.j;
        Drawable[] drawableArr = esVar.i;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean b = wg.b(drawable, i);
                if (i4 == i2) {
                    z = b;
                }
            }
        }
        esVar.A = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            return false;
        }
        return drawable2.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (!this.g || this.f != i) {
            this.g = true;
            this.f = i;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            if (this.j == 0) {
                drawable.setAlpha(i);
            } else {
                g(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        es esVar = this.a;
        if (esVar.D != z) {
            esVar.D = z;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            we.d(drawable, z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        es esVar = this.a;
        esVar.F = true;
        if (esVar.E != colorFilter) {
            esVar.E = colorFilter;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        es esVar = this.a;
        if (esVar.z != z) {
            esVar.z = z;
            Drawable drawable = this.b;
            if (drawable == null) {
                return;
            }
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.b;
        if (drawable != null) {
            wf.d(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.d;
        if (rect == null) {
            this.d = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            wf.e(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        es esVar = this.a;
        esVar.I = true;
        if (esVar.G != colorStateList) {
            esVar.G = colorStateList;
            wf.g(this.b, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        es esVar = this.a;
        esVar.J = true;
        if (esVar.H != mode) {
            esVar.H = mode;
            wf.h(this.b, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.b || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        es esVar = this.a;
        if (!esVar.x) {
            esVar.i();
            esVar.x = true;
            int i = esVar.j;
            Drawable[] drawableArr = esVar.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    esVar.y = false;
                    return null;
                }
            }
            esVar.y = true;
        } else if (!esVar.y) {
            return null;
        }
        this.a.f = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        es esVar = this.a;
        Rect rect2 = null;
        boolean z = false;
        if (!esVar.k) {
            Rect rect3 = esVar.m;
            if (rect3 != null || esVar.l) {
                rect2 = rect3;
            } else {
                esVar.i();
                Rect rect4 = new Rect();
                int i = esVar.j;
                Drawable[] drawableArr = esVar.i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        if (rect4.left > rect2.left) {
                            rect2.left = rect4.left;
                        }
                        if (rect4.top > rect2.top) {
                            rect2.top = rect4.top;
                        }
                        if (rect4.right > rect2.right) {
                            rect2.right = rect4.right;
                        }
                        if (rect4.bottom > rect2.bottom) {
                            rect2.bottom = rect4.bottom;
                        }
                    }
                }
                esVar.l = true;
                esVar.m = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.b;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (isAutoMirrored() && wg.a(this) == 1) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return z;
    }
}
