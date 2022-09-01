package defpackage;

import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.inline.InlineContentView;

/* compiled from: PG */
/* renamed from: cgk  reason: default package */
/* loaded from: classes.dex */
public final class cgk implements SurfaceHolder.Callback {
    final /* synthetic */ cgl a;

    public cgk(cgl cglVar) {
        this.a = cglVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        InlineContentView inlineContentView = this.a.d;
        SurfaceControl surfaceControl = null;
        SurfaceControl surfaceControl2 = inlineContentView != null ? inlineContentView.getSurfaceControl() : null;
        SurfaceView surfaceView = this.a.e;
        if (surfaceView != null) {
            surfaceControl = surfaceView.getSurfaceControl();
        }
        if (surfaceControl2 == null || surfaceControl == null) {
            return;
        }
        new SurfaceControl.Transaction().reparent(surfaceControl2, surfaceControl).apply();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
