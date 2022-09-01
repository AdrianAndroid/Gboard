package com.google.android.apps.inputmethod.latin.keyboard;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinHandwritingPrimeKeyboard extends LatinPrimeKeyboard implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final ltg i = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/LatinHandwritingPrimeKeyboard");
    private Boolean F;
    private HandwritingOverlayView G;
    private Object H;
    public bpi a;
    public bpl b;
    private final boolean j;
    private final Runnable k = new att(this, 19);
    private View l;
    private AppCompatTextView m;
    private AnimatorSet n;
    private AnimatorSet o;
    private boolean p;
    private boolean q;
    private boolean r;

    public LatinHandwritingPrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        boolean z = true;
        boolean z2 = ibmVar.b(null, R.id.f55660_resource_name_obfuscated_res_0x7f0b0223) != null;
        this.j = z2;
        this.p = (this.v.Y() || !this.t.al(H(this.x), false, false) || !z2) ? false : z;
        if (!z2 || !jam.o()) {
            return;
        }
        this.b = new bpl(ibmVar.b);
    }

    private static String H(iav iavVar) {
        return String.format(Locale.US, "fullscreen_handwriting_%s", iavVar.e.n);
    }

    private final void I() {
        ibm ibmVar;
        if (!this.p || this.a != null || (ibmVar = this.w) == null) {
            return;
        }
        Context context = this.u;
        hsz hszVar = this.v;
        bpi bpiVar = null;
        icf b = ibmVar.b(null, R.id.f55660_resource_name_obfuscated_res_0x7f0b0223);
        if (b != null) {
            bpiVar = new bpi(context, hszVar, b, ibmVar, this);
        }
        this.a = bpiVar;
        bpiVar.i = X(ice.BODY);
        this.a.h = X(ice.HEADER);
    }

    private final void K() {
        if (this.p) {
            I();
            bpi bpiVar = this.a;
            if (bpiVar == null || bpiVar.k()) {
                return;
            }
            this.a.l(-2);
            this.a.i();
            L();
        }
    }

    private final void L() {
        this.v.z(hfd.d(new iay(true != this.q ? -10094 : -10093, null, null)));
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        bpi bpiVar;
        bpi bpiVar2;
        bpi bpiVar3;
        View view;
        bpi bpiVar4;
        View view2;
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        int i2 = f.c;
        if (i2 == -10034) {
            AnimatorSet animatorSet = this.n;
            if (animatorSet != null && !animatorSet.isRunning()) {
                this.n.start();
            }
            if (this.p && (bpiVar4 = this.a) != null && bpiVar4.k()) {
                bpi bpiVar5 = this.a;
                bpiVar5.l(-3);
                Animator animator = bpiVar5.d;
                if (animator != null && (view2 = bpiVar5.f) != null) {
                    animator.setTarget(view2);
                    bpiVar5.d.start();
                }
                Animator animator2 = bpiVar5.e;
                if (animator2 != null) {
                    animator2.cancel();
                }
            }
        } else if (i2 == -10035) {
            AnimatorSet animatorSet2 = this.o;
            if (animatorSet2 != null && !animatorSet2.isRunning()) {
                this.o.start();
            }
            if (this.p && (bpiVar3 = this.a) != null && bpiVar3.k()) {
                bpi bpiVar6 = this.a;
                bpiVar6.l(-2);
                Animator animator3 = bpiVar6.e;
                if (animator3 != null && (view = bpiVar6.f) != null) {
                    animator3.setTarget(view);
                    bpiVar6.e.start();
                }
                Animator animator4 = bpiVar6.d;
                if (animator4 != null) {
                    animator4.cancel();
                }
            }
            return false;
        } else if (i2 == -10037) {
            if (!this.j) {
                ((ltd) ((ltd) i.d()).k("com/google/android/apps/inputmethod/latin/keyboard/LatinHandwritingPrimeKeyboard", "onToggleFullScreen", 354, "LatinHandwritingPrimeKeyboard.java")).t("full screen handwriting is not supported.");
            } else {
                bpl bplVar = this.b;
                if (bplVar == null || !bplVar.b.isRunning()) {
                    Runnable runnable = null;
                    B(null);
                    z(false);
                    if (this.p) {
                        this.p = false;
                        if (this.b == null) {
                            this.k.run();
                        }
                        View X = X(ice.BODY);
                        if (X != null) {
                            X.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                        aj(ice.BODY, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b);
                    } else {
                        this.p = true;
                        K();
                        aj(ice.BODY, R.id.f55650_resource_name_obfuscated_res_0x7f0b0222);
                        A(this.H);
                        View X2 = X(ice.BODY);
                        if (X2 != null) {
                            X2.getViewTreeObserver().addOnGlobalLayoutListener(this);
                        }
                    }
                    L();
                    bpl bplVar2 = this.b;
                    if (bplVar2 != null && (bpiVar2 = this.a) != null) {
                        bplVar2.g = bpiVar2;
                        boolean z = this.p;
                        View X3 = X(ice.BODY);
                        if (!this.p) {
                            runnable = this.k;
                        }
                        bplVar2.a = z;
                        bplVar2.e = X3.getRootView().findViewById(R.id.f57510_resource_name_obfuscated_res_0x7f0b0427);
                        bplVar2.f = (View) X3.getParent();
                        ViewGroup.LayoutParams layoutParams = bplVar2.f.getLayoutParams();
                        layoutParams.height = bplVar2.f.getHeight();
                        bplVar2.f.setLayoutParams(layoutParams);
                        bplVar2.i = runnable;
                        bplVar2.j = true;
                    }
                    this.t.f(H(this.x), this.p);
                } else {
                    ((ltd) ((ltd) i.b()).k("com/google/android/apps/inputmethod/latin/keyboard/LatinHandwritingPrimeKeyboard", "onToggleFullScreen", 358, "LatinHandwritingPrimeKeyboard.java")).t("already switching full screening keyboard.");
                }
            }
            return false;
        } else if (i2 == -10038) {
            if (this.p && (bpiVar = this.a) != null) {
                bpiVar.j = false;
                bpiVar.l.removeCallbacks(bpiVar.k);
                bpiVar.l.postDelayed(bpiVar.k, 50L);
                bpiVar.c.showAtLocation(bpiVar.i, 0, 0, 0);
                bpiVar.a.f();
            }
        } else if (i2 == -10040) {
            Object obj = f.e;
            if (!(obj instanceof Boolean)) {
                ((ltd) i.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinHandwritingPrimeKeyboard", "consumeEvent", 341, "LatinHandwritingPrimeKeyboard.java")).t("Bad keyData with HANDWRITING_RECOGNIZER_STATE");
                return false;
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.q = booleanValue;
            this.F = Boolean.valueOf(booleanValue);
            f();
            L();
            return true;
        }
        return super.c(hfdVar);
    }

    final void f() {
        Boolean bool = this.F;
        if (bool != null) {
            String string = this.u.getString(true != bool.booleanValue() ? R.string.handwrite_not_ready : R.string.handwrite_here);
            AppCompatTextView appCompatTextView = this.m;
            if (appCompatTextView == null || string == null) {
                return;
            }
            appCompatTextView.setText(string);
            this.G.setContentDescription(string);
        }
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.HEADER) {
            bpi bpiVar = this.a;
            if (bpiVar != null) {
                bpiVar.h = null;
            }
        } else if (icfVar.b == ice.BODY) {
            this.G = null;
            this.l = null;
            this.m = null;
            bpi bpiVar2 = this.a;
            if (bpiVar2 != null) {
                bpiVar2.i = null;
            }
        }
        bpl bplVar = this.b;
        if (bplVar != null) {
            bplVar.b();
            bplVar.c = null;
            bplVar.d = null;
            bplVar.e = null;
            bplVar.f = null;
            bplVar.g = null;
            bplVar.h = null;
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    protected final int fv(ice iceVar) {
        return (iceVar != ice.BODY || this.a == null || !this.p) ? R.id.f53790_resource_name_obfuscated_res_0x7f0b014b : R.id.f55650_resource_name_obfuscated_res_0x7f0b0222;
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void fw(ice iceVar, View view) {
        super.fw(iceVar, view);
        if (view == X(ice.BODY)) {
            K();
            this.r = true;
        }
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        bpi bpiVar;
        View view;
        View view2;
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b != ice.BODY) {
            if (icfVar.b != ice.HEADER || (bpiVar = this.a) == null) {
                return;
            }
            bpiVar.h = softKeyboardView;
            return;
        }
        this.G = (HandwritingOverlayView) softKeyboardView.findViewById(R.id.f56080_resource_name_obfuscated_res_0x7f0b0253);
        this.l = softKeyboardView.findViewById(R.id.f56090_resource_name_obfuscated_res_0x7f0b0254);
        this.m = (AppCompatTextView) softKeyboardView.findViewById(R.id.f56100_resource_name_obfuscated_res_0x7f0b0255);
        if (this.l != null) {
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(this.u, R.animator.f900_resource_name_obfuscated_res_0x7f020043);
            this.o = animatorSet;
            if (animatorSet != null && (view2 = this.l) != null) {
                animatorSet.setTarget(view2);
            }
            AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(this.u, R.animator.f670_resource_name_obfuscated_res_0x7f020025);
            this.n = animatorSet2;
            if (animatorSet2 != null && (view = this.l) != null) {
                animatorSet2.setTarget(view);
            }
        } else {
            this.o = null;
            this.n = null;
        }
        bpi bpiVar2 = this.a;
        if (bpiVar2 != null) {
            bpiVar2.i = softKeyboardView;
        }
        K();
        f();
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        mbi mbiVar;
        View X;
        AnimatorSet animatorSet;
        super.g(editorInfo, obj);
        this.H = obj;
        boolean al = this.v.Y() ? false : this.t.al(H(this.x), false, false);
        this.p = al;
        if (al) {
            aj(ice.BODY, R.id.f55650_resource_name_obfuscated_res_0x7f0b0222);
            A(obj);
            mbiVar = mbi.OPEN_FULL_SCREEN;
        } else {
            aj(ice.BODY, R.id.f53790_resource_name_obfuscated_res_0x7f0b014b);
            mbiVar = mbi.OPEN_HALF_SCREEN;
        }
        this.v.hO().e(dgt.HANDWRITING_OPERATION, mbiVar, this.x.e, -1);
        if (this.l != null && (animatorSet = this.o) != null) {
            animatorSet.start();
        }
        bpl bplVar = this.b;
        if (bplVar != null) {
            this.v.w(ice.BODY, bplVar);
        }
        HandwritingOverlayView handwritingOverlayView = this.G;
        if (handwritingOverlayView != null) {
            handwritingOverlayView.b();
        }
        I();
        if (!this.p || (X = X(ice.BODY)) == null) {
            return;
        }
        X.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        this.k.run();
        if (this.b != null) {
            this.v.I(ice.BODY, this.b);
        }
        View X = X(ice.BODY);
        if (X != null) {
            X.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        super.h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View X = X(ice.BODY);
        if (X == null || this.r == X.isShown()) {
            return;
        }
        if (!this.r || X.isShown()) {
            if (this.r || !X.isShown()) {
                return;
            }
            this.r = true;
            K();
            return;
        }
        this.r = false;
        this.k.run();
    }
}
