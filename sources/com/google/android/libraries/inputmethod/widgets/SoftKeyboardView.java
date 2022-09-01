package com.google.android.libraries.inputmethod.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SoftKeyboardView extends FrameLayout implements jdr {
    private static final int a = Color.argb(153, 10, 10, 10);
    public static final ltg d = ltg.j("com/google/android/libraries/inputmethod/widgets/SoftKeyboardView");
    private int A;
    private int B;
    private int C;
    private boolean D;
    private final float[] E;
    private boolean F;
    private long G;
    private View b;
    private int c;
    public jdc e;
    @ViewDebug.ExportedProperty
    public int f;
    public int g;
    public int h;
    public final SparseArray i;
    public final SparseArray j;
    public final List k;
    public final jds l;
    public boolean m;
    public boolean n;
    public boolean[] o;
    public boolean[] p;
    public MotionEvent q;
    public MotionEvent r;
    @ViewDebug.ExportedProperty
    public float s;
    @ViewDebug.ExportedProperty
    public float t;
    public jdt u;
    private boolean v;
    private jde w;
    private boolean x;
    private boolean y;
    private int z;

    public SoftKeyboardView(Context context) {
        super(context);
        this.f = -2;
        this.g = -2;
        this.i = new SparseArray();
        this.j = new SparseArray();
        this.k = new ArrayList();
        this.l = new jds();
        this.m = true;
        this.n = false;
        this.s = 1.0f;
        this.t = 1.0f;
        this.E = new float[2];
        this.x = true;
        m();
    }

    private static float b(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private final void m() {
        aad.U(this, 2);
    }

    private final void n(View view) {
        Stack stack = new Stack();
        stack.push(view);
        while (!stack.empty()) {
            View view2 = (View) stack.pop();
            int id = view2.getId();
            if (view2 instanceof jdd) {
                this.k.add((jdd) view2);
            }
            if (view2 instanceof SoftKeyView) {
                SoftKeyView softKeyView = (SoftKeyView) view2;
                softKeyView.j(this);
                softKeyView.i(this.l);
                if (id != -1) {
                    this.j.put(id, softKeyView);
                }
            } else if (view2 instanceof jdb) {
                jdb jdbVar = (jdb) view2;
                jdbVar.A(this);
                jdbVar.t(this.l);
                if (id != -1) {
                    this.i.put(id, jdbVar);
                }
            } else if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    stack.push(viewGroup.getChildAt(i));
                }
            }
        }
    }

    private final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int x = (int) motionEvent.getX(actionIndex);
        int y = (int) motionEvent.getY(actionIndex);
        boolean z = false;
        this.v = false;
        this.b = null;
        jdc jdcVar = this.e;
        if (jdcVar == null || !jdcVar.g(motionEvent)) {
            super.dispatchTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0 && (this.b != null || (x > this.z + getPaddingLeft() && x < (getWidth() - this.A) - getPaddingRight() && y > this.B + getPaddingTop() && y < (getHeight() - this.C) - getPaddingBottom()))) {
                z = true;
            }
            this.v = z;
            jdc jdcVar2 = this.e;
            if (jdcVar2 == null) {
                return;
            }
            jdcVar2.b(motionEvent);
        } else if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
        } else {
            motionEvent.setAction(3);
            super.dispatchTouchEvent(motionEvent);
        }
    }

    public int a() {
        return (int) (this.f * this.s);
    }

    public final View c(MotionEvent motionEvent, int i) {
        if (!this.x || (this.v && this.c == motionEvent.getPointerId(i))) {
            return this.b;
        }
        this.c = motionEvent.getPointerId(i);
        this.b = null;
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        boolean z = x < ((float) getPaddingLeft()) || x > ((float) (getWidth() - getPaddingRight())) || y < 0.0f || y > ((float) getHeight());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(0);
        obtain.setLocation(b(x, this.z + getPaddingLeft() + 1, ((getWidth() - getPaddingRight()) - this.A) - 1), b(y, this.B + getPaddingTop() + 1, ((getHeight() - getPaddingBottom()) - this.C) - 1));
        super.dispatchTouchEvent(obtain);
        obtain.recycle();
        View view = this.b;
        boolean z2 = (view instanceof SoftKeyView) && ((SoftKeyView) view).f;
        if (!z || z2) {
            this.v = true;
        } else {
            this.b = null;
            this.v = false;
        }
        return this.b;
    }

    public final View d(int i) {
        View findViewById = findViewById(i);
        if (findViewById instanceof ViewStub) {
            View inflate = ((ViewStub) findViewById).inflate();
            this.w = null;
            n(inflate);
            jdt jdtVar = this.u;
            if (jdtVar != null) {
                htu htuVar = (htu) jdtVar;
                htuVar.e.a(htuVar.d, 0L);
            }
        }
        return findViewById(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.m) {
            i(motionEvent);
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.y) {
            return false;
        }
        if (!this.l.o() || this.l.q()) {
            MotionEvent motionEvent2 = this.q;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.q = MotionEvent.obtain(motionEvent);
            o(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final jda e(int i) {
        jdb jdbVar = (jdb) this.i.valueAt(i);
        if (jdbVar instanceof jda) {
            return (jda) jdbVar;
        }
        return null;
    }

    public final jde f() {
        if (this.w == null) {
            this.w = new jde(this, this.j);
        }
        return this.w;
    }

    public final void g() {
        if (this.f <= 0) {
            return;
        }
        int a2 = a();
        int i = this.g;
        if (i > 0) {
            a2 = Math.min(a2, i);
        }
        if (a2 <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        if (layoutParams.height == a2) {
            return;
        }
        layoutParams.height = a2;
        setLayoutParams(layoutParams);
    }

    public final void h() {
        MotionEvent motionEvent = this.q;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.q = null;
        }
    }

    public final void i(MotionEvent motionEvent) {
        if (!this.l.o() || motionEvent.getDeviceId() == 0) {
            return;
        }
        this.v = false;
        this.b = null;
        if (!this.x) {
            super.dispatchHoverEvent(motionEvent);
        }
        MotionEvent motionEvent2 = this.r;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.r = MotionEvent.obtain(motionEvent);
        jdc jdcVar = this.e;
        if (jdcVar == null) {
            return;
        }
        jdcVar.b(motionEvent);
    }

    public final void j(jdc jdcVar) {
        this.e = jdcVar;
        this.l.a = jdcVar;
    }

    public final void k(int i, ict ictVar) {
        int indexOfKey = this.j.indexOfKey(i);
        if (indexOfKey >= 0) {
            ((SoftKeyView) this.j.valueAt(indexOfKey)).n(ictVar);
            boolean[] zArr = this.o;
            if (zArr == null) {
                return;
            }
            zArr[indexOfKey] = true;
            return;
        }
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            jda e = e(i2);
            if (e != null && e.i(i, ictVar)) {
                return;
            }
        }
    }

    public final void l(float f, float f2, int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i == 0) {
            this.G = uptimeMillis;
        }
        MotionEvent obtain = MotionEvent.obtain(this.G, uptimeMillis, i, f, f2, 0);
        obtain.setSource(2);
        o(obtain);
        obtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jdc jdcVar = this.e;
        if (jdcVar != null) {
            jdcVar.c();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.E[0] = view.getWidth() / 2.0f;
        this.E[1] = (view.getHeight() * 4.0f) / 5.0f;
        jdy.d(this.E, view, this);
        if (!this.F) {
            float[] fArr = this.E;
            l(fArr[0], fArr[1], 0);
        } else {
            this.F = false;
        }
        float[] fArr2 = this.E;
        l(fArr2[0], fArr2[1], 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jdc jdcVar = this.e;
        if (jdcVar != null) {
            jdcVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        n(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            this.f = layoutParams.height;
        }
        this.h = getVisibility();
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.b != null || this.x) {
            return false;
        }
        this.b = view;
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        jde jdeVar;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (getWidth() > 0 || getHeight() > 0)) {
            this.y = true;
        }
        if (this.D && (jdeVar = this.w) != null) {
            jdeVar.a(this);
        }
        jdc jdcVar = this.e;
        if (jdcVar != null) {
            jdcVar.e(this.D, i, i2, i3, i4);
        }
        this.D = false;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        this.D = true;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.E[0] = view.getWidth() / 2.0f;
        this.E[1] = view.getHeight() / 2.0f;
        jdy.d(this.E, view, this);
        float[] fArr = this.E;
        l(fArr[0], fArr[1], 0);
        this.F = !this.l.m();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b == null) {
            this.b = view;
            this.v = true;
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public SoftKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Throwable th;
        TypedArray typedArray;
        this.f = -2;
        this.g = -2;
        this.i = new SparseArray();
        this.j = new SparseArray();
        this.k = new ArrayList();
        this.l = new jds();
        this.m = true;
        this.n = false;
        this.s = 1.0f;
        this.t = 1.0f;
        this.E = new float[2];
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, jdl.f, 0, 0);
            try {
                typedArray.getColor(5, a);
                typedArray.getDimensionPixelSize(6, 0);
                typedArray.getDimensionPixelSize(7, 0);
                this.z = typedArray.getDimensionPixelSize(2, 0);
                this.A = typedArray.getDimensionPixelSize(3, 0);
                this.B = typedArray.getDimensionPixelSize(4, 0);
                this.C = typedArray.getDimensionPixelSize(1, 0);
                this.x = typedArray.getBoolean(0, true);
                if (typedArray != null) {
                    typedArray.recycle();
                }
                m();
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }
}
