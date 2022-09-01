package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Handler;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dgk  reason: default package */
/* loaded from: classes.dex */
public final class dgk implements AutoCloseable {
    public HandwritingOverlayView a;
    public final gpq b = new gpq();
    public final ArrayList c = new ArrayList();
    public gpp d = new gpp();
    public long e = 0;
    public long f = 0;
    public int g = 0;
    public long h = 0;
    private final Handler k = new Handler();
    public dgg i = new dgc();
    public Runnable j = null;
    private final Runnable l = new dgd(this, 2);

    public final void a() {
        HandwritingOverlayView handwritingOverlayView = this.a;
        if (handwritingOverlayView != null) {
            handwritingOverlayView.c();
            handwritingOverlayView.b.save();
            Canvas canvas = handwritingOverlayView.b;
            canvas.clipRect(0, 0, canvas.getWidth(), handwritingOverlayView.b.getHeight());
            handwritingOverlayView.b.drawColor(0, PorterDuff.Mode.CLEAR);
            handwritingOverlayView.b.restore();
            handwritingOverlayView.invalidate();
            dgj dgjVar = handwritingOverlayView.j;
            dgjVar.g = 1.0f;
            dgjVar.d.clear();
            dgh dghVar = dgjVar.i.d;
            dghVar.f.g("pressure_min", dghVar.a);
            dghVar.f.g("pressure_max", dghVar.b);
            if (this.i.i()) {
                this.a.b();
            }
        }
        this.b.clear();
        this.c.clear();
        this.i.b();
        this.d = new gpp();
        f();
    }

    public final void b() {
        a();
        this.a = null;
    }

    public final void c(float f, float f2, long j, float f3) {
        if (g()) {
            this.d.e(Math.round(f), Math.round(f2), j, f3);
            HandwritingOverlayView handwritingOverlayView = this.a;
            if (handwritingOverlayView == null) {
                return;
            }
            handwritingOverlayView.e(this.d.d());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
    }

    public final void d(HandwritingOverlayView handwritingOverlayView) {
        dgf dgfVar;
        b();
        if (handwritingOverlayView != null) {
            this.a = handwritingOverlayView;
            int layoutDirection = handwritingOverlayView.getContext().getResources().getConfiguration().getLayoutDirection();
            dgf dgfVar2 = this.a.i;
            if (dgfVar2 == dgf.SCROLL_TO_LEFT || (dgfVar2 == (dgfVar = dgf.SCROLL_TO_START) && layoutDirection == 0)) {
                HandwritingOverlayView handwritingOverlayView2 = this.a;
                this.i = new dgm(handwritingOverlayView2.h, handwritingOverlayView2.g);
            } else if (dgfVar2 == dgf.SCROLL_TO_RIGHT || (dgfVar2 == dgfVar && layoutDirection == 1)) {
                HandwritingOverlayView handwritingOverlayView3 = this.a;
                this.i = new dgn(handwritingOverlayView3.h, handwritingOverlayView3.g);
            } else if (dgfVar2 == dgf.ZOOM_OUT) {
                this.i = new dgp(this.a.h);
            } else {
                this.i = new dgc();
            }
            gqa a = gqa.a(handwritingOverlayView.getContext());
            a.p(this.i);
            this.i.onAccessibilityStateChanged(a.f);
        }
    }

    public final void e(long j) {
        this.k.postDelayed(this.l, j);
    }

    public final void f() {
        this.k.removeCallbacks(this.l);
        this.e = 0L;
        this.f = 0L;
    }

    public final boolean g() {
        return !this.b.isEmpty() || !this.d.f();
    }
}
