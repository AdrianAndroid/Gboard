package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.ManagedFrameLayout;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.List;

/* compiled from: PG */
/* renamed from: ddp  reason: default package */
/* loaded from: classes.dex */
public class ddp implements ddr, dev, hws {
    private static final ltg m = ltg.j("com/google/android/apps/inputmethod/libs/framework/keyboard/DualCandidatesViewController");
    private hln A;
    private ibm B;
    private iav C;
    private idn D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private int I;
    public final ddq a;
    protected View b;
    public View c;
    public View d;
    public ddx e;
    protected des f;
    public boolean g;
    public List h;
    public hln i;
    public boolean j;
    public ice k;
    idk l;
    private View n;
    private boolean o;
    private boolean p;
    private boolean q;
    private AnimatorSet r;
    private AnimatorSet s;
    private dew t;
    private ded u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    public ddp(ddq ddqVar) {
        this.a = ddqVar;
    }

    private final void A(boolean z) {
        ddx ddxVar = this.e;
        if (ddxVar != null) {
            ddxVar.q(z);
        }
        dew dewVar = this.t;
        if (dewVar != null) {
            dewVar.q(z);
        }
    }

    private final void B(ice iceVar, hwv hwvVar) {
        if (this.b != null) {
            this.a.o().i(iceVar, this.b.getId(), false, hwvVar, true);
        }
    }

    private final void C() {
        boolean z = true;
        if (!this.o) {
            ice x = x();
            if (this.a.o().i(x, this.G, false, (this.F || !fhr.v(this.E)) ? hwv.PREEMPTIVE : hwv.DEFAULT, true)) {
                this.o = true;
            }
            this.a.gk(x);
        }
        if (!v() || !this.o) {
            z = false;
        }
        u(z);
    }

    private final void D(hln hlnVar, ded dedVar, boolean z) {
        this.A = hlnVar;
        this.u = dedVar;
        this.a.x(hlnVar, z);
    }

    private final boolean E() {
        return this.x && this.z <= 0;
    }

    private final boolean F(boolean z) {
        return this.a.o().e(x(), this.G, false, z);
    }

    private final boolean G() {
        return H(this.a.gi());
    }

    private final boolean H(long j) {
        iav iavVar = this.C;
        if (iavVar.i == null) {
            return false;
        }
        long j2 = iavVar.j;
        return j2 == 0 ? (j & 29) == 0 : (j & j2) == j2;
    }

    private final hfd w(hln hlnVar) {
        hfd d = hfd.d(new iay(-10002, null, hlnVar));
        d.k = this;
        return d;
    }

    private final ice x() {
        ice iceVar = this.k;
        return iceVar == null ? ice.HEADER : iceVar;
    }

    private final void y(ded dedVar, boolean z) {
        hln h;
        if (z) {
            h = dedVar.g();
        } else {
            h = dedVar.h();
        }
        boolean z2 = true;
        if (h != null) {
            ded dedVar2 = this.u;
            if (dedVar2 != null) {
                dedVar2.F(null);
            }
            D(h, dedVar, true);
        }
        ddq ddqVar = this.a;
        if (this.u == null || this.A == null) {
            z2 = false;
        }
        ddqVar.fp(256L, z2);
    }

    private final void z() {
        ddx ddxVar = this.e;
        if (ddxVar != null) {
            ddxVar.n();
        }
        dew dewVar = this.t;
        if (dewVar != null) {
            dewVar.n();
        }
        ded dedVar = this.u;
        if (dedVar != null) {
            dedVar.F(null);
        }
        this.u = null;
    }

    public void a(List list) {
        des desVar = this.f;
        if (desVar != null) {
            desVar.a(list);
        }
    }

    @Override // defpackage.ddr
    public void b(List list, hln hlnVar, boolean z) {
        SoftKeyView i;
        boolean z2 = false;
        if (this.y) {
            z();
            if (!this.p) {
                u(false);
            }
            this.y = false;
        }
        this.x = z;
        if (list == null || list.isEmpty()) {
            return;
        }
        ddx ddxVar = this.e;
        if (ddxVar == null || !ddxVar.E()) {
            this.g = true;
            C();
            this.h = list;
            this.i = hlnVar;
            this.j = z;
            return;
        }
        this.z -= list.size();
        if (!this.e.D()) {
            if (this.G != R.id.softkey_holder_fixed_candidates) {
                ((View) this.e).setVisibility(0);
            }
            list = this.e.k(list);
            if (this.D != null && (i = this.e.i()) != null) {
                i.a = new ddl(this.D, 0);
            }
            if (!this.e.D()) {
                if (E()) {
                    int i2 = this.v;
                    this.z = i2;
                    this.a.w(i2);
                }
                list = null;
            }
        }
        if (list == null || list.isEmpty()) {
            t(false, true);
        } else {
            this.t.l(list);
        }
        if (this.e == null) {
            t(true, true);
        }
        if (hlnVar != null) {
            if (this.e.F(hlnVar)) {
                D(hlnVar, this.e, false);
            } else if (!this.p) {
                hln g = this.e.g();
                if (g != null) {
                    D(g, this.e, false);
                }
            } else if (this.t.F(hlnVar)) {
                D(hlnVar, this.t, false);
            } else {
                ((ltd) m.a(hip.a).k("com/google/android/apps/inputmethod/libs/framework/keyboard/DualCandidatesViewController", "autoSelectTextCandidate", 707, "DualCandidatesViewController.java")).t("Invalid selected candidate");
            }
        }
        ddq ddqVar = this.a;
        if (this.u != null) {
            z2 = true;
        }
        ddqVar.fp(256L, z2);
        C();
        idn idnVar = this.D;
        if (idnVar == null) {
            return;
        }
        idnVar.b(idv.REQUEST_TO_CANDIDATE_APPENDED);
    }

    @Override // defpackage.ddr
    public final void c(Context context, ibm ibmVar, iav iavVar) {
        this.B = ibmVar;
        this.C = iavVar;
        this.l = ieh.j();
    }

    @Override // defpackage.ddr, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d(ice iceVar, View view) {
        int i = R.id.softkey_holder_fixed_candidates;
        View findViewById = view.findViewById(R.id.softkey_holder_fixed_candidates);
        boolean z = false;
        if (findViewById == null) {
            ((ltd) ((ltd) m.b()).k("com/google/android/apps/inputmethod/libs/framework/keyboard/DualCandidatesViewController", "initTopCandidatesArea", 195, "DualCandidatesViewController.java")).t("No top candidates holder in the view.");
            return false;
        }
        this.b = view.findViewById(R.id.f56120_resource_name_obfuscated_res_0x7f0b0258);
        this.k = iceVar;
        ddx ddxVar = (ddx) findViewById;
        this.e = ddxVar;
        ddxVar.w(this.B.f);
        this.v = this.e.c();
        this.e.v(this.C.i);
        SoftKeyView softKeyView = (SoftKeyView) view.findViewById(R.id.key_pos_show_more_candidates);
        this.q = softKeyView != null && softKeyView.getVisibility() == 0;
        this.e.z(softKeyView);
        this.e.x(new ddm(this, view));
        if (ManagedFrameLayout.b(findViewById)) {
            this.G = R.id.softkey_holder_fixed_candidates;
        } else {
            i = R.id.f56160_resource_name_obfuscated_res_0x7f0b025c;
            this.G = R.id.f56160_resource_name_obfuscated_res_0x7f0b025c;
        }
        if (view.findViewById(i).getVisibility() == 0) {
            z = true;
        }
        this.o = z;
        return true;
    }

    @Override // defpackage.ddr
    public final void e() {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.s;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.g = false;
        if (this.k != null) {
            this.a.o().c(ibz.a, this.k, this.G);
            ice iceVar = this.k;
            if (this.b != null) {
                this.a.o().e(iceVar, this.b.getId(), false, false);
            }
            if (this.o && F(false)) {
                this.o = false;
            }
            u(false);
        }
    }

    @Override // defpackage.ddr
    public final void f(long j, long j2) {
        View view;
        if (icu.e(j) && !icu.e(j2) && (view = this.d) != null) {
            view.post(new cvj(this, 15));
        }
        boolean G = G();
        if (G != H(j)) {
            A(G);
        }
    }

    @Override // defpackage.ddr
    public void g(View view, icf icfVar) {
        View findViewById;
        if ((icfVar.b == ice.HEADER || icfVar.b == ice.FLOATING_CANDIDATES) && d(icfVar.b, view)) {
            this.H = icfVar.d;
        }
        ice iceVar = icfVar.b;
        if (iceVar == ice.BODY || iceVar == ice.FLOATING_CANDIDATES) {
            if (view instanceof SoftKeyboardView) {
                findViewById = ((SoftKeyboardView) view).d(R.id.f65900_resource_name_obfuscated_res_0x7f0b07a6);
            } else {
                findViewById = view.findViewById(R.id.f65900_resource_name_obfuscated_res_0x7f0b07a6);
            }
            if (findViewById == null || findViewById.findViewById(R.id.f96350_resource_name_obfuscated_res_0x7f0b141a) == null) {
                ((ltd) ((ltd) m.b()).k("com/google/android/apps/inputmethod/libs/framework/keyboard/DualCandidatesViewController", "initMoreCandidatesArea", 275, "DualCandidatesViewController.java")).t("No softkey_holder_more_candidates");
                return;
            }
            this.c = view.findViewById(R.id.input_area);
            this.n = view.findViewById(R.id.f52650_resource_name_obfuscated_res_0x7f0b00b8);
            this.d = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            this.p = false;
            AnimatorSet animatorSet = new AnimatorSet();
            this.r = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.d, "translationY", 0.0f).setDuration(80L), ObjectAnimator.ofFloat(this.d, "alpha", 0.0f, 1.0f).setDuration(80L), ObjectAnimator.ofFloat(this.c, "alpha", 1.0f, 0.0f).setDuration(80L));
            this.r.getChildAnimations().get(0).addListener(new ddn(this));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.s = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.d, "translationY", 0.0f).setDuration(80L), ObjectAnimator.ofFloat(this.d, "alpha", 1.0f, 0.0f).setDuration(80L), ObjectAnimator.ofFloat(this.c, "alpha", 0.0f, 1.0f).setDuration(80L));
            this.s.getChildAnimations().get(0).addListener(new ddo(this));
            dew dewVar = (dew) findViewById.findViewById(R.id.f96350_resource_name_obfuscated_res_0x7f0b141a);
            this.t = dewVar;
            this.w = dewVar.u();
            this.t.w(this.B.f);
            this.t.G(this);
            this.t.v(this.C.i);
            des desVar = (des) view.findViewById(R.id.f96370_resource_name_obfuscated_res_0x7f0b141c);
            this.f = desVar;
            if (desVar != null) {
                desVar.a(null);
            }
            this.I = icfVar.d;
        }
    }

    @Override // defpackage.det
    public final void gs(deu deuVar, int i) {
        this.a.fp(4096L, deuVar.H());
        this.a.fp(8192L, deuVar.I());
    }

    @Override // defpackage.ddr
    public void h(icf icfVar) {
        if ((icfVar.b == ice.HEADER || icfVar.b == ice.FLOATING_CANDIDATES) && this.H == icfVar.d) {
            this.b = null;
            this.o = false;
            this.e = null;
            this.q = false;
            this.H = 0;
        }
        ice iceVar = icfVar.b;
        if ((iceVar == ice.BODY || iceVar == ice.FLOATING_CANDIDATES) && this.I == icfVar.d) {
            View view = this.d;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.c;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            this.c = null;
            this.n = null;
            this.d = null;
            this.p = false;
            this.t = null;
            this.r = null;
            this.s = null;
            this.f = null;
            this.I = 0;
        }
    }

    @Override // defpackage.hws
    public final void hL() {
        this.o = false;
        u(false);
    }

    @Override // defpackage.hws
    public final void hM() {
        ddx ddxVar = this.e;
        if (ddxVar == null || ddxVar.b() <= 0) {
            return;
        }
        C();
    }

    public final void i() {
        boolean z = true;
        if (this.o) {
            ice x = x();
            if (F(true)) {
                B(x, hwv.DEFAULT);
                this.o = false;
            }
            this.a.gk(x);
        }
        if (!v() || !this.o) {
            z = false;
        }
        u(z);
    }

    @Override // defpackage.ddr
    public final void j(boolean z) {
        if (z) {
            this.D = ieh.j().a(idv.REQUEST_TO_CANDIDATE_DRAWN);
        }
        this.x = z;
        boolean z2 = false;
        this.z = 0;
        if (z) {
            this.y = true;
            int i = this.v;
            if (this.p) {
                i += this.w;
            }
            r(i + 1);
        } else {
            z();
            i();
            t(false, false);
        }
        ddq ddqVar = this.a;
        if (this.u != null) {
            z2 = true;
        }
        ddqVar.fp(256L, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00af  */
    @Override // defpackage.ddr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(defpackage.hfd r7) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddp.k(hfd):boolean");
    }

    @Override // defpackage.ddr
    public final boolean l(ice iceVar) {
        if (iceVar == ice.HEADER || iceVar == ice.FLOATING_CANDIDATES) {
            return this.o;
        }
        if (iceVar != ice.BODY) {
            return false;
        }
        return this.p;
    }

    @Override // defpackage.hws
    public final /* synthetic */ Animator m() {
        return null;
    }

    @Override // defpackage.ddr
    public final void n() {
        A(G());
        u(false);
        ice iceVar = this.k;
        if (iceVar != null) {
            B(iceVar, hwv.DEFAULT);
            this.a.o().h(ibz.a, this.k, this.G, this);
        }
        this.E = false;
    }

    @Override // defpackage.dev
    public final void r(int i) {
        if (E()) {
            this.z = i;
            this.a.w(i);
        }
    }

    public final void s(int i) {
        View view = this.c;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    public final void t(boolean z, boolean z2) {
        AnimatorSet animatorSet;
        if (this.p == z || this.d == null) {
            return;
        }
        int i = 0;
        if (z) {
            this.l.e(dda.OPENED_MORE_CANDIDATES_AREA, new Object[0]);
        }
        this.p = z;
        AnimatorSet animatorSet2 = z ? this.s : this.r;
        if (z) {
            animatorSet = this.r;
        } else {
            animatorSet = this.s;
        }
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (animatorSet == null || !z2 || !jam.o()) {
            this.d.setVisibility(true != z ? 8 : 0);
            if (true == z) {
                i = 4;
            }
            s(i);
            this.a.gk(this.k);
        } else {
            int height = this.d.getHeight();
            if (height <= 0 && this.d.getParent() != null) {
                height = ((ViewGroup) this.d.getParent()).getHeight();
            }
            if (z) {
                Animator animator = animatorSet.getChildAnimations().get(0);
                if (animator instanceof ObjectAnimator) {
                    ((ObjectAnimator) animator).setFloatValues(-height, 0.0f);
                }
            } else {
                Animator animator2 = animatorSet.getChildAnimations().get(0);
                if (animator2 instanceof ObjectAnimator) {
                    ((ObjectAnimator) animator2).setFloatValues(0.0f, -height);
                }
            }
            animatorSet.start();
        }
        this.a.gk(ice.BODY);
        if (!z && this.u == this.t) {
            y(this.e, true);
        }
        this.a.fp(1024L, z);
    }

    protected final void u(boolean z) {
        if (this.q != z) {
            ice iceVar = this.k;
            if (iceVar == null) {
                iceVar = ice.HEADER;
            }
            ice iceVar2 = iceVar;
            if (z) {
                if (!this.a.o().i(iceVar2, R.id.key_pos_show_more_candidates, false, hwv.DEFAULT, false)) {
                    return;
                }
                this.q = true;
            } else if (!this.a.o().e(iceVar2, R.id.key_pos_show_more_candidates, true, false)) {
            } else {
                this.q = false;
            }
        }
    }

    protected final boolean v() {
        dew dewVar = this.t;
        return (dewVar != null && dewVar.b() > 0) || this.p;
    }
}
