package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: dee  reason: default package */
/* loaded from: classes.dex */
public final class dee extends LinearLayout {
    public final int a;
    public int b;
    public boolean c;
    public deg d;
    private int e;
    private int f;
    private final int g;
    private final def h;

    public dee(Context context, int i, int i2, def defVar) {
        super(context);
        this.a = i;
        this.g = i2;
        this.h = defVar;
    }

    private final void l(int i) {
        int i2 = this.g;
        if (i2 != Integer.MAX_VALUE) {
            i = i2 - 1;
        }
        int childCount = getChildCount();
        while (childCount <= i) {
            def defVar = this.h;
            deg degVar = new deg(defVar.a, defVar.b, defVar.c, defVar.d, childCount);
            addView(degVar, new LinearLayout.LayoutParams(-1, -2, 1.0f));
            int i3 = this.f;
            if (childCount == 0) {
                childCount = 0;
            }
            degVar.d = i3;
            degVar.a.b(i3, degVar.b, 0);
            childCount++;
        }
    }

    public final hln a(int i) {
        SoftKeyView softKeyView;
        deg degVar = this.d;
        if (degVar == null || (softKeyView = (SoftKeyView) degVar.getChildAt(i)) == null) {
            return null;
        }
        return (hln) softKeyView.b.c(iah.PRESS).d().e;
    }

    public final SoftKeyView b() {
        deg degVar = this.d;
        int i = degVar == null ? 0 : degVar.e;
        if (!k()) {
            return (SoftKeyView) ((deg) getChildAt(i + 1)).getChildAt(0);
        }
        return null;
    }

    public final SoftKeyView c() {
        LinearLayout linearLayout = (LinearLayout) getChildAt(0);
        if (linearLayout == null || linearLayout.getChildCount() == 0) {
            return null;
        }
        return (SoftKeyView) linearLayout.getChildAt(0);
    }

    public final SoftKeyView d() {
        deg degVar = this.d;
        int i = degVar == null ? 0 : degVar.e;
        if (i > 0) {
            deg degVar2 = (deg) getChildAt(i - 1);
            return (SoftKeyView) degVar2.getChildAt(degVar2.getChildCount() - 1);
        }
        return null;
    }

    public final SoftKeyView e(hln hlnVar) {
        int i = 0;
        while (true) {
            SoftKeyView softKeyView = null;
            if (i < getChildCount()) {
                deg degVar = (deg) getChildAt(i);
                if (degVar.d != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= degVar.getChildCount()) {
                            break;
                        }
                        SoftKeyView softKeyView2 = (SoftKeyView) degVar.getChildAt(i2);
                        ial c = softKeyView2.b.c(iah.PRESS);
                        if (c != null && c.d().e == hlnVar) {
                            softKeyView = softKeyView2;
                            break;
                        }
                        i2++;
                    }
                }
                if (softKeyView != null) {
                    return softKeyView;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final void f(List list, int i) {
        int i2;
        if (!this.c && !list.isEmpty() && this.f != 0) {
            l(this.e);
            deg degVar = (deg) getChildAt(this.e);
            int childCount = degVar.getChildCount();
            boolean z = childCount > 0;
            int size = list.size();
            int i3 = i + this.b;
            while (i3 < size) {
                hln hlnVar = (hln) list.get(i3);
                boolean z2 = i3 == size + (-1);
                this.b++;
                if (degVar.a(hlnVar, z2) == null) {
                    int i4 = this.e + 1;
                    this.e = i4;
                    int i5 = this.g;
                    if (i5 == Integer.MAX_VALUE) {
                        l(i4);
                    } else if (i4 >= i5) {
                        this.b--;
                        this.e = i4 - 1;
                        this.c = true;
                        return;
                    }
                    degVar = (deg) getChildAt(this.e);
                    degVar.a(hlnVar, z2);
                } else if (z && childCount - 1 >= 0 && degVar.getChildCount() > 0) {
                    degVar.c((SoftKeyView) degVar.getChildAt(i2), false, false);
                }
                i3++;
                z = false;
            }
            if (degVar.a.a.isEmpty()) {
                return;
            }
            degVar.a.a(false);
        }
    }

    public final void g() {
        for (int i = 0; i < getChildCount(); i++) {
            deg degVar = (deg) getChildAt(i);
            int childCount = degVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                degVar.c.k((SoftKeyView) degVar.getChildAt(i2));
            }
            degVar.removeAllViews();
        }
        this.c = false;
        this.e = 0;
        this.b = 0;
        this.d = null;
        if (this.g == Integer.MAX_VALUE) {
            removeAllViews();
        }
    }

    public final void h(int i) {
        if (i <= 0 || i == this.f) {
            return;
        }
        this.f = i;
        g();
    }

    public final void i(boolean z) {
        deg degVar = this.d;
        if (degVar != null) {
            degVar.b(z);
        }
    }

    public final boolean j() {
        deg degVar = this.d;
        return degVar == null || degVar.e == 0;
    }

    public final boolean k() {
        deg degVar = this.d;
        return degVar == null || degVar.e == this.e;
    }
}
