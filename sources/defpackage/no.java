package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: no  reason: default package */
/* loaded from: classes2.dex */
public final class no {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public no(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final nk t(View view) {
        return (nk) view.getLayoutParams();
    }

    public final int a() {
        return this.f.e ? s(this.a.size() - 1, -1) : s(0, this.a.size());
    }

    public final int b() {
        return this.f.e ? s(0, this.a.size()) : s(this.a.size() - 1, -1);
    }

    final int c(int i, int i2, boolean z, boolean z2, boolean z3) {
        int j = this.f.c.j();
        int f = this.f.c.f();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.a.get(i);
            int d = this.f.c.d(view);
            int a = this.f.c.a(view);
            boolean z4 = false;
            boolean z5 = !z3 ? d < f : d <= f;
            if (!z3 ? a > j : a >= j) {
                z4 = true;
            }
            if (z5 && z4) {
                if (z) {
                    if (z2) {
                        if (d >= j && a <= f) {
                            return StaggeredGridLayoutManager.bo(view);
                        }
                    }
                } else if (z2) {
                    return StaggeredGridLayoutManager.bo(view);
                }
                if (d < j || a > f) {
                    return StaggeredGridLayoutManager.bo(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    public final int d(int i, int i2, boolean z) {
        return c(i, i2, z, true, false);
    }

    public final int e() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        k();
        return this.c;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        k();
        return this.c;
    }

    public final int g() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        l();
        return this.b;
    }

    public final int h(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        l();
        return this.b;
    }

    public final View i(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.a.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) this.a.get(i3);
                if ((this.f.e && StaggeredGridLayoutManager.bo(view2) <= i) || ((!this.f.e && StaggeredGridLayoutManager.bo(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.a.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) this.a.get(size2);
                if ((this.f.e && StaggeredGridLayoutManager.bo(view3) >= i) || ((!this.f.e && StaggeredGridLayoutManager.bo(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final void j(View view) {
        nk t = t(view);
        t.a = this;
        this.a.add(view);
        this.c = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (t.c() || t.b()) {
            this.d += this.f.c.b(view);
        }
    }

    final void k() {
        ArrayList arrayList;
        nl a;
        View view = (View) this.a.get(arrayList.size() - 1);
        nk t = t(view);
        this.c = this.f.c.a(view);
        if (!t.b || (a = this.f.i.a(t.a())) == null || a.b != 1) {
            return;
        }
        this.c += a.a(this.e);
    }

    final void l() {
        nl a;
        View view = (View) this.a.get(0);
        nk t = t(view);
        this.b = this.f.c.d(view);
        if (!t.b || (a = this.f.i.a(t.a())) == null || a.b != -1) {
            return;
        }
        this.b -= a.a(this.e);
    }

    public final void m() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void n(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void o() {
        int size = this.a.size();
        View view = (View) this.a.remove(size - 1);
        nk t = t(view);
        t.a = null;
        if (t.c() || t.b()) {
            this.d -= this.f.c.b(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void p() {
        View view = (View) this.a.remove(0);
        nk t = t(view);
        t.a = null;
        if (this.a.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (t.c() || t.b()) {
            this.d -= this.f.c.b(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void q(View view) {
        nk t = t(view);
        t.a = this;
        this.a.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (t.c() || t.b()) {
            this.d += this.f.c.b(view);
        }
    }

    public final void r(int i) {
        this.b = i;
        this.c = i;
    }

    final int s(int i, int i2) {
        return c(i, i2, false, false, true);
    }
}
