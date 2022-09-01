package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public final class hs extends gc {
    hq g;
    public int h;
    public hr i;
    public ho j;
    public odw k;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private boolean q;
    private opu s;
    private final SparseBooleanArray r = new SparseBooleanArray();
    final dq l = new dq(this, 2);

    public hs(Context context) {
        super(context);
    }

    @Override // defpackage.gc
    public final View a(go goVar, View view, ViewGroup viewGroup) {
        ha haVar;
        View actionView = goVar.getActionView();
        int i = 0;
        if (actionView == null || goVar.m()) {
            if (!(view instanceof ha)) {
                haVar = (ha) this.d.inflate(R.layout.f133200_resource_name_obfuscated_res_0x7f0e0002, viewGroup, false);
            } else {
                haVar = (ha) view;
            }
            haVar.f(goVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) haVar;
            actionMenuItemView.b = (ActionMenuView) this.f;
            if (this.s == null) {
                this.s = new opu(this);
            }
            actionMenuItemView.c = this.s;
            actionView = (View) haVar;
        }
        if (true == goVar.p) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof hv)) {
            actionView.setLayoutParams(ActionMenuView.n(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.gc, defpackage.gz
    public final void b(Context context, gm gmVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = gmVar;
        Resources resources = context.getResources();
        if (!this.n) {
            this.m = true;
        }
        this.o = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.h = cy.b(context);
        int i = this.o;
        if (this.m) {
            if (this.g == null) {
                this.g = new hq(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.p = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.gc, defpackage.gz
    public final void c(gm gmVar, boolean z) {
        n();
        gy gyVar = this.e;
        if (gyVar != null) {
            gyVar.a(gmVar, z);
        }
    }

    @Override // defpackage.gc, defpackage.gz
    public final boolean e() {
        ArrayList arrayList;
        int i;
        boolean z;
        gm gmVar = this.c;
        View view = null;
        if (gmVar != null) {
            arrayList = gmVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.h;
        int i3 = this.p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            go goVar = (go) arrayList.get(i4);
            if (goVar.r()) {
                i5++;
            } else if (goVar.q()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.q && goVar.p) {
                i2 = 0;
            }
            i4++;
        }
        if (this.m && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            go goVar2 = (go) arrayList.get(i8);
            if (goVar2.r()) {
                View a = a(goVar2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = goVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                goVar2.k(z);
            } else if (goVar2.q()) {
                int i11 = goVar2.b;
                boolean z3 = sparseBooleanArray.get(i11);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View a2 = a(goVar2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z4 = i3 + i9 > 0;
                }
                boolean z5 = z4;
                if (z5 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z3) {
                    sparseBooleanArray.put(i11, false);
                    for (int i12 = 0; i12 < i8; i12++) {
                        go goVar3 = (go) arrayList.get(i12);
                        if (goVar3.b == i11) {
                            if (goVar3.o()) {
                                i7++;
                            }
                            goVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i7--;
                }
                goVar2.k(z5);
            } else {
                goVar2.k(false);
                i8++;
                view = null;
                z = true;
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [gm] */
    @Override // defpackage.gc, defpackage.gz
    public final boolean f(hg hgVar) {
        boolean z = false;
        if (hgVar.hasVisibleItems()) {
            hg hgVar2 = hgVar;
            while (true) {
                gm gmVar = hgVar2.j;
                if (gmVar == this.c) {
                    break;
                }
                hgVar2 = (hg) gmVar;
            }
            go goVar = hgVar2.k;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ha) && ((ha) childAt).a() == goVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view == null) {
                return false;
            }
            go goVar2 = hgVar.k;
            int size = hgVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = hgVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            ho hoVar = new ho(this, this.b, hgVar, view);
            this.j = hoVar;
            hoVar.d(z);
            if (!this.j.h()) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            gy gyVar = this.e;
            hg hgVar3 = hgVar;
            if (gyVar != null) {
                if (hgVar == null) {
                    hgVar3 = this.c;
                }
                gyVar.b(hgVar3);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gc, defpackage.gz
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            gm gmVar = this.c;
            if (gmVar != null) {
                gmVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    go goVar = (go) f.get(i2);
                    if (goVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        go a = childAt instanceof ha ? ((ha) childAt).a() : null;
                        View a2 = a(goVar, childAt, viewGroup);
                        if (goVar != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        gm gmVar2 = this.c;
        if (gmVar2 != null) {
            gmVar2.k();
            ArrayList arrayList2 = gmVar2.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ye yeVar = ((go) arrayList2.get(i3)).o;
            }
        }
        gm gmVar3 = this.c;
        if (gmVar3 != null) {
            arrayList = gmVar3.e();
        }
        if (this.m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((go) arrayList.get(0)).p;
            } else if (size3 > 0) {
                z = true;
            }
            if (z) {
                if (this.g == null) {
                    this.g = new hq(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.g.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.g);
                    }
                    hq hqVar = this.g;
                    hv m = ActionMenuView.m();
                    m.a = true;
                    ((ActionMenuView) this.f).addView(hqVar, m);
                }
                ((ActionMenuView) this.f).b = this.m;
            }
        }
        hq hqVar2 = this.g;
        if (hqVar2 != null) {
            ViewParent parent = hqVar2.getParent();
            hb hbVar = this.f;
            if (parent == hbVar) {
                ((ViewGroup) hbVar).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).b = this.m;
    }

    public final void j(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean k() {
        hb hbVar;
        odw odwVar = this.k;
        if (odwVar == null || (hbVar = this.f) == null) {
            hr hrVar = this.i;
            if (hrVar == null) {
                return false;
            }
            hrVar.b();
            return true;
        }
        ((View) hbVar).removeCallbacks(odwVar);
        this.k = null;
        return true;
    }

    public final boolean l() {
        hr hrVar = this.i;
        return hrVar != null && hrVar.g();
    }

    public final boolean m() {
        gm gmVar;
        if (!this.m || l() || (gmVar = this.c) == null || this.f == null || this.k != null || gmVar.e().isEmpty()) {
            return false;
        }
        this.k = new odw(this, new hr(this, this.b, this.c, this.g), 1);
        ((View) this.f).post(this.k);
        return true;
    }

    public final void n() {
        k();
        q();
    }

    public final void o() {
        this.q = true;
    }

    public final void p() {
        this.m = true;
        this.n = true;
    }

    public final void q() {
        ho hoVar = this.j;
        if (hoVar != null) {
            hoVar.b();
        }
    }
}
