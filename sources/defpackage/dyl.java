package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;

/* compiled from: PG */
/* renamed from: dyl  reason: default package */
/* loaded from: classes.dex */
public final class dyl implements SurfaceHolder.Callback {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ ProactiveSuggestionsClippableHolderView b;

    public dyl(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView, SurfaceView surfaceView) {
        this.b = proactiveSuggestionsClippableHolderView;
        this.a = surfaceView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.b.n.set(false);
        if (!this.b.l.get()) {
            this.a.setZOrderOnTop(false);
            this.b.d();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.b.n.set(true);
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView = this.b;
        proactiveSuggestionsClippableHolderView.j(proactiveSuggestionsClippableHolderView, null);
    }
}
