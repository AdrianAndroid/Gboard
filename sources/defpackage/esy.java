package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.inputmethod.libs.search.widget.VariableHeightSoftKeyboardView;

/* compiled from: PG */
/* renamed from: esy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class esy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ esy(InputConnection inputConnection, int i, int i2, int i3) {
        this.d = i3;
        this.c = inputConnection;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ esy(VariableHeightSoftKeyboardView variableHeightSoftKeyboardView, int i, int i2, int i3) {
        this.d = i3;
        this.c = variableHeightSoftKeyboardView;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ esy(etb etbVar, int i, int i2, int i3) {
        this.d = i3;
        this.c = etbVar;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ esy(hmd hmdVar, int i, int i2, int i3) {
        this.d = i3;
        this.c = hmdVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Object obj = this.c;
                int i = this.a - this.b;
                etb etbVar = (etb) obj;
                if (i == etbVar.e) {
                    return;
                }
                etbVar.e = i;
                ((ls) obj).fc();
                return;
            case 1:
                Object obj2 = this.c;
                int i2 = this.a - this.b;
                if (i2 == 0) {
                    return;
                }
                VariableHeightSoftKeyboardView variableHeightSoftKeyboardView = (VariableHeightSoftKeyboardView) obj2;
                variableHeightSoftKeyboardView.clearAnimation();
                final View view = (View) obj2;
                final int height = view.getHeight();
                final int i3 = i2 + height;
                ValueAnimator ofInt = ValueAnimator.ofInt(height, i3);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: elm
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i4 = i3;
                        int i5 = height;
                        View view2 = view;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        if (i4 < i5) {
                            view2.setPadding(view2.getPaddingLeft(), intValue - i4, view2.getPaddingRight(), view2.getPaddingBottom());
                        }
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.height = intValue;
                        view2.setLayoutParams(layoutParams);
                    }
                });
                ofInt.setDuration(300L);
                ofInt.start();
                variableHeightSoftKeyboardView.c = ofInt;
                variableHeightSoftKeyboardView.c.addListener(new eln(variableHeightSoftKeyboardView));
                return;
            case 2:
                ((hmd) this.c).a.C(this.a, this.b);
                return;
            case 3:
                ((hmd) this.c).a.M(this.a, this.b);
                return;
            case 4:
                ?? r0 = this.c;
                int i4 = this.a;
                int i5 = this.b;
                ltg ltgVar = hpr.a;
                hpw.m(r0, i4, i4);
                hpw.j(r0, i5, 0);
                return;
            case 5:
                ?? r02 = this.c;
                int i6 = this.a;
                int i7 = this.b;
                ltg ltgVar2 = hpr.a;
                hpw.m(r02, i6, i7);
                return;
            case 6:
                ?? r03 = this.c;
                int i8 = this.a;
                int i9 = this.b;
                ltg ltgVar3 = hpr.a;
                hpw.j(r03, i8, i9);
                return;
            default:
                ?? r04 = this.c;
                int i10 = this.a;
                int i11 = this.b;
                ltg ltgVar4 = hpr.a;
                hpw.a.a("setComposingRegion(<start>, <end>)");
                r04.setComposingRegion(i10, i11);
                return;
        }
    }
}
