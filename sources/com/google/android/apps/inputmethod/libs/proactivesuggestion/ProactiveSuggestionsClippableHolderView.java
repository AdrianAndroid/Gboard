package com.google.android.apps.inputmethod.libs.proactivesuggestion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.inline.InlineContentView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.CopyImageView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProactiveSuggestionsClippableHolderView extends FrameLayout implements dyh, dye {
    private static final ltg p = ltg.j("com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsClippableHolderView");
    public final qq a;
    public final qq b;
    final ViewGroup.OnHierarchyChangeListener c;
    public SurfaceView d;
    public CopyImageView e;
    public LinearLayout f;
    public HorizontalScrollView g;
    public ImageView h;
    public ImageView i;
    public final View.OnScrollChangeListener j;
    public float k;
    public AtomicBoolean l;
    AtomicBoolean m;
    public final AtomicBoolean n;
    public boolean o;
    private final dyi q;
    private final int r;
    private final AtomicBoolean s;
    private final ViewTreeObserver.OnPreDrawListener t;

    public ProactiveSuggestionsClippableHolderView(Context context) {
        this(context, null);
    }

    public static void i(View view, View view2, int i, int i2, int i3) {
        int i4 = 0;
        view.setVisibility(i > 0 ? 0 : 4);
        if (i + i2 >= i3) {
            i4 = 4;
        }
        view2.setVisibility(i4);
    }

    private final int l(llp llpVar) {
        HorizontalScrollView horizontalScrollView;
        llpVar.size();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.f67580_resource_name_obfuscated_res_0x7f0b0876);
        this.f = linearLayout;
        linearLayout.setPadding(0, 0, 0, 0);
        this.g = (HorizontalScrollView) findViewById(R.id.f67610_resource_name_obfuscated_res_0x7f0b0879);
        this.h = (ImageView) findViewById(R.id.f67590_resource_name_obfuscated_res_0x7f0b0877);
        this.i = (ImageView) findViewById(R.id.f67600_resource_name_obfuscated_res_0x7f0b0878);
        LinearLayout linearLayout2 = this.f;
        if (linearLayout2 == null) {
            return 0;
        }
        linearLayout2.removeAllViews();
        this.m.set(false);
        int size = llpVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = i + 1;
            if (((View) llpVar.get(i)) instanceof InlineContentView) {
                this.m.set(true);
                break;
            }
            i = i2;
        }
        if (this.m.get()) {
            if (this.d != null) {
                h();
                if (this.n.get()) {
                    View view = this.d;
                    if (view != null) {
                        removeView(view);
                    }
                }
            }
            this.o = false;
            SurfaceView surfaceView = new SurfaceView(getContext());
            surfaceView.setZOrderOnTop(true);
            surfaceView.getHolder().setFormat(-2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.setMarginStart(this.r);
            layoutParams.setMarginEnd(this.r);
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.getHolder().addCallback(new dyl(this, surfaceView));
            addView(surfaceView);
            this.d = surfaceView;
            this.e = (CopyImageView) findViewById(R.id.f67620_resource_name_obfuscated_res_0x7f0b087a);
        }
        int size2 = llpVar.size();
        for (int i3 = 0; i3 < size2; i3++) {
            View view2 = (View) llpVar.get(i3);
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            this.f.addView(view2);
        }
        dvd dvdVar = new dvd(this, 13);
        if (!this.b.isEmpty()) {
            if (llpVar.isEmpty() || !this.m.get()) {
                dvdVar.run();
            } else {
                gyc.b.execute(dvdVar);
            }
        }
        if (this.a.isEmpty() && !this.m.get()) {
            f();
        }
        if (!this.m.get()) {
            g();
        } else {
            gyc.b.execute(new dvc(this, llpVar, 2));
        }
        HorizontalScrollView horizontalScrollView2 = this.g;
        if (horizontalScrollView2 != null && horizontalScrollView2.getLayoutDirection() == 1) {
            kki.j(new dvd(this, 14));
        }
        LinearLayout linearLayout3 = this.f;
        if (linearLayout3 != null && linearLayout3.getChildCount() > 0 && (horizontalScrollView = this.g) != null && horizontalScrollView.getWidth() == 0) {
            kki.j(new dvd(this, 15));
        }
        return this.f.getChildCount();
    }

    private final void m(View view, SurfaceView surfaceView) {
        SurfaceView surfaceView2;
        if (view == null || view == (surfaceView2 = this.d)) {
            return;
        }
        if (view instanceof InlineContentView) {
            float f = 0.0f;
            float height = surfaceView2 == null ? 0.0f : surfaceView2.getHeight();
            float height2 = view.getHeight();
            if (height != 0.0f && height2 != 0.0f) {
                f = 0.5f * (height - height2);
            }
            view.setTranslationY(f);
            InlineContentView inlineContentView = (InlineContentView) view;
            if (surfaceView != null) {
                if (!this.a.add(inlineContentView)) {
                    return;
                }
                inlineContentView.setSurfaceControlCallback(new dym(surfaceView, 0));
                inlineContentView.setZOrderedOnTop(this.l.get());
            } else if (this.a.remove(inlineContentView)) {
                SurfaceControl surfaceControl = inlineContentView.getSurfaceControl();
                if (surfaceControl != null && surfaceControl.isValid()) {
                    new SurfaceControl.Transaction().reparent(surfaceControl, null).apply();
                }
                if (!this.a.isEmpty() || this.m.get()) {
                    return;
                }
                f();
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.setOnHierarchyChangeListener(this.c);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m(viewGroup.getChildAt(i), surfaceView);
            }
        }
    }

    @Override // defpackage.dyh
    public final View a() {
        return this.d;
    }

    @Override // defpackage.dye
    public final int b(iou iouVar) {
        llp llpVar = iouVar.b;
        if (llpVar == null || llpVar.isEmpty()) {
            return 0;
        }
        return l(llpVar);
    }

    @Override // defpackage.dye
    public final void c() {
        l(llp.q());
    }

    public final void d() {
        if (this.d == null) {
            return;
        }
        this.s.set(true);
        Choreographer.getInstance().postFrameCallback(new cgh(this, 2));
    }

    @Override // defpackage.dyh
    public final void e(boolean z) {
        boolean z2 = !z;
        if (this.l.get() == z2) {
            return;
        }
        int i = this.a.b;
        this.l.set(z2);
        SurfaceView surfaceView = this.d;
        if (surfaceView == null) {
            return;
        }
        surfaceView.setZOrderOnTop(z2);
        if (!z2) {
            d();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InlineContentView) it.next()).setZOrderedOnTop(z2);
        }
    }

    public final void f() {
        if (this.d == null) {
            return;
        }
        this.o = true;
    }

    public final void g() {
        ImageView imageView;
        if (this.g == null || (imageView = this.h) == null || this.i == null) {
            return;
        }
        imageView.setVisibility(4);
        this.i.setVisibility(4);
        this.g.setOnScrollChangeListener(null);
    }

    public final void h() {
        SurfaceView surfaceView = this.d;
        if (surfaceView == null) {
            return;
        }
        this.o = false;
        surfaceView.setVisibility(0);
        this.d.setZOrderOnTop(this.l.get());
    }

    public final void j(View view, SurfaceView surfaceView) {
        this.k = jdy.a(this);
        m(view, surfaceView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r1 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void k() {
        /*
            r9 = this;
            android.view.SurfaceView r0 = r9.d
            if (r0 == 0) goto L5c
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.s
            boolean r0 = r0.get()
            if (r0 != 0) goto Ld
            goto L5c
        Ld:
            android.view.SurfaceView r0 = r9.d
            android.view.SurfaceHolder r0 = r0.getHolder()
            android.view.Surface r0 = r0.getSurface()
            if (r0 == 0) goto L56
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L56
            r1 = 0
            android.graphics.Canvas r1 = r0.lockCanvas(r1)     // Catch: java.lang.Throwable -> L2e android.view.Surface.OutOfResourcesException -> L36 java.lang.IllegalArgumentException -> L38
            if (r1 == 0) goto L30
            com.google.android.libraries.inputmethod.widgets.CopyImageView r2 = r9.e     // Catch: java.lang.Throwable -> L2e android.view.Surface.OutOfResourcesException -> L36 java.lang.IllegalArgumentException -> L38
            if (r2 == 0) goto L30
            r2.onDraw(r1)     // Catch: java.lang.Throwable -> L2e android.view.Surface.OutOfResourcesException -> L36 java.lang.IllegalArgumentException -> L38
            goto L30
        L2e:
            r2 = move-exception
            goto L50
        L30:
            if (r1 == 0) goto L56
        L32:
            r0.unlockCanvasAndPost(r1)
            goto L56
        L36:
            r2 = move-exception
            goto L39
        L38:
            r2 = move-exception
        L39:
            r8 = r2
            ltg r2 = com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView.p     // Catch: java.lang.Throwable -> L2e
            ltv r2 = r2.d()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "ProactiveSuggestions failed to lock surface."
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/proactivesuggestion/ProactiveSuggestionsClippableHolderView"
            java.lang.String r5 = "lambda$drawBackgroundOverlayIfReady$4"
            r6 = 466(0x1d2, float:6.53E-43)
            java.lang.String r7 = "ProactiveSuggestionsClippableHolderView.java"
            defpackage.f.h(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L56
            goto L32
        L50:
            if (r1 == 0) goto L55
            r0.unlockCanvasAndPost(r1)
        L55:
            throw r2
        L56:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.s
            r1 = 0
            r0.set(r1)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.proactivesuggestion.ProactiveSuggestionsClippableHolderView.k():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l.set(true);
        getViewTreeObserver().addOnPreDrawListener(this.t);
        this.q.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.t);
        this.q.f();
    }

    public ProactiveSuggestionsClippableHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProactiveSuggestionsClippableHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new qq();
        this.b = new qq();
        this.c = new coz(this, 2);
        this.j = new dyj(this);
        this.l = new AtomicBoolean(true);
        this.m = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.t = new dyk(this);
        setWillNotDraw(false);
        this.q = new dyi(this);
        this.r = getContext().getResources().getDimensionPixelSize(R.dimen.f41540_resource_name_obfuscated_res_0x7f0705f4);
    }
}
