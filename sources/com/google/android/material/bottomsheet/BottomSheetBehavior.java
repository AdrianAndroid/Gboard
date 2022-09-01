package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomSheetBehavior extends tp {
    public WeakReference A;
    public WeakReference B;
    public final ArrayList C;
    public int D;
    public boolean E;
    private int F;
    private float G;
    private boolean H;
    private int I;
    private int J;
    private ColorStateList K;
    private int L;
    private boolean M;
    private boolean N;
    private kxj O;
    private boolean P;
    private final ksx Q;
    private ValueAnimator R;
    private boolean S;
    private int T;
    private boolean U;
    private float V;
    private int W;
    private VelocityTracker X;
    private int Y;
    private Map Z;
    public boolean a;
    private int aa;
    private final acz ab;
    public int b;
    public kxe c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    int n;
    public int o;
    public int p;
    float q;
    public int r;
    float s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public ada x;
    int y;
    public int z;

    public BottomSheetBehavior() {
        this.F = 0;
        this.a = true;
        this.d = -1;
        this.L = -1;
        this.Q = new ksx(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.w = 4;
        this.V = 0.1f;
        this.C = new ArrayList();
        this.aa = -1;
        this.ab = new kss(this);
    }

    private final int G() {
        int i;
        if (this.H) {
            return Math.min(Math.max(this.I, this.z - ((this.y * 9) / 16)), this.W) + this.l;
        }
        return (this.M || this.f || (i = this.e) <= 0) ? this.b + this.l : Math.max(this.b, i + this.J);
    }

    private final int H(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.p : this.z : this.r : t();
    }

    private final abs I(int i) {
        return new kst(this, i);
    }

    private final void J() {
        int G = G();
        if (this.a) {
            this.r = Math.max(this.z - G, this.o);
        } else {
            this.r = this.z - G;
        }
    }

    private final void K() {
        this.p = (int) (this.z * (1.0f - this.q));
    }

    private final void L(View view, abi abiVar, int i) {
        aad.am(view, abiVar, I(i));
    }

    private final void M() {
        this.D = -1;
        VelocityTracker velocityTracker = this.X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.X = null;
        }
    }

    private final void N() {
        View view;
        int i;
        WeakReference weakReference = this.A;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        aad.J(view, 524288);
        aad.J(view, 262144);
        aad.J(view, 1048576);
        int i2 = this.aa;
        if (i2 != -1) {
            aad.J(view, i2);
        }
        int i3 = 6;
        if (!this.a && this.w != 6) {
            String string = view.getResources().getString(R.string.f148430_resource_name_obfuscated_res_0x7f14009e);
            abs I = I(6);
            List A = aad.A(view);
            int i4 = 0;
            while (true) {
                if (i4 >= A.size()) {
                    int i5 = -1;
                    int i6 = 0;
                    while (true) {
                        int[] iArr = aad.a;
                        int length = iArr.length;
                        if (i6 >= 32 || i5 != -1) {
                            break;
                        }
                        i5 = iArr[i6];
                        boolean z = true;
                        for (int i7 = 0; i7 < A.size(); i7++) {
                            z &= ((abi) A.get(i7)).a() != i5;
                        }
                        if (true != z) {
                            i5 = -1;
                        }
                        i6++;
                    }
                    i = i5;
                } else if (TextUtils.equals(string, ((abi) A.get(i4)).b())) {
                    i = ((abi) A.get(i4)).a();
                    break;
                } else {
                    i4++;
                }
            }
            if (i != -1) {
                aad.B(view, new abi(null, i, string, I, null));
            }
            this.aa = i;
        }
        if (this.t && this.w != 5) {
            L(view, abi.f, 5);
        }
        int i8 = this.w;
        if (i8 == 3) {
            if (true == this.a) {
                i3 = 4;
            }
            L(view, abi.e, i3);
        } else if (i8 == 4) {
            if (true == this.a) {
                i3 = 3;
            }
            L(view, abi.d, i3);
        } else if (i8 == 6) {
            L(view, abi.e, 4);
            L(view, abi.d, 3);
        }
    }

    private final void O(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.P == z) {
            return;
        }
        this.P = z;
        if (this.c == null || (valueAnimator = this.R) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.R.reverse();
            return;
        }
        float f = i == 3 ? 0.0f : 1.0f;
        this.R.setFloatValues(1.0f - f, f);
        this.R.start();
    }

    private final void P(boolean z) {
        WeakReference weakReference = this.A;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.Z != null) {
                return;
            }
            this.Z = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.A.get() && z) {
                this.Z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (z) {
            return;
        }
        this.Z = null;
    }

    private final boolean Q() {
        if (this.x != null) {
            return this.v || this.w == 1;
        }
        return false;
    }

    private static final int R(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof tr)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        tp tpVar = ((tr) layoutParams).a;
        if (!(tpVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) tpVar;
    }

    public final void B(int i) {
        if (this.t || i != 5) {
            int i2 = (i != 6 || !this.a || H(6) > this.o) ? i : 3;
            WeakReference weakReference = this.A;
            if (weakReference == null || weakReference.get() == null) {
                C(i);
                return;
            }
            View view = (View) this.A.get();
            ov ovVar = new ov(this, view, i2, 15);
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !aad.ag(view)) {
                ovVar.run();
                return;
            } else {
                view.post(ovVar);
                return;
            }
        }
        Log.w("BottomSheetBehavior", "Cannot set state: 5");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
        if (r7 == 4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(int r7) {
        /*
            r6 = this;
            int r0 = r6.w
            if (r0 != r7) goto L5
            return
        L5:
            r6.w = r7
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r7 == r3) goto L18
            if (r7 == r1) goto L18
            if (r7 == r0) goto L18
            boolean r4 = r6.t
            if (r4 == 0) goto L18
            if (r7 != r2) goto L18
            r7 = 5
        L18:
            java.lang.ref.WeakReference r4 = r6.A
            if (r4 != 0) goto L1d
            return
        L1d:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L26
            return
        L26:
            r5 = 0
            if (r7 != r1) goto L2e
            r0 = 1
            r6.P(r0)
            goto L3a
        L2e:
            if (r7 == r0) goto L35
            if (r7 == r2) goto L35
            if (r7 != r3) goto L3a
            goto L36
        L35:
            r3 = r7
        L36:
            r6.P(r5)
            r7 = r3
        L3a:
            r6.O(r7)
        L3d:
            java.util.ArrayList r0 = r6.C
            int r0 = r0.size()
            if (r5 >= r0) goto L53
            java.util.ArrayList r0 = r6.C
            java.lang.Object r0 = r0.get(r5)
            ksu r0 = (defpackage.ksu) r0
            r0.b(r4, r7)
            int r5 = r5 + 1
            goto L3d
        L53:
            r6.N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.i(r3.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.H(r4)
            ada r1 = r2.x
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.i(r3, r0)
            if (r3 == 0) goto L3e
            goto L31
        L15:
            int r5 = r3.getLeft()
            r1.d = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.g(r5, r0, r3, r3)
            if (r3 != 0) goto L31
            int r3 = r1.a
            if (r3 != 0) goto L3e
            android.view.View r3 = r1.d
            if (r3 == 0) goto L3e
            r3 = 0
            r1.d = r3
            goto L3e
        L31:
            r3 = 2
            r2.C(r3)
            r2.O(r4)
            ksx r3 = r2.Q
            r3.a(r4)
            return
        L3e:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(android.view.View, int, boolean):void");
    }

    public final boolean E(View view, float f) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.V)) - ((float) this.r)) / ((float) G()) > 0.5f;
    }

    public final void F() {
        View view;
        if (this.A != null) {
            J();
            if (this.w != 4 || (view = (View) this.A.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.tp
    public final void a(tr trVar) {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.tp
    public final void b() {
        this.A = null;
        this.x = null;
    }

    @Override // defpackage.tp
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.B;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < t()) {
                int t = top - t();
                iArr[1] = t;
                aad.F(view, -t);
                C(3);
            } else if (!this.v) {
                return;
            } else {
                iArr[1] = i2;
                aad.F(view, -i2);
                C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.r;
            if (i4 <= i5 || this.t) {
                if (!this.v) {
                    return;
                }
                iArr[1] = i2;
                aad.F(view, -i2);
                C(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                aad.F(view, -i6);
                C(4);
            }
        }
        x(view.getTop());
        this.T = i2;
        this.U = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r4.getTop() <= r2.p) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (java.lang.Math.abs(r3 - r2.o) < java.lang.Math.abs(r3 - r2.r)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.r)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.r)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
        if (java.lang.Math.abs(r3 - r2.p) < java.lang.Math.abs(r3 - r2.r)) goto L18;
     */
    @Override // defpackage.tp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.t()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.C(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.B
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.U
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.T
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.p
            if (r3 <= r6) goto Lb0
        L32:
            r0 = 6
            goto Lb0
        L35:
            boolean r3 = r2.t
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.G
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.D
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.E(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.T
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.o
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.p
            if (r3 >= r1) goto L84
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = 4
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.p
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.r
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.D(r4, r0, r3)
            r2.U = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.tp
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ada adaVar;
        if (!view.isShown() || !this.v) {
            this.S = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            M();
            actionMasked = 0;
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Y = (int) motionEvent.getY();
            if (this.w != 2) {
                WeakReference weakReference = this.B;
                View view3 = weakReference != null ? (View) weakReference.get() : null;
                if (view3 != null && coordinatorLayout.m(view3, x, this.Y)) {
                    this.D = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.E = true;
                }
            }
            this.S = this.D == -1 && !coordinatorLayout.m(view, x, this.Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.E = false;
            this.D = -1;
            if (this.S) {
                this.S = false;
                return false;
            }
        }
        if (!this.S && (adaVar = this.x) != null && adaVar.j(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.B;
        if (weakReference2 != null) {
            view2 = (View) weakReference2.get();
        }
        return actionMasked == 2 && view2 != null && !this.S && this.w != 1 && !coordinatorLayout.m(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.x != null && Math.abs(((float) this.Y) - motionEvent.getY()) > ((float) this.x.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    @Override // defpackage.tp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.tp
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.T = 0;
        this.U = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.tp
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        if (Q()) {
            this.x.e(motionEvent);
        }
        if (actionMasked == 0) {
            M();
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (Q() && actionMasked == 2 && !this.S) {
            float abs = Math.abs(this.Y - motionEvent.getY());
            ada adaVar = this.x;
            if (abs > adaVar.b) {
                adaVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.S;
    }

    @Override // defpackage.tp
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(R(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.d, marginLayoutParams.width), R(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.L, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.tp
    public final boolean n(View view) {
        WeakReference weakReference = this.B;
        return (weakReference == null || view != weakReference.get() || this.w == 3) ? false : true;
    }

    @Override // defpackage.tp
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.tp
    public final void p(View view, Parcelable parcelable) {
        ksw kswVar = (ksw) parcelable;
        int i = this.F;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.b = kswVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = kswVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.t = kswVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.u = kswVar.g;
            }
        }
        int i2 = kswVar.a;
        if (i2 == 1 || i2 == 2) {
            this.w = 4;
        } else {
            this.w = i2;
        }
    }

    @Override // defpackage.tp
    public final Parcelable q(View view) {
        return new ksw(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int t() {
        if (this.a) {
            return this.o;
        }
        return Math.max(this.n, this.N ? 0 : this.m);
    }

    final View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (aad.ai(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View u = u(viewGroup.getChildAt(i));
                if (u != null) {
                    return u;
                }
            }
        }
        return null;
    }

    public final void w(ksu ksuVar) {
        if (!this.C.contains(ksuVar)) {
            this.C.add(ksuVar);
        }
    }

    public final void x(int i) {
        View view = (View) this.A.get();
        if (view == null || this.C.isEmpty()) {
            return;
        }
        int i2 = this.r;
        if (i <= i2 && i2 != t()) {
            t();
        }
        for (int i3 = 0; i3 < this.C.size(); i3++) {
            ((ksu) this.C.get(i3)).c(view);
        }
    }

    public final void y(int i) {
        if (i >= 0) {
            this.n = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public final void z(boolean z) {
        if (this.t != z) {
            this.t = z;
            if (!z && this.w == 5) {
                B(4);
            }
            N();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 0;
        this.a = true;
        this.d = -1;
        this.L = -1;
        this.Q = new ksx(this);
        this.q = 0.5f;
        this.s = -1.0f;
        this.v = true;
        this.w = 4;
        this.V = 0.1f;
        this.C = new ArrayList();
        this.aa = -1;
        this.ab = new kss(this);
        this.J = context.getResources().getDimensionPixelSize(R.dimen.f40550_resource_name_obfuscated_res_0x7f07053b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ktd.a);
        int i = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.K = kws.b(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.O = kxj.a(context, attributeSet, R.attr.f8390_resource_name_obfuscated_res_0x7f040291, R.style.f203940_resource_name_obfuscated_res_0x7f150842).a();
        }
        if (this.O != null) {
            kxe kxeVar = new kxe(this.O);
            this.c = kxeVar;
            kxeVar.j(context);
            ColorStateList colorStateList = this.K;
            if (colorStateList != null) {
                this.c.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.c.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.R = ofFloat;
        ofFloat.setDuration(500L);
        this.R.addUpdateListener(new ksq(this, 0));
        this.s = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.L = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(peekValue.data);
        }
        z(obtainStyledAttributes.getBoolean(8, false));
        this.M = obtainStyledAttributes.getBoolean(12, false);
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.a != z) {
            this.a = z;
            if (this.A != null) {
                J();
            }
            C((!this.a || this.w != 6) ? this.w : i);
            N();
        }
        this.u = obtainStyledAttributes.getBoolean(11, false);
        this.v = obtainStyledAttributes.getBoolean(4, true);
        this.F = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.q = f;
        if (this.A != null) {
            K();
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            y(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            y(peekValue2.data);
        }
        this.f = obtainStyledAttributes.getBoolean(16, false);
        this.g = obtainStyledAttributes.getBoolean(17, false);
        this.h = obtainStyledAttributes.getBoolean(18, false);
        this.N = obtainStyledAttributes.getBoolean(19, true);
        this.i = obtainStyledAttributes.getBoolean(13, false);
        this.j = obtainStyledAttributes.getBoolean(14, false);
        this.k = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.G = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A(int i) {
        if (i == -1) {
            if (this.H) {
                return;
            }
            this.H = true;
        } else if (!this.H && this.b == i) {
            return;
        } else {
            this.H = false;
            this.b = Math.max(0, i);
        }
        F();
    }
}
