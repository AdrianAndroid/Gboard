package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cmn */
/* loaded from: classes.dex */
public final class cmn implements cmd, hfh {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl");
    private ija B;
    public boolean c;
    public boolean d;
    public boolean e;
    public llp i;
    public int j;
    public int k;
    public boolean l;
    public final gqa m;
    private final ino q;
    private cnc u;
    private cna v;
    private hfy w;
    private hiz x;
    private cmg y;
    private hfm z;
    private final iqi o = iqi.a(cmo.a);
    private final iqe p = iqe.a(cmo.b);
    public final idk b = ieh.j();
    private final hdq r = hdq.b();
    private final AtomicBoolean s = new AtomicBoolean(false);
    private final AtomicBoolean t = new AtomicBoolean(false);
    public int n = 1;
    public String f = "";
    public String g = "";
    public int h = 0;
    private final gqo A = new cml(this);
    private final cir C = new cir(this, 0);
    private final cir E = new cir(this, 2);
    private final hqi D = new cmm(this);

    public cmn(Context context) {
        this.m = gqa.a(context);
        this.q = ino.M(context);
    }

    public static /* bridge */ /* synthetic */ void v(cmn cmnVar) {
        cmnVar.c = true;
    }

    private static void w(String str) {
        hpy b;
        hsk b2 = hsx.b();
        if (b2 == null || (b = hqj.b()) == null) {
            return;
        }
        kfp a2 = icn.a();
        a2.e(b.d);
        a2.d(b.c.length() - b.e);
        a2.h(str);
        a2.f();
        b2.at(hfd.d(new iay(-10141, null, a2.c())));
    }

    private final boolean x(hqt hqtVar, EditorInfo editorInfo) {
        hfy hfyVar;
        boolean booleanValue;
        if (!this.o.l() || (hfyVar = this.w) == null || hfyVar.p() != iau.SOFT) {
            return false;
        }
        Context context = null;
        String p = hqtVar != null ? hqtVar.p() : null;
        if (p != null && (p.startsWith("morse") || p.startsWith("handwriting"))) {
            return false;
        }
        if (hqtVar != null) {
            context = hqtVar.a();
        }
        if (context == null) {
            return false;
        }
        if (ham.J(context, editorInfo)) {
            if (!((Boolean) cmo.c.c()).booleanValue()) {
                return false;
            }
        } else if (!ham.z(this.p, editorInfo)) {
            if (editorInfo == null) {
                return false;
            }
            String str = editorInfo.packageName;
            return false;
        }
        if (!cuz.a.d(context, editorInfo)) {
            return false;
        }
        if (this.m.e && !((Boolean) cmo.p.c()).booleanValue()) {
            return false;
        }
        if (this.q.ah(R.string.f160770_resource_name_obfuscated_res_0x7f14066d)) {
            booleanValue = this.q.aj(R.string.f160770_resource_name_obfuscated_res_0x7f14066d);
        } else {
            booleanValue = ((Boolean) cmo.s.c()).booleanValue();
        }
        return booleanValue;
    }

    @Override // defpackage.hfh
    public final boolean c(hfd hfdVar) {
        may mayVar;
        if (hfdVar.f() == null) {
            return false;
        }
        iay f = hfdVar.f();
        if (f.c == -10138) {
            Object obj = f.e;
            if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((Boolean) cmo.y.c()).booleanValue() && booleanValue) {
                    if (this.n == 2) {
                        m();
                    }
                    if (this.n == 2) {
                        mayVar = may.ACCEPTS_UNDO_AFTER_EMOJIFIED;
                    } else {
                        mayVar = may.ACCEPTS_UNDO;
                    }
                    t(true, true, true, true, mayVar);
                }
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "consumeEvent", 506, "EmojifyExtensionImpl.java")).t("Bad keyData with ACCEPTS_UNDO");
            }
        }
        return false;
    }

    public final void d(List list, cnc cncVar) {
        cmg cmgVar = (cmg) list.get(this.h);
        this.y = cmgVar;
        this.g = cmgVar.b;
        idk idkVar = this.b;
        cta ctaVar = cta.EMOJIFY_RESULT_APPLIED;
        Object[] objArr = new Object[1];
        nfh t = maz.k.t();
        cmf b = cmf.b(cmgVar.a);
        if (b == null) {
            b = cmf.UNRECOGNIZED;
        }
        int b2 = cte.b(b);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        maz mazVar = (maz) t.b;
        mazVar.d = b2 - 1;
        int i = mazVar.a | 4;
        mazVar.a = i;
        int i2 = cmgVar.c;
        int i3 = i | 8;
        mazVar.a = i3;
        mazVar.e = i2;
        int i4 = this.j;
        int i5 = i3 | 1;
        mazVar.a = i5;
        mazVar.b = i4 - 1;
        int i6 = this.k;
        int i7 = i5 | 16;
        mazVar.a = i7;
        mazVar.f = i6;
        mazVar.a = i7 | 64;
        mazVar.h = false;
        objArr[0] = t.cz();
        idkVar.e(ctaVar, objArr);
        w(cmgVar.b);
        this.m.k(cmgVar.b);
        this.m.h(this.h == list.size() + (-1) ? R.string.f150930_resource_name_obfuscated_res_0x7f1401d3 : R.string.f150920_resource_name_obfuscated_res_0x7f1401d2);
        int i8 = cmgVar.a;
        String str = cmgVar.b;
        this.n = 2;
        cncVar.a().e(this.h, this.j);
        this.h++;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.hfx
    public final /* synthetic */ void e() {
    }

    public final void g(may mayVar) {
        m();
        t(false, true, true, true, mayVar);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onCreate", 750, "EmojifyExtensionImpl.java")).w("Creating Emojify extension %s.", this);
    }

    @Override // defpackage.ifw
    public final void gn() {
        if (this.t.compareAndSet(false, true)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onDestroy", 756, "EmojifyExtensionImpl.java")).w("Destroying Emojify extension %s.", this);
            if (!this.s.get()) {
                return;
            }
            i();
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onDestroy", 763, "EmojifyExtensionImpl.java")).w("Emojify extension %s is already destroyed.", this);
    }

    @Override // defpackage.hfx
    public final void h(ibz ibzVar) {
        if (this.n == 2) {
            g(may.KEYBOARD_SWITCHED_AFTER_EMOJIFIED);
        }
    }

    @Override // defpackage.hfx
    public final void i() {
        may mayVar;
        if (this.s.getAndSet(false)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onDeactivate", 705, "EmojifyExtensionImpl.java")).w("Deactivating Emojify extension %s.", this);
            this.v = null;
            this.D.h();
            ija ijaVar = this.B;
            if (ijaVar != null) {
                ijaVar.f();
                this.B = null;
            }
            ijl.b().d(this.C, cis.class);
            ijl.b().d(this.E, cjl.class);
            this.A.h();
            hfm hfmVar = this.z;
            if (hfmVar != null) {
                ijl.b().d(hfmVar, hfn.class);
                this.z = null;
            }
            if (this.n == 2) {
                m();
            }
            if (this.n == 2) {
                mayVar = may.EXTENSION_DEACTIVATED_AFTER_EMOJIFIED;
            } else {
                mayVar = may.EXTENSION_DEACTIVATED;
            }
            t(true, true, true, true, mayVar);
            this.d = false;
            this.e = false;
            hiz hizVar = this.x;
            if (hizVar != null) {
                if (!hizVar.isDone()) {
                    this.x.cancel(true);
                }
                this.x = null;
            }
            cnc cncVar = this.u;
            if (cncVar == null) {
                return;
            }
            cncVar.b();
            this.u = null;
        }
    }

    @Override // defpackage.hfx
    public final void j(EditorInfo editorInfo, boolean z) {
        hfy hfyVar;
        hfy hfyVar2;
        if (x(hqp.b(), editorInfo)) {
            if (this.s.get() || (hfyVar2 = this.w) == null) {
                return;
            }
            hfyVar2.ae();
        } else if (!this.s.get() || (hfyVar = this.w) == null) {
        } else {
            hfyVar.y();
        }
    }

    @Override // defpackage.hfx
    public final void k(hfy hfyVar) {
        this.w = hfyVar;
    }

    public final void l(may mayVar) {
        cnc cncVar = this.u;
        if (cncVar == null || !cncVar.d()) {
            return;
        }
        this.b.e(cta.EMOJIFY_ICON_HIDDEN, mayVar);
    }

    public final void m() {
        cmg cmgVar = this.y;
        if (cmgVar != null) {
            idk idkVar = this.b;
            cta ctaVar = cta.EMOJIFY_RESULT_ACCEPTED;
            Object[] objArr = new Object[1];
            nfh t = maz.k.t();
            cmf b = cmf.b(cmgVar.a);
            if (b == null) {
                b = cmf.UNRECOGNIZED;
            }
            int b2 = cte.b(b);
            if (t.c) {
                t.cD();
                t.c = false;
            }
            maz mazVar = (maz) t.b;
            mazVar.d = b2 - 1;
            int i = mazVar.a | 4;
            mazVar.a = i;
            int i2 = cmgVar.c;
            int i3 = i | 8;
            mazVar.a = i3;
            mazVar.e = i2;
            int i4 = this.j;
            int i5 = i3 | 1;
            mazVar.a = i5;
            mazVar.b = i4 - 1;
            int i6 = this.k;
            int i7 = i5 | 16;
            mazVar.a = i7;
            mazVar.f = i6;
            int i8 = i7 | 64;
            mazVar.a = i8;
            mazVar.h = true;
            String str = cmgVar.d;
            str.getClass();
            mazVar.a = i8 | 128;
            mazVar.i = str;
            objArr[0] = t.cz();
            idkVar.e(ctaVar, objArr);
            return;
        }
        idk idkVar2 = this.b;
        cta ctaVar2 = cta.EMOJIFY_REVERTED_TO_ORIGINAL_TEXT;
        Object[] objArr2 = new Object[1];
        nfh t2 = maz.k.t();
        long j = this.j - 1;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        maz mazVar2 = (maz) t2.b;
        int i9 = mazVar2.a | 1;
        mazVar2.a = i9;
        mazVar2.b = j;
        int i10 = this.k;
        int i11 = i9 | 16;
        mazVar2.a = i11;
        mazVar2.f = i10;
        mazVar2.a = i11 | 64;
        mazVar2.h = true;
        objArr2[0] = t2.cz();
        idkVar2.e(ctaVar2, objArr2);
    }

    @Override // defpackage.hfx
    public final boolean n(hqt hqtVar, EditorInfo editorInfo, boolean z, Map map, hfl hflVar) {
        cnc cmvVar;
        if (this.t.get()) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onActivate", 586, "EmojifyExtensionImpl.java")).w("Trying to activate Emojify extension %s while it has already been destroyed.", this);
            return false;
        } else if (!x(hqtVar, editorInfo)) {
            return false;
        } else {
            if (!this.s.getAndSet(true)) {
                ltg ltgVar = a;
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onActivate", 596, "EmojifyExtensionImpl.java")).w("Activating Emojify extension %s.", this);
                this.v = new cna(hqtVar.a());
                if (((Boolean) gqj.d.c()).booleanValue()) {
                    cmvVar = new cmr(new cbq(this, 12));
                } else {
                    cmvVar = new cmv(new cjr(this, 3));
                }
                this.u = cmvVar;
                this.D.f(mjl.a);
                if (this.B == null) {
                    ija c = ijf.c(new cbq(this, 13), new cbq(this, 14), jcj.b);
                    this.B = c;
                    c.e(gyc.b);
                }
                ijl.b().h(this.C, cis.class, gyc.b);
                ijl.b().h(this.E, cjl.class, gyc.b);
                ijl.b().h(this.A, gqp.class, gyc.b);
                if (!((Boolean) gqj.d.c()).booleanValue()) {
                    if (this.z == null) {
                        this.z = new hfm(this);
                    } else {
                        ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/expression/emojify/impl/EmojifyExtensionImpl", "onActivate", 617, "EmojifyExtensionImpl.java")).t("Emojify extension is activated without clean OpenableExtensionListener");
                    }
                    ijl.b().h(this.z, hfn.class, gyc.b);
                }
            }
            return true;
        }
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
    public final void q() {
        if (this.n == 2) {
            g(may.INPUT_FIELD_CLICKED_AFTER_EMOJIFIED);
        }
    }

    public final void r() {
        if (this.l) {
            this.l = false;
            this.c = true;
            u(may.EXPRESSION_MOMENT_CANDIDATE_AVAILABLE);
        }
    }

    public final void s(hpy hpyVar) {
        may mayVar;
        may mayVar2;
        String trim = hpyVar.c.toString().trim();
        if (trim.length() != 0) {
            if (this.n == 2) {
                if (TextUtils.isEmpty(this.g) || this.g.contentEquals(hpyVar.c)) {
                    if (hpyVar.d == hpyVar.c.length()) {
                        return;
                    }
                    if (hpyVar.f()) {
                        g(may.INPUT_TEXT_SELECTED_AFTER_EMOJIFIED);
                        return;
                    } else {
                        g(may.CURSOR_MOVED_AFTER_EMOJIFIED);
                        return;
                    }
                }
                g(may.TYPING_STARTED_AFTER_EMOJIFIED);
                return;
            }
            llp c = cnb.c(trim);
            if (c.isEmpty() || !((String) cmo.t.c()).contains(((bxf) lre.ac(c)).a)) {
                if (!((Boolean) cmo.v.c()).booleanValue() || trim.equals(this.g.trim())) {
                    return;
                }
                if (this.e) {
                    if (this.n == 2) {
                        mayVar = may.VOICE_INPUT_STARTED_AFTER_EMOJIFIED;
                    } else {
                        mayVar = may.VOICE_INPUT_STARTED;
                    }
                    t(true, true, true, true, mayVar);
                    return;
                }
                boolean booleanValue = ((Boolean) cmo.w.c()).booleanValue();
                if (c.isEmpty() || !this.r.a().contains(((bxf) lre.ac(c)).a)) {
                    if (!booleanValue) {
                        return;
                    }
                } else if (!booleanValue || !hpyVar.c.toString().endsWith(" ")) {
                    this.c = true;
                    u(may.EMOJI_AT_END_OF_INPUT_TEXT);
                    return;
                }
                l(may.INPUT_TEXT_NOT_END_WITH_EMOJI);
                return;
            }
            t(true, true, true, true, may.PUNCTUATION_INPUT);
            return;
        }
        if (this.n == 2) {
            m();
        }
        if (this.n == 2) {
            mayVar2 = may.INPUT_TEXT_EMPTY_AFTER_EMOJIFIED;
        } else {
            mayVar2 = may.INPUT_TEXT_EMPTY;
        }
        t(true, true, true, true, mayVar2);
    }

    public final void t(boolean z, boolean z2, boolean z3, boolean z4, may mayVar) {
        this.f = "";
        this.y = null;
        this.h = 0;
        this.i = null;
        this.n = 1;
        cnc cncVar = this.u;
        if (cncVar != null && z4) {
            cncVar.a().a();
        }
        if (z) {
            this.g = "";
        }
        if (z2) {
            this.c = false;
            if (mayVar == null) {
                mayVar = may.UNKNOWN_TRIGGERED_TYPE;
            }
            l(mayVar);
        }
        if (z3) {
            this.k = 0;
        }
    }

    public final void u(may mayVar) {
        cnc cncVar = this.u;
        if (cncVar != null) {
            cncVar.c(new bwt(this, mayVar, 13));
        }
    }

    public final void f() {
        cnc cncVar;
        llp llpVar;
        final cna cnaVar = this.v;
        if (cnaVar == null || (cncVar = this.u) == null) {
            return;
        }
        if (this.n != 2 || (llpVar = this.i) == null) {
            hpy b = hqj.b();
            if (b == null) {
                return;
            }
            final String obj = b.c.toString();
            hiz hizVar = this.x;
            if (hizVar != null && !hizVar.isDone()) {
                this.x.cancel(true);
            }
            hiz p = hiz.p(new Callable() { // from class: cmz
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:344:0x0a71  */
                /* JADX WARN: Removed duplicated region for block: B:346:0x0a78  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x028b  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x02c9  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0a1c  */
                /* JADX WARN: Type inference failed for: r0v70, types: [java.util.List, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v28, types: [java.util.Map, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r14v53, types: [java.util.Map, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v71, types: [java.util.Map, java.lang.Object] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 2685
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cmz.call():java.lang.Object");
                }
            }, gxo.a(1));
            afp afpVar = afp.STARTED;
            boolean z = jam.b;
            llk e = llp.e();
            llk e2 = llp.e();
            llk e3 = llp.e();
            e.h(new dzw(this, obj, cncVar, 1));
            e2.h(bxl.i);
            e3.h(bxl.j);
            p.E(hjg.a(gyc.b, null, afpVar, z, e, e2, e3));
            this.x = p;
            return;
        }
        this.k++;
        int i = this.h;
        if (i < 0 || i >= llpVar.size()) {
            if (this.h != this.i.size()) {
                return;
            }
            String str = this.f;
            this.g = str;
            w(str);
            this.m.k(this.f);
            this.m.h(R.string.f150960_resource_name_obfuscated_res_0x7f1401d6);
            int i2 = this.h;
            if (((Boolean) cmo.j.c()).booleanValue()) {
                this.h = 0;
                this.y = null;
            } else {
                t(false, false, false, false, null);
                this.n = 2;
            }
            idk idkVar = this.b;
            cta ctaVar = cta.EMOJIFY_REVERTED_TO_ORIGINAL_TEXT;
            Object[] objArr = new Object[1];
            nfh t = maz.k.t();
            long j = this.j - 1;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            maz mazVar = (maz) t.b;
            int i3 = 1 | mazVar.a;
            mazVar.a = i3;
            mazVar.b = j;
            int i4 = this.k;
            int i5 = i3 | 16;
            mazVar.a = i5;
            mazVar.f = i4;
            mazVar.a = i5 | 64;
            mazVar.h = false;
            objArr[0] = t.cz();
            idkVar.e(ctaVar, objArr);
            cncVar.a().e(i2, this.j);
            return;
        }
        d(this.i, cncVar);
    }
}
