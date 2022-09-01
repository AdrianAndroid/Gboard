package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.inputmethod.libs.japanese.keyboard.widget.MonolithicCandidatesHolderView;
import com.google.android.apps.inputmethod.libs.japanese.keyboard.widget.MonolithicCandidatesRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: dkv  reason: default package */
/* loaded from: classes.dex */
public final class dkv {
    public static final /* synthetic */ int m = 0;
    public final dku b;
    public final ice c;
    public final SoftKeyboardView d;
    public final dlc e;
    public final View g;
    public boolean h;
    public boolean i;
    public ino k;
    public final inm l;
    private final View p;
    private final View q;
    private final int r;
    private final int s;
    private final int t;
    private final ValueAnimator v;
    static final hhl a = hhq.a("japanese_always_use_single_candidate_row_ui", false);
    private static final TimeInterpolator n = new AccelerateInterpolator();
    private static final TimeInterpolator o = new DecelerateInterpolator();
    public dkt f = dkt.UNINITIALIZED;
    private int u = 0;
    public ibz j = dko.a;

    static {
        lug lugVar = hin.a;
    }

    public dkv(final dku dkuVar, ice iceVar, final SoftKeyboardView softKeyboardView) {
        int i;
        int min;
        int b;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.v = valueAnimator;
        jdg.v(iceVar == ice.BODY || iceVar == ice.FLOATING_CANDIDATES);
        this.b = dkuVar;
        this.c = iceVar;
        this.d = softKeyboardView;
        this.l = new inm() { // from class: dkq
            @Override // defpackage.inm
            public final void go(ino inoVar, String str) {
                dkv dkvVar = dkv.this;
                dku dkuVar2 = dkuVar;
                SoftKeyboardView softKeyboardView2 = softKeyboardView;
                if (dkuVar2.l() != null) {
                    dkvVar.j = dko.a(softKeyboardView2.getContext(), dkuVar2.l(), inoVar);
                } else {
                    dkvVar.j = dko.a;
                }
            }
        };
        View findViewById = softKeyboardView.findViewById(R.id.f65900_resource_name_obfuscated_res_0x7f0b07a6);
        this.p = findViewById;
        MonolithicCandidatesRecyclerView monolithicCandidatesRecyclerView = (MonolithicCandidatesRecyclerView) findViewById.findViewById(R.id.f96360_resource_name_obfuscated_res_0x7f0b141b);
        if (!((Boolean) dkn.a.c()).booleanValue() || monolithicCandidatesRecyclerView == null) {
            View findViewById2 = findViewById.findViewById(R.id.f96350_resource_name_obfuscated_res_0x7f0b141a);
            this.e = (dlc) findViewById2;
            findViewById2.setVisibility(0);
            if (monolithicCandidatesRecyclerView != null) {
                monolithicCandidatesRecyclerView.setVisibility(8);
            }
        } else {
            dlg dlgVar = new dlg(softKeyboardView.getContext(), monolithicCandidatesRecyclerView.W, monolithicCandidatesRecyclerView.V, (int) (monolithicCandidatesRecyclerView.S * monolithicCandidatesRecyclerView.T), monolithicCandidatesRecyclerView.U);
            this.e = dlgVar;
            softKeyboardView.getContext();
            monolithicCandidatesRecyclerView.ab(new LinearLayoutManager());
            monolithicCandidatesRecyclerView.aw();
            monolithicCandidatesRecyclerView.aa(dlgVar);
            monolithicCandidatesRecyclerView.setVisibility(0);
            findViewById.findViewById(R.id.f96350_resource_name_obfuscated_res_0x7f0b141a).setVisibility(8);
        }
        findViewById.addOnLayoutChangeListener(new dkr(this, 0));
        FrameLayout frameLayout = (FrameLayout) softKeyboardView.findViewById(R.id.f65910_resource_name_obfuscated_res_0x7f0b07a7);
        if (frameLayout != null) {
            dlc dlcVar = this.e;
            if (dlcVar instanceof MonolithicCandidatesHolderView) {
                ((MonolithicCandidatesHolderView) dlcVar).a = frameLayout;
            }
        }
        valueAnimator.addUpdateListener(new op(this, 13));
        View findViewById3 = softKeyboardView.findViewById(R.id.input_area);
        this.q = findViewById3;
        View findViewById4 = softKeyboardView.findViewById(R.id.f67010_resource_name_obfuscated_res_0x7f0b082e);
        this.g = findViewById4;
        Resources resources = softKeyboardView.getResources();
        Context context = softKeyboardView.getContext();
        float e = dkuVar.e();
        if (((Boolean) a.c()).booleanValue()) {
            i = 1;
        } else {
            i = jbt.i(context, R.attr.f2880_resource_name_obfuscated_res_0x7f040050, context.getResources().getConfiguration().orientation != 2 ? 1 : 2);
        }
        int g = g(context, e, i);
        this.r = g;
        ieh.j().e(dry.UPDATE_CANDIDATE_UI, Integer.valueOf(i));
        this.s = g(context, e, 1);
        if (findViewById3 == null) {
            min = 0;
        } else {
            htc k = dkuVar.k();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f37080_resource_name_obfuscated_res_0x7f07031b);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.f4800_resource_name_obfuscated_res_0x7f040110});
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            min = (int) ((k == null || (b = k.b(g)) <= 0) ? dimensionPixelSize2 * e : Math.min(b, dimensionPixelSize2 * e));
        }
        this.t = min;
        this.i = false;
        if (findViewById3 != null) {
            findViewById3.setVisibility(0);
            k(findViewById3, min);
        }
        if (findViewById4 != null) {
            findViewById4.setVisibility(8);
        }
        a(dkt.HIDDEN);
    }

    private static int g(Context context, float f, int i) {
        return (int) (jbt.f(context, R.attr.f4910_resource_name_obfuscated_res_0x7f04011d, context.getResources().getDimensionPixelSize(R.dimen.f37200_resource_name_obfuscated_res_0x7f07032c)) * i * f);
    }

    private final int h() {
        return this.i ? this.s : this.r;
    }

    private final Animator.AnimatorListener i(dkt dktVar) {
        return new dks(this, dktVar);
    }

    private final void j(int i) {
        View view = this.q;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private static void k(View view, int i) {
        if (view.getLayoutParams().height != i) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void a(dkt dktVar) {
        boolean z = true;
        jdg.v(dktVar != dkt.UNINITIALIZED);
        dkt dktVar2 = this.f;
        if (this.q == null) {
            dktVar = (dkt) jdg.U(dktVar.a(), dktVar);
        }
        if (dktVar2 == dktVar) {
            return;
        }
        this.f = dktVar;
        int h = this.t + h();
        this.b.fp(1024L, dktVar.b());
        ice iceVar = ice.HEADER;
        int ordinal = dktVar.ordinal();
        if (ordinal == 1) {
            if (this.q != null) {
                this.v.cancel();
                f(0);
            }
            this.p.setVisibility(8);
            j(0);
            if (this.c != ice.FLOATING_CANDIDATES) {
                k(this.d, this.t);
            }
        } else if (ordinal == 2) {
            if (this.q != null) {
                this.v.cancel();
                f(0);
            }
            this.p.setVisibility(0);
            j(0);
            if (this.c != ice.FLOATING_CANDIDATES) {
                k(this.p, h());
                k(this.d, h);
            }
        } else if (ordinal == 3) {
            if (this.c == ice.FLOATING_CANDIDATES) {
                z = false;
            }
            jdg.F(z);
            this.v.cancel();
            f(this.t);
            this.p.setVisibility(0);
            j(4);
            k(this.p, h);
            k(this.d, h);
        } else if (ordinal == 4) {
            jdg.F(this.c != ice.FLOATING_CANDIDATES);
            this.v.setIntValues(this.u, this.t);
            this.v.setInterpolator(n);
            this.v.setDuration(300L);
            this.v.removeAllListeners();
            this.v.addListener(i(dkt.SHOWN_TO_EXPANDED));
            this.v.start();
            this.p.setVisibility(0);
            j(0);
            k(this.p, h);
            k(this.d, h);
        } else if (ordinal == 5) {
            jdg.F(this.c != ice.FLOATING_CANDIDATES);
            this.v.setIntValues(this.u, 0);
            this.v.setInterpolator(o);
            this.v.setDuration(200L);
            this.v.removeAllListeners();
            this.v.addListener(i(dkt.EXPANDED_TO_SHOWN));
            this.v.start();
            this.p.setVisibility(0);
            j(0);
            k(this.p, h);
            k(this.d, h);
        } else {
            throw new AssertionError("unexpected case: ".concat(String.valueOf(String.valueOf(dktVar))));
        }
        if (dktVar2 != dkt.UNINITIALIZED && dktVar2.c() == dktVar.c()) {
            return;
        }
        this.b.m(ice.HEADER);
        this.b.m(this.c);
    }

    public final void b() {
        e(false);
    }

    public final void c(boolean z, boolean z2) {
        dkt dktVar;
        boolean z3 = false;
        jdg.v(z || !z2);
        if (this.r > 0) {
            z3 = true;
        }
        jdg.F(z3);
        if (!z) {
            a(dkt.HIDDEN);
        } else if (z2) {
            a(dkt.SHOWN_TO_EXPANDED);
        } else {
            if (this.f == dkt.EXPANDED || this.f == dkt.SHOWN_TO_EXPANDED) {
                dktVar = dkt.EXPANDED_TO_SHOWN;
            } else {
                dktVar = dkt.SHOWN;
            }
            a(dktVar);
        }
    }

    public final void d(int i) {
        if (this.c == ice.BODY) {
            this.p.setClipBounds(new Rect(0, 0, i, this.u + h()));
        }
    }

    public final void e(boolean z) {
        boolean z2 = false;
        if (z && this.f.b()) {
            z2 = true;
        }
        c(z, z2);
    }

    public final void f(int i) {
        this.u = i;
        View view = this.q;
        if (view != null) {
            view.setTranslationY(i);
        }
        d(this.p.getWidth());
    }
}
