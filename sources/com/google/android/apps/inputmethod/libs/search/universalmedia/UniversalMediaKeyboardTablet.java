package com.google.android.apps.inputmethod.libs.search.universalmedia;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.emojisearch.EmojiSearchJniImpl;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.widget.FixedSizeEmojiListHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.EnumSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniversalMediaKeyboardTablet extends AbstractSearchResultKeyboard implements heo, hep, gzv {
    private final cpu G;
    private final cri H;
    private final cri I;
    private final cri J;
    private final coc K;
    private ViewGroup L;
    private View M;
    private View N;
    private View O;
    private View P;
    private View Q;
    private FixedSizeEmojiListHolder R;
    private hen S;
    private int T;
    private long W;
    private cwx X;
    private ejr Y;
    private ejs Z;
    private mko aa;
    private final cma ab;
    private ejp ac;
    private long ad;
    private elc ai;
    private kcq aj;
    public final int b;
    public final crf d;
    public final idk e;
    public VerticalScrollAnimatedImageSidebarHolderView f;
    public ekx g;
    public long k;
    public long l;
    public BindingRecyclerView m;
    public int n;
    public elc q;
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet");
    private static final String[] F = gvw.g;
    public final EnumSet c = EnumSet.noneOf(ekg.class);
    public final dxs r = new dxs((byte[]) null);
    public hfl h = hfl.INTERNAL;
    public boolean i = false;
    private boolean U = false;
    private boolean V = false;
    public boolean j = false;
    private final eku ae = new eke(this, 0);
    private final ekq af = new ekb(this, 0);
    private final edq ag = new edq();
    private final edo ah = new ekf(this, 0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalMediaKeyboardTablet(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cpu cpuVar = cqh.a().b;
        cma i = ffb.i(context, gxo.a(9));
        this.G = cpuVar;
        this.ab = i;
        this.d = new crf(context);
        this.e = hszVar.hO();
        this.b = ((Long) ejz.a(context).c()).intValue();
        Context applicationContext = context.getApplicationContext();
        this.H = cri.b(applicationContext, "recent_content_suggestion_shared");
        this.J = cri.b(applicationContext, "recent_bitmoji_shared");
        this.I = cri.b(applicationContext, "recent_sticker_shared");
        this.K = coc.a(context);
    }

    public static final String V() {
        return jav.d(hqp.e()).n;
    }

    public static int W(String str) {
        return TextUtils.isEmpty(str) ? 2 : 3;
    }

    private static void ao(BindingRecyclerView bindingRecyclerView) {
        bindingRecyclerView.aa(null);
        bindingRecyclerView.ab(null);
    }

    private final void ap() {
        hen henVar = this.S;
        if (henVar != null) {
            henVar.close();
            this.S = null;
        }
    }

    private final void aq() {
        this.i = false;
        this.U = false;
        this.j = false;
    }

    private static void ar(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // defpackage.heo
    public final void A() {
    }

    public final void K(String[] strArr) {
        ctg ctgVar;
        ltg ltgVar = a;
        int length = strArr.length;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "dispatchEmojiResults", 754, "UniversalMediaKeyboardTablet.java")).u("Emoji fetcher returned %d results", length);
        if (TextUtils.isEmpty(U())) {
            ctgVar = ctg.UNIVERSAL_MEDIA_RECENT_EMOJI_FETCHER_TIME;
        } else {
            ctgVar = ctg.UNIVERSAL_MEDIA_SEARCH_EMOJI_FETCHER_TIME;
        }
        Q(ctgVar, this.ad);
        if (strArr == null || length <= 0) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleUpdateEmojis", 1059, "UniversalMediaKeyboardTablet.java")).t("handleUpdateEmojis(): Received no emojis");
            S(ekg.EMOJI_ERROR);
        } else {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "handleUpdateEmojis", 1055, "UniversalMediaKeyboardTablet.java")).u("handleUpdateEmojis(): Received %d emojis", length);
            this.V = true;
            hen henVar = this.S;
            if (henVar != null) {
                henVar.c(strArr);
            }
        }
        this.U = true;
        T();
    }

    public final void L() {
        llk e = llp.e();
        if (TextUtils.isEmpty(U())) {
            e.h(eju.b(""));
        } else {
            e.h(eju.b(U()));
        }
        e.h(ejl.a);
        hiz b = this.K.b();
        int i = -1;
        if (this.n == -1) {
            if (true == TextUtils.isEmpty(U())) {
                i = 1;
            }
            this.n = i;
        }
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        e2.h(new eii(this, e, 3));
        e3.h(ebj.c);
        b.E(hjg.a(gyc.b, this, afpVar, z, e2, e3, e4));
    }

    public final void N() {
        P(U());
    }

    @Override // defpackage.hep
    public final void O(int i) {
        if (!this.V) {
            return;
        }
        this.V = false;
        if (i <= 0) {
            S(ekg.EMOJI_ERROR);
        } else {
            S(ekg.EMOJI_DATA);
        }
    }

    public final void P(String str) {
        hja b;
        S(ekg.LOADING);
        hen henVar = this.S;
        if (henVar != null) {
            henVar.c(F);
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            verticalScrollAnimatedImageSidebarHolderView.aF();
        }
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            ekxVar.aF();
        }
        aq();
        this.k = SystemClock.elapsedRealtime();
        gyc gycVar = gyc.b;
        if (TextUtils.isEmpty(str)) {
            mko k = t().k(2);
            if (this.Y == null) {
                this.Y = new ejr(this.u, new ekd(this, 0), this.H, this.J, this.I);
            }
            kcu.U(k, this.Y, gycVar);
            this.aa = k;
        } else {
            hiz b2 = hjg.b(t().e(str));
            if (this.Z == null) {
                this.Z = new ejs(new ekd(this, 0));
            }
            kcu.U(b2, this.Z, gycVar);
            this.aa = b2;
        }
        this.i = true;
        if (TextUtils.isEmpty(str)) {
            b = ejq.a(this.u, this.ab);
        } else {
            cma cmaVar = this.ab;
            hfg a2 = cmc.a();
            a2.f(str);
            a2.a = 5;
            b = cmaVar.b(a2.d());
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView2 = this.f;
        ViewGroup viewGroup = this.L;
        if (verticalScrollAnimatedImageSidebarHolderView2 != null && viewGroup != null) {
            verticalScrollAnimatedImageSidebarHolderView2.aF();
            this.ag.d(verticalScrollAnimatedImageSidebarHolderView2, viewGroup, b, this.ah);
        }
        this.ad = SystemClock.elapsedRealtime();
        if (!htg.a(this)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "fetchEmoji", 678, "UniversalMediaKeyboardTablet.java")).t("fetchEmoji(): Emoji are not available");
            K(F);
        } else if (!TextUtils.isEmpty(str)) {
            Locale e = hqp.e();
            if (e == null || !cly.a(this.u).c(e)) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardTablet", "fetchEmoji", 683, "UniversalMediaKeyboardTablet.java")).t("fetchEmoji(): Emoji search data is not ready");
                K(F);
                return;
            }
            if (this.aj == null) {
                this.aj = new kcq(this.u, (cne) new EmojiSearchJniImpl(), (ejo) new ekc(this, 0));
            }
            this.aj.C(str);
        } else {
            if (this.ac == null) {
                this.ac = new ejp(this.G, new ekc(this, 0));
            }
            this.ac.a();
        }
    }

    public final void Q(ids idsVar, long j) {
        this.e.g(idsVar, SystemClock.elapsedRealtime() - j);
    }

    public final void R() {
        ctg ctgVar;
        if (TextUtils.isEmpty(U())) {
            ctgVar = ctg.UNIVERSAL_MEDIA_RECENT_GIF_FETCHER_TIME;
        } else {
            ctgVar = ctg.UNIVERSAL_MEDIA_SEARCH_GIF_FETCHER_TIME;
        }
        Q(ctgVar, this.l);
    }

    public final void S(ekg ekgVar) {
        this.c.add(ekgVar);
        edp edpVar = edp.NO_NETWORK;
        ekg ekgVar2 = ekg.LOADING;
        switch (ekgVar.ordinal()) {
            case 0:
                ar(this.M, 0);
                ar(this.L, 8);
                ar(this.f, 8);
                ar(this.N, 0);
                ar(this.O, 0);
                this.c.clear();
                this.c.add(ekg.LOADING);
                this.W = SystemClock.elapsedRealtime();
                return;
            case 1:
                ar(this.Q, 8);
                this.c.remove(ekg.EMOJI_DATA);
                return;
            case 2:
                ar(this.M, 0);
                ar(this.L, 8);
                ar(this.f, 0);
                ar(this.Q, 0);
                this.c.remove(ekg.EMOJI_ERROR);
                return;
            case 3:
                this.c.remove(ekg.GIF_DATA);
                this.c.remove(ekg.GIF_NO_RESULT_ERROR);
                return;
            case 4:
                this.c.remove(ekg.GIF_CONNECTION_ERROR);
                this.c.remove(ekg.GIF_DATA);
                return;
            case 5:
                ar(this.M, 0);
                ar(this.L, 8);
                ar(this.f, 0);
                ar(this.N, 8);
                this.c.remove(ekg.GIF_CONNECTION_ERROR);
                this.c.remove(ekg.GIF_NO_RESULT_ERROR);
                return;
            case 6:
                ar(this.P, 8);
                ar(this.O, 8);
                this.c.remove(ekg.STICKER_DATA);
                return;
            case 7:
                ar(this.P, 0);
                ar(this.O, 8);
                this.c.remove(ekg.STICKER_ERROR);
                return;
            case 8:
                ar(this.M, 0);
                ar(this.L, 8);
                ar(this.f, 0);
                ar(this.N, 8);
                this.c.remove(ekg.LOADING);
                this.c.remove(ekg.DATA_ERROR);
                if (!this.z) {
                    return;
                }
                String U = U();
                if (!TextUtils.isEmpty(U)) {
                    fx().d(R.string.f153140_resource_name_obfuscated_res_0x7f1402c5, U);
                    return;
                } else {
                    fx().d(R.string.f153150_resource_name_obfuscated_res_0x7f1402c6, new Object[0]);
                    return;
                }
            case 9:
                ar(this.M, 8);
                ar(this.L, 0);
                ar(this.f, 8);
                ar(this.N, 8);
                ar(this.O, 8);
                this.c.remove(ekg.LOADING);
                this.c.remove(ekg.DATA_READY);
                return;
            default:
                return;
        }
    }

    public final void T() {
        if (!this.j || this.i || this.c.contains(ekg.DATA_READY)) {
            return;
        }
        if (this.c.contains(ekg.EMOJI_DATA) || this.c.contains(ekg.STICKER_DATA) || this.c.contains(ekg.GIF_DATA)) {
            this.e.g(ctg.UNIVERSAL_MEDIA_DATA_READY_TIME, SystemClock.elapsedRealtime() - this.W);
            S(ekg.DATA_READY);
            return;
        }
        S(ekg.DATA_ERROR);
        ViewGroup viewGroup = this.L;
        if (viewGroup == null) {
            return;
        }
        if (this.c.contains(ekg.GIF_CONNECTION_ERROR)) {
            cnf a2 = cng.a();
            a2.e(2);
            a2.g(R.drawable.quantum_gm_ic_cloud_off_vd_theme_24);
            a2.f(R.string.f152930_resource_name_obfuscated_res_0x7f1402b0);
            a2.d(R.string.f152920_resource_name_obfuscated_res_0x7f1402af);
            a2.a = new ega(this, 16);
            a2.a().b(this.u, viewGroup);
            this.e.e(ctd.UNIVERSAL_MEDIA_NO_CONNECTION_CARD_SHOWN, this.h, U(), V(), u());
        } else if (!this.c.contains(ekg.GIF_NO_RESULT_ERROR)) {
        } else {
            cnf a3 = cng.a();
            a3.e(1);
            a3.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
            a3.f(R.string.f159030_resource_name_obfuscated_res_0x7f140598);
            a3.a().b(this.u, viewGroup);
            this.e.e(ctd.UNIVERSAL_MEDIA_NO_RESULTS_CARD_SHOWN, this.h, U(), V(), u());
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        this.i = false;
        this.U = false;
        this.j = false;
        this.c.clear();
        this.ag.e();
        super.close();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        String U;
        boolean z2 = this.C;
        printer.println("isActive() = " + z2);
        if (z) {
            U = jbs.b(U());
        } else {
            U = U();
        }
        printer.println("getQuery = ".concat(U));
        boolean z3 = this.i;
        printer.println("waitingOnRequestedGifs = " + z3);
        boolean z4 = this.U;
        printer.println("handledUpdateEmoji = " + z4);
        boolean z5 = this.j;
        printer.println("handledUpdateStickers = " + z5);
        boolean a2 = htg.a(this);
        printer.println("isEmojiAvailable = " + a2);
        int i = this.T;
        printer.println("maxEmoji = " + i);
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        Boolean bool = null;
        Boolean valueOf = verticalScrollAnimatedImageSidebarHolderView != null ? Boolean.valueOf(verticalScrollAnimatedImageSidebarHolderView.aJ()) : null;
        new StringBuilder("gifHolderView.hasImages() = ").append(valueOf);
        printer.println("gifHolderView.hasImages() = ".concat(String.valueOf(valueOf)));
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            bool = Boolean.valueOf(ekxVar.aJ());
        }
        new StringBuilder("stickerHolderView.hasImages() = ").append(bool);
        printer.println("stickerHolderView.hasImages() = ".concat(String.valueOf(bool)));
        printer.println("viewStates = ".concat(lex.d(", ").f(lre.H(lre.B(this.c), eki.b))));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b != ice.HEADER && icfVar.b == ice.BODY) {
            ap();
            this.M = null;
            this.L = null;
            this.ag.e();
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
            if (verticalScrollAnimatedImageSidebarHolderView != null) {
                verticalScrollAnimatedImageSidebarHolderView.aL(null);
            }
            this.f = null;
            this.N = null;
            ekx ekxVar = this.g;
            if (ekxVar != null) {
                ekxVar.aL(null);
            }
            this.g = null;
            this.P = null;
            this.O = null;
            this.Q = null;
            this.R = null;
            this.ai = null;
            this.q = null;
            BindingRecyclerView bindingRecyclerView = this.m;
            if (bindingRecyclerView == null) {
                return;
            }
            ao(bindingRecyclerView);
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final String fs() {
        return this.u.getResources().getString(R.string.f182100_resource_name_obfuscated_res_0x7f140f24);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fz(SoftKeyboardView softKeyboardView, icf icfVar) {
        super.fz(softKeyboardView, icfVar);
        if (icfVar.b != ice.HEADER && icfVar.b == ice.BODY) {
            this.M = softKeyboardView.findViewById(R.id.f55910_resource_name_obfuscated_res_0x7f0b023d);
            this.L = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
            this.m = (BindingRecyclerView) softKeyboardView.findViewById(R.id.f52870_resource_name_obfuscated_res_0x7f0b00e1);
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = (VerticalScrollAnimatedImageSidebarHolderView) softKeyboardView.findViewById(R.id.f52360_resource_name_obfuscated_res_0x7f0b007b);
            this.f = verticalScrollAnimatedImageSidebarHolderView;
            verticalScrollAnimatedImageSidebarHolderView.aL(this.r);
            this.N = softKeyboardView.findViewById(R.id.f52370_resource_name_obfuscated_res_0x7f0b007d);
            LayoutInflater from = LayoutInflater.from(this.u);
            View inflate = from.inflate(R.layout.f146950_resource_name_obfuscated_res_0x7f0e05fa, (ViewGroup) this.f, false);
            ekx ekxVar = (ekx) inflate.findViewById(R.id.f52420_resource_name_obfuscated_res_0x7f0b0082);
            this.g = ekxVar;
            ekxVar.aL(this.r);
            this.P = inflate.findViewById(R.id.f52430_resource_name_obfuscated_res_0x7f0b0083);
            this.O = inflate.findViewById(R.id.f52440_resource_name_obfuscated_res_0x7f0b0084);
            this.Q = inflate.findViewById(R.id.f130330_resource_name_obfuscated_res_0x7f0b21d9);
            this.R = (FixedSizeEmojiListHolder) aad.q(inflate, R.id.f130320_resource_name_obfuscated_res_0x7f0b21d8);
            this.T = jbt.h(this.u, R.attr.f7270_resource_name_obfuscated_res_0x7f04020d);
            if (this.v.b() == 3) {
                this.T = Math.min(9, this.T);
            }
            int i = this.T;
            FixedSizeEmojiListHolder fixedSizeEmojiListHolder = this.R;
            if (i != fixedSizeEmojiListHolder.b) {
                fixedSizeEmojiListHolder.j(i);
            }
            this.ai = new elc(inflate);
            elc elcVar = new elc(from.inflate(R.layout.f146940_resource_name_obfuscated_res_0x7f0e05f9, (ViewGroup) this.g, false));
            this.q = elcVar;
            ((AppCompatTextView) elcVar.a.findViewById(R.id.f130350_resource_name_obfuscated_res_0x7f0b21db)).setText(this.u.getText(R.string.f182140_resource_name_obfuscated_res_0x7f140f28));
            ctp.a(softKeyboardView, R.string.f152700_resource_name_obfuscated_res_0x7f140299);
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void g(EditorInfo editorInfo, Object obj) {
        super.g(editorInfo, obj);
        hfl g = dip.g(obj, hfl.EXTERNAL);
        ino inoVar = this.t;
        if (inoVar != null) {
            inoVar.j("PREF_LAST_ACTIVE_TAB", IUniversalMediaExtension.class.getName());
        }
        BindingRecyclerView bindingRecyclerView = this.m;
        if (bindingRecyclerView != null) {
            bindingRecyclerView.ab(new GridLayoutManager(1, 1));
            BindingRecyclerView bindingRecyclerView2 = this.m;
            Context context = this.u;
            lls h = llw.h();
            Context context2 = this.u;
            eim eimVar = new eim(this, 6);
            cjq cjqVar = new cjq(context2, eimVar, 19);
            cjq cjqVar2 = new cjq(context2, eimVar, 20);
            gmi i = cnx.i();
            i.c = eki.a;
            i.n(R.layout.f133600_resource_name_obfuscated_res_0x7f0e0038, cjqVar2);
            i.n(R.layout.f133650_resource_name_obfuscated_res_0x7f0e003d, cjqVar);
            i.n(R.layout.f133640_resource_name_obfuscated_res_0x7f0e003c, cjqVar2);
            h.a(ejv.class, i.m());
            bindingRecyclerView2.aa(cnx.f(h, context, null, null));
        }
        this.n = -1;
        this.h = g;
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            verticalScrollAnimatedImageSidebarHolderView.aM();
            this.f.aO(this.ai);
            ((ekt) this.f).W = this.ae;
        }
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            ekxVar.aM();
            this.g.aK();
            ekx ekxVar2 = this.g;
            ((ekt) ekxVar2).W = this.ae;
            ((ekt) ekxVar2).aa = this.af;
        }
        FixedSizeEmojiListHolder fixedSizeEmojiListHolder = this.R;
        if (fixedSizeEmojiListHolder != null) {
            hen henVar = new hen(fixedSizeEmojiListHolder, x(this.f), this, R.style.f203190_resource_name_obfuscated_res_0x7f1507da, ((Boolean) ejz.a.c()).booleanValue(), ((Boolean) ejz.b.c()).booleanValue());
            this.S = henVar;
            henVar.d(-1, this.u.getResources().getDimensionPixelSize(R.dimen.f43190_resource_name_obfuscated_res_0x7f07073b));
            this.S.f = this;
        }
        this.o = dip.l(obj);
        L();
        N();
        if (g != hfl.INTERNAL) {
            String U = U();
            idk idkVar = this.e;
            ctd ctdVar = ctd.TAB_OPEN;
            Object[] objArr = new Object[1];
            nfh t = mbc.p.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar = (mbc) t.b;
            mbcVar.b = 8;
            mbcVar.a = 1 | mbcVar.a;
            int W = W(U());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = W - 1;
            int i2 = mbcVar2.a | 2;
            mbcVar2.a = i2;
            mbcVar2.a = i2 | 1024;
            mbcVar2.j = U;
            int a2 = cte.a(g);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar3 = (mbc) t.b;
            mbcVar3.d = a2 - 1;
            mbcVar3.a |= 4;
            objArr[0] = t.cz();
            idkVar.e(ctdVar, objArr);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "UniversalMediaKeyboardTablet";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        super.h();
        this.ag.e();
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            ((ekt) verticalScrollAnimatedImageSidebarHolderView).W = null;
            ((ekt) verticalScrollAnimatedImageSidebarHolderView).aa = null;
            verticalScrollAnimatedImageSidebarHolderView.aF();
            this.f.aN();
        }
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            ((ekt) ekxVar).W = null;
            ((ekt) ekxVar).aa = null;
            ekxVar.aF();
            this.g.aN();
        }
        ap();
        aq();
        hji.h(this.aa);
        this.aa = null;
        this.X = null;
        BindingRecyclerView bindingRecyclerView = this.m;
        if (bindingRecyclerView != null) {
            ao(bindingRecyclerView);
        }
        this.n = -1;
    }

    @Override // defpackage.heo
    public final void l(hei heiVar) {
        this.v.z(hfd.d(new iay(-10027, iax.COMMIT, heiVar.b)));
        String str = heiVar.b;
        boolean z = heiVar.g;
        String U = U();
        idk idkVar = this.e;
        ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 8;
        mbcVar.a |= 1;
        int i = true != TextUtils.isEmpty(U) ? 3 : 2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = i - 1;
        int i2 = 2 | mbcVar2.a;
        mbcVar2.a = i2;
        mbcVar2.a = i2 | 1024;
        mbcVar2.j = U;
        hfl hflVar = this.h;
        if (hflVar == null) {
            hflVar = hfl.EXTERNAL;
        }
        int a2 = cte.a(hflVar);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbcVar3.d = a2 - 1;
        mbcVar3.a |= 4;
        nfh t2 = mdl.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mdl mdlVar = (mdl) t2.b;
        mdlVar.b = 1;
        int i3 = mdlVar.a | 1;
        mdlVar.a = i3;
        mdlVar.a = i3 | 4;
        mdlVar.d = z;
        mdl mdlVar2 = (mdl) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar4 = (mbc) t.b;
        mdlVar2.getClass();
        mbcVar4.k = mdlVar2;
        mbcVar4.a |= 2048;
        objArr[1] = t.cz();
        idkVar.e(ctdVar, objArr);
        this.G.c(str);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final int m() {
        return R.id.key_pos_non_prime_category_0;
    }

    protected final cwx t() {
        if (this.X == null) {
            this.X = new ekh(this.u);
        }
        return this.X;
    }

    public final String u() {
        EditorInfo editorInfo = this.D;
        if (editorInfo != null) {
            return editorInfo.packageName;
        }
        return null;
    }
}
