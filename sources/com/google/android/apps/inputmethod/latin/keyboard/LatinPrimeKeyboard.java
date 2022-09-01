package com.google.android.apps.inputmethod.latin.keyboard;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinPrimeKeyboard extends Keyboard implements ddq {
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/latin/keyboard/LatinPrimeKeyboard");
    static final hhl d = hhq.a("enable_more_candidates_view_for_multilingual", false);
    public ddr f;
    public bpo g;
    private hoe j;
    private bpm k;
    private dej l;
    private final List b = new ArrayList(3);
    public final Map e = new qo();
    private boolean i = false;
    public opu h = new opu(this);
    private final bpd a = new bpd();

    public LatinPrimeKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        this.k = new bpm(context, iavVar, hszVar, iavVar.e, iavVar.q.c(R.id.f55060_resource_name_obfuscated_res_0x7f0b01e3, null), iavVar.q.d(R.id.f55030_resource_name_obfuscated_res_0x7f0b01e0, true));
        I(context, ibmVar, iavVar);
    }

    private final void H() {
        bpo bpoVar = this.g;
        if (bpoVar != null) {
            bpoVar.a();
            this.g = null;
        }
        htu ah = ah(ice.BODY, false);
        if (ah != null) {
            ah.i(null);
        }
    }

    private final void I(Context context, ibm ibmVar, iav iavVar) {
        ddr m = m();
        this.f = m;
        m.c(context, ibmVar, iavVar);
        hoe hoeVar = new hoe(this.v);
        this.j = hoeVar;
        hoeVar.k = context;
        hoeVar.l = ino.M(context);
        hoeVar.t = context.getResources().getDimensionPixelSize(R.dimen.f36640_resource_name_obfuscated_res_0x7f0702ed);
        hoeVar.g(hof.j);
        hoeVar.D = hoeVar.l.D("pref_key_inline_suggestion_tooltip_shown_count");
        hoeVar.T = hoeVar.l.D("pref_key_inline_suggestion_swipe_on_space_promo_tooltip_shown_count");
        hoeVar.E = hoeVar.l.D("pref_key_inline_suggestion_tooltip_v2_shown_count");
        hoeVar.F = hoeVar.l.D("pref_key_inline_suggestion_tooltip_v2_chip_shown_count");
        hoeVar.e();
        hof.q.e(hoeVar.aa);
        hof.j.e(hoeVar.ab);
        hof.s.e(hoeVar.ac);
    }

    private final boolean K() {
        iav iavVar = this.x;
        if (iavVar == null || !iavVar.q.d(R.id.f54900_resource_name_obfuscated_res_0x7f0b01d2, false)) {
            return ((Boolean) d.c()).booleanValue() && this.v.m().w();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(Object obj) {
        this.k.b(obj, X(ice.BODY));
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final boolean B(CharSequence charSequence) {
        dej dejVar = this.l;
        if (dejVar != null) {
            dejVar.d(charSequence);
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final boolean C(hln hlnVar, boolean z) {
        return this.j.v(hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    public boolean c(hfd hfdVar) {
        hqt hqtVar;
        Iterator it;
        SparseArray sparseArray;
        boolean z;
        icy icyVar;
        long j;
        iay f = hfdVar.f();
        if (f == null) {
            return false;
        }
        int i = f.c;
        if (i == 111) {
            this.v.A();
            return true;
        }
        hqt hqtVar2 = null;
        if (i == -10043) {
            long j2 = this.B;
            long j3 = iby.o & j2;
            if (j3 != 0) {
                long j4 = iby.p;
                if (j3 != j4) {
                    al(j2, j4);
                    hfd b = hfd.b();
                    b.j(new iay(-10041, null, null));
                    super.c(b);
                }
            }
            ieh.j().e(dda.SUBCATEGORY_ACTION, Long.valueOf(j3));
        }
        int i2 = f.c;
        if (i2 == -10067) {
            List list = (List) hfdVar.b[0].e;
            htu ah = ah(ice.BODY, true);
            if (ah == null) {
                return true;
            }
            if (list == null || list.isEmpty()) {
                ah.h(this.a.d);
                return true;
            }
            bpd bpdVar = this.a;
            bpdVar.c.f();
            if (bpdVar.d == null) {
                bpdVar.d = ah.a.h;
            }
            SparseArray sparseArray2 = bpdVar.d.b;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                mqr mqrVar = (mqr) it2.next();
                int i3 = mqrVar.a;
                boolean z2 = mqrVar.b;
                icy icyVar2 = (icy) sparseArray2.get(i3);
                if (icyVar2 != null) {
                    long[] jArr = icyVar2.a;
                    int length = jArr.length;
                    int i4 = 0;
                    while (i4 < length) {
                        long j5 = jArr[i4];
                        if ((j5 & 1) != (z2 ? 1L : 0L) || mqrVar.c.size() <= 0) {
                            it = it2;
                            sparseArray = sparseArray2;
                            boolean z3 = z2 ? 1 : 0;
                            Object[] objArr = z2 ? 1 : 0;
                            z = z3;
                            icyVar = icyVar2;
                            j = 0;
                        } else {
                            ict ictVar = (ict) icyVar2.b(j5);
                            j = 0;
                            if ((j5 & iby.J) <= 0 || (j5 & iby.J) == iby.p) {
                                it = it2;
                                sparseArray = sparseArray2;
                                if (ictVar != null) {
                                    nga ngaVar = mqrVar.c;
                                    ico icoVar = bpdVar.a;
                                    icoVar.v();
                                    icoVar.i(ictVar);
                                    icoVar.g();
                                    icoVar.h();
                                    if (((String) ngaVar.get(0)).length() > 0) {
                                        z = z2;
                                        bpdVar.a.f(ictVar.o[0], (CharSequence) ngaVar.get(0));
                                        iaj iajVar = bpdVar.b;
                                        iajVar.k();
                                        iajVar.h(ictVar.m[0]);
                                        icyVar = icyVar2;
                                        bpdVar.b.d = new String[]{(String) ngaVar.get(0)};
                                        ial b2 = bpdVar.b.b();
                                        if (b2 != null) {
                                            bpdVar.a.u(b2);
                                        }
                                    } else {
                                        z = z2;
                                        icyVar = icyVar2;
                                        bpdVar.a.f(ictVar.o[0], ictVar.n[0]);
                                        bpdVar.a.u(ictVar.m[0]);
                                    }
                                    if (ictVar.m.length > 1 && ngaVar.size() - 1 == ictVar.m[1].d.length) {
                                        String[] strArr = new String[ngaVar.size() - 1];
                                        for (int i5 = 1; i5 < ngaVar.size(); i5++) {
                                            if (((String) ngaVar.get(i5)).length() > 0) {
                                                strArr[i5 - 1] = (String) ngaVar.get(i5);
                                            } else {
                                                int i6 = i5 - 1;
                                                strArr[i6] = ictVar.m[1].e(i6);
                                            }
                                        }
                                        iaj iajVar2 = bpdVar.b;
                                        iajVar2.k();
                                        iajVar2.h(ictVar.m[1]);
                                        iaj iajVar3 = bpdVar.b;
                                        iajVar3.d = strArr;
                                        ial b3 = iajVar3.b();
                                        if (b3 != null) {
                                            bpdVar.a.u(b3);
                                        }
                                    }
                                    ict c2 = bpdVar.a.c();
                                    Long.toBinaryString(j5);
                                    boolean z4 = mqrVar.b;
                                    CharSequence charSequence = c2.n[0];
                                    String str = c2.m[0].m[0];
                                    bpdVar.c.e(i3, c2, j5);
                                }
                            } else {
                                it = it2;
                                sparseArray = sparseArray2;
                                bpdVar.c.e(i3, ictVar, j5);
                            }
                            z = z2;
                            icyVar = icyVar2;
                        }
                        i4++;
                        it2 = it;
                        sparseArray2 = sparseArray;
                        z2 = z;
                        icyVar2 = icyVar;
                    }
                }
            }
            ah.h(bpdVar.c.a());
            return true;
        }
        if (i2 == -10065) {
            Object obj = hfdVar.b[0].e;
            if (!(obj instanceof List)) {
                ((ltd) c.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinPrimeKeyboard", "updateCurrentImeLocales", 418, "LatinPrimeKeyboard.java")).t("consumeEvent: UPDATE_CURRENT_IME_LOCALES, Illegal argument");
            } else {
                List list2 = (List) obj;
                if (list2 == null || list2.isEmpty()) {
                    ((ltd) ((ltd) c.c()).k("com/google/android/apps/inputmethod/latin/keyboard/LatinPrimeKeyboard", "updateCurrentImeLocales", 423, "LatinPrimeKeyboard.java")).t("consumeEvent: UPDATE_CURRENT_IME_LOCALES, Illegal argument");
                } else if (!list2.equals(this.b)) {
                    H();
                    this.b.clear();
                    this.b.addAll(list2);
                    int size = list2.size();
                    if (size != 1) {
                        hqt m = this.v.m();
                        if (m == null || !m.h().equals(jav.d((Locale) list2.get(0)))) {
                            ((ltd) c.a(hip.a).k("com/google/android/apps/inputmethod/latin/keyboard/LatinPrimeKeyboard", "updateCurrentImeLocales", 442, "LatinPrimeKeyboard.java")).t("consumeEvent: UPDATE_CURRENT_IME_LOCALES, Illegal argument");
                        } else {
                            String p = m.p();
                            this.g = new bpo(size - 1, this);
                            List v = this.v.v();
                            this.e.clear();
                            int i7 = 1;
                            while (i7 < size) {
                                jav d2 = jav.d((Locale) list2.get(i7));
                                Iterator it3 = v.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        hqtVar = hqtVar2;
                                        break;
                                    }
                                    hqt hqtVar3 = (hqt) it3.next();
                                    if (hqtVar3.h().equals(d2)) {
                                        hqtVar = hqtVar3;
                                        break;
                                    }
                                }
                                if (hqtVar != null) {
                                    mko m2 = hqtVar.m(p);
                                    this.e.put(hqtVar.i(), m2);
                                    kcu.U(m2, new bpn(this, m2, hqtVar, p, 0), gyc.a);
                                }
                                i7++;
                                hqtVar2 = null;
                            }
                        }
                    }
                }
            }
        }
        int i8 = f.c;
        if (i8 != -110000) {
            if (i8 == -10127 && ice.HEADER.equals(f.e) && ((Boolean) dcu.k.c()).booleanValue() && ham.ap(this.u, this.D)) {
                this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY);
                return true;
            }
        } else {
            Object obj2 = f.e;
            if (obj2 instanceof hln) {
                Object obj3 = ((hln) obj2).k;
                if (!(obj3 instanceof String)) {
                    return true;
                }
                String str2 = (String) obj3;
                String f2 = gwc.f(this.u, str2);
                Drawable d3 = gwc.d(this.u, str2);
                View inflate = ((LayoutInflater) this.u.getSystemService("layout_inflater")).inflate(R.layout.f133550_resource_name_obfuscated_res_0x7f0e002c, (ViewGroup) null);
                ((AppCompatTextView) inflate.findViewById(R.id.f65200_resource_name_obfuscated_res_0x7f0b0745)).setText(this.u.getString(R.string.f148190_resource_name_obfuscated_res_0x7f140063, f2));
                ((ImageView) inflate.findViewById(R.id.f56210_resource_name_obfuscated_res_0x7f0b0265)).setImageDrawable(d3);
                AlertDialog.Builder builder = new AlertDialog.Builder(this.u);
                builder.setView(inflate);
                AlertDialog create = builder.create();
                inflate.setOnClickListener(new hk(create, 6));
                create.setCanceledOnTouchOutside(true);
                hsk hskVar = new hso().a;
                jco.b(create, hskVar == null ? null : hskVar.F());
                return true;
            }
        }
        return super.c(hfdVar) || this.f.k(hfdVar) || this.k.c(hfdVar) || this.j.c(hfdVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.e.clear();
        H();
        this.f.close();
        this.j.k();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fA(icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            dej dejVar = this.l;
            if (dejVar != null) {
                dejVar.a();
                this.l = null;
            }
        } else if (icfVar.b == ice.BODY) {
            v();
        }
        this.f.h(icfVar);
        hoe hoeVar = this.j;
        ice iceVar = icfVar.b;
        if (iceVar != ice.FLOATING_CANDIDATES) {
            if (iceVar != ice.BODY) {
                return;
            }
            hoeVar.A = false;
            hoeVar.d(false);
            hoeVar.P = null;
            return;
        }
        hoeVar.n(null);
        View view = hoeVar.s;
        if (view != null) {
            view.removeOnLayoutChangeListener(hoeVar.e);
        }
        hoeVar.s = null;
        hoeVar.u = null;
        hoeVar.v = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean fB(ice iceVar) {
        if (iceVar == ice.HEADER) {
            return ham.au(this.D, this.t, this.x.v);
        }
        if (iceVar != ice.FLOATING_CANDIDATES) {
            return am(iceVar);
        }
        return this.j.w(iceVar);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final String fr() {
        String ai = ai();
        if (!TextUtils.isEmpty(ai)) {
            if (super.fx().n()) {
                return this.u.getString(R.string.f155050_resource_name_obfuscated_res_0x7f1403ad, ai);
            }
            return this.u.getString(R.string.f155060_resource_name_obfuscated_res_0x7f1403ae, ai);
        }
        return this.u.getString(R.string.f176170_resource_name_obfuscated_res_0x7f140cb8);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void fw(ice iceVar, View view) {
        hoe hoeVar = this.j;
        if (iceVar == ice.BODY) {
            hoeVar.g.postDelayed(hoeVar.f, ((Long) hof.a.c()).longValue());
        } else if (iceVar != ice.FLOATING_CANDIDATES) {
        } else {
            hoeVar.i();
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard
    public final gqc fx() {
        return super.fx();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            if (!this.x.h && this.l == null) {
                dej dejVar = new dej(this.u, this.v.s());
                this.l = dejVar;
                dejVar.c(softKeyboardView);
            }
        } else if (icfVar.b == ice.BODY) {
            u(softKeyboardView);
        }
        this.f.g(softKeyboardView, icfVar);
        hoe hoeVar = this.j;
        ice iceVar = icfVar.b;
        if (iceVar == ice.FLOATING_CANDIDATES) {
            hoeVar.O = softKeyboardView;
            hoeVar.f();
        } else if (iceVar != ice.BODY) {
        } else {
            hoeVar.N = softKeyboardView;
            hoeVar.P = softKeyboardView.findViewById(R.id.key_pos_space);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(android.view.inputmethod.EditorInfo r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.latin.keyboard.LatinPrimeKeyboard.g(android.view.inputmethod.EditorInfo, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final hth gj(ice iceVar) {
        if (iceVar != ice.HEADER || !fB(iceVar)) {
            return super.gj(iceVar);
        }
        return hth.SHOW_OPTIONAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public void gl(long j, long j2) {
        super.gl(j, j2);
        this.f.f(j, j2);
        int l = l(j, j2);
        int i = 0;
        if (((j ^ j2) & iby.J) != 0) {
            long j3 = iby.J & j2;
            if (j3 == iby.p) {
                i = R.string.f159270_resource_name_obfuscated_res_0x7f1405b7;
            } else if (j3 == iby.q) {
                i = R.string.f159280_resource_name_obfuscated_res_0x7f1405b8;
            } else if (j3 == iby.r) {
                i = R.string.f159290_resource_name_obfuscated_res_0x7f1405b9;
            } else if (j3 == iby.s) {
                i = R.string.f159300_resource_name_obfuscated_res_0x7f1405ba;
            }
        }
        if (l != 0) {
            super.fx().e(l);
        } else if (i == 0) {
        } else {
            super.fx().e(i);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        dej dejVar = this.l;
        if (dejVar != null) {
            dejVar.a();
        }
        this.f.e();
        this.j.k();
        this.k.d();
        super.h();
    }

    protected int l(long j, long j2) {
        return icu.c(j, j2);
    }

    protected ddr m() {
        boolean K = K();
        this.i = K;
        if (K) {
            return new bpg(this);
        }
        return new bpf(this);
    }

    @Override // defpackage.ddq
    public final hww o() {
        hsz hszVar = this.v;
        return hszVar != null ? hszVar.o() : hww.a;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    protected final String p() {
        String ai = ai();
        if (!TextUtils.isEmpty(ai)) {
            return this.u.getString(R.string.f155070_resource_name_obfuscated_res_0x7f1403af, ai);
        }
        return this.u.getString(R.string.f176180_resource_name_obfuscated_res_0x7f140cb9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String q() {
        String ai = ai();
        if (!TextUtils.isEmpty(ai)) {
            return this.u.getString(R.string.f166350_resource_name_obfuscated_res_0x7f1408d1, ai);
        }
        return this.u.getString(R.string.f166390_resource_name_obfuscated_res_0x7f1408d5);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void r(List list, hln hlnVar, boolean z) {
        this.v.P(this.s, ice.HEADER, hth.SHOW_MANDATORY_WITH_ANIMATION);
        this.f.b(list, hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hsy
    public final void s(CursorAnchorInfo cursorAnchorInfo, int[] iArr) {
        hoe hoeVar = this.j;
        Rect m = hjg.m(cursorAnchorInfo, 3);
        iArr[0] = 0;
        iArr[1] = m.bottom - hoeVar.t;
    }

    @Override // defpackage.ddq
    public final void t(hfd hfdVar) {
        this.v.z(hfdVar);
    }

    protected void u(SoftKeyboardView softKeyboardView) {
    }

    protected void v() {
    }

    @Override // defpackage.ddq
    public final void w(int i) {
        this.v.J(i);
    }

    @Override // defpackage.ddq
    public final void x(hln hlnVar, boolean z) {
        this.v.K(hlnVar, z);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void y(List list) {
        if (K()) {
            ddr ddrVar = this.f;
            if (!(ddrVar instanceof bpg)) {
                return;
            }
            ((bpg) ddrVar).a(list);
        }
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void z(boolean z) {
        hoe hoeVar = this.j;
        if (z) {
            hoeVar.a(false);
        } else {
            hoeVar.j();
        }
        this.f.j(z);
    }
}
