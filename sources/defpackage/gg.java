package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gg  reason: default package */
/* loaded from: classes.dex */
public final class gg extends gv implements View.OnKeyListener, PopupWindow.OnDismissListener, gz {
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private gy y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new he(this, 1);
    private final View.OnAttachStateChangeListener m = new ge(this, 0);
    private final lh n = new gf(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();
    public final Handler a = new Handler();

    public gg(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.f31680_resource_name_obfuscated_res_0x7f070017));
    }

    private final int y() {
        return aad.f(this.q) == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.gm r17) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg.z(gm):void");
    }

    @Override // defpackage.gz
    public final void c(gm gmVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gmVar == ((nwo) this.b.get(i)).c) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            ((gm) ((nwo) this.b.get(i2)).c).i(false);
        }
        nwo nwoVar = (nwo) this.b.remove(i);
        ((gm) nwoVar.c).m(this);
        if (this.f) {
            li.b(((lm) nwoVar.b).q, null);
            ((lg) nwoVar.b).q.setAnimationStyle(0);
        }
        ((lg) nwoVar.b).k();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((nwo) this.b.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (!z) {
                return;
            }
            ((gm) ((nwo) this.b.get(0)).c).i(false);
            return;
        }
        k();
        gy gyVar = this.y;
        if (gyVar != null) {
            gyVar.a(gmVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.gz
    public final void d(gy gyVar) {
        this.y = gyVar;
    }

    @Override // defpackage.gz
    public final boolean e() {
        return false;
    }

    @Override // defpackage.hd
    public final ListView eW() {
        if (this.b.isEmpty()) {
            return null;
        }
        List list = this.b;
        return ((nwo) list.get(list.size() - 1)).d();
    }

    @Override // defpackage.gz
    public final boolean f(hg hgVar) {
        for (nwo nwoVar : this.b) {
            if (hgVar == nwoVar.c) {
                nwoVar.d().requestFocus();
                return true;
            }
        }
        if (hgVar.hasVisibleItems()) {
            j(hgVar);
            gy gyVar = this.y;
            if (gyVar != null) {
                gyVar.b(hgVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gz
    public final void i() {
        for (nwo nwoVar : this.b) {
            v(nwoVar.d().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gv
    public final void j(gm gmVar) {
        gmVar.h(this, this.h);
        if (u()) {
            z(gmVar);
        } else {
            this.l.add(gmVar);
        }
    }

    @Override // defpackage.hd
    public final void k() {
        int size = this.b.size();
        if (size > 0) {
            nwo[] nwoVarArr = (nwo[]) this.b.toArray(new nwo[size]);
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                nwo nwoVar = nwoVarArr[size];
                if (((lg) nwoVar.b).u()) {
                    ((lg) nwoVar.b).k();
                }
            }
        }
    }

    @Override // defpackage.gv
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, aad.f(view));
        }
    }

    @Override // defpackage.gv
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.gv
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, aad.f(this.q));
        }
    }

    @Override // defpackage.gv
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nwo nwoVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nwoVar = null;
                break;
            }
            nwoVar = (nwo) this.b.get(i);
            if (!((lg) nwoVar.b).u()) {
                break;
            }
            i++;
        }
        if (nwoVar != null) {
            ((gm) nwoVar.c).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            k();
            return true;
        }
        return false;
    }

    @Override // defpackage.gv
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.gv
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.gv
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.hd
    public final void s() {
        if (u()) {
            return;
        }
        for (gm gmVar : this.l) {
            z(gmVar);
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = this.e;
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        this.e = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.c);
        }
        this.d.addOnAttachStateChangeListener(this.m);
    }

    @Override // defpackage.gv
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.hd
    public final boolean u() {
        return this.b.size() > 0 && ((lg) ((nwo) this.b.get(0)).b).u();
    }
}
