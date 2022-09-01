package com.google.android.apps.inputmethod.libs.mozc.ime;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SimpleJapaneseIme extends AbstractIme implements jbw {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/mozc/ime/SimpleJapaneseIme");
    private static final drd h = drd.TWELVE_KEY_TOGGLE_KANA;
    private static final drd i = drd.SYMBOL_NUMBER;
    private static final drd j = drd.HARDWARE_QWERTY_KANA;
    protected final dsn b;
    public final dqz c;
    public EditorInfo f;
    public final ita g;
    private final drd k;
    private final drd l;
    private final drd m;
    private final boolean n;
    private final int o;
    private jby p;
    private drd u;
    private enx x;
    private final dsl y;
    public final drq d = new drq();
    public final dsj e = new dsj() { // from class: drr
        /* JADX WARN: Code restructure failed: missing block: B:110:0x02d0, code lost:
            if ((r3.a & 32) != 0) goto L111;
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x0215, code lost:
            if (r2 == 6) goto L83;
         */
        /* JADX WARN: Removed duplicated region for block: B:114:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0302  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
        @Override // defpackage.dsj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(defpackage.ggc r18, defpackage.iay r19) {
            /*
                Method dump skipped, instructions count: 821
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.drr.a(ggc, iay):void");
        }
    };
    private final dsj q = new drs(this, 0);
    private final dsj r = new drs(this, 2);
    private boolean s = false;
    private int t = 0;
    private boolean v = true;
    private ibz w = ibz.a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleJapaneseIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, new isq(context, new drt(hlsVar)));
        dsn a2 = dsn.a();
        dsl dslVar = new dsl(hlsVar, iavVar.e);
        ita itaVar = new ita(hlsVar);
        this.b = a2;
        hjg.q();
        this.k = d(iavVar.q, R.id.f55020_resource_name_obfuscated_res_0x7f0b01df, h);
        this.l = d(iavVar.q, R.id.f55070_resource_name_obfuscated_res_0x7f0b01e4, i);
        this.m = d(iavVar.q, R.id.f54890_resource_name_obfuscated_res_0x7f0b01d1, j);
        boolean d = iavVar.q.d(R.id.f54930_resource_name_obfuscated_res_0x7f0b01d5, false);
        this.n = iavVar.q.d(R.id.f54940_resource_name_obfuscated_res_0x7f0b01d6, false);
        this.o = jbt.i(context, R.attr.f3690_resource_name_obfuscated_res_0x7f0400a1, 2);
        this.c = new dqz(context, ieh.j(), this.E, iavVar.q.d(R.id.f54920_resource_name_obfuscated_res_0x7f0b01d4, true), d, gvs.a, null);
        a2.o(context, dso.a, dsd.a(context));
        this.y = dslVar;
        this.g = itaVar;
    }

    private static drd d(iap iapVar, int i2, drd drdVar) {
        return drd.a(iapVar.c(i2, drdVar.name()).toString());
    }

    private final jby g() {
        if (this.p == null) {
            this.p = new fbu(this.D, this.F, this, mjl.a);
        }
        return this.p;
    }

    private final void k() {
        drd drdVar = this.u;
        if (drdVar == null || !drdVar.t) {
            return;
        }
        dsn dsnVar = this.b;
        dsj dsjVar = this.e;
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 25;
        ggtVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar.g((ggh) t.cz(), 9, null, dsjVar, 1000L);
    }

    private final void n(boolean z) {
        ino inoVar = this.G;
        nfh t = ggu.k.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggu gguVar = (ggu) t.b;
        int i2 = gguVar.a | 8388608;
        gguVar.a = i2;
        gguVar.h = true;
        gguVar.a = i2 | 4;
        gguVar.c = false;
        int i3 = 3;
        int i4 = true != inoVar.aj(R.string.f161510_resource_name_obfuscated_res_0x7f1406b8) ? 1 : 3;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggu gguVar2 = (ggu) t.b;
        gguVar2.e = i4 - 1;
        gguVar2.a |= 2048;
        boolean al = inoVar.al("pref_key_auto_correction", true, true);
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggu gguVar3 = (ggu) t.b;
        gguVar3.a |= 16777216;
        gguVar3.i = al;
        if (true == inoVar.x(R.string.f162280_resource_name_obfuscated_res_0x7f140705, true)) {
            i3 = 1;
        }
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggu gguVar4 = (ggu) t.b;
        gguVar4.f = i3 - 1;
        gguVar4.a |= 8192;
        nfh u = ggu.k.u((ggu) t.cz());
        if (u.c) {
            u.cD();
            u.c = false;
        }
        ggu gguVar5 = (ggu) u.b;
        gguVar5.a |= 4;
        gguVar5.c = z;
        ggu gguVar6 = (ggu) u.cz();
        dsn dsnVar = this.b;
        nfh t2 = ggh.o.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggh gghVar = (ggh) t2.b;
        gghVar.b = 7;
        int i5 = gghVar.a | 1;
        gghVar.a = i5;
        gguVar6.getClass();
        gghVar.f = gguVar6;
        gghVar.a = i5 | 16;
        dsnVar.f((ggh) t2.cz(), null, null);
    }

    private final void o(jbx jbxVar) {
        g().e(jbxVar);
    }

    private final void x(iay iayVar) {
        dsn dsnVar = this.b;
        dsj dsjVar = this.e;
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 2;
        ggtVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar.f((ggh) t.cz(), null, dsjVar);
        dsn dsnVar2 = this.b;
        dsj dsjVar2 = this.r;
        if (dsnVar2.d == null) {
            ((luc) dsn.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/session/SessionExecutor", "sendKeyEvent", 1157, "SessionExecutor.java")).t("handler is null.");
            return;
        }
        dsnVar2.d.sendMessage(dsnVar2.d.obtainMessage(6, new dsl(iayVar, dsjVar2, dsnVar2.f)));
    }

    @Override // defpackage.hlp
    public final boolean B(hfd hfdVar) {
        iah iahVar;
        iay iayVar;
        int i2;
        InputDevice device;
        Object obj;
        doc docVar;
        this.b.j();
        if (!((Boolean) dqq.d.c()).booleanValue() || !g().f(hfdVar)) {
            if (((Boolean) dsu.a.c()).booleanValue()) {
                iay[] iayVarArr = hfdVar.b;
                if (iayVarArr.length != 0) {
                    switch (iayVarArr[0].c) {
                        case -10136:
                            dsl dslVar = this.y;
                            Objects.requireNonNull(dslVar);
                            docVar = new doc(dslVar, 6, null);
                            this.b.e(new dod(this, docVar, 5));
                            return true;
                        case -10135:
                            dsl dslVar2 = this.y;
                            Objects.requireNonNull(dslVar2);
                            docVar = new doc(dslVar2, 7, null);
                            this.b.e(new dod(this, docVar, 5));
                            return true;
                        case -10134:
                            dsl dslVar3 = this.y;
                            Objects.requireNonNull(dslVar3);
                            docVar = new doc(dslVar3, 5, null);
                            this.b.e(new dod(this, docVar, 5));
                            return true;
                        case -10133:
                            dsl dslVar4 = this.y;
                            Objects.requireNonNull(dslVar4);
                            docVar = new doc(dslVar4, 4, null);
                            this.b.e(new dod(this, docVar, 5));
                            return true;
                    }
                }
            }
            if (!((Boolean) dsu.a.c()).booleanValue() || hfdVar.a() != -10137 || !this.g.d()) {
                if (hfdVar.a == iah.UP || (iahVar = hfdVar.a) == iah.DOUBLE_TAP || iahVar == iah.DOWN) {
                    return true;
                }
                if (hfdVar.b[0].c == -10127) {
                    return false;
                }
                drd drdVar = this.u;
                if (drdVar != null && drdVar.s) {
                    return false;
                }
                enx enxVar = this.x;
                if (enxVar != null && enxVar.h(hfdVar)) {
                    return true;
                }
                jdg.u(hfdVar.b);
                jdg.u(hfdVar.b[0]);
                iay iayVar2 = hfdVar.b[0];
                if ((iayVar2.e == null && new KeyEvent(0, iayVar2.c).isSystem()) || (i2 = (iayVar = hfdVar.b[0]).c) == -10127 || i2 == -10042) {
                    return false;
                }
                if (hfdVar.p != 6 || this.w == ibz.a) {
                    if (iayVar.d == iax.COMMIT) {
                        x(iayVar);
                        return true;
                    } else if (iayVar.c != -10141) {
                        jdg.u(hfdVar);
                        jdg.u(hfdVar.b);
                        iay iayVar3 = hfdVar.b[0];
                        jdg.u(iayVar3);
                        int i3 = iayVar3.c;
                        if (i3 == -10046) {
                            Object obj2 = iayVar3.e;
                            if (!(obj2 instanceof Integer)) {
                                return true;
                            }
                            ((Integer) obj2).intValue();
                            return true;
                        } else if (i3 != -10045) {
                            ggl b = drc.b(hfdVar.b, hfdVar.f, hfdVar.g, hfdVar.p == 6);
                            if (b == null) {
                                return hfdVar.p != 6;
                            }
                            drq drqVar = this.d;
                            if (drqVar.a != null && drq.a(iayVar3)) {
                                boolean isEmpty = drqVar.b.isEmpty();
                                drqVar.b.add(iayVar3);
                                if (isEmpty && !drqVar.b.isEmpty() && drqVar.d) {
                                    drqVar.a.y(2048L, false);
                                }
                            }
                            z(hfdVar.p == 6 && (device = InputDevice.getDevice(hfdVar.o)) != null && (device.getSources() & 257) == 257);
                            dsn dsnVar = this.b;
                            List emptyList = Collections.emptyList();
                            dsj dsjVar = this.q;
                            nfh t = ggh.o.t();
                            if (t.c) {
                                t.cD();
                                t.c = false;
                            }
                            ggh gghVar = (ggh) t.b;
                            gghVar.b = 3;
                            int i4 = gghVar.a | 1;
                            gghVar.a = i4;
                            gghVar.d = b;
                            gghVar.a = 4 | i4;
                            t.cP(emptyList);
                            dsnVar.f((ggh) t.cz(), iayVar3, dsjVar);
                            if (iayVar3.d != iax.DECODE) {
                                return true;
                            }
                            k();
                            return true;
                        } else {
                            dsn dsnVar2 = this.b;
                            List emptyList2 = Collections.emptyList();
                            dsj dsjVar2 = this.e;
                            nfh t2 = ggh.o.t();
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            ggh gghVar2 = (ggh) t2.b;
                            gghVar2.b = 5;
                            gghVar2.a |= 1;
                            nfh t3 = ggt.f.t();
                            if (t3.c) {
                                t3.cD();
                                t3.c = false;
                            }
                            ggt ggtVar = (ggt) t3.b;
                            ggtVar.b = 14;
                            ggtVar.a |= 1;
                            if (t2.c) {
                                t2.cD();
                                t2.c = false;
                            }
                            ggh gghVar3 = (ggh) t2.b;
                            ggt ggtVar2 = (ggt) t3.cz();
                            ggtVar2.getClass();
                            gghVar3.e = ggtVar2;
                            gghVar3.a |= 8;
                            t2.cP(emptyList2);
                            dsnVar2.f((ggh) t2.cz(), null, dsjVar2);
                            k();
                            return true;
                        }
                    } else {
                        iay f = hfdVar.f();
                        if (f == null || (obj = f.e) == null || !(obj instanceof icn)) {
                            return false;
                        }
                        this.b.e(new dod(this, f, 7));
                        return true;
                    }
                }
                x(iayVar);
                return true;
            }
            this.g.a().ifPresent(new chf(this, 9));
            this.g.c();
            return true;
        }
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme
    public final boolean L(EditorInfo editorInfo) {
        return !this.I && irs.d();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void a(long j2, long j3) {
        super.a(j2, j3);
        drq drqVar = this.d;
        boolean z = (j3 & 2048) != 0;
        if (drqVar.b.isEmpty()) {
            drqVar.c = z;
        }
    }

    @Override // defpackage.jbw
    public final jbu b() {
        lmx g = lmz.g();
        g.d(-10133);
        g.d(-10134);
        g.d(-10136);
        g.d(-10135);
        if (((Boolean) dsu.a.c()).booleanValue() && this.g.d()) {
            g.d(-10137);
        }
        jsy a2 = jbu.a();
        a2.h(g.g());
        return a2.f();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, java.lang.AutoCloseable
    public final void close() {
        g().b();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gS(hln hlnVar) {
        this.b.j();
        Object obj = hlnVar.j;
        if (!(obj instanceof gfw)) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/ime/SimpleJapaneseIme", "deleteCandidate", 797, "SimpleJapaneseIme.java")).w("candidate.data is not CandidateWord: %s", hlnVar);
            return;
        }
        dsn dsnVar = this.b;
        int i2 = ((gfw) obj).b;
        dsj dsjVar = this.e;
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 24;
        int i3 = ggtVar.a | 1;
        ggtVar.a = i3;
        ggtVar.a = i3 | 2;
        ggtVar.c = i2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar.f((ggh) t.cz(), null, dsjVar);
    }

    @Override // defpackage.hlp
    public final void gX() {
        this.b.j();
        dqz dqzVar = this.c;
        String str = dqzVar.b.i;
        dqx dqxVar = dqzVar.c;
        gfv gfvVar = dqxVar.c;
        if (gfvVar != null) {
            dqxVar.c = null;
            dqxVar.d = 0;
            dqxVar.b.hY(false);
        }
        dqy dqyVar = dqzVar.b;
        dqyVar.i = "";
        dqyVar.h.hW();
        if (!TextUtils.isEmpty(str)) {
            dqzVar.a(null, str, gfvVar, str, "", dqzVar.e, dqzVar.f);
            dqzVar.g = true;
            dqzVar.f = false;
        }
        dqzVar.e = false;
        dsn dsnVar = this.b;
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 10;
        ggtVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar.f((ggh) t.cz(), null, null);
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void gY(hln hlnVar, boolean z) {
        this.b.j();
        if (!z) {
            return;
        }
        if (hlnVar.e == hlm.RESTORABLE_TEXT) {
            this.b.e(new dod(this, hlnVar, 6));
            return;
        }
        gfw gfwVar = (gfw) hlnVar.j;
        jdg.u(gfwVar);
        dsn dsnVar = this.b;
        int i2 = gfwVar.b;
        dsj dsjVar = this.e;
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 7;
        int i3 = ggtVar.a | 1;
        ggtVar.a = i3;
        ggtVar.a = i3 | 2;
        ggtVar.c = i2;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar.f((ggh) t.cz(), null, dsjVar);
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
        this.b.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.inputmethod.EditorInfo r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme.i(android.view.inputmethod.EditorInfo, boolean):void");
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void j() {
        g().c();
        this.b.i();
        if (!this.N) {
            n(false);
        }
        enx enxVar = this.x;
        if (enxVar != null) {
            enxVar.d();
            this.x = null;
        }
        super.j();
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void l(ibz ibzVar, boolean z) {
        int i2;
        o(jbx.KEYBOARD_CHANGE);
        this.b.j();
        jdg.u(ibzVar);
        this.w = ibzVar;
        dsn dsnVar = this.b;
        EditorInfo editorInfo = this.f;
        int i3 = 2;
        if (ham.ab(editorInfo)) {
            i2 = 2;
        } else if (ham.W(editorInfo)) {
            i2 = 3;
        } else {
            i2 = ham.R(editorInfo) ? 4 : 1;
        }
        nfh t = ggh.o.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar = (ggh) t.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t2 = ggt.f.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggt ggtVar = (ggt) t2.b;
        ggtVar.b = 12;
        ggtVar.a |= 1;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar2 = (ggh) t.b;
        ggt ggtVar2 = (ggt) t2.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        nfh t3 = ggd.c.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        ggd ggdVar = (ggd) t3.b;
        ggdVar.b = i2;
        ggdVar.a |= 8;
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggh gghVar3 = (ggh) t.b;
        ggd ggdVar2 = (ggd) t3.cz();
        ggdVar2.getClass();
        gghVar3.g = ggdVar2;
        gghVar3.a |= 32;
        dsnVar.f((ggh) t.cz(), null, null);
        z(false);
        nfh t4 = ggu.k.t();
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        ggu gguVar = (ggu) t4.b;
        gguVar.d = 4;
        gguVar.a |= 64;
        drd drdVar = this.u;
        boolean F = jam.F(this.D);
        if (drdVar == null || !drdVar.q || !F) {
            i3 = 1;
        }
        if (t4.c) {
            t4.cD();
            t4.c = false;
        }
        ggu gguVar2 = (ggu) t4.b;
        gguVar2.g = i3 - 1;
        gguVar2.a |= 16384;
        gguVar2.b |= 8;
        gguVar2.j = true;
        ggu gguVar3 = (ggu) t4.cz();
        dsn dsnVar2 = this.b;
        nfh t5 = ggh.o.t();
        if (t5.c) {
            t5.cD();
            t5.c = false;
        }
        ggh gghVar4 = (ggh) t5.b;
        gghVar4.b = 22;
        int i4 = gghVar4.a | 1;
        gghVar4.a = i4;
        gguVar3.getClass();
        gghVar4.f = gguVar3;
        gghVar4.a = i4 | 16;
        dsnVar2.f((ggh) t5.cz(), null, null);
        drq drqVar = this.d;
        hls hlsVar = this.E;
        boolean z2 = this.n;
        drqVar.a = hlsVar;
        drqVar.b.clear();
        drqVar.d = z2;
        ino inoVar = this.G;
        if (inoVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/mozc/ime/SimpleJapaneseIme", "updateEmojiConfig", 854, "SimpleJapaneseIme.java")).t("preferences should not be null. Not initialized?");
        } else {
            nfh t6 = ggr.r.t();
            boolean al = inoVar.al("pref_key_enable_emoji_suggestion", true, true);
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            ggr ggrVar = (ggr) t6.b;
            int i5 = ggrVar.a | 512;
            ggrVar.a = i5;
            ggrVar.j = al ? 1 : 0;
            ggrVar.a = i5 | 1024;
            ggrVar.k = 7;
            this.b.k((ggr) t6.cz(), Collections.emptyList());
        }
        g().d(ibzVar);
    }

    @Override // defpackage.jbw
    public final void m() {
    }

    @Override // com.google.android.libraries.inputmethod.ime.AbstractIme, defpackage.hlp
    public final void p(hqe hqeVar, int i2, int i3, int i4, int i5) {
        if (hqeVar != hqe.IME) {
            o(jbx.SELECTION_CHANGE);
        }
        enx enxVar = this.x;
        if (enxVar != null) {
            enxVar.e(hqeVar);
        }
        if (hqeVar == hqe.OTHER) {
            int i6 = i2 + i3 + i4;
            if (i6 == 0) {
                gX();
            } else {
                dsn dsnVar = this.b;
                int max = Math.max(0, Math.min(i3, i6));
                dsj dsjVar = this.e;
                nfh t = ggh.o.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ggh gghVar = (ggh) t.b;
                gghVar.b = 5;
                gghVar.a |= 1;
                nfh t2 = ggt.f.t();
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                ggt ggtVar = (ggt) t2.b;
                ggtVar.b = 11;
                int i7 = ggtVar.a | 1;
                ggtVar.a = i7;
                ggtVar.a = i7 | 16;
                ggtVar.e = max;
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                ggh gghVar2 = (ggh) t.b;
                ggt ggtVar2 = (ggt) t2.cz();
                ggtVar2.getClass();
                gghVar2.e = ggtVar2;
                gghVar2.a |= 8;
                dsnVar.f((ggh) t.cz(), null, dsjVar);
            }
        }
        if (!((Boolean) dsu.a.c()).booleanValue() || !((Boolean) dsu.p.c()).booleanValue() || hqeVar == hqe.IME) {
            return;
        }
        this.E.O(hfd.d(new iay(-10126, null, null)));
        this.g.c();
    }

    @Override // defpackage.jbw
    public final void q() {
        B(hfd.d(new iay(-10136, null, null)));
        this.t = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void r() {
        lre.aK(this);
    }

    @Override // defpackage.jbw
    public final void s() {
        gX();
        boolean booleanValue = ((Boolean) fbh.f.c()).booleanValue();
        this.s = booleanValue;
        fbr.c(booleanValue, false);
        this.t = 0;
        if (((Boolean) dsu.a.c()).booleanValue()) {
            this.g.c();
        }
    }

    @Override // defpackage.jbw
    public final void t() {
        if (((Boolean) dsu.a.c()).booleanValue()) {
            this.g.c();
        }
        this.E.hW();
        this.t = 0;
    }

    @Override // defpackage.jbw
    public final /* synthetic */ void u(bnq bnqVar) {
        lre.aL(this, bnqVar);
    }

    @Override // defpackage.jbw
    public final void v(bnq bnqVar, jbv jbvVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (bns bnsVar : bnqVar.a) {
            if (!bnsVar.b.isEmpty()) {
                if (bnsVar.c) {
                    if (!Collection$EL.stream(bnsVar.e).anyMatch(ccj.t)) {
                        sb2.append(bnsVar.b);
                    }
                } else {
                    sb.append(bnsVar.b);
                }
            }
        }
        String sb3 = sb2.toString();
        String sb4 = sb.toString();
        if (((Boolean) dsu.a.c()).booleanValue() && Collection$EL.stream(bnqVar.a).anyMatch(ccj.u)) {
            this.g.c();
        }
        this.E.x();
        if (!sb3.isEmpty()) {
            this.E.hV(sb3, false, 1);
        }
        this.E.g(sb4, 1);
        this.E.D();
        int length = this.t + sb3.length();
        this.t = length;
        if (length > 0 || sb4.length() > 0) {
            fbr.c(this.s, true);
        }
    }

    @Override // defpackage.hlp
    public final void w(int i2) {
        dqz dqzVar = this.c;
        drd drdVar = this.u;
        dsj a2 = dqzVar.c.a(i2, false, drdVar != null && drdVar.q);
        if (a2 != null) {
            dsn dsnVar = this.b;
            if (((Boolean) dqq.r.c()).booleanValue()) {
                return;
            }
            nfh t = ggh.o.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggh gghVar = (ggh) t.b;
            gghVar.b = 5;
            gghVar.a |= 1;
            nfh t2 = ggt.f.t();
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            ggt ggtVar = (ggt) t2.b;
            ggtVar.b = 15;
            ggtVar.a = 1 | ggtVar.a;
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggh gghVar2 = (ggh) t.b;
            ggt ggtVar2 = (ggt) t2.cz();
            ggtVar2.getClass();
            gghVar2.e = ggtVar2;
            gghVar2.a |= 8;
            dsnVar.f((ggh) t.cz(), null, a2);
        }
    }

    private final void z(boolean z) {
        drd drdVar;
        ino inoVar;
        if (z) {
            drdVar = this.m;
        } else {
            ibz ibzVar = this.w;
            if (ibz.a.equals(ibzVar)) {
                drdVar = this.k;
                if (drdVar == drd.TWELVE_KEY_TOGGLE_FLICK_KANA && (inoVar = this.G) != null && inoVar.aj(R.string.f161470_resource_name_obfuscated_res_0x7f1406b4)) {
                    drdVar = drd.TWELVE_KEY_FLICK_KANA;
                }
            } else if (dko.a.equals(ibzVar)) {
                ino inoVar2 = this.G;
                if (inoVar2 == null || !inoVar2.aj(R.string.f161470_resource_name_obfuscated_res_0x7f1406b4)) {
                    drdVar = drd.TWELVE_KEY_TOGGLE_FLICK_ALPHABET;
                } else {
                    drdVar = drd.TWELVE_KEY_FLICK_ALPHABET;
                }
            } else if (dko.b.equals(ibzVar)) {
                drdVar = drd.QWERTY_ALPHABET;
            } else if (dko.c.equals(ibzVar)) {
                drdVar = drd.TWELVE_KEY_FLICK_NUMBER;
            } else {
                drdVar = this.l;
            }
        }
        drd drdVar2 = this.u;
        boolean z2 = !drdVar.q && this.G.x(R.string.f162160_resource_name_obfuscated_res_0x7f1406f9, true);
        if (drdVar == drdVar2 && z2 == this.v) {
            return;
        }
        this.u = drdVar;
        this.v = z2;
        Resources resources = this.D.getResources();
        dsn dsnVar = this.b;
        drd drdVar3 = this.u;
        Configuration configuration = resources.getConfiguration();
        int i2 = this.o;
        jdg.u(configuration);
        nfh t = ggr.r.t();
        krm krmVar = drdVar3.y;
        jdg.u(configuration);
        Object obj = krmVar.b;
        int i3 = krmVar.a;
        jdg.u(configuration);
        int i4 = configuration.orientation;
        String str = ((String) obj) + "-" + i3 + ".0.0-" + (i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? "UNKNOWN" : "SQUARE" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED");
        if (t.c) {
            t.cD();
            t.c = false;
        }
        ggr ggrVar = (ggr) t.b;
        int i5 = ggrVar.a | 32;
        ggrVar.a = i5;
        ggrVar.f = str;
        int i6 = drdVar3.v;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        ggrVar.d = i7;
        int i8 = i5 | 4;
        ggrVar.a = i8;
        int i9 = drdVar3.w;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        ggrVar.e = i10;
        int i11 = i8 | 16;
        ggrVar.a = i11;
        boolean z3 = drdVar3.r;
        int i12 = i11 | 128;
        ggrVar.a = i12;
        ggrVar.h = z3;
        int i13 = drdVar3.x;
        int i14 = i13 - 1;
        if (i13 == 0) {
            throw null;
        }
        ggrVar.l = i14;
        ggrVar.a = i12 | 2048;
        ggr ggrVar2 = (ggr) t.b;
        ggrVar2.m = 2;
        int i15 = ggrVar2.a | 4096;
        ggrVar2.a = i15;
        if (drdVar3.q) {
            int i16 = i15 | 2;
            ggrVar2.a = i16;
            ggrVar2.c = false;
            int i17 = i16 | 1;
            ggrVar2.a = i17;
            ggrVar2.b = false;
            int i18 = i17 | 64;
            ggrVar2.a = i18;
            ggrVar2.g = true;
            int i19 = i18 | 256;
            ggrVar2.a = i19;
            ggrVar2.i = false;
            ggrVar2.a = i19 | 8192;
            ggrVar2.n = i2;
        } else {
            ggrVar2.a = i15 | 2;
            ggrVar2.c = true;
            boolean booleanValue = ((Boolean) dqq.r.c()).booleanValue();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggr ggrVar3 = (ggr) t.b;
            int i20 = ggrVar3.a | 131072;
            ggrVar3.a = i20;
            ggrVar3.q = booleanValue;
            int i21 = i20 | 1;
            ggrVar3.a = i21;
            ggrVar3.b = z2;
            int i22 = i21 | 64;
            ggrVar3.a = i22;
            ggrVar3.g = false;
            ggrVar3.a = i22 | 256;
            ggrVar3.i = true;
        }
        dsnVar.k((ggr) t.cz(), Collections.emptyList());
        if (drdVar2 != null && drdVar2.u == drdVar.u) {
            return;
        }
        dsn dsnVar2 = this.b;
        int i23 = drdVar.u;
        dsj dsjVar = this.e;
        nfh t2 = ggh.o.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggh gghVar = (ggh) t2.b;
        gghVar.b = 5;
        gghVar.a |= 1;
        nfh t3 = ggt.f.t();
        if (t3.c) {
            t3.cD();
            t3.c = false;
        }
        ggt ggtVar = (ggt) t3.b;
        ggtVar.b = 5;
        int i24 = 1 | ggtVar.a;
        ggtVar.a = i24;
        int i25 = i23 - 1;
        if (i23 == 0) {
            throw null;
        }
        ggtVar.d = i25;
        ggtVar.a = i24 | 4;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ggh gghVar2 = (ggh) t2.b;
        ggt ggtVar2 = (ggt) t3.cz();
        ggtVar2.getClass();
        gghVar2.e = ggtVar2;
        gghVar2.a |= 8;
        dsnVar2.f((ggh) t2.cz(), null, dsjVar);
    }
}
