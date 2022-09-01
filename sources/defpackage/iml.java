package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: iml  reason: default package */
/* loaded from: classes.dex */
public abstract class iml implements Animator.AnimatorListener, imn {
    private static final lug f = hin.a;
    public final Context b;
    public Context c;
    public View d;
    private final FrameLayout k;
    public final qv a = new qv();
    private final qv g = new qv();
    private final qv h = new qv();
    private final ArrayList i = new ArrayList();
    private final Rect j = new Rect();
    public int e = 0;
    private final ViewTreeObserver.OnGlobalLayoutListener l = new he(this, 5);

    public iml(Context context) {
        this.b = context;
        this.k = new FrameLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    private static imj s(imj imjVar) {
        while (imjVar != null) {
            imj imjVar2 = imjVar.c;
            if (imjVar2 == null) {
                break;
            }
            imjVar = imjVar2;
        }
        return imjVar;
    }

    private final void t(int[] iArr, int[] iArr2, int i, int i2, float f2, float f3) {
        int i3 = iArr[0];
        int i4 = iArr2[0];
        int i5 = i3 + i4;
        int i6 = i5 - ((int) (i4 * f2));
        int i7 = iArr[1];
        int i8 = iArr2[1];
        int i9 = i7 + i8;
        int i10 = i9 - ((int) (i8 * f3));
        int i11 = i9 + ((int) ((i2 - i8) * f3));
        if (i5 + ((int) ((i - i4) * f2)) > this.j.right) {
            iArr2[0] = i;
            iArr[0] = this.j.right - i;
        }
        if (i6 < this.j.left) {
            iArr2[0] = 0;
            iArr[0] = this.j.left;
        }
        if (i11 > this.j.bottom) {
            iArr2[1] = i2;
            iArr[1] = this.j.bottom - i2;
        }
        if (i10 < this.j.top) {
            iArr2[1] = 0;
            iArr[1] = this.j.top;
        }
    }

    private final void u(View view) {
        v(view, (imj) this.g.remove(view), false);
    }

    private final void v(View view, imj imjVar, boolean z) {
        while (imjVar != null) {
            Animator animator = imjVar.a;
            if (animator != null) {
                animator.removeListener(this);
                imjVar.a.end();
                this.h.remove(imjVar.a);
            }
            if (z) {
                w(imjVar.b, view);
            }
            imjVar = imjVar.c;
        }
    }

    private final void w(int i, View view) {
        int i2 = 0;
        if (i == 2) {
            view.setVisibility(8);
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            while (i2 < size) {
                ((imm) arrayList.get(i2)).c(view);
                i2++;
            }
        } else if (i != 1) {
        } else {
            k(view);
            ArrayList arrayList2 = this.i;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                ((imm) arrayList2.get(i2)).c(view);
                i2++;
            }
        }
    }

    private final void x(View view, Animator animator, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (((imk) this.a.get(view)) != null) {
            this.a.remove(view);
        }
        if (z) {
            u(view);
        }
        int i = 1;
        if (true != z2) {
            i = 2;
        }
        if (z(view)) {
            return;
        }
        y(view, animator, i);
    }

    private final void y(View view, Animator animator, int i) {
        imj imjVar = (imj) this.g.get(view);
        if (imjVar == null && animator == null) {
            w(i, view);
            return;
        }
        if (animator != null) {
            animator.addListener(this);
            this.h.put(animator, view);
        }
        imj imjVar2 = new imj(animator, i);
        if (imjVar == null) {
            this.g.put(view, imjVar2);
            animator.start();
            return;
        }
        s(imjVar).c = imjVar2;
    }

    private final boolean z(View view) {
        imj s = s((imj) this.g.get(view));
        return s != null && s.b == 1;
    }

    @Override // defpackage.imn
    @Deprecated
    public final View a(int i) {
        Context context = this.c;
        if (context == null) {
            context = this.b;
        }
        return b(context, i);
    }

    @Override // defpackage.imn
    public final View b(Context context, int i) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) this.k, false);
        inflate.setEnabled(false);
        inflate.setClickable(false);
        return inflate;
    }

    @Override // defpackage.imn
    public final void c(View view, Animator animator, boolean z) {
        x(view, animator, z, true);
    }

    @Override // defpackage.imn
    public final void d(View view, Animator animator, boolean z) {
        x(view, animator, z, false);
    }

    @Override // defpackage.imn
    public final void e(View view, View view2, int i, int i2, int i3, Animator animator) {
        if (!r(view, view2)) {
            return;
        }
        View view3 = this.d;
        if (view3 != null) {
            view.setFilterTouchesWhenObscured(view3.getFilterTouchesWhenObscured());
        }
        boolean f2 = f(view);
        view.setVisibility(0);
        u(view);
        i(view, view2, i, i2, i3);
        if (animator != null) {
            y(view, animator, 0);
        }
        if (f2) {
            return;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((imm) arrayList.get(i4)).d(view, animator);
        }
        if ((i & 512) == 0) {
            return;
        }
        if (view2 == null) {
            throw new IllegalArgumentException("anchorView cannot be null when Position.STICK_TO_ANCHOR is set");
        }
        this.a.put(view, new imk(view2, i, i2, i3));
    }

    @Override // defpackage.imn
    public boolean f(View view) {
        return view != null && view.isShown() && !z(view);
    }

    public final List g(imm immVar) {
        this.i.add(immVar);
        return h();
    }

    protected abstract List h();

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0050, code lost:
        if (r6 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x005c, code lost:
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x005d, code lost:
        r6 = r14 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0055, code lost:
        if (r6 == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0064, code lost:
        r16 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0066, code lost:
        r6 = r14 | r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x005a, code lost:
        if (r6 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0062, code lost:
        if (r6 == 0) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r21, android.view.View r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iml.i(android.view.View, android.view.View, int, int, int):void");
    }

    public void j() {
        ViewTreeObserver viewTreeObserver;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((imm) arrayList.get(i)).a();
        }
        View view = this.d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.l);
        }
        int i2 = this.g.d;
        for (int i3 = 0; i3 < i2; i3++) {
            v((View) this.g.c(i3), (imj) this.g.f(i3), true);
        }
        this.g.clear();
        this.h.clear();
        this.a.clear();
        this.d = null;
    }

    protected abstract void k(View view);

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(Context context, Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = gvv.f(context);
        rect.bottom = gvv.d(context);
    }

    public final void n(imm immVar) {
        this.i.remove(immVar);
    }

    public final void o(View view) {
        ViewTreeObserver viewTreeObserver;
        if (view != this.d) {
            j();
            this.d = view;
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(this.l);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        View view = (View) this.h.remove(animator);
        if (view == null) {
            ((luc) ((luc) f.d()).k("com/google/android/libraries/inputmethod/popupviewmanager/AbstractPopupViewManager", "onAnimationEnd", 668, "AbstractPopupViewManager.java")).t("onAnimationEnd() : Animator with no View");
            return;
        }
        imj imjVar = (imj) this.g.remove(view);
        if (imjVar == null) {
            ((luc) ((luc) f.d()).k("com/google/android/libraries/inputmethod/popupviewmanager/AbstractPopupViewManager", "onAnimationEnd", 673, "AbstractPopupViewManager.java")).t("onAnimationEnd() : View with no AnimatorInfo");
        } else if (imjVar.a != animator) {
            ((luc) ((luc) f.d()).k("com/google/android/libraries/inputmethod/popupviewmanager/AbstractPopupViewManager", "onAnimationEnd", 677, "AbstractPopupViewManager.java")).t("onAnimationEnd() : AnimatorInfo for the wrong Animator");
        } else {
            imj imjVar2 = imjVar.c;
            if (imjVar2 == null) {
                w(imjVar.b, view);
            } else if (imjVar2.a != null) {
                this.g.put(view, imjVar2);
                this.h.put(imjVar2.a, view);
                imjVar2.a.start();
            } else {
                w(imjVar2.b, view);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    protected abstract void p(View view, int[] iArr, boolean z);

    public abstract boolean q();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(View view, View view2) {
        View view3 = this.d;
        return (view3 == null || view3.getWindowToken() == null) ? false : true;
    }
}
