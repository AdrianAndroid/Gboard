package com.google.android.apps.inputmethod.libs.handwriting.keyboard;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HandwritingMotionEventHandler extends AbstractMotionEventHandler {
    public static final iay a = new iay(-10035, null, null);
    protected HandwritingOverlayView c;
    protected ino e;
    public final dgk h;
    public final Runnable j;
    private SoftKeyboardView m;
    private final gqa r;
    private boolean s;
    private int t;
    private final hfh v;
    private final inm w;
    private final inm x;
    private final inm y;
    public int b = 0;
    private float n = 0.0f;
    private float o = 0.0f;
    private float p = 0.0f;
    private float q = 0.0f;
    public boolean d = false;
    public final Rect f = new Rect();
    protected final List g = lre.F();
    private final Matrix u = new Matrix();
    public final iay i = new iay(-10034, null, new gpq());
    private final opu z = new opu(this);

    public HandwritingMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
        this.s = false;
        dgk dgkVar = new dgk();
        this.h = dgkVar;
        dgd dgdVar = new dgd(this, 0);
        this.j = dgdVar;
        dge dgeVar = new dge(this);
        this.v = dgeVar;
        btf btfVar = new btf(this, 10);
        this.w = btfVar;
        btf btfVar2 = new btf(this, 11);
        this.x = btfVar2;
        btf btfVar3 = new btf(this, 12);
        this.y = btfVar3;
        this.r = gqa.a(context);
        igyVar.l(dgeVar);
        this.e = ino.M(context);
        this.s = context.getResources().getBoolean(R.bool.f19540_resource_name_obfuscated_res_0x7f05001f);
        this.e.X(btfVar, R.string.f161410_resource_name_obfuscated_res_0x7f1406ad);
        this.e.X(btfVar2, R.string.f161420_resource_name_obfuscated_res_0x7f1406ae);
        this.e.X(btfVar3, R.string.f161400_resource_name_obfuscated_res_0x7f1406ac);
        dgkVar.j = dgdVar;
        s();
        q();
        r();
    }

    private final void C() {
        for (MotionEvent motionEvent : this.g) {
            motionEvent.recycle();
        }
        this.g.clear();
    }

    private final void D(Rect rect) {
        rect.set(0, 0, this.c.getWidth(), this.c.getHeight());
    }

    private final void E() {
        jdy.c(this.u, this.m, this.c);
    }

    public void a() {
        this.b = 0;
        C();
    }

    public void b(View view) {
        if (view != null) {
            o(view.getWidth() * 0.8f, view.getHeight() * 0.8f);
        }
    }

    public boolean c(MotionEvent motionEvent) {
        return u(motionEvent) && t(motionEvent);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, java.lang.AutoCloseable
    public final void close() {
        n(null);
        this.l.o(this.v);
        this.h.b();
        ino inoVar = this.e;
        if (inoVar != null) {
            inoVar.ae(this.w, R.string.f161410_resource_name_obfuscated_res_0x7f1406ad);
            this.e.ae(this.x, R.string.f161420_resource_name_obfuscated_res_0x7f1406ae);
            this.e.ae(this.y, R.string.f161400_resource_name_obfuscated_res_0x7f1406ac);
            this.e = null;
        }
    }

    public boolean d(MotionEvent motionEvent) {
        int findPointerIndex;
        if (!t(motionEvent)) {
            return false;
        }
        if (this.s && !this.d) {
            return false;
        }
        if (u(motionEvent)) {
            return this.m.c(motionEvent, motionEvent.getActionIndex()) == null;
        } else if (!v(motionEvent) || motionEvent.getActionMasked() == 7 || this.b != 1 || (findPointerIndex = motionEvent.findPointerIndex(this.t)) == -1) {
            return false;
        } else {
            return Math.abs(motionEvent.getX(findPointerIndex) - this.p) > this.n || Math.abs(motionEvent.getY(findPointerIndex) - this.q) > this.o;
        }
    }

    public final hfd f(iay iayVar) {
        hfd d = hfd.d(iayVar);
        d.k = this.v;
        d.p = 3;
        return d;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void g() {
        l();
    }

    @Override // defpackage.igx
    public final void h(MotionEvent motionEvent) {
        if (this.c != null) {
            if (this.f.isEmpty()) {
                D(this.f);
                E();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.transform(this.u);
            if (u(obtain)) {
                C();
                this.t = obtain.getPointerId(obtain.getActionIndex());
                if (d(obtain)) {
                    p();
                } else if (c(obtain)) {
                    this.b = 1;
                    this.p = obtain.getX();
                    this.q = obtain.getY();
                    b(this.m.c(obtain, obtain.getActionIndex()));
                }
            } else if (v(obtain) && this.b == 1 && d(obtain)) {
                p();
            }
            if (this.b != 0) {
                this.g.add(MotionEvent.obtain(obtain));
                if (this.b == 2) {
                    for (MotionEvent motionEvent2 : this.g) {
                        int findPointerIndex = motionEvent2.findPointerIndex(this.t);
                        if (findPointerIndex != -1) {
                            int i = 0;
                            if (v(motionEvent2)) {
                                for (int i2 = 0; i2 < motionEvent2.getHistorySize(); i2++) {
                                    this.h.c(motionEvent2.getHistoricalX(findPointerIndex, i2), motionEvent2.getHistoricalY(findPointerIndex, i2), motionEvent2.getHistoricalEventTime(i2), motionEvent2.getHistoricalPressure(findPointerIndex, i2));
                                }
                            }
                            float x = motionEvent2.getX(findPointerIndex);
                            float y = motionEvent2.getY(findPointerIndex);
                            long eventTime = motionEvent2.getEventTime();
                            float pressure = motionEvent2.getPressure(findPointerIndex);
                            if (u(motionEvent2)) {
                                if (!this.h.g()) {
                                    igy igyVar = this.l;
                                    hfd d = hfd.d(this.i);
                                    d.p = 3;
                                    igyVar.n(d);
                                }
                                dgk dgkVar = this.h;
                                dgkVar.d.e(Math.round(x), Math.round(y), eventTime, pressure);
                                HandwritingOverlayView handwritingOverlayView = dgkVar.a;
                                if (handwritingOverlayView != null) {
                                    handwritingOverlayView.d(dgkVar.d.d());
                                }
                                dgkVar.f();
                            } else if (v(motionEvent2)) {
                                this.h.c(x, y, eventTime, pressure);
                            } else if (w(motionEvent2) && this.h.g()) {
                                dgk dgkVar2 = this.h;
                                if (dgkVar2.g()) {
                                    dgkVar2.d.e(Math.round(x), Math.round(y), eventTime, pressure);
                                    dgkVar2.b.add(dgkVar2.d);
                                    dgkVar2.c.add(new gpf(dgkVar2.d));
                                    gpo d2 = dgkVar2.d.d();
                                    dgkVar2.i.e(dgkVar2.b);
                                    dgkVar2.d = new gpp();
                                    HandwritingOverlayView handwritingOverlayView2 = dgkVar2.a;
                                    if (handwritingOverlayView2 != null) {
                                        handwritingOverlayView2.f(d2);
                                    }
                                    dgkVar2.e = System.currentTimeMillis();
                                    System.currentTimeMillis();
                                    dgkVar2.f = 0L;
                                    dgkVar2.e(0L);
                                }
                                dgkVar2.h = System.currentTimeMillis();
                                if (!this.h.b.isEmpty()) {
                                    gpq gpqVar = new gpq((byte[]) null);
                                    gpq gpqVar2 = this.h.b;
                                    gpqVar.add((gpp) gpqVar2.get(gpqVar2.size() - 1));
                                    gpqVar.a(this.c.getWidth(), this.c.getHeight());
                                    if (!gpqVar.isEmpty()) {
                                        if (gpqVar.size() <= 1) {
                                            Iterator it = ((gpp) gpqVar.get(0)).iterator();
                                            while (it.hasNext()) {
                                                if (((gpo) it.next()).b <= 50.0f) {
                                                    i++;
                                                    if (i > 5) {
                                                    }
                                                }
                                            }
                                        }
                                        this.l.n(f(new iay(-10023, iax.DECODE, gpqVar)));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    C();
                }
            }
            if (w(obtain)) {
                a();
            }
            obtain.recycle();
        }
    }

    public final void i() {
        HandwritingOverlayView handwritingOverlayView;
        if (!this.h.i.i() || (handwritingOverlayView = this.c) == null) {
            return;
        }
        handwritingOverlayView.b();
    }

    public final void l() {
        if (this.h.g()) {
            this.h.a();
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void m() {
        this.j.run();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        this.m = softKeyboardView;
        if (softKeyboardView != null) {
            HandwritingOverlayView handwritingOverlayView = (HandwritingOverlayView) softKeyboardView.findViewById(R.id.f56080_resource_name_obfuscated_res_0x7f0b0253);
            this.c = handwritingOverlayView;
            handwritingOverlayView.k = this.z;
            D(this.f);
            E();
            s();
        } else {
            HandwritingOverlayView handwritingOverlayView2 = this.c;
            if (handwritingOverlayView2 != null) {
                handwritingOverlayView2.k = null;
            }
            this.c = null;
        }
        this.h.d(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(float f, float f2) {
        this.n = f;
        this.o = f2;
    }

    final void p() {
        this.b = 2;
        this.l.m();
    }

    public final void q() {
        this.h.i.f((int) Math.min(Math.max(this.e.A(R.string.f161420_resource_name_obfuscated_res_0x7f1406ae, 800.0f), 200.0f), 1500.0f));
    }

    public final void r() {
        float min = Math.min(Math.max(this.e.A(R.string.f161400_resource_name_obfuscated_res_0x7f1406ac, 800.0f), 200.0f), 1500.0f);
        HandwritingOverlayView handwritingOverlayView = this.c;
        if (handwritingOverlayView != null) {
            handwritingOverlayView.h = (int) min;
        }
        this.h.d(handwritingOverlayView);
    }

    public final void s() {
        float min = Math.min(Math.max(this.e.A(R.string.f161410_resource_name_obfuscated_res_0x7f1406ad, 1.0f), 0.5f), 2.0f);
        HandwritingOverlayView handwritingOverlayView = this.c;
        if (handwritingOverlayView != null) {
            handwritingOverlayView.h(handwritingOverlayView.d * min);
            handwritingOverlayView.i(handwritingOverlayView.e * min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(MotionEvent motionEvent) {
        return this.c.isShown() && this.f.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            return this.r.e && actionMasked == 9;
        }
        return true;
    }

    final boolean v(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 2) {
            return this.r.e && actionMasked == 7;
        }
        return true;
    }

    final boolean w(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            return true;
        }
        if (this.r.e && actionMasked == 10) {
            return true;
        }
        return (actionMasked == 1 || actionMasked == 6) && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.t;
    }
}
