package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import com.google.android.libraries.inputmethod.widgets.ChordTrackOverlayView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: igu  reason: default package */
/* loaded from: classes.dex */
public final class igu {
    public final Context a;
    public final igt b;
    public final igy c;
    public final ihh d;
    public final imn e;
    public final idk f;
    public SoftKeyboardView g;
    public boolean h;
    public SoftKeyView i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public MotionEvent o;
    public MotionEvent p;
    public boolean q = true;
    public ChordTrackOverlayView r;

    public igu(Context context, igt igtVar, igy igyVar, ihh ihhVar) {
        this.a = context;
        this.b = igtVar;
        this.c = igyVar;
        this.d = ihhVar;
        this.e = igyVar.k();
        this.f = igyVar.j();
    }

    public final void a() {
        SoftKeyView softKeyView = this.i;
        if (softKeyView != null) {
            ial c = softKeyView.c(iah.PRESS);
            if (c == null) {
                c = this.i.c(iah.DOWN);
            }
            if (c == null) {
                return;
            }
            SoftKeyView softKeyView2 = this.i;
            ict ictVar = softKeyView2.b;
            int id = softKeyView2.getId();
            boolean z = this.i.e;
            igy igyVar = this.c;
            hfd b = hfd.b();
            b.a = iah.PRESS;
            b.j(c.d());
            b.c = ictVar;
            b.d = id;
            b.e = z;
            b.p = 2;
            igyVar.n(b);
        }
    }

    public final void b() {
        ChordTrackOverlayView chordTrackOverlayView = this.r;
        if (chordTrackOverlayView != null) {
            chordTrackOverlayView.a = -1;
            chordTrackOverlayView.b = -1;
            chordTrackOverlayView.e = -1;
            chordTrackOverlayView.f = -1;
            chordTrackOverlayView.c = -1;
            chordTrackOverlayView.d = -1;
            this.e.c(chordTrackOverlayView, null, true);
            this.r = null;
        }
    }

    public final void c() {
        if (this.h) {
            SoftKeyView softKeyView = this.i;
            if (softKeyView != null) {
                softKeyView.setPressed(false);
                this.i = null;
            }
            MotionEvent motionEvent = this.o;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.o = null;
            }
            MotionEvent motionEvent2 = this.p;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.p = null;
            }
            this.n = false;
            this.j = false;
            this.h = false;
            this.l = false;
            this.m = false;
            this.q = true;
            this.k = -1;
            b();
        }
    }

    public final void d(MotionEvent motionEvent, SoftKeyView softKeyView, boolean z) {
        this.n = z;
        int actionIndex = motionEvent.getActionIndex();
        if (z) {
            this.o = MotionEvent.obtain(motionEvent);
        } else {
            this.p = MotionEvent.obtain(motionEvent);
        }
        this.k = motionEvent.getPointerId(actionIndex);
        this.h = true;
        if (softKeyView != null) {
            this.i = softKeyView;
            this.q = false;
        }
    }

    public final void e() {
        if (this.n) {
            MotionEvent motionEvent = this.p;
            if (motionEvent != null) {
                motionEvent.recycle();
                this.p = null;
            }
            Matrix matrix = new Matrix();
            SoftKeyboardView softKeyboardView = this.g;
            if (softKeyboardView != null) {
                jdy.c(matrix, softKeyboardView, null);
                matrix.invert(matrix);
            }
            MotionEvent motionEvent2 = this.o;
            if (motionEvent2 == null) {
                return;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent2);
            this.p = obtain;
            obtain.transform(matrix);
            ChordTrackOverlayView chordTrackOverlayView = this.r;
            if (chordTrackOverlayView == null) {
                return;
            }
            chordTrackOverlayView.b(this.p, this.k);
        }
    }
}
