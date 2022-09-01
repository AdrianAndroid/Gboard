package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.latin.preference.SettingsActivity;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.inputmethod.latin.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: boq  reason: default package */
/* loaded from: classes.dex */
public class boq extends dcu {
    private bqp ai;
    private imo aj;
    private don ak;
    private hge al;
    private bdz am;
    public boolean e;
    public bqo f;
    public static final lug a = hin.a;
    public static final ltg b = ltg.j("com/google/android/apps/inputmethod/latin/LatinIMEBase");
    static final hhl c = hhq.a("enable_battery_saver_theme_notice", true);
    static final hhl d = hhq.a("own_extract_text_view", false);
    private static final long ad = TimeUnit.HOURS.toMillis(23);
    private static final long ae = TimeUnit.HOURS.toMillis(23);
    private static final long af = TimeUnit.HOURS.toMillis(23);
    private static final long ag = TimeUnit.HOURS.toMillis(48);
    private static final jav ah = jav.f("en");

    static {
        iby.e("SHUANGPIN_MS_ZIGUANG", 288230376151711744L);
        iby.e("ZHUYIN_FIRST_TONE_ON", 4611686018427387904L);
        iby.e("SINGLE_CHARACTER_CANDIDATE", 576460752303423488L);
        iby.e("ENABLE_SC_TC_CONVERSION", 2305843009213693952L);
    }

    private final void bT() {
        imo imoVar = this.aj;
        if (imoVar != null) {
            imoVar.m();
            this.aj = null;
        }
    }

    @Override // defpackage.dcu
    protected final Intent a() {
        return SettingsActivity.m(this);
    }

    @Override // defpackage.dcu
    protected final LayoutInflater b() {
        return new erd(LayoutInflater.from(getBaseContext()).cloneInContext(this), new eqt(this, 1));
    }

    @Override // defpackage.dcu
    protected final hff c() {
        return fhr.w(this) ? new bot(this) : boo.b;
    }

    @Override // defpackage.dcu
    protected final hff d() {
        return fhr.w(this) ? new bot(this) : boo.a;
    }

    @Override // defpackage.dcu, defpackage.hoy
    public final hfi e() {
        return new hfb();
    }

    @Override // defpackage.dcu
    protected final iss f() {
        if (bw()) {
            return new ess(this, eqg.d(this), y());
        }
        int y = y();
        eqg a2 = eqg.a(this);
        if (!erj.l(this, a2.a)) {
            a2 = eqg.b(this);
        }
        return new ess(this, a2, y);
    }

    @Override // defpackage.dcu, defpackage.hoz
    public final jav g(EditorInfo editorInfo) {
        if (!ham.I(editorInfo)) {
            hqt b2 = hqp.b();
            jav h = b2 != null ? b2.h() : null;
            return h == null ? ah : h;
        }
        return ah;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final void h() {
        super.ar(true);
        Arrays.fill(this.s, (Object) null);
        this.t = null;
        this.r = null;
        imr imrVar = this.H;
        imrVar.a.j();
        imrVar.b.j();
        if (this.K != null) {
            super.bt(null);
        }
        this.q = null;
        super.as();
        this.u = null;
        ijl.b().g(new htj());
        bT();
    }

    public final void i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("hint_country", str);
        hrx.y(this).j(this, 6, bundle);
        bqp bqpVar = this.ai;
        synchronized (bqpVar.h) {
            bqpVar.h.clear();
        }
    }

    @Override // defpackage.dcu
    protected final void j(boolean z) {
        iav g;
        hqt b2 = hqp.b();
        if (b2 != null) {
            Context a2 = b2.a();
            llp j = b2.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                ag(dcu.bI(a2, this, (iav) j.get(i)));
            }
            if (!z || (g = b2.g()) == null) {
                return;
            }
            hox bI = dcu.bI(a2, this, g);
            bI.e.i(ibz.a);
            ag(bI);
        }
    }

    @Override // defpackage.dcu
    protected final void k() {
        hkx.b("tag_add_native_language_notice");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final void l() {
        super.l();
        this.ai = new bqp(this);
        this.am = new bdz(this, this.w);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final void m(hqt hqtVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.m(hqtVar);
        if (this.f != null && !bqp.c(hqtVar)) {
            hkx.b("tag_search_in_native_language_notice");
        }
        ieh.j().g(hsq.IMS_ON_INPUT_METHOD_ENTRY_CHANGED, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.dcu
    protected final void n() {
        if (this.ak != null && jai.b.b()) {
            don donVar = this.ak;
            donVar.b.e();
            donVar.c.g();
        }
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g != null) {
            g.u();
        }
        for (dij dijVar : dii.a.values()) {
            djn.c(dijVar, true);
        }
        Window window = getWindow().getWindow();
        if (window != null) {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        this.T = null;
        aj();
        h();
        this.v.ag(this.P, R.string.f160900_resource_name_obfuscated_res_0x7f14067a, R.string.f160940_resource_name_obfuscated_res_0x7f14067e, R.string.f161570_resource_name_obfuscated_res_0x7f1406be, R.string.f161550_resource_name_obfuscated_res_0x7f1406bc, R.string.f161030_resource_name_obfuscated_res_0x7f140687);
        this.O.set(false);
        unregisterReceiver(this.G);
        Arrays.fill(this.I, (Object) null);
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            hfpVar.m.d();
            ijl.b().d(hfpVar.o, igd.class);
            ijl.b().d(hfpVar.n, igi.class);
            this.R = null;
        }
        this.H = null;
        this.U.f();
        this.w.m(null);
        this.w.n(null);
        this.x = null;
        gvt.a(this.o);
        this.o = hou.a;
        this.F = this.D;
        this.E.p(null);
        hvp hvpVar = this.K;
        if (hvpVar != null) {
            hhq.q(hvpVar);
            hvpVar.l.h();
            hsk hskVar = hvpVar.o;
            if (hskVar != null) {
                hskVar.bb(null);
            }
            hvpVar.p.f();
            hhq.q(hvpVar.d);
            hvpVar.i.b();
            hvpVar.j.d.f();
            this.K = null;
        }
        jls jlsVar = this.ac;
        if (jlsVar != null) {
            ?? r0 = jlsVar.b;
            int i = ((lrl) r0).c;
            for (int i2 = 0; i2 < i; i2++) {
                ((isv) r0.get(i2)).c();
            }
            this.ac = null;
        }
        this.L = null;
        huk.c();
        ijl.b().d(this.W, hsv.class);
        ijl.b().d(this.ab, isz.class);
        this.Y.f();
        this.Z.g();
        ijl.b().d(this.V, gvo.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final void o() {
        imo imoVar = this.aj;
        if (imoVar == null || !imoVar.n()) {
            return;
        }
        gqa.a(this).l(this.aj.a());
    }

    @Override // android.inputmethodservice.InputMethodService
    public final View onCreateExtractTextView() {
        if (!((Boolean) d.c()).booleanValue()) {
            this.al = null;
            return super.onCreateExtractTextView();
        }
        hge hgeVar = new hge();
        this.al = hgeVar;
        if (hdn.instance.b() != null) {
            hgeVar.b = new hgc(0);
        } else {
            ((ltd) ((ltd) hge.a.d()).k("com/google/android/libraries/inputmethod/extracttextview/ExtractTextViewHelper", "onCreateExtractTextView", 76, "ExtractTextViewHelper.java")).t("EmojiCompat is not yet initialized.");
            hgeVar.b = new hgc(1);
        }
        return hgeVar.b.a(this);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void onUpdateExtractingViews(EditorInfo editorInfo) {
        hge hgeVar = this.al;
        if (hgeVar == null) {
            super.onUpdateExtractingViews(editorInfo);
            return;
        }
        hgd hgdVar = hgeVar.b;
        if (hgdVar == null) {
            return;
        }
        hgdVar.b(this, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r2 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
        if (r2 == false) goto L42;
     */
    @Override // defpackage.dcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boq.p():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r3v3, types: [hqy, java.lang.Object] */
    @Override // defpackage.dcu
    public final void q(EditorInfo editorInfo, boolean z) {
        ?? r3;
        super.q(editorInfo, z);
        if (bQ()) {
            bdz bdzVar = this.am;
            if (!bdzVar.a || bdzVar.k()) {
                if (bdzVar.a || !ham.E(editorInfo) || !bdzVar.k() || (r3 = bdzVar.b) == 0 || !r3.o()) {
                    return;
                }
                ker.n((Context) bdzVar.c, R.string.f153580_resource_name_obfuscated_res_0x7f140301, new Object[0]);
                bdzVar.a = true;
                return;
            }
            bdzVar.a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    @Override // defpackage.dcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void r(android.view.inputmethod.EditorInfo r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boq.r(android.view.inputmethod.EditorInfo, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final void s() {
        hdq.f(this);
        Delight5Facilitator.h(getApplicationContext());
        don donVar = new don(this);
        this.ak = donVar;
        donVar.c.f(donVar.a);
    }

    @Override // android.inputmethodservice.InputMethodService
    public final void setExtractView(View view) {
        try {
            super.setExtractView(view);
        } catch (ClassCastException e) {
            ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/latin/LatinIMEBase", "setExtractView", 804, "LatinIMEBase.java")).w("Detected %s (wrong customization code?). Falling back to default implementation", e.getMessage());
            this.al = null;
            super.setExtractView(super.onCreateExtractTextView());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final boolean t() {
        return this.w.r(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcu
    public final boolean u() {
        return this.w.r(true);
    }

    @Override // defpackage.dcu
    protected final void v() {
        hvk hvkVar;
        this.A = false;
        hfp hfpVar = this.R;
        if (hfpVar != null) {
            hfpVar.j();
        }
        this.o.e();
        this.F.s();
        hpx hpxVar = this.F;
        hpx hpxVar2 = this.D;
        if (hpxVar != hpxVar2) {
            hpxVar2.s();
        }
        super.as();
        gqa a2 = gqa.a(this);
        a2.i = null;
        a2.j = null;
        hvp hvpVar = this.K;
        if (hvpVar != null && (hvkVar = hvpVar.k) != null) {
            hvkVar.h();
        }
        imr imrVar = this.H;
        if (imrVar != null) {
            imrVar.h(null);
        }
        jaq.e();
        itb.f();
        bT();
    }

    @Override // defpackage.dcu
    protected final ewj w() {
        return new ewj((Context) this, (byte[]) null);
    }
}
