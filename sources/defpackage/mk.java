package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* renamed from: mk  reason: default package */
/* loaded from: classes.dex */
public class mk {
    private final mi a;
    public int b;
    public RecyclerView c;
    public ly d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public mk(Context context) {
        this.b = -1;
        this.a = new mi();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int j(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        }
        return i3 - i;
    }

    private static int k(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        float abs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(abs * this.p);
    }

    protected void c(View view, mi miVar) {
        int i;
        int i2;
        PointF pointF = this.k;
        int i3 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i = 0;
        } else {
            i = this.k.x > 0.0f ? 1 : -1;
        }
        ly lyVar = this.d;
        if (lyVar == null || !lyVar.ae()) {
            i2 = 0;
        } else {
            lz lzVar = (lz) view.getLayoutParams();
            i2 = j(ly.bz(view) - lzVar.leftMargin, ly.bA(view) + lzVar.rightMargin, lyVar.az(), lyVar.C - lyVar.aA(), i);
        }
        int i4 = i();
        ly lyVar2 = this.d;
        if (lyVar2 != null && lyVar2.af()) {
            lz lzVar2 = (lz) view.getLayoutParams();
            i3 = j(ly.bB(view) - lzVar2.topMargin, ly.by(view) + lzVar2.bottomMargin, lyVar2.aB(), lyVar2.D - lyVar2.ay(), i4);
        }
        int h = h((int) Math.sqrt((i2 * i2) + (i3 * i3)));
        if (h > 0) {
            miVar.b(-i2, -i3, h, this.j);
        }
    }

    public final int d(View view) {
        return this.c.d(view);
    }

    public final PointF e(int i) {
        ly lyVar = this.d;
        if (lyVar instanceof mj) {
            return ((mj) lyVar).Q(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(mj.class.getCanonicalName())));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, int i2) {
        PointF e;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            g();
        }
        if (this.e && this.g == null && this.d != null && (e = e(this.b)) != null && (e.x != 0.0f || e.y != 0.0f)) {
            recyclerView.X((int) Math.signum(e.x), (int) Math.signum(e.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (d(view) == this.b) {
                View view2 = this.g;
                ml mlVar = recyclerView.J;
                c(view2, this.a);
                this.a.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            ml mlVar2 = recyclerView.J;
            mi miVar = this.a;
            if (this.c.m.as() == 0) {
                g();
            } else {
                int k = k(this.l, i);
                this.l = k;
                int k2 = k(this.m, i2);
                this.m = k2;
                if (k == 0 && k2 == 0) {
                    PointF e2 = e(this.b);
                    if (e2 == null || (e2.x == 0.0f && e2.y == 0.0f)) {
                        miVar.a = this.b;
                        g();
                    } else {
                        float sqrt = (float) Math.sqrt((e2.x * e2.x) + (e2.y * e2.y));
                        e2.x /= sqrt;
                        e2.y /= sqrt;
                        this.k = e2;
                        this.l = (int) (e2.x * 10000.0f);
                        this.m = (int) (e2.y * 10000.0f);
                        miVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    }
                }
            }
            mi miVar2 = this.a;
            int i3 = miVar2.a;
            miVar2.a(recyclerView);
            if (i3 < 0 || !this.f) {
                return;
            }
            this.e = true;
            recyclerView.G.b();
        }
    }

    public final void g() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.m = 0;
        this.l = 0;
        this.k = null;
        this.c.J.a = -1;
        this.g = null;
        this.b = -1;
        this.e = false;
        ly lyVar = this.d;
        if (lyVar.t == this) {
            lyVar.t = null;
        }
        this.d = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int h(int i) {
        double b = b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    protected int i() {
        PointF pointF = this.k;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        return this.k.y <= 0.0f ? -1 : 1;
    }

    public mk() {
        this.b = -1;
        this.a = new mi();
    }
}
