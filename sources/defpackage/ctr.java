package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.inputmethod.libs.expression.navbar.FixedHeightNavigationRow;
import j$.time.Duration;

/* compiled from: PG */
/* renamed from: ctr  reason: default package */
/* loaded from: classes.dex */
public final class ctr extends tp {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/expression/navbar/HideFooterOnScrollBehavior");
    private static final long c = Duration.ofSeconds(3).toMillis();
    public ViewPropertyAnimator a;
    private final long e;
    private int h;
    private hiw i;
    private int f = 0;
    private int g = 2;
    private final idk d = ieh.j();

    public ctr(Context context) {
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final void u(FixedHeightNavigationRow fixedHeightNavigationRow, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = fixedHeightNavigationRow.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ctq(this));
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        hiw hiwVar;
        FixedHeightNavigationRow fixedHeightNavigationRow = (FixedHeightNavigationRow) view;
        if (i != this.h || (hiwVar = this.i) == null) {
            return;
        }
        hiwVar.b(c);
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        FixedHeightNavigationRow fixedHeightNavigationRow = (FixedHeightNavigationRow) view;
        int measuredHeight = fixedHeightNavigationRow.getMeasuredHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fixedHeightNavigationRow.getLayoutParams();
        if (marginLayoutParams == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/expression/navbar/HideFooterOnScrollBehavior", "getBottomMargin", 78, "HideFooterOnScrollBehavior.java")).t("getLayoutParams unexpectedly returned null");
            i2 = 0;
        } else {
            i2 = marginLayoutParams.bottomMargin;
        }
        this.f = measuredHeight + i2;
        if (this.i == null) {
            this.i = new hiw(new bwt(this, fixedHeightNavigationRow, 15));
        }
        return false;
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        FixedHeightNavigationRow fixedHeightNavigationRow = (FixedHeightNavigationRow) view;
        this.h = i2;
        hiw hiwVar = this.i;
        if (hiwVar != null) {
            hiwVar.a();
        }
        return i == 2;
    }

    @Override // defpackage.tp
    public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        FixedHeightNavigationRow fixedHeightNavigationRow = (FixedHeightNavigationRow) view;
        long j = i;
        long j2 = this.e;
        if (j <= j2) {
            if (j >= (-j2)) {
                return;
            }
            t(fixedHeightNavigationRow, 225L);
        } else if (this.g == 1) {
        } else {
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                fixedHeightNavigationRow.clearAnimation();
            }
            this.g = 1;
            u(fixedHeightNavigationRow, this.f, 175L, new afh());
            this.d.e(ctd.EXPRESSION_NAVIGATION_ROW_HIDDEN, new Object[0]);
        }
    }

    public final void t(FixedHeightNavigationRow fixedHeightNavigationRow, long j) {
        if (this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            fixedHeightNavigationRow.clearAnimation();
        }
        this.g = 2;
        u(fixedHeightNavigationRow, 0, j, new afj());
        if (j <= 0) {
            return;
        }
        this.d.e(ctd.EXPRESSION_NAVIGATION_ROW_SHOWN, new Object[0]);
    }
}
