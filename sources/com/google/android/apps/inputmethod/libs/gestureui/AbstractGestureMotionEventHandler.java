package com.google.android.apps.inputmethod.libs.gestureui;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractGestureMotionEventHandler extends AbstractMotionEventHandler implements dfp, hfh {
    private static final ltg j = ltg.j("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler");
    private float A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private float F;
    private int G;
    private float H;
    private float I;
    private int J;
    private final hzr K;
    private final dfo L;
    private final gzy M;
    private final gwg N;
    protected final SparseArray a;
    protected final SparseArray b;
    protected final SparseArray c;
    protected final SparseArray d;
    protected SoftKeyboardView e;
    protected ViewGroup f;
    protected jde g;
    public GestureOverlayView h;
    public boolean i;
    private final int m;
    private final float n;
    private final float o;
    private final float p;
    private long q;
    private final List r;
    private boolean s;
    private final hxk t;
    private boolean u;
    private boolean v;
    private int w;
    private long x;
    private int y;
    private final imn z;

    public AbstractGestureMotionEventHandler(Context context, igy igyVar, int i) {
        this(context, igyVar, i, 1.5f, 0.5f, 1.5f);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    private final void C() {
        this.u = true;
        this.v = false;
        this.E = false;
        this.D = 0;
        this.r.clear();
        this.q = 0L;
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.y = 0;
        gwg gwgVar = this.N;
        for (int i = 0; i < ((SparseArray) gwgVar.b).size(); i++) {
            List list = (List) ((SparseArray) gwgVar.b).valueAt(i);
            if (gwgVar.a) {
                gwgVar.d.add(list);
            } else {
                gwgVar.e(list);
            }
        }
        ((SparseArray) gwgVar.b).clear();
        ((SparseIntArray) gwgVar.c).clear();
        gwgVar.a = false;
    }

    private final void D() {
        SoftKeyboardView softKeyboardView = this.e;
        if (softKeyboardView != null) {
            jde f = softKeyboardView.f();
            this.g = f;
            float f2 = f.h * 0.1f;
            this.w = (int) (f2 * f2);
            f();
        }
    }

    private static double t(float f, float f2, float f3, float f4) {
        return Math.hypot(f - f3, f2 - f4);
    }

    private final SoftKeyView u(MotionEvent motionEvent) {
        View c = this.e.c(motionEvent, motionEvent.getActionIndex());
        if (c == null) {
            return null;
        }
        if (this.g.a.get(c.getId()) != null) {
            this.d.put(motionEvent.getPointerId(motionEvent.getActionIndex()), c);
        }
        return (SoftKeyView) c;
    }

    private final void v(int i, float f) {
        Float f2 = (Float) this.c.get(i);
        float floatValue = f2 == null ? 0.0f : f2.floatValue();
        double sqrt = Math.sqrt(f);
        SparseArray sparseArray = this.c;
        double d = floatValue;
        Double.isNaN(d);
        sparseArray.put(i, Float.valueOf((float) (d + sqrt)));
    }

    private final void w(int i, float f, float f2, long j2) {
        mwj mwjVar;
        if (!this.E && (mwjVar = (mwj) this.b.get(i)) != null) {
            int i2 = mwjVar.f;
            long j3 = this.q;
            float f3 = mwjVar.d;
            float f4 = mwjVar.e;
            long j4 = j2 - (i2 + j3);
            if (j4 <= 0 || t(f, f2, f3, f4) <= this.F * ((float) j4)) {
                return;
            }
            this.E = true;
            this.H = f;
            this.I = f2;
            this.G = i;
            this.J = (int) (j2 - this.q);
        }
    }

    protected int a() {
        return this.g.i;
    }

    protected int b() {
        return this.g.h;
    }

    @Override // defpackage.hfh
    public boolean c(hfd hfdVar) {
        this.L.c(hfdVar);
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, java.lang.AutoCloseable
    public final void close() {
        C();
        this.i = false;
        this.v = false;
        this.z.c(this.h, null, true);
        GestureOverlayView gestureOverlayView = this.h;
        if (gestureOverlayView != null) {
            gestureOverlayView.setVisibility(8);
            this.h = null;
            this.K.e();
        }
        this.g = null;
        this.f = null;
        this.e = null;
    }

    protected abstract ViewGroup d(View view);

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final synchronized void e() {
        this.i = true;
        D();
        dfo dfoVar = this.L;
        dfoVar.a.clear();
        dfoVar.b.clear();
        dfoVar.c = false;
        this.l.l(this);
        this.s = ino.M(this.k).aj(R.string.f161390_resource_name_obfuscated_res_0x7f1406ab);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        this.B = (int) (b() * this.p);
        this.C = (int) (b() * this.o);
        this.F = (b() * this.n) / 1000.0f;
        this.A = (int) (a() * 1.6f);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public synchronized void g() {
        if (!this.i) {
            return;
        }
        this.i = false;
        this.l.o(this);
        C();
        i();
    }

    @Override // defpackage.igx
    public final void h(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        mwi mwiVar;
        List list;
        List list2;
        List list3;
        int i;
        int i2;
        long j2;
        int i3;
        long j3;
        int i4;
        int i5;
        hxk hxkVar;
        int i6;
        if (this.e == null) {
            ((ltd) j.a(hip.a).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "handle", 409, "AbstractGestureMotionEventHandler.java")).t("handle() : softKeyboardView = null");
        } else if (!this.u) {
        } else {
            if (!q()) {
                ((ltd) ((ltd) j.b()).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "handle", 417, "AbstractGestureMotionEventHandler.java")).t("handle() : Skip Event : ReadyForGestureInput = false");
                return;
            }
            ViewGroup viewGroup = this.f;
            if (viewGroup == null || viewGroup.getVisibility() != 0) {
                ((ltd) ((ltd) j.b()).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "handle", 422, "AbstractGestureMotionEventHandler.java")).t("handle() : Skip Event : inputKeyViewGroup == null or invisible");
                return;
            }
            if (this.g == null) {
                if (this.e != null) {
                    ((ltd) ((ltd) j.d()).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "handle", 428, "AbstractGestureMotionEventHandler.java")).t("handle() : updateLayoutData()");
                    D();
                } else {
                    ((ltd) ((ltd) j.d()).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "handle", 431, "AbstractGestureMotionEventHandler.java")).t("handle() : layoutData is null and softKeyboardView is null");
                    return;
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (motionEvent.getEventTime() - this.l.c() < 650) {
                    Iterator it = this.L.b.iterator();
                    i6 = 0;
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            i6++;
                        }
                    }
                } else {
                    i6 = 0;
                }
                this.D = i6;
                actionMasked = 0;
            }
            int i7 = 1;
            if (actionMasked == 0 || actionMasked == 5) {
                SoftKeyView u = u(motionEvent);
                if (!this.v && u != null) {
                    this.u = p(u);
                }
            } else if (actionMasked != 3) {
                if (this.d.get(motionEvent.getPointerId(motionEvent.getActionIndex())) == null) {
                    u(motionEvent);
                }
                if (this.v && (hxkVar = this.t) != null && hxkVar.e()) {
                    if (actionMasked != 1) {
                        if (actionMasked == 6) {
                            actionMasked = 6;
                        }
                    }
                    this.t.b(this.e, 1);
                }
            }
            int i8 = actionMasked;
            if (!this.u) {
                return;
            }
            int i9 = this.y;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j4 = this.x;
            int actionMasked2 = motionEvent.getActionMasked();
            long eventTime = motionEvent.getEventTime();
            int i10 = 0;
            while (i10 < motionEvent.getPointerCount()) {
                int pointerId = motionEvent.getPointerId(i10);
                if (this.d.get(pointerId) == null) {
                    i = i10;
                    i2 = actionMasked2;
                    j2 = j4;
                    i4 = i8;
                    i5 = i9;
                    j3 = eventTime;
                } else {
                    int i11 = 0;
                    while (i11 < motionEvent.getHistorySize()) {
                        int i12 = i10;
                        w(pointerId, motionEvent.getHistoricalX(i10, i11), motionEvent.getHistoricalY(i10, i11), motionEvent.getHistoricalEventTime(i11));
                        gwg gwgVar = this.N;
                        float historicalX = motionEvent.getHistoricalX(i12, i11);
                        float historicalY = motionEvent.getHistoricalY(i12, i11);
                        motionEvent.getHistoricalPressure(i12, i11);
                        gwgVar.f(pointerId, historicalX, historicalY, motionEvent.getHistoricalEventTime(i11));
                        i11++;
                        i10 = i12;
                        actionMasked2 = actionMasked2;
                        eventTime = eventTime;
                        j4 = j4;
                    }
                    i = i10;
                    long j5 = eventTime;
                    i2 = actionMasked2;
                    j2 = j4;
                    float x = motionEvent.getX(i);
                    float y = motionEvent.getY(i);
                    w(pointerId, x, y, j5);
                    gwg gwgVar2 = this.N;
                    motionEvent.getPressure(i);
                    gwgVar2.f(pointerId, x, y, j5);
                    int i13 = this.w;
                    nfh t = mwj.t.t();
                    if (i2 == 0) {
                        if (t.c) {
                            t.cD();
                            i3 = 0;
                            t.c = false;
                        } else {
                            i3 = 0;
                        }
                        mwj mwjVar = (mwj) t.b;
                        mwjVar.b = i3;
                        mwjVar.a |= i7;
                    } else if (i2 == i7) {
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mwj mwjVar2 = (mwj) t.b;
                        mwjVar2.b = i7;
                        mwjVar2.a |= i7;
                    } else if (i2 == 2) {
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mwj mwjVar3 = (mwj) t.b;
                        mwjVar3.b = 2;
                        mwjVar3.a |= i7;
                    } else if (i2 == 5) {
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mwj mwjVar4 = (mwj) t.b;
                        mwjVar4.b = 4;
                        mwjVar4.a |= i7;
                    } else if (i2 != 6) {
                        i4 = i8;
                        i5 = i9;
                        j3 = j5;
                    } else {
                        if (t.c) {
                            t.cD();
                            t.c = false;
                        }
                        mwj mwjVar5 = (mwj) t.b;
                        mwjVar5.b = 5;
                        mwjVar5.a |= i7;
                    }
                    j3 = j5;
                    if (this.r.isEmpty()) {
                        this.q = j3;
                    }
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mwj mwjVar6 = (mwj) t.b;
                    int i14 = mwjVar6.a | 2;
                    mwjVar6.a = i14;
                    mwjVar6.c = pointerId;
                    int i15 = i14 | 4;
                    mwjVar6.a = i15;
                    mwjVar6.d = x;
                    int i16 = i15 | 8;
                    mwjVar6.a = i16;
                    mwjVar6.e = y;
                    i4 = i8;
                    i5 = i9;
                    long j6 = this.q;
                    mwjVar6.a = i16 | 16;
                    mwjVar6.f = (int) (j3 - j6);
                    mwj mwjVar7 = (mwj) this.b.get(pointerId);
                    this.b.put(pointerId, (mwj) t.cz());
                    if (mwjVar7 == null) {
                        this.r.add((mwj) t.cz());
                        this.a.put(pointerId, (mwj) t.cz());
                        v(pointerId, 0.0f);
                    } else if (i13 <= 0) {
                        this.r.add((mwj) t.cz());
                    } else {
                        float f = x - mwjVar7.d;
                        float f2 = y - mwjVar7.e;
                        float f3 = (f * f) + (f2 * f2);
                        if (uptimeMillis > j2 || f3 >= i13) {
                            this.r.add((mwj) t.cz());
                            v(pointerId, f3);
                        }
                    }
                    this.y++;
                    i10 = i + 1;
                    eventTime = j3;
                    actionMasked2 = i2;
                    i8 = i4;
                    i9 = i5;
                    j4 = j2;
                    i7 = 1;
                }
                i10 = i + 1;
                eventTime = j3;
                actionMasked2 = i2;
                i8 = i4;
                i9 = i5;
                j4 = j2;
                i7 = 1;
            }
            long j7 = j4;
            int i17 = i8;
            int i18 = i9;
            int i19 = this.y;
            boolean z3 = i17 == 1;
            if (this.d.size() > 0 && ((i18 < i19 || z3) && i17 != 3)) {
                if (s()) {
                    this.v = true;
                    this.l.m();
                    this.x = this.m + uptimeMillis;
                    this.l.j().e(dda.GESTURE_INPUT_STARTED, new Object[0]);
                    this.N.a = true;
                    this.M.c("start tapping=%d gesture=%b", Integer.valueOf(this.D), Boolean.valueOf(this.L.c));
                }
                if (this.v) {
                    if (this.s && !this.z.f(this.h)) {
                        o();
                    }
                    GestureOverlayView gestureOverlayView = this.h;
                    if (gestureOverlayView != null) {
                        gestureOverlayView.b(gestureOverlayView.getWidth(), gestureOverlayView.getHeight());
                        gestureOverlayView.removeCallbacks(gestureOverlayView.l);
                        gestureOverlayView.post(gestureOverlayView.l);
                    }
                    if (uptimeMillis > j7) {
                        z = z3;
                    } else if (z3) {
                        z = true;
                    }
                    igy igyVar = this.l;
                    hfd b = hfd.b();
                    b.g = x();
                    int i20 = i17 == 1 ? -10029 : -10028;
                    iax iaxVar = iax.DECODE;
                    if (this.r.isEmpty()) {
                        mwiVar = null;
                    } else {
                        nfh t2 = mwi.d.t();
                        if (z3 && !this.r.isEmpty()) {
                            int w = jco.w(((mwj) this.r.get(list.size() - 1)).b);
                            if (w == 0 || w != 2) {
                                mwj mwjVar8 = (mwj) this.r.get(list2.size() - 1);
                                this.r.remove(list3.size() - 1);
                                nfh nfhVar = (nfh) mwjVar8.N(5);
                                nfhVar.cG(mwjVar8);
                                if (nfhVar.c) {
                                    nfhVar.cD();
                                    nfhVar.c = false;
                                }
                                mwj mwjVar9 = (mwj) nfhVar.b;
                                mwjVar9.b = 1;
                                mwjVar9.a |= 1;
                                this.r.add((mwj) nfhVar.cz());
                            }
                        }
                        List list4 = this.r;
                        if (t2.c) {
                            t2.cD();
                            z2 = false;
                            t2.c = false;
                        } else {
                            z2 = false;
                        }
                        mwi mwiVar2 = (mwi) t2.b;
                        mwiVar2.b();
                        ndt.cs(list4, mwiVar2.b);
                        if (t2.c) {
                            t2.cD();
                            t2.c = z2;
                        }
                        mwi mwiVar3 = (mwi) t2.b;
                        mwiVar3.a |= 1;
                        mwiVar3.c = true;
                        mwiVar = (mwi) t2.cz();
                    }
                    b.j(new iay(i20, iaxVar, mwiVar));
                    b.p = 4;
                    igyVar.n(b);
                    this.x = this.m + uptimeMillis;
                    z3 = z;
                }
            }
            if (!z3 && i17 != 3) {
                return;
            }
            C();
        }
    }

    public final void i() {
        this.z.c(this.h, null, true);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void j() {
        i();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void k(boolean z, int i, int i2, int i3, int i4) {
        if (this.e == null) {
            ((ltd) j.a(hip.a).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "onSoftKeyboardViewLayout", 327, "AbstractGestureMotionEventHandler.java")).t("onSoftKeyboardViewLayout() : softKeyboardView = null");
        } else if (!z || !this.l.p()) {
        } else {
            D();
            int height = this.e.getHeight();
            int width = this.e.getWidth();
            if (!this.s || width == 0 || height == 0 || !this.v) {
                return;
            }
            o();
        }
    }

    @Override // defpackage.dfp
    public final void l() {
        i();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void m() {
        C();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        if (softKeyboardView != this.e) {
            close();
            this.e = softKeyboardView;
            this.f = d(softKeyboardView);
            if (!this.l.p()) {
                return;
            }
            D();
        }
    }

    protected final void o() {
        if (this.h == null) {
            GestureOverlayView gestureOverlayView = (GestureOverlayView) this.z.b(this.k, R.layout.f134860_resource_name_obfuscated_res_0x7f0e00cc);
            this.h = gestureOverlayView;
            gestureOverlayView.m = this.N;
            gestureOverlayView.setEnabled(false);
            this.h.j = this;
            this.K.d(mjl.a);
        }
        SoftKeyboardView softKeyboardView = this.e;
        if (softKeyboardView == null) {
            ((ltd) j.a(hip.a).k("com/google/android/apps/inputmethod/libs/gestureui/AbstractGestureMotionEventHandler", "showGestureOverlay", 349, "AbstractGestureMotionEventHandler.java")).t("showGestureOverlay() : softKeyboardView = null");
        } else if (softKeyboardView.getWindowToken() == null) {
        } else {
            this.h.setVisibility(0);
            Rect rect = new Rect(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            jdy.e(rect, (View) this.e.getParent(), this.l.f());
            this.h.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.bottom));
            this.h.k = rect.top;
            this.z.e(this.h, this.e, 834, 0, 0, null);
        }
    }

    protected abstract boolean p(SoftKeyView softKeyView);

    public boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean r(int i) {
        return ((Float) this.c.get(i)).floatValue() > this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s() {
        int i;
        if (!this.v && this.E && this.r.size() >= 2) {
            mwj mwjVar = (mwj) this.b.get(this.G);
            int i2 = mwjVar.f - this.J;
            if (i2 < 0) {
                return false;
            }
            double t = t(mwjVar.d, mwjVar.e, this.H, this.I);
            boolean z = this.L.c;
            int i3 = this.D;
            if (i3 == 0 || i2 >= 650 || z) {
                i = this.C;
            } else {
                int i4 = this.B * i3;
                i = i4 - (((i4 - this.C) * i2) / 650);
            }
            int i5 = 20;
            if (i3 != 0 && i2 < 650 && !z) {
                int i6 = i3 * 100;
                i5 = i6 - (((i6 - 20) * i2) / 650);
            }
            if (i2 >= i5 && t >= i) {
                return true;
            }
        }
        return false;
    }

    public AbstractGestureMotionEventHandler(Context context, igy igyVar, int i, float f, float f2, float f3) {
        super(context, igyVar);
        this.q = 0L;
        this.r = lre.A();
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.u = true;
        this.N = new gwg();
        this.K = new dfm(this);
        this.L = new dfo();
        this.M = new gzy("GESTURE");
        this.m = i;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.z = igyVar.k();
        this.t = hxk.a(context);
    }
}
