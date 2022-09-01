package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.speech.tts.TextToSpeech;
import com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingMotionEventHandler;
import com.google.android.apps.inputmethod.libs.handwriting.keyboard.HandwritingOverlayView;
import com.google.android.apps.inputmethod.libs.hmmhandwriting.HmmHandwritingIme;
import com.google.android.apps.inputmethod.libs.japanese.keyboard.JapanesePrimeKeyboard;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.libraries.inputmethod.ime.AbstractIme;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: dgd  reason: default package */
/* loaded from: classes.dex */
public final class dgd implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dgd(TextToSpeech textToSpeech, int i) {
        this.b = i;
        this.a = textToSpeech;
    }

    public /* synthetic */ dgd(bvo bvoVar, int i, byte[] bArr) {
        this.b = i;
        this.a = bvoVar;
    }

    public dgd(HandwritingMotionEventHandler handwritingMotionEventHandler, int i) {
        this.b = i;
        this.a = handwritingMotionEventHandler;
    }

    public /* synthetic */ dgd(HmmHandwritingIme hmmHandwritingIme, int i) {
        this.b = i;
        this.a = hmmHandwritingIme;
    }

    public /* synthetic */ dgd(JapanesePrimeKeyboard japanesePrimeKeyboard, int i) {
        this.b = i;
        this.a = japanesePrimeKeyboard;
    }

    public /* synthetic */ dgd(LatinIme latinIme, int i) {
        this.b = i;
        this.a = latinIme;
    }

    public /* synthetic */ dgd(dgb dgbVar, int i) {
        this.b = i;
        this.a = dgbVar;
    }

    public dgd(dgk dgkVar, int i) {
        this.b = i;
        this.a = dgkVar;
    }

    public /* synthetic */ dgd(dif difVar, int i) {
        this.b = i;
        this.a = difVar;
    }

    public /* synthetic */ dgd(dlf dlfVar, int i) {
        this.b = i;
        this.a = dlfVar;
    }

    public /* synthetic */ dgd(dlg dlgVar, int i) {
        this.b = i;
        this.a = dlgVar;
    }

    public /* synthetic */ dgd(dne dneVar, int i) {
        this.b = i;
        this.a = dneVar;
    }

    public /* synthetic */ dgd(dnm dnmVar, int i) {
        this.b = i;
        this.a = dnmVar;
    }

    public /* synthetic */ dgd(dqv dqvVar, int i) {
        this.b = i;
        this.a = dqvVar;
    }

    public /* synthetic */ dgd(dtc dtcVar, int i) {
        this.b = i;
        this.a = dtcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mko b;
        dtm dtmVar;
        switch (this.b) {
            case 0:
                if (!((HandwritingMotionEventHandler) this.a).h.g()) {
                    return;
                }
                HandwritingMotionEventHandler handwritingMotionEventHandler = (HandwritingMotionEventHandler) this.a;
                handwritingMotionEventHandler.l.n(handwritingMotionEventHandler.f(HandwritingMotionEventHandler.a));
                ((HandwritingMotionEventHandler) this.a).l();
                return;
            case 1:
                dhp c = ((dgb) this.a).c();
                synchronized (c.e) {
                    c.f.close();
                    c.f = bze.a;
                }
                return;
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                dgk dgkVar = (dgk) this.a;
                long j = (currentTimeMillis - dgkVar.e) + 30;
                dgkVar.f += j;
                dgkVar.e = currentTimeMillis;
                dgkVar.i.c(((float) j) / 30.0f, dgkVar.b, dgkVar.a, dgkVar.h);
                ((dgk) this.a).i.d();
                boolean h = ((dgk) this.a).i.h();
                ((dgk) this.a).g++;
                System.currentTimeMillis();
                dgk dgkVar2 = (dgk) this.a;
                HandwritingOverlayView handwritingOverlayView = dgkVar2.a;
                gpq gpqVar = dgkVar2.b;
                ArrayList a = dgkVar2.i.a();
                Canvas canvas = handwritingOverlayView.b;
                if (canvas != null) {
                    canvas.save();
                    Canvas canvas2 = handwritingOverlayView.b;
                    canvas2.clipRect(0, 0, canvas2.getWidth(), handwritingOverlayView.b.getHeight());
                    handwritingOverlayView.b.drawColor(0, PorterDuff.Mode.CLEAR);
                    handwritingOverlayView.b.restore();
                    gpqVar.size();
                    int size = gpqVar.size();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 255;
                        if (i < size) {
                            gpp gppVar = (gpp) gpqVar.get(i);
                            if (a != null && a.size() > i2) {
                                i3 = ((Integer) a.get(i2)).intValue();
                            }
                            if (i3 != 0) {
                                handwritingOverlayView.j.b(i3);
                                handwritingOverlayView.j.g = i3 / 255.0f;
                                Iterator it = gppVar.iterator();
                                if (it.hasNext()) {
                                    gpo gpoVar = (gpo) it.next();
                                    handwritingOverlayView.d(gpoVar);
                                    while (it.hasNext()) {
                                        gpoVar = (gpo) it.next();
                                        handwritingOverlayView.e(gpoVar);
                                    }
                                    handwritingOverlayView.f(gpoVar);
                                } else {
                                    i++;
                                }
                            }
                            i2++;
                            i++;
                        } else {
                            handwritingOverlayView.j.b(255);
                            handwritingOverlayView.j.g = 1.0f;
                            handwritingOverlayView.invalidate();
                        }
                    }
                }
                ((dgk) this.a).b.size();
                System.currentTimeMillis();
                if (h) {
                    ((dgk) this.a).e(30L);
                    return;
                }
                Runnable runnable = ((dgk) this.a).j;
                if (runnable != null) {
                    runnable.run();
                }
                System.currentTimeMillis();
                dgk dgkVar3 = (dgk) this.a;
                dgkVar3.g = 0;
                dgkVar3.f = 0L;
                return;
            case 3:
                Object obj = this.a;
                ltg ltgVar = dij.f;
                ((dif) obj).a.a();
                return;
            case 4:
                ((HandwritingIme) this.a).A(new ArrayList());
                return;
            case 5:
                HmmHandwritingIme hmmHandwritingIme = (HmmHandwritingIme) this.a;
                iav iavVar = hmmHandwritingIme.F;
                jav javVar = iavVar == null ? jav.d : iavVar.e;
                if (HmmHandwritingIme.o.equals(javVar)) {
                    hmmHandwritingIme.s = new diy(dxu.l(hmmHandwritingIme.D).K("zh-t-i0-handwriting"));
                    hmmHandwritingIme.t = dxu.l(hmmHandwritingIme.D).P();
                    return;
                } else if (HmmHandwritingIme.p.equals(javVar)) {
                    hmmHandwritingIme.s = new diy(fgj.l(hmmHandwritingIme.D).K("zh-hant-t-i0-und-x-i0-handwriting"));
                    hmmHandwritingIme.t = fgj.l(hmmHandwritingIme.D).M(3);
                    return;
                } else if (!HmmHandwritingIme.q.equals(javVar)) {
                    ((luc) HmmHandwritingIme.n.a(hip.a).k("com/google/android/apps/inputmethod/libs/hmmhandwriting/HmmHandwritingIme", "createEngine", 122, "HmmHandwritingIme.java")).w("Language %s not supported", javVar);
                    return;
                } else {
                    hmmHandwritingIme.s = new diy(btg.a(hmmHandwritingIme.D).m());
                    hmmHandwritingIme.t = btg.a(hmmHandwritingIme.D).M(3);
                    return;
                }
            case 6:
                JapanesePrimeKeyboard japanesePrimeKeyboard = (JapanesePrimeKeyboard) this.a;
                japanesePrimeKeyboard.t.h("ja_shift_lock_hint_show_count", japanesePrimeKeyboard.t.b("ja_shift_lock_hint_show_count", 0) + 1);
                japanesePrimeKeyboard.t.i("ja_shift_lock_hint_last_show_time", System.currentTimeMillis());
                return;
            case 7:
                ((dlg) this.a).y();
                return;
            case 8:
                ((dlf) this.a).b(4);
                return;
            case 9:
                dne dneVar = (dne) this.a;
                dneVar.ah = null;
                hqy hqyVar = dneVar.ak;
                mko f = hqyVar.f();
                kcu.U(f, new buo(dneVar, 15), gyc.b);
                mko[] mkoVarArr = new mko[2];
                hrx hrxVar = (hrx) hqyVar;
                if (!hrxVar.n) {
                    ((ltd) ((ltd) hrx.a.c()).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager", "getSuggestedLanguagesAvailableForEnabling", 1185, "InputMethodEntryManager.java")).t("getSuggestedLanguagesAvailableForEnabling is called before initialized");
                    b = kcu.K(llp.q());
                } else {
                    b = hjk.a() ? hiz.k(kcu.R(iq.b(new dts(hrxVar, 2)), 5L, TimeUnit.SECONDS, gxo.a(1))).v(new eoi(hrxVar, 19), mjl.a).b(TimeoutException.class, new eoi(hrxVar, 20), mjl.a) : hrxVar.F(null);
                }
                mkoVarArr[0] = b;
                mkoVarArr[1] = f;
                dneVar.ae = mio.g(new mjg(llp.p(mkoVarArr), false), new cus(dneVar, 8), gyc.b);
                return;
            case 10:
                ((aih) this.a).b.Y(0);
                return;
            case 11:
                ((dnm) this.a).aO();
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dnm.aT((dnm) ((bvo) this.a).b);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                dnm.aT((dnm) ((bvo) this.a).b);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                LatinIme latinIme = (LatinIme) this.a;
                latinIme.E.hu(0, 0, "", "", "", "", "");
                latinIme.H();
                latinIme.k(false, false, 3);
                return;
            case 15:
                Object obj2 = this.a;
                LatinIme latinIme2 = (LatinIme) obj2;
                if (!latinIme2.k.z()) {
                    return;
                }
                latinIme2.k.n();
                latinIme2.E.hY(((AbstractIme) obj2).J);
                return;
            case 16:
                LatinIme latinIme3 = (LatinIme) this.a;
                cbk.a(new bof(latinIme3, 15));
                enx enxVar = latinIme3.l;
                if (enxVar != null && enxVar.h) {
                    return;
                }
                latinIme3.z(true, 0L);
                latinIme3.E.O(hfd.d(new iay(-10126, null, null)));
                return;
            case 17:
                Object obj3 = this.a;
                AbstractIme abstractIme = (AbstractIme) obj3;
                if (!abstractIme.J) {
                    return;
                }
                LatinIme latinIme4 = (LatinIme) obj3;
                if (!latinIme4.k.z()) {
                    return;
                }
                latinIme4.k.n();
                latinIme4.E.hY(abstractIme.J);
                return;
            case 18:
                Object obj4 = this.a;
                try {
                    ((dqv) obj4).b(((dqv) obj4).d.open(((dqv) obj4).e));
                    return;
                } catch (IOException e) {
                    ((luc) ((luc) ((luc) dqv.a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/mozc/ime/CandidateDescriptionGenerator", "lambda$loadCandidateDescriptionDataFromAssetAsync$0", 140, "CandidateDescriptionGenerator.java")).w("Failed to load content description file: %s", ((dqv) obj4).e);
                    return;
                }
            case 19:
                dtc dtcVar = (dtc) this.a;
                dth dthVar = dtcVar.i;
                if (dthVar != null && (dtmVar = dthVar.c) != null) {
                    dtmVar.k();
                }
                dtcVar.c().z(hfd.d(new iay(-10042, null, null)));
                dtcVar.g.a();
                ((ltd) ((ltd) dtc.a.d()).k("com/google/android/apps/inputmethod/libs/nga/impl/NgaExtension", "onNgaMicTapHandshakeTimeout", 401, "NgaExtension.java")).t("Failed to handle mic tap.");
                ieh.j().e(dua.NGA_MIC_TAP_NOT_HANDLED, new Object[0]);
                return;
            default:
                ((TextToSpeech) this.a).shutdown();
                return;
        }
    }
}
