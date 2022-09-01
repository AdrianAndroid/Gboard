package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.google.android.apps.inputmethod.libs.voiceime.VoiceCircleView;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;
import java.util.concurrent.ScheduledFuture;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fal  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fal implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fal(VoiceCircleView voiceCircleView, int i) {
        this.b = i;
        this.a = voiceCircleView;
    }

    public /* synthetic */ fal(fam famVar, int i) {
        this.b = i;
        this.a = famVar;
    }

    public /* synthetic */ fal(fan fanVar, int i) {
        this.b = i;
        this.a = fanVar;
    }

    public /* synthetic */ fal(fby fbyVar, int i) {
        this.b = i;
        this.a = fbyVar;
    }

    public /* synthetic */ fal(fbz fbzVar, int i) {
        this.b = i;
        this.a = fbzVar;
    }

    public /* synthetic */ fal(fca fcaVar, int i) {
        this.b = i;
        this.a = fcaVar;
    }

    public /* synthetic */ fal(hky hkyVar, int i) {
        this.b = i;
        this.a = hkyVar;
    }

    public /* synthetic */ fal(hlf hlfVar, int i) {
        this.b = i;
        this.a = hlfVar;
    }

    public /* synthetic */ fal(hsk hskVar, int i) {
        this.b = i;
        this.a = hskVar;
    }

    public /* synthetic */ fal(opu opuVar, int i, byte[] bArr, byte[] bArr2) {
        this.b = i;
        this.a = opuVar;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [hsk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fes fesVar;
        View b;
        few fewVar = null;
        r4 = null;
        r4 = null;
        r4 = null;
        fbk fbkVar = null;
        switch (this.b) {
            case 0:
                fam famVar = (fam) this.a;
                famVar.b.d(famVar.a, famVar.c);
                return;
            case 1:
                fan fanVar = (fan) this.a;
                fex fexVar = fanVar.f;
                if (fexVar != null) {
                    fexVar.d();
                    if (fexVar.a() == few.ON_DEVICE || fexVar.a() == few.FALLBACK_ON_DEVICE) {
                        fexVar.b();
                    }
                    if (fan.c(fexVar.a())) {
                        fanVar.d.a();
                    }
                }
                ffd ffdVar = fanVar.g;
                if (ffdVar == null || (fesVar = fao.b) == null) {
                    return;
                }
                jav javVar = ffdVar.a;
                ((ltd) ((ltd) feb.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "maybeSchedulePackDownload", 265, "OnDeviceRecognitionProvider.java")).w("maybeSchedulePackDownload() for language tag %s", javVar);
                feb febVar = (feb) fesVar;
                if (!febVar.j(javVar)) {
                    if (!((Boolean) fbh.e.c()).booleanValue() || !febVar.i() || fdz.a(febVar.h) || febVar.j(javVar)) {
                        return;
                    }
                    kcu.U(febVar.d.d(javVar), new bvo(febVar, javVar, 19), febVar.e);
                    return;
                }
                ((ltd) ((ltd) feb.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceRecognitionProvider", "maybeSchedulePackDownload", 268, "OnDeviceRecognitionProvider.java")).t("maybeSchedulePackDownload() : Sync packs");
                febVar.d.i(javVar);
                if (febVar.f.al("ondevice_pack_auto_download_started", false, false) && !febVar.f.x(R.string.f162190_resource_name_obfuscated_res_0x7f1406fc, false)) {
                    febVar.f.q(R.string.f162190_resource_name_obfuscated_res_0x7f1406fc, true);
                    febVar.g.q(R.string.f160930_resource_name_obfuscated_res_0x7f14067d, true);
                    ieh.j().e(fbm.ON_DEVICE_AUTO_DOWNLOAD_STATUS, 2);
                }
                if (!((Boolean) fbh.e.c()).booleanValue()) {
                    return;
                }
                if (!febVar.g.x(R.string.f160930_resource_name_obfuscated_res_0x7f14067d, false)) {
                    febVar.g.q(R.string.f160930_resource_name_obfuscated_res_0x7f14067d, true);
                    ieh.j().e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 2);
                }
                if (fdy.c(febVar.f)) {
                    return;
                }
                febVar.i.a(gyc.b);
                return;
            case 2:
                ((VoiceCircleView) this.a).b();
                return;
            case 3:
                hkq.b((hlf) this.a);
                return;
            case 4:
                hkq.b((hlf) this.a);
                return;
            case 5:
                hkq.b(((hky) this.a).a());
                return;
            case 6:
                ((opu) this.a).t();
                return;
            case 7:
                this.a.at(hfd.d(fbr.c));
                return;
            case 8:
                Object obj = this.a;
                synchronized (((fby) obj).j) {
                    ((fby) obj).h.b(((fby) obj).k);
                    ((fby) obj).k.t();
                }
                return;
            case 9:
                Object obj2 = this.a;
                synchronized (((fby) obj2).j) {
                    ((fby) obj2).h.b(((fby) obj2).k);
                    ((fby) obj2).k.q();
                }
                return;
            case 10:
                Object obj3 = this.a;
                synchronized (((fby) obj3).j) {
                    ((fby) obj3).h.b(((fby) obj3).k);
                    ((fby) obj3).k.m();
                }
                return;
            case 11:
                ((fby) this.a).h(fff.TIMEOUT);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((fby) this.a).h(fff.TIMEOUT);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj4 = this.a;
                synchronized (((fby) obj4).j) {
                    if (((fby) obj4).i.f()) {
                        ((fby) obj4).k.s();
                    }
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj5 = this.a;
                fby fbyVar = (fby) obj5;
                fex fexVar2 = fbyVar.g.f;
                if (fexVar2 != null) {
                    fewVar = fexVar2.a();
                }
                if (fewVar == few.ON_DEVICE) {
                    return;
                }
                synchronized (fbyVar.j) {
                    faf fafVar = ((fby) obj5).h;
                    jbw jbwVar = ((fby) obj5).k;
                    if (((Boolean) ffa.j.c()).booleanValue() && fafVar.a.get() == 0) {
                        fafVar.c = 0;
                        fafVar.a.set(1);
                        fafVar.a(jbwVar);
                        fafVar.e = SystemClock.elapsedRealtime();
                        fafVar.b.e(fbm.VOICE_ELLIPSIS_SHOWN, new Object[0]);
                        fafVar.b.g(fbp.TIME_TO_ELLIPSIS_SHOW, fafVar.e - fafVar.d);
                    }
                }
                return;
            case 15:
                Object obj6 = this.a;
                ((ltd) ((ltd) fbz.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManagerWrapper", "shutdownVoiceInternal", 95, "VoiceInputManagerWrapper.java")).t("shutdownVoiceInternal()");
                synchronized (((fbz) obj6).f) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) ((fbz) obj6).e.getAndSet(null);
                    if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                        fby fbyVar2 = (fby) ((fbz) obj6).c.getAndSet(null);
                        if (fbyVar2 == null) {
                            return;
                        }
                        if (fbyVar2.m()) {
                            fbyVar2.k(fff.OTHER);
                        }
                        fan fanVar2 = fbyVar2.g;
                        if (fanVar2.f == null) {
                            return;
                        }
                        fanVar2.a.execute(new emq(fanVar2, 19));
                        return;
                    }
                    return;
                }
            case 16:
                fey feyVar = ((fca) this.a).c;
                if (feyVar == null) {
                    return;
                }
                fbk fbkVar2 = (fbk) feyVar;
                if (fbkVar2.l.b()) {
                    fbkVar2.a();
                    fbkVar2.l.a();
                    return;
                }
                fbkVar2.c(R.string.f188040_resource_name_obfuscated_res_0x7f141199);
                return;
            case 17:
                fey feyVar2 = ((fca) this.a).c;
                if (feyVar2 == null) {
                    return;
                }
                fbk fbkVar3 = (fbk) feyVar2;
                if (fbkVar3.l.b()) {
                    fbkVar3.a();
                    fbkVar3.l.a();
                    return;
                }
                fbkVar3.c(R.string.f188030_resource_name_obfuscated_res_0x7f141198);
                return;
            case 18:
                fca fcaVar = (fca) this.a;
                fey feyVar3 = fcaVar.c;
                if (feyVar3 == null) {
                    return;
                }
                feyVar3.b();
                fcaVar.c = null;
                return;
            case 19:
                fca fcaVar2 = (fca) this.a;
                Context context = fcaVar2.a;
                opu opuVar = fcaVar2.d;
                fay fayVar = ffb.b;
                fay fayVar2 = ffb.c;
                if (ffb.a != null) {
                    imn aa = new hso().aa();
                    if (aa == null) {
                        ((ltd) ((ltd) fbk.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeHeader", "newVoiceUi", 169, "VoiceImeHeader.java")).t("Cannot show voice header view due to null popupViewManager");
                    } else {
                        SoftKeyboardView a = fcq.a();
                        if (a != null && (b = fcq.b(a)) != null) {
                            fbkVar = new fbk(context, opuVar, aa, a, b, null, null);
                        }
                    }
                }
                fcaVar2.c = fbkVar;
                fey feyVar4 = fcaVar2.c;
                if (feyVar4 == null) {
                    return;
                }
                fbk fbkVar4 = (fbk) feyVar4;
                fbkVar4.c(R.string.f188020_resource_name_obfuscated_res_0x7f141197);
                hsk b2 = hsx.b();
                if (b2 == null) {
                    ((ltd) ((ltd) fbk.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceImeHeader", "setClearViewOnClickListener", 294, "VoiceImeHeader.java")).t("Service is null and could not be acquired.");
                } else {
                    fbkVar4.h.setOnClickListener(new eiz(fbkVar4, b2, 20));
                }
                ijl.b().h(fbkVar4.m, jce.class, mjl.a);
                if (hsx.c().i(ice.HEADER, R.id.f130700_resource_name_obfuscated_res_0x7f0b2201, false, hwv.PREEMPTIVE_NON_INTERRUPTIBLE, true)) {
                    View view = fbkVar4.d;
                    if (view != null) {
                        view.setVisibility(4);
                    } else {
                        gqh gqhVar = fbkVar4.e;
                        if (gqhVar != null) {
                            gqq.b(R.id.key_pos_header_access_points_menu, gqhVar);
                        }
                    }
                    View view2 = fbkVar4.f;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                    fbkVar4.j.start();
                }
                fbkVar4.k.e(fbkVar4.i, fbkVar4.b, 619, 0, 0, fbkVar4.j);
                ijf.j(jcj.b);
                return;
            default:
                fey feyVar5 = ((fca) this.a).c;
                return;
        }
    }
}
