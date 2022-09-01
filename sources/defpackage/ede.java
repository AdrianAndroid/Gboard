package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Printer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiOrGifExtension;
import com.google.android.apps.inputmethod.libs.expression.recyclerview.BindingRecyclerView;
import com.google.android.apps.inputmethod.libs.search.fastaccessbar.FastAccessBarExtension;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ede  reason: default package */
/* loaded from: classes.dex */
public final class ede implements ctt, ect, ecv, ecn, hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessKeyboardPeer");
    private static final hhl[] m = {ecq.e, ecq.f, ecq.g, ecq.m, ecq.n, ecq.l, ecq.d, ecq.k, ecq.w, ecq.o, ecq.p};
    private String A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private float F;
    private float G;
    private boolean H;
    private idn I;
    public final LinearLayoutManager b;
    public final BindingRecyclerView c;
    public final ino d;
    public final gqa g;
    public boolean h;
    public ecu i;
    public Runnable j;
    public ecw k;
    public Runnable l;
    private final Context n;
    private final ctu o;
    private final SoftKeyboardView p;
    private final hsz q;
    private final idk r;
    private final hga s;
    private final eck t;
    private hiz x;
    private boolean y;
    private List z;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final AtomicBoolean f = new AtomicBoolean(true);
    private final ArrayList u = new ArrayList();
    private final dz J = new edb(this);
    private final View.OnClickListener v = new dbg(new edc(this, 0), 0);
    private final View.OnClickListener w = new dbg(new dwx(this, 19), 0);

    public ede(SoftKeyboardView softKeyboardView, Context context, ino inoVar, hsz hszVar, idk idkVar, ctu ctuVar, hga hgaVar) {
        this.p = softKeyboardView;
        this.n = context;
        this.d = inoVar;
        this.q = hszVar;
        this.r = idkVar;
        this.o = ctuVar;
        this.s = hgaVar;
        this.t = new eck(context);
        this.g = gqa.a(context);
        BindingRecyclerView bindingRecyclerView = (BindingRecyclerView) aad.q(softKeyboardView, R.id.f55100_resource_name_obfuscated_res_0x7f0b01e7);
        this.c = bindingRecyclerView;
        edd eddVar = new edd(this);
        this.b = eddVar;
        bindingRecyclerView.ab(eddVar);
        if (bindingRecyclerView.e() == 0) {
            bindingRecyclerView.ay(new edf());
            bindingRecyclerView.addOnLayoutChangeListener(new dkr(this, 5));
        }
        t();
        hhq.p(this, m);
    }

    private final int s() {
        return this.d.b("PREF_FAST_ACCESS_BAR_OFFBOARDING_SHOWN_COUNT", 0);
    }

    private final void t() {
        this.y = ((Boolean) ecq.e.c()).booleanValue();
        this.z = Arrays.asList(((String) ecq.f.c()).split(","));
        this.A = (String) ecq.g.c();
        this.B = ((Long) ecq.m.c()).intValue();
        this.C = ((Long) ecq.n.c()).intValue();
        this.D = ((Boolean) ecq.l.c()).booleanValue();
        this.E = ((Boolean) ecq.d.c()).booleanValue();
        this.F = ((Double) ecq.k.c()).floatValue();
        this.G = ((Double) ecq.w.c()).floatValue();
        this.H = ((Boolean) ecq.o.c()).booleanValue();
        this.u.clear();
        this.u.addAll(ecq.a(ecq.p));
    }

    @Override // defpackage.ecn
    public final void b(View view, int i, boolean z) {
        String a2 = ((EmojiView) view).a();
        if (this.y) {
            Locale q = this.q.m() == null ? null : this.q.m().q();
            if (q != null) {
                if (!this.z.contains(q.getLanguage().toLowerCase(Locale.US))) {
                    CharSequence ah = this.s.ah();
                    if (!TextUtils.isEmpty(ah) && (Character.isLetterOrDigit(ah.toString().codePointAt(0)) || this.A.contains(ah))) {
                        this.q.z(hfd.d(new iay(-10027, iax.COMMIT, " ")));
                    }
                }
            }
        }
        this.q.z(hfd.d(new iay(-10027, iax.COMMIT, a2)));
        this.t.g.c(a2);
        idk idkVar = this.r;
        ctd ctdVar = ctd.EMOJI_OR_TEXT_SHARE;
        Object[] objArr = new Object[2];
        objArr[0] = a2;
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 11;
        mbcVar2.a |= 2;
        nfh t2 = mdl.h.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mdl mdlVar = (mdl) t2.b;
        mdlVar.b = 1;
        int i2 = mdlVar.a | 1;
        mdlVar.a = i2;
        int i3 = 2 | i2;
        mdlVar.a = i3;
        mdlVar.c = i;
        mdlVar.a = i3 | 4;
        mdlVar.d = z;
        mdl mdlVar2 = (mdl) t2.cz();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mdlVar2.getClass();
        mbcVar3.k = mdlVar2;
        mbcVar3.a |= 2048;
        objArr[1] = t.cz();
        idkVar.e(ctdVar, objArr);
        p();
    }

    @Override // defpackage.ctt, defpackage.hfh
    public final /* synthetic */ boolean c(hfd hfdVar) {
        return false;
    }

    @Override // defpackage.ctt, java.lang.AutoCloseable
    public final void close() {
        this.t.close();
        i();
    }

    @Override // defpackage.ect
    public final void d(int i) {
        ecu ecuVar;
        if (this.i == null) {
            return;
        }
        if (i == ecuVar.a() - 1) {
            o(300);
        } else {
            j();
        }
        int i2 = true != (this.i instanceof ecx) ? 17 : 20;
        idk idkVar = this.r;
        ctd ctdVar = ctd.IMPRESSION;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 11;
        mbcVar2.a |= 2;
        nfh t2 = mbt.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbt mbtVar = (mbt) t2.b;
        mbtVar.c = i2 - 1;
        mbtVar.a |= 2;
        t.dM(t2);
        nfh t3 = mbt.e.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mbt mbtVar2 = (mbt) t3.b;
        mbtVar2.a = 1 | mbtVar2.a;
        mbtVar2.b = i;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar3 = (mbc) t.b;
        mbt mbtVar3 = (mbt) t3.cz();
        mbtVar3.getClass();
        mbcVar3.n = mbtVar3;
        mbcVar3.a |= 16384;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.ecv
    public final void e() {
        int s = s() + 1;
        this.d.h("PREF_FAST_ACCESS_BAR_OFFBOARDING_SHOWN_COUNT", s);
        idk idkVar = this.r;
        ctd ctdVar = ctd.IMPRESSION;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a |= 1;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 11;
        mbcVar2.a |= 2;
        nfh t2 = mbt.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbt mbtVar = (mbt) t2.b;
        mbtVar.a = 1 | mbtVar.a;
        mbtVar.b = s;
        mbt mbtVar2 = (mbt) t2.b;
        mbtVar2.c = 17;
        mbtVar2.a |= 2;
        t.dM(t2);
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        this.g.g(R.string.f151990_resource_name_obfuscated_res_0x7f14024e, new Object[0]);
    }

    public final cuj f() {
        cuj a2 = this.c.a();
        if (a2 == null) {
            Context context = this.c.getContext();
            lls h = llw.h();
            gmi i = cnx.i();
            i.c = dzr.q;
            final eck eckVar = this.t;
            final BindingRecyclerView bindingRecyclerView = this.c;
            final AtomicBoolean atomicBoolean = this.e;
            final boolean z = this.E;
            final float f = this.F;
            final float f2 = this.G;
            i.n(R.layout.f134510_resource_name_obfuscated_res_0x7f0e00a4, new leq() { // from class: ecl
                @Override // defpackage.leq
                public final Object a(Object obj) {
                    return new eco((View) obj, ecn.this, eckVar, bindingRecyclerView, atomicBoolean, z, f, f2);
                }
            });
            i.n(R.layout.f134500_resource_name_obfuscated_res_0x7f0e00a3, new ebi(this.v, 2));
            i.n(R.layout.f134570_resource_name_obfuscated_res_0x7f0e00aa, new cjq(this.w, this.f, 10));
            i.n(R.layout.f134580_resource_name_obfuscated_res_0x7f0e00ab, dzr.r);
            h.a(ecz.class, i.m());
            cuj f3 = cnx.f(h, context, null, null);
            this.c.aa(f3);
            return f3;
        }
        return a2;
    }

    public final void g() {
        this.s.z(hfd.d(new iay(-10060, null, FastAccessBarExtension.class)));
        this.g.j(R.string.f151880_resource_name_obfuscated_res_0x7f140243);
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        t();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ctt
    public final void h(EditorInfo editorInfo, Object obj) {
        int i;
        llp llpVar;
        hiz b;
        this.I = this.r.a(ctg.FAST_ACCESS_BAR_ACTIVATE);
        idk idkVar = this.r;
        ctd ctdVar = ctd.IMPRESSION;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 11;
        mbcVar2.a |= 2;
        nfh t2 = mbt.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mbt mbtVar = (mbt) t2.b;
        mbtVar.c = 14;
        mbtVar.a |= 2;
        t.dM(t2);
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
        this.c.az(this.J);
        eck eckVar = this.t;
        String str = editorInfo.packageName;
        if (eckVar.k) {
            String str2 = (String) eck.c.c();
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str2));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    eckVar.j.put(jsonReader.nextName(), eckVar.d(lfy.c(',').i(jsonReader.nextString())));
                }
                jsonReader.endObject();
            } catch (Exception e) {
                ((ltd) ((ltd) ((ltd) eck.d.d()).i(e)).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/EmojiContentHelper", "initPackageNameEmojisMap", 184, "EmojiContentHelper.java")).w("Error parsing package name emojis map:\n%s", str2);
            }
            eckVar.k = false;
        }
        llp llpVar2 = (llp) eckVar.j.get(str);
        if (llpVar2 == null || llpVar2.isEmpty()) {
            if (eckVar.i == null) {
                eckVar.i = eckVar.d(lfy.c(',').i((CharSequence) eck.b.c()));
                if (!eckVar.i.isEmpty()) {
                    llpVar2 = eckVar.i;
                } else {
                    eckVar.i = eckVar.d(eck.a);
                }
            }
            llpVar2 = eckVar.i;
        }
        if (!this.D || (i = this.B) < 0 || i >= llpVar2.size()) {
            m(llpVar2);
            return;
        }
        final int i2 = this.B;
        final int size = llpVar2.size();
        eck eckVar2 = this.t;
        int i3 = this.C;
        idn a2 = eckVar2.e.a(ctg.FAST_ACCESS_BAR_FETCH_FREQUENT_EMOJIS);
        cpu cpuVar = eckVar2.g;
        long j = size;
        if (!irs.d()) {
            b = hiz.n(llp.q());
            llpVar = llpVar2;
        } else {
            iqx iqxVar = cpuVar.b;
            long currentTimeMillis = System.currentTimeMillis();
            long l = fgy.l(currentTimeMillis, -i3);
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            llpVar = llpVar2;
            sb.append("SELECT base_variant_emoji, SUM(shares) as total_shares, MAX(last_event_millis) as last_shared_timestamp FROM emoji_shares WHERE truncated_timestamp_millis BETWEEN ? AND ? GROUP BY base_variant_emoji ORDER BY total_shares DESC, last_shared_timestamp DESC LIMIT ?");
            arrayList.add(Long.valueOf(l));
            arrayList.add(Long.valueOf(currentTimeMillis));
            arrayList.add(Long.valueOf(j));
            b = iqxVar.b(kws.m(sb, arrayList), cps.c, cpuVar.b.b);
        }
        hiz x = b.u(new cjq(eckVar2, a2, 9), mjl.a).x(ecq.x, TimeUnit.MILLISECONDS, gyc.b);
        afp afpVar = afp.STARTED;
        boolean z = jam.b;
        llk e2 = llp.e();
        llk e3 = llp.e();
        llk e4 = llp.e();
        ctu ctuVar = this.o;
        final llp llpVar3 = llpVar;
        e2.h(new hiu() { // from class: eda
            @Override // defpackage.hiu
            public final void a(Object obj2) {
                ede edeVar = ede.this;
                List list = llpVar3;
                int i4 = i2;
                int i5 = size;
                lmx g = lmz.g();
                g.j(list.subList(0, i4));
                g.j((llp) obj2);
                g.j(list.subList(i4, i5));
                edeVar.m(llp.i(lre.aa(g.g(), i5)));
            }
        });
        e3.h(new bqx(this, llpVar3, 12));
        e4.h(new bqx(this, llpVar3, 13));
        x.E(hjg.a(gyc.b, ctuVar, afpVar, z, e2, e3, e4));
        this.x = x;
    }

    @Override // defpackage.ctt
    public final void i() {
        j();
        ecu ecuVar = this.i;
        if (ecuVar != null) {
            ecuVar.close();
            this.i = null;
        }
        ecw ecwVar = this.k;
        if (ecwVar != null) {
            ecwVar.close();
            this.k = null;
        }
        hji.h(this.x);
        this.x = null;
        this.c.aC(this.J);
        this.c.aa(null);
    }

    public final void j() {
        this.b.ab(0, 0);
    }

    public final void k() {
        hsz hszVar = this.q;
        lls h = llw.h();
        h.a("extension_interface", IEmojiOrGifExtension.class);
        h.a("activation_result_callback", new hkg(this, 1));
        hszVar.z(hfd.d(new iay(-10059, null, h.l())));
        p();
    }

    public final void l() {
        r(15, 13);
    }

    public final void m(List list) {
        int i = !((Boolean) ecq.u.c()).booleanValue();
        int size = list.size() + i;
        if (this.c.e() > 0) {
            ((edf) this.c.ax(0)).a = size;
        }
        f().L(lre.H(list, dzr.p));
        if (i != 0) {
            f().A(new ecg());
        }
        f().A(ech.a);
        f().A(eci.a);
        ecu ecuVar = null;
        if (!this.d.ak("PREF_FAST_ACCESS_BAR_SHOWN")) {
            if (!((Boolean) ecq.q.c()).booleanValue()) {
                if (!this.d.ak("pref_fast_access_bar_onboarding_v2_shown")) {
                    ecuVar = new ecu(this, this.p);
                }
            } else if (!this.d.ak("pref_fast_access_bar_onboarding_v2_shown") && ((!this.d.ah(R.string.f160810_resource_name_obfuscated_res_0x7f140671) || !this.d.aj(R.string.f160810_resource_name_obfuscated_res_0x7f140671)) && this.d.b("pref_fast_access_bar_onboarding_v2_shown_count", 0) < brh.b())) {
                ecuVar = new ecx(this, this.p, new dwx(this, 20), new edc(this, 1, (byte[]) null));
                this.j = new eas(this, 12);
            }
        }
        this.i = ecuVar;
        if (ecuVar != null) {
            if (!ecuVar.i) {
                ecuVar.c();
                ecuVar.i = true;
            }
            if (ecuVar.c.getVisibility() == 8) {
                ecuVar.c.setVisibility(0);
                if (ecuVar.c.getLayoutParams().height != 0) {
                    ecuVar.d();
                } else {
                    new elj(ecuVar.c, ecuVar.h).c(new ecr(ecuVar, 0));
                }
            }
        } else if (this.H) {
            long c = this.d.c("PREF_FAST_ACCESS_BAR_LAST_USED_TIMESTAMP", -1L);
            if (c == -1) {
                p();
            } else {
                int s = s();
                if (s < this.u.size() && (System.currentTimeMillis() - c) / 1000 >= ((Long) this.u.get(s)).longValue()) {
                    ecw ecwVar = new ecw(this, this.p, new dwx(this, 18));
                    this.k = ecwVar;
                    ecwVar.d.setOnClickListener(new dbg(new dwx(ecwVar, 16), 0));
                    ecwVar.f.setOnClickListener(new dbg(new dwx(ecwVar, 17), 0));
                    ecwVar.e.setOnClickListener(new dbg(ecwVar.g, 0));
                    if (ecwVar.c.getVisibility() == 8) {
                        ecwVar.c.setVisibility(0);
                        if (ecwVar.c.getLayoutParams().height == 0) {
                            new elj(ecwVar.c, ecwVar.h).c(new ecr(ecwVar, 4));
                        } else {
                            ecwVar.a.e();
                        }
                    }
                }
            }
        }
        this.I.a();
    }

    @Override // defpackage.ctt
    public final void n() {
        if (this.o.fq()) {
            return;
        }
        hji.h(this.x);
        this.x = null;
    }

    public final void o(int i) {
        int dimensionPixelSize = this.n.getResources().getDimensionPixelSize(R.dimen.f34170_resource_name_obfuscated_res_0x7f07018a);
        if (this.c.getLayoutDirection() == 1) {
            dimensionPixelSize = -dimensionPixelSize;
        }
        this.c.at(dimensionPixelSize, 0, i);
    }

    public final void p() {
        System.currentTimeMillis();
        this.d.i("PREF_FAST_ACCESS_BAR_LAST_USED_TIMESTAMP", System.currentTimeMillis());
    }

    public final void q(int i) {
        idk idkVar = this.r;
        ctd ctdVar = ctd.CLICK;
        Object[] objArr = new Object[1];
        nfh t = mbc.p.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mbc mbcVar = (mbc) t.b;
        mbcVar.b = 7;
        mbcVar.a = 1 | mbcVar.a;
        mbc mbcVar2 = (mbc) t.b;
        mbcVar2.c = 11;
        int i2 = mbcVar2.a | 2;
        mbcVar2.a = i2;
        mbcVar2.f = i - 1;
        mbcVar2.a = i2 | 32;
        objArr[0] = t.cz();
        idkVar.e(ctdVar, objArr);
    }

    public final synchronized void r(int i, int i2) {
        q(i);
        if (((Boolean) ecq.s.c()).booleanValue()) {
            this.d.q(R.string.f160810_resource_name_obfuscated_res_0x7f140671, false);
            this.g.j(R.string.f152100_resource_name_obfuscated_res_0x7f140259);
            return;
        }
        hsk b = hsx.b();
        if (b != null) {
            ins insVar = new ins(i2);
            insVar.b(this.n, R.string.f162390_resource_name_obfuscated_res_0x7f140710, R.string.f160810_resource_name_obfuscated_res_0x7f140671);
            b.aC(insVar);
            return;
        }
        ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/search/fastaccessbar/FastAccessKeyboardPeer", "openSettingsInternal", 305, "FastAccessKeyboardPeer.java")).t("Could not open settings since service is null.");
    }
}
