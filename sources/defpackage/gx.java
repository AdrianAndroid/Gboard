package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public class gx {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final gm e;
    private final boolean f;
    private final int g;
    private boolean h;
    private gy i;
    private gv j;
    private final PopupWindow.OnDismissListener k;

    public gx(Context context, gm gmVar, View view, boolean z) {
        this(context, gmVar, view, z, R.attr.f7640_resource_name_obfuscated_res_0x7f040232);
    }

    public final gv a() {
        gv hfVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            gw.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.f31670_resource_name_obfuscated_res_0x7f070016)) {
                hfVar = new gg(this.d, this.a, this.g, this.f);
            } else {
                hfVar = new hf(this.d, this.e, this.a, this.g, this.f);
            }
            hfVar.j(this.e);
            hfVar.p(this.k);
            hfVar.l(this.a);
            hfVar.d(this.i);
            hfVar.m(this.h);
            hfVar.n(this.b);
            this.j = hfVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        gv gvVar = this.j;
        if (gvVar != null) {
            gvVar.m(z);
        }
    }

    public final void e(gy gyVar) {
        this.i = gyVar;
        gv gvVar = this.j;
        if (gvVar != null) {
            gvVar.d(gyVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        gv a = a();
        a.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, aad.f(this.a)) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.o(i);
            a.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.s();
    }

    public final boolean g() {
        gv gvVar = this.j;
        return gvVar != null && gvVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public gx(Context context, gm gmVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new dww(this, 1);
        this.d = context;
        this.e = gmVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
