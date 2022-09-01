package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import j$.time.Instant;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dtc  reason: default package */
/* loaded from: classes.dex */
public final class dtc implements dwh, dun, dwu {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension");
    public final dtl c;
    public final Context e;
    public final dup g;
    public final dwi h;
    public final dth i;
    public hqt j;
    public EditorInfo k;
    public boolean l;
    public hfy m;
    public final dxe n;
    private final dtj o;
    private final dxs p;
    public final dtb f = new dtb();
    public final dud b = new dud();
    public final dwv d = dwv.a();

    public dtc(Context context, dxe dxeVar, dup dupVar, dxs dxsVar, byte[] bArr) {
        this.e = context;
        this.g = dupVar;
        this.n = dxeVar;
        this.p = dxsVar;
        dtl dtlVar = new dtl(dxsVar, null);
        this.c = dtlVar;
        dgd dgdVar = new dgd(this, 19);
        Objects.requireNonNull(dtlVar);
        dtj dtjVar = new dtj(gvs.a, dgdVar, new dpt(dtlVar, 3), null);
        this.o = dtjVar;
        dwf dwfVar = new dwf(this);
        this.h = new dwi(this, ino.L(), dwfVar, new dvu(this, dwfVar), new dvm(dxeVar, null));
        Objects.requireNonNull(dtlVar);
        this.i = new dth(new drf(dtlVar, 2), dxeVar, dupVar, dtjVar, null);
    }

    public final dtp a() {
        dtq dtqVar = this.i.d;
        if (dtqVar == null) {
            return null;
        }
        return dtqVar.h;
    }

    @Override // defpackage.dun
    public final dvj b() {
        dtp a2 = a();
        if (a2 != null) {
            dvi b = a2.a().b();
            b.b(this.l);
            return b.a();
        }
        dvi b2 = dvj.a.b();
        b2.b(this.l);
        return b2.a();
    }

    public final hfy c() {
        hfy hfyVar = this.m;
        if (hfyVar != null) {
            return hfyVar;
        }
        throw new IllegalStateException("Delegate is null! Extensions must not be interacted with unless they have a non-null delegate.");
    }

    public final void d() {
        lmz k;
        CharSequence charSequence;
        if (this.m == null) {
            return;
        }
        dwi dwiVar = this.h;
        dtp a2 = a();
        dtl dtlVar = this.c;
        dsx dsxVar = dtlVar.k;
        dsx dsxVar2 = dtlVar.l;
        hfy c = c();
        dvm dvmVar = dwiVar.c;
        dvmVar.b = dsxVar;
        dvmVar.a = c;
        dvmVar.h();
        boolean z = dsxVar.c;
        boolean z2 = true;
        if (z != dsxVar2.c) {
            if (z) {
                hww g = dvm.g();
                if (g != null && !dvmVar.c) {
                    g.a(ice.HEADER, dvmVar);
                    dvmVar.c = true;
                }
            } else {
                hww g2 = dvm.g();
                if (g2 != null && dvmVar.c) {
                    g2.l(ice.HEADER, dvmVar);
                    dvmVar.c = false;
                }
                dvmVar.a = null;
            }
        }
        if (!dsxVar.b()) {
            dwiVar.h(dsxVar.c);
        } else {
            if (dsxVar.d() && !dsxVar2.d()) {
                dwiVar.j(dsxVar2.c);
            } else if (!dsxVar.d()) {
                dwiVar.b(dsxVar.c);
            }
            if (dsxVar.f ^ dsxVar2.f) {
                dwiVar.e();
            }
        }
        boolean z3 = dsxVar.f;
        if (z3 != dsxVar2.f) {
            if (z3) {
                Context context = this.e;
                jav d = jav.d(hqp.e());
                if (context == null) {
                    k = lrr.a;
                } else {
                    hrx.y(context);
                    hqt b = hqp.b();
                    k = b != null ? b.k() : lrr.a;
                }
                ieh.j().e(dua.NGA_DICTATION_STARTED, d, k);
                ieh j = ieh.j();
                fbm fbmVar = fbm.VOICE_INPUT_START;
                Object[] objArr = new Object[10];
                objArr[0] = d;
                objArr[1] = k;
                objArr[2] = few.NGA_DICTATION;
                objArr[3] = "";
                objArr[4] = false;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = 0L;
                objArr[8] = 0L;
                hpy b2 = hqj.b();
                if (b2 != null && (charSequence = b2.c) != null && charSequence.length() != 0) {
                    z2 = false;
                }
                objArr[9] = Boolean.valueOf(z2);
                j.e(fbmVar, objArr);
                fcb.a().b(fbm.INPUT_CHAR_WHEN_STARTING_NGA);
            } else {
                ieh.j().e(dua.NGA_DICTATION_STOPPED, new Object[0]);
                ieh.j().e(fbm.VOICE_INPUT_STOP, new Object[0]);
                fcb.a().b(fbm.INPUT_CHAR_WHEN_STOPPING_NGA);
            }
            if (a2 != null) {
                a2.c(dsxVar.f);
            }
        }
        this.b.f.set(dsxVar.f);
        ijl.b().g(new dsz(dsxVar));
    }

    @Override // defpackage.dwh
    public final void e(bkj bkjVar) {
        ((duz) this.g).j("sending button pressed event", new dut(bkjVar, 0));
    }

    @Override // defpackage.dun
    public final void f(boolean z) {
        if (z) {
            this.o.b++;
        }
        dtl dtlVar = this.c;
        if (z != dtlVar.j) {
            ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setDictating", 112, "NgaStateManager.java")).I("Dictating %s -> %s", dtlVar.j, z);
        }
        dtlVar.j = z;
        if (dtlVar.b()) {
            d();
        }
    }

    @Override // defpackage.dun
    public final void g(fgw fgwVar) {
        if (this.c.d(true)) {
            d();
        }
        dtl dtlVar = this.c;
        ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setAssistantDictationEligibility", 148, "NgaStateManager.java")).u("AssistantDictationEligibility = %s", fgwVar.a);
        ((AtomicReference) dtlVar.n.b).set(fgwVar);
        boolean c = dtlVar.c();
        fgt b = fgt.b(fgwVar.a);
        if (b == null) {
            b = fgt.UNRECOGNIZED;
        }
        dtlVar.f = dtl.a(b);
        final lls h = llw.h();
        Map.EL.forEach(Collections.unmodifiableMap(new nfz(fgwVar.c, fgw.g)), new BiConsumer() { // from class: dtk
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                lls llsVar = lls.this;
                String str = (String) obj;
                fgt a2 = dtl.a((fgt) obj2);
                llsVar.a(jav.f(str), a2);
                ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "lambda$setAssistantDictationEligibility$0", 160, "NgaStateManager.java")).E("AssistantDictationEligibility(config, %s) = %s", str, a2.a());
            }

            @Override // j$.util.function.BiConsumer
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return Objects.requireNonNull(biConsumer);
            }
        });
        dtlVar.d = h.f();
        fgt b2 = fgt.b(fgwVar.b);
        if (b2 == null) {
            b2 = fgt.UNRECOGNIZED;
        }
        dtlVar.e = dtl.a(b2);
        ((ltd) ((ltd) dtl.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaStateManager", "setAssistantDictationEligibility", 167, "NgaStateManager.java")).u("AssistantDictationEligibility(inputField) = %s", fgwVar.b);
        dtlVar.g = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isAfter = Instant.ofEpochMilli(dtlVar.m).plus(dtl.b).isAfter(Instant.ofEpochMilli(elapsedRealtime));
        if (dtlVar.c() && (!c || !isAfter)) {
            dtlVar.c.e(dua.NGA_IS_AVAILABLE, new Object[0]);
            dtlVar.m = elapsedRealtime;
        }
        if (dtlVar.b()) {
            d();
        }
        if (this.c.k.d || this.n.b()) {
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onEligibilityUpdated", 468, "NgaExtension.java")).t("Disconnecting KeyboardService as dictation is not eligible.");
        this.g.a();
    }

    @Override // defpackage.dun
    public final void h(int i) {
        dvl dvlVar = this.h.a.e;
        if (dvlVar != null) {
            dvlVar.m(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [int] */
    @Override // defpackage.dun
    public final void i(fhq fhqVar, duo duoVar) {
        fho fhoVar;
        fhp fhpVar;
        dtp a2 = a();
        if (a2 != null) {
            a2.c.e(dua.NGA_ACTION_RECEIVED, fhqVar);
            fho fhoVar2 = fho.UNKNOWN;
            int i = fhqVar.a;
            int a3 = ffb.a(i);
            int i2 = a3 - 1;
            if (a3 == 0) {
                throw null;
            }
            if (i2 == 0) {
                if (i == 1) {
                    fhoVar = fho.b(((Integer) fhqVar.b).intValue());
                    if (fhoVar == null) {
                        fhoVar = fho.UNRECOGNIZED;
                    }
                } else {
                    fhoVar = fho.UNKNOWN;
                }
                if (a2.d.b(fhoVar) || fhoVar.equals(fho.READ_BACK)) {
                    switch (fhoVar.ordinal()) {
                        case 1:
                            a2.d("DONE");
                            duoVar.a(true);
                            break;
                        case 2:
                            a2.d("GO");
                            duoVar.a(true);
                            break;
                        case 3:
                            a2.d("NEXT");
                            duoVar.a(true);
                            break;
                        case 4:
                            a2.d("PREVIOUS");
                            duoVar.a(true);
                            break;
                        case 5:
                            a2.d("SEARCH");
                            duoVar.a(true);
                            break;
                        case 6:
                            a2.d("SEND");
                            duoVar.a(true);
                            break;
                        case 7:
                        default:
                            duoVar.a(false);
                            break;
                        case 8:
                            a2.h(-10135);
                            duoVar.a(true);
                            break;
                        case 9:
                            a2.h(-10133);
                            duoVar.a(true);
                            break;
                        case 10:
                            a2.h(-10136);
                            duoVar.a(true);
                            break;
                        case 11:
                            duoVar.a(false);
                            break;
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            a2.h(-10137);
                            duoVar.a(true);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            a2.h(-10134);
                            duoVar.a(true);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            String obj = a2.d.a().c.toString();
                            duoVar.a(true);
                            hrx.y(a2.b);
                            hqt b = hqp.b();
                            if (b != null) {
                                a2.i.b();
                                dtu dtuVar = a2.g;
                                jav i3 = b.i();
                                dtt dttVar = new dtt();
                                TextToSpeech textToSpeech = new TextToSpeech(dtuVar.d, dttVar, "com.google.android.tts");
                                textToSpeech.setSpeechRate(1.0f);
                                textToSpeech.setOnUtteranceProgressListener(new dtr(dtuVar, textToSpeech));
                                dtuVar.f = iq.b(new dts(dtuVar, 1));
                                mko mkoVar = dtuVar.f;
                                Objects.requireNonNull(textToSpeech);
                                mkoVar.d(new dgd(textToSpeech, 20), dtuVar.e);
                                kcu.U(dttVar.b, new bpn(dtuVar, i3, textToSpeech, obj, 3), dtuVar.e);
                                kcu.U(dtuVar.f, new buo(a2, 18), a2.h);
                                break;
                            }
                            break;
                    }
                } else {
                    duoVar.a(false);
                }
            } else if (i2 == 1) {
                if (i == 2) {
                    fhpVar = (fhp) fhqVar.b;
                } else {
                    fhpVar = fhp.e;
                }
                boolean z = fhpVar.c;
                if (fhpVar.d) {
                    z |= true;
                }
                int i4 = fhpVar.b;
                if (i4 == 0) {
                    i4 = 1;
                }
                int i5 = fhpVar.a;
                for (int i6 = 0; i6 < i4; i6++) {
                    ?? r17 = z;
                    a2.g(new KeyEvent(0L, 0L, 0, i5, 0, r17 == true ? 1 : 0));
                    a2.g(new KeyEvent(0L, 0L, 1, i5, 0, r17));
                }
                duoVar.a(true);
            } else {
                ((ltd) ((ltd) dtp.a.c()).k("com/google/android/apps/inputmethod/libs/nga/impl/input/NgaInputManager", "performKeyboardAction", 348, "NgaInputManager.java")).t("Unrecognized action");
                duoVar.a(false);
            }
            this.f.f = a2.k();
            return;
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "performKeyboardAction", 510, "NgaExtension.java")).t("cannot perform action - no active input");
        duoVar.a(false);
    }

    @Override // defpackage.dun
    public final void k(bko bkoVar) {
        if (!this.c.k.b()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "updateKeyboardUi", 529, "NgaExtension.java")).w("cannot update UI in state %s", this.c.k);
            return;
        }
        dwi dwiVar = this.h;
        bkk bkkVar = bkoVar.b;
        if (bkkVar != null) {
            dwiVar.a.d(bkkVar);
        }
        if (bkoVar.a != null) {
            nfh t = bkn.c.t();
            bkr bkrVar = bkoVar.a;
            if (bkrVar == null) {
                bkrVar = bkr.d;
            }
            if (t.c) {
                t.cD();
                t.c = false;
            }
            bkn bknVar = (bkn) t.b;
            bkrVar.getClass();
            bknVar.b = bkrVar;
            bknVar.a = 1;
            dwiVar.g((bkn) t.cz());
        }
        if (bkoVar.c != null) {
            nfh t2 = bkn.c.t();
            bkr bkrVar2 = bkoVar.c;
            if (bkrVar2 == null) {
                bkrVar2 = bkr.d;
            }
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            bkn bknVar2 = (bkn) t2.b;
            bkrVar2.getClass();
            bknVar2.b = bkrVar2;
            bknVar2.a = 3;
            dwiVar.g((bkn) t2.cz());
        }
        if (bkoVar.d != null) {
            nfh t3 = bkn.c.t();
            bkr bkrVar3 = bkoVar.d;
            if (bkrVar3 == null) {
                bkrVar3 = bkr.d;
            }
            if (t3.c) {
                t3.cD();
                t3.c = false;
            }
            bkn bknVar3 = (bkn) t3.b;
            bkrVar3.getClass();
            bknVar3.b = bkrVar3;
            bknVar3.a = 5;
            dwiVar.g((bkn) t3.cz());
        }
        if (bkoVar.e != null) {
            nfh t4 = bkn.c.t();
            bkr bkrVar4 = bkoVar.e;
            if (bkrVar4 == null) {
                bkrVar4 = bkr.d;
            }
            if (t4.c) {
                t4.cD();
                t4.c = false;
            }
            bkn bknVar4 = (bkn) t4.b;
            bkrVar4.getClass();
            bknVar4.b = bkrVar4;
            bknVar4.a = 6;
            dwiVar.g((bkn) t4.cz());
        }
        if (bkoVar.f != null) {
            nfh t5 = bkn.c.t();
            bks bksVar = bkoVar.f;
            if (bksVar == null) {
                bksVar = bks.b;
            }
            if (t5.c) {
                t5.cD();
                t5.c = false;
            }
            bkn bknVar5 = (bkn) t5.b;
            bksVar.getClass();
            bknVar5.b = bksVar;
            bknVar5.a = 7;
            dwiVar.g((bkn) t5.cz());
        }
        if (bkoVar.g != null) {
            nfh t6 = bkn.c.t();
            bkr bkrVar5 = bkoVar.g;
            if (bkrVar5 == null) {
                bkrVar5 = bkr.d;
            }
            if (t6.c) {
                t6.cD();
                t6.c = false;
            }
            bkn bknVar6 = (bkn) t6.b;
            bkrVar5.getClass();
            bknVar6.b = bkrVar5;
            bknVar6.a = 10;
            dwiVar.g((bkn) t6.cz());
        }
        if (bkoVar.h == null) {
            return;
        }
        nfh t7 = bkn.c.t();
        bkr bkrVar6 = bkoVar.h;
        if (bkrVar6 == null) {
            bkrVar6 = bkr.d;
        }
        if (t7.c) {
            t7.cD();
            t7.c = false;
        }
        bkn bknVar7 = (bkn) t7.b;
        bkrVar6.getClass();
        bknVar7.b = bkrVar6;
        bknVar7.a = 13;
        dwiVar.g((bkn) t7.cz());
    }

    public final boolean l() {
        dup dupVar = this.g;
        if (((duz) dupVar).f) {
            return true;
        }
        if (!this.n.b() && this.p.a()) {
            return false;
        }
        dupVar.e();
        return false;
    }

    public final void m(dwi dwiVar, dup dupVar, dtp dtpVar) {
        dwiVar.d();
        dwiVar.f();
        if (this.c.k.f) {
            dtpVar.e();
            dtpVar.l = false;
            dupVar.d(fhz.TYPING);
        }
    }

    @Override // defpackage.dwh
    public final void n(int i) {
        this.g.f(i);
    }

    @Override // defpackage.dun
    public final void j(fhj fhjVar) {
        dsx dsxVar = this.c.k;
        if (!dsxVar.d || !dsxVar.e) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "updateDictatedText", 488, "NgaExtension.java")).w("cannot update dictated text in state %s", this.c.k);
            return;
        }
        dtp a2 = a();
        if (a2 != null) {
            a2.l = true;
            dsv dsvVar = dsv.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (dsvVar.f <= 0) {
                dsvVar.f = elapsedRealtime;
                few fewVar = (few) ((lfb) dsvVar.h.get()).d();
                if (dsvVar.b > 0) {
                    long j = elapsedRealtime - dsvVar.b;
                    dsvVar.g.g(dta.NGA_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                    if (few.AIAI.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_AIAI_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                    } else if (few.ON_DEVICE.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_ON_DEVICE_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                    } else if (few.S3.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_S3_MIC_TAP_TO_FIRST_TEXT_TIME, j);
                    }
                }
                if (dsvVar.d > 0) {
                    long j2 = elapsedRealtime - dsvVar.d;
                    dsvVar.g.g(dta.NGA_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                    if (few.AIAI.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_AIAI_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                    } else if (few.ON_DEVICE.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_ON_DEVICE_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                    } else if (few.S3.equals(fewVar)) {
                        dsvVar.g.g(dta.NGA_S3_SPEECH_START_TO_FIRST_TEXT_TIME, j2);
                    }
                }
            }
            bnq a3 = dvh.a(fhjVar, a2.f);
            StringBuilder sb = new StringBuilder();
            for (bns bnsVar : a3.a) {
                if (!bnsVar.c) {
                    sb.append(bnsVar.b);
                } else {
                    a2.b(bnsVar.b);
                }
            }
            a2.f();
            a2.n = sb.toString();
            a2.e.v(a3, jbv.a(true, a2.a().e));
            this.f.f = a2.k();
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "updateDictatedText", 497, "NgaExtension.java")).t("cannot update text - no active input");
        }
        dvl dvlVar = this.h.a.e;
        if (dvlVar == null) {
            return;
        }
        dvlVar.n();
    }
}
