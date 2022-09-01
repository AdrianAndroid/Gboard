package defpackage;

import android.graphics.Canvas;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.inline.InlineContentView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.CopyImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cgl  reason: default package */
/* loaded from: classes.dex */
public final class cgl implements dyh {
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/PinnedActionHandler");
    public ViewGroup c;
    public InlineContentView d;
    public SurfaceView e;
    public View f;
    public boolean g;
    private ViewGroup j;
    private CopyImageView k;
    private final hwu l;
    private final dsy m;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final dyi a = new dyi(this);

    public cgl() {
        cgi cgiVar = new cgi(this, 0);
        this.l = cgiVar;
        cgj cgjVar = new cgj(this);
        this.m = cgjVar;
        hsx.c().a(ice.HEADER, cgiVar);
        cgjVar.d(mjl.a);
    }

    private final void j() {
        Choreographer.getInstance().postFrameCallback(new cgh(this, 0));
    }

    @Override // defpackage.dyh
    public final View a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        hsx.c().l(ice.HEADER, this.l);
        this.m.e();
        g(false);
        this.f = null;
    }

    public final void c() {
        this.c = null;
        this.j = null;
        this.e = null;
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ViewGroup viewGroup) {
        this.c = viewGroup;
        this.j = (ViewGroup) viewGroup.findViewById(R.id.key_pos_header_action_holder);
        this.e = (SurfaceView) this.c.findViewById(R.id.key_pos_header_action_surface);
        CopyImageView copyImageView = (CopyImageView) this.c.findViewById(R.id.key_pos_header_action_overlay);
        this.k = copyImageView;
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || copyImageView == null) {
            return;
        }
        surfaceView.setZOrderOnTop(true);
        this.e.getHolder().setFormat(-2);
        j();
    }

    @Override // defpackage.dyh
    public final void e(boolean z) {
        i(!z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(View view) {
        ViewGroup viewGroup;
        if (this.h.get() || this.c == null || (viewGroup = this.j) == null) {
            return false;
        }
        this.g = false;
        if (viewGroup.getChildCount() != 1 || viewGroup.getChildAt(0) != view) {
            this.d = null;
            viewGroup.removeAllViews();
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            viewGroup.addView(view);
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.setVisibility(0);
            }
            InlineContentView inlineContentView = (InlineContentView) view;
            this.d = inlineContentView;
            inlineContentView.setSurfaceControlCallback(new dym(this, 1));
        }
        if (this.f == null) {
            return true;
        }
        hsx.c().e(ice.HEADER, R.id.key_pos_password_header_numbers, false, false);
        return true;
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        SurfaceControl surfaceControl;
        if (this.c == null || (viewGroup = this.j) == null) {
            return;
        }
        viewGroup.removeAllViews();
        InlineContentView inlineContentView = this.d;
        if (inlineContentView != null && (surfaceControl = inlineContentView.getSurfaceControl()) != null && surfaceControl.isValid()) {
            new SurfaceControl.Transaction().reparent(surfaceControl, null).apply();
        }
        this.d = null;
        this.g = true;
        kki.i(new bwt(this, this.e, 10), 50L);
        if (z || this.f == null) {
            return;
        }
        hsx.c().i(ice.HEADER, R.id.key_pos_password_header_numbers, false, hwv.DEFAULT, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        CopyImageView copyImageView;
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            return;
        }
        Surface surface = surfaceView.getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            if (surface == null) {
                return;
            }
            surface.isValid();
            return;
        }
        Canvas canvas = null;
        try {
            try {
                canvas = surface.lockCanvas(null);
                if (canvas != null && (copyImageView = this.k) != null) {
                    copyImageView.draw(canvas);
                }
            } finally {
                if (0 != 0) {
                    surface.unlockCanvasAndPost(null);
                }
            }
        } catch (Surface.OutOfResourcesException | IllegalArgumentException e) {
            ((ltd) ((ltd) ((ltd) i.d()).i(e)).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/PinnedActionHandler", "lambda$drawBackgroundIfReady$1", (char) 349, "PinnedActionHandler.java")).t("ProactiveSuggestions failed to lock surface.");
            if (canvas == null) {
                return;
            }
            surface.unlockCanvasAndPost(canvas);
        }
    }

    public final void i(boolean z) {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            return;
        }
        surfaceView.setZOrderOnTop(z);
        InlineContentView inlineContentView = this.d;
        if (inlineContentView == null) {
            return;
        }
        inlineContentView.setZOrderedOnTop(z);
        if (z) {
            return;
        }
        j();
    }
}
