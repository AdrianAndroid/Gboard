package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.ScrollableCandidatesHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: bpf  reason: default package */
/* loaded from: classes.dex */
public class bpf implements ddr, hws, bqe {
    protected final ddq b;
    LatinFixedCountCandidatesHolderView c;
    bqf d;
    boolean e;
    int f;
    public boolean g;
    public List h;
    public hln i;
    public boolean j;
    private boolean l;
    private ibm m;
    private iav n;
    private View o;
    private idn p;
    private View q;
    private boolean r;
    private boolean s;
    private Boolean t;
    private boolean u = false;
    private static final ltg k = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/LatinCandidatesViewController");
    public static final hhl a = hhq.a("use_scrollable_candidate_for_voice", false);

    public bpf(ddq ddqVar) {
        this.b = ddqVar;
    }

    private final void q() {
        this.f = 0;
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
        if (latinFixedCountCandidatesHolderView != null) {
            latinFixedCountCandidatesHolderView.n();
        }
        this.d.a();
        this.t = null;
    }

    private final void r(boolean z) {
        this.b.o().e(ice.HEADER, R.id.softkey_holder_fixed_candidates, false, z);
    }

    private final void s() {
        hwv hwvVar;
        Boolean bool;
        boolean v = fhr.v(this.r);
        hww o = this.b.o();
        ice iceVar = ice.HEADER;
        if (!this.s && (v || ((bool = this.t) != null && bool.booleanValue()))) {
            hwvVar = hwv.DEFAULT;
        } else {
            hwvVar = hwv.PREEMPTIVE;
        }
        o.i(iceVar, R.id.softkey_holder_fixed_candidates, false, hwvVar, true);
    }

    @Override // defpackage.bqe
    public final hww a() {
        return this.b.o();
    }

    @Override // defpackage.ddr
    public final void b(List list, hln hlnVar, boolean z) {
        ddw ddwVar;
        SoftKeyView i;
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView;
        this.e = z;
        if (list == null || list.size() == 0) {
            if (!this.l) {
                return;
            }
            q();
            this.l = false;
            return;
        }
        if (this.l) {
            this.f = 0;
            LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView2 = this.c;
            if (latinFixedCountCandidatesHolderView2 != null) {
                latinFixedCountCandidatesHolderView2.s();
            }
            this.d.a();
            this.t = null;
            this.l = false;
        }
        if (this.t == null) {
            hln hlnVar2 = (hln) list.get(0);
            this.t = Boolean.valueOf((hlnVar2.s == 10 && hlnVar2.e != hlm.APP_COMPLETION && ((Boolean) a.c()).booleanValue()) || (hlnVar2.s == 10 && hlnVar2.e == hlm.APP_COMPLETION));
        }
        if (this.t.booleanValue() || (latinFixedCountCandidatesHolderView = this.c) == null || latinFixedCountCandidatesHolderView.E()) {
            this.f += list.size();
            if (this.t.booleanValue()) {
                bqf bqfVar = this.d;
                if (!bqfVar.f) {
                    View view = bqfVar.c;
                    if (view instanceof SoftKeyboardView) {
                        bqfVar.f = true;
                        View d = ((SoftKeyboardView) view).d(R.id.f67960_resource_name_obfuscated_res_0x7f0b08ab);
                        ScrollableCandidatesHolderView scrollableCandidatesHolderView = (ScrollableCandidatesHolderView) bqfVar.c.findViewById(R.id.f67950_resource_name_obfuscated_res_0x7f0b08aa);
                        bqfVar.b = d;
                        bqfVar.a = scrollableCandidatesHolderView;
                        if (d != null && scrollableCandidatesHolderView != null) {
                            d.setLayoutDirection(bqfVar.e);
                            scrollableCandidatesHolderView.w(bqfVar.d);
                        }
                    }
                }
            }
            if (!this.t.booleanValue() || (ddwVar = this.d.a) == null) {
                ddwVar = this.c;
            }
            if (!ddwVar.D()) {
                ddwVar.l(list);
                if (this.p != null && (i = ddwVar.i()) != null) {
                    i.a = new ddl(this.p, 1);
                }
                if (!ddwVar.D()) {
                    i(false);
                }
            }
            if (hlnVar != null && (ddwVar.F(hlnVar) || (hlnVar = ddwVar.g()) != null)) {
                this.b.x(hlnVar, false);
            }
            if (this.f > 0) {
                if (!this.t.booleanValue()) {
                    this.d.b();
                }
                s();
                if (this.t.booleanValue()) {
                    this.d.c();
                }
            }
            idn idnVar = this.p;
            if (idnVar == null) {
                return;
            }
            idnVar.b(idv.REQUEST_TO_CANDIDATE_APPENDED);
            return;
        }
        this.g = true;
        this.h = list;
        this.i = hlnVar;
        this.j = z;
    }

    @Override // defpackage.ddr
    public final void c(Context context, ibm ibmVar, iav iavVar) {
        this.m = ibmVar;
        this.n = iavVar;
        this.d = new bqf(this);
    }

    @Override // defpackage.ddr, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    public final void d() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.o.getMeasuredHeight(), 1073741824);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(this.o.getMeasuredWidth(), 1073741824), makeMeasureSpec);
    }

    @Override // defpackage.ddr
    public final void e() {
        if (this.u) {
            this.u = false;
            this.b.o().d(ice.HEADER, R.id.softkey_holder_fixed_candidates);
        }
        this.g = false;
        r(false);
        bqf bqfVar = this.d;
        bqfVar.b();
        if (bqfVar.a != null) {
            bqfVar.a = null;
        }
    }

    @Override // defpackage.ddr
    public final void f(long j, long j2) {
    }

    @Override // defpackage.ddr
    public final void g(View view, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            ice iceVar = icfVar.b;
            this.o = view.findViewById(R.id.f129250_resource_name_obfuscated_res_0x7f0b2146);
            LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = (LatinFixedCountCandidatesHolderView) view.findViewById(R.id.softkey_holder_fixed_candidates);
            this.c = latinFixedCountCandidatesHolderView;
            latinFixedCountCandidatesHolderView.w(this.m.f);
            this.c.v(this.n.i);
            this.c.d = new bpe(this);
            int gh = this.b.gh();
            bqf bqfVar = this.d;
            ibm ibmVar = this.m;
            bqfVar.c = view;
            bqfVar.d = ibmVar.f;
            bqfVar.e = gh;
            bqfVar.f = false;
            this.c.setLayoutDirection(gh);
            view.setLayoutDirection(gh);
            this.b.gk(iceVar);
            View findViewById = view.findViewById(R.id.key_pos_header_access_points_menu);
            this.q = findViewById;
            if (findViewById instanceof ViewGroup) {
                return;
            }
            ((ltd) ((ltd) k.b()).k("com/google/android/apps/inputmethod/latin/keyboard/LatinCandidatesViewController", "onKeyboardViewCreated", 128, "LatinCandidatesViewController.java")).t("No search candidate controller init: no access point entry icon.");
        }
    }

    @Override // defpackage.ddr
    public final void h(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
            if (latinFixedCountCandidatesHolderView != null) {
                latinFixedCountCandidatesHolderView.d = null;
            }
            this.c = null;
            this.o = null;
            this.q = null;
            bqf bqfVar = this.d;
            bqfVar.b = null;
            bqfVar.c = null;
            bqfVar.f = false;
        }
    }

    @Override // defpackage.hws
    public final /* synthetic */ void hL() {
    }

    @Override // defpackage.hws
    public final void hM() {
        ScrollableCandidatesHolderView scrollableCandidatesHolderView = this.d.a;
        if (scrollableCandidatesHolderView == null || scrollableCandidatesHolderView.b() <= 0) {
            LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
            if (latinFixedCountCandidatesHolderView == null || latinFixedCountCandidatesHolderView.f <= 0) {
                return;
            }
            s();
            return;
        }
        this.d.c();
    }

    final void i(boolean z) {
        int i;
        Boolean bool = this.t;
        if (bool == null || !bool.booleanValue()) {
            LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.c;
            i = latinFixedCountCandidatesHolderView == null ? 0 : latinFixedCountCandidatesHolderView.c;
        } else {
            i = 1073741823;
        }
        if (!this.e || this.f >= i) {
            return;
        }
        ddq ddqVar = this.b;
        if (z) {
            i++;
        }
        ddqVar.w(i);
    }

    @Override // defpackage.ddr
    public final void j(boolean z) {
        if (z) {
            this.p = ieh.j().a(idv.REQUEST_TO_CANDIDATE_DRAWN);
        }
        this.e = z;
        this.f = 0;
        if (z) {
            this.l = true;
            i(true);
            return;
        }
        q();
        r(true);
    }

    @Override // defpackage.ddr
    public boolean k(hfd hfdVar) {
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        if ((!this.r && f.d == iax.DECODE) || f.c == 67) {
            this.r = true;
        }
        int i = f.c;
        if (i == -10028) {
            this.s = true;
        } else if (i == -10029) {
            this.s = false;
        }
        return false;
    }

    @Override // defpackage.ddr
    public final boolean l(ice iceVar) {
        throw null;
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }

    @Override // defpackage.ddr
    public final void n() {
        View view;
        this.u = this.b.o().b(ice.HEADER, R.id.softkey_holder_fixed_candidates, this);
        bqf bqfVar = this.d;
        if (bqfVar.f && (view = bqfVar.c) != null && bqfVar.b != null) {
            bqfVar.a = (ScrollableCandidatesHolderView) view.findViewById(R.id.f67950_resource_name_obfuscated_res_0x7f0b08aa);
        }
        this.r = false;
    }
}
