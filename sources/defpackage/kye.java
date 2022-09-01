package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.inputmethod.latin.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.List;

/* compiled from: PG */
/* renamed from: kye  reason: default package */
/* loaded from: classes.dex */
public class kye {
    public static final String b = "kye";
    public final ViewGroup c;
    public final Context d;
    public final kyd e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final SnackbarContentLayout l;
    private final AccessibilityManager p;
    private static final int[] n = {R.attr.f16900_resource_name_obfuscated_res_0x7f0406a0};
    static final Handler a = new Handler(Looper.getMainLooper(), new kxy());
    private final Runnable o = new kvl(this, 3);
    public final opu m = new opu(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public kye(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.c = viewGroup;
                this.l = snackbarContentLayout;
                this.d = context;
                kve.b(context);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                kyd kydVar = (kyd) from.inflate(resourceId != -1 ? R.layout.f143560_resource_name_obfuscated_res_0x7f0e0472 : R.layout.f133930_resource_name_obfuscated_res_0x7f0e0062, viewGroup, false);
                this.e = kydVar;
                kydVar.a = this;
                float f = kydVar.d;
                if (f != 1.0f) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    snackbarContentLayout2.b.setTextColor(kxc.h(kxc.f(view, R.attr.f10000_resource_name_obfuscated_res_0x7f040356), snackbarContentLayout2.b.getCurrentTextColor(), f));
                }
                ((SnackbarContentLayout) view).c = kydVar.e;
                kydVar.addView(view);
                aad.an(kydVar);
                aad.U(kydVar, 1);
                aad.T(kydVar, true);
                aad.V(kydVar, new kxz(this, 0));
                aad.M(kydVar, new kya(this));
                this.p = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public int a() {
        throw null;
    }

    public final int b() {
        int height = this.e.getHeight();
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(krt.a);
        ofFloat.addUpdateListener(new ksq(this, 2));
        return ofFloat;
    }

    public final void d() {
        e(3);
    }

    public final void e(int i) {
        kyi kyiVar;
        kyj a2 = kyj.a();
        opu opuVar = this.m;
        synchronized (a2.a) {
            if (a2.g(opuVar)) {
                kyiVar = a2.c;
            } else if (a2.h(opuVar)) {
                kyiVar = a2.d;
            }
            a2.d(kyiVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        kyj a2 = kyj.a();
        opu opuVar = this.m;
        synchronized (a2.a) {
            if (a2.g(opuVar)) {
                a2.b(a2.c);
            }
        }
    }

    public final void g() {
        kyj a2 = kyj.a();
        int a3 = a();
        opu opuVar = this.m;
        synchronized (a2.a) {
            if (a2.g(opuVar)) {
                kyi kyiVar = a2.c;
                kyiVar.a = a3;
                a2.b.removeCallbacksAndMessages(kyiVar);
                a2.b(a2.c);
                return;
            }
            if (a2.h(opuVar)) {
                a2.d.a = a3;
            } else {
                a2.d = new kyi(a3, opuVar, null, null, null, null);
            }
            kyi kyiVar2 = a2.c;
            if (kyiVar2 != null && a2.d(kyiVar2, 4)) {
                return;
            }
            a2.c = null;
            a2.c();
        }
    }

    public final void h() {
        if (j()) {
            this.e.post(new kvl(this, 5));
            return;
        }
        if (this.e.getParent() != null) {
            this.e.setVisibility(0);
        }
        f();
    }

    public final void i() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            kyd kydVar = this.e;
            if (kydVar.f != null) {
                if (kydVar.getParent() == null) {
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = this.e.f.bottom + this.f;
                marginLayoutParams.leftMargin = this.e.f.left + this.g;
                marginLayoutParams.rightMargin = this.e.f.right + this.h;
                marginLayoutParams.topMargin = this.e.f.top;
                this.e.requestLayout();
                if (Build.VERSION.SDK_INT < 29 || this.i <= 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = this.e.getLayoutParams();
                if (!(layoutParams2 instanceof tr) || !(((tr) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    return;
                }
                this.e.removeCallbacks(this.o);
                this.e.post(this.o);
                return;
            }
        }
        Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        AccessibilityManager accessibilityManager = this.p;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void k() {
        kyj a2 = kyj.a();
        opu opuVar = this.m;
        synchronized (a2.a) {
            if (a2.g(opuVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }
}
