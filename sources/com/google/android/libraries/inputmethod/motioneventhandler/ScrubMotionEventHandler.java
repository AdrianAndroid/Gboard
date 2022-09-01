package com.google.android.libraries.inputmethod.motioneventhandler;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ScrubMotionEventHandler extends AbstractMotionEventHandler implements hfh {
    int a;
    hfd b;
    private final ihb c;
    private SoftKeyboardView d;
    private EditorInfo e;
    private boolean f;
    private final ihc g;
    private final Rect h;
    private final Rect i;
    private boolean j;
    private float m;
    private long n;
    private int o;
    private boolean p;
    private int q;

    public ScrubMotionEventHandler(Context context, igy igyVar, ihc ihcVar) {
        this(context, igyVar, ihcVar, context.getResources().getInteger(R.integer.f132690_resource_name_obfuscated_res_0x7f0c00f3));
    }

    private final void p(iay iayVar) {
        hfd b = hfd.b();
        b.g = x();
        b.a = iah.PRESS;
        b.j(iayVar);
        b.p = 5;
        this.b = b;
        this.l.n(this.b);
    }

    private final void q(MotionEvent motionEvent, boolean z) {
        int i;
        int i2 = 0;
        int i3 = 1;
        if (!ham.ah(this.k, this.e)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.o);
            if (this.h.contains((int) motionEvent.getX(findPointerIndex), (int) motionEvent.getY(findPointerIndex))) {
                float x = motionEvent.getX(motionEvent.findPointerIndex(this.o)) - this.m;
                if (x != 0.0d) {
                    float f = 0.0f;
                    int i4 = x > 0.0f ? 1 : -1;
                    float abs = Math.abs(x);
                    float[] fArr = this.g.h;
                    while (true) {
                        if (i3 > fArr.length) {
                            i2 = i4 * ((int) ((i3 - 1) + ((abs - f) / this.a)));
                            break;
                        }
                        int i5 = i3 - 1;
                        float f2 = fArr[i5];
                        if (abs < f2) {
                            i2 = i5 * i4;
                            break;
                        } else {
                            i3++;
                            f = f2;
                        }
                    }
                }
                if (!z && this.q == i2 && !r(motionEvent)) {
                    return;
                }
                if (z) {
                    i = this.g.c;
                } else {
                    i = r(motionEvent) ? this.g.e : this.g.d;
                }
                p(new iay(i, null, Integer.valueOf(i2)));
                this.q = i2;
                return;
            }
            this.f = false;
            p(new iay(this.g.f, null, null));
        } else if (this.j || this.n + this.c.f > motionEvent.getEventTime()) {
        } else {
            ker.p(this.k, R.string.f176680_resource_name_obfuscated_res_0x7f140cef, new Object[0]);
            this.j = true;
        }
    }

    private final boolean r(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.o);
        if (actionMasked == 1 || actionMasked == 3) {
            return true;
        }
        return actionMasked == 6 && findPointerIndex == motionEvent.getActionIndex();
    }

    public boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f != null && f.c == -10091) {
            hxk.a(this.k).b(this.d, 3);
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, java.lang.AutoCloseable
    public final void close() {
        m();
        this.d = null;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void e() {
        m();
        this.l.l(this);
    }

    protected boolean f(MotionEvent motionEvent) {
        return o(motionEvent, 3);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void g() {
        this.l.o(this);
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void gQ(EditorInfo editorInfo) {
        this.e = editorInfo;
    }

    @Override // defpackage.igx
    public final void h(MotionEvent motionEvent) {
        SoftKeyView softKeyView;
        ial c;
        if ((!this.l.g().o() || this.p) && !this.g.g) {
            if (this.f) {
                if (motionEvent.getActionMasked() == 0) {
                    if (motionEvent.getEventTime() < this.l.c() + this.c.a) {
                        this.f = false;
                    } else {
                        SoftKeyboardView softKeyboardView = this.d;
                        View c2 = softKeyboardView == null ? null : softKeyboardView.c(motionEvent, motionEvent.getActionIndex());
                        if (c2 != null && (c2 instanceof SoftKeyView) && (c = (softKeyView = (SoftKeyView) c2).c(iah.PRESS)) != null && softKeyView.c(iah.SLIDE_LEFT) == null) {
                            if (c.d().c == this.g.a) {
                                jdy.i(c2, this.d, this.h);
                                this.h.left = 0;
                                this.h.right = this.d.getWidth();
                                Rect rect = this.h;
                                rect.top = (int) (rect.top - this.c.g);
                                Rect rect2 = this.h;
                                rect2.bottom = (int) (rect2.bottom + this.c.g);
                                jdy.i(c2, this.d, this.i);
                                int actionIndex = motionEvent.getActionIndex();
                                this.o = motionEvent.getPointerId(actionIndex);
                                this.m = motionEvent.getX(actionIndex);
                                this.n = motionEvent.getEventTime();
                                this.j = false;
                                this.a = (int) (this.g.j == 1 ? this.c.d : this.c.e);
                            }
                        }
                        this.f = false;
                    }
                } else if (this.o != -1) {
                    if (!this.p && f(motionEvent)) {
                        this.p = true;
                        this.l.m();
                        this.q = 0;
                        q(motionEvent, true);
                    } else if (this.p) {
                        q(motionEvent, false);
                    }
                }
            }
            if (!r(motionEvent)) {
                return;
            }
            m();
        }
    }

    protected final float i() {
        return this.c.c;
    }

    protected final boolean l(int i, float f, float f2) {
        if (!this.g.b || !this.i.contains((int) f, (int) f2)) {
            int i2 = i - 1;
            return i2 != 0 ? i2 != 1 ? Math.abs(f - this.m) >= i() : f - this.m >= i() : this.m - f >= i();
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void m() {
        this.f = true;
        this.a = 0;
        this.m = 0.0f;
        this.o = -1;
        this.p = false;
        this.q = 0;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        if (softKeyboardView != this.d) {
            close();
            this.d = softKeyboardView;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o(MotionEvent motionEvent, int i) {
        int findPointerIndex;
        if (motionEvent.getEventTime() >= this.n + this.c.b && (findPointerIndex = motionEvent.findPointerIndex(this.o)) != -1) {
            int historySize = motionEvent.getHistorySize();
            for (int i2 = 0; i2 < historySize; i2++) {
                if (l(i, motionEvent.getHistoricalX(findPointerIndex, i2), motionEvent.getHistoricalY(findPointerIndex, i2))) {
                    return true;
                }
            }
            return l(i, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex));
        }
        return false;
    }

    public ScrubMotionEventHandler(Context context, igy igyVar, ihc ihcVar, long j) {
        super(context, igyVar);
        this.h = new Rect();
        this.i = new Rect();
        this.g = ihcVar;
        Resources resources = context.getResources();
        this.c = new ihb(resources.getInteger(R.integer.f132680_resource_name_obfuscated_res_0x7f0c00f2), j, resources.getDimensionPixelSize(R.dimen.f41620_resource_name_obfuscated_res_0x7f070629), resources.getDimensionPixelSize(R.dimen.f41630_resource_name_obfuscated_res_0x7f07062a), resources.getDimensionPixelSize(R.dimen.f41610_resource_name_obfuscated_res_0x7f070628), resources.getInteger(R.integer.f132670_resource_name_obfuscated_res_0x7f0c00f1), resources.getDimensionPixelSize(R.dimen.f41600_resource_name_obfuscated_res_0x7f070627));
        TypedArray obtainTypedArray = resources.obtainTypedArray(ihcVar.i);
        int length = obtainTypedArray.length();
        float[] fArr = new float[length];
        int i = 0;
        while (true) {
            if (i < length) {
                float dimensionPixelOffset = obtainTypedArray.getDimensionPixelOffset(i, 0);
                fArr[i] = dimensionPixelOffset;
                if (i > 0 && dimensionPixelOffset <= fArr[i - 1]) {
                    ihcVar.g = true;
                    obtainTypedArray.recycle();
                    fArr = gvw.c;
                    break;
                }
                i++;
            } else {
                obtainTypedArray.recycle();
                break;
            }
        }
        ihcVar.h = fArr;
    }
}
