package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eh  reason: default package */
/* loaded from: classes.dex */
public final class eh extends cm implements hm {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    jt d;
    ActionBarContextView e;
    View f;
    eg g;
    fm h;
    fl i;
    public boolean l;
    public fv m;
    boolean n;
    private Context t;
    private boolean u;
    private boolean v;
    private boolean x;
    private boolean z;
    private final ArrayList w = new ArrayList();
    public int j = 0;
    public boolean k = true;
    private boolean y = true;
    final aam o = new ee(this);
    final aam p = new ef(this);
    final opu q = new opu(this);

    public eh(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        y(decorView);
        if (!z) {
            this.f = decorView.findViewById(16908290);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void y(View view) {
        jt f;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.f53770_resource_name_obfuscated_res_0x7f0b0148);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((eh) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    aad.K(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(R.id.f52050_resource_name_obfuscated_res_0x7f0b0048);
        if (findViewById instanceof jt) {
            f = (jt) findViewById;
        } else if (findViewById instanceof Toolbar) {
            f = ((Toolbar) findViewById).f();
        } else {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.d = f;
        this.e = (ActionBarContextView) view.findViewById(R.id.f52110_resource_name_obfuscated_res_0x7f0b0050);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.f52070_resource_name_obfuscated_res_0x7f0b004a);
        this.c = actionBarContainer;
        jt jtVar = this.d;
        if (jtVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = jtVar.b();
        if ((this.d.a() & 4) != 0) {
            this.u = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        t();
        z(cy.c(context));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, ei.a, R.attr.f7370_resource_name_obfuscated_res_0x7f040217, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (actionBarOverlayLayout2.d) {
                this.n = true;
                actionBarOverlayLayout2.k(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            aad.S(this.c, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.cm
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.cm
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(R.attr.f7420_resource_name_obfuscated_res_0x7f04021c, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.cm
    public final fm c(fl flVar) {
        eg egVar = this.g;
        if (egVar != null) {
            egVar.f();
        }
        this.b.k(false);
        this.e.i();
        eg egVar2 = new eg(this, this.e.getContext(), flVar);
        egVar2.a.s();
        try {
            if (!egVar2.b.c(egVar2, egVar2.a)) {
                return null;
            }
            this.g = egVar2;
            egVar2.g();
            this.e.h(egVar2);
            u(true);
            return egVar2;
        } finally {
            egVar2.a.r();
        }
    }

    @Override // defpackage.cm
    public final void d(boolean z) {
        if (z == this.v) {
            return;
        }
        this.v = z;
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            ((cl) this.w.get(i)).a();
        }
    }

    @Override // defpackage.cm
    public final void f(boolean z) {
        if (!this.u) {
            g(z);
        }
    }

    @Override // defpackage.cm
    public final void g(boolean z) {
        v(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.cm
    public final void h(boolean z) {
        fv fvVar;
        this.z = z;
        if (z || (fvVar = this.m) == null) {
            return;
        }
        fvVar.a();
    }

    @Override // defpackage.cm
    public final void i(CharSequence charSequence) {
        this.d.k(charSequence);
    }

    @Override // defpackage.cm
    public final void j(CharSequence charSequence) {
        this.d.n(charSequence);
    }

    @Override // defpackage.cm
    public final boolean l() {
        jt jtVar = this.d;
        if (jtVar == null || !jtVar.p()) {
            return false;
        }
        jtVar.c();
        return true;
    }

    @Override // defpackage.cm
    public final boolean n(int i, KeyEvent keyEvent) {
        eg egVar = this.g;
        if (egVar == null) {
            return false;
        }
        gm gmVar = egVar.a;
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        gmVar.setQwertyMode(z);
        return gmVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cm
    public final void q() {
        z(cy.c(this.a));
    }

    @Override // defpackage.cm
    public final void r() {
        v(2, 2);
    }

    @Override // defpackage.cm
    public final void s() {
        this.d.h(null);
    }

    @Override // defpackage.cm
    public final void t() {
        this.d.w();
    }

    public final void u(boolean z) {
        aqq y;
        aqq g;
        if (z) {
            if (!this.x) {
                this.x = true;
                w(false);
            }
        } else if (this.x) {
            this.x = false;
            w(false);
        }
        if (!aad.ah(this.c)) {
            if (z) {
                this.d.l(4);
                this.e.setVisibility(0);
                return;
            }
            this.d.l(0);
            this.e.setVisibility(8);
            return;
        }
        if (z) {
            g = this.d.y(4, 100L);
            y = this.e.g(0, 200L);
        } else {
            y = this.d.y(0, 200L);
            g = this.e.g(8, 100L);
        }
        fv fvVar = new fv();
        fvVar.a.add(g);
        View view = (View) ((WeakReference) g.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ((WeakReference) y.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        fvVar.a.add(y);
        fvVar.b();
    }

    public final void v(int i, int i2) {
        int a = this.d.a();
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        this.d.g((i & i2) | ((i2 ^ (-1)) & a));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(boolean r6) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh.w(boolean):void");
    }

    private final void z(boolean z) {
        if (z) {
            this.d.v();
        } else {
            this.d.v();
        }
        this.d.u();
        this.d.x();
        this.b.e = false;
    }

    public eh(Dialog dialog) {
        new ArrayList();
        y(dialog.getWindow().getDecorView());
    }
}
