package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ada  reason: default package */
/* loaded from: classes.dex */
public final class ada {
    private static final Interpolator e = new om(3);
    public int a;
    public int b;
    public View d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private float p;
    private int q;
    private final OverScroller r;
    private final acz s;
    private boolean t;
    private final ViewGroup u;
    public int c = -1;
    private final Runnable v = new od(this, 9);

    public static ada b(ViewGroup viewGroup, acz aczVar) {
        return new ada(viewGroup.getContext(), viewGroup, aczVar);
    }

    private final int m(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.u.getWidth() / 2;
        float sin = width2 + (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private final void n(int i) {
        float[] fArr = this.f;
        if (fArr == null || !h(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m = ((1 << i) ^ (-1)) & this.m;
    }

    private final void o(float f, float f2) {
        this.t = true;
        this.s.d(this.d, f, f2);
        this.t = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void p() {
        this.n.computeCurrentVelocity(1000, this.o);
        o(v(this.n.getXVelocity(this.c), this.p, this.o), v(this.n.getYVelocity(this.c), this.p, this.o));
    }

    private final void q(float f, float f2, int i) {
        x(f, f2, i);
        x(f2, f, i);
        x(f, f2, i);
        x(f2, f, i);
    }

    private final void r(float f, float f2, int i) {
        float[] fArr = this.f;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f = fArr2;
            this.g = fArr3;
            this.h = fArr4;
            this.i = fArr5;
            this.j = iArr;
            this.k = iArr2;
            this.l = iArr3;
        }
        float[] fArr9 = this.f;
        this.h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.g;
        this.i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.j;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.u.getLeft() + this.q) {
            i2 = 1;
        }
        if (i5 < this.u.getTop() + this.q) {
            i2 |= 4;
        }
        if (i4 > this.u.getRight() - this.q) {
            i2 |= 2;
        }
        if (i5 > this.u.getBottom() - this.q) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.m |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (u(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int a = this.s.a(view);
        int h = this.s.h();
        if (a <= 0 || h <= 0) {
            return a > 0 ? Math.abs(f) > ((float) this.b) : h > 0 && Math.abs(f2) > ((float) this.b);
        }
        int i = this.b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean u(int i) {
        return h(i);
    }

    private static final float v(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int w(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private final void x(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.j[i];
    }

    public final View a(int i, int i2) {
        int childCount = this.u.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = this.u.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                return null;
            }
        }
    }

    public final void c() {
        this.c = -1;
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    public final void d(View view, int i) {
        if (view.getParent() == this.u) {
            this.d = view;
            this.c = i;
            this.s.b(view, i);
            f(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        if (r9.c == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        p();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.e(android.view.MotionEvent):void");
    }

    public final void f(int i) {
        this.u.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.s.c(i);
            if (this.a != 0) {
                return;
            }
            this.d = null;
        }
    }

    public final boolean g(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 == 0) {
            this.r.abortAnimation();
            f(0);
            return false;
        } else {
            i5 = 0;
        }
        View view = this.d;
        int w = w(i3, (int) this.p, (int) this.o);
        int w2 = w(i4, (int) this.p, (int) this.o);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(w);
        int abs4 = Math.abs(w2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (w != 0) {
            f = abs3;
            f2 = i8;
        } else {
            f = abs;
            f2 = i9;
        }
        float f5 = f / f2;
        if (w2 != 0) {
            f3 = abs4;
            f4 = i8;
        } else {
            f3 = abs2;
            f4 = i9;
        }
        this.r.startScroll(left, top, i5, i7, (int) ((m(i5, w, this.s.a(view)) * f5) + (m(i7, w2, this.s.h()) * (f3 / f4))));
        f(2);
        return true;
    }

    public final boolean h(int i) {
        return ((1 << i) & this.m) != 0;
    }

    public final boolean i(int i, int i2) {
        if (!this.t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return g(i, i2, (int) this.n.getXVelocity(this.c), (int) this.n.getYVelocity(this.c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        if (r12 != r11) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ada.j(android.view.MotionEvent):boolean");
    }

    final boolean k(View view, int i) {
        if (view == this.d && this.c == i) {
            return true;
        }
        if (view == null || !this.s.e(view, i)) {
            return false;
        }
        this.c = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.d.getLeft();
            int top = currY - this.d.getTop();
            if (left != 0) {
                aad.E(this.d, left);
            }
            if (top != 0) {
                aad.F(this.d, top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.d, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                    this.r.abortAnimation();
                }
            }
            this.u.post(this.v);
        }
        return this.a == 2;
    }

    private ada(Context context, ViewGroup viewGroup, acz aczVar) {
        if (aczVar != null) {
            this.u = viewGroup;
            this.s = aczVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.q = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.o = viewConfiguration.getScaledMaximumFlingVelocity();
            this.p = viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, e);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }
}
