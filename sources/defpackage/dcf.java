package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.inputmethod.libs.framework.core.InputView;

/* compiled from: PG */
/* renamed from: dcf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dcf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dcf(CoordinatorLayout coordinatorLayout, int i) {
        this.b = i;
        this.a = coordinatorLayout;
    }

    public /* synthetic */ dcf(dcu dcuVar, int i) {
        this.b = i;
        this.a = dcuVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b == 0) {
            dcu dcuVar = (dcu) this.a;
            if (dcuVar.X || dcuVar.p != iau.SOFT) {
                InputView.b.e("onPreDraw() -> true");
                return true;
            }
            InputView.b.e("onPreDraw() -> false");
            return false;
        }
        ((CoordinatorLayout) this.a).k(0);
        return true;
    }
}
