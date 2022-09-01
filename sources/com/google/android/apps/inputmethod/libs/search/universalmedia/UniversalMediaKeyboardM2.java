package com.google.android.apps.inputmethod.libs.search.universalmedia;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.Printer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.emojisearch.EmojiSearchJniImpl;
import com.google.android.apps.inputmethod.libs.expression.extension.IUniversalMediaExtension;
import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.widget.VerticalScrollAnimatedImageSidebarHolderView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.widget.FixedSizeEmojiListHolder;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.EnumSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniversalMediaKeyboardM2 extends AbstractSearchResultKeyboard implements heo, hep, gzv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2");
    private static final String[] q = gvw.g;
    private final cri F;
    private final cri G;
    private final cri H;
    private final boolean I;
    private ViewGroup J;
    private View K;
    private View L;
    private View M;
    private View N;
    private View O;
    private FixedSizeEmojiListHolder P;
    private hen Q;
    private int R;
    private long U;
    private cwx V;
    private ejr W;
    private ejs X;
    private mko Y;
    private final cma Z;
    private ejp aa;
    private cou ab;
    private long ac;
    private elc ah;
    private boe ai;
    private kcq aj;
    public final int b;
    public final crf d;
    public final idk e;
    public VerticalScrollAnimatedImageSidebarHolderView f;
    public ekx g;
    public long k;
    public long l;
    public elc m;
    private final cpu r;
    public final EnumSet c = EnumSet.noneOf(eka.class);
    public final dxs n = new dxs((byte[]) null);
    public hfl h = hfl.INTERNAL;
    public boolean i = false;
    private boolean S = false;
    private boolean T = false;
    public boolean j = false;
    private final eku ad = new eke(this, 1);
    private final ekq ae = new ekb(this, 1);
    private final edq af = new edq();
    private final edo ag = new ekf(this, 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalMediaKeyboardM2(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        cpu cpuVar = cqh.a().b;
        cma i = ffb.i(context, gxo.a(9));
        this.r = cpuVar;
        this.Z = i;
        this.d = new crf(context);
        this.e = hszVar.hO();
        this.b = ((Long) ejz.a(context).c()).intValue();
        Context applicationContext = context.getApplicationContext();
        this.F = cri.b(applicationContext, "recent_content_suggestion_shared");
        this.H = cri.b(applicationContext, "recent_bitmoji_shared");
        this.G = cri.b(applicationContext, "recent_sticker_shared");
        this.I = ((Boolean) iho.a(context).c()).booleanValue();
    }

    public static final String T() {
        return jav.d(hqp.e()).n;
    }

    public static int V(String str) {
        return TextUtils.isEmpty(str) ? 2 : 3;
    }

    private final int W() {
        return this.I ? R.string.f163280_resource_name_obfuscated_res_0x7f14077e : R.string.f182110_resource_name_obfuscated_res_0x7f140f25;
    }

    private final void ao() {
        hen henVar = this.Q;
        if (henVar != null) {
            henVar.close();
            this.Q = null;
        }
    }

    private final void ap() {
        this.i = false;
        this.S = false;
        this.j = false;
    }

    private static void aq(View view, int i) {
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
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "dispatchEmojiResults", 747, "UniversalMediaKeyboardM2.java")).u("Emoji fetcher returned %d results", length);
        if (TextUtils.isEmpty(U())) {
            ctgVar = ctg.UNIVERSAL_MEDIA_RECENT_EMOJI_FETCHER_TIME;
        } else {
            ctgVar = ctg.UNIVERSAL_MEDIA_SEARCH_EMOJI_FETCHER_TIME;
        }
        P(ctgVar, this.ac);
        if (strArr == null || length <= 0) {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleUpdateEmojis", 1058, "UniversalMediaKeyboardM2.java")).t("handleUpdateEmojis(): Received no emojis");
            R(eka.EMOJI_ERROR);
        } else {
            ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "handleUpdateEmojis", 1054, "UniversalMediaKeyboardM2.java")).u("handleUpdateEmojis(): Received %d emojis", length);
            this.T = true;
            hen henVar = this.Q;
            if (henVar != null) {
                henVar.c(strArr);
            }
        }
        this.S = true;
        S();
    }

    public final void L() {
        if (TextUtils.isEmpty(U())) {
            cou couVar = this.ab;
            if (couVar == null) {
                return;
            }
            cpc a2 = cpd.a();
            a2.b = 5;
            couVar.g(a2.a());
            cou couVar2 = this.ab;
            cog.c();
            couVar2.k(cog.g(R.string.f153200_resource_name_obfuscated_res_0x7f1402cb, W()).h());
            return;
        }
        cou couVar3 = this.ab;
        if (couVar3 == null) {
            return;
        }
        cpc a3 = cpd.a();
        a3.b = 4;
        couVar3.g(a3.a());
        cou couVar4 = this.ab;
        cog.c();
        couVar4.k(cog.i(U(), W()).h());
    }

    public final void N() {
        hja b;
        R(eka.LOADING);
        hen henVar = this.Q;
        if (henVar != null) {
            henVar.c(q);
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            verticalScrollAnimatedImageSidebarHolderView.aF();
        }
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            ekxVar.aF();
        }
        ap();
        String U = U();
        this.k = SystemClock.elapsedRealtime();
        gyc gycVar = gyc.b;
        if (TextUtils.isEmpty(U)) {
            mko k = t().k(2);
            if (this.W == null) {
                this.W = new ejr(this.u, new ekd(this, 1), this.F, this.H, this.G);
            }
            kcu.U(k, this.W, gycVar);
            this.Y = k;
        } else {
            hiz b2 = hjg.b(t().e(U));
            if (this.X == null) {
                this.X = new ejs(new ekd(this, 1));
            }
            kcu.U(b2, this.X, gycVar);
            this.Y = b2;
        }
        this.i = true;
        if (TextUtils.isEmpty(U)) {
            b = ejq.a(this.u, this.Z);
        } else {
            cma cmaVar = this.Z;
            hfg a2 = cmc.a();
            a2.f(U);
            a2.a = 5;
            b = cmaVar.b(a2.d());
        }
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView2 = this.f;
        ViewGroup viewGroup = this.J;
        if (verticalScrollAnimatedImageSidebarHolderView2 != null && viewGroup != null) {
            verticalScrollAnimatedImageSidebarHolderView2.aF();
            this.af.d(verticalScrollAnimatedImageSidebarHolderView2, viewGroup, b, this.ag);
        }
        this.ac = SystemClock.elapsedRealtime();
        if (!htg.a(this)) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "fetchEmoji", 666, "UniversalMediaKeyboardM2.java")).t("fetchEmoji(): Emoji are not available");
            K(q);
        } else if (!TextUtils.isEmpty(U)) {
            Locale e = hqp.e();
            if (e == null || !cly.a(this.u).c(e)) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/search/universalmedia/UniversalMediaKeyboardM2", "fetchEmoji", 671, "UniversalMediaKeyboardM2.java")).t("fetchEmoji(): Emoji search data is not ready");
                K(q);
                return;
            }
            if (this.aj == null) {
                this.aj = new kcq(this.u, (cne) new EmojiSearchJniImpl(), (ejo) new ekc(this, 1));
            }
            this.aj.C(U);
        } else {
            if (this.aa == null) {
                this.aa = new ejp(this.r, new ekc(this, 1));
            }
            this.aa.a();
        }
    }

    @Override // defpackage.hep
    public final void O(int i) {
        if (!this.T) {
            return;
        }
        this.T = false;
        if (i <= 0) {
            R(eka.EMOJI_ERROR);
        } else {
            R(eka.EMOJI_DATA);
        }
    }

    public final void P(ids idsVar, long j) {
        this.e.g(idsVar, SystemClock.elapsedRealtime() - j);
    }

    public final void Q() {
        ctg ctgVar;
        if (TextUtils.isEmpty(U())) {
            ctgVar = ctg.UNIVERSAL_MEDIA_RECENT_GIF_FETCHER_TIME;
        } else {
            ctgVar = ctg.UNIVERSAL_MEDIA_SEARCH_GIF_FETCHER_TIME;
        }
        P(ctgVar, this.l);
    }

    public final void R(eka ekaVar) {
        this.c.add(ekaVar);
        edp edpVar = edp.NO_NETWORK;
        eka ekaVar2 = eka.LOADING;
        switch (ekaVar.ordinal()) {
            case 0:
                aq(this.K, 0);
                aq(this.J, 8);
                aq(this.f, 8);
                aq(this.L, 0);
                aq(this.M, 0);
                this.c.clear();
                this.c.add(eka.LOADING);
                this.U = SystemClock.elapsedRealtime();
                return;
            case 1:
                aq(this.O, 8);
                this.c.remove(eka.EMOJI_DATA);
                return;
            case 2:
                aq(this.K, 0);
                aq(this.J, 8);
                aq(this.f, 0);
                aq(this.O, 0);
                this.c.remove(eka.EMOJI_ERROR);
                return;
            case 3:
                this.c.remove(eka.GIF_DATA);
                this.c.remove(eka.GIF_NO_RESULT_ERROR);
                return;
            case 4:
                this.c.remove(eka.GIF_CONNECTION_ERROR);
                this.c.remove(eka.GIF_DATA);
                return;
            case 5:
                aq(this.K, 0);
                aq(this.J, 8);
                aq(this.f, 0);
                aq(this.L, 8);
                this.c.remove(eka.GIF_CONNECTION_ERROR);
                this.c.remove(eka.GIF_NO_RESULT_ERROR);
                return;
            case 6:
                aq(this.N, 8);
                aq(this.M, 8);
                this.c.remove(eka.STICKER_DATA);
                return;
            case 7:
                aq(this.N, 0);
                aq(this.M, 8);
                this.c.remove(eka.STICKER_ERROR);
                return;
            case 8:
                aq(this.K, 0);
                aq(this.J, 8);
                aq(this.f, 0);
                aq(this.L, 8);
                this.c.remove(eka.LOADING);
                this.c.remove(eka.DATA_ERROR);
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
                aq(this.K, 8);
                aq(this.J, 0);
                aq(this.f, 8);
                aq(this.L, 8);
                aq(this.M, 8);
                this.c.remove(eka.LOADING);
                this.c.remove(eka.DATA_READY);
                return;
            default:
                return;
        }
    }

    public final void S() {
        if (!this.j || this.i || this.c.contains(eka.DATA_READY)) {
            return;
        }
        if (this.c.contains(eka.EMOJI_DATA) || this.c.contains(eka.STICKER_DATA) || this.c.contains(eka.GIF_DATA)) {
            this.e.g(ctg.UNIVERSAL_MEDIA_DATA_READY_TIME, SystemClock.elapsedRealtime() - this.U);
            R(eka.DATA_READY);
            return;
        }
        R(eka.DATA_ERROR);
        ViewGroup viewGroup = this.J;
        if (viewGroup == null) {
            return;
        }
        if (this.c.contains(eka.GIF_CONNECTION_ERROR)) {
            cnf a2 = cng.a();
            a2.e(2);
            a2.g(R.drawable.quantum_gm_ic_cloud_off_vd_theme_24);
            a2.f(R.string.f152930_resource_name_obfuscated_res_0x7f1402b0);
            a2.d(R.string.f152920_resource_name_obfuscated_res_0x7f1402af);
            a2.a = new ega(this, 15);
            a2.a().b(this.u, viewGroup);
            this.e.e(ctd.UNIVERSAL_MEDIA_NO_CONNECTION_CARD_SHOWN, this.h, U(), T(), u());
        } else if (!this.c.contains(eka.GIF_NO_RESULT_ERROR)) {
        } else {
            cnf a3 = cng.a();
            a3.e(1);
            a3.g(R.drawable.f49120_resource_name_obfuscated_res_0x7f080294);
            a3.f(R.string.f159030_resource_name_obfuscated_res_0x7f140598);
            a3.a().b(this.u, viewGroup);
            this.e.e(ctd.UNIVERSAL_MEDIA_NO_RESULTS_CARD_SHOWN, this.h, U(), T(), u());
        }
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public final void close() {
        this.i = false;
        this.S = false;
        this.j = false;
        this.c.clear();
        this.af.e();
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
        boolean z4 = this.S;
        printer.println("handledUpdateEmoji = " + z4);
        boolean z5 = this.j;
        printer.println("handledUpdateStickers = " + z5);
        boolean a2 = htg.a(this);
        printer.println("isEmojiAvailable = " + a2);
        int i = this.R;
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
        printer.println("viewStates = ".concat(lex.d(", ").f(lre.H(lre.B(this.c), ehk.u))));
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard
    public final void fA(icf icfVar) {
        super.fA(icfVar);
        if (icfVar.b == ice.HEADER) {
            this.ab = null;
            this.ai = null;
        } else if (icfVar.b != ice.BODY) {
        } else {
            ao();
            this.K = null;
            this.J = null;
            this.af.e();
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
            if (verticalScrollAnimatedImageSidebarHolderView != null) {
                verticalScrollAnimatedImageSidebarHolderView.aL(null);
            }
            this.f = null;
            this.L = null;
            ekx ekxVar = this.g;
            if (ekxVar != null) {
                ekxVar.aL(null);
            }
            this.g = null;
            this.N = null;
            this.M = null;
            this.O = null;
            this.P = null;
            this.ah = null;
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
        if (icfVar.b == ice.HEADER) {
            this.ab = new cou(softKeyboardView, new edx(this, 5));
            if (!this.I) {
                return;
            }
            this.ai = new boe(this.u, softKeyboardView, 1);
            boe.i(softKeyboardView, R.string.f152700_resource_name_obfuscated_res_0x7f140299);
        } else if (icfVar.b != ice.BODY) {
        } else {
            this.K = softKeyboardView.findViewById(R.id.f55910_resource_name_obfuscated_res_0x7f0b023d);
            this.J = (ViewGroup) softKeyboardView.findViewById(R.id.f68170_resource_name_obfuscated_res_0x7f0b08c5);
            VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = (VerticalScrollAnimatedImageSidebarHolderView) softKeyboardView.findViewById(R.id.f52360_resource_name_obfuscated_res_0x7f0b007b);
            this.f = verticalScrollAnimatedImageSidebarHolderView;
            verticalScrollAnimatedImageSidebarHolderView.aL(this.n);
            this.L = softKeyboardView.findViewById(R.id.f52370_resource_name_obfuscated_res_0x7f0b007d);
            LayoutInflater from = LayoutInflater.from(this.u);
            View inflate = from.inflate(R.layout.f146950_resource_name_obfuscated_res_0x7f0e05fa, (ViewGroup) this.f, false);
            ekx ekxVar = (ekx) inflate.findViewById(R.id.f52420_resource_name_obfuscated_res_0x7f0b0082);
            this.g = ekxVar;
            ekxVar.aL(this.n);
            this.N = inflate.findViewById(R.id.f52430_resource_name_obfuscated_res_0x7f0b0083);
            this.M = inflate.findViewById(R.id.f52440_resource_name_obfuscated_res_0x7f0b0084);
            this.O = inflate.findViewById(R.id.f130330_resource_name_obfuscated_res_0x7f0b21d9);
            this.P = (FixedSizeEmojiListHolder) aad.q(inflate, R.id.f130320_resource_name_obfuscated_res_0x7f0b21d8);
            this.R = jbt.h(this.u, R.attr.f7270_resource_name_obfuscated_res_0x7f04020d);
            if (this.v.b() == 3) {
                this.R = Math.min(9, this.R);
            }
            int i = this.R;
            FixedSizeEmojiListHolder fixedSizeEmojiListHolder = this.P;
            if (i != fixedSizeEmojiListHolder.b) {
                fixedSizeEmojiListHolder.j(i);
            }
            this.ah = new elc(inflate);
            elc elcVar = new elc(from.inflate(R.layout.f146940_resource_name_obfuscated_res_0x7f0e05f9, (ViewGroup) this.g, false));
            this.m = elcVar;
            ((AppCompatTextView) elcVar.a.findViewById(R.id.f130350_resource_name_obfuscated_res_0x7f0b21db)).setText(this.u.getText(R.string.f182140_resource_name_obfuscated_res_0x7f140f28));
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
        this.h = g;
        VerticalScrollAnimatedImageSidebarHolderView verticalScrollAnimatedImageSidebarHolderView = this.f;
        if (verticalScrollAnimatedImageSidebarHolderView != null) {
            verticalScrollAnimatedImageSidebarHolderView.aM();
            this.f.aO(this.ah);
            ((ekt) this.f).W = this.ad;
        }
        ekx ekxVar = this.g;
        if (ekxVar != null) {
            ekxVar.aM();
            this.g.aK();
            ekx ekxVar2 = this.g;
            ((ekt) ekxVar2).W = this.ad;
            ((ekt) ekxVar2).aa = this.ae;
        }
        FixedSizeEmojiListHolder fixedSizeEmojiListHolder = this.P;
        if (fixedSizeEmojiListHolder != null) {
            hen henVar = new hen(fixedSizeEmojiListHolder, x(this.f), this, R.style.f203190_resource_name_obfuscated_res_0x7f1507da, ((Boolean) ejz.a.c()).booleanValue(), ((Boolean) ejz.b.c()).booleanValue());
            this.Q = henVar;
            henVar.d(-1, this.u.getResources().getDimensionPixelSize(R.dimen.f43190_resource_name_obfuscated_res_0x7f07073b));
            this.Q.f = this;
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
            int V = V(U());
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mbc mbcVar2 = (mbc) t.b;
            mbcVar2.c = V - 1;
            int i = mbcVar2.a | 2;
            mbcVar2.a = i;
            mbcVar2.a = i | 1024;
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
        return "UniversalMediaKeyboardM2";
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard, com.google.android.apps.inputmethod.libs.expression.keyboard.LifecycleKeyboard, com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public final void h() {
        super.h();
        cou couVar = this.ab;
        if (couVar != null) {
            couVar.h();
        }
        boe boeVar = this.ai;
        if (boeVar != null) {
            boeVar.j();
        }
        this.af.e();
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
        ao();
        ap();
        hji.h(this.Y);
        this.Y = null;
        this.V = null;
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
        this.r.c(str);
    }

    @Override // com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard
    protected final int m() {
        return R.id.key_pos_non_prime_category_0;
    }

    protected final cwx t() {
        if (this.V == null) {
            this.V = new ekh(this.u);
        }
        return this.V;
    }

    public final String u() {
        EditorInfo editorInfo = this.D;
        if (editorInfo != null) {
            return editorInfo.packageName;
        }
        return null;
    }
}
