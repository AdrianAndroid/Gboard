package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.accesspoint.impl.ExpandAccessPointsHintView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gsa  reason: default package */
/* loaded from: classes.dex */
public final class gsa {
    public final grn a;
    public final grz b;
    public final huh c;
    public final grg d;
    public final imn e;
    public View f;
    public gqw g;
    public SoftKeyView h;
    public SoftKeyboardView i;
    public gqz j;
    public gqh k;
    public boolean l;
    public boolean m;
    public boolean n;
    private View o;
    private List p;
    private Animator q;

    public gsa(Context context, imn imnVar, gqc gqcVar, final grz grzVar) {
        this.b = grzVar;
        this.e = imnVar;
        this.a = new grn(context);
        huh huhVar = new huh(gqcVar, imnVar, new gsd(this, grzVar), null);
        this.c = huhVar;
        huhVar.b(R.id.f67230_resource_name_obfuscated_res_0x7f0b0847);
        grg grgVar = new grg(new grf() { // from class: grx
            @Override // defpackage.grf
            public final void a(gqy gqyVar, String str, int i) {
                gsa gsaVar = gsa.this;
                grz grzVar2 = grzVar;
                gqw gqwVar = gsaVar.g;
                if (gqyVar == gqwVar) {
                    grzVar2.a(str, i);
                } else if (gqyVar != gsaVar.j || gqwVar == null) {
                } else {
                    grzVar2.a(str, i + gqwVar.i());
                }
            }
        }, imnVar);
        this.d = grgVar;
        grgVar.a = R.layout.f144020_resource_name_obfuscated_res_0x7f0e04b2;
    }

    private final boolean k() {
        gqz gqzVar = this.j;
        if (gqzVar != null) {
            return gqzVar.i() > 0;
        }
        List list = this.p;
        return list != null && !list.isEmpty();
    }

    public final void a() {
        Animator animator = this.q;
        if (animator != null && animator.isStarted()) {
            this.q.cancel();
        }
        this.q = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z, boolean z2) {
        this.l = false;
        d();
        Animator animator = this.q;
        if (animator == null || !animator.isStarted()) {
            Animator animator2 = null;
            if (z) {
                grn grnVar = this.a;
                if (jam.o()) {
                    if (grnVar.h == null) {
                        grnVar.h = AnimatorInflater.loadAnimator(grnVar.a, R.animator.f440_resource_name_obfuscated_res_0x7f02000b);
                        grnVar.h.setInterpolator(new afh());
                        grnVar.h.addListener(new grl(grnVar));
                    }
                    gqx gqxVar = grnVar.c;
                    if (gqxVar != null) {
                        grnVar.h.setTarget(gqxVar);
                    }
                    animator2 = grnVar.h;
                }
            }
            this.q = animator2;
            if (animator2 != null) {
                this.q.addListener(new gry(this, z2));
                this.q.start();
                return;
            }
            c(z2);
        }
    }

    public final void c(boolean z) {
        if (((gro) this.b).a.c.V().e(ice.HEADER, R.id.f51620_resource_name_obfuscated_res_0x7f0b0017, true, true)) {
            gqp.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.m) {
            this.c.c();
            this.m = false;
            gro groVar = (gro) this.b;
            groVar.a.c.O().d(R.string.f149480_resource_name_obfuscated_res_0x7f14011a, new Object[0]);
            grt grtVar = groVar.a;
            if (grtVar.d.l) {
                grtVar.s(hwv.PREEMPTIVE);
            }
            gsk gskVar = groVar.a.e;
            if (gskVar.b != -1) {
                gskVar.a.g(gsm.a, SystemClock.elapsedRealtime() - gskVar.b);
                gskVar.b = -1L;
            }
            groVar.a.c.be(true, ice.BODY);
            groVar.a.k.c();
            gsi gsiVar = groVar.a.g;
            if (gsiVar != null) {
                gsiVar.a();
            }
            gqp.d(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        huh huhVar = this.c;
        SoftKeyboardView softKeyboardView = huhVar.g;
        if (softKeyboardView != null) {
            huhVar.c.c(softKeyboardView, null, true);
        }
        huhVar.e = null;
        gvt.a(huhVar.f);
        huhVar.f = null;
        htu htuVar = huhVar.d;
        if (htuVar != null) {
            htuVar.g();
        }
        gvt.a(huhVar.d);
        huhVar.d = null;
        huhVar.g = null;
        grn grnVar = this.a;
        grnVar.b = null;
        grnVar.c = null;
        grnVar.d = null;
        this.i = null;
        gqz gqzVar = this.j;
        if (gqzVar != null) {
            gqzVar.r();
        }
        this.j = null;
        grg grgVar = this.d;
        grgVar.a();
        grgVar.b = null;
    }

    public final void f(List list) {
        gqw gqwVar = this.g;
        List subList = list.subList(gqwVar.k(list), list.size());
        gqz gqzVar = this.j;
        if (gqzVar == null) {
            this.p = subList;
        } else {
            this.p = null;
            gqzVar.k(subList);
        }
        boolean z = false;
        if (this.k != null && k()) {
            z = true;
        }
        gqwVar.b(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(View view) {
        if (this.o == view) {
            return;
        }
        d();
        this.o = view;
    }

    public final void h(gqh gqhVar) {
        if (!Objects.equals(this.k, gqhVar)) {
            this.k = gqhVar;
            gqw gqwVar = this.g;
            if (gqwVar == null) {
                return;
            }
            gqwVar.c(gqhVar);
            if (gqhVar != null) {
                return;
            }
            this.g.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Context context) {
        SoftKeyboardView softKeyboardView;
        Animator animator;
        List list;
        if (!this.m) {
            if (this.j == null) {
                SoftKeyboardView a = this.c.a(context);
                this.i = a;
                if (a != null) {
                    gqz gqzVar = (gqz) a.findViewById(R.id.f51640_resource_name_obfuscated_res_0x7f0b0019);
                    this.j = gqzVar;
                    this.a.d = gqzVar;
                }
            }
            gqz gqzVar2 = this.j;
            if (gqzVar2 != null && (list = this.p) != null) {
                gqzVar2.k(list);
                this.p = null;
            }
            if (!k() || (softKeyboardView = this.i) == null) {
                return;
            }
            View view = this.f;
            softKeyboardView.setLayoutDirection(view != null ? view.getLayoutDirection() : 3);
            View view2 = this.o;
            if (view2 == null) {
                return;
            }
            huh huhVar = this.c;
            grn grnVar = this.a;
            if (jam.o()) {
                if (grnVar.i == null) {
                    ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(grnVar.a, R.animator.f370_resource_name_obfuscated_res_0x7f020003);
                    valueAnimator.addUpdateListener(new op(grnVar, 17));
                    valueAnimator.addListener(new grm(grnVar));
                    grnVar.i = valueAnimator;
                }
                animator = grnVar.i;
            } else {
                animator = null;
            }
            SoftKeyboardView a2 = huhVar.a(context);
            if (a2 != null) {
                huhVar.c.e(a2, view2, 614, 0, 0, animator);
                htu htuVar = huhVar.d;
                if (htuVar != null) {
                    htuVar.e();
                }
            }
            this.m = true;
            gro groVar = (gro) this.b;
            groVar.a.c.O().d(R.string.f157240_resource_name_obfuscated_res_0x7f14048c, new Object[0]);
            groVar.a.c.be(false, ice.BODY);
            groVar.a.s(hwv.PREEMPTIVE_WITH_SUPPRESSION);
            groVar.a.e.b = SystemClock.elapsedRealtime();
            grt grtVar = groVar.a;
            if (!grtVar.c.O().m()) {
                oir oirVar = grtVar.k;
                Context d = grtVar.d();
                imn aa = grtVar.c.aa();
                View H = grtVar.c.H();
                ino L = ino.L();
                if (aa != null && H != null && !L.x(R.string.f161160_resource_name_obfuscated_res_0x7f140694, false)) {
                    L.q(R.string.f161160_resource_name_obfuscated_res_0x7f140694, true);
                    if (!oirVar.d()) {
                        if (oirVar.a == null) {
                            oirVar.a = new gsh(d, aa, new fqa(oirVar, 14, (byte[]) null));
                        }
                        gsh gshVar = (gsh) oirVar.a;
                        ExpandAccessPointsHintView expandAccessPointsHintView = gshVar.i;
                        if (expandAccessPointsHintView == null) {
                            expandAccessPointsHintView = (ExpandAccessPointsHintView) gshVar.b.a(R.layout.f134320_resource_name_obfuscated_res_0x7f0e0091);
                            gshVar.i = expandAccessPointsHintView;
                            View findViewById = expandAccessPointsHintView.findViewById(R.id.f53450_resource_name_obfuscated_res_0x7f0b011e);
                            findViewById.setOnClickListener(new fat(gshVar, 9));
                            gqw gqwVar = (gqw) expandAccessPointsHintView.findViewById(R.id.f54510_resource_name_obfuscated_res_0x7f0b01aa);
                            gqwVar.k(gshVar.a("access_point_bar", 4));
                            gqe gqeVar = gshVar.d;
                            gqeVar.j();
                            gqeVar.i("more_access_points");
                            gqeVar.f(R.drawable.f47420_resource_name_obfuscated_res_0x7f0801e1);
                            gqwVar.c(gqeVar.a());
                            gqwVar.b(true);
                            ((gqz) expandAccessPointsHintView.findViewById(R.id.f54520_resource_name_obfuscated_res_0x7f0b01ab)).k(gshVar.a("access_point_panel", 2));
                            expandAccessPointsHintView.a = new gsd(gshVar, findViewById);
                            if (gshVar.i != null) {
                                if (gshVar.p == null) {
                                    gshVar.p = new ge(gshVar, 5);
                                }
                                gshVar.i.addOnAttachStateChangeListener(gshVar.p);
                            }
                        }
                        if (gshVar.j == null) {
                            gshVar.j = new gsf(expandAccessPointsHintView.findViewById(R.id.f51630_resource_name_obfuscated_res_0x7f0b0018), (SoftKeyboardView) expandAccessPointsHintView.findViewById(R.id.f54530_resource_name_obfuscated_res_0x7f0b01ac), (gqw) expandAccessPointsHintView.findViewById(R.id.f54510_resource_name_obfuscated_res_0x7f0b01aa), (gqz) expandAccessPointsHintView.findViewById(R.id.f54520_resource_name_obfuscated_res_0x7f0b01ab));
                        }
                        gshVar.j.a.setVisibility(4);
                        gshVar.b.e(gshVar.i, H, 614, 0, 0, null);
                        ExpandAccessPointsHintView expandAccessPointsHintView2 = gshVar.i;
                        if (expandAccessPointsHintView2 == null || !(expandAccessPointsHintView2.getWidth() == 0 || gshVar.i.getHeight() == 0)) {
                            gshVar.d();
                        } else {
                            gshVar.i.addOnLayoutChangeListener(new dkr(gshVar, 7));
                        }
                        gshVar.e.l(R.string.f151770_resource_name_obfuscated_res_0x7f140237);
                    }
                }
            }
            gsi gsiVar = groVar.a.g;
            if (gsiVar != null) {
                gsiVar.b();
            }
            gqp.d(true);
        }
    }

    public final gqu[] j(boolean z) {
        gqz gqzVar;
        ArrayList arrayList = new ArrayList();
        gqw gqwVar = this.g;
        gqu gquVar = null;
        gqu x = gqwVar != null ? gqwVar.x() : null;
        if (x != null) {
            arrayList.add(x);
        }
        if (z && this.m && (gqzVar = this.j) != null) {
            gquVar = gqzVar.x();
        }
        if (gquVar != null) {
            arrayList.add(gquVar);
        }
        return (gqu[]) arrayList.toArray(new gqu[0]);
    }
}
