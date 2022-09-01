package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Printer;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: grt  reason: default package */
/* loaded from: classes.dex */
public final class grt implements hfx, hfh, hws {
    public final hso c;
    public final gsa d;
    public final grh f;
    public gsi g;
    public boolean j;
    private ifu m;
    private final grz n;
    private final Context o;
    private Context p;
    private boolean s;
    private boolean t;
    private hwu u;
    private hwu v;
    private static final int[] l = {-40000, -40001, -40002, -40003, -40004, -40005, -40006, -40007, -40008, -40009};
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager");
    public final Set b = new qq();
    private final cir w = new cir(this, 5);
    private final cir x = new cir(this, 6);
    private final hti q = new grp(this);
    public final SparseArray h = new SparseArray();
    public final qv i = new qv();
    private final List r = new ArrayList();
    public final gsk e = new gsk(ieh.j());
    public final oir k = new oir();
    private final odv y = new odv();

    public grt(Context context) {
        gro groVar = new gro(this);
        this.n = groVar;
        this.o = context;
        hso hsoVar = new hso();
        this.c = hsoVar;
        this.d = new gsa(context, hsoVar.aa(), hsoVar.O(), groVar);
        this.f = new grh(context, ino.M(context));
    }

    private final void A(boolean z, hwv hwvVar, boolean z2) {
        SoftKeyView softKeyView;
        if (this.s) {
            gsa gsaVar = this.d;
            List y = y();
            boolean z3 = gsaVar.l;
            gsaVar.a();
            gqw gqwVar = gsaVar.g;
            if (gqwVar == null || (softKeyView = gsaVar.h) == null) {
                return;
            }
            grn grnVar = gsaVar.a;
            grnVar.b = softKeyView;
            grnVar.c = gqwVar;
            gsaVar.f(y);
            boolean w = ((gro) gsaVar.b).a.w(z, hwvVar);
            gsaVar.l = w;
            if (!z3 && w) {
                grz grzVar = gsaVar.b;
                gqp.c(true, z2);
            }
            if (!gsaVar.l) {
                return;
            }
            hwv hwvVar2 = hwv.DEFAULT;
        }
    }

    private final void B() {
        gsi gruVar;
        gsi gsiVar = this.g;
        if (gsiVar != null) {
            gsiVar.c(false);
        }
        if (this.t) {
            gruVar = new grw(d());
        } else {
            gruVar = new gru(d());
        }
        this.g = gruVar;
        C(this.s);
    }

    private final void C(boolean z) {
        gsi gsiVar = this.g;
        if (gsiVar == null) {
            return;
        }
        gsiVar.c(z);
        if (!z) {
            return;
        }
        if (this.d.m) {
            this.g.a();
        } else {
            this.g.a();
        }
    }

    private final boolean D(Object obj) {
        if (obj instanceof iay) {
            this.c.at(hfd.d((iay) obj));
            return true;
        } else if (obj instanceof Runnable) {
            ((Runnable) obj).run();
            return true;
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "doAction", 676, "AccessPointsManager.java")).t("The access point action is invalid");
            return false;
        }
    }

    public static boolean v(gqh gqhVar) {
        return gqhVar.c("moreAccessPointsDef") == Boolean.TRUE;
    }

    private final List y() {
        gqh gqhVar;
        if (this.m == null) {
            grs grsVar = new grs(this);
            this.m = grsVar;
            grsVar.a(gyc.b);
        }
        this.r.clear();
        ArrayList arrayList = new ArrayList();
        llp c = this.f.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c.get(i);
            if (u(str) && (gqhVar = (gqh) this.i.get(str)) != null) {
                arrayList.add(gqhVar);
                this.r.add(gqhVar.a);
            }
        }
        return arrayList;
    }

    private final void z(iay iayVar, boolean z) {
        if (this.k.d() || !this.d.l) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "handleAccessPointClickEvent", 625, "AccessPointsManager.java")).t("Can't handle click event: The expand hint is showing or access points are not showing");
            return;
        }
        gqh gqhVar = (gqh) iayVar.e;
        if (gqhVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "handleAccessPointClickEvent", 631, "AccessPointsManager.java")).t("The access point def is unspecified.");
            return;
        }
        ial b = gqhVar.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "handleAccessPointClickEvent", 636, "AccessPointsManager.java")).t("Failed to perform access point action.");
            return;
        }
        this.c.at(hfd.d(b.d()));
        if (gqhVar.c("closeAction") != Boolean.TRUE) {
            this.e.a(gqhVar.a, z, this.j);
        }
        if (v(gqhVar)) {
            return;
        }
        gsa gsaVar = this.d;
        if (!gsaVar.l || this.j) {
            gsaVar.d();
        } else {
            g(true, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.hfd r7) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grt.c(hfd):boolean");
    }

    public final Context d() {
        Context context = this.p;
        return context != null ? context : this.o;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("AccessPoints:");
        StringBuilder sb = new StringBuilder();
        int i = this.i.d;
        int i2 = 0;
        while (i2 < i) {
            sb.append(i2 == 0 ? "" : ", ");
            sb.append((String) this.i.c(i2));
            i2++;
        }
        String obj = sb.toString();
        printer.println("[" + obj + "]");
        printer.println("AccessPointsOrder = ".concat(String.valueOf(String.valueOf(this.f.c()))));
        printer.println("LastShownAccessPoints = ".concat(String.valueOf(String.valueOf(this.r))));
        int size = this.h.size();
        for (int i3 = 0; i3 < size; i3++) {
            gqv gqvVar = (gqv) this.h.get(i3);
            if (gqvVar != null) {
                printer.println("AccessPointsForHolder ".concat(jbi.i(this.h.keyAt(i3))));
                gqvVar.dump(printer, z);
            }
        }
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    public final void f(int i, gqh gqhVar, boolean z) {
        if (i == 0) {
            gqh gqhVar2 = (gqh) this.i.put(gqhVar.a, gqhVar);
            if (gqhVar.equals(gqhVar2)) {
                gqhVar.g();
                return;
            }
            if (v(gqhVar)) {
                this.d.h(gqhVar);
                if (gqhVar2 == null) {
                    t();
                }
            } else {
                grh grhVar = this.f;
                String str = gqhVar.a;
                if (!grhVar.e.contains(str)) {
                    if (!grhVar.d.contains(str)) {
                        ((ltd) ((ltd) grh.a.d()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointOrderHelper", "onAccessPointAdded", 283, "AccessPointOrderHelper.java")).w("Invalid access point %s is added", str);
                    } else {
                        int size = grhVar.e.size();
                        while (size > grhVar.f) {
                            int i2 = size - 1;
                            if (str.compareTo((String) grhVar.e.get(i2)) >= 0) {
                                break;
                            }
                            size = i2;
                        }
                        grhVar.e.add(size, str);
                    }
                }
                t();
            }
            gqhVar.g();
            return;
        }
        gqv gqvVar = (gqv) this.h.get(i);
        if (gqvVar != null) {
            gqvVar.a(gqhVar, z);
            return;
        }
        gqhVar.f();
        ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/accesspoint/impl/AccessPointsManager", "addAccessPoint", 713, "AccessPointsManager.java")).w("Invalid holderId %s", jbi.i(i));
    }

    public final void g(boolean z, boolean z2) {
        gsa gsaVar = this.d;
        if (gsaVar.l) {
            gsaVar.b(z, z2);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "AccessPointsManager";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.h.put(R.id.key_pos_header_access_points_menu, new gri(context));
        this.h.put(R.id.key_pos_header_power_key, new gri(context));
        this.h.put(R.id.key_pos_header_extra_key, new gri(context));
        ijl.b().h(this.w, gqq.class, gyc.a);
        ijl.b().h(this.x, grd.class, gyc.a);
        this.q.a(mjl.a);
        hww V = this.c.V();
        V.b(ice.HEADER, R.id.f51620_resource_name_obfuscated_res_0x7f0b0017, this);
        this.u = new grq(this);
        V.a(ice.HEADER, this.u);
        this.v = new grr(this);
        V.a(ice.BODY, this.v);
        gzt.a.a(this);
        ijf.j(gqm.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
        grh grhVar = this.f;
        grhVar.j();
        ino.L().af(grhVar, "is_foldable_device");
        ija ijaVar = grhVar.g;
        if (ijaVar != null) {
            ijaVar.f();
            grhVar.g = null;
        }
        hww V = this.c.V();
        V.d(ice.HEADER, R.id.f51620_resource_name_obfuscated_res_0x7f0b0017);
        hwu hwuVar = this.u;
        if (hwuVar != null) {
            V.l(ice.HEADER, hwuVar);
            this.u = null;
        }
        hwu hwuVar2 = this.v;
        if (hwuVar2 != null) {
            V.l(ice.BODY, hwuVar2);
            this.v = null;
        }
        ifu ifuVar = this.m;
        if (ifuVar != null) {
            ifuVar.d();
        }
        this.b.clear();
        ijl.b().d(this.w, gqq.class);
        ijl.b().d(this.x, grd.class);
        this.q.d();
        odv odvVar = this.y;
        ((gqk) odvVar.a).a(2);
        odvVar.d();
        this.c.close();
        ijf.k(gqm.a);
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void h(ibz ibzVar) {
    }

    @Override // defpackage.hws
    public final void hL() {
        this.j = false;
        gsa gsaVar = this.d;
        if (gsaVar.l) {
            gsaVar.l = false;
            grz grzVar = gsaVar.b;
            gqp.b(false);
        }
        if (gsaVar.m) {
            gsaVar.d();
        }
    }

    @Override // defpackage.hws
    public final void hM() {
        long longValue = ((Long) gqj.c.c()).longValue();
        if (longValue > 0) {
            kki.i(new fqa(this, 10), longValue);
        } else {
            r();
        }
    }

    @Override // defpackage.hfx
    public final void i() {
        this.k.c();
        x();
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void j(EditorInfo editorInfo, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void k(hfy hfyVar) {
    }

    public final void l(View view) {
        hsk hskVar;
        gsa gsaVar = this.d;
        gsaVar.a();
        if (view != gsaVar.f) {
            gqw gqwVar = gsaVar.g;
            if (gqwVar != null) {
                gqwVar.r();
            }
            gsaVar.f = view;
            gsaVar.l = false;
            gsaVar.g = view != null ? (gqw) view.findViewById(R.id.f51620_resource_name_obfuscated_res_0x7f0b0017) : null;
            gqw gqwVar2 = gsaVar.g;
            if (gqwVar2 != null) {
                gqwVar2.a(gsaVar.n);
                gsaVar.g.c(gsaVar.k);
            }
            gsaVar.h = view != null ? (SoftKeyView) view.findViewById(R.id.key_pos_header_access_points_menu) : null;
        }
        boolean z = this.s;
        gsa gsaVar2 = this.d;
        boolean z2 = true;
        boolean z3 = (gsaVar2.g == null || gsaVar2.h == null || (hskVar = this.c.a) == null || !hskVar.bv() || !irz.b.a()) ? false : true;
        this.s = z3;
        if (z != z3) {
            odv odvVar = this.y;
            if (this.t || !z3) {
                z2 = false;
            }
            odvVar.c(z2);
            C(this.s);
        }
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            ((gqv) this.h.valueAt(i)).c(view != null ? view.findViewById(this.h.keyAt(i)) : null);
        }
        if (this.s) {
            r();
        } else {
            x();
        }
    }

    @Override // defpackage.hws
    public final Animator m() {
        grn grnVar = this.d.a;
        View view = null;
        if (!jam.o()) {
            return null;
        }
        if (grnVar.g == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            if (grnVar.f == null) {
                grnVar.f = AnimatorInflater.loadAnimator(grnVar.a, R.animator.f400_resource_name_obfuscated_res_0x7f020007);
                grnVar.f.addListener(new grk(grnVar));
            }
            animatorArr[0] = grnVar.f;
            if (grnVar.e == null) {
                grnVar.e = (ValueAnimator) AnimatorInflater.loadAnimator(grnVar.a, R.animator.f390_resource_name_obfuscated_res_0x7f020006);
                grnVar.e.setInterpolator(new afj());
                grnVar.e.addListener(new grj(grnVar));
                grnVar.e.addUpdateListener(new op(grnVar, 16));
            }
            animatorArr[1] = grnVar.e;
            animatorSet.playTogether(animatorArr);
            grnVar.g = animatorSet;
        }
        if (grnVar.f != null) {
            ViewGroup viewGroup = grnVar.b;
            if (viewGroup != null) {
                view = viewGroup.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265);
            }
            if (view != null) {
                grnVar.f.setTarget(view);
            }
        }
        return grnVar.g;
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        boolean z2 = this.t;
        boolean booleanValue = ((Boolean) gqj.e.c()).booleanValue();
        this.t = booleanValue;
        gsa gsaVar = this.d;
        if (gsaVar.n != booleanValue) {
            gsaVar.n = booleanValue;
            gqw gqwVar = gsaVar.g;
            if (gqwVar != null) {
                gqwVar.a(booleanValue);
            }
            if (gsaVar.m) {
                gsaVar.d();
            }
            gsaVar.c.b(booleanValue ? R.id.f67240_resource_name_obfuscated_res_0x7f0b0848 : R.id.f67230_resource_name_obfuscated_res_0x7f0b0847);
            gsaVar.d.a = true != booleanValue ? R.layout.f144020_resource_name_obfuscated_res_0x7f0e04b2 : R.layout.f144030_resource_name_obfuscated_res_0x7f0e04b3;
        }
        if (this.t) {
            this.y.c(false);
            if (this.t != z2 || this.g == null) {
                B();
            }
        } else {
            if (z2 || this.g == null) {
                B();
            }
            this.y.c(this.s);
        }
        Context a2 = hqtVar.a();
        if (this.p != a2) {
            this.p = a2;
            this.d.e();
            for (int i = 0; i < this.h.size(); i++) {
                ((gqv) this.h.valueAt(i)).d(a2);
            }
        }
        if (this.s && this.j && !this.d.l) {
            r();
        }
        return true;
    }

    @Override // defpackage.hfx
    public final boolean o() {
        return true;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void q() {
    }

    public final void r() {
        this.j = true;
        if (this.s && !this.d.l) {
            this.e.b(true);
            A(false, hwv.DEFAULT, false);
        }
    }

    public final void s(hwv hwvVar) {
        if (!this.d.l || !this.s || !w(false, hwvVar)) {
            return;
        }
        hwv hwvVar2 = hwv.DEFAULT;
    }

    public final void t() {
        gsa gsaVar = this.d;
        if (gsaVar.l) {
            List y = y();
            if (gsaVar.g == null || gsaVar.h == null) {
                return;
            }
            gsaVar.f(y);
        }
    }

    public final boolean u(String str) {
        gqh gqhVar = (gqh) this.i.get(str);
        if (gqhVar != null) {
            return !gqhVar.e || irs.d();
        }
        return false;
    }

    public final boolean w(boolean z, hwv hwvVar) {
        return this.c.V().i(ice.HEADER, R.id.f51620_resource_name_obfuscated_res_0x7f0b0017, z, hwvVar, true);
    }

    public final void x() {
        gsa gsaVar = this.d;
        gsaVar.a();
        if (gsaVar.l) {
            gsaVar.b(false, false);
        } else {
            gsaVar.d();
        }
    }
}
