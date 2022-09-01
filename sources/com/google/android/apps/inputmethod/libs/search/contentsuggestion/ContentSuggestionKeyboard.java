package com.google.android.apps.inputmethod.libs.search.contentsuggestion;

import android.animation.LayoutTransition;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import j$.util.Collection$EL;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ContentSuggestionKeyboard extends LifecycleKeyboard implements dzt {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionKeyboard");
    public static final llw b = llw.n(dzo.RECENTS, mba.RECENTS, dzo.CONTEXTUAL, mba.CONTEXTUAL, dzo.CURATED, mba.CURATED);
    private final dzv G;
    private BindingRecyclerView H;
    private View I;
    private AppCompatTextView J;
    private AppCompatTextView K;
    private ViewGroup L;
    private View M;
    private ImageView N;
    private ImageView O;
    private bfc P;
    private bfc Q;
    private hix R;
    public final cuj g;
    public bfh i;
    public final dxs k;
    private final cri l;
    private final crf n;
    private final eal o;
    public final idk c = ieh.j();
    public final eqv j = new eqv();
    private final ijj p = new ckp(this, 4);
    private final ijj r = new ckp(this, 5);
    public final AtomicReference e = new AtomicReference(mdi.UNKNOWN);
    private final hiw F = new hiw(new dvd(this, 17));
    public final eae f = new eae(dzn.l, gxo.c(1));
    public dat h = dat.a;
    private final int m = ((Long) dzn.j.c()).intValue();
    private final long q = ((Long) dzn.i.c()).longValue();
    public final eaj d = new eaj();

    public ContentSuggestionKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        dxs dxsVar = new dxs((byte[]) null);
        this.k = dxsVar;
        this.n = new crf(context);
        this.l = cri.b(context, "recent_content_suggestion_shared");
        this.o = new eal(context);
        lls h = llw.h();
        gmi i = cnx.i();
        i.c = dzr.d;
        boolean i2 = cuz.a.i(context);
        int i3 = R.layout.f133860_resource_name_obfuscated_res_0x7f0e0054;
        i.n(true != i2 ? R.layout.f133860_resource_name_obfuscated_res_0x7f0e0054 : R.layout.f133870_resource_name_obfuscated_res_0x7f0e0055, new cus(this, 19));
        i.n(R.layout.f134080_resource_name_obfuscated_res_0x7f0e0079, dzr.e);
        i.n(true == cuz.a.i(context) ? R.layout.f133870_resource_name_obfuscated_res_0x7f0e0055 : i3, new cus(this, 20));
        i.n(R.layout.f134070_resource_name_obfuscated_res_0x7f0e0078, dzr.f);
        i.n(R.layout.f134090_resource_name_obfuscated_res_0x7f0e007a, cut.I(new dzk(this, 4)));
        h.a(dzq.class, i.m());
        cuj f = cnx.f(h, context, null, null);
        this.g = f;
        dzv dzvVar = new dzv(f);
        this.G = dzvVar;
        dxsVar.n(dzvVar, dzvVar);
    }

    private static long N(llp llpVar, dzo dzoVar) {
        return Collection$EL.stream(llpVar).filter(new cjx(dzoVar, 10)).count();
    }

    private final void O() {
        if (this.i != null) {
            hjq.a(this.u).l(this.i);
            this.i = null;
        }
        hix hixVar = this.R;
        if (hixVar != null) {
            hixVar.close();
            this.R = null;
        }
        this.f.a();
    }

    private static void P(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    private static void Q(AppCompatTextView appCompatTextView, String str) {
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
    }

    private static void R(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private final boolean S() {
        return !this.g.H() && ((dzq) this.g.z(dzq.class, 0)).b() == 2;
    }

    public final void A() {
        hsk b2 = hsx.b();
        if (b2 != null) {
            ins insVar = new ins(11);
            insVar.b(this.u, R.string.f162390_resource_name_obfuscated_res_0x7f140710, R.string.f160760_resource_name_obfuscated_res_0x7f14066c);
            b2.aC(insVar);
        }
    }

    public final void H(dzp dzpVar, int i) {
        EditorInfo editorInfo = this.D;
        if (editorInfo == null) {
            editorInfo = new EditorInfo();
        }
        this.k.q(dzpVar.a);
        crf crfVar = this.n;
        cqz a2 = cra.a();
        a2.b(dzpVar.a);
        a2.c(i);
        a2.a = editorInfo;
        a2.d(this.l);
        a2.f(new drf(this, 5));
        hiz a3 = crfVar.a(a2.a());
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e = llp.e();
        llk e2 = llp.e();
        llk e3 = llp.e();
        e.h(new bqx(this, dzpVar, 9));
        a3.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
    }

    @Override // defpackage.dzt
    public final void K(dat datVar) {
        this.h = datVar;
    }

    @Override // defpackage.dzt
    public final void L(eab eabVar) {
        this.j.c();
        if (this.g.ha() > 0) {
            this.g.B();
        }
        O();
        if (dau.c(this.H)) {
            this.H.Y(0);
        }
        llp llpVar = eabVar.b;
        if (llpVar.isEmpty()) {
            String str = this.h.b;
            return;
        }
        this.g.M(lre.ab(llpVar.subList(0, Math.min(llpVar.size(), this.m)), dzr.c));
        lfb lfbVar = eabVar.c;
        if (lfbVar.e()) {
            hiz hizVar = (hiz) lfbVar.a();
            this.g.I(llp.s(dzg.a(ead.a(this.u)), dzc.a));
            lfb y = hizVar.y();
            if (!y.e() || ((dzp) y.a()).a.k().isEmpty()) {
                this.f.c();
                afp afpVar = afp.STARTED;
                boolean z = jam.b;
                llk e = llp.e();
                llk e2 = llp.e();
                llk e3 = llp.e();
                e.h(new dys(this, 8));
                e2.h(new dys(this, 9));
                hix a2 = hjg.a(gyc.b, this, afpVar, z, e, e2, e3);
                this.R = a2;
                hizVar.E(a2);
            } else {
                m((dzp) y.a());
            }
        }
        l(mdi.INTERSTITIAL);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final boolean M(int i) {
        return !this.C;
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.d.close();
        this.k.p(this.G);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        P(this.I, null);
        this.I = null;
        P(this.K, null);
        this.K = null;
        this.H = null;
        this.J = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        if (icfVar.b == ice.HEADER) {
            BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f52610_resource_name_obfuscated_res_0x7f0b00b3);
            this.H = bindingRecyclerView;
            bindingRecyclerView.ab(new LinearLayoutManager(0));
            this.H.aa(this.g);
            ((ImageView) softKeyboardView.findViewById(R.id.f66840_resource_name_obfuscated_res_0x7f0b081c)).setImageResource(R.drawable.f50610_resource_name_obfuscated_res_0x7f080366);
            View findViewById = softKeyboardView.findViewById(R.id.f66850_resource_name_obfuscated_res_0x7f0b081d);
            this.I = findViewById;
            if (findViewById != null) {
                findViewById.setContentDescription(this.u.getResources().getString(R.string.f159350_resource_name_obfuscated_res_0x7f1405d0));
                this.I.setOnClickListener(new dbg(new dwx(this, 9), 0));
            }
            this.L = (ViewGroup) softKeyboardView.findViewById(R.id.f53590_resource_name_obfuscated_res_0x7f0b012e);
            this.M = softKeyboardView.findViewById(R.id.f67720_resource_name_obfuscated_res_0x7f0b0888);
            this.J = (AppCompatTextView) softKeyboardView.findViewById(R.id.f67750_resource_name_obfuscated_res_0x7f0b088b);
            this.K = (AppCompatTextView) softKeyboardView.findViewById(R.id.f67760_resource_name_obfuscated_res_0x7f0b088c);
            this.N = (ImageView) softKeyboardView.findViewById(R.id.f67740_resource_name_obfuscated_res_0x7f0b088a);
            this.O = (ImageView) softKeyboardView.findViewById(R.id.f67710_resource_name_obfuscated_res_0x7f0b0887);
            R(this.M, 0);
            R(this.H, 4);
            P(this.K, new dbg(new dwx(this, 10), 0));
            Q(this.K, this.u.getString(R.string.f162970_resource_name_obfuscated_res_0x7f140755));
            ImageView imageView = this.O;
            if (imageView != null) {
                imageView.setZ(-100.0f);
                this.Q = new bfc(this.O);
            }
            ImageView imageView2 = this.N;
            if (imageView2 == null) {
                return;
            }
            this.P = new bfc(imageView2);
            return;
        }
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionKeyboard", "onKeyboardViewCreated", 352, "ContentSuggestionKeyboard.java")).w("Unexpected keyboard of type %s created", icfVar.b);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        if (dau.c(this.H)) {
            this.H.aa(this.g);
        }
        idk idkVar = this.c;
        ctd ctdVar = ctd.EXTENSION_OPEN;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 1;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 10;
        int i = mbcVar2.a | 2;
        mbcVar2.a = i;
        String str = this.h.b;
        mbcVar2.a = i | 1024;
        mbcVar2.j = str;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        l(mdi.ZERO);
        ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        }
        ijl.b().h(this.r, cun.class, gyc.b);
        ijl.b().h(this.p, dzu.class, gyc.b);
    }

    @Override // com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        idk idkVar = this.c;
        ctd ctdVar = ctd.EXTENSION_EXIT;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 1;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 10;
        mbcVar2.a |= 2;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        ijl.b().d(this.p, dzu.class);
        ijl.b().d(this.r, cun.class);
        this.g.B();
        this.j.c();
        BindingRecyclerView bindingRecyclerView = this.H;
        if (bindingRecyclerView != null) {
            bindingRecyclerView.aa(null);
        }
        this.h = dat.a;
        this.e.set(mdi.UNKNOWN);
        if (this.P != null) {
            hjq.a(this.u).l(this.P);
        }
        if (this.Q != null) {
            hjq.a(this.u).l(this.Q);
        }
        ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(null);
        }
        O();
        super.h();
    }

    public final void l(mdi mdiVar) {
        mdj mdjVar;
        if (!this.C) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/contentsuggestion/ContentSuggestionKeyboard", "changeUiState", 591, "ContentSuggestionKeyboard.java")).t("Attempted to change UI state on inactive keyboard");
            return;
        }
        mdi mdiVar2 = (mdi) this.e.getAndSet(mdiVar);
        if (mdiVar == mdi.NO_SUGGESTIONS_ERROR) {
            this.F.c(this, this.q);
        } else {
            this.F.a();
        }
        if (mdiVar2 == mdiVar) {
            return;
        }
        R(this.M, 8);
        int ordinal = mdiVar.ordinal();
        if (ordinal == 1) {
            R(this.H, 4);
            this.g.B();
            this.j.c();
            hiz a2 = this.o.a();
            afp afpVar = afp.DESTROYED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new dys(this, 6));
            e2.h(new dys(this, 7));
            a2.E(hjg.a(gyc.b, this, afp.CREATED, z, e, e2, e3));
        } else if (ordinal == 2) {
            R(this.K, 8);
            R(this.I, 8);
            R(this.N, 0);
            R(this.H, 4);
            Q(this.J, this.u.getString(R.string.f154220_resource_name_obfuscated_res_0x7f140353));
            bfc bfcVar = this.P;
            if (bfcVar != null) {
                hjq.a(this.u).g(eaa.a).s(bfcVar);
            }
            bfc bfcVar2 = this.Q;
            if (bfcVar2 != null) {
                hjq.a(this.u).g(eaa.c).s(bfcVar2);
            }
            u();
            u();
        } else if (ordinal == 3) {
            gqa.a(this.u).h(R.string.f159040_resource_name_obfuscated_res_0x7f14059a);
            R(this.K, 8);
            R(this.I, 8);
            R(this.N, 8);
            R(this.H, 4);
            this.g.B();
            this.j.c();
            Q(this.J, this.u.getString(R.string.f159040_resource_name_obfuscated_res_0x7f14059a));
            bfc bfcVar3 = this.Q;
            if (bfcVar3 != null) {
                hjq.a(this.u).g(eaa.d).s(bfcVar3);
            }
            hjq.a(this.u).l(this.P);
            u();
        } else if (ordinal == 4) {
            boolean b2 = irv.b();
            gqa a3 = gqa.a(this.u);
            int i = R.string.f162980_resource_name_obfuscated_res_0x7f140756;
            a3.h(R.string.f162980_resource_name_obfuscated_res_0x7f140756);
            if (!b2) {
                gqa.a(this.u).h(R.string.f152930_resource_name_obfuscated_res_0x7f1402b0);
            }
            R(this.K, 0);
            R(this.I, 8);
            R(this.N, 8);
            R(this.H, 4);
            this.g.B();
            this.j.c();
            AppCompatTextView appCompatTextView = this.J;
            Context context = this.u;
            if (true != b2) {
                i = R.string.f152930_resource_name_obfuscated_res_0x7f1402b0;
            }
            Q(appCompatTextView, context.getString(i));
            hjq.a(this.u).l(this.P);
            hjq.a(this.u).l(this.Q);
            u();
        } else if (ordinal != 5) {
        } else {
            fx().e(R.string.f148160_resource_name_obfuscated_res_0x7f140060);
            hjq.a(this.u).l(this.P);
            hjq.a(this.u).l(this.Q);
            R(this.H, 0);
            boolean z2 = !this.g.H();
            dau.i(z2, "BindingAdapter unexpectedly empty");
            if (!z2) {
                return;
            }
            llp llpVar = (llp) this.g.y().map(dwn.g).filter(dzj.c).map(dwn.i).collect(ljr.a);
            long N = N(llpVar, dzo.RECENTS);
            long N2 = N(llpVar, dzo.CONTEXTUAL);
            long N3 = N(llpVar, dzo.CURATED);
            idk idkVar = this.c;
            csw cswVar = csw.RICH_CONTENT_SUGGESTION_IMPRESSION;
            Object[] objArr = new Object[5];
            EditorInfo editorInfo = this.D;
            objArr[0] = editorInfo != null ? ham.m(editorInfo) : null;
            dzq dzqVar = (dzq) this.g.z(dzq.class, 0);
            if (dzqVar.b() != 1) {
                mdjVar = mdj.QUERY;
            } else {
                dzo dzoVar = dzqVar.d().b;
                if (dzoVar == dzo.RECENTS || dzoVar == dzo.CONTEXTUAL || dzoVar == dzo.CURATED) {
                    mdjVar = mdj.ZERO_STATE;
                } else {
                    mdjVar = mdj.QUERY;
                }
            }
            objArr[1] = mdjVar;
            objArr[2] = Long.valueOf(N);
            objArr[3] = Long.valueOf(N2);
            objArr[4] = Long.valueOf(N3);
            idkVar.e(cswVar, objArr);
        }
    }

    public final void m(dzp dzpVar) {
        if (!S()) {
            return;
        }
        this.g.K(dzq.e(dzpVar));
        idk idkVar = this.c;
        csw cswVar = csw.EMOJI_KITCHEN_MIX_IMPRESSION;
        Object[] objArr = new Object[1];
        EditorInfo editorInfo = this.D;
        objArr[0] = editorInfo != null ? ham.m(editorInfo) : null;
        idkVar.e(cswVar, objArr);
    }

    public final void t() {
        R(this.K, 8);
        R(this.I, 0);
        R(this.N, 0);
        R(this.H, 4);
        Q(this.J, this.u.getString(R.string.f188240_resource_name_obfuscated_res_0x7f1411bc));
        bfc bfcVar = this.P;
        if (bfcVar != null) {
            hjq.a(this.u).h(Integer.valueOf((int) R.drawable.emoji_kitchen_zero_state)).s(bfcVar);
        }
        hjq.a(this.u).l(this.Q);
    }

    public final void u() {
        R(this.M, 0);
    }

    public final void w(Throwable th) {
        mdh mdhVar;
        if (!S()) {
            return;
        }
        Throwable c = th != null ? lgf.c(th) : null;
        this.g.K(dzg.a(ead.b(this.u, c)));
        idk idkVar = this.c;
        csw cswVar = csw.EMOJI_KITCHEN_MIX_ERROR;
        Object[] objArr = new Object[1];
        if (c instanceof NoSuchElementException) {
            mdhVar = mdh.UNSUPPORTED_COMBINATION;
        } else {
            mdhVar = mdh.UNKNOWN_ERROR;
        }
        objArr[0] = mdhVar;
        idkVar.e(cswVar, objArr);
    }
}
