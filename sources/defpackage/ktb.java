package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* renamed from: ktb  reason: default package */
/* loaded from: classes.dex */
public final class ktb extends dt {
    public BottomSheetBehavior a;
    public FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kta f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private final boolean i;
    private final ksu j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ktb(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130969231(0x7f04028f, float:1.7547138E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132084326(0x7f150666, float:1.980882E38)
        L1b:
            r3.<init>(r4, r5)
            r3.c = r0
            r3.d = r0
            ksz r4 = new ksz
            r4.<init>(r3)
            r3.j = r4
            r3.f()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969574(0x7f0403e6, float:1.7547834E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktb.<init>(android.content.Context, int):void");
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(R.id.f53610_resource_name_obfuscated_res_0x7f0b0132);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.i) {
            aad.V(this.b, new kry(this, 2));
        }
        this.b.removeAllViews();
        if (layoutParams == null) {
            this.b.addView(view);
        } else {
            this.b.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.f130030_resource_name_obfuscated_res_0x7f0b21b2).setOnClickListener(new hwd(this, 6));
        aad.M(this.b, new ksy(this));
        this.b.setOnTouchListener(new cnn(5));
        return this.g;
    }

    private final void c() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.f133920_resource_name_obfuscated_res_0x7f0e0061, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(R.id.f53610_resource_name_obfuscated_res_0x7f0b0132);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(R.id.f53840_resource_name_obfuscated_res_0x7f0b0151);
            this.b = frameLayout2;
            BottomSheetBehavior v = BottomSheetBehavior.v(frameLayout2);
            this.a = v;
            v.w(this.j);
            this.a.z(this.c);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.a == null) {
            c();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.i && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            tw.d(window, !z);
            kta ktaVar = this.f;
            if (ktaVar == null) {
                return;
            }
            ktaVar.d(window);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        kta ktaVar = this.f;
        if (ktaVar != null) {
            ktaVar.d(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ox, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.w != 5) {
            return;
        }
        bottomSheetBehavior.B(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.c != z) {
            this.c = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior == null) {
                return;
            }
            bottomSheetBehavior.z(z);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.c) {
            this.c = true;
        }
        this.d = z;
        this.e = true;
    }

    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
