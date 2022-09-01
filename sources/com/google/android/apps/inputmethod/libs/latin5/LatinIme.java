package com.google.android.apps.inputmethod.libs.latin5;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.inputmethod.latin.R;
import com.google.android.keyboard.client.delight5.LanguageIdentifier;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LatinIme extends AbstractIme implements jbw {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/latin5/LatinIme");
    public static final gzy b = new gzy("LatinIme");
    public static final iov c = new iov();
    public final ita A;
    private final cdb Q;
    private final ewf R;
    private jby S;
    private final mks U;
    private final dnr V;
    private cdv W;
    private EditorInfo X;
    private boolean Y;
    private final boolean aa;
    private doo ac;
    private final doi ad;
    private final dsl ae;
    private final ijk af;
    public final dnz d;
    public final Delight5Facilitator e;
    public final Locale f;
    public final dnp g;
    public final hnn h;
    public final hno i;
    public cbg k;
    public enx l;
    public boolean m;
    public Runnable n;
    boolean o;
    public lmz s;
    public volatile boolean t;
    public boolean u;
    public boolean v;
    public int y;
    private final AtomicBoolean T = new AtomicBoolean(false);
    private mko Z = mkk.a;
    boolean p = false;
    public boolean q = false;
    public boolean r = false;
    private long ab = 0;
    public float w = Float.NaN;
    public float x = Float.NaN;
    long z = 0;
    public final cbf j = dnq.a;
    public final eqv B = new eqv(this.D, this.F, this.E, this.G);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LatinIme(android.content.Context r23, defpackage.iav r24, defpackage.hls r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.LatinIme.<init>(android.content.Context, iav, hls):void");
    }

    public static boolean T(iav iavVar) {
        return iavVar.q.d(R.id.f54960_resource_name_obfuscated_res_0x7f0b01d8, false);
    }

    private static int Z(hfd hfdVar) {
        Integer num = (Integer) hfdVar.b[0].e;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private final cdv aa() {
        if (this.W == null) {
            this.W = cdv.a(this.D);
        }
        return this.W;
    }

    private final jby ab() {
        if (this.S == null) {
            this.S = new fbu(this.D, this.F, this, mjl.a);
        }
        return this.S;
    }

    private static mtv ac(long j) {
        if (icu.h(j) || icu.g(j)) {
            return mtv.SHIFT_LOCKED;
        }
        if (icu.i(j)) {
            return mtv.SHIFT_PRESSED;
        }
        return mtv.SHIFT_NONE;
    }

    private final void ad() {
        if (this.n != null) {
            this.Z.cancel(false);
            this.n = null;
        }
    }

    private final void ae() {
        if (this.n != null) {
            this.Z.cancel(false);
            this.n.run();
            this.n = null;
        }
    }

    private final void af(jbx jbxVar) {
        if (ab().g()) {
            ab().e(jbxVar);
            z(false, 0L);
        }
    }

    private final boolean ag() {
        if (this.k.F()) {
            if (!this.k.C()) {
                return true;
            }
            return ab().g() && ((Boolean) cas.K.c()).booleanValue();
        }
        return false;
    }

    private final boolean ah() {
        if (!this.k.A()) {
            return false;
        }
        cbk.b(new dgd(this, 14));
        return true;
    }

    private static boolean ai(hfd hfdVar) {
        int i = hfdVar.b[0].c;
        if (hfdVar.p == 6) {
            return false;
        }
        return i == 59 || i == 60 || i == 115 || i == -10012 || i == -10013;
    }

    private final boolean aj(hfd hfdVar) {
        int i = hfdVar.b[0].c;
        if (i == -10050 || i == -10051 || i == -10052 || i == -10063) {
            return false;
        }
        return this.m;
    }

    private final void ak(int i) {
        al(i, null, jbv.a);
    }

    private final void al(int i, bnq bnqVar, jbv jbvVar) {
        mrw mrwVar;
        nfh t = muf.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        muf mufVar = (muf) t.b;
        mufVar.b = i - 1;
        int i2 = mufVar.a | 1;
        mufVar.a = i2;
        boolean z = jbvVar.b;
        int i3 = i2 | 4;
        mufVar.a = i3;
        mufVar.d = z;
        boolean z2 = jbvVar.c;
        mufVar.a = i3 | 8;
        mufVar.e = z2;
        if (bnqVar != null) {
            nem n = bnqVar.n();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            muf mufVar2 = (muf) t.b;
            mufVar2.a |= 2;
            mufVar2.c = n;
        }
        caj g = g();
        long d = d();
        muf mufVar3 = (muf) t.cz();
        cbg cbgVar = g.i;
        if (cbgVar == null) {
            return;
        }
        if (!cbgVar.F()) {
            ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "processVoiceTranscription", 1533, "Delight5DecoderWrapper.java")).t("processVoiceTranscription(): Decoder state is invalid");
            return;
        }
        msg f = caj.f(d, cbgVar, g.f.b());
        int i4 = f.c;
        int i5 = mufVar3.b;
        nfh t2 = mug.e.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mug mugVar = (mug) t2.b;
        mufVar3.getClass();
        mugVar.b = mufVar3;
        int i6 = mugVar.a | 1;
        mugVar.a = i6;
        f.getClass();
        mugVar.c = f;
        mugVar.a = i6 | 2;
        cbz cbzVar = g.e;
        long o = cbzVar.d.o();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mug mugVar2 = (mug) t2.b;
        mugVar2.a |= 4;
        mugVar2.d = o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cbzVar.d(mti.ON_VOICE_TRANSCRIPTION);
        muh onVoiceTranscription = cbzVar.a.onVoiceTranscription((mug) t2.cz());
        cbzVar.e(mti.ON_VOICE_TRANSCRIPTION);
        cbzVar.b.g(caq.DELIGHT_PROCESS_VOICE_TRANSCRIPTION, SystemClock.elapsedRealtime() - elapsedRealtime);
        msg msgVar = ((mug) t2.b).c;
        if (msgVar == null) {
            msgVar = msg.l;
        }
        cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((mug) t2.b).d), Long.valueOf(msgVar.d));
        nfh nfhVar = (nfh) onVoiceTranscription.N(5);
        nfhVar.cG(onVoiceTranscription);
        if (g.t(((muh) nfhVar.b).d, "processVoiceTranscription")) {
            return;
        }
        if ((((muh) nfhVar.b).a & 1) == 0) {
            msh mshVar = msh.c;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            muh muhVar = (muh) nfhVar.b;
            mshVar.getClass();
            muhVar.b = mshVar;
            muhVar.a |= 1;
        }
        lvw.e(new cae(nfhVar, 8));
        muh muhVar2 = (muh) nfhVar.b;
        if ((2 & muhVar2.a) != 0) {
            mrwVar = muhVar2.c;
            if (mrwVar == null) {
                mrwVar = mrw.h;
            }
        } else {
            mrwVar = null;
        }
        mrw mrwVar2 = mrwVar;
        msf msfVar = msf.OPERATION_PROCESS_VOICE_TRANSCRIPTION;
        msh mshVar2 = ((muh) nfhVar.b).b;
        if (mshVar2 == null) {
            mshVar2 = msh.c;
        }
        cbgVar.i(mrwVar2, msfVar, mshVar2, false, d, 0L, (ifn) g.p.get());
    }

    public static llp n(Locale locale, lmz lmzVar) {
        llk e = llp.e();
        if (lmzVar.isEmpty()) {
            e.h(locale);
        } else {
            e.h(locale);
            lsz it = lmzVar.iterator();
            while (it.hasNext()) {
                e.h(((jav) it.next()).q());
            }
        }
        return e.g();
    }

    public final void A() {
        this.E.hZ(null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x05f9, code lost:
        if (r1.booleanValue() != false) goto L280;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x084d A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09d1  */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, hls] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    @Override // defpackage.hlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(defpackage.hfd r37) {
        /*
            Method dump skipped, instructions count: 2592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.LatinIme.B(hfd):boolean");
    }

    public final void D(ido idoVar, Object... objArr) {
        if (!V().h(idoVar)) {
            return;
        }
        V().e(idoVar, objArr);
    }

    public final void E(int i) {
        Y(new iay(i, null, null));
    }

    public final void H() {
        if (!this.p) {
            this.p = true;
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final boolean I() {
        if (this.m) {
            return false;
        }
        return this.k.F();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean J(EditorInfo editorInfo) {
        return ham.Z(editorInfo, ((Boolean) doa.df.c()).booleanValue());
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean L(EditorInfo editorInfo) {
        if (!this.G.ak("pref_key_use_personalized_dicts")) {
            return false;
        }
        return super.L(editorInfo);
    }

    public final boolean M() {
        return ham.am(this.X) && this.G.aj(R.string.f160910_resource_name_obfuscated_res_0x7f14067b);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean N(EditorInfo editorInfo) {
        return ham.au(editorInfo, this.G, T(this.F));
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean O(boolean z) {
        return z && ((Boolean) doa.cF.c()).booleanValue();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean P(boolean z) {
        return z && ((Boolean) doa.cE.c()).booleanValue();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean Q(boolean z) {
        return z && ((Boolean) doa.cD.c()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0235, code lost:
        if ((r0.a & 4) == 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0267, code lost:
        if (r0.b == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean R(defpackage.hfd r27) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.LatinIme.R(hfd):boolean");
    }

    public final boolean S() {
        return !this.s.isEmpty();
    }

    public final boolean U() {
        return this.J || this.O || M();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r9, long r11) {
        /*
            r8 = this;
            boolean r0 = r8.m
            if (r0 == 0) goto L8
            super.a(r9, r11)
            return
        L8:
            super.a(r9, r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.T
            boolean r0 = r0.get()
            if (r0 != 0) goto L14
            return
        L14:
            r8.ae()
            mtv r0 = ac(r11)
            mtv r9 = ac(r9)
            cbg r10 = r8.k
            mtv r10 = r10.f()
            long r1 = r8.z
            r3 = 8
            r5 = 0
            if (r0 == r10) goto L2e
            goto L3b
        L2e:
            long r1 = r1 & r3
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L3a
            if (r0 != r9) goto L3a
            mtv r1 = defpackage.mtv.SHIFT_LOCKED
            if (r9 != r1) goto L3a
            goto L3b
        L3a:
            r3 = r5
        L3b:
            boolean r1 = defpackage.icu.g(r11)
            if (r1 == 0) goto L45
            r1 = 5
        L43:
            long r3 = r3 | r1
            goto L58
        L45:
            boolean r1 = defpackage.icu.h(r11)
            if (r1 == 0) goto L4e
            r1 = 3
            goto L43
        L4e:
            boolean r1 = defpackage.icu.i(r11)
            if (r1 == 0) goto L58
            r1 = 1
            long r1 = r1 | r3
            goto L59
        L58:
            r1 = r3
        L59:
            r8.z = r1
            if (r0 == r9) goto L7a
            if (r0 == r10) goto L7a
            int r9 = r9.d
            int r9 = r0.d
            cbg r9 = r8.k
            r9.r(r0)
            boolean r9 = defpackage.icu.g(r11)
            if (r9 != 0) goto L7a
            boolean r9 = r8.p
            if (r9 != 0) goto L76
            boolean r9 = r8.o
            if (r9 == 0) goto L7a
        L76:
            r9 = 0
            r8.z(r9, r5)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.latin5.LatinIme.a(long, long):void");
    }

    @Override // defpackage.jbw
    public final jbu b() {
        boolean z = false;
        if (I() && (gg() & 4096) != 0) {
            z = true;
        }
        lmx g = lmz.g();
        g.d(-10133);
        g.d(-10134);
        g.d(-10136);
        g.d(-10135);
        if (((Boolean) hnb.a.c()).booleanValue() && this.A.d()) {
            g.d(-10137);
        }
        jsy a2 = jbu.a();
        a2.g(z);
        a2.h(g.g());
        return a2.f();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        aa().close();
        this.Q.close();
        g().close();
        ab().b();
    }

    public final long d() {
        return this.j.a();
    }

    public final caj g() {
        return this.e.h;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gS(hln hlnVar) {
        mrw mrwVar;
        msh mshVar;
        if (this.m) {
            return;
        }
        if (hlnVar.a == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/latin5/LatinIme", "deleteCandidate", 1682, "LatinIme.java")).t("Deleting suggestion candidate with a null text.");
            return;
        }
        caj g = g();
        long d = d();
        idu b2 = V().b();
        cbg cbgVar = g.i;
        if (cbgVar != null) {
            if (!cbgVar.F()) {
                ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "forgetTextCandidate", 1749, "Delight5DecoderWrapper.java")).t("forgetTextCandidate(): Decoder state is invalid");
            } else {
                nfh t = mtz.f.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtz mtzVar = (mtz) t.b;
                mtzVar.b = 2;
                mtzVar.a |= 1;
                Object obj = hlnVar.j;
                if (obj instanceof cci) {
                    int a2 = ((cci) obj).a();
                    if (t.c) {
                        t.cD();
                        t.c = false;
                    }
                    mtz mtzVar2 = (mtz) t.b;
                    mtzVar2.a |= 2;
                    mtzVar2.c = a2;
                }
                msg f = caj.f(d, cbgVar, b2);
                int i = f.c;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtz mtzVar3 = (mtz) t.b;
                f.getClass();
                mtzVar3.d = f;
                mtzVar3.a |= 4;
                cbz cbzVar = g.e;
                long o = cbzVar.d.o();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtz mtzVar4 = (mtz) t.b;
                mtzVar4.a |= 8;
                mtzVar4.e = o;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cbzVar.d(mti.ON_SUGGESTION_PRESS);
                mua onSuggestionPress = cbzVar.a.onSuggestionPress((mtz) t.cz());
                cbzVar.e(mti.ON_SUGGESTION_PRESS);
                cbzVar.b.g(caq.DELIGHT_FORGET_TEXT_CANDIDATE, SystemClock.elapsedRealtime() - elapsedRealtime);
                msg msgVar = ((mtz) t.b).d;
                if (msgVar == null) {
                    msgVar = msg.l;
                }
                cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((mtz) t.b).e), Long.valueOf(msgVar.d));
                if (!g.t(onSuggestionPress.d, "forgetTextCandidate")) {
                    lvw.e(new cae(onSuggestionPress, 6));
                    if ((onSuggestionPress.a & 2) != 0) {
                        mrw mrwVar2 = onSuggestionPress.c;
                        if (mrwVar2 == null) {
                            mrwVar2 = mrw.h;
                        }
                        mrwVar = mrwVar2;
                    } else {
                        mrwVar = null;
                    }
                    msf msfVar = msf.OPERATION_FORGET_TEXT_CANDIDATE;
                    if ((onSuggestionPress.a & 1) != 0) {
                        msh mshVar2 = onSuggestionPress.b;
                        if (mshVar2 == null) {
                            mshVar2 = msh.c;
                        }
                        mshVar = mshVar2;
                    } else {
                        mshVar = null;
                    }
                    cbgVar.i(mrwVar, msfVar, mshVar, false, d, 0L, (ifn) g.p.get());
                    end b3 = ene.b();
                    if (b3 != null) {
                        b3.e(hlnVar.a.toString(), end.a);
                    }
                }
            }
        }
        z(false, 0L);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gT(CompletionInfo[] completionInfoArr) {
        dnz dnzVar = this.d;
        if (dnzVar.d) {
            dnzVar.i(completionInfoArr);
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gU(hln hlnVar, int i) {
        if (!this.m && this.k.F()) {
            g().m(d(), hlnVar, true, i);
            H();
            z(false, 0L);
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gV(hln hlnVar, boolean z) {
        if (!this.m && z) {
            g().l(d(), hlnVar);
            H();
            z(false, 0L);
        }
    }

    @Override // defpackage.hlp
    public final void gX() {
        if (this.m) {
            return;
        }
        msv x = x();
        ewf ewfVar = this.R;
        caj g = g();
        Objects.requireNonNull(g);
        boh bohVar = new boh(g, 20);
        ewb ewbVar = (ewb) ewfVar;
        if (ewbVar.c.d()) {
            ewbVar.b(5, (mud) bohVar.a());
        }
        cdv aa = aa();
        if (aa.h.get()) {
            if (aa.d() && cbt.f(x)) {
                kcu.U(aa.k.hQ(new cdu(aa, x)), new cbx(2), aa.k);
            }
        } else {
            hkx.b("LangIdWrapper");
        }
        caj g2 = g();
        long d = d();
        cbg cbgVar = g2.i;
        if (cbgVar == null) {
            return;
        }
        if (!cbgVar.F()) {
            ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "abortComposing", 1998, "Delight5DecoderWrapper.java")).t("abortComposing(): Decoder state is invalid");
            return;
        }
        gjz gjzVar = g2.s;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nfh t = mrp.d.t();
        msg f = caj.f(d, cbgVar, g2.f.b());
        int i = f.c;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrp mrpVar = (mrp) t.b;
        f.getClass();
        mrpVar.b = f;
        mrpVar.a |= 1;
        cbz cbzVar = g2.e;
        long o = cbzVar.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrp mrpVar2 = (mrp) t.b;
        mrpVar2.a |= 2;
        mrpVar2.c = o;
        cbzVar.d(mti.ABORT_COMPOSING);
        mrq abortComposing = cbzVar.a.abortComposing((mrp) t.cz());
        cbzVar.e(mti.ABORT_COMPOSING);
        msg msgVar = ((mrp) t.b).b;
        if (msgVar == null) {
            msgVar = msg.l;
        }
        cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((mrp) t.b).c), Long.valueOf(msgVar.d));
        if ((abortComposing.a & 1) != 0) {
            lvw.e(new cae(abortComposing, 5));
            cbgVar.o(d, abortComposing);
        }
        gjz gjzVar2 = g2.s;
        g2.f.g(caq.DELIGHT_ABORT_COMPOSING, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gY(hln hlnVar, boolean z) {
        dnz dnzVar = this.d;
        if (hlnVar != null && hlnVar.e == hlm.APP_COMPLETION) {
            if (!z) {
                dnzVar.h = hlnVar;
                return;
            }
            dnzVar.g(hlnVar);
            dnzVar.h = null;
        } else if (this.m || !z || !this.k.F()) {
        } else {
            if (hlnVar.e == hlm.RESTORABLE_TEXT) {
                cbk.b(new dod(this, hlnVar, 2));
            } else if (hlnVar.e == hlm.AUTO_SUBMIT) {
                this.E.hX(536870911, 536870911, (CharSequence) hlnVar.j, false);
                this.E.R(ham.j(ham.a(this.X)));
            } else {
                g().l(d(), hlnVar);
            }
            H();
            z(false, 0L);
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    protected final boolean gZ(EditorInfo editorInfo) {
        int e;
        if (!this.F.q.d(R.id.f54760_resource_name_obfuscated_res_0x7f0b01c4, true)) {
            return false;
        }
        if (T(this.F) && !S()) {
            return ham.E(editorInfo) && (e = ham.e(editorInfo)) != 128 && e != 224 && e != 144 && !ham.R(editorInfo) && !ham.F(editorInfo) && !ham.W(editorInfo);
        } else if (!this.G.ak("pref_key_auto_correction") || ham.ad(editorInfo)) {
            return false;
        } else {
            if (han.AGSA.a(editorInfo) && ((Boolean) doa.bL.c()).booleanValue()) {
                return true;
            }
            return ham.am(editorInfo);
        }
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final int gg() {
        mtv f = this.k.f();
        int i = f.d;
        if (f == mtv.SHIFT_LOCKED) {
            return 4096;
        }
        return f == mtv.SHIFT_PRESSED ? 8192 : 0;
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
        mwj b2 = hfdVar != null ? ccn.b(hfdVar, this.u, this.z, this.w, this.x, this.y, this.v, false) : null;
        caj g = g();
        long d = d();
        cbg cbgVar = g.i;
        if (cbgVar == null) {
            return;
        }
        if (!cbgVar.F()) {
            ((luc) ((luc) caj.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/Delight5DecoderWrapper", "finishComposing", 2033, "Delight5DecoderWrapper.java")).t("finishComposing(): Decoder state is invalid");
            return;
        }
        gjz gjzVar = g.s;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        nfh t = msk.e.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msk mskVar = (msk) t.b;
        mskVar.a |= 1;
        mskVar.b = d;
        if (b2 != null) {
            nfh t2 = mwi.d.t();
            t2.dW(b2);
            mwi mwiVar = (mwi) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            msk mskVar2 = (msk) t.b;
            mwiVar.getClass();
            mskVar2.d = mwiVar;
            mskVar2.a |= 4;
        }
        cbz cbzVar = g.e;
        long o = cbzVar.d.o();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msk mskVar3 = (msk) t.b;
        mskVar3.a |= 2;
        mskVar3.c = o;
        cbzVar.d(mti.FINISH_COMPOSING);
        cbzVar.a.finishComposing((msk) t.cz());
        cbzVar.e(mti.FINISH_COMPOSING);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS_WITH_CLIENT_REQUEST_ID, Long.valueOf(((msk) t.b).c), Long.valueOf(((msk) t.b).b));
        gjz gjzVar2 = g.s;
        g.f.g(caq.DELIGHT_FINISH_COMPOSING, SystemClock.elapsedRealtime() - elapsedRealtime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void i(final EditorInfo editorInfo, boolean z) {
        int i;
        ?? r15;
        mko hP;
        String az;
        long uptimeMillis = SystemClock.uptimeMillis();
        super.i(editorInfo, z);
        lmz W = this.E.W();
        this.s = W;
        final llp n = n(this.f, W);
        if (!z && irs.d()) {
            V().c(iwd.a);
            V().e(iwc.IME_ACTIVATE_METADATA, this.f, irp.b(), n);
        }
        if (!this.r) {
            Delight5Facilitator delight5Facilitator = this.e;
            cbg cbgVar = this.k;
            String str = this.F.f.c;
            boolean booleanValue = ((Boolean) doa.df.c()).booleanValue();
            String m = ham.m(editorInfo);
            if (!ham.B(editorInfo) ? !(!han.YOUTUBE.a(editorInfo) || ham.af(editorInfo, booleanValue)) : !ham.C(editorInfo)) {
                m = "";
            }
            r15 = 0;
            r15 = 0;
            r15 = 0;
            i = 1;
            i = 1;
            i = 1;
            this.r = delight5Facilitator.F(cbgVar, n, str, m, this.C, true, this.B.b(n));
            if (han.YOUTUBE.a(editorInfo) && (az = ham.az("com.google.android.youtube.searchbox", editorInfo)) != null) {
                V().e(hxx.DECODER_INITIALIZED_IN_YOUTUBE_SEARCH, az);
            }
        } else {
            i = 1;
            r15 = 0;
        }
        dnp dnpVar = this.g;
        dnpVar.f = ham.z(dnpVar.g, editorInfo);
        Delight5Facilitator delight5Facilitator2 = this.e;
        delight5Facilitator2.n.set(i);
        caj cajVar = delight5Facilitator2.h;
        cbz cbzVar = cajVar.e;
        nfh t = mrr.d.t();
        long a2 = cajVar.f.b().a(iwd.a);
        if (t.c) {
            t.cD();
            t.c = r15;
        }
        mrr mrrVar = (mrr) t.b;
        mrrVar.a |= 2;
        mrrVar.c = a2;
        mrr mrrVar2 = (mrr) t.cz();
        nfh nfhVar = (nfh) mrrVar2.N(5);
        nfhVar.cG(mrrVar2);
        long o = cbzVar.d.o();
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = r15;
        }
        mrr mrrVar3 = (mrr) nfhVar.b;
        mrrVar3.a |= i;
        mrrVar3.b = o;
        mrr mrrVar4 = (mrr) nfhVar.cz();
        cbzVar.d(mti.BEGIN_SESSION);
        cbzVar.a.beginSession(mrrVar4);
        cbzVar.e(mti.BEGIN_SESSION);
        idk idkVar = cbzVar.b;
        cap capVar = cap.LOG_NATIVE_METRICS;
        Object[] objArr = new Object[i];
        Long valueOf = Long.valueOf(mrrVar4.b);
        char c2 = r15 == true ? 1 : 0;
        char c3 = r15 == true ? 1 : 0;
        char c4 = r15 == true ? 1 : 0;
        char c5 = r15 == true ? 1 : 0;
        objArr[c2] = valueOf;
        idkVar.e(capVar, objArr);
        ab().a(editorInfo, z);
        this.X = editorInfo;
        this.Y = han.AGSA.a(editorInfo) && ((Boolean) doa.cC.c()).booleanValue();
        this.m = ham.ag(this.D, editorInfo);
        this.p = r15;
        this.q = r15;
        hqk a3 = hqk.a((hqk) cbk.a(new Callable() { // from class: doe
            /* JADX WARN: Removed duplicated region for block: B:173:0x05ee  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x0618  */
            /* JADX WARN: Removed duplicated region for block: B:200:0x06c7  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x06e6  */
            /* JADX WARN: Removed duplicated region for block: B:209:0x0714  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x0734  */
            /* JADX WARN: Removed duplicated region for block: B:215:0x0754  */
            /* JADX WARN: Removed duplicated region for block: B:218:0x0776  */
            /* JADX WARN: Removed duplicated region for block: B:221:0x078b  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x07d2  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x07fa  */
            /* JADX WARN: Removed duplicated region for block: B:237:0x081a  */
            /* JADX WARN: Removed duplicated region for block: B:240:0x083b  */
            /* JADX WARN: Removed duplicated region for block: B:243:0x0850  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x089e  */
            /* JADX WARN: Removed duplicated region for block: B:249:0x08b5  */
            /* JADX WARN: Removed duplicated region for block: B:252:0x08cc  */
            /* JADX WARN: Removed duplicated region for block: B:255:0x08e3  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x07b5  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x06fc  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 2325
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.doe.call():java.lang.Object");
            }
        }));
        if (!TextUtils.isEmpty(a3.b()) || ((TextUtils.isEmpty(a3.d()) && TextUtils.isEmpty(a3.c())) || uptimeMillis - this.ab > ((Long) doa.dn.c()).longValue())) {
            this.k.k();
        }
        if (this.aa) {
            kcu.U(this.e.b.hQ(new bof(this, 16)), new buo(this, 16), this.e.b);
        }
        Context applicationContext = this.D.getApplicationContext();
        if (N(editorInfo) && kez.t(applicationContext)) {
            enx enxVar = new enx(applicationContext, this.E);
            this.l = enxVar;
            enxVar.c();
        }
        enx enxVar2 = this.l;
        if ((enxVar2 == null || !enxVar2.h) && this.o && !ham.aw(this.D, editorInfo) && !ham.av(this.D, editorInfo)) {
            z(r15, 0L);
        }
        if (!((Boolean) cas.a.c()).booleanValue() || !this.J) {
            aa().h.set(r15);
        } else {
            cdv aa = aa();
            Locale locale = this.f;
            hls hlsVar = this.E;
            aa.m = locale;
            if (!aa.g.get() || aa.i.containsKey(aa.m.toString())) {
                if (aa.d.compareAndSet(r15, i)) {
                    aa.j = new LanguageIdentifier(aa.b);
                    aa.k = gxo.a(5);
                    aa.l = ieh.j();
                    aa.s = gvs.a;
                    aa.n = hrx.y(aa.b);
                    aa.r = new gck(aa.b);
                    aa.o = cdr.d(aa.b);
                    aa.p = new cdm(aa.b, aa.l, aa.n, hlsVar);
                }
                aa.h.set(i);
                if (aa.f.get()) {
                    hP = kcu.K(Boolean.valueOf((boolean) i));
                } else {
                    hP = aa.k.hP(new cdt(aa));
                }
                hP.d(new cbq(aa, 3), aa.k);
            } else {
                aa.h.set(r15);
            }
        }
        ewf ewfVar = this.R;
        final jav d = jav.d(this.f);
        ewb ewbVar = (ewb) ewfVar;
        ewbVar.c.c(d, editorInfo, z);
        kcu.U(ewbVar.d.hQ(new evl(ewbVar, 4)), new cbx(6), mjl.a);
        if (ewbVar.c.d()) {
            ewbVar.b.d();
            ewbVar.b.c(201, nni.GBOARD_KEYBOARD_SESSION, new lfr() { // from class: evz
                @Override // defpackage.lfr
                public final void a(Object obj) {
                    jav javVar = jav.this;
                    EditorInfo editorInfo2 = editorInfo;
                    gil gilVar = (gil) obj;
                    nfh t2 = nnp.g.t();
                    String str2 = javVar.n;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    nnp nnpVar = (nnp) t2.b;
                    str2.getClass();
                    nnpVar.a |= 16;
                    nnpVar.f = str2;
                    int i2 = editorInfo2.inputType;
                    if (t2.c) {
                        t2.cD();
                        t2.c = false;
                    }
                    nnp nnpVar2 = (nnp) t2.b;
                    nnpVar2.a |= 1;
                    nnpVar2.b = i2;
                    if (!TextUtils.isEmpty(editorInfo2.fieldName)) {
                        String str3 = editorInfo2.fieldName;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        nnp nnpVar3 = (nnp) t2.b;
                        str3.getClass();
                        nnpVar3.a |= 2;
                        nnpVar3.c = str3;
                    }
                    if (!TextUtils.isEmpty(editorInfo2.packageName)) {
                        String str4 = editorInfo2.packageName;
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        nnp nnpVar4 = (nnp) t2.b;
                        str4.getClass();
                        nnpVar4.a |= 8;
                        nnpVar4.e = str4;
                    }
                    if (!TextUtils.isEmpty(editorInfo2.hintText)) {
                        String obj2 = editorInfo2.hintText.toString();
                        if (t2.c) {
                            t2.cD();
                            t2.c = false;
                        }
                        nnp nnpVar5 = (nnp) t2.b;
                        obj2.getClass();
                        nnpVar5.a |= 4;
                        nnpVar5.d = obj2;
                    }
                    gilVar.a((nnp) t2.cz());
                }
            });
        }
        this.d.a(editorInfo);
        this.ac = new doo();
        V().g(dny.IME_ON_ACTIVATE, SystemClock.uptimeMillis() - uptimeMillis);
        idk V = V();
        hxx hxxVar = hxx.RUNTIME_PARAMETERS_IME_ONACTIVATE;
        Object[] objArr2 = new Object[i];
        objArr2[r15] = hxy.b();
        V.e(hxxVar, objArr2);
        List p = this.e.p();
        idk V2 = V();
        hxx hxxVar2 = hxx.MAIN_LANGUAGE_MODELS_IME_ONACTIVATE;
        Object[] objArr3 = new Object[i];
        objArr3[r15] = p;
        V2.e(hxxVar2, objArr3);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        this.ab = SystemClock.uptimeMillis();
        enx enxVar = this.l;
        if (enxVar != null) {
            enxVar.d();
            this.l = null;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        V().e(iwc.LOADED_MAIN_LMS, this.e.o());
        x();
        ewf ewfVar = this.R;
        caj g = g();
        Objects.requireNonNull(g);
        boh bohVar = new boh(g, 20);
        ewb ewbVar = (ewb) ewfVar;
        if (ewbVar.c.d()) {
            ewbVar.b(4, (mud) bohVar.a());
        }
        E(-20002);
        ad();
        ab().c();
        Delight5Facilitator delight5Facilitator = this.e;
        delight5Facilitator.n.set(false);
        caj cajVar = delight5Facilitator.h;
        cbz cbzVar = cajVar.e;
        nfh t = msm.c.t();
        long a2 = cajVar.f.b().a(iwd.a);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        msm msmVar = (msm) t.b;
        msmVar.a |= 2;
        msmVar.b = a2;
        cbzVar.d(mti.FINISH_SESSION);
        mvd finishSession = cbzVar.a.finishSession((msm) t.cz());
        cbzVar.e(mti.FINISH_SESSION);
        cbzVar.b.e(cap.LOG_NATIVE_METRICS_ARRAY, finishSession);
        this.r = false;
        if (!this.I && irs.d()) {
            V().e(iwc.PRE_TRAINING_CACHE_SESSION_END, new Object[0]);
            V().d(iwd.a);
        }
        super.j();
        this.d.d();
    }

    public final hqk k(final boolean z, final boolean z2, int i) {
        int indexOf;
        final hqk hT = this.E.hT(((Long) cas.A.c()).intValue(), ((Long) cas.A.c()).intValue(), 0);
        CharSequence c2 = hT.c();
        if (((Boolean) doa.ew.c()).booleanValue() && !TextUtils.isEmpty(c2) && (indexOf = TextUtils.indexOf(c2, '\n')) != -1) {
            CharSequence charSequence = hT.b;
            hT = new hqk(charSequence.subSequence(0, (charSequence.length() + indexOf) - c2.length()), hT.c, hT.d, hT.e, hT.f);
        }
        cbk.b(new Runnable() { // from class: doh
            @Override // java.lang.Runnable
            public final void run() {
                LatinIme latinIme = LatinIme.this;
                boolean z3 = z2;
                hqk hqkVar = hT;
                boolean z4 = z;
                latinIme.k.s(latinIme.J);
                latinIme.k.t(latinIme.K, latinIme.L, latinIme.M);
                cbg cbgVar = latinIme.k;
                long d = latinIme.d();
                enx enxVar = latinIme.l;
                cbgVar.m(d, z3, hqkVar, enxVar == null || !enxVar.h);
                boolean F = latinIme.k.F();
                LatinIme.b.c("resetInputContext(), isInputSessionDecodable=%s, hasLargeSelection=%s", Boolean.valueOf(F), Boolean.valueOf(latinIme.k.A()));
                latinIme.E((F || latinIme.k.A()) ? -20001 : -20002);
                if (z4) {
                    latinIme.x();
                }
            }
        });
        D(hxx.INPUT_CONTEXT_RESET, Integer.valueOf(i));
        return hT;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void l(ibz ibzVar, boolean z) {
        List g;
        boolean z2 = false;
        if (this.m) {
            if (ibzVar != ibz.a && ibzVar != ibz.c) {
                return;
            }
            iay iayVar = new iay(-10065, null, Collections.emptyList());
            hls hlsVar = this.E;
            hfd d = hfd.d(iayVar);
            d.g = 0;
            hlsVar.O(d);
            return;
        }
        this.u = false;
        this.v = false;
        this.E.O(hfd.d(new iay(-10121, null, this.ad)));
        AtomicBoolean atomicBoolean = this.T;
        if (ibzVar == ibz.a) {
            z2 = true;
        }
        atomicBoolean.set(z2);
        af(jbx.KEYBOARD_CHANGE);
        if (this.k.F() || this.k.A()) {
            E(-20001);
        }
        if (ibzVar == ibz.a || ibzVar == ibz.c) {
            Y(new iay(-10065, null, this.e.n()));
        }
        ab().d(ibzVar);
        if (ibzVar == ibz.a && (g = this.k.g()) != null && !g.isEmpty()) {
            Y(new iay(-10067, null, g));
        }
        if (ibzVar != ibz.a && ibzVar != ibz.c && ibzVar != ibz.g) {
            return;
        }
        dnz dnzVar = this.d;
        if (dnzVar.g) {
            dnzVar.k(new hlh(dnzVar.i, dnzVar.k, dnzVar.o, dnzVar.n, dnzVar.m, dnzVar.f()));
        } else {
            cbk.b(new dgd(this, 15));
        }
    }

    @Override // defpackage.jbw
    public final void m() {
        z(false, 0L);
    }

    public final mrf o() {
        nfh t = mrf.ah.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar = (mrf) t.b;
        mrfVar.a |= 4;
        mrfVar.e = true;
        long longValue = ((Long) doa.K.c()).longValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar2 = (mrf) t.b;
        mrfVar2.a |= 1;
        mrfVar2.c = longValue;
        float floatValue = ((Double) doa.aS.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar3 = (mrf) t.b;
        mrfVar3.a |= 2;
        mrfVar3.d = floatValue;
        float floatValue2 = ((Double) doa.aT.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar4 = (mrf) t.b;
        mrfVar4.a |= 32;
        mrfVar4.h = floatValue2;
        float floatValue3 = ((Double) doa.aU.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar5 = (mrf) t.b;
        mrfVar5.a |= 64;
        mrfVar5.i = floatValue3;
        boolean booleanValue = ((Boolean) doa.bM.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar6 = (mrf) t.b;
        mrfVar6.a |= 512;
        mrfVar6.l = booleanValue;
        float floatValue4 = ((Double) doa.aV.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar7 = (mrf) t.b;
        mrfVar7.a |= 1024;
        mrfVar7.m = floatValue4;
        float floatValue5 = ((Double) doa.aW.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar8 = (mrf) t.b;
        mrfVar8.a |= 128;
        mrfVar8.j = floatValue5;
        float floatValue6 = ((Double) doa.cX.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar9 = (mrf) t.b;
        mrfVar9.a |= 256;
        mrfVar9.k = floatValue6;
        float longValue2 = (float) ((Long) doa.L.c()).longValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar10 = (mrf) t.b;
        mrfVar10.a |= 8;
        mrfVar10.f = longValue2;
        float longValue3 = (float) ((Long) doa.M.c()).longValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar11 = (mrf) t.b;
        mrfVar11.a |= 32768;
        mrfVar11.r = longValue3;
        boolean booleanValue2 = ((Boolean) doa.N.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar12 = (mrf) t.b;
        mrfVar12.a |= 131072;
        mrfVar12.t = booleanValue2;
        boolean booleanValue3 = ((Boolean) doa.O.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar13 = (mrf) t.b;
        mrfVar13.a |= 65536;
        mrfVar13.s = booleanValue3;
        boolean booleanValue4 = ((Boolean) doa.P.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar14 = (mrf) t.b;
        mrfVar14.a |= 262144;
        mrfVar14.u = booleanValue4;
        float floatValue7 = ((Double) doa.R.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar15 = (mrf) t.b;
        mrfVar15.a |= 2097152;
        mrfVar15.x = floatValue7;
        float floatValue8 = ((Double) doa.S.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar16 = (mrf) t.b;
        mrfVar16.a |= 1048576;
        mrfVar16.w = floatValue8;
        float floatValue9 = ((Double) doa.T.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar17 = (mrf) t.b;
        mrfVar17.a |= 4194304;
        mrfVar17.y = floatValue9;
        boolean booleanValue5 = ((Boolean) doa.bN.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar18 = (mrf) t.b;
        mrfVar18.a |= 16;
        mrfVar18.g = booleanValue5;
        float floatValue10 = ((Double) doa.aX.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar19 = (mrf) t.b;
        mrfVar19.a |= 2048;
        mrfVar19.n = floatValue10;
        float floatValue11 = ((Double) doa.aY.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar20 = (mrf) t.b;
        mrfVar20.a |= 4096;
        mrfVar20.o = floatValue11;
        float floatValue12 = ((Double) doa.aZ.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar21 = (mrf) t.b;
        mrfVar21.a |= 8192;
        mrfVar21.p = floatValue12;
        float floatValue13 = ((Double) doa.ba.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar22 = (mrf) t.b;
        int i = mrfVar22.a | 524288;
        mrfVar22.a = i;
        mrfVar22.v = floatValue13;
        mrfVar22.a = i | 16384;
        mrfVar22.q = false;
        boolean booleanValue6 = ((Boolean) doa.bO.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar23 = (mrf) t.b;
        mrfVar23.a |= 16777216;
        mrfVar23.z = booleanValue6;
        nfh t2 = mrh.l.t();
        float floatValue14 = ((Double) doa.bc.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar = (mrh) t2.b;
        mrhVar.a |= 1;
        mrhVar.b = floatValue14;
        float floatValue15 = ((Double) doa.bd.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar2 = (mrh) t2.b;
        mrhVar2.a |= 2;
        mrhVar2.c = floatValue15;
        float floatValue16 = ((Double) doa.be.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar3 = (mrh) t2.b;
        mrhVar3.a |= 4;
        mrhVar3.d = floatValue16;
        float floatValue17 = ((Double) doa.bf.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar4 = (mrh) t2.b;
        mrhVar4.a |= 8;
        mrhVar4.e = floatValue17;
        float floatValue18 = ((Double) doa.bg.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar5 = (mrh) t2.b;
        mrhVar5.a |= 16;
        mrhVar5.f = floatValue18;
        float floatValue19 = ((Double) doa.bh.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar6 = (mrh) t2.b;
        mrhVar6.a |= 32;
        mrhVar6.g = floatValue19;
        float floatValue20 = ((Double) doa.bi.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar7 = (mrh) t2.b;
        mrhVar7.a |= 64;
        mrhVar7.h = floatValue20;
        float floatValue21 = ((Double) doa.bj.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar8 = (mrh) t2.b;
        mrhVar8.a |= 128;
        mrhVar8.i = floatValue21;
        float floatValue22 = ((Double) doa.bk.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar9 = (mrh) t2.b;
        mrhVar9.a |= 256;
        mrhVar9.j = floatValue22;
        float floatValue23 = ((Double) doa.bl.c()).floatValue();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mrh mrhVar10 = (mrh) t2.b;
        mrhVar10.a |= 512;
        mrhVar10.k = floatValue23;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar24 = (mrf) t.b;
        mrh mrhVar11 = (mrh) t2.cz();
        mrhVar11.getClass();
        mrfVar24.A = mrhVar11;
        mrfVar24.a |= 33554432;
        boolean booleanValue7 = ((Boolean) doa.bR.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar25 = (mrf) t.b;
        mrfVar25.a |= 67108864;
        mrfVar25.B = booleanValue7;
        nfh t3 = mri.f.t();
        float floatValue24 = ((Double) doa.bm.c()).floatValue();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mri mriVar = (mri) t3.b;
        mriVar.a |= 1;
        mriVar.b = floatValue24;
        float floatValue25 = ((Double) doa.bn.c()).floatValue();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mri mriVar2 = (mri) t3.b;
        mriVar2.a |= 2;
        mriVar2.c = floatValue25;
        float floatValue26 = ((Double) doa.bo.c()).floatValue();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mri mriVar3 = (mri) t3.b;
        mriVar3.a |= 4;
        mriVar3.d = floatValue26;
        mpw mpwVar = (mpw) doa.aJ.j();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        mri mriVar4 = (mri) t3.b;
        mpwVar.getClass();
        mriVar4.e = mpwVar;
        mriVar4.a |= 8;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar26 = (mrf) t.b;
        mri mriVar5 = (mri) t3.cz();
        mriVar5.getClass();
        mrfVar26.D = mriVar5;
        mrfVar26.a |= 268435456;
        mrg mrgVar = (mrg) doa.bT.j();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar27 = (mrf) t.b;
        mrgVar.getClass();
        mrfVar27.E = mrgVar;
        mrfVar27.a |= 536870912;
        int intValue = ((Long) doa.U.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar28 = (mrf) t.b;
        mrfVar28.a |= 1073741824;
        mrfVar28.F = intValue;
        boolean booleanValue8 = ((Boolean) doa.c.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar29 = (mrf) t.b;
        mrfVar29.a |= 134217728;
        mrfVar29.C = booleanValue8;
        int intValue2 = ((Long) doa.e.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar30 = (mrf) t.b;
        mrfVar30.a |= Integer.MIN_VALUE;
        mrfVar30.G = intValue2;
        boolean booleanValue9 = ((Boolean) doa.bb.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar31 = (mrf) t.b;
        mrfVar31.b = 1 | mrfVar31.b;
        mrfVar31.H = booleanValue9;
        boolean booleanValue10 = ((Boolean) doa.f.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar32 = (mrf) t.b;
        mrfVar32.b |= 2;
        mrfVar32.I = booleanValue10;
        int intValue3 = ((Long) doa.g.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar33 = (mrf) t.b;
        mrfVar33.b |= 4;
        mrfVar33.J = intValue3;
        float floatValue27 = ((Double) doa.i.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar34 = (mrf) t.b;
        mrfVar34.b |= 8;
        mrfVar34.K = floatValue27;
        float floatValue28 = ((Double) doa.j.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar35 = (mrf) t.b;
        mrfVar35.b |= 16;
        mrfVar35.L = floatValue28;
        float floatValue29 = ((Double) doa.l.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar36 = (mrf) t.b;
        mrfVar36.b |= 32;
        mrfVar36.M = floatValue29;
        boolean booleanValue11 = ((Boolean) cas.w.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar37 = (mrf) t.b;
        mrfVar37.b |= 64;
        mrfVar37.N = booleanValue11;
        float floatValue30 = ((Double) doa.k.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar38 = (mrf) t.b;
        mrfVar38.b |= 128;
        mrfVar38.O = floatValue30;
        boolean booleanValue12 = ((Boolean) doa.bS.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar39 = (mrf) t.b;
        mrfVar39.b |= 256;
        mrfVar39.P = booleanValue12;
        boolean booleanValue13 = ((Boolean) doa.d.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar40 = (mrf) t.b;
        mrfVar40.b |= 8192;
        mrfVar40.U = booleanValue13;
        float floatValue31 = ((Double) doa.bU.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar41 = (mrf) t.b;
        mrfVar41.b |= 512;
        mrfVar41.Q = floatValue31;
        float floatValue32 = ((Double) doa.bV.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar42 = (mrf) t.b;
        mrfVar42.b |= 1024;
        mrfVar42.R = floatValue32;
        int intValue4 = ((Long) doa.bW.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar43 = (mrf) t.b;
        mrfVar43.b |= 2048;
        mrfVar43.S = intValue4;
        int c2 = msc.c(((Long) doa.bX.c()).intValue());
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar44 = (mrf) t.b;
        int i2 = c2 - 1;
        if (c2 == 0) {
            throw null;
        }
        mrfVar44.T = i2;
        mrfVar44.b |= 4096;
        boolean booleanValue14 = ((Boolean) doa.bY.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar45 = (mrf) t.b;
        mrfVar45.b |= 262144;
        mrfVar45.Z = booleanValue14;
        int intValue5 = ((Long) doa.ca.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar46 = (mrf) t.b;
        mrfVar46.b |= 524288;
        mrfVar46.aa = intValue5;
        float floatValue33 = ((Double) doa.bZ.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar47 = (mrf) t.b;
        mrfVar47.b |= 16384;
        mrfVar47.V = floatValue33;
        int intValue6 = ((Long) doa.cb.c()).intValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar48 = (mrf) t.b;
        mrfVar48.b |= 32768;
        mrfVar48.W = intValue6;
        float floatValue34 = ((Double) doa.cc.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar49 = (mrf) t.b;
        mrfVar49.b |= 65536;
        mrfVar49.X = floatValue34;
        boolean booleanValue15 = ((Boolean) doa.ce.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar50 = (mrf) t.b;
        mrfVar50.b |= 1048576;
        mrfVar50.ab = booleanValue15;
        boolean j = ebl.j((String) doa.cd.c(), this.e.n());
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar51 = (mrf) t.b;
        mrfVar51.b |= 131072;
        mrfVar51.Y = j;
        boolean booleanValue16 = ((Boolean) doa.cf.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar52 = (mrf) t.b;
        mrfVar52.b |= 2097152;
        mrfVar52.ac = booleanValue16;
        float floatValue35 = ((Double) doa.cg.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar53 = (mrf) t.b;
        mrfVar53.b |= 4194304;
        mrfVar53.ad = floatValue35;
        float floatValue36 = ((Double) doa.ch.c()).floatValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar54 = (mrf) t.b;
        mrfVar54.b |= 8388608;
        mrfVar54.ae = floatValue36;
        boolean booleanValue17 = ((Boolean) doa.ci.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar55 = (mrf) t.b;
        mrfVar55.b |= 16777216;
        mrfVar55.af = booleanValue17;
        boolean booleanValue18 = ((Boolean) doa.cj.c()).booleanValue();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mrf mrfVar56 = (mrf) t.b;
        mrfVar56.b |= 33554432;
        mrfVar56.ag = booleanValue18;
        return (mrf) t.cz();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i, int i2, int i3, int i4) {
        this.d.e(hqeVar, i, i2, i3, i4);
        enx enxVar = this.l;
        if (enxVar != null) {
            enxVar.e(hqeVar);
        }
        if (!this.m && hqeVar != hqe.IME) {
            hls hlsVar = this.E;
            if (hlsVar instanceof hnv) {
                hnv hnvVar = (hnv) hlsVar;
                hnvVar.u();
                Runnable runnable = hnvVar.d;
                if (runnable != null) {
                    kki.k(runnable);
                    hnvVar.d = null;
                }
                hnvVar.k = false;
                hnvVar.j = false;
                hnvVar.m = false;
                hnvVar.l = false;
            }
            this.h.c();
            af(jbx.SELECTION_CHANGE);
            A();
            Runnable runnable2 = this.n;
            ad();
            if (runnable2 == null) {
                runnable2 = new dgd(this, 16);
            }
            long longValue = ((Long) doa.dc.c()).longValue();
            if (longValue < 0) {
                runnable2.run();
            } else {
                this.Z = this.U.a(runnable2, longValue, TimeUnit.MILLISECONDS);
            }
            this.n = runnable2;
        }
    }

    @Override // defpackage.jbw
    public final void q() {
        this.A.c();
        ak(4);
        gX();
    }

    @Override // defpackage.jbw
    public final void r() {
        this.A.c();
        ewf ewfVar = this.R;
        caj g = g();
        Objects.requireNonNull(g);
        ewfVar.a(new boh(g, 20));
        z(false, 0L);
    }

    @Override // defpackage.jbw
    public final void s() {
        enx enxVar = this.l;
        if (enxVar != null && enxVar.h) {
            enxVar.f();
        }
        ah();
        this.A.c();
        ak(1);
        ewf ewfVar = this.R;
        caj g = g();
        Objects.requireNonNull(g);
        boh bohVar = new boh(g, 20);
        ewb ewbVar = (ewb) ewfVar;
        if (!ewbVar.c.d()) {
            return;
        }
        ewbVar.b(2, (mud) bohVar.a());
    }

    @Override // defpackage.jbw
    public final void t() {
        this.A.c();
        ak(3);
        ewf ewfVar = this.R;
        caj g = g();
        Objects.requireNonNull(g);
        ewfVar.a(new boh(g, 20));
        z(false, 0L);
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void u(bnq bnqVar) {
        lre.aL(this, bnqVar);
    }

    @Override // defpackage.jbw
    public final void v(bnq bnqVar, jbv jbvVar) {
        fbv fbvVar = fbv.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (fbvVar.d <= 0) {
            fbvVar.d = elapsedRealtime;
            if (fbvVar.b > 0) {
                long j = elapsedRealtime - fbvVar.b;
                fbvVar.f.g(fbp.VOICE_INPUT_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                if (few.ON_DEVICE.equals(fbvVar.e)) {
                    fbvVar.f.g(fbp.ON_DEVICE_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                } else if (few.S3.equals(fbvVar.e)) {
                    fbvVar.f.g(fbp.S3_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                }
            }
            if (fbvVar.c > 0) {
                long j2 = elapsedRealtime - fbvVar.c;
                fbvVar.f.g(fbp.VOICE_INPUT_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                if (few.ON_DEVICE.equals(fbvVar.e)) {
                    fbvVar.f.g(fbp.ON_DEVICE_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                } else if (few.S3.equals(fbvVar.e)) {
                    fbvVar.f.g(fbp.S3_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                }
            }
        }
        if (Collection$EL.stream(bnqVar.a).anyMatch(ccj.s)) {
            this.A.c();
        }
        al(2, bnqVar, jbvVar);
    }

    @Override // defpackage.hlp
    public final void w(int i) {
        hln hlnVar = null;
        boolean z = true;
        int i2 = 0;
        if (this.g.a() && this.d.j != null && !this.A.d()) {
            dnp dnpVar = this.g;
            ArrayList arrayList = new ArrayList();
            hlh hlhVar = dnpVar.c.j;
            hlk hlkVar = new hlk();
            while (arrayList.size() < i) {
                hln b2 = hlhVar == null ? null : hlhVar.b();
                hln e = dnpVar.d.e();
                if (b2 == null && e == null) {
                    break;
                }
                int size = arrayList.size();
                if (e != null) {
                    if (b2 != null) {
                        long longValue = ((Long) dnp.a.c()).longValue();
                        hlm hlmVar = hlm.RECOMMENDATION;
                        int ordinal = e.e.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2 && longValue > 3) {
                                }
                            } else if (longValue >= 1) {
                            }
                        } else if (e.g) {
                            if (longValue >= 1) {
                            }
                        } else if (e.h < 2) {
                            if (longValue >= 2) {
                            }
                        } else if (longValue >= 3) {
                        }
                    }
                    hlkVar.b(e);
                    hlkVar.h = size;
                    hlkVar.i = size;
                    arrayList.add(hlkVar.a());
                    dnpVar.d.I();
                }
                hlkVar.b(b2);
                hlkVar.h = size;
                hlkVar.i = size;
                arrayList.add(hlkVar.a());
                hlhVar.next();
            }
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                hln hlnVar2 = (hln) arrayList.get(i3);
                if (hlnVar2.l) {
                    hlnVar = hlnVar2;
                    break;
                }
                i3++;
            }
            hls hlsVar = dnpVar.e;
            if (!dnpVar.d.B() && (hlhVar == null || !hlhVar.hasNext())) {
                z = false;
            }
            hlsVar.l(arrayList, hlnVar, z);
            return;
        }
        dnz dnzVar = this.d;
        if (dnzVar.g) {
            dnzVar.j(i);
        } else if (!this.m) {
            if (!this.J || !ag() || this.h.a) {
                this.E.l(Collections.emptyList(), null, false);
                return;
            }
            ita itaVar = this.A;
            if (itaVar.d()) {
                itaVar.a().ifPresent(new chf(this, 7));
                return;
            }
            List<hln> h = this.k.h(i);
            if (this.Y) {
                doo dooVar = this.ac;
                Iterator it = h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CharSequence charSequence = ((hln) it.next()).a;
                    if (charSequence != null) {
                        String obj = charSequence.toString();
                        String str = (String) dooVar.a.get(obj.toLowerCase(Locale.ENGLISH));
                        if (str != null) {
                            hlk a2 = hln.a();
                            a2.c();
                            a2.e = hlm.AUTO_SUBMIT;
                            a2.s = 3;
                            a2.a = obj;
                            a2.j = str;
                            h.add(1, a2.a());
                            break;
                        }
                    }
                }
            }
            boolean i4 = ab().g() ? ab().i() : false;
            if (((Boolean) doa.dX.c()).booleanValue() && i4 && (this.k.E() || this.k.C())) {
                llk e2 = llp.e();
                for (hln hlnVar3 : h) {
                    hlk hlkVar2 = new hlk();
                    hlkVar2.b(hlnVar3);
                    if (hlnVar3.s == 2) {
                        CharSequence charSequence2 = hlnVar3.a;
                        CharSequence charSequence3 = hlnVar3.d;
                        if (charSequence2 != null && charSequence3 != null) {
                            hlkVar2.a = TextUtils.concat(charSequence2, charSequence3);
                            hlkVar2.d = null;
                        }
                    }
                    hlkVar2.s = 10;
                    e2.h(hlkVar2.a());
                }
                h = e2.g();
            }
            while (true) {
                if (i2 >= h.size()) {
                    break;
                }
                hln hlnVar4 = (hln) h.get(i2);
                if (hlnVar4.l) {
                    hlnVar = hlnVar4;
                    break;
                }
                i2++;
            }
            this.E.l(h, hlnVar, this.k.B());
        }
    }

    public final msv x() {
        D(hxx.TRAINING_CONTEXT_COMMITTED, g().h());
        msr g = g().g(true);
        if ((g.a & 1) != 0) {
            msv msvVar = g.b;
            return msvVar == null ? msv.j : msvVar;
        }
        return null;
    }

    public final void z(boolean z, long j) {
        if (!U()) {
            return;
        }
        long d = d();
        boolean T = T(this.F);
        Delight5Facilitator delight5Facilitator = this.e;
        dom domVar = new dom(this, z, d, j, T);
        mko mkoVar = (mko) delight5Facilitator.d.get();
        if (mkoVar == null) {
            return;
        }
        if (mkoVar.isDone()) {
            domVar.run();
        } else {
            kcu.U(mkoVar, delight5Facilitator.l(domVar), gyc.b);
        }
    }
}
