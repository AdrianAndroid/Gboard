package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.inputmethod.libs.expression.expressionmoment.IExpressionMomentExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.function.Function;

/* compiled from: PG */
/* renamed from: cny  reason: default package */
/* loaded from: classes.dex */
public final class cny implements ctt {
    public final idk b;
    public final SoftKeyboardView c;
    public final View d;
    public final BindingRecyclerView e;
    public final hga f;
    public final oiy g;
    public final Function h;
    public EditorInfo j;
    public int k;
    public AnimatorSet l;
    public AnimatorSet m;
    public View n;
    public int o;
    public String q;
    private final FrameLayout t;
    private LottieAnimationView v;
    private static final ltg s = ltg.j("com/google/android/apps/inputmethod/libs/expression/expressionmoment/impl/ExpressionMomentKeyboardPeer");
    public static final Interpolator a = new afj();
    public final dxs r = new dxs((byte[]) null);
    private final iqh u = iqh.a(cit.M);
    public final iqh i = iqh.a(cit.O);
    public long p = 0;
    private int w = 0;
    private int x = 0;
    private final hqi y = new cno(this);

    public cny(SoftKeyboardView softKeyboardView, idk idkVar, hga hgaVar, oiy oiyVar) {
        this.b = idkVar;
        this.c = softKeyboardView;
        this.d = aad.q(softKeyboardView, R.id.f54610_resource_name_obfuscated_res_0x7f0b01b4);
        BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f54640_resource_name_obfuscated_res_0x7f0b01b7);
        this.e = bindingRecyclerView;
        this.f = hgaVar;
        this.g = oiyVar;
        this.h = new chd(softKeyboardView, 4);
        FrameLayout frameLayout = (FrameLayout) aad.q(softKeyboardView, R.id.f54620_resource_name_obfuscated_res_0x7f0b01b5);
        this.t = frameLayout;
        frameLayout.setOnClickListener(new cjr(this, 5));
        ((FrameLayout) aad.q(softKeyboardView, R.id.f54630_resource_name_obfuscated_res_0x7f0b01b6)).setOnTouchListener(cnn.a);
        bindingRecyclerView.az(new cnw(this));
    }

    public static int a(cjo cjoVar) {
        int b = msc.b(cjoVar.b().c);
        if (b == 0) {
            b = 1;
        }
        int i = b - 1;
        int b2 = msc.b(cjoVar.b().c);
        if (b2 != 0 && b2 == 18 && czs.c(cjoVar.d().d())) {
            return 1000;
        }
        return i;
    }

    public static lfb d(cjo cjoVar) {
        mse b = cjoVar.b();
        int b2 = msc.b(b.c);
        if (b2 != 0 && b2 == 18) {
            return lfb.g((b.b & 64) != 0 ? b.o : b.d);
        }
        return ldu.a;
    }

    public static lfb e(cjo cjoVar) {
        mse b = cjoVar.b();
        int b2 = msc.b(b.c);
        if (b2 != 0 && b2 == 33) {
            return lfb.g((b.b & 64) != 0 ? b.o : b.d);
        }
        return ldu.a;
    }

    public static lfb f(cjo cjoVar) {
        mse b = cjoVar.b();
        int b2 = msc.b(b.c);
        if (b2 != 0 && b2 == 31) {
            return lfb.g((b.b & 64) != 0 ? b.o : b.d);
        }
        return ldu.a;
    }

    public final LottieAnimationView b() {
        LottieAnimationView lottieAnimationView = this.v;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        this.t.removeAllViews();
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) LayoutInflater.from(this.c.getContext()).inflate(R.layout.f134460_resource_name_obfuscated_res_0x7f0e009f, (ViewGroup) this.t, false);
        this.v = lottieAnimationView2;
        this.t.addView(lottieAnimationView2);
        return this.v;
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final boolean c(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null || f.c != -10028) {
            return false;
        }
        kki.j(new cbq(this, 15));
        return false;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
        cuj a2 = this.e.a();
        if (a2 != null) {
            a2.B();
        }
        this.e.aa(null);
        this.u.close();
        this.i.close();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    public final void g() {
        iay iayVar = new iay(-10060, null, IExpressionMomentExtension.class);
        if (this.f.W()) {
            this.f.z(hfd.d(iayVar));
        }
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        ViewGroup L;
        hpy b = hqj.b();
        ObjectAnimator objectAnimator = null;
        this.q = b == null ? null : b.c.toString();
        this.y.g(gxo.a(1));
        this.j = editorInfo;
        this.w = 0;
        this.x = 0;
        if (((Boolean) cit.H.c()).booleanValue()) {
            hsk b2 = hsx.b();
            if (b2 != null && (L = b2.L(ice.HEADER)) != null) {
                this.o = L.getHeight();
                this.n = L.findViewById(R.id.softkey_holder_fixed_candidates);
            }
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.m.cancel();
            }
            if (this.l == null) {
                this.l = new AnimatorSet();
                View view = this.n;
                if (view == null) {
                    ((ltd) ((ltd) s.d()).k("com/google/android/apps/inputmethod/libs/expression/expressionmoment/impl/ExpressionMomentKeyboardPeer", "getExpressionHeaderExitAnimation", 380, "ExpressionMomentKeyboardPeer.java")).t("Try to play animation on null expression header");
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
                    objectAnimator.setDuration(80L);
                    objectAnimator.addListener(new cnq(this));
                }
                PathInterpolator pathInterpolator = new PathInterpolator(0.1f, 0.9f);
                ValueAnimator ofInt = ValueAnimator.ofInt(this.o, this.c.getContext().getResources().getDimensionPixelSize(R.dimen.f33920_resource_name_obfuscated_res_0x7f070171));
                ofInt.addUpdateListener(new op(this, 6));
                ofInt.addListener(new cnr(this));
                ofInt.setDuration(200L);
                ofInt.setInterpolator(pathInterpolator);
                PathInterpolator pathInterpolator2 = new PathInterpolator(0.1f, 0.9f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.e, "translationX", 500.0f, 0.0f);
                ofFloat.setDuration(200L);
                ofFloat.addListener(new cns(this));
                ofFloat.setInterpolator(pathInterpolator2);
                if (objectAnimator == null) {
                    this.l.playSequentially(ofInt, ofFloat);
                } else {
                    this.l.playSequentially(objectAnimator, ofInt, ofFloat);
                }
                this.l.addListener(new cnp(this));
            }
            if (!this.l.isStarted()) {
                k(R.raw.f147220_resource_name_obfuscated_res_0x7f130001);
                b().c();
                this.l.start();
            }
        } else {
            k(R.raw.f147220_resource_name_obfuscated_res_0x7f130001);
            b().f(1.0f);
            this.f.O(false);
            l();
        }
        this.k = 0;
        this.p = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ctt
    public final void i() {
        this.y.h();
        this.q = null;
        cuj a2 = this.e.a();
        if (a2 == null) {
            ((ltd) ((ltd) s.d()).k("com/google/android/apps/inputmethod/libs/expression/expressionmoment/impl/ExpressionMomentKeyboardPeer", "maybeLogVisibleCandidates", 688, "ExpressionMomentKeyboardPeer.java")).t("Failed to log visible candidate type, because adapter is empty");
        } else {
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 7;
            mbcVar.a |= 1;
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = 15;
            mbcVar2.a |= 2;
            for (int max = Math.max(this.w, 0); max <= this.x && max < a2.ha(); max++) {
                Object obj = ((cuq) a2.d.get(max)).a;
                if (obj instanceof cjo) {
                    cjo cjoVar = (cjo) obj;
                    ieh.j().e(ctd.EXPRESSION_MOMENT_CANDIDATE_TYPE_SHOWN, Integer.valueOf(a(cjoVar)));
                    int n = eju.n(cjoVar.b(), czs.c(cjoVar.d().d()), true);
                    if (n != 0) {
                        nfh t2 = mbt.e.t();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mbt mbtVar = (mbt) t2.b;
                        int i = mbtVar.a | 1;
                        mbtVar.a = i;
                        mbtVar.b = 1;
                        mbtVar.c = n - 1;
                        mbtVar.a = i | 2;
                        nfh t3 = mbq.e.t();
                        String uri = cjoVar.d().d().toString();
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        mbq mbqVar = (mbq) t3.b;
                        uri.getClass();
                        int i2 = mbqVar.a | 2;
                        mbqVar.a = i2;
                        mbqVar.c = uri;
                        mbqVar.a = i2 | 1;
                        mbqVar.b = max;
                        lfb d = d(cjoVar);
                        nfh t4 = mbp.e.t();
                        if (d.e()) {
                            String str = (String) d.a();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            mbp mbpVar = (mbp) t4.b;
                            mbpVar.a |= 1;
                            mbpVar.b = str;
                        }
                        lfb f = f(cjoVar);
                        if (f.e()) {
                            String str2 = (String) f.a();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            mbp mbpVar2 = (mbp) t4.b;
                            mbpVar2.a |= 2;
                            mbpVar2.c = str2;
                        }
                        lfb e = e(cjoVar);
                        if (e.e()) {
                            String str3 = (String) e.a();
                            if (t4.c) {
                                t4.cD();
                                t4.c = false;
                            }
                            mbp mbpVar3 = (mbp) t4.b;
                            mbpVar3.a |= 4;
                            mbpVar3.d = str3;
                        }
                        if (t3.c) {
                            t3.cD();
                            t3.c = false;
                        }
                        mbq mbqVar2 = (mbq) t3.b;
                        mbp mbpVar4 = (mbp) t4.cz();
                        mbpVar4.getClass();
                        mbqVar2.d = mbpVar4;
                        mbqVar2.a |= 4;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        mbt mbtVar2 = (mbt) t2.b;
                        mbq mbqVar3 = (mbq) t3.cz();
                        mbqVar3.getClass();
                        mbtVar2.d = mbqVar3;
                        mbtVar2.a |= 4;
                        t.dM(t2);
                    }
                }
            }
            this.b.e(ctd.IMPRESSION, t.cz());
        }
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.l.cancel();
        }
        AnimatorSet animatorSet2 = this.m;
        if (animatorSet2 != null && animatorSet2.isStarted() && !m()) {
            this.m.cancel();
            this.m = null;
        }
        this.l = null;
        if (this.f.W()) {
            this.f.O(true);
        }
        this.e.Y(0);
        this.v = null;
        this.t.removeAllViews();
        ieh.j().e(ctd.EXPRESSION_MOMENT_CANDIDATE_CLICK, Integer.valueOf(this.k));
    }

    public final void j() {
        this.e.setAlpha(1.0f);
        this.d.getLayoutParams().height = -1;
    }

    public final void k(int i) {
        this.v = null;
        b().d(i);
    }

    public final void l() {
        ly lyVar = this.e.m;
        if (lyVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lyVar;
            this.w = Math.min(this.w, linearLayoutManager.L());
            this.x = Math.max(this.x, linearLayoutManager.N());
        }
    }

    public final boolean m() {
        return ((Boolean) cit.I.c()).booleanValue() && this.n != null;
    }

    @Override // defpackage.ctt
    public final /* synthetic */ void n() {
    }
}
