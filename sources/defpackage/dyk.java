package defpackage;

import android.view.SurfaceView;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView;
import com.google.android.libraries.inputmethod.widgets.CopyImageView;

/* compiled from: PG */
/* renamed from: dyk  reason: default package */
/* loaded from: classes.dex */
public final class dyk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ProactiveSuggestionsClippableHolderView a;
    private float b;

    public dyk(ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView) {
        this.a = proactiveSuggestionsClippableHolderView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView;
        CopyImageView copyImageView;
        HorizontalScrollView horizontalScrollView;
        ImageView imageView;
        ImageView imageView2;
        LinearLayout linearLayout;
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView2 = this.a;
        SurfaceView surfaceView = proactiveSuggestionsClippableHolderView2.d;
        if (surfaceView != null) {
            boolean isShown = proactiveSuggestionsClippableHolderView2.isShown();
            if (isShown != (surfaceView.getVisibility() == 0) && !this.a.a.isEmpty()) {
                if (isShown) {
                    this.a.h();
                } else {
                    this.a.f();
                }
            }
            if (this.a.o) {
                kki.i(new dvd(this, 16), 50L);
            }
        }
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView3 = this.a;
        proactiveSuggestionsClippableHolderView3.j(proactiveSuggestionsClippableHolderView3, proactiveSuggestionsClippableHolderView3.d);
        float f = this.b;
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView4 = this.a;
        if (f != proactiveSuggestionsClippableHolderView4.k && (horizontalScrollView = proactiveSuggestionsClippableHolderView4.g) != null && (imageView = proactiveSuggestionsClippableHolderView4.h) != null && (imageView2 = proactiveSuggestionsClippableHolderView4.i) != null && (linearLayout = proactiveSuggestionsClippableHolderView4.f) != null) {
            ProactiveSuggestionsClippableHolderView.i(imageView, imageView2, horizontalScrollView.getScrollX(), this.a.g.getWidth(), linearLayout.getWidth());
        }
        float f2 = this.b;
        ProactiveSuggestionsClippableHolderView proactiveSuggestionsClippableHolderView5 = this.a;
        if (f2 != proactiveSuggestionsClippableHolderView5.k && !proactiveSuggestionsClippableHolderView5.a.isEmpty() && (copyImageView = (proactiveSuggestionsClippableHolderView = this.a).e) != null) {
            this.b = proactiveSuggestionsClippableHolderView.k;
            copyImageView.c = gyc.b.hQ(new jiz(copyImageView, 1));
            this.a.d();
        }
        return true;
    }
}
