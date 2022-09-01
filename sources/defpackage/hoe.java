package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: hoe  reason: default package */
/* loaded from: classes.dex */
public final class hoe implements AutoCloseable, hfh {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public boolean I;
    public hoo J;
    public hoo K;
    public hoo L;
    public View M;
    public View N;
    public View O;
    public View P;
    public final imn Q;
    public long R;
    public boolean S;
    public int T;
    public View U;
    public FrameLayout V;
    public boolean W;
    public long X;
    public int Y;
    public gza Z;
    private hln ah;
    private long ai;
    private iou aj;
    private boolean ak;
    public llw b;
    public llw c;
    public llw d;
    public final hsz j;
    public Context k;
    public ino l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public hln r;
    public View s;
    public int t;
    public AppCompatTextView u;
    public View v;
    public Rect w;
    public boolean x;
    public CharSequence y;
    public int z;
    private static final ltg ad = ltg.j("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionCandidateViewController");
    public static final Typeface a = Typeface.DEFAULT;
    private final View.OnTouchListener ae = new hoc(this);
    public final View.OnLayoutChangeListener e = new dkr(this, 9);
    public final Runnable f = new hob(this, 5, (byte[]) null);
    private final Runnable af = new hob(this, 6, (char[]) null);
    public final Handler g = new Handler(Looper.getMainLooper());
    private final Rect ag = new Rect();
    public final int[] h = new int[2];
    public final int[] i = new int[2];
    public int G = 16;
    public Typeface H = a;
    public final hhk aa = new ffp(this, 3);
    public final hhk ab = new ffp(this, 4);
    public final hhk ac = new ffp(this, 2);

    public hoe(hsz hszVar) {
        llw llwVar = lrq.b;
        this.b = llwVar;
        this.c = llwVar;
        this.d = llwVar;
        imn imnVar = null;
        this.j = hszVar;
        this.Q = hszVar != null ? hszVar.s() : imnVar;
    }

    private final boolean x(hln hlnVar) {
        Rect rect;
        return hlnVar != null && !TextUtils.isEmpty(hlnVar.a) && (rect = this.w) != null && rect.left + this.ag.width() < this.z;
    }

    private final boolean y() {
        return t() && this.A && this.ah != null && this.w != null;
    }

    public final void a(boolean z) {
        iou iouVar = this.aj;
        if (iouVar != null) {
            ioq.b(iouVar, z);
            this.aj = null;
        }
    }

    public final void b() {
        View view;
        imn imnVar = this.Q;
        if (imnVar == null || (view = this.M) == null) {
            return;
        }
        imnVar.c(view, null, true);
        this.M = null;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f;
        if (!t() || this.ah == null || (f = hfdVar.f()) == null || f.c != -50004) {
            return false;
        }
        p(hod.SWIPE_ON_SPACEBAR);
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        k();
    }

    public final void d(boolean z) {
        if (!this.C) {
            return;
        }
        if (z) {
            this.g.postDelayed(this.af, ((Long) hof.m.c()).longValue());
            hof.m.c();
            return;
        }
        hoo.a();
        b();
    }

    public final void e() {
        hnz hnzVar = (hnz) hof.q.j();
        if (hnzVar == null || hnzVar.a.size() <= 0) {
            return;
        }
        lls h = llw.h();
        lls h2 = llw.h();
        lls h3 = llw.h();
        for (hny hnyVar : hnzVar.a) {
            String str = hnyVar.b;
            float f = hnyVar.c;
            float f2 = hnyVar.d;
            int i = hnyVar.e;
            String str2 = hnyVar.f;
            h.a(str, new xv(Float.valueOf(f), Float.valueOf(hnyVar.d)));
            if ((hnyVar.a & 8) != 0) {
                h2.a(hnyVar.b, Integer.valueOf(hnyVar.e));
            }
            if ((hnyVar.a & 16) != 0) {
                h3.a(hnyVar.b, hnyVar.f);
            }
        }
        this.b = h.l();
        this.c = h2.l();
        this.d = h3.l();
    }

    public final void f() {
        if (((Boolean) hof.s.c()).booleanValue()) {
            imn imnVar = this.Q;
            if (imnVar != null) {
                View b = imnVar.b(this.k, R.layout.f135060_resource_name_obfuscated_res_0x7f0e00e5);
                this.s = b;
                this.u = (AppCompatTextView) b.findViewById(R.id.f56550_resource_name_obfuscated_res_0x7f0b0290);
            }
        } else {
            View view = this.O;
            if (view != null) {
                this.s = view.findViewById(R.id.f56540_resource_name_obfuscated_res_0x7f0b028f);
                this.u = (AppCompatTextView) this.O.findViewById(R.id.f56550_resource_name_obfuscated_res_0x7f0b0290);
                View view2 = this.s;
                if (view2 != null) {
                    view2.addOnLayoutChangeListener(this.e);
                }
            }
        }
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextSize(2, this.G);
        }
        View view3 = new View(this.k);
        this.v = view3;
        view3.setEnabled(true);
        this.v.setClickable(true);
        this.v.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.v.setOnTouchListener(this.ae);
        this.v.setOnClickListener(new fat(this, 17));
        if (this.s == null || this.u == null) {
            ((ltd) ((ltd) ad.c()).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionCandidateViewController", "initializeInlineSuggestionViews", 786, "InlineSuggestionCandidateViewController.java")).t("inline suggestion views are not defined.");
        }
    }

    public final void g(hhl hhlVar) {
        if (this.l.I("pref_key_inline_suggestion_experiment_version") == ((Long) hhlVar.c()).longValue()) {
            return;
        }
        this.l.w("pref_key_inline_suggestion_tooltip_shown_count");
        this.l.w("pref_key_inline_suggestion_swipe_on_space_promo_tooltip_shown_count");
        this.l.w("pref_key_inline_suggestion_tooltip_v2_shown_count");
        this.l.w("pref_key_inline_suggestion_tooltip_v2_chip_shown_count");
        this.l.i("pref_key_inline_suggestion_experiment_version", ((Long) hhlVar.c()).longValue());
    }

    public final void h() {
        AppCompatTextView appCompatTextView;
        if (this.Q == null || this.v == null || (appCompatTextView = this.u) == null || this.w == null) {
            return;
        }
        if (appCompatTextView.getVisibility() != 0 || !y()) {
            if (this.Q.f(this.v)) {
                this.Q.c(this.v, null, true);
            }
            d(true);
            return;
        }
        imn imnVar = this.Q;
        View view = this.v;
        AppCompatTextView appCompatTextView2 = this.u;
        int[] iArr = this.h;
        imnVar.e(view, appCompatTextView2, 0, iArr[0] - this.Y, iArr[1], null);
        hoo hooVar = this.J;
        if (hooVar != null) {
            hooVar.c(this.h);
        }
        hoo hooVar2 = this.K;
        if (hooVar2 == null) {
            return;
        }
        hooVar2.c(this.h);
    }

    public final void j() {
        if (System.currentTimeMillis() <= this.X + ((Long) hof.o.c()).longValue() && t() && ((Boolean) hof.d.c()).booleanValue() && !this.l.ak("pref_key_inline_suggestion_selected_by_space") && this.F < ((Long) hof.g.c()).longValue() && this.l.I("pref_key_inline_suggestion_tooltip_v2_chip_last_shown_ms") + ((Long) hof.l.c()).longValue() <= System.currentTimeMillis() && this.E < ((Long) hof.f.c()).longValue()) {
            View inflate = LayoutInflater.from(this.k).inflate(R.layout.f135100_resource_name_obfuscated_res_0x7f0e00e9, (ViewGroup) this.V, false);
            inflate.setOnClickListener(new fat(this, 18));
            llp r = llp.r(inflate);
            this.W = true;
            ios a2 = iou.a();
            a2.b(iot.INLINE_SUGGESTION_TOOLTIP_V2);
            a2.a = "inline_suggestion_tooltip_v2";
            a2.b = r;
            a2.d = new gxd(this, 16);
            a2.e = new gxd(this, 17);
            a2.g = cqg.m;
            a2.f = cqg.n;
            iou a3 = a2.a();
            this.aj = a3;
            ior.b(a3, hwv.DEFAULT);
        }
    }

    public final void k() {
        this.I = false;
        this.V = null;
        this.g.removeCallbacks(this.f);
        this.g.removeCallbacks(this.af);
        d(false);
        this.B = false;
        this.S = false;
        n(null);
        this.m = false;
        this.A = false;
        this.x = false;
        this.G = 16;
        a(false);
        this.l.i("pref_key_inline_suggestion_last_shown_ms", this.X);
        gza gzaVar = this.Z;
        if (gzaVar != null) {
            hsz hszVar = this.j;
            if (hszVar != null) {
                hszVar.aM(gzaVar);
            }
            this.Z = null;
        }
    }

    public final void l(hok hokVar) {
        this.C = false;
        this.g.removeCallbacks(this.af);
        ieh.j().g(hokVar, SystemClock.elapsedRealtime() - this.ai);
    }

    public final void m() {
        this.C = true;
        this.ai = SystemClock.elapsedRealtime();
    }

    public final void n(hln hlnVar) {
        hth hthVar;
        CharSequence charSequence;
        View view;
        Rect rect;
        View view2;
        this.ah = hlnVar;
        if (!((Boolean) hof.s.c()).booleanValue()) {
            hsz hszVar = this.j;
            if (hszVar == null) {
                ((ltd) ((ltd) ad.d()).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionCandidateViewController", "maybeShowInlineSuggestionHolder", 1210, "InlineSuggestionCandidateViewController.java")).t("keyboardDelegate hasn't been set to this controller!");
            } else if (this.I) {
                ibz ibzVar = ibz.a;
                ice iceVar = ice.FLOATING_CANDIDATES;
                if (w(ice.FLOATING_CANDIDATES)) {
                    hthVar = hth.SHOW_MANDATORY;
                } else {
                    hthVar = hth.HIDE;
                }
                hszVar.P(ibzVar, iceVar, hthVar);
            }
        } else if (this.Q != null) {
            if (!y() || (view = this.N) == null || (rect = this.w) == null || (view2 = this.s) == null) {
                if (this.Q.f(this.s)) {
                    this.Q.c(this.s, null, true);
                    d(false);
                }
            } else {
                this.Q.e(view2, view, 0, rect.left, this.w.bottom - this.t, null);
                i();
            }
        }
        if (this.u != null) {
            if (hlnVar == null || (charSequence = hlnVar.a) == null) {
                charSequence = "";
            }
            if (this.x) {
                o(charSequence);
                r();
                q();
            } else {
                this.y = charSequence;
            }
        }
        h();
    }

    public final void o(CharSequence charSequence) {
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setText(charSequence);
        TextPaint paint = this.u.getPaint();
        String obj = charSequence.toString();
        paint.getTextBounds(obj, 0, obj.length(), this.ag);
    }

    public final void p(hod hodVar) {
        int i;
        AppCompatTextView appCompatTextView;
        if (this.ah == null) {
            return;
        }
        ieh j = ieh.j();
        hoj hojVar = hoj.INLINE_SUGGESTION_SELECTED;
        hod hodVar2 = hod.CLICK;
        j.e(hojVar, Integer.valueOf(hodVar.d));
        d(true);
        if (((Boolean) hof.c.c()).booleanValue()) {
            this.l.f("pref_key_inline_suggestion_selected", true);
        }
        if (this.j == null) {
            return;
        }
        if (hodVar != hod.SWIPE_ON_SPACEBAR && (appCompatTextView = this.u) != null) {
            hxk.a(this.k).b(appCompatTextView, 0);
        }
        int ordinal = hodVar.ordinal();
        if (ordinal == 0) {
            i = -10130;
        } else if (ordinal == 1) {
            i = -10131;
        } else if (ordinal == 2) {
            this.l.f("pref_key_inline_suggestion_selected_by_space", true);
            i = -10132;
        } else {
            ((ltd) ((ltd) ad.d()).k("com/google/android/libraries/inputmethod/inlinesuggestion/InlineSuggestionCandidateViewController", "submitInlineSuggestion", 822, "InlineSuggestionCandidateViewController.java")).w("submit way %s is incorrect", hodVar);
            return;
        }
        this.j.z(hfd.d(new iay(i, null, this.ah)));
    }

    public final void q() {
        View view = this.v;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Rect rect = this.w;
        if (rect == null) {
            rect = this.ag;
        }
        int height = rect.height();
        layoutParams.width = this.ag.width() + this.Y;
        layoutParams.height = height + height;
        this.v.setLayoutParams(layoutParams);
        int[] iArr = this.h;
        Rect rect2 = this.w;
        int i = 0;
        iArr[0] = rect2 == null ? 0 : rect2.left;
        int[] iArr2 = this.h;
        Rect rect3 = this.w;
        if (rect3 != null) {
            i = rect3.top - (height / 2);
        }
        iArr2[1] = i;
    }

    public final void r() {
        if (this.u == null) {
            return;
        }
        boolean x = x(this.ah);
        int i = true != x ? 4 : 0;
        this.u.setVisibility(i);
        hsz hszVar = this.j;
        if (hszVar != null && this.ak != x) {
            this.ak = x;
            hszVar.z(hfd.d(new iay(-500000, null, Boolean.valueOf(x))));
        }
        View view = this.v;
        if (view != null) {
            view.setVisibility(i);
        }
        if (!x) {
            return;
        }
        this.X = System.currentTimeMillis();
    }

    public final void s() {
        if (this.w == null || this.s == null) {
            return;
        }
        if (((Boolean) hof.s.c()).booleanValue()) {
            imn imnVar = this.Q;
            if (imnVar == null || this.N == null || this.w == null || !imnVar.f(this.s)) {
                return;
            }
            this.Q.e(this.s, this.N, 0, this.w.left, this.w.bottom - this.t, null);
            return;
        }
        int[] iArr = {this.w.left};
        this.s.getLocationOnScreen(this.i);
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setX(iArr[0] - this.i[0]);
    }

    public final boolean t() {
        if (this.o || this.p || this.q || !((Boolean) hof.b.c()).booleanValue() || !this.m || !this.n) {
            return false;
        }
        hsz hszVar = this.j;
        hqt m = hszVar != null ? hszVar.m() : null;
        if (m == null || !m.y()) {
            return false;
        }
        hsz hszVar2 = this.j;
        return hszVar2 == null || !hszVar2.h().m();
    }

    public final boolean u() {
        hsz hszVar = this.j;
        return hszVar == null || !hszVar.X();
    }

    public final boolean v(hln hlnVar, boolean z) {
        if (z) {
            this.x = false;
        }
        if (t()) {
            if (this.A) {
                n(hlnVar);
                this.r = null;
            } else {
                this.r = hlnVar;
            }
            if (this.u != null && x(hlnVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean w(ice iceVar) {
        return iceVar == ice.FLOATING_CANDIDATES && !((Boolean) hof.s.c()).booleanValue() && y();
    }

    public final void i() {
        if (!this.C) {
            if (this.B || this.w == null || !this.ak || !((Boolean) hof.c.c()).booleanValue() || this.l.ak("pref_key_inline_suggestion_selected") || this.D >= ((Long) hof.e.c()).longValue() || this.l.I("pref_key_inline_suggestion_tooltip_last_shown_ms") + ((Long) hof.k.c()).longValue() > System.currentTimeMillis()) {
                if (this.S || this.w == null || !((Boolean) hof.h.c()).booleanValue() || this.T >= ((Long) hof.i.c()).longValue() || this.l.I("pref_key_inline_suggestion_swipe_on_space_promo_tooltip_last_shown_ms") + ((Long) hof.k.c()).longValue() > System.currentTimeMillis()) {
                    return;
                }
                gyc.b.execute(new hob(this, 2));
                return;
            }
            gyc.b.execute(new hob(this, 0));
        }
    }
}
