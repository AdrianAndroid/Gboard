package defpackage;

import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.inline.InlineContentView;

/* compiled from: PG */
/* renamed from: dym  reason: default package */
/* loaded from: classes.dex */
public final class dym implements InlineContentView.SurfaceControlCallback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dym(SurfaceView surfaceView, int i) {
        this.b = i;
        this.a = surfaceView;
    }

    public dym(cgl cglVar, int i) {
        this.b = i;
        this.a = cglVar;
    }

    @Override // android.widget.inline.InlineContentView.SurfaceControlCallback
    public final void onDestroyed(SurfaceControl surfaceControl) {
        if (this.b != 0) {
            cgl cglVar = (cgl) this.a;
            if (!cglVar.b.get()) {
                return;
            }
            cglVar.a.f();
            cglVar.b.set(false);
        }
    }

    @Override // android.widget.inline.InlineContentView.SurfaceControlCallback
    public final void onCreated(SurfaceControl surfaceControl) {
        if (this.b == 0) {
            new SurfaceControl.Transaction().reparent(surfaceControl, ((SurfaceView) this.a).getSurfaceControl()).apply();
            return;
        }
        cgl cglVar = (cgl) this.a;
        if (!cglVar.b.get()) {
            cglVar.a.e();
            cglVar.b.set(true);
        }
        SurfaceView surfaceView = ((cgl) this.a).e;
        if (surfaceView != null && surfaceView.getSurfaceControl() != null) {
            new SurfaceControl.Transaction().reparent(surfaceControl, ((cgl) this.a).e.getSurfaceControl()).apply();
        } else {
            cgl cglVar2 = (cgl) this.a;
            ViewGroup viewGroup = cglVar2.c;
            if (viewGroup != null) {
                SurfaceView surfaceView2 = cglVar2.e;
                if (surfaceView2 != null) {
                    viewGroup.removeView(surfaceView2);
                }
                SurfaceView surfaceView3 = new SurfaceView(cglVar2.c.getContext());
                surfaceView3.setZOrderOnTop(true);
                surfaceView3.getHolder().setFormat(-2);
                surfaceView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                surfaceView3.getHolder().addCallback(new cgk(cglVar2));
                cglVar2.c.addView(surfaceView3);
                cglVar2.e = surfaceView3;
            }
        }
        ((cgl) this.a).i(true);
    }
}
