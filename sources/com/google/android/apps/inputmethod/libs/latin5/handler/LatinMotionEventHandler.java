package com.google.android.apps.inputmethod.libs.latin5.handler;

import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinMotionEventHandler extends BasicMotionEventHandler implements igz, hfh {
    private static final lmz c = lmz.t("com.google.android.apps.inputmethod.datahound.app", "com.google.android.inputmethod.keyboarddevutils", "com.google.android.apps.village.boond");
    private final doy d;
    private float e = Float.NaN;
    private float f = Float.NaN;
    private int g = -1;
    private View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatinMotionEventHandler(Context context, igy igyVar) {
        super(context, igyVar);
        doy doyVar = new doy();
        this.d = doyVar;
    }

    private final void s() {
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = -1;
        this.h = null;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, defpackage.ihf, defpackage.igz
    public final View a(MotionEvent motionEvent, int i) {
        SoftKeyView softKeyView;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        if (this.g == i && this.e == x && this.f == y) {
            return this.h;
        }
        this.g = i;
        this.e = x;
        this.f = y;
        View a = super.a(motionEvent, i);
        this.h = a;
        mtj mtjVar = null;
        if (a == null) {
            return null;
        }
        if (this.l.g().o()) {
            doi doiVar = this.d.g;
            if (doiVar != null) {
                doiVar.a(false, Float.NaN, Float.NaN, -1, false);
            }
            return a;
        }
        try {
            doy doyVar = this.d;
            PointF pointF = (PointF) doyVar.f.get(motionEvent.getPointerId(i), doy.a);
            doi doiVar2 = doyVar.g;
            if (doiVar2 != null) {
                doiVar2.a(false, pointF.x, pointF.y, -1, false);
            }
            SoftKeyView softKeyView2 = a instanceof SoftKeyView ? (SoftKeyView) a : null;
            if (softKeyView2 == null || doyVar.d == null || doyVar.g == null) {
                softKeyView = null;
                z = false;
                i2 = -1;
                z2 = false;
            } else {
                long eventTime = motionEvent.getEventTime();
                boolean z4 = doyVar.c;
                ial c2 = softKeyView2.c(iah.PRESS);
                if (c2 == null) {
                    mtjVar = null;
                } else if (c2.d.length != 0) {
                    int lowerCase = Character.toLowerCase(ccn.a(c2.d()));
                    nfh t = mtj.d.t();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mtj mtjVar2 = (mtj) t.b;
                    int i3 = mtjVar2.a | 1;
                    mtjVar2.a = i3;
                    mtjVar2.b = z4;
                    mtjVar2.a = i3 | 2;
                    mtjVar2.c = lowerCase;
                    mtjVar = (mtj) t.cz();
                }
                i2 = mtjVar == null ? -1 : mtjVar.c;
                int i4 = motionEvent.getAction() == 1 ? 2 : motionEvent.getAction() == 2 ? 3 : 1;
                doi doiVar3 = doyVar.g;
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                if (true != doyVar.b) {
                    mtjVar = null;
                }
                caj cajVar = ((Delight5Facilitator) doiVar3.a).h;
                nfh t2 = msw.h.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                msw mswVar = (msw) t2.b;
                int i5 = mswVar.a | 1;
                mswVar.a = i5;
                mswVar.b = x2;
                int i6 = i5 | 2;
                mswVar.a = i6;
                mswVar.c = y2;
                int i7 = i6 | 4;
                mswVar.a = i7;
                mswVar.d = eventTime;
                mswVar.g = i4 - 1;
                int i8 = i7 | 32;
                mswVar.a = i8;
                if (mtjVar != null) {
                    mswVar.f = mtjVar;
                    mswVar.a = i8 | 16;
                }
                cbz cbzVar = cajVar.e;
                long o = cbzVar.d.o();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                msw mswVar2 = (msw) t2.b;
                mswVar2.a |= 8;
                mswVar2.e = o;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cbzVar.d(mti.PERFORM_KEY_CORRECTION);
                msx performKeyCorrection = cbzVar.a.performKeyCorrection((msw) t2.cz());
                cbzVar.e(mti.PERFORM_KEY_CORRECTION);
                cbzVar.b.g(caq.DELIGHT_PERFORM_KEY_CORRECTION, SystemClock.elapsedRealtime() - elapsedRealtime);
                cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(((msw) t2.b).e));
                if (performKeyCorrection.d) {
                    softKeyView = null;
                    z3 = true;
                } else {
                    if (performKeyCorrection.a) {
                        dox doxVar = doyVar.d;
                        int i9 = performKeyCorrection.b;
                        String str = performKeyCorrection.c;
                        int indexOfValue = doxVar.b.indexOfValue(Character.toLowerCase(i9));
                        int keyAt = indexOfValue < 0 ? -1 : doxVar.b.keyAt(indexOfValue);
                        if (keyAt < 0) {
                            if (!TextUtils.isEmpty(str)) {
                                SparseArray sparseArray = doxVar.c;
                                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                                int size = sparseArray.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        i10 = -1;
                                        break;
                                    } else if (((String) sparseArray.valueAt(i10)).equals(lowerCase2)) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                                if (i10 >= 0) {
                                    keyAt = doxVar.c.keyAt(i10);
                                }
                            }
                            keyAt = -1;
                        }
                        if (keyAt >= 0 && keyAt < doxVar.a.a.size()) {
                            softKeyView = (SoftKeyView) doxVar.a.a.valueAt(keyAt);
                            z3 = false;
                        }
                    }
                    softKeyView = null;
                    z3 = false;
                }
                z2 = performKeyCorrection.e;
                z = z3;
            }
            if (z) {
                a = null;
            } else if (softKeyView2 != null) {
                boolean z5 = softKeyView != null;
                doi doiVar4 = doyVar.g;
                if (doiVar4 != null) {
                    doiVar4.a(z5, pointF.x, pointF.y, softKeyView != null ? i2 : -1, z2);
                }
                if (z5) {
                    doyVar.e.e(dda.SPECIAL_KEY_CORRECTIONS, Integer.valueOf((doy.b(softKeyView2) * 100) + doy.b(softKeyView)));
                    a = softKeyView;
                }
            }
        } catch (RuntimeException unused) {
        }
        this.h = a;
        return a;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10121) {
            return false;
        }
        this.d.g = (doi) f.e;
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void e() {
        this.d.a(this.a);
        this.l.l(this);
        super.e();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void g() {
        doy doyVar = this.d;
        doyVar.d = null;
        doyVar.g = null;
        this.l.o(this);
        super.o(false);
        m();
        s();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void gQ(EditorInfo editorInfo) {
        if (editorInfo == null || !c.contains(editorInfo.packageName)) {
            return;
        }
        super.o(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
        if (r0 != 6) goto L9;
     */
    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, defpackage.igx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            if (r0 == 0) goto L23
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 5
            if (r0 == r1) goto L23
            r1 = 6
            if (r0 == r1) goto L10
            goto L42
        L10:
            r5.s()
            doy r0 = r5.d
            android.util.SparseArray r0 = r0.f
            int r1 = r6.getActionIndex()
            int r1 = r6.getPointerId(r1)
            r0.remove(r1)
            goto L42
        L23:
            r5.s()
            doy r0 = r5.d
            int r1 = r6.getActionIndex()
            int r2 = r6.getPointerId(r1)
            android.util.SparseArray r0 = r0.f
            android.graphics.PointF r3 = new android.graphics.PointF
            float r4 = r6.getX(r1)
            float r1 = r6.getY(r1)
            r3.<init>(r4, r1)
            r0.append(r2, r3)
        L42:
            super.h(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.handler.LatinMotionEventHandler.h(android.view.MotionEvent):void");
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void k(boolean z, int i, int i2, int i3, int i4) {
        super.k(z, i, i2, i3, i4);
        s();
        dox doxVar = this.d.d;
        if (doxVar != null) {
            doxVar.a();
        }
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void m() {
        super.m();
        s();
    }

    @Override // com.google.android.libraries.inputmethod.motioneventhandler.BasicMotionEventHandler, com.google.android.libraries.inputmethod.motioneventhandler.AbstractMotionEventHandler, defpackage.igx
    public final void n(SoftKeyboardView softKeyboardView) {
        if (softKeyboardView != this.a) {
            s();
            this.d.a(softKeyboardView);
        }
        super.n(softKeyboardView);
    }
}
