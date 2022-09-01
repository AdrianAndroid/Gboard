package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: dr  reason: default package */
/* loaded from: classes.dex */
public final class dr extends da implements LayoutInflater.Factory2, gk {
    private static final qv O = new qv();
    private static final int[] P = {16842836};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean j = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    public dp E;
    public boolean F;
    boolean G;
    public Configuration H;
    public int I;
    public boolean J;
    public int K;
    public Rect L;
    public Rect M;
    private CharSequence Q;
    private dq R;
    private TextView S;
    private boolean T;
    private boolean U;
    private boolean V;
    private dp[] W;
    private boolean X;
    private boolean Y;
    private int Z;
    private int aa;
    private boolean ab;
    private dm ac;
    private dm ad;
    private boolean af;
    private AppCompatViewInflater ag;
    private dq ah;
    public final Object k;
    final Context l;
    public Window m;
    public dj n;
    public cm o;
    public MenuInflater p;
    public js q;
    fm r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public boolean w;
    ViewGroup x;
    public View y;
    boolean z;
    public aqq N = null;
    public boolean v = true;
    private final Runnable ae = new az(this, 4);

    public dr(Context context, Window window, Object obj) {
        cx cxVar = null;
        this.Z = -100;
        this.l = context;
        this.k = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof cx)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        cxVar = (cx) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (cxVar != null) {
                this.Z = ((dr) cxVar.h()).Z;
            }
        }
        if (this.Z == -100) {
            qv qvVar = O;
            Integer num = (Integer) qvVar.get(this.k.getClass().getName());
            if (num != null) {
                this.Z = num.intValue();
                qvVar.remove(this.k.getClass().getName());
            }
        }
        if (window != null) {
            Z(window);
        }
        C0000if.f();
    }

    static final wu S(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? di.w(configuration) : wu.c(dh.a(configuration.locale));
    }

    static final void V(Configuration configuration, wu wuVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            di.d(configuration, wuVar);
            return;
        }
        dg.b(configuration, wuVar.f(0));
        dg.a(configuration, wuVar.f(0));
    }

    private final dm X(Context context) {
        if (this.ad == null) {
            this.ad = new dk(this, context);
        }
        return this.ad;
    }

    private final dm Y(Context context) {
        if (this.ac == null) {
            if (fws.d == null) {
                Context applicationContext = context.getApplicationContext();
                fws.d = new fws(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ac = new dn(this, fws.d, null, null, null, null);
        }
        return this.ac;
    }

    private final void Z(Window window) {
        if (this.m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof dj) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        dj djVar = new dj(this, callback);
        this.n = djVar;
        window.setCallback(djVar);
        gkn v = gkn.v(this.l, null, P);
        Drawable o = v.o(0);
        if (o != null) {
            window.setBackgroundDrawable(o);
        }
        v.r();
        this.m = window;
    }

    private final void aa() {
        if (this.m == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                Z(((Activity) obj).getWindow());
            }
        }
        if (this.m != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private final void ab(int i2) {
        this.K = (1 << i2) | this.K;
        if (!this.J) {
            aad.H(this.m.getDecorView(), this.ae);
            this.J = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r13.f != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ac(defpackage.dp r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.ac(dp, android.view.KeyEvent):void");
    }

    private final void ad() {
        if (!this.w) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private final void ae(boolean z) {
        W(z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dp A(Menu menu) {
        dp[] dpVarArr = this.W;
        int length = dpVarArr != null ? dpVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            dp dpVar = dpVarArr[i2];
            if (dpVar != null && dpVar.h == menu) {
                return dpVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback B() {
        return this.m.getCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final wu C(Context context) {
        wu wuVar;
        wu c;
        Locale f;
        if (Build.VERSION.SDK_INT >= 33 || (wuVar = da.c) == null) {
            return null;
        }
        wu S = S(context.getApplicationContext().getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            if (wuVar.g()) {
                c = wu.a;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < wuVar.a() + S.a(); i2++) {
                    if (i2 < wuVar.a()) {
                        f = wuVar.f(i2);
                    } else {
                        f = S.f(i2 - wuVar.a());
                    }
                    if (f != null) {
                        linkedHashSet.add(f);
                    }
                }
                c = wu.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else {
            c = wuVar.g() ? wu.a : wu.c(wuVar.f(0).toString());
        }
        return c.g() ? S : c;
    }

    public final CharSequence D() {
        Object obj = this.k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(int i2, dp dpVar, Menu menu) {
        if (menu == null) {
            menu = dpVar.h;
        }
        if (!dpVar.m || this.G) {
            return;
        }
        dj djVar = this.n;
        Window.Callback callback = this.m.getCallback();
        try {
            djVar.b = true;
            callback.onPanelClosed(i2, menu);
        } finally {
            djVar.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(gm gmVar) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.q.a();
        Window.Callback B = B();
        if (B != null && !this.G) {
            B.onPanelClosed(108, gmVar);
        }
        this.V = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(dp dpVar, boolean z) {
        ViewGroup viewGroup;
        js jsVar;
        if (!z || dpVar.a != 0 || (jsVar = this.q) == null || !jsVar.s()) {
            WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
            if (windowManager != null && dpVar.m && (viewGroup = dpVar.e) != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    E(dpVar.a, dpVar, null);
                }
            }
            dpVar.k = false;
            dpVar.l = false;
            dpVar.m = false;
            dpVar.f = null;
            dpVar.n = true;
            if (this.E != dpVar) {
                return;
            }
            this.E = null;
            return;
        }
        F(dpVar.h);
    }

    public final void H(int i2) {
        dp T = T(i2);
        if (T.h != null) {
            Bundle bundle = new Bundle();
            T.h.o(bundle);
            if (bundle.size() > 0) {
                T.p = bundle;
            }
            T.h.s();
            T.h.clear();
        }
        T.o = true;
        T.n = true;
        if ((i2 == 108 || i2 == 0) && this.q != null) {
            dp T2 = T(0);
            T2.k = false;
            O(T2, null);
        }
    }

    public final void I() {
        aqq aqqVar = this.N;
        if (aqqVar != null) {
            aqqVar.i();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        Context context;
        if (!this.w) {
            TypedArray obtainStyledAttributes = this.l.obtainStyledAttributes(ei.j);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                t(1);
            } else if (obtainStyledAttributes.getBoolean(117, false)) {
                t(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                t(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                t(10);
            }
            this.C = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            aa();
            this.m.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.l);
            if (this.D) {
                viewGroup = this.B ? (ViewGroup) from.inflate(R.layout.f133380_resource_name_obfuscated_res_0x7f0e0016, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.f133370_resource_name_obfuscated_res_0x7f0e0015, (ViewGroup) null);
            } else if (this.C) {
                viewGroup = (ViewGroup) from.inflate(R.layout.f133280_resource_name_obfuscated_res_0x7f0e000c, (ViewGroup) null);
                this.A = false;
                this.z = false;
            } else if (this.z) {
                TypedValue typedValue = new TypedValue();
                this.l.getTheme().resolveAttribute(R.attr.f7410_resource_name_obfuscated_res_0x7f04021b, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new po(this.l, typedValue.resourceId);
                } else {
                    context = this.l;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.f133390_resource_name_obfuscated_res_0x7f0e0017, (ViewGroup) null);
                js jsVar = (js) viewGroup.findViewById(R.id.f53770_resource_name_obfuscated_res_0x7f0b0148);
                this.q = jsVar;
                jsVar.n(B());
                if (this.A) {
                    this.q.c(109);
                }
                if (this.T) {
                    this.q.c(2);
                }
                if (this.U) {
                    this.q.c(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.z + ", windowActionBarOverlay: " + this.A + ", android:windowIsFloating: " + this.C + ", windowActionModeOverlay: " + this.B + ", windowNoTitle: " + this.D + " }");
            }
            aad.V(viewGroup, new db(this));
            if (this.q == null) {
                this.S = (TextView) viewGroup.findViewById(R.id.f129920_resource_name_obfuscated_res_0x7f0b21a5);
            }
            oi.a(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.f52060_resource_name_obfuscated_res_0x7f0b0049);
            ViewGroup viewGroup2 = (ViewGroup) this.m.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.m.setContentView(viewGroup);
            contentFrameLayout.i = new opu(this);
            this.x = viewGroup;
            CharSequence D = D();
            if (!TextUtils.isEmpty(D)) {
                js jsVar2 = this.q;
                if (jsVar2 != null) {
                    jsVar2.o(D);
                } else {
                    cm cmVar = this.o;
                    if (cmVar != null) {
                        cmVar.j(D);
                    } else {
                        TextView textView = this.S;
                        if (textView != null) {
                            textView.setText(D);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.x.findViewById(16908290);
            View decorView = this.m.getDecorView();
            contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (aad.ah(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray obtainStyledAttributes2 = this.l.obtainStyledAttributes(ei.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new TypedValue();
            }
            obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
            if (obtainStyledAttributes2.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
            }
            if (obtainStyledAttributes2.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
            }
            if (obtainStyledAttributes2.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new TypedValue();
                }
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.w = true;
            dp T = T(0);
            if (this.G || T.h != null) {
                return;
            }
            ab(108);
        }
    }

    public final void K() {
        J();
        if (!this.z || this.o != null) {
            return;
        }
        Object obj = this.k;
        if (obj instanceof Activity) {
            this.o = new eh((Activity) this.k, this.A);
        } else if (obj instanceof Dialog) {
            this.o = new eh((Dialog) this.k);
        }
        cm cmVar = this.o;
        if (cmVar == null) {
            return;
        }
        cmVar.f(this.af);
    }

    @Override // defpackage.gk
    public final void L(gm gmVar) {
        js jsVar = this.q;
        if (jsVar == null || !jsVar.p() || (ViewConfiguration.get(this.l).hasPermanentMenuKey() && !this.q.r())) {
            dp T = T(0);
            T.n = true;
            G(T, false);
            ac(T, null);
            return;
        }
        Window.Callback B = B();
        if (this.q.s()) {
            this.q.q();
            if (this.G) {
                return;
            }
            B.onPanelClosed(108, T(0).h);
        } else if (B == null || this.G) {
        } else {
            if (this.J && (1 & this.K) != 0) {
                this.m.getDecorView().removeCallbacks(this.ae);
                this.ae.run();
            }
            dp T2 = T(0);
            gm gmVar2 = T2.h;
            if (gmVar2 == null || T2.o || !B.onPreparePanel(0, T2.g, gmVar2)) {
                return;
            }
            B.onMenuOpened(108, T2.h);
            this.q.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.M(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.gk
    public final boolean N(gm gmVar, MenuItem menuItem) {
        dp A;
        Window.Callback B = B();
        if (B == null || this.G || (A = A(gmVar.a())) == null) {
            return false;
        }
        return B.onMenuItemSelected(A.a, menuItem);
    }

    public final boolean O(dp dpVar, KeyEvent keyEvent) {
        js jsVar;
        js jsVar2;
        Resources.Theme theme;
        js jsVar3;
        js jsVar4;
        if (this.G) {
            return false;
        }
        if (dpVar.k) {
            return true;
        }
        dp dpVar2 = this.E;
        if (dpVar2 != null && dpVar2 != dpVar) {
            G(dpVar2, false);
        }
        Window.Callback B = B();
        if (B != null) {
            dpVar.g = B.onCreatePanelView(dpVar.a);
        }
        int i2 = dpVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (jsVar4 = this.q) != null) {
            jsVar4.m();
        }
        if (dpVar.g == null && (!z || !(this.o instanceof eb))) {
            gm gmVar = dpVar.h;
            if (gmVar == null || dpVar.o) {
                if (gmVar == null) {
                    Context context = this.l;
                    int i3 = dpVar.a;
                    if ((i3 == 0 || i3 == 108) && this.q != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.f7410_resource_name_obfuscated_res_0x7f04021b, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.f7420_resource_name_obfuscated_res_0x7f04021c, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.f7420_resource_name_obfuscated_res_0x7f04021c, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            po poVar = new po(context, 0);
                            poVar.getTheme().setTo(theme);
                            context = poVar;
                        }
                    }
                    gm gmVar2 = new gm(context);
                    gmVar2.b = this;
                    dpVar.a(gmVar2);
                    if (dpVar.h == null) {
                        return false;
                    }
                }
                if (z && (jsVar2 = this.q) != null) {
                    if (this.ah == null) {
                        this.ah = new dq(this, 1);
                    }
                    jsVar2.l(dpVar.h, this.ah);
                }
                dpVar.h.s();
                if (!B.onCreatePanelMenu(dpVar.a, dpVar.h)) {
                    dpVar.a(null);
                    if (z && (jsVar = this.q) != null) {
                        jsVar.l(null, this.ah);
                    }
                    return false;
                }
                dpVar.o = false;
            }
            dpVar.h.s();
            Bundle bundle = dpVar.p;
            if (bundle != null) {
                dpVar.h.n(bundle);
                dpVar.p = null;
            }
            if (!B.onPreparePanel(0, dpVar.g, dpVar.h)) {
                if (z && (jsVar3 = this.q) != null) {
                    jsVar3.l(null, this.ah);
                }
                dpVar.h.r();
                return false;
            }
            dpVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            dpVar.h.r();
        }
        dpVar.k = true;
        dpVar.l = false;
        this.E = dpVar;
        return true;
    }

    public final boolean P() {
        ViewGroup viewGroup;
        return this.w && (viewGroup = this.x) != null && aad.ah(viewGroup);
    }

    public final void Q() {
        ae(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00e3, code lost:
        if (r9.equals("Spinner") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View R(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.R(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final dp T(int i2) {
        dp[] dpVarArr = this.W;
        if (dpVarArr == null || dpVarArr.length <= i2) {
            dp[] dpVarArr2 = new dp[i2 + 1];
            if (dpVarArr != null) {
                System.arraycopy(dpVarArr, 0, dpVarArr2, 0, dpVarArr.length);
            }
            this.W = dpVarArr2;
            dpVarArr = dpVarArr2;
        }
        dp dpVar = dpVarArr[i2];
        if (dpVar == null) {
            dp dpVar2 = new dp(i2);
            dpVarArr[i2] = dpVar2;
            return dpVar2;
        }
        return dpVar;
    }

    public final boolean U(dp dpVar, int i2, KeyEvent keyEvent) {
        gm gmVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!dpVar.k && !O(dpVar, keyEvent)) || (gmVar = dpVar.h) == null) {
            return false;
        }
        return gmVar.performShortcut(i2, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015b, code lost:
        if (r12 == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.W(boolean, boolean):void");
    }

    @Override // defpackage.da
    public final Context a() {
        return this.l;
    }

    @Override // defpackage.da
    public final cm b() {
        K();
        return this.o;
    }

    @Override // defpackage.da
    public final View c(int i2) {
        J();
        return this.m.findViewById(i2);
    }

    @Override // defpackage.da
    public final void e(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.x.findViewById(16908290)).addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    @Override // defpackage.da
    public final void f() {
        LayoutInflater from = LayoutInflater.from(this.l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof dr) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.da
    public final void g() {
        if (this.o == null || b().m()) {
            return;
        }
        ab(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.da
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.da.h
            monitor-enter(r0)
            defpackage.da.j(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.J
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ae
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.G = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            qv r0 = defpackage.dr.O
            java.lang.Object r1 = r3.k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            qv r0 = defpackage.dr.O
            java.lang.Object r1 = r3.k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            cm r0 = r3.o
            if (r0 == 0) goto L63
            r0.e()
        L63:
            dm r0 = r3.ac
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            dm r0 = r3.ad
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.h():void");
    }

    @Override // defpackage.da
    public final void i() {
        cm b = b();
        if (b != null) {
            b.h(false);
        }
    }

    @Override // defpackage.da
    public final void k(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.l).inflate(i2, viewGroup);
        this.n.a(this.m.getCallback());
    }

    @Override // defpackage.da
    public final void l(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.a(this.m.getCallback());
    }

    @Override // defpackage.da
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.a(this.m.getCallback());
    }

    @Override // defpackage.da
    public final void n(CharSequence charSequence) {
        this.Q = charSequence;
        js jsVar = this.q;
        if (jsVar != null) {
            jsVar.o(charSequence);
            return;
        }
        cm cmVar = this.o;
        if (cmVar != null) {
            cmVar.j(charSequence);
            return;
        }
        TextView textView = this.S;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(str, context, attributeSet);
    }

    @Override // defpackage.da
    public final void q() {
        wu wuVar;
        if (p(this.l) && (wuVar = da.c) != null && !wuVar.equals(da.d)) {
            da.a.execute(new az(this.l, 2));
        }
        ae(true);
    }

    @Override // defpackage.da
    public final void r() {
        String str;
        this.F = true;
        ae(false);
        aa();
        Object obj = this.k;
        if (obj instanceof Activity) {
            try {
                str = je.e((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                cm cmVar = this.o;
                if (cmVar == null) {
                    this.af = true;
                } else {
                    cmVar.f(true);
                }
            }
            synchronized (da.h) {
                da.j(this);
                da.g.add(new WeakReference(this));
            }
        }
        this.H = new Configuration(this.l.getResources().getConfiguration());
        this.Y = true;
    }

    @Override // defpackage.da
    public final void t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (!this.D || i2 != 108) {
            if (this.z && i2 == 1) {
                this.z = false;
            }
            if (i2 == 1) {
                ad();
                this.D = true;
            } else if (i2 == 2) {
                ad();
                this.T = true;
            } else if (i2 == 5) {
                ad();
                this.U = true;
            } else if (i2 == 10) {
                ad();
                this.B = true;
            } else if (i2 == 108) {
                ad();
                this.z = true;
            } else if (i2 == 109) {
                ad();
                this.A = true;
            } else {
                this.m.requestFeature(i2);
            }
        }
    }

    public final int w() {
        int i2 = this.Z;
        return i2 != -100 ? i2 : da.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int x(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.x(android.content.Context, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context y() {
        cm b = b();
        Context b2 = b != null ? b.b() : null;
        return b2 == null ? this.l : b2;
    }

    public final Configuration z(Context context, int i2, wu wuVar, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (wuVar != null) {
            V(configuration2, wuVar);
        }
        return configuration2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return R(str, context, attributeSet);
    }
}
