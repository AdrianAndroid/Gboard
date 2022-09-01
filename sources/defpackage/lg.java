package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: lg  reason: default package */
/* loaded from: classes.dex */
public class lg implements hd {
    private static Method a;
    private static Method b;
    private static Method c;
    private Rect A;
    private final bph B;
    private final az C;
    private Context d;
    public kk e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    public AdapterView.OnItemSelectedListener n;
    public final Handler o;
    public boolean p;
    public PopupWindow q;
    public final az r;
    private ListAdapter s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private DataSetObserver x;
    private final lf y;
    private final Rect z;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public lg(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        if (!this.w) {
            return 0;
        }
        return this.u;
    }

    public final Drawable c() {
        return this.q.getBackground();
    }

    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.x;
        if (dataSetObserver == null) {
            this.x = new le(this);
        } else {
            ListAdapter listAdapter2 = this.s;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.s = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.x);
        }
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.setAdapter(this.s);
        }
    }

    @Override // defpackage.hd
    public final ListView eW() {
        return this.e;
    }

    public final void f(Drawable drawable) {
        this.q.setBackgroundDrawable(drawable);
    }

    public final void g(int i) {
        this.g = i;
    }

    public final void j(int i) {
        this.u = i;
        this.w = true;
    }

    @Override // defpackage.hd
    public final void k() {
        this.q.dismiss();
        this.q.setContentView(null);
        this.e = null;
        this.o.removeCallbacks(this.r);
    }

    public final int o() {
        if (!u()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }

    public kk p(Context context, boolean z) {
        return new kk(context, z);
    }

    public final void q() {
        kk kkVar = this.e;
        if (kkVar != null) {
            kkVar.a = true;
            kkVar.requestLayout();
        }
    }

    public final void r(int i) {
        Drawable background = this.q.getBackground();
        if (background == null) {
            this.f = i;
            return;
        }
        background.getPadding(this.z);
        this.f = this.z.left + this.z.right + i;
    }

    @Override // defpackage.hd
    public final void s() {
        int i;
        int a2;
        int makeMeasureSpec;
        if (this.e == null) {
            kk p = p(this.d, !this.p);
            this.e = p;
            p.setAdapter(this.s);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new nc(this, 1));
            this.e.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.n;
            if (onItemSelectedListener != null) {
                this.e.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.q.setContentView(this.e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.q.getContentView();
        }
        Drawable background = this.q.getBackground();
        int i2 = 0;
        if (background != null) {
            background.getPadding(this.z);
            i = this.z.top + this.z.bottom;
            if (!this.w) {
                this.u = -this.z.top;
            }
        } else {
            this.z.setEmpty();
            i = 0;
        }
        boolean z = this.q.getInputMethodMode() == 2;
        View view = this.l;
        int i3 = this.u;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = b;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(this.q, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = this.q.getMaxAvailableHeight(view, i3);
        } else {
            a2 = lc.a(this.q, view, i3, z);
        }
        if (this.t != -1) {
            int i4 = this.f;
            if (i4 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), Integer.MIN_VALUE);
            } else if (i4 == -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.z.left + this.z.right), 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            }
            a2 = this.e.b(makeMeasureSpec, a2);
            i = a2 > 0 ? i + this.e.getPaddingTop() + this.e.getPaddingBottom() : 0;
        }
        int i5 = a2 + i;
        boolean w = w();
        aco.c(this.q, this.v);
        if (this.q.isShowing()) {
            if (!aad.ag(this.l)) {
                return;
            }
            int i6 = this.f;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = this.l.getWidth();
            }
            int i7 = this.t;
            if (i7 == -1) {
                if (true != w) {
                    i5 = -1;
                }
                if (w) {
                    this.q.setWidth(this.f == -1 ? -1 : 0);
                    this.q.setHeight(0);
                } else {
                    PopupWindow popupWindow = this.q;
                    if (this.f == -1) {
                        i2 = -1;
                    }
                    popupWindow.setWidth(i2);
                    this.q.setHeight(-1);
                }
            } else if (i7 != -2) {
                i5 = i7;
            }
            this.q.setOutsideTouchable(true);
            this.q.update(this.l, this.g, this.u, i6 < 0 ? -1 : i6, i5 < 0 ? -1 : i5);
            return;
        }
        int i8 = this.f;
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = this.l.getWidth();
        }
        int i9 = this.t;
        if (i9 == -1) {
            i5 = -1;
        } else if (i9 != -2) {
            i5 = i9;
        }
        this.q.setWidth(i8);
        this.q.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a;
            if (method2 != null) {
                try {
                    method2.invoke(this.q, true);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            ld.b(this.q, true);
        }
        this.q.setOutsideTouchable(true);
        this.q.setTouchInterceptor(this.B);
        if (this.i) {
            aco.b(this.q, this.h);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = c;
            if (method3 != null) {
                try {
                    method3.invoke(this.q, this.A);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            ld.a(this.q, this.A);
        }
        acn.a(this.q, this.l, this.g, this.u, this.j);
        this.e.setSelection(-1);
        if (!this.p || this.e.isInTouchMode()) {
            q();
        }
        if (this.p) {
            return;
        }
        this.o.post(this.C);
    }

    public final void t(Rect rect) {
        this.A = rect != null ? new Rect(rect) : null;
    }

    @Override // defpackage.hd
    public final boolean u() {
        return this.q.isShowing();
    }

    public final void v(PopupWindow.OnDismissListener onDismissListener) {
        this.q.setOnDismissListener(onDismissListener);
    }

    public final boolean w() {
        return this.q.getInputMethodMode() == 2;
    }

    public final void x() {
        this.q.setInputMethodMode(2);
    }

    public final void y() {
        this.p = true;
        this.q.setFocusable(true);
    }

    public lg(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.t = -2;
        this.f = -2;
        this.v = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.r = new az(this, 15);
        this.B = new bph(this, 1);
        this.y = new lf(this);
        this.C = new az(this, 14);
        this.z = new Rect();
        this.d = context;
        this.o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ei.o, i, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        obtainStyledAttributes.recycle();
        ii iiVar = new ii(context, attributeSet, i);
        this.q = iiVar;
        iiVar.setInputMethodMode(1);
    }
}
