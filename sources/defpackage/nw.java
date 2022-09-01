package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: nw  reason: default package */
/* loaded from: classes2.dex */
public final class nw implements gz {
    gm a;
    public go b;
    final /* synthetic */ Toolbar c;

    public nw(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gz
    public final void b(Context context, gm gmVar) {
        go goVar;
        gm gmVar2 = this.a;
        if (gmVar2 != null && (goVar = this.b) != null) {
            gmVar2.t(goVar);
        }
        this.a = gmVar;
    }

    @Override // defpackage.gz
    public final void c(gm gmVar, boolean z) {
    }

    @Override // defpackage.gz
    public final void d(gy gyVar) {
        throw null;
    }

    @Override // defpackage.gz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gz
    public final boolean f(hg hgVar) {
        return false;
    }

    @Override // defpackage.gz
    public final boolean g(go goVar) {
        View view = this.c.h;
        if (view instanceof fn) {
            ((fn) view).a();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.h);
        Toolbar toolbar2 = this.c;
        toolbar2.removeView(toolbar2.g);
        Toolbar toolbar3 = this.c;
        toolbar3.h = null;
        int size = toolbar3.u.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar3.addView((View) toolbar3.u.get(size));
            } else {
                toolbar3.u.clear();
                this.b = null;
                this.c.requestLayout();
                goVar.h(false);
                return true;
            }
        }
    }

    @Override // defpackage.gz
    public final boolean h(go goVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new ig(toolbar.getContext(), null, R.attr.f18770_resource_name_obfuscated_res_0x7f040791);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            nx v = Toolbar.v();
            v.a = (toolbar.m & 112) | 8388611;
            v.b = 2;
            toolbar.g.setLayoutParams(v);
            toolbar.g.setOnClickListener(new hk(toolbar, 3));
        }
        ViewParent parent = this.c.g.getParent();
        Toolbar toolbar2 = this.c;
        if (parent != toolbar2) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar2.g);
            }
            Toolbar toolbar3 = this.c;
            toolbar3.addView(toolbar3.g);
        }
        this.c.h = goVar.getActionView();
        this.b = goVar;
        ViewParent parent2 = this.c.h.getParent();
        Toolbar toolbar4 = this.c;
        if (parent2 != toolbar4) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar4.h);
            }
            nx v2 = Toolbar.v();
            Toolbar toolbar5 = this.c;
            v2.a = 8388611 | (toolbar5.m & 112);
            v2.b = 2;
            toolbar5.h.setLayoutParams(v2);
            Toolbar toolbar6 = this.c;
            toolbar6.addView(toolbar6.h);
        }
        Toolbar toolbar7 = this.c;
        int childCount = toolbar7.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar7.getChildAt(childCount);
            if (((nx) childAt.getLayoutParams()).b != 2 && childAt != toolbar7.a) {
                toolbar7.removeViewAt(childCount);
                toolbar7.u.add(childAt);
            }
        }
        this.c.requestLayout();
        goVar.h(true);
        View view = this.c.h;
        if (view instanceof fn) {
            ((fn) view).b();
        }
        return true;
    }

    @Override // defpackage.gz
    public final void i() {
        if (this.b != null) {
            gm gmVar = this.a;
            if (gmVar != null) {
                int size = gmVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            g(this.b);
        }
    }
}
