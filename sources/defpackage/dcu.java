package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Icon;
import android.inputmethodservice.AbstractInputMethodService;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Process;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.PrintWriterPrinter;
import android.util.Printer;
import android.util.Size;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InlineSuggestionsRequest;
import android.view.inputmethod.InputBinding;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.inline.InlinePresentationSpec;
import com.google.android.apps.inputmethod.libs.framework.core.FloatingCandidatesWindow;
import com.google.android.apps.inputmethod.libs.framework.core.InputView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;
import com.google.android.libraries.inputmethod.keyboardmode.MultiTouchDelegateView;
import com.google.android.libraries.inputmethod.widgets.KeyboardHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: dcu  reason: default package */
/* loaded from: classes.dex */
public class dcu extends InputMethodService implements hsk, hoy, hfq, hoz, hvo {
    private static final hhl c;
    private static final hhl d;
    private static final hhl e;
    private static final iay f;
    public static final hhl i;
    public static final hhl j;
    public static final hhl k;
    public boolean A;
    public boolean C;
    public final hpx D;
    public final hpx E;
    protected hpx F;
    public imr H;
    public boolean J;
    public hvp K;
    public hnq L;
    public boolean N;
    public ija Q;
    public hfp R;
    public hxi S;
    public Integer T;
    public boolean X;
    private hsl aA;
    private hwp aB;
    private gzr aG;
    private boolean aH;
    private ewj aM;
    private final opu aN;
    private opu aO;
    public jls ac;
    private volatile isu ae;
    private boolean ag;
    private boolean ah;
    private LayoutInflater ai;
    private gpu aj;
    private int ak;
    private boolean al;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private igr aw;
    private htc ay;
    public WindowInsets l;
    public boolean m;
    public int n;
    public InputView q;
    public View r;
    public KeyboardViewHolder t;
    public FloatingCandidatesWindow u;
    public ino v;
    public hqy w;
    protected jaq x;
    public boolean y;
    public boolean z;
    public static final ltg g = ltg.j("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService");
    public static final gzy h = new gzy("InputMethodService");
    private static final int a = ice.FLOATING_CANDIDATES.ordinal();
    private static final ice[] b = {ice.HEADER, ice.BODY};
    private final iqe ad = iqe.e(e, 2);
    public hou o = hou.a;
    public iau p = iau.SOFT;
    public final KeyboardViewHolder[] s = new KeyboardViewHolder[ice.values().length];
    private final boolean[] af = new boolean[ice.values().length];
    private final knf aL = new knf(null);
    public final List B = new ArrayList();
    private int am = 0;
    public final BroadcastReceiver G = new dcm();
    private final Configuration an = new Configuration();
    public final hub[] I = new hub[ice.values().length];
    private final Runnable ao = new cvj(this, 13);
    private final htw ap = new dcn(this);
    private final htw aq = new htw() { // from class: dcj
        @Override // defpackage.htw
        public final /* synthetic */ void a(ibz ibzVar, ice iceVar, View view) {
        }

        @Override // defpackage.htw
        public final /* synthetic */ void b(ibz ibzVar, ice iceVar, View view) {
        }

        @Override // defpackage.htw
        public final /* synthetic */ void c(ibz ibzVar, ice iceVar, View view) {
        }

        @Override // defpackage.htw
        public final void d(ibz ibzVar, ice iceVar, View view) {
            if (dcu.this.q != null) {
                ifh.c();
            }
        }

        @Override // defpackage.htw
        public final /* synthetic */ void e(ibz ibzVar, ice iceVar, boolean z) {
        }
    };
    public float M = 1.0f;
    private final boolean[] av = new boolean[ice.values().length];
    public final AtomicBoolean O = new AtomicBoolean();
    public final inm P = new btf(this, 9);
    private final hhk ax = new bvl(this, 10);
    public final hqo U = new dco(this);
    public final gvn V = new dcp(this);
    private final gyb az = new gyb();
    public final ijj W = new ckp(this, 2);
    private final ViewTreeObserver.OnPreDrawListener aC = new dcf(this, 0);
    public final cir ab = new cir(this, 12);
    private final gzx aD = new gzx();
    private final hsj aE = new hsj();
    private mko aF = mkk.a;
    public final ija Y = ijf.c(new cvj(this, 12), new cvj(this, 12), irs.a);
    public final irw Z = new dcq(this);
    public final hsr aa = new hsr();
    private final int[] aI = new int[2];
    private final Rect aJ = new Rect();
    private final gza aK = new hoa(this, 1);

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 30) {
            z = false;
        }
        c = hhq.a("no_draw_before_ready", z);
        d = hhq.a("invalidate_surface_cache_on_window_hide", false);
        e = hhq.h("avoid_fullscreen_mode_in_apps", "-com.google.android.talk");
        i = hhq.a("prevent_fallback_input_connection", false);
        j = hhq.a("log_on_finish_input_view_metadata", false);
        k = hhq.a("hide_header_on_initial_state", false);
        jav.f("en");
        f = new iay(66, null, "\n");
    }

    public dcu() {
        opu opuVar = new opu(this);
        this.aN = opuVar;
        hqf hqfVar = new hqf(this) { // from class: dch
            public final /* synthetic */ dcu a;

            {
                this.a = this;
            }

            @Override // defpackage.hqf
            public final void a(hqe hqeVar, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
                if (r2 != 0) {
                    dcu dcuVar = this.a;
                    dcuVar.aI(dcuVar.E, hqeVar, z, i2, i3, i4, i5, i6, i7);
                    return;
                }
                dcu dcuVar2 = this.a;
                dcuVar2.aI(dcuVar2.D, hqeVar, z, i2, i3, i4, i5, i6, i7);
            }
        };
        dcs dcsVar = new dcs(1);
        dcr dcrVar = new dcr(this);
        hpx hpxVar = new hpx(hqfVar, dcsVar, opuVar, ieh.j(), false, null, null, null, null, null);
        hpxVar.p(dcrVar);
        this.D = hpxVar;
        this.E = new hpx(new hqf(this) { // from class: dch
            public final /* synthetic */ dcu a;

            {
                this.a = this;
            }

            @Override // defpackage.hqf
            public final void a(hqe hqeVar, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
                if (r2 != 0) {
                    dcu dcuVar = this.a;
                    dcuVar.aI(dcuVar.E, hqeVar, z, i2, i3, i4, i5, i6, i7);
                    return;
                }
                dcu dcuVar2 = this.a;
                dcuVar2.aI(dcuVar2.D, hqeVar, z, i2, i3, i4, i5, i6, i7);
            }
        }, new dcs(0), opuVar, ieh.j(), true, null, null, null, null, null);
        this.F = hpxVar;
    }

    public static boolean bG(hqt hqtVar) {
        iav g2;
        return (hqtVar == null || (g2 = hqtVar.g()) == null || !g2.f.h) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final hox bI(Context context, hoy hoyVar, iav iavVar) {
        return new hox(context, hoyVar, iavVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean bQ() {
        return jai.b.b();
    }

    private final void bT() {
        iss f2 = f();
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "initializeKeyboardTheme", 1433, "GoogleInputMethodService.java")).w("Apply keyboard theme: %s", ((ess) f2).b);
        i().a = f2;
    }

    private final void bU() {
        KeyboardViewHolder[] keyboardViewHolderArr;
        for (KeyboardViewHolder keyboardViewHolder : this.s) {
            if (keyboardViewHolder != null) {
                keyboardViewHolder.removeAllViews();
            }
        }
        KeyboardViewHolder keyboardViewHolder2 = this.t;
        if (keyboardViewHolder2 != null) {
            keyboardViewHolder2.removeAllViews();
        }
    }

    private final void bV(hpx hpxVar, int i2) {
        if (i2 != 0) {
            hpr hprVar = hpxVar.g;
            InputConnection a2 = hprVar.a();
            if (a2 == null) {
                return;
            }
            hprVar.g.execute(new dob(a2, i2, 9));
            return;
        }
        ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "sendImeActionToInputConnection", 2992, "GoogleInputMethodService.java")).w("Unknown ime action: %s", ham.j(0));
        bW(hpxVar, f, 0);
    }

    private final void bW(hpx hpxVar, iay iayVar, int i2) {
        int length;
        boolean z = this.y;
        EditorInfo c2 = hpxVar.c();
        Object obj = iayVar.e;
        CharSequence charSequence = obj instanceof CharSequence ? (CharSequence) obj : null;
        int i3 = iayVar.c;
        if (!iaz.i(i3) ? i3 > 0 : !TextUtils.isEmpty(charSequence)) {
            if (!ham.ac(c2)) {
                if (!iaz.h(i3)) {
                    if (TextUtils.isEmpty(charSequence) || i3 == 61 || i3 == 66) {
                        hpxVar.g.j(i3, i2, i2);
                    } else {
                        int i4 = i2 & (-1048770);
                        if (z || !hpx.t(i3, charSequence)) {
                            if (!" ".contentEquals(charSequence) || i3 != 62) {
                                hpxVar.g.e(charSequence, 1);
                                length = charSequence.length();
                            } else {
                                hpxVar.g.e(charSequence, 1);
                            }
                        } else {
                            hpxVar.g.j(i3, i4, i4);
                        }
                        length = 1;
                    }
                }
            } else if (iaz.h(i3)) {
                int i5 = iaz.a.get(i3);
                hpxVar.g.j(i3, i2 | i5, i2 & (i5 ^ (-1)));
            } else if (TextUtils.isEmpty(charSequence) || i3 == 61 || i3 == 66) {
                hpxVar.g.j(i3, i2, i2);
            } else {
                int i6 = i2 & (-1048770);
                if (!hpx.t(i3, charSequence)) {
                    int length2 = charSequence.length();
                    length = 0;
                    for (int i7 = 0; i7 < length2; i7++) {
                        int b2 = iaz.b(charSequence.charAt(i7), hpxVar.j);
                        if (b2 != 0) {
                            hpr hprVar = hpxVar.g;
                            int i8 = hpxVar.j[0] | i6;
                            hprVar.j(b2, i8, i8);
                            length++;
                        }
                    }
                    if (length == 0) {
                        hpxVar.g.e(charSequence, 1);
                    }
                } else {
                    hpxVar.g.j(i3, i6, i6);
                    length = 1;
                }
            }
            ieh.j().e(hsp.GIMS_RAW_CHARACTERS_SENT, Integer.valueOf(length));
        }
        length = 0;
        ieh.j().e(hsp.GIMS_RAW_CHARACTERS_SENT, Integer.valueOf(length));
    }

    private final void bX(iau iauVar) {
        this.p = iauVar;
        if (iauVar != null) {
            this.o.f(iauVar);
        }
    }

    private final void bY() {
        if (this.A) {
            this.o.g();
        }
    }

    private static void bZ(hsy hsyVar, KeyEvent keyEvent) {
        hsyVar.fp(1L, keyEvent.isShiftPressed());
        hsyVar.fp(4L, keyEvent.isAltPressed());
        hsyVar.fp(8L, keyEvent.isCtrlPressed());
        hsyVar.fp(16L, keyEvent.isMetaPressed());
    }

    private final boolean cb() {
        for (ice iceVar : ice.values()) {
            KeyboardViewHolder keyboardViewHolder = this.s[iceVar.ordinal()];
            if (keyboardViewHolder != null && keyboardViewHolder.getVisibility() == 0) {
                return false;
            }
            KeyboardViewHolder keyboardViewHolder2 = this.t;
            if (keyboardViewHolder2 != null && keyboardViewHolder2.getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    private final boolean cc() {
        return y() == 2;
    }

    private final ist i() {
        return ((hrx) this.w).p.b;
    }

    public final int A() {
        return this.l == null ? gvv.d(this) : gvv.e(this) - this.l.getStableInsetBottom();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hqy, java.lang.Object] */
    @Override // defpackage.hoy
    public final long B() {
        long j2;
        EditorInfo N = N();
        if (!fhr.w(this) || ham.ak(this, N) || !ham.P(N)) {
            j2 = 0;
        } else {
            j2 = ino.M(this).aj(R.string.f162510_resource_name_obfuscated_res_0x7f14071c) ? 1391569403904L : 1116691496960L;
        }
        if (ham.ar(this, N) || !irz.b.a() || !jai.b.b() || !irs.d()) {
            j2 |= 34359738368L;
        }
        ewj ewjVar = this.aM;
        ino M = ino.M((Context) ewjVar.b);
        if (ewjVar.a.p() && M.x(R.string.f162520_resource_name_obfuscated_res_0x7f14071d, true) && !M.aj(R.string.f162510_resource_name_obfuscated_res_0x7f14071c) && (274877906944L & j2) == 0) {
            j2 |= 2048;
        }
        return !this.w.p() ? 4398046511104L | j2 : j2;
    }

    @Override // defpackage.hsk
    public final Context C() {
        return this;
    }

    @Override // defpackage.hsk
    public final /* synthetic */ Context D() {
        return iin.m(this);
    }

    @Override // defpackage.hsk
    public final Configuration E() {
        return getResources().getConfiguration();
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final IBinder F() {
        InputView inputView = this.q;
        if (inputView != null) {
            return inputView.getWindowToken();
        }
        return null;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final View G() {
        return this.r;
    }

    @Override // defpackage.hsk
    public final View H() {
        InputView inputView = this.q;
        if (inputView != null) {
            return inputView.findViewById(R.id.keyboard_holder);
        }
        return null;
    }

    @Override // defpackage.hsk
    public final View I() {
        InputView inputView = this.q;
        if (inputView == null) {
            return null;
        }
        return inputView.getRootView();
    }

    @Override // defpackage.hfq
    public final ViewGroup J() {
        return this.t;
    }

    @Override // defpackage.hoy
    public final ViewGroup K(ice iceVar, boolean z) {
        if (iceVar == ice.FLOATING_CANDIDATES) {
            FloatingCandidatesWindow floatingCandidatesWindow = this.u;
            if (floatingCandidatesWindow == null) {
                InputView inputView = this.q;
                if (inputView != null) {
                    KeyboardViewHolder keyboardViewHolder = (KeyboardViewHolder) View.inflate(this, R.layout.f135030_resource_name_obfuscated_res_0x7f0e00e2, null);
                    keyboardViewHolder.e = this.ap;
                    this.s[a] = keyboardViewHolder;
                    this.u = new FloatingCandidatesWindow(keyboardViewHolder, inputView, z);
                }
            } else if (floatingCandidatesWindow.isTouchable() != z) {
                this.u.setTouchable(z);
            }
        }
        return this.s[iceVar.ordinal()];
    }

    @Override // defpackage.hsk
    public final ViewGroup L(ice iceVar) {
        InputView inputView = this.q;
        if (inputView != null) {
            return inputView.b(iceVar);
        }
        return null;
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final EditorInfo M() {
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        if (currentInputEditorInfo == null) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "getAppEditorInfo", 2860, "GoogleInputMethodService.java")).t("App EditorInfo should never be null.");
            return ham.a;
        }
        return currentInputEditorInfo;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final EditorInfo N() {
        EditorInfo c2 = this.F.c();
        if (c2 == null) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "getEditorInfo", 2850, "GoogleInputMethodService.java")).t("EditorInfo should never be null.");
            return ham.a;
        }
        return c2;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final gqc O() {
        return this.aj;
    }

    @Override // defpackage.hsk
    public final hox P() {
        hou houVar = this.o;
        if (houVar == null) {
            return null;
        }
        return houVar.b();
    }

    @Override // defpackage.hsk
    public final hpl Q() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    @Override // defpackage.hoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hqk R(int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.R(int, int, int):hqk");
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final hqt S() {
        return hqp.b();
    }

    @Override // defpackage.hoy
    public final htb T(ibz ibzVar) {
        Class cls;
        hfp hfpVar = this.R;
        if (hfpVar == null || (cls = (Class) hfpVar.d.get(ibzVar)) == null) {
            return null;
        }
        ifw b2 = hfpVar.b.b(cls);
        if (b2 == null) {
            ((ltd) ((ltd) hfp.a.c()).k("com/google/android/libraries/inputmethod/extension/ExtensionManager", "getKeyboardProvider", 357, "ExtensionManager.java")).w("load module %s failed", cls.getCanonicalName());
            return null;
        }
        return (htb) b2;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hvo
    public final htc U() {
        if (this.ay == null) {
            this.ay = new dck(this);
        }
        return this.ay;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final hww V() {
        hxi hxiVar = this.S;
        return hxiVar != null ? hxiVar : hww.a;
    }

    @Override // defpackage.hfq, defpackage.hvo
    public final iau W() {
        return this.p;
    }

    protected final iau X(Configuration configuration) {
        if (super.onEvaluateInputViewShown()) {
            return iau.SOFT;
        }
        if (configuration.hardKeyboardHidden == 1) {
            int i2 = configuration.keyboard;
            if (i2 == 2) {
                return iau.HARD_QWERTY;
            }
            if (i2 == 3) {
                return iau.HARD_12KEYS;
            }
        }
        return iau.SOFT;
    }

    @Override // defpackage.hfq
    public final ibz Y() {
        hox P = P();
        if (P != null) {
            return P.e.d;
        }
        return null;
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final idk Z() {
        return ieh.j();
    }

    protected Intent a() {
        throw null;
    }

    @Override // defpackage.hoy
    public final void aA() {
        hpr hprVar = this.F.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        idn a3 = hprVar.f.a(hpv.IC_HIDE_TEXT_VIEW_HANDLES);
        hprVar.c("ICA.hideTextViewHandles");
        hprVar.g.execute(new hob(a2, 10));
        hprVar.p(a3, hpv.IC_HIDE_TEXT_VIEW_HANDLES_BACKGROUND, "ICA.hideTextViewHandles");
    }

    protected final void aB() {
        bT();
        j(bQ());
        bX(X(E()));
    }

    @Override // defpackage.inf, defpackage.hoy
    public final void aC(ins insVar) {
        InputMethodInfo b2;
        String str = null;
        if (this.x != null && irz.b.a() && jai.b.b() && irs.d() && (b2 = this.x.b()) != null) {
            str = b2.getSettingsActivity();
        }
        if (str != null) {
            requestHideSelf(0);
            startActivity(insVar.setClassName(this, str));
        }
    }

    @Override // defpackage.hoy
    public final void aD() {
        try {
            if (jck.a(this)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) null);
        builder.setMessage(R.string.f188180_resource_name_obfuscated_res_0x7f1411ac);
        jco.b(builder.create(), this.q.getWindowToken());
    }

    @Override // defpackage.inf
    public final void aE() {
        requestHideSelf(0);
        Intent a2 = a();
        if (a2 != null) {
            startActivity(a2);
        }
    }

    public final void aF() {
        if (this.J) {
            this.J = false;
            ijf.j(gwz.c);
        }
    }

    @Override // defpackage.hoy
    public final void aG(int i2, int i3) {
        hpx hpxVar = this.F;
        hqd g2 = hpxVar.e.g();
        hpxVar.q(g2.a + i2, g2.b + i3);
    }

    @Override // defpackage.hoy
    public final void aH(ibz ibzVar) {
        hfp hfpVar = this.R;
        if (hfpVar == null || !hfpVar.k) {
            return;
        }
        for (hfw hfwVar : hfpVar.b()) {
            hfx j2 = hfwVar.j();
            if (j2 != null) {
                j2.h(ibzVar);
            }
        }
    }

    public final void aI(hpx hpxVar, hqe hqeVar, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        hox P;
        h.a("onUpdateSelectionInternal()");
        if (hpxVar != this.F || !bB() || (P = P()) == null || P.g != 1) {
            return;
        }
        int i8 = i5 - i4;
        int i9 = i6 >= 0 ? i4 - i6 : -i8;
        int i10 = i7 >= 0 ? i7 - i5 : 0;
        int i11 = i4 - i2;
        if (hqeVar != hqe.IME) {
            int i12 = i9 + i8 + i10;
            if (i12 == 0) {
                if (P.h == 1) {
                    P.ac();
                }
            } else if (i12 > 0 && P.h != 1) {
                P.ai(1);
            }
        }
        P.p().p(hqeVar, i8, i9, i10, i11);
        P.hO().e(hpb.IME_SELECTION_CHANGED, hqeVar);
        if (hqeVar == hqe.IME) {
            P.f.d();
        } else {
            P.f.f();
        }
        P.f.c();
        P.e.m(z);
        hpi hpiVar = P.e;
        if (!hpiVar.n()) {
            return;
        }
        hpiVar.c.fu(i2, i3, i4, i5);
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final void aJ() {
        hpr hprVar = this.F.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null || !li.e()) {
            return;
        }
        hprVar.e.k.f = false;
        hprVar.g.execute(new hob(a2, 7));
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final void aK(int i2) {
        if (i2 != 16908319 && i2 != 16908321 && i2 != 16908322) {
            if (i2 != 16908320) {
                return;
            }
            i2 = 16908320;
        }
        hpr hprVar = this.F.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        hprVar.g.execute(new dob(a2, i2, 8));
    }

    @Override // defpackage.hvo
    public final void aL(boolean z) {
        hfz k2;
        hfz k3;
        hox P = P();
        if (P != null) {
            P.ah();
        }
        bT();
        this.o.d();
        hum.a.b();
        if (P != null) {
            P.ad(null, false);
        }
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            hfw hfwVar = hfpVar.f;
            if (hfwVar == null) {
                hfpVar.h();
                hfpVar.g(null);
            } else {
                hfpVar.l = true;
                if (!hfwVar.aa() || !z) {
                    hfwVar.D();
                    hfpVar.g(null);
                    hfpVar.h();
                    hfpVar.m();
                } else {
                    if (hfwVar.Z() && hfwVar.W() && (k3 = hfwVar.k()) != null) {
                        k3.v();
                    }
                    hfpVar.h();
                    if (hfwVar.Z() && hfwVar.W() && (k2 = hfwVar.k()) != null) {
                        k2.O();
                    }
                }
                hfpVar.l = false;
                hfpVar.d(null);
            }
        }
        bs();
    }

    @Override // defpackage.gzb
    public final void aM(gza gzaVar) {
        this.aE.aM(gzaVar);
    }

    @Override // defpackage.hoy
    public final void aN(ice iceVar, hte hteVar) {
        this.I[iceVar.ordinal()].a.remove(hteVar);
    }

    @Override // defpackage.gzb
    public final void aO(gza gzaVar) {
        hsj hsjVar = this.aE;
        CursorAnchorInfo cursorAnchorInfo = hsjVar.d;
        if (cursorAnchorInfo != null) {
            gzaVar.a(cursorAnchorInfo);
            return;
        }
        if (hsjVar.b == null) {
            hsjVar.b = new qq();
        }
        hsjVar.b.add(gzaVar);
        hpx hpxVar = hsjVar.c;
        if (hpxVar == null || hsjVar.e) {
            return;
        }
        hpxVar.v(false, true);
    }

    @Override // defpackage.hsk
    public final void aP(ibz ibzVar, hov hovVar) {
        hou houVar = this.o;
        hox b2 = houVar == null ? null : houVar.b();
        if (b2 != null) {
            b2.ak(ibzVar, hovVar);
        }
    }

    public final void aQ() {
        this.X = false;
        aj();
        h();
        aB();
        setInputView(onCreateInputView());
        this.H.h(this.q);
        if (this.K != null) {
            bt(this.q);
        }
        this.O.set(false);
        bY();
    }

    @Override // defpackage.hoy
    public final void aR(String str) {
        bV(this.F, ham.b(str));
    }

    @Override // defpackage.hfq
    public final void aS(int i2) {
        bV(this.D, i2);
    }

    @Override // defpackage.hoy
    public final void aT(iay iayVar, int i2) {
        bW(this.F, iayVar, i2);
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final void aU(KeyEvent keyEvent) {
        this.F.m(keyEvent);
    }

    @Override // defpackage.hoy
    public final void aV(KeyEvent keyEvent) {
        this.D.m(keyEvent);
    }

    @Override // defpackage.hoy
    public final void aW(CharSequence charSequence, int i2) {
        this.F.n(charSequence, i2);
    }

    @Override // defpackage.hoy
    public final void aX(CharSequence charSequence, int i2, Object obj) {
        this.F.o(charSequence, i2, obj);
    }

    @Override // defpackage.hfq
    public final void aY(CharSequence charSequence) {
        this.D.n(charSequence, 1);
    }

    @Override // defpackage.hfq
    public final void aZ(View view) {
        KeyboardViewHolder keyboardViewHolder = this.t;
        if (keyboardViewHolder != null) {
            keyboardViewHolder.g(null, null, view, "", 0);
            this.ag = view != null;
            ca(ice.HEADER, false);
        }
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final imn aa() {
        imr imrVar = this.H;
        if (imrVar != null) {
            return imrVar;
        }
        throw new IllegalStateException("GIMS is not properly created!");
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final iss ab() {
        return i().a;
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final SoftKeyboardView ac(htd htdVar, ViewGroup viewGroup, int i2, int i3) {
        ist i4 = i();
        if (i3 == 0) {
            i3 = R.style.f193600_resource_name_obfuscated_res_0x7f1502bc;
        }
        i4.b = i3;
        hum humVar = hum.a;
        Context m = iin.m(this);
        SoftKeyboardView softKeyboardView = (SoftKeyboardView) humVar.b.get(i2);
        if (softKeyboardView == null) {
            if (viewGroup == null) {
                viewGroup = new FrameLayout(m);
            }
            softKeyboardView = (SoftKeyboardView) LayoutInflater.from(m).inflate(i2, viewGroup, false);
            humVar.b.put(i2, softKeyboardView);
        } else {
            htd htdVar2 = (htd) humVar.c.get(softKeyboardView);
            if (htdVar2 != htdVar && htdVar2 != null) {
                htdVar2.a(softKeyboardView);
            }
            softKeyboardView.h();
        }
        humVar.c.put(softKeyboardView, htdVar);
        return softKeyboardView;
    }

    @Override // defpackage.hoy
    public final lmz ad() {
        hqt b2 = hqp.b();
        if (b2 == null) {
            return lrr.a;
        }
        return b2.k();
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final List ae() {
        return hqr.b();
    }

    @Override // defpackage.gzb
    public final void af(gza gzaVar) {
        this.aE.af(gzaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag(hox hoxVar) {
        this.o.c(hoxVar);
    }

    @Override // defpackage.hoy
    public final void ah(ice iceVar, hte hteVar) {
        hub hubVar = this.I[iceVar.ordinal()];
        if (hubVar == null) {
            hubVar = new hub();
            this.s[iceVar.ordinal()].d = hubVar;
            this.I[iceVar.ordinal()] = hubVar;
        }
        hubVar.a.add(hteVar);
    }

    @Override // defpackage.hoy
    public final void ai() {
        hpr hprVar = this.F.g;
        if (hprVar == null) {
            return;
        }
        hprVar.c(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aj() {
        hub[] hubVarArr;
        this.o.close();
        ibu.a(this).b();
        for (hub hubVar : this.I) {
            if (hubVar != null) {
                hubVar.a.clear();
            }
        }
    }

    @Override // defpackage.hoy
    public final void ak() {
        hpr hprVar = this.F.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        idn a3 = hprVar.f.a(hpv.IC_CLEAR_TEXT_BOX);
        hprVar.c("ICA.clearTextBox");
        hprVar.e.s("", 1);
        hprVar.e.t(0, 0);
        hprVar.e.r(Integer.MAX_VALUE, Integer.MAX_VALUE);
        hprVar.g.execute(new hob(a2, 8));
        hprVar.p(a3, hpv.IC_REPLACE_TEXT_BACKGROUND, "ICA.clearTextBox");
    }

    @Override // defpackage.hoy
    public final void am(CharSequence charSequence, boolean z, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        hpx hpxVar = this.F;
        if (!z) {
            hpxVar.i(charSequence2, i2);
            return;
        }
        hpr hprVar = hpxVar.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        idn a3 = hprVar.f.a(hpv.IC_COMMIT_AC);
        hprVar.c("IC.commitAutoCorrection");
        hqg hqgVar = hprVar.e;
        int e2 = hqgVar.e();
        int b2 = hqgVar.b();
        hprVar.e.q(charSequence2, i2);
        hprVar.g.execute(new dfe(a2, e2 - b2, charSequence2, i2, 4));
        hprVar.p(a3, hpv.IC_COMMIT_AC_BACKGROUND, "IC.commitAutoCorrection");
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void an(CharSequence charSequence) {
        this.D.i(charSequence, 1);
    }

    @Override // defpackage.hoy
    public final void ao() {
        hpx hpxVar = this.F;
        hqd g2 = hpxVar.e.g();
        if (g2.a()) {
            return;
        }
        hpxVar.g.f(g2.a, g2.b);
    }

    @Override // defpackage.hoy
    public final void ap(int i2, int i3) {
        this.F.g.g(i2, i3);
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void aq() {
        int i2 = this.am;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.am = i3;
            if (i3 != 0) {
                return;
            }
            Window window = getWindow().getWindow();
            if (window == null) {
                ((ltd) g.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "disableBackgroundAppDim", 4542, "GoogleInputMethodService.java")).t("IME is not attached to a window, cannot disable background application dim");
            } else {
                window.clearFlags(2);
            }
        }
    }

    public final void ar(boolean z) {
        if (z) {
            bU();
        }
        this.o.d();
        hum.a.b();
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            hfpVar.h();
        }
    }

    public final void as() {
        this.aE.aM(this.aK);
        FloatingCandidatesWindow floatingCandidatesWindow = this.u;
        if (floatingCandidatesWindow != null) {
            floatingCandidatesWindow.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x013d, code lost:
        if (r5 != null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038f A[Catch: all -> 0x0224, TryCatch #1 {all -> 0x043e, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:10:0x001c, B:12:0x0020, B:17:0x0026, B:18:0x002e, B:20:0x0034, B:23:0x003e, B:31:0x0046, B:33:0x004c, B:35:0x0053, B:37:0x0057, B:38:0x0059, B:41:0x0062, B:43:0x0066, B:46:0x006d, B:48:0x0071, B:50:0x0083, B:51:0x0088, B:52:0x0086, B:55:0x0093, B:57:0x0099, B:59:0x00a1, B:61:0x00b3, B:62:0x00b5, B:65:0x00bd, B:66:0x00c2, B:67:0x00c7, B:68:0x00ce, B:71:0x00d3, B:73:0x00d7, B:76:0x00e1, B:78:0x00e7, B:80:0x00ef, B:84:0x0115, B:86:0x011b, B:87:0x0129, B:88:0x00f8, B:92:0x0139, B:94:0x013f, B:97:0x0147, B:99:0x014d, B:102:0x0155, B:103:0x0176, B:105:0x017c, B:108:0x0188, B:109:0x01b1, B:111:0x01b5, B:112:0x01ce, B:114:0x01d4, B:115:0x01ef, B:117:0x01f5, B:118:0x020c, B:134:0x0256, B:136:0x025a, B:138:0x0266, B:139:0x0269, B:140:0x026b, B:211:0x03fe, B:213:0x0402, B:215:0x040e, B:216:0x0411, B:120:0x0219, B:123:0x022b, B:124:0x022e, B:126:0x0236, B:127:0x0242, B:129:0x0248, B:142:0x0273, B:144:0x027b, B:147:0x0281, B:161:0x02af, B:163:0x02b3, B:165:0x02b7, B:167:0x02bd, B:169:0x02c1, B:170:0x02c6, B:171:0x02ca, B:173:0x02ce, B:175:0x02d2, B:177:0x02da, B:180:0x02e6, B:181:0x02f5, B:182:0x02fa, B:184:0x0302, B:190:0x0383, B:193:0x038f, B:195:0x0398, B:197:0x03aa, B:199:0x03b7, B:200:0x03e7, B:202:0x03ef, B:204:0x03f3, B:206:0x03f9, B:207:0x03c4, B:209:0x03cc, B:217:0x0311, B:219:0x0315, B:221:0x0319, B:223:0x0321, B:224:0x0327, B:226:0x032d, B:227:0x0336, B:229:0x033c, B:230:0x0347, B:232:0x034b, B:234:0x034f, B:235:0x0360, B:237:0x036a, B:238:0x036e, B:239:0x0374, B:241:0x0378), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0402 A[Catch: all -> 0x043e, TryCatch #1 {all -> 0x043e, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:10:0x001c, B:12:0x0020, B:17:0x0026, B:18:0x002e, B:20:0x0034, B:23:0x003e, B:31:0x0046, B:33:0x004c, B:35:0x0053, B:37:0x0057, B:38:0x0059, B:41:0x0062, B:43:0x0066, B:46:0x006d, B:48:0x0071, B:50:0x0083, B:51:0x0088, B:52:0x0086, B:55:0x0093, B:57:0x0099, B:59:0x00a1, B:61:0x00b3, B:62:0x00b5, B:65:0x00bd, B:66:0x00c2, B:67:0x00c7, B:68:0x00ce, B:71:0x00d3, B:73:0x00d7, B:76:0x00e1, B:78:0x00e7, B:80:0x00ef, B:84:0x0115, B:86:0x011b, B:87:0x0129, B:88:0x00f8, B:92:0x0139, B:94:0x013f, B:97:0x0147, B:99:0x014d, B:102:0x0155, B:103:0x0176, B:105:0x017c, B:108:0x0188, B:109:0x01b1, B:111:0x01b5, B:112:0x01ce, B:114:0x01d4, B:115:0x01ef, B:117:0x01f5, B:118:0x020c, B:134:0x0256, B:136:0x025a, B:138:0x0266, B:139:0x0269, B:140:0x026b, B:211:0x03fe, B:213:0x0402, B:215:0x040e, B:216:0x0411, B:120:0x0219, B:123:0x022b, B:124:0x022e, B:126:0x0236, B:127:0x0242, B:129:0x0248, B:142:0x0273, B:144:0x027b, B:147:0x0281, B:161:0x02af, B:163:0x02b3, B:165:0x02b7, B:167:0x02bd, B:169:0x02c1, B:170:0x02c6, B:171:0x02ca, B:173:0x02ce, B:175:0x02d2, B:177:0x02da, B:180:0x02e6, B:181:0x02f5, B:182:0x02fa, B:184:0x0302, B:190:0x0383, B:193:0x038f, B:195:0x0398, B:197:0x03aa, B:199:0x03b7, B:200:0x03e7, B:202:0x03ef, B:204:0x03f3, B:206:0x03f9, B:207:0x03c4, B:209:0x03cc, B:217:0x0311, B:219:0x0315, B:221:0x0319, B:223:0x0321, B:224:0x0327, B:226:0x032d, B:227:0x0336, B:229:0x033c, B:230:0x0347, B:232:0x034b, B:234:0x034f, B:235:0x0360, B:237:0x036a, B:238:0x036e, B:239:0x0374, B:241:0x0378), top: B:2:0x0006 }] */
    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void at(defpackage.hfd r19) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.at(hfd):void");
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(new gyx(context));
        this.w = hrx.y(context);
    }

    @Override // defpackage.hsk
    public final void au(Printer printer, boolean z) {
        printer.println("\nDump Time : ".concat(String.valueOf(DateUtils.formatDateTime(this, System.currentTimeMillis(), 17))));
        printer.println("Version Info :");
        int e2 = jam.e(this);
        printer.println("VersionCode = " + e2);
        printer.println("VersionName = ".concat(String.valueOf(jam.l(this))));
        boolean D = jam.D(this);
        printer.println("isWorkProfile = " + D);
        printer.println("");
        gzt.a.dump(printer, z);
        gzv[] gzvVarArr = {new dcl(this), new gzs(this), new iff(this, ieh.j())};
        gzw gzwVar = new gzw(printer);
        for (int i2 = 0; i2 < 3; i2++) {
            gzu.b(printer, gzwVar, gzvVarArr[i2], z);
        }
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void av() {
        if (this.am == 0) {
            Window window = getWindow().getWindow();
            if (window == null) {
                ((ltd) g.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "enableBackgroundAppDim", 4525, "GoogleInputMethodService.java")).t("IME is not attached to a window, cannot enable background application dim");
            } else {
                window.setDimAmount(0.43f);
                window.addFlags(2);
            }
        }
        this.am++;
    }

    @Override // defpackage.hoy
    public final void aw() {
        hpr hprVar = this.F.g;
        if (hprVar == null) {
            return;
        }
        hprVar.h(null);
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final void ax() {
        this.F.j();
    }

    @Override // defpackage.hfq
    public final void ay() {
        this.D.j();
    }

    @Override // defpackage.hsk, defpackage.hoy
    public final void az() {
        requestHideSelf(0);
    }

    protected LayoutInflater b() {
        throw null;
    }

    public final boolean bA() {
        return y() == 3;
    }

    public final boolean bB() {
        hou houVar = this.o;
        return houVar != null && houVar.k();
    }

    @Override // defpackage.hoy
    public final boolean bC(int i2, int i3, CharSequence charSequence, boolean z) {
        int i4;
        CharSequence charSequence2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i2;
        int i11 = i3;
        hpx hpxVar = this.F;
        hqd g2 = hpxVar.e.g();
        hqd f2 = hpxVar.e.f();
        int i12 = g2.b;
        int i13 = g2.a;
        int i14 = i12 - i13;
        int i15 = i13 - f2.a;
        int i16 = f2.b - i13;
        if (i10 + i11 + i14 >= 0) {
            idn a2 = hpxVar.h.a(hpv.IC_REPLACE_TEXT);
            hpxVar.g.c("ICW.replaceText");
            int i17 = g2.a;
            if (i10 > i17) {
                i10 = i17;
            }
            int i18 = g2.b;
            if ((-i11) > i18) {
                i11 = -i18;
            }
            if ((-i10) + i17 > 2147483647L) {
                i10 = -(Integer.MAX_VALUE - i17);
            }
            if (i11 + i18 > 2147483647L) {
                i11 = Integer.MAX_VALUE - i18;
            }
            hpxVar.g.i();
            if (i14 != 0) {
                hpr hprVar = hpxVar.g;
                int i19 = g2.a;
                hprVar.o(i19, i19);
                i11 += i14;
            }
            CharSequence charSequence3 = "";
            if (i11 < 0) {
                i4 = 1;
                charSequence2 = hpx.f(hpxVar.e(-i11, 1));
            } else {
                i4 = 1;
                charSequence2 = charSequence3;
            }
            if (i10 < 0) {
                charSequence3 = hpx.f(hpxVar.d(-i10, i4));
            }
            int length = charSequence != null ? charSequence.length() : 0;
            if (i10 >= 0) {
                int i20 = g2.a;
                i5 = (i10 <= i20 ? i20 - i10 : 0) + length + charSequence2.length();
            } else {
                i5 = g2.a;
            }
            if (i11 > 0 && (i9 = -i10) < i14) {
                i14 = ((i10 >= 0 || i11 >= i14) ? 0 : length) + (i14 - (Math.min(i11, i14) - Math.max(0, i9)));
            }
            if (z) {
                int length2 = charSequence == null ? 0 : charSequence.length();
                if (i10 >= 0) {
                    i16 = -charSequence2.length();
                    i7 = length2 - i16;
                } else {
                    int i21 = -charSequence3.length();
                    i16 = length2 - i21;
                    i7 = i21;
                }
            } else if ((i10 < i15 && i10 > (-i16)) || ((i11 > (i6 = -i15) && i11 < i16) || (i10 >= i15 && i11 >= i16))) {
                i7 = 0;
                i16 = 0;
            } else if (i10 >= 0 && i10 <= (-i16)) {
                int i22 = g2.a;
                i7 = (i5 - i22) + i15;
                i16 += i22 - i5;
            } else if (i11 <= 0 || i11 > i6) {
                i7 = i15;
            } else {
                int i23 = g2.a;
                i7 = i5 - ((((i23 - i15) + length) - i11) - i10);
                i16 = ((((i23 + i16) + length) - i11) - i10) - i5;
            }
            if (i10 > 0 || i11 > 0) {
                hpxVar.g.g(Math.max(i10, 0), Math.max(i11, 0));
            }
            if (charSequence3.length() > 0) {
                i8 = 1;
                hpxVar.g.e(charSequence3, 1);
            } else {
                i8 = 1;
            }
            if (charSequence != null && length > 0) {
                hpxVar.g.e(charSequence, i8);
            }
            if (charSequence2.length() > 0) {
                hpxVar.g.e(charSequence2, i8);
            }
            int i24 = i14 + i5;
            hqd g3 = hpxVar.e.g();
            if (g3.a != i5 || g3.b != i24) {
                hpxVar.g.o(i5, i24);
            }
            int i25 = i7 + i16;
            if (i25 != 0) {
                hpxVar.g.l(i5 - i7, i5 + i16);
            }
            hpxVar.g.p(a2, hpv.IC_REPLACE_TEXT_BACKGROUND, "ICW.replaceText");
            if (i25 != 0) {
                return true;
            }
        } else if (i15 + i16 != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hoy
    public final boolean bD(int i2, int i3) {
        hpx hpxVar = this.F;
        hqd g2 = hpxVar.e.g();
        int i4 = g2.a - i2;
        int i5 = g2.b + i3;
        if (i4 < 0 || i4 > i5) {
            return false;
        }
        if (i4 == i5) {
            hpxVar.g.i();
        } else {
            hpxVar.g.l(i4, i5);
        }
        return i4 != i5;
    }

    @Override // defpackage.hoy
    public final boolean bE() {
        return bF(hqp.b()) && !cc();
    }

    public final boolean bF(hqt hqtVar) {
        gzr gzrVar;
        iav g2 = hqtVar != null ? hqtVar.g() : null;
        return !gzq.b(this, true).equals("foldable") && (getResources().getBoolean(R.bool.f20630_resource_name_obfuscated_res_0x7f050091) || (((Boolean) hwq.l.c()).booleanValue() && getResources().getBoolean(R.bool.f19570_resource_name_obfuscated_res_0x7f050022))) && this.p == iau.SOFT && (((gzrVar = this.aG) == null || !gzrVar.g()) && (g2 == null || g2.f.i));
    }

    @Override // defpackage.hoy
    public final boolean bH(int i2, int i3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        int i4;
        hpx hpxVar = this.F;
        if (i2 >= 0 && i3 >= 0) {
            hqd g2 = hpxVar.e.g();
            hqd f2 = hpxVar.e.f();
            int abs = Math.abs(g2.a - f2.a);
            int abs2 = Math.abs(f2.b - g2.b);
            idn a2 = hpxVar.h.a(hpv.IC_UPDATE_TEXT);
            hpxVar.g.c("ICW.updateText");
            boolean z = !g2.a();
            if (!z || i2 != 0 || i3 != 0 || charSequence3.length() != 0) {
                if (!z && i2 == 0 && i3 == 0 && abs2 == 0) {
                    if (charSequence.length() <= 0 || charSequence3.length() != 0 || TextUtils.isEmpty(charSequence2)) {
                        abs2 = 0;
                    } else {
                        hpxVar.g.d(new CorrectionInfo(f2.a, "", charSequence2));
                        hpxVar.g.e(charSequence, 1);
                        hpxVar.g.n(charSequence4, charSequence5, g2.a);
                    }
                }
                if (z) {
                    hpxVar.g.f(g2.a, g2.b);
                } else {
                    hpxVar.g.i();
                    if (abs > 0 || abs2 > 0) {
                        hpxVar.g.g(abs, abs2);
                    }
                }
                int i5 = g2.a - abs;
                if (i2 > 0 || i3 > 0) {
                    hpxVar.g.g(i2, i3);
                    i5 -= i2;
                }
                if (charSequence.length() > 0) {
                    if (!TextUtils.isEmpty(charSequence2)) {
                        hpxVar.g.d(new CorrectionInfo(f2.a, "", charSequence2));
                    }
                    i4 = 1;
                    hpxVar.g.e(charSequence, 1);
                    i5 += charSequence.length();
                } else {
                    i4 = 1;
                }
                if (charSequence3.length() > 0) {
                    hpxVar.g.e(charSequence3, i4);
                    hpxVar.g.o(i5, i5);
                }
                hpxVar.g.n(charSequence4, charSequence5, i5);
                hpxVar.g.p(a2, hpv.IC_UPDATE_TEXT_BACKGROUND, "ICW.updateText");
                return true;
            }
            CharSequence concat = TextUtils.concat(charSequence, charSequence4);
            if (!TextUtils.isEmpty(concat)) {
                hpxVar.g.e(concat, 1);
            } else {
                hpxVar.g.f(g2.a, g2.b);
            }
            int length = g2.a + concat.length();
            int length2 = length - charSequence4.length();
            if (length2 != length) {
                hpxVar.g.l(length2, length);
            } else {
                hpxVar.g.i();
            }
            hpxVar.g.p(a2, hpv.IC_UPDATE_TEXT_BACKGROUND, "ICW.updateText");
            return true;
        }
        return false;
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final ExtractedText bJ() {
        return this.F.u();
    }

    @Override // defpackage.hfq
    public final ExtractedText bK() {
        return this.D.u();
    }

    @Override // defpackage.hfq
    public final CharSequence bL() {
        return this.D.e.i(0);
    }

    @Override // defpackage.hoy
    public final CharSequence bM(int i2) {
        return this.F.d(i2, 0);
    }

    @Override // defpackage.hoy
    public final CharSequence bN(int i2) {
        return this.F.e(i2, 0);
    }

    @Override // defpackage.hfq
    public final CharSequence bO() {
        return this.D.e(1, 0);
    }

    @Override // defpackage.hoz
    public final void bP() {
    }

    @Override // defpackage.hsk
    public final boolean bR(final aqq aqqVar) {
        final EditorInfo c2;
        final int i2;
        mko hQ;
        hpx hpxVar = this.D;
        if (!this.N && (c2 = hpxVar.c()) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Build.VERSION.SDK_INT >= 25) {
                i2 = 1;
            } else {
                grantUriPermission(c2.packageName, aqqVar.f(), 1);
                i2 = 0;
            }
            hpr hprVar = hpxVar.g;
            final InputConnection a2 = hprVar.a();
            if (a2 == null) {
                hQ = kcu.K(Boolean.FALSE);
            } else {
                hQ = hprVar.g.hQ(new Callable(a2, c2, aqqVar, i2, null) { // from class: hpn
                    public final /* synthetic */ InputConnection a;
                    public final /* synthetic */ EditorInfo b;
                    public final /* synthetic */ int c;
                    public final /* synthetic */ aqq d;

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 237
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpn.call():java.lang.Object");
                    }
                });
            }
            Boolean bool = (Boolean) hpx.h(hQ, Boolean.FALSE, false, hpxVar.h, 9, ((Long) hpx.c.c()).longValue(), null, null);
            hpx.l(hpxVar.h, hpv.IC_COMMIT_CONTENT, SystemClock.elapsedRealtime() - elapsedRealtime);
            return bool != null && bool.booleanValue();
        }
        return false;
    }

    @Override // defpackage.hsk
    public final void bS(opu opuVar) {
        this.aO = opuVar;
    }

    @Override // defpackage.hfq
    public final void ba(boolean z) {
        this.ah = z;
        ca(ice.HEADER, false);
    }

    @Override // defpackage.hsk
    public final void bb(hwp hwpVar) {
        this.aB = hwpVar;
    }

    @Override // defpackage.hoy
    public final void bc(ice iceVar, View view) {
        boolean z = true;
        if (view != null) {
            this.X = true;
        }
        hox P = P();
        ibm ibmVar = null;
        String ab = P != null ? P.ab() : null;
        if (P != null) {
            ibmVar = P.e.e;
        }
        KeyboardViewHolder keyboardViewHolder = this.s[iceVar.ordinal()];
        if (keyboardViewHolder != null) {
            keyboardViewHolder.g(Y(), iceVar, view, ab, ibmVar == null ? 0 : ibmVar.b);
            boolean[] zArr = this.af;
            int ordinal = iceVar.ordinal();
            if (view == null) {
                z = false;
            }
            zArr[ordinal] = z;
            ca(iceVar, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        if (r1 != false) goto L17;
     */
    @Override // defpackage.hoy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bd(defpackage.ice r10, defpackage.hth r11) {
        /*
            r9 = this;
            ltg r0 = defpackage.dcu.g
            ltv r1 = r0.b()
            ltd r1 = (defpackage.ltd) r1
            java.lang.String r2 = "com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService"
            java.lang.String r3 = "setKeyboardViewShown"
            r4 = 3513(0xdb9, float:4.923E-42)
            java.lang.String r5 = "GoogleInputMethodService.java"
            ltv r1 = r1.k(r2, r3, r4, r5)
            ltd r1 = (defpackage.ltd) r1
            java.lang.String r4 = "setKeyboardViewShown() : type = %s, shownType = %s"
            r1.G(r4, r10, r11)
            boolean r1 = r9.au
            r4 = 1
            r6 = 0
            if (r1 == 0) goto L2b
            ice r1 = defpackage.ice.HEADER
            if (r10 != r1) goto L2b
            boolean r1 = r9.at
            if (r1 == 0) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            hth r7 = defpackage.hth.SHOW_OPTIONAL
            int r7 = r11.ordinal()
            if (r7 == 0) goto L60
            if (r7 == r4) goto L5b
            r8 = 2
            if (r7 == r8) goto L55
            r4 = 3
            if (r7 != r4) goto L41
            if (r1 == 0) goto L62
            r9.at = r6
            goto L62
        L41:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "Unexpected value: "
            java.lang.String r11 = r0.concat(r11)
            r10.<init>(r11)
            throw r10
        L55:
            if (r1 == 0) goto L63
            r9.at = r6
            r6 = 1
            goto L63
        L5b:
            if (r1 == 0) goto L63
            r9.at = r6
            goto L63
        L60:
            if (r1 == 0) goto L63
        L62:
            r4 = 0
        L63:
            ltv r11 = r0.b()
            ltd r11 = (defpackage.ltd) r11
            r0 = 3560(0xde8, float:4.989E-42)
            ltv r11 = r11.k(r2, r3, r0, r5)
            ltd r11 = (defpackage.ltd) r11
            java.lang.String r0 = "setKeyboardViewShown() : shouldShow = %b"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r11.w(r0, r1)
            boolean[] r11 = r9.af
            int r0 = r10.ordinal()
            r11[r0] = r4
            r9.ca(r10, r6)
            ice r11 = defpackage.ice.FLOATING_CANDIDATES
            if (r10 != r11) goto L9d
            if (r4 == 0) goto L9a
            hsj r10 = r9.aE
            gza r11 = r9.aK
            r10.af(r11)
            com.google.android.apps.inputmethod.libs.framework.core.FloatingCandidatesWindow r10 = r9.u
            if (r10 == 0) goto L9d
            r10.show()
            return
        L9a:
            r9.as()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.bd(ice, hth):void");
    }

    @Override // defpackage.hsk
    public final void be(boolean z, ice iceVar) {
        this.av[iceVar.ordinal()] = !z;
        ca(iceVar, false);
    }

    @Override // defpackage.hsk
    public final void bf(gzr gzrVar) {
        gzr gzrVar2 = this.aG;
        if (gzrVar2 != null && gzrVar != null && gzrVar2 != gzrVar) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "setOEMSpecialDeviceModeManager", 4578, "GoogleInputMethodService.java")).G("Sets a different manager %s to override previous one %s is not allowed", gzrVar, this.aG);
        }
        this.aG = gzrVar;
    }

    @Override // defpackage.hoy
    public final void bg(int i2) {
        hvp hvpVar = this.K;
        if (hvpVar != null) {
            hvpVar.i(i2, true);
        }
    }

    @Override // defpackage.hsk
    public final void bh(hsl hslVar) {
        hsl hslVar2 = this.aA;
        if (hslVar2 != null && hslVar != null && hslVar2 != hslVar) {
            ((ltd) ((ltd) g.c()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "setPlatformSuggestionsHandler", 688, "GoogleInputMethodService.java")).G("Sets a different handler %s to override previous one %s is not allowed", hslVar, this.aA);
        }
        this.aA = hslVar;
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final void bi(int i2, int i3) {
        this.F.q(i2, i3);
    }

    @Override // defpackage.hoy
    public final void bj(CharSequence charSequence) {
        CharSequence a2;
        Window window = getWindow().getWindow();
        if (window != null) {
            if (TextUtils.isEmpty(charSequence)) {
                a2 = getString(R.string.ime_name);
            } else {
                a2 = this.aj.a(charSequence);
            }
            window.setTitle(a2);
        }
    }

    @Override // defpackage.hsk
    public final void bk() {
        if (Build.VERSION.SDK_INT >= 28) {
            h.a("requestShowSelf()");
            requestShowSelf(0);
            return;
        }
        jaq jaqVar = this.x;
        if (jaqVar == null) {
            return;
        }
        IBinder a2 = jaqVar.a();
        InputMethodManager inputMethodManager = jaqVar.c;
        if (inputMethodManager == null || a2 == null) {
            return;
        }
        inputMethodManager.showSoftInputFromInputMethod(a2, 0);
    }

    @Override // defpackage.hoy
    public final void bl(String str) {
        this.o.h(str);
    }

    @Override // defpackage.hoy
    public final void bm(jav javVar) {
        this.o.i(javVar);
    }

    @Override // defpackage.hoy
    public final void bn(hox hoxVar) {
        this.o.m(hoxVar);
    }

    @Override // defpackage.hoy
    public final void bo() {
        ifh.b(ifh.c);
        if (this.w.r(false) || u()) {
            return;
        }
        ifh.a();
    }

    public final void bp(List list) {
        int length = this.s.length;
        while (true) {
            length--;
            if (length >= 0) {
                KeyboardViewHolder keyboardViewHolder = this.s[length];
                if (keyboardViewHolder != null && list.contains(keyboardViewHolder.a)) {
                    keyboardViewHolder.removeAllViews();
                }
            } else {
                return;
            }
        }
    }

    public final void bq(int i2) {
        this.aF.cancel(false);
        irs.c(this);
        boolean d2 = irs.d();
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "updateDeviceLockedStatus", 2166, "GoogleInputMethodService.java")).A("repeatCheckTimes = %d, unlocked = %b", i2, d2);
        if (i2 <= 0 || d2) {
            return;
        }
        this.aF = gyc.b.a(new dob(this, i2, 1), 1L, TimeUnit.SECONDS);
    }

    @Override // defpackage.hsk, defpackage.hfq
    public final void br(hpu hpuVar, boolean z) {
        boolean z2;
        hpx hpxVar;
        hfp hfpVar;
        if (this.N) {
            return;
        }
        if (hpuVar == null) {
            hpxVar = this.D;
            this.E.p(null);
            z2 = false;
        } else {
            hpu hpuVar2 = this.E.f;
            z2 = (hpuVar2 != null ? hpuVar2.b() : null) != hpuVar.b();
            hpx hpxVar2 = this.E;
            hpxVar2.p(hpuVar);
            hpxVar = hpxVar2;
        }
        if (!z2 && this.F == hpxVar && !z) {
            return;
        }
        boolean bB = bB();
        this.o.e();
        boolean z3 = hpxVar == this.D;
        this.F = hpxVar;
        if (bB) {
            EditorInfo c2 = hpxVar.c();
            if (!z3) {
                this.F.k(this, c2, false);
                this.F.r();
            }
            this.aE.a(hpxVar);
            if (c2 != null) {
                this.o.j(c2, true);
            }
            this.o.g();
            if (c2 != null && (hfpVar = this.R) != null && hfpVar.k) {
                for (hfw hfwVar : hfpVar.b()) {
                    hfx j2 = hfwVar.j();
                    if (j2 != null && hfwVar.i != c2) {
                        j2.j(c2, z3);
                        hfwVar.i = null;
                    }
                }
            }
            if (c2 != null) {
                if (z3) {
                    hsu.d(c2, true, bu());
                } else {
                    hsu.e(getCurrentInputEditorInfo(), c2, true, bu());
                }
            }
        }
        boolean z4 = !z3;
        hpr hprVar = this.D.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null || !li.e() || !((Boolean) hpr.b.c()).booleanValue()) {
            return;
        }
        hprVar.g.execute(new bdx(a2, z4, 6));
    }

    public final void bs() {
        int d2;
        InputView inputView = this.q;
        if (inputView == null || (d2 = U().d()) == inputView.getPaddingBottom()) {
            return;
        }
        inputView.setPadding(inputView.getPaddingLeft(), inputView.getPaddingTop(), inputView.getPaddingRight(), d2);
    }

    public final void bt(View view) {
        hvk hvkVar;
        View view2;
        hqt b2 = hqp.b();
        hvp hvpVar = this.K;
        boolean bF = bF(b2);
        boolean bG = bG(b2);
        ((ltd) ((ltd) hvp.a.b()).k("com/google/android/libraries/inputmethod/keyboardmode/KeyboardModeManager", "setInputView", 357, "KeyboardModeManager.java")).w("setInputView() : supportsOneHandedMode=%b", Boolean.valueOf(bF));
        int f2 = hyq.f();
        hwi hwiVar = hvpVar.e;
        if (hwiVar.k(hwiVar.d(hvpVar.n))) {
            if (f2 != 2) {
                hvpVar.l(2);
            }
        } else if (f2 == 2) {
            hvpVar.l(1);
        }
        hvx hvxVar = hvpVar.c;
        hvxVar.j = view;
        View view3 = hvxVar.k;
        hvxVar.p = view != null ? view.findViewById(R.id.f57520_resource_name_obfuscated_res_0x7f0b0428) : null;
        View findViewById = view != null ? view.findViewById(R.id.f57510_resource_name_obfuscated_res_0x7f0b0427) : null;
        if (view3 != findViewById) {
            if (view3 != null && (view2 = hvxVar.q) != null) {
                ((ViewGroup) view3).removeView(view2);
            }
            hvxVar.k = findViewById;
            View view4 = hvxVar.k;
            if (view4 == null) {
                hvxVar.l = null;
                hvxVar.t = null;
                hvxVar.m = null;
                hvxVar.n = null;
                KeyboardHolder keyboardHolder = hvxVar.o;
                if (keyboardHolder != null) {
                    keyboardHolder.removeOnLayoutChangeListener(hvxVar.e);
                    hvxVar.o.removeCallbacks(hvxVar.d);
                }
                hvxVar.o = null;
                hvxVar.q = null;
                hvxVar.r = null;
                hvxVar.s = null;
                lgb lgbVar = hvx.c;
                hvxVar.v = lgbVar;
                hvxVar.w = lgbVar;
            } else {
                hvxVar.l = (jdm) view4.findViewById(R.id.keyboard_header_view_holder);
                hvxVar.t = (jdm) hvxVar.k.findViewById(R.id.f54740_resource_name_obfuscated_res_0x7f0b01c2);
                hvxVar.m = (KeyboardViewHolder) hvxVar.k.findViewById(R.id.f58150_resource_name_obfuscated_res_0x7f0b0469);
                hvxVar.n = hvxVar.k.findViewById(R.id.f57640_resource_name_obfuscated_res_0x7f0b0436);
                hvxVar.r = hvxVar.k.findViewById(R.id.f58170_resource_name_obfuscated_res_0x7f0b046b);
                hvxVar.s = hvxVar.k.findViewById(R.id.f58160_resource_name_obfuscated_res_0x7f0b046a);
                hvxVar.o = (KeyboardHolder) hvxVar.k.findViewById(R.id.keyboard_holder);
                KeyboardHolder keyboardHolder2 = hvxVar.o;
                if (keyboardHolder2 != null) {
                    keyboardHolder2.addOnLayoutChangeListener(hvxVar.e);
                }
                View view5 = hvxVar.s;
                if (view5 != null) {
                    view5.setOnHoverListener(btz.e);
                }
                hvxVar.k();
                hvxVar.q = null;
                hvxVar.v = hvx.h(hvxVar.f, (ViewGroup) hvxVar.k, R.layout.f134780_resource_name_obfuscated_res_0x7f0e00bf);
                hvxVar.w = hvx.h(hvxVar.f, (ViewGroup) hvxVar.k, R.layout.f142470_resource_name_obfuscated_res_0x7f0e03fc);
            }
        }
        hwa hwaVar = hvpVar.d;
        hwaVar.g = view;
        hwaVar.i = hwaVar.d.d();
        hwaVar.k();
        hwaVar.l();
        if (view != null) {
            hwaVar.f.m();
        }
        hwi hwiVar2 = hvpVar.e;
        hwiVar2.g = view;
        hwj hwjVar = hwiVar2.a;
        if (hwjVar.f != view) {
            hwjVar.f = view;
            hwjVar.g = view != null ? view.findViewById(R.id.keyboard_holder) : null;
            hvt hvtVar = hwjVar.d;
            View view6 = hvtVar.e;
            View findViewById2 = view != null ? view.findViewById(R.id.f57510_resource_name_obfuscated_res_0x7f0b0427) : null;
            if (view6 != findViewById2) {
                hvtVar.e = findViewById2;
                if (hvtVar.e == null) {
                    lgb lgbVar2 = hvt.a;
                    hvtVar.c = lgbVar2;
                    hvtVar.d = lgbVar2;
                } else {
                    hvtVar.c = jdg.n(new hvs(hvtVar, hwjVar, 1));
                    hvtVar.d = jdg.n(new hvs(hvtVar, hwjVar, 0));
                }
            }
            hwg hwgVar = hwjVar.c;
            hwgVar.h = view;
            hwgVar.c = null;
            View view7 = hwgVar.i;
            if (view7 != null) {
                view7.removeOnLayoutChangeListener(hwgVar.C);
                hwgVar.i.removeCallbacks(hwgVar.D);
            }
            MultiTouchDelegateView multiTouchDelegateView = hwgVar.f;
            if (multiTouchDelegateView != null) {
                multiTouchDelegateView.a();
            }
            hwgVar.f = null;
            hwgVar.i = null;
            hwgVar.r = null;
            hwgVar.s = null;
            hwgVar.t = null;
            hwgVar.j = null;
            hwgVar.k = null;
            hwgVar.l = null;
            hwgVar.m = null;
            hwgVar.n = null;
            hwgVar.o = null;
            hwgVar.p = null;
            hwgVar.q = null;
        }
        hvpVar.f.k(view);
        hvpVar.g.k(view);
        hvpVar.h.g = view;
        if (view != null) {
            hvpVar.g();
            int i2 = hvpVar.b;
            hvpVar.m(false);
            hvpVar.n(bF, false);
            hvpVar.o(bG, false);
            hvpVar.k();
            if (i2 == hvpVar.b && (hvkVar = hvpVar.k) != null) {
                hvkVar.f();
            }
        }
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "updateKeyboardModeManagerInputView", 987, "GoogleInputMethodService.java")).w("updateKeyboardModeManagerInputView() : entry=%s", b2);
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final boolean bu() {
        hnq hnqVar = this.L;
        return hnqVar != null && hnqVar.a;
    }

    @Override // defpackage.hsk
    public final boolean bv() {
        hox P = P();
        return P != null && P.d.D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean bw() {
        jls jlsVar = this.ac;
        return jlsVar != null && ((isr) jlsVar.a).b;
    }

    protected final boolean bx() {
        if (this.ar) {
            return true;
        }
        InputConnection currentInputConnection = getCurrentInputConnection();
        InputBinding currentInputBinding = getCurrentInputBinding();
        InputConnection connection = currentInputBinding != null ? currentInputBinding.getConnection() : null;
        return ((currentInputConnection == null && connection == null) || currentInputConnection == connection) ? false : true;
    }

    @Override // defpackage.hsk
    public final boolean by() {
        return this.aH;
    }

    @Override // defpackage.hoy
    public final boolean bz() {
        return false;
    }

    protected hff c() {
        throw null;
    }

    protected hff d() {
        throw null;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        au(new PrintWriterPrinter(printWriter), false);
    }

    public hfi e() {
        throw null;
    }

    protected iss f() {
        throw null;
    }

    public jav g(EditorInfo editorInfo) {
        throw null;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.ai == null) {
                this.ai = b();
            }
            return this.ai;
        }
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        isu isuVar = this.ae;
        if (isuVar == null) {
            synchronized (this) {
                isuVar = this.ae;
                if (isuVar == null) {
                    isuVar = new isu(getBaseContext(), i());
                    this.ae = isuVar;
                }
            }
        }
        return isuVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        throw null;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean isInputViewShown() {
        return Build.VERSION.SDK_INT >= 28 ? super.isInputViewShown() : super.isInputViewShown() && !cb();
    }

    protected void j(boolean z) {
        throw null;
    }

    protected void k() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
        Window window = getWindow().getWindow();
        if (window != null) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: dci
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    dcu dcuVar = dcu.this;
                    windowInsets.getStableInsetBottom();
                    WindowInsets windowInsets2 = dcuVar.l;
                    dcuVar.l = windowInsets;
                    if (dcuVar.q != null && (windowInsets2 == null || !windowInsets2.equals(dcuVar.l))) {
                        dcuVar.bs();
                    }
                    int e2 = gvv.e(dcuVar) - windowInsets.getStableInsetBottom();
                    Integer num = dcuVar.T;
                    if (num == null || e2 != num.intValue()) {
                        dcuVar.T = Integer.valueOf(e2);
                        ((ltd) ((ltd) dcu.g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "lambda$setDecorViewApplyWindowInsetsListener$10", 1157, "GoogleInputMethodService.java")).w("update screenHeightWithoutNaviBar to: %d", dcuVar.T);
                        dcuVar.updateFullscreenMode();
                        InputView inputView = dcuVar.q;
                        if (inputView != null) {
                            inputView.c(dcuVar.isFullscreenMode());
                        }
                        ((ltd) ((ltd) dcu.g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "lambda$setDecorViewApplyWindowInsetsListener$10", 1163, "GoogleInputMethodService.java")).t("update max height when insets changes");
                        return view.onApplyWindowInsets(windowInsets);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
        this.J = false;
        bT();
        this.w.n(this);
        this.x = new jaq(this);
        ((hrx) this.w).M();
        this.v = ino.M(this);
        this.H = new imr(this);
        this.S = new hxi();
        gzt.a.a(this.S);
        this.L = new hnq();
        hvp hvpVar = new hvp(this, this);
        hvpVar.e();
        imr imrVar = this.H;
        if (imrVar != null) {
            hvpVar.e.a.c.u = imrVar;
            hvpVar.f.l(imrVar);
            hvpVar.g.l(imrVar);
        }
        this.K = hvpVar;
        this.U.e(mjl.a);
        registerReceiver(this.G, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        knf knfVar = this.aL;
        hff c2 = c();
        hff d2 = d();
        knfVar.b(new hff(this) { // from class: dcg
            public final /* synthetic */ dcu a;

            {
                this.a = this;
            }

            @Override // defpackage.hff
            public final boolean a() {
                String c3;
                if (r2 == 0) {
                    return this.a.t();
                }
                dcu dcuVar = this.a;
                boolean u = dcuVar.u();
                if (!u || !ijl.b().f(hkq.class) || (c3 = dcuVar.P().d.c(iin.m(dcuVar))) == null) {
                    return u;
                }
                hky e2 = jdg.e(c3.toString(), false);
                e2.k(true);
                hkq.b(e2.a());
                return true;
            }
        }, 0, 204, 0);
        knfVar.b(new hff(this) { // from class: dcg
            public final /* synthetic */ dcu a;

            {
                this.a = this;
            }

            @Override // defpackage.hff
            public final boolean a() {
                String c3;
                if (r2 == 0) {
                    return this.a.t();
                }
                dcu dcuVar = this.a;
                boolean u = dcuVar.u();
                if (!u || !ijl.b().f(hkq.class) || (c3 = dcuVar.P().d.c(iin.m(dcuVar))) == null) {
                    return u;
                }
                hky e2 = jdg.e(c3.toString(), false);
                e2.k(true);
                hkq.b(e2.a());
                return true;
            }
        }, 1, 62, 0);
        if (c2 != null) {
            knfVar.b(c2, 0, 57, 0, 57, 1);
        }
        if (d2 != null) {
            knfVar.b(d2, 0, 58, 0, 58, 1);
        }
        this.O.set(false);
        this.v.Z(this.P, R.string.f160900_resource_name_obfuscated_res_0x7f14067a, R.string.f160940_resource_name_obfuscated_res_0x7f14067e, R.string.f161570_resource_name_obfuscated_res_0x7f1406be, R.string.f161550_resource_name_obfuscated_res_0x7f1406bc, R.string.f161030_resource_name_obfuscated_res_0x7f140687);
        this.aM = w();
        this.aw = igr.d(this);
        this.R = new hfp(this, this.aw, this);
        Arrays.fill(this.av, false);
        ijl.b().h(this.W, hsv.class, mjl.a);
        ijl.b().h(this.ab, isz.class, mjl.a);
        this.Y.d(mjl.a);
        this.Z.e(gyc.b);
        this.V.d(gyc.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(hqt hqtVar) {
        this.aj.a.a = hqtVar.a().getResources();
        Context a2 = hqtVar.a();
        imr imrVar = this.H;
        if (imrVar != null) {
            imrVar.a.c = a2;
            imrVar.b.c = a2;
            int a3 = hqtVar.i().a();
            imrVar.a.e = a3;
            imrVar.b.e = a3;
        }
        aj();
        ar(false);
        this.o.l();
        hvp hvpVar = this.K;
        if (hvpVar != null) {
            hvpVar.n(bF(hqtVar), true);
            this.K.o(bG(hqtVar), true);
        }
        aB();
        bY();
        hfp hfpVar = this.R;
        if (hfpVar == null || !this.A) {
            return;
        }
        hfpVar.l(false, true);
    }

    protected void n() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o() {
        throw null;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onAppPrivateCommand(String str, Bundle bundle) {
        h.a("onAppPrivateCommand(<action>, <data>)");
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        if (currentInputEditorInfo != null) {
            String concat = String.valueOf(currentInputEditorInfo.packageName).concat(".");
            if (str.startsWith(concat)) {
                str = str.substring(concat.length());
            }
        }
        ijl.b().g(new hsi(str, bundle));
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onBindInput() {
        h.a("onBindInput()");
        super.onBindInput();
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onComputeInsets(InputMethodService.Insets insets) {
        View view;
        h.e("onComputeInsets()");
        if (this.q == null || (view = this.r) == null) {
            super.onComputeInsets(insets);
            return;
        }
        View g2 = hyq.g(view, y());
        int i2 = 0;
        int d2 = bA() ? 0 : U().d();
        g2.getLocationInWindow(this.aI);
        Rect rect = this.aJ;
        int[] iArr = this.aI;
        int i3 = iArr[0];
        rect.set(i3, iArr[1], g2.getWidth() + i3, this.aI[1] + g2.getHeight() + d2);
        insets.visibleTopInsets = this.aJ.top;
        insets.contentTopInsets = insets.visibleTopInsets;
        imr imrVar = this.H;
        Region region = insets.touchableRegion;
        imp impVar = imrVar.a;
        region.setEmpty();
        Rect rect2 = new Rect();
        for (View view2 : impVar.f) {
            if (view2.isEnabled() && view2.getVisibility() == 0 && view2.getGlobalVisibleRect(rect2)) {
                region.union(rect2);
            }
        }
        insets.touchableRegion.union(this.aJ);
        insets.touchableInsets = 3;
        if (insets.contentTopInsets != 0 && !bA()) {
            return;
        }
        int height = this.q.getRootView().getHeight();
        WindowInsets windowInsets = this.l;
        if (windowInsets != null) {
            i2 = windowInsets.getSystemWindowInsetBottom();
        }
        int i4 = height - i2;
        insets.contentTopInsets = i4;
        insets.visibleTopInsets = i4;
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.N) {
            return;
        }
        ((ltd) ((ltd) g.d()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onConfigurationChanged", 1643, "GoogleInputMethodService.java")).w("onConfigurationChanged() : NewConfig = %s", configuration);
        gvv.i(this);
        h.b("onConfigurationChanged(%s)", configuration);
        this.o.e();
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            hfpVar.j();
        }
        ((hrx) this.w).p.a();
        int diff = configuration.diff(this.an);
        this.an.setTo(configuration);
        if ((diff & 4) != 0) {
            k();
        }
        int i2 = diff & (-76);
        if (i2 == 0) {
            bU();
        } else if ((i2 & (-49)) == 0) {
            h();
            iau X = X(configuration);
            if (this.p != X) {
                bX(X);
            }
        } else {
            aj();
            h();
            aB();
        }
        irn.g(this);
        ieh.j().e(idd.CONFIGURATION_CHANGE, E());
        super.onConfigurationChanged(configuration);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onConfigureWindow(Window window, boolean z, boolean z2) {
        h.c("onConfigureWindow(<window>, %b, %b)", Boolean.valueOf(z), Boolean.valueOf(z2));
        super.onConfigureWindow(window, z, z2);
        hox P = P();
        if (P != null) {
            P.e.f(137438953472L, z);
        }
        InputView inputView = this.q;
        if (inputView != null) {
            inputView.c(isFullscreenMode());
        }
        window.setLayout(-1, -1);
        this.aD.a = window.getDecorView();
    }

    @Override // android.inputmethodservice.InputMethodService, android.app.Service
    public final void onCreate() {
        hsp hspVar;
        Window window;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.N = false;
        h.a("onCreate()");
        super.onCreate();
        iav.a();
        this.o = new hpa(this, this);
        this.ar = jam.y();
        this.aj = new gpu(this);
        this.an.setTo(E());
        irn.g(this);
        l();
        ijl.b().g(new hsx(1, this));
        ijf.j(gwz.a);
        boolean bQ = bQ();
        ija b2 = ijf.b(new dbz(this, bQ, ijf.i(ino.a), 2), jai.a, ino.a, hrx.b, gwu.b);
        this.Q = b2;
        b2.e(mjl.a);
        gzq.b.e(this.ax);
        gzq.a.e(this.ax);
        if (((Boolean) c.c()).booleanValue() && (window = getWindow().getWindow()) != null) {
            window.getDecorView().getViewTreeObserver().addOnPreDrawListener(this.aC);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        ieh.j().g(hsq.IMS_ON_CREATE, elapsedRealtime2);
        ieh j2 = ieh.j();
        if (bQ) {
            hspVar = hsp.IMS_CREATED_AFTER_USER_UNLOCKED;
        } else {
            hspVar = hsp.IMS_CREATED_BEFORE_USER_UNLOCKED;
        }
        j2.e(hspVar, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateCandidatesView() {
        return null;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final InlineSuggestionsRequest onCreateInlineSuggestionsRequest(Bundle bundle) {
        hsl hslVar;
        int i2;
        LocaleList localeList;
        if (this.p == iau.SOFT && (hslVar = this.aA) != null) {
            Context m = iin.m(this);
            cfz cfzVar = (cfz) hslVar;
            try {
                PackageInfo packageInfo = cfzVar.f.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                if (Build.VERSION.SDK_INT > 28) {
                    i2 = (int) packageInfo.getLongVersionCode();
                } else {
                    i2 = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i2 = -1;
            }
            if (i2 < ((Long) cfz.d.c()).longValue()) {
                return null;
            }
            if (!((Boolean) cfz.e.c()).booleanValue() || !gqa.a(cfzVar.f).e) {
                InlineSuggestionsRequest.Builder builder = new InlineSuggestionsRequest.Builder(new ArrayList());
                InlinePresentationSpec.Builder builder2 = new InlinePresentationSpec.Builder(new Size(cfz.g(m), cfz.f(m)), new Size(cfzVar.f.getResources().getDimensionPixelSize(R.dimen.f42590_resource_name_obfuscated_res_0x7f0706c3), cfz.f(m)));
                Set set = pz.a;
                ArrayList<qe> arrayList = new ArrayList();
                View inflate = ((LayoutInflater) m.getSystemService("layout_inflater")).inflate(R.layout.f134490_resource_name_obfuscated_res_0x7f0e00a2, (ViewGroup) null);
                AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.f53900_resource_name_obfuscated_res_0x7f0b0158);
                int currentTextColor = ((AppCompatTextView) inflate.findViewById(R.id.f53910_resource_name_obfuscated_res_0x7f0b0159)).getCurrentTextColor();
                int currentTextColor2 = ((AppCompatTextView) inflate.findViewById(R.id.f53920_resource_name_obfuscated_res_0x7f0b015a)).getCurrentTextColor();
                int currentTextColor3 = ((AppCompatTextView) inflate.findViewById(R.id.f53890_resource_name_obfuscated_res_0x7f0b0157)).getCurrentTextColor();
                ColorStateList textColors = ((AppCompatTextView) inflate.findViewById(R.id.f53880_resource_name_obfuscated_res_0x7f0b0156)).getTextColors();
                if (textColors == null) {
                    textColors = ColorStateList.valueOf(currentTextColor2);
                }
                ColorStateList textColors2 = appCompatTextView.getTextColors();
                if (textColors2 == null) {
                    textColors2 = ColorStateList.valueOf(currentTextColor2);
                }
                Icon createWithResource = Icon.createWithResource(cfzVar.f, currentTextColor == -1 ? R.drawable.f46080_resource_name_obfuscated_res_0x7f080120 : R.drawable.f46070_resource_name_obfuscated_res_0x7f08011f);
                createWithResource.setTint(currentTextColor3);
                createWithResource.setTintBlendMode(BlendMode.DST_OVER);
                int dimensionPixelSize = cfzVar.f.getResources().getDimensionPixelSize(R.dimen.f41430_resource_name_obfuscated_res_0x7f0705de);
                int dimensionPixelSize2 = cfzVar.f.getResources().getDimensionPixelSize(R.dimen.f42600_resource_name_obfuscated_res_0x7f0706c4);
                int dimensionPixelSize3 = cfzVar.f.getResources().getDimensionPixelSize(R.dimen.f41420_resource_name_obfuscated_res_0x7f0705dd);
                aqq aqqVar = new aqq("style_v1");
                hrx.y(cfzVar.f);
                hqt b2 = hqp.b();
                boolean v = b2 == null ? false : b2.v();
                int i3 = v ? 1 : 0;
                int i4 = v ? 1 : 0;
                ((Bundle) aqqVar.a).putInt("layout_direction", i3);
                aqq aqqVar2 = new aqq((short[]) null);
                ((Bundle) aqqVar2.a).putInt("background_color", 0);
                aqqVar2.z(0);
                aqqVar2.y(0, 0);
                qd x = aqqVar2.x();
                x.b();
                ((Bundle) aqqVar.a).putBundle("single_icon_chip_style", x.a);
                aqq aqqVar3 = new aqq((byte[]) null, (char[]) null, (byte[]) null);
                ((Bundle) aqqVar3.a).putInt("image_max_width", dimensionPixelSize);
                ((Bundle) aqqVar3.a).putInt("image_max_height", dimensionPixelSize);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                nq.h(scaleType, "scaleType should not be null");
                ((Bundle) aqqVar3.a).putString("image_scale_type", scaleType.name());
                aqqVar3.y(0, dimensionPixelSize3);
                aqqVar3.s(textColors);
                qb r = aqqVar3.r();
                r.b();
                ((Bundle) aqqVar.a).putBundle("single_icon_chip_icon_style", r.a);
                aqq aqqVar4 = new aqq((short[]) null);
                nq.h(createWithResource, "background icon should not be null");
                ((Bundle) aqqVar4.a).putParcelable("background", createWithResource);
                qd x2 = aqqVar4.x();
                x2.b();
                ((Bundle) aqqVar.a).putBundle("chip_style", x2.a);
                aqq aqqVar5 = new aqq((byte[]) null, (char[]) null, (byte[]) null);
                aqqVar5.y(6, 0);
                aqqVar5.s(textColors2);
                qb r2 = aqqVar5.r();
                r2.b();
                ((Bundle) aqqVar.a).putBundle("start_icon_style", r2.a);
                aqq aqqVar6 = new aqq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aqqVar6.u(currentTextColor);
                aqqVar6.v(14.0f);
                aqqVar6.w();
                aqqVar6.z(dimensionPixelSize2);
                qc t = aqqVar6.t();
                t.b();
                ((Bundle) aqqVar.a).putBundle("title_style", t.a);
                aqq aqqVar7 = new aqq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aqqVar7.u(currentTextColor2);
                aqqVar7.v(13.0f);
                aqqVar7.w();
                aqqVar7.z(dimensionPixelSize2);
                qc t2 = aqqVar7.t();
                t2.b();
                ((Bundle) aqqVar.a).putBundle("subtitle_style", t2.a);
                aqq aqqVar8 = new aqq((byte[]) null, (char[]) null, (byte[]) null);
                aqqVar8.y(0, 0);
                aqqVar8.s(textColors2);
                qb r3 = aqqVar8.r();
                r3.b();
                ((Bundle) aqqVar.a).putBundle("end_icon_style", r3.a);
                qe qeVar = new qe((Bundle) aqqVar.a);
                if (!pz.a.contains("androidx.autofill.inline.ui.version:v1")) {
                    throw new IllegalArgumentException("Unsupported style version: androidx.autofill.inline.ui.version:v1");
                }
                arrayList.add(qeVar);
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Please put at least one style in the builder");
                }
                Bundle bundle2 = new Bundle();
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (qe qeVar2 : arrayList) {
                    arrayList2.add("androidx.autofill.inline.ui.version:v1");
                    bundle2.putBundle("androidx.autofill.inline.ui.version:v1", qeVar2.a);
                }
                bundle2.putStringArrayList("androidx.autofill.inline.ui.version:key", arrayList2);
                builder2.setStyle(bundle2);
                InlinePresentationSpec build = builder2.build();
                for (int i5 = 0; i5 < 9; i5++) {
                    builder.addInlinePresentationSpecs(build);
                }
                builder.setMaxSuggestionCount(9);
                hrx.y(cfzVar.f);
                hqt b3 = hqp.b();
                if (b3 == null) {
                    localeList = LocaleList.getEmptyLocaleList();
                } else {
                    Locale q = b3.i().q();
                    llk e2 = llp.e();
                    e2.h(q);
                    lsz it = b3.k().iterator();
                    while (it.hasNext()) {
                        Locale q2 = ((jav) it.next()).q();
                        if (!q.equals(q2)) {
                            e2.h(q2);
                        }
                    }
                    localeList = new LocaleList((Locale[]) e2.g().toArray(new Locale[0]));
                }
                builder.setSupportedLocales(localeList);
                return builder.build();
            }
            ((ltd) ((ltd) cfz.a.b()).k("com/google/android/apps/inputmethod/libs/deviceintelligence/impl/DeviceIntelligenceExtension", "getInlineSuggestionsRequest", 317, "DeviceIntelligenceExtension.java")).t("Inline suggestions disabled since talkback is on");
            return null;
        }
        return null;
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService
    public final AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() {
        return new dct(this);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateInputView() {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onCreateInputView", 1848, "GoogleInputMethodService.java")).t("onCreateInputView()");
        if (this.N) {
            InputView inputView = this.q;
            return inputView == null ? new FrameLayout(this) : inputView;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bU();
            Arrays.fill(this.s, (Object) null);
            this.t = null;
            this.u = null;
            InputView a2 = InputView.a(this, this.aa);
            this.q = a2;
            bs();
            ice[] iceVarArr = b;
            int length = iceVarArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                ice iceVar = iceVarArr[i2];
                KeyboardViewHolder b2 = a2.b(iceVar);
                if (b2 != null) {
                    b2.d = this.I[iceVar.ordinal()];
                    b2.e = this.ap;
                    this.s[iceVar.ordinal()] = b2;
                }
            }
            KeyboardViewHolder keyboardViewHolder = a2.d;
            this.t = keyboardViewHolder;
            if (keyboardViewHolder != null) {
                keyboardViewHolder.e = this.aq;
            }
            this.r = a2.findViewById(R.id.f57510_resource_name_obfuscated_res_0x7f0b0427);
            this.X = false;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            ieh.j().g(hsq.IMS_ON_CREATE_INPUT_VIEW, elapsedRealtime2);
            ieh.j().e(hsp.IMS_INPUT_VIEW_CREATED, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
            return a2;
        } catch (Throwable th) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            ieh.j().g(hsq.IMS_ON_CREATE_INPUT_VIEW, elapsedRealtime3);
            ieh.j().e(hsp.IMS_INPUT_VIEW_CREATED, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime3));
            throw th;
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onCurrentInputMethodSubtypeChanged(InputMethodSubtype inputMethodSubtype) {
        super.onCurrentInputMethodSubtypeChanged(inputMethodSubtype);
    }

    @Override // android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public final void onDestroy() {
        this.as = true;
        ija ijaVar = this.Q;
        if (ijaVar != null) {
            ijaVar.f();
            this.Q = null;
        }
        gzq.b.g(this.ax);
        gzq.a.g(this.ax);
        Window window = getWindow().getWindow();
        if (window != null) {
            window.getDecorView().getViewTreeObserver().removeOnPreDrawListener(this.aC);
        }
        h.a("onDestroy()");
        super.onDestroy();
        ifh.a();
        n();
        this.as = false;
        this.N = true;
        irn.g(null);
        ijf.f(gwz.a, gwz.b, gwz.c);
        ijl.b().g(hsx.a);
        ieh.j().e(hsp.IMS_DESTROYED, new Object[0]);
        this.aD.a = null;
    }

    @Override // android.inputmethodservice.InputMethodService, defpackage.hsk
    public final void onDisplayCompletions(CompletionInfo[] completionInfoArr) {
        hox P = P();
        if (P == null || P.g != 1 || !P.d.p) {
            return;
        }
        P.p().gT(completionInfoArr);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onEvaluateFullscreenMode() {
        if (ham.N(getCurrentInputEditorInfo()) || ham.M(getCurrentInputEditorInfo()) || this.q == null || this.p != iau.SOFT || bA()) {
            return false;
        }
        if (ham.z(this.ad, getCurrentInputEditorInfo())) {
            int A = (A() - getResources().getDimensionPixelSize(R.dimen.f32290_resource_name_obfuscated_res_0x7f070071)) - dds.e(this);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f37320_resource_name_obfuscated_res_0x7f070338);
            ((ltd) ((ltd) dds.b.b()).k("com/google/android/apps/inputmethod/libs/framework/keyboard/KeyboardViewUtil", "canAvoidFullscreenModeByReducingKeyboardHeight", 72, "KeyboardViewUtil.java")).y("can disable full screen mode by lowering keyboard. bodyHeight:%d minBodyHeight:%d", A, dimensionPixelSize);
            if (A >= dimensionPixelSize) {
                return false;
            }
        }
        return !gzq.e(this) && !gzq.c(this) && super.onEvaluateFullscreenMode();
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onEvaluateInputViewShown() {
        iau X = X(this.an);
        if (this.p != X) {
            ar(true);
            bX(X);
        }
        return true;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onFinishInput() {
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onFinishInput", 3274, "GoogleInputMethodService.java")).s();
        h.a("onFinishInput()");
        if (this.N) {
            return;
        }
        boolean bx = bx();
        if (!bx && ((Boolean) i.c()).booleanValue()) {
            return;
        }
        hnq hnqVar = this.L;
        if (hnqVar != null) {
            hnqVar.a(false);
        }
        this.aE.a(null);
        ijl b2 = ijl.b();
        hss hssVar = new hss();
        hssVar.a = 3;
        hssVar.e = true;
        b2.g(hssVar.a());
        ieh.j().e(hsp.IMS_INPUT_FINISHED, Boolean.valueOf(bx));
        ieh.j().d(ide.a);
        bq(0);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onFinishInputView(boolean z) {
        mcu mcuVar;
        ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onFinishInputView", 2317, "GoogleInputMethodService.java")).s();
        h.b("onFinishInputView(%b)", Boolean.valueOf(z));
        if (this.N) {
            return;
        }
        if (!bx()) {
            if (((Boolean) i.c()).booleanValue()) {
                return;
            }
        } else {
            ham.l(N());
        }
        v();
        boolean bu = bu();
        ijl b2 = ijl.b();
        hss hssVar = new hss();
        int i2 = 2;
        hssVar.a = 2;
        hssVar.e = z;
        hssVar.f = bu;
        b2.g(hssVar.a());
        br(null, false);
        kki.j(this.ao);
        hsr hsrVar = this.aa;
        if (!hsrVar.a) {
            mcuVar = null;
        } else {
            nfh t = mcu.g.t();
            int i3 = true != hsrVar.b ? 2 : 3;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mcu mcuVar2 = (mcu) t.b;
            mcuVar2.b = i3 - 1;
            mcuVar2.a |= 1;
            int i4 = true != hsrVar.c ? 2 : 3;
            mcu mcuVar3 = (mcu) t.b;
            mcuVar3.c = i4 - 1;
            mcuVar3.a |= 2;
            if (true == hsrVar.d) {
                i2 = 3;
            }
            mcu mcuVar4 = (mcu) t.b;
            mcuVar4.d = i2 - 1;
            int i5 = mcuVar4.a | 4;
            mcuVar4.a = i5;
            int i6 = hsrVar.e;
            int i7 = i5 | 8;
            mcuVar4.a = i7;
            mcuVar4.e = i6;
            int i8 = hsrVar.f;
            mcuVar4.a = i7 | 16;
            mcuVar4.f = i8;
            mcuVar = (mcu) t.cz();
        }
        ieh.j().e(hsp.IMS_INPUT_VIEW_FINISHED, mcuVar);
        gyb gybVar = this.az;
        if (gybVar.a) {
            Process.setThreadPriority(gybVar.b);
            gybVar.a = false;
        }
        this.aO = null;
        ieh.j().d(ide.b);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.N) {
            return false;
        }
        this.aa.a(keyEvent);
        if (this.z) {
            this.B.add(keyEvent);
            return true;
        }
        if (keyEvent.getKeyCode() == 4) {
            boolean cb = cb();
            ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onKeyDown", 2513, "GoogleInputMethodService.java")).w("Received KEYCODE_BACK. isAllViewsInvisible=%s", Boolean.valueOf(cb));
            if (cb) {
                return false;
            }
        }
        hox P = P();
        hsy q = P != null ? P.q() : null;
        if (q != null && KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            bZ(q, keyEvent);
        }
        this.ak = keyEvent.getMetaState();
        boolean bB = bB();
        if (bB() && P != null && (this.aL.c(keyEvent) || P.an(i2, keyEvent))) {
            return true;
        }
        if (!bB && ham.D(this.o.a())) {
            int keyCode = keyEvent.getKeyCode();
            if ((iaz.a(keyEvent) != 0 || KeyEvent.isModifierKey(keyCode)) && keyEvent.getKeyCode() != 66 && keyEvent.getKeyCode() != 160) {
                bk();
                this.z = true;
                this.B.clear();
                this.B.add(keyEvent);
                return true;
            }
        }
        if (!keyEvent.isSystem()) {
            hpx hpxVar = this.D;
            hpx hpxVar2 = this.F;
            if (hpxVar != hpxVar2) {
                hpxVar2.m(keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        this.aa.a(keyEvent);
        return super.onKeyLongPress(i2, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        this.aa.a(keyEvent);
        return super.onKeyMultiple(i2, i3, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        this.aa.a(keyEvent);
        if (this.z) {
            this.B.add(keyEvent);
            return true;
        }
        hox P = P();
        hsy q = P != null ? P.q() : null;
        if (q != null && KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            bZ(q, keyEvent);
        }
        if (KeyEvent.isModifierKey(i2)) {
            hpx hpxVar = this.F;
            int metaState = keyEvent.getMetaState() ^ this.ak;
            hpr hprVar = hpxVar.g;
            InputConnection a2 = hprVar.a();
            if (a2 == null) {
                kcu.K(false);
            } else {
                hprVar.g.hQ(new hmc(a2, metaState, 4));
            }
        }
        this.ak = keyEvent.getMetaState();
        if (bB() && P != null && (this.aL.c(keyEvent) || P.an(i2, keyEvent))) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final boolean onShowInputRequested(int i2, boolean z) {
        boolean z2 = super.onShowInputRequested(i2, z) && this.al;
        Integer valueOf = Integer.valueOf(i2);
        Boolean valueOf2 = Boolean.valueOf(z);
        h.c("onShowInputRequested(%d, %b)", valueOf, valueOf2);
        if (((Boolean) j.c()).booleanValue()) {
            ieh.j().e(hsp.IMS_ON_SHOW_INPUT_REQUESTED, valueOf, valueOf2);
        }
        return z2 || this.p == iau.HARD_QWERTY || this.p == iau.HARD_12KEYS;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onStartInput(EditorInfo editorInfo, boolean z) {
        ltg ltgVar = g;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onStartInput", 1957, "GoogleInputMethodService.java")).H("onStartInput(EditorInfo{%s}, %b)", ham.g(editorInfo), z);
        h.c("onStartInput(EditorInfo{%s}, %b)", ham.g(editorInfo), Boolean.valueOf(z));
        if (this.N) {
            return;
        }
        this.at = true;
        boolean z2 = ((Boolean) k.c()).booleanValue() && ham.ap(this, N());
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "shouldHideHeaderOnInitialState", 4078, "GoogleInputMethodService.java")).w("ShouldHideHeaderOnInitialState = %b", Boolean.valueOf(z2));
        this.au = z2;
        boolean bx = bx();
        this.al = true;
        if (bx || !((Boolean) i.c()).booleanValue()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bq(2);
            ieh.j().c(ide.a);
            if (Build.VERSION.SDK_INT >= 30) {
                boolean booleanValue = ((Boolean) ite.a.c()).booleanValue();
                int applyDimension = (int) TypedValue.applyDimension(1, (float) ((Long) ite.b.c()).longValue(), getResources().getDisplayMetrics());
                if (booleanValue != this.m || applyDimension != this.n) {
                    this.m = booleanValue;
                    this.n = applyDimension;
                    bs();
                }
            }
            ((hrx) this.w).M();
            super.onStartInput(editorInfo, z);
            q(editorInfo, z);
            boolean bu = bu();
            ijl b2 = ijl.b();
            hss hssVar = new hss();
            hssVar.a = 0;
            hssVar.b = editorInfo;
            hssVar.d = z;
            hssVar.f = bu;
            b2.g(hssVar.a());
            if (this.C) {
                this.C = false;
                if (bx) {
                    bk();
                }
            }
            ieh.j().e(hsp.IMS_INPUT_STARTED, Boolean.valueOf(bx), Long.valueOf(elapsedRealtime), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        ieh.j().e(hsp.IMS_INPUT_STARTED_IC_TYPE, false);
        this.al = false;
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onStartInputView(EditorInfo editorInfo, boolean z) {
        int myTid;
        int threadPriority;
        ltg ltgVar = g;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onStartInputView", 2075, "GoogleInputMethodService.java")).H("onStartInputView(EditorInfo{%s}, %b)", ham.g(editorInfo), z);
        gzy gzyVar = h;
        Object g2 = ham.g(editorInfo);
        Boolean valueOf = Boolean.valueOf(z);
        gzyVar.c("onStartInputView(EditorInfo{%s}, %b)", g2, valueOf);
        if (this.N) {
            return;
        }
        if (this.q == null) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onStartInputView", 2085, "GoogleInputMethodService.java")).t("onStartInputView() : Called when inputView is null.");
            return;
        }
        hsr hsrVar = this.aa;
        hsrVar.a = ((Boolean) j.c()).booleanValue();
        hsrVar.b = false;
        hsrVar.c = false;
        hsrVar.d = false;
        hsrVar.e = 0;
        hsrVar.f = 0;
        boolean bx = bx();
        if (!bx) {
            if (((Boolean) i.c()).booleanValue()) {
                ieh.j().e(hsp.IMS_ON_START_INPUT_VIEW_IC_TYPE, false);
                return;
            }
        } else {
            ham.l(editorInfo);
        }
        ieh.j().c(ide.b);
        ieh.j().e(hsp.IMS_ON_START_INPUT_VIEW, editorInfo, Integer.valueOf(getResources().getConfiguration().orientation), valueOf, Boolean.valueOf(bx), this.p, Boolean.valueOf(!irs.d()));
        gyb gybVar = this.az;
        if (Build.VERSION.SDK_INT > 24 && (threadPriority = Process.getThreadPriority((myTid = Process.myTid()))) > -10) {
            Process.setThreadPriority(myTid, -10);
            gybVar.b = threadPriority;
            gybVar.a = true;
        }
        ifh.b(ifh.a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        bq(2);
        super.onStartInputView(editorInfo, z);
        r(editorInfo, z);
        hpx hpxVar = this.F;
        if (hpxVar == this.D) {
            hsu.d(editorInfo, z, bu());
        } else {
            EditorInfo c2 = hpxVar.c();
            if (c2 != null) {
                hsu.e(editorInfo, c2, z, bu());
            }
        }
        kki.k(this.ao);
        ieh.j().e(hsp.IMS_INPUT_VIEW_STARTED, Long.valueOf(elapsedRealtime), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        igg c2;
        if (icu.m(i2)) {
            ((ltd) ((ltd) g.b()).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "onTrimMemory", 4471, "GoogleInputMethodService.java")).u("onTrimMemory(): %d", i2);
            bp(hum.a.a(i2));
            hfp hfpVar = this.R;
            if (hfpVar != null) {
                if (i2 != 60 && i2 != 80 && i2 != 10) {
                    if (i2 == 15) {
                        i2 = 15;
                    }
                }
                for (hfw hfwVar : hfpVar.b()) {
                    if (hfwVar != hfpVar.f && hfwVar != hfpVar.g && hfwVar.Z() && (c2 = hfwVar.b.c(hfwVar.f)) != null && c2.d == igf.ON_DEMAND) {
                        if (hfwVar.g != null) {
                            hfwVar.b.g(hfwVar.f);
                            hfwVar.g = null;
                            hfwVar.h = null;
                        }
                        if (hfpVar.h == hfwVar) {
                            hfpVar.h = null;
                        }
                    }
                }
            }
        }
        gqd gqdVar = this.aj.a;
        if (i2 != 20) {
            gqdVar.c = null;
            gqdVar.b = null;
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onUpdateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        super.onUpdateCursorAnchorInfo(cursorAnchorInfo);
        hsj hsjVar = this.aE;
        if (hsjVar.e) {
            hsjVar.d = cursorAnchorInfo;
            Iterator it = hsjVar.a.iterator();
            while (it.hasNext()) {
                ((gza) it.next()).a(cursorAnchorInfo);
            }
        }
        qq qqVar = hsjVar.b;
        if (qqVar != null) {
            hsjVar.b = null;
            Iterator it2 = qqVar.iterator();
            while (it2.hasNext()) {
                ((gza) it2.next()).a(cursorAnchorInfo);
            }
        }
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onUpdateSelection(int i2, int i3, int i4, int i5, int i6, int i7) {
        hfw hfwVar;
        hfz k2;
        h.a("onUpdateSelection()");
        if (this.N) {
            return;
        }
        super.onUpdateSelection(i2, i3, i4, i5, i6, i7);
        hfp hfpVar = this.R;
        if (hfpVar != null && (hfwVar = hfpVar.f) != null && hfwVar.Z() && hfwVar.W() && (k2 = hfwVar.k()) != null) {
            k2.W(i4, i5, i6, i7);
        }
        this.D.b(i2, i3, i4, i5, i6, i7);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onViewClicked(boolean z) {
        hfx i2;
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            for (hfw hfwVar : hfpVar.b()) {
                if (hfwVar.W() && (i2 = hfwVar.i()) != null) {
                    i2.q();
                }
            }
        }
        if (P() != null) {
            hpi hpiVar = P().e;
            if (hpiVar.n()) {
                hpiVar.c.J();
            }
        }
        super.onViewClicked(z);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onWindowHidden() {
        h.a("onWindowHidden()");
        super.onWindowHidden();
        if (Build.VERSION.SDK_INT <= 30 || !((Boolean) d.c()).booleanValue()) {
            return;
        }
        getWindow().hide();
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onWindowShown() {
        h.a("onWindowShown()");
        super.onWindowShown();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(EditorInfo editorInfo, boolean z) {
        jam.m(this);
        hnq hnqVar = this.L;
        if (hnqVar != null) {
            hnqVar.a(ham.O(editorInfo));
        }
        itb.f();
        if (((Boolean) isr.a.c()).booleanValue()) {
            boolean z2 = this.aH;
            this.aH = ham.an(this, editorInfo);
            if (!this.O.get() && isr.g(this, z2, this.aH)) {
                this.O.set(true);
            }
        }
        if (!z && this.O.get()) {
            aQ();
        }
        hpx hpxVar = this.F;
        if (hpxVar == this.D) {
            hpxVar.k(this, editorInfo, z);
        } else {
            hpxVar.k(this, hpxVar.c(), z);
            this.D.k(this, editorInfo, z);
        }
        this.aE.a(this.F);
        this.o.j(editorInfo, z);
        hdn.instance.e(editorInfo);
    }

    protected void r(EditorInfo editorInfo, boolean z) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void sendBroadcast(Intent intent) {
        if (gwc.j(intent)) {
            ((ltd) g.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/core/GoogleInputMethodService", "sendBroadcast", 4288, "GoogleInputMethodService.java")).w("sendBroadcast(): Intent parcel exceeds size limit, %s", intent.getAction());
        } else {
            super.sendBroadcast(intent);
        }
    }

    @Override // android.inputmethodservice.InputMethodService, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
    }

    @Override // android.inputmethodservice.InputMethodService, defpackage.hoy
    public final void showStatusIcon(int i2) {
        if (i2 != 0) {
            super.showStatusIcon(i2);
        } else {
            hideStatusIcon();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean u() {
        throw null;
    }

    protected void v() {
        throw null;
    }

    protected ewj w() {
        throw null;
    }

    @Override // defpackage.hoy, defpackage.hfq
    public final float x() {
        if (!jam.r(this) || !"phone".equals(gzq.a(iin.m(this))) || !bA()) {
            return this.M;
        }
        return 0.85f;
    }

    @Override // defpackage.hsk, defpackage.hoy, defpackage.hfq
    public final int y() {
        hwp hwpVar = this.aB;
        return hwpVar != null ? ((hvp) hwpVar).b : hyq.f();
    }

    @Override // defpackage.hoy
    public final int z() {
        hpx hpxVar = this.F;
        EditorInfo c2 = hpxVar.c();
        if (c2 == null) {
            return 0;
        }
        int i2 = c2.inputType;
        int i3 = c2.inputType;
        int i4 = c2.inputType;
        int i5 = c2.inputType;
        hqg hqgVar = hpxVar.e;
        int i6 = c2.inputType;
        int e2 = hqgVar.e();
        if (e2 < 0) {
            hqgVar.l.e(hqh.c, false);
            return hqgVar.A.m(i6);
        }
        int i7 = e2 - hqgVar.m;
        if (i7 < 0 || i7 > hqgVar.k.b().length()) {
            hqgVar.k.b().length();
            hqgVar.l.e(hqh.c, false);
            return hqgVar.A.m(i6);
        }
        hqgVar.l.e(hqh.c, true);
        return TextUtils.getCapsMode(hqgVar.k.b(), i7, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (defpackage.ham.m(r7.N()).equals(((defpackage.cfz) r2).f.getPackageName()) != false) goto L65;
     */
    @Override // android.inputmethodservice.InputMethodService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse r24) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcu.onInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse):boolean");
    }

    @Override // defpackage.hoy
    public final void al(CompletionInfo completionInfo) {
        opu opuVar = this.aO;
        if (opuVar != null) {
            Object obj = opuVar.a;
            hsk b2 = hsx.b();
            if (b2 == null) {
                return;
            }
            b2.an(completionInfo.getText());
            dbv dbvVar = (dbv) obj;
            if (!dbvVar.a) {
                return;
            }
            b2.at(hfd.d(new iay(-10018, null, dbvVar.b)));
            return;
        }
        hpr hprVar = this.F.g;
        InputConnection a2 = hprVar.a();
        if (a2 == null) {
            return;
        }
        hqg hqgVar = hprVar.e;
        CharSequence text = completionInfo.getText();
        if (!TextUtils.isEmpty(text)) {
            hqgVar.q(text, 1);
        }
        hprVar.g.execute(new gxi(a2, completionInfo, 13));
    }

    private final void ca(ice iceVar, boolean z) {
        EditorInfo currentInputEditorInfo;
        int i2 = 0;
        if (this.q != null) {
            int ordinal = iceVar.ordinal();
            final KeyboardViewHolder keyboardViewHolder = this.s[ordinal];
            int i3 = 4;
            if (iceVar != ice.BODY) {
                KeyboardViewHolder keyboardViewHolder2 = this.t;
                if (keyboardViewHolder2 != null) {
                    keyboardViewHolder2.setVisibility(true != this.ag ? 8 : 0);
                }
                if (keyboardViewHolder != null) {
                    if ((!this.ah && this.ag) || !this.af[ordinal]) {
                        i3 = 8;
                    } else if (!this.av[ordinal]) {
                        i3 = 0;
                    }
                    keyboardViewHolder.setVisibility(i3);
                    if (z) {
                        Context context = keyboardViewHolder.getContext();
                        DisplayMetrics g2 = gvv.g(context);
                        keyboardViewHolder.measure(View.MeasureSpec.makeMeasureSpec(g2.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g2.heightPixels, Integer.MIN_VALUE));
                        final int measuredHeight = keyboardViewHolder.getMeasuredHeight();
                        View childAt = keyboardViewHolder.getChildAt(0);
                        if (childAt != null) {
                            childAt.setAlpha(0.0f);
                        }
                        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.f650_resource_name_obfuscated_res_0x7f020023);
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, R.animator.f640_resource_name_obfuscated_res_0x7f020022);
                        valueAnimator.setTarget(keyboardViewHolder);
                        keyboardViewHolder.setOnHierarchyChangeListener(new htm(valueAnimator, loadAnimator));
                        valueAnimator.addListener(new htn(keyboardViewHolder, measuredHeight));
                        loadAnimator.addListener(new hto(childAt, 0));
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: htl
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                ViewGroup viewGroup = keyboardViewHolder;
                                int i4 = measuredHeight;
                                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                                int animatedFraction = (int) (valueAnimator2.getAnimatedFraction() * i4);
                                if (layoutParams != null && layoutParams.height != animatedFraction) {
                                    layoutParams.height = animatedFraction;
                                }
                                viewGroup.requestLayout();
                            }
                        });
                        valueAnimator.start();
                        if (childAt != null) {
                            loadAnimator.setTarget(childAt);
                            loadAnimator.start();
                        }
                    }
                }
            } else if (keyboardViewHolder != null) {
                if (!this.af[ordinal]) {
                    keyboardViewHolder.setVisibility(8);
                } else if (this.av[ordinal]) {
                    keyboardViewHolder.setVisibility(4);
                } else {
                    keyboardViewHolder.setVisibility(0);
                }
            }
            if (!this.as && !this.N && Build.VERSION.SDK_INT >= 28) {
                Window window = getWindow().getWindow();
                InputView inputView = this.q;
                if (window != null && inputView != null) {
                    if (bA() || (!this.af[ice.HEADER.ordinal()] && !this.af[ice.BODY.ordinal()] && !this.ag)) {
                        ddb.c(window, inputView);
                    } else {
                        ddb.b(this, window, inputView, (!bu() && ((currentInputEditorInfo = getCurrentInputEditorInfo()) == null || !currentInputEditorInfo.packageName.equals("com.android.systemui") || Build.VERSION.SDK_INT > 28)) ? itb.a() : 0, cc());
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            if (true == cb()) {
                i2 = 3;
            }
            setBackDisposition(i2);
        }
    }
}
