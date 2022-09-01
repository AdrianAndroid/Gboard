package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.inputmethod.libs.theme.builder.ThemeBuilderActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: eay  reason: default package */
/* loaded from: classes.dex */
public final class eay implements mka {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eay(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public eay(clx clxVar, int i) {
        this.b = i;
        this.a = clxVar;
    }

    public eay(duz duzVar, int i) {
        this.b = i;
        this.a = duzVar;
    }

    public eay(eay eayVar, int i, byte[] bArr) {
        this.b = i;
        this.a = eayVar;
    }

    public eay(eoh eohVar, int i) {
        this.b = i;
        this.a = eohVar;
    }

    public eay(epl eplVar, int i) {
        this.b = i;
        this.a = eplVar;
    }

    public eay(ett ettVar, int i) {
        this.b = i;
        this.a = ettVar;
    }

    public eay(eyf eyfVar, int i) {
        this.b = i;
        this.a = eyfVar;
    }

    public eay(eym eymVar, int i) {
        this.b = i;
        this.a = eymVar;
    }

    public eay(fax faxVar, int i) {
        this.b = i;
        this.a = faxVar;
    }

    public eay(feo feoVar, int i) {
        this.b = i;
        this.a = feoVar;
    }

    public eay(fev fevVar, int i) {
        this.b = i;
        this.a = fevVar;
    }

    public eay(ffd ffdVar, int i) {
        this.b = i;
        this.a = ffdVar;
    }

    public eay(fwi fwiVar, int i) {
        this.b = i;
        this.a = fwiVar;
    }

    public eay(gic gicVar, int i) {
        this.b = i;
        this.a = gicVar;
    }

    public eay(gkw gkwVar, int i) {
        this.b = i;
        this.a = gkwVar;
    }

    public eay(hit hitVar, int i) {
        this.b = i;
        this.a = hitVar;
    }

    public eay(hrx hrxVar, int i) {
        this.b = i;
        this.a = hrxVar;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v38, types: [fev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v47, types: [fev, java.lang.Object] */
    @Override // defpackage.mka
    public final void a(Throwable th) {
        switch (this.b) {
            case 0:
                ((ltd) ((ltd) ((ltd) eaz.l.d()).i(th)).k("com/google/android/apps/inputmethod/libs/search/emoji/standard/EmojiSearchExtension$1", "onFailure", (char) 185, "EmojiSearchExtension.java")).t("Failed to get superpacks version.");
                ieh.j().e(ctd.SEARCH_EMOJI_DATA_ERROR, this.a, 0);
                return;
            case 1:
                ((ltd) ((ltd) ((ltd) duz.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient$1", "onFailure", (char) 154, "NgaGrpcClient.java")).t("Handshake failed!");
                ((duz) this.a).a();
                return;
            case 2:
                ((ltd) ((ltd) ((ltd) eoh.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerDataManager$1", "onFailure", (char) 555, "SpellCheckerDataManager.java")).t("Failed to sync pack set.");
                ((eoh) this.a).e.set(System.currentTimeMillis());
                eoh.d((eoh) this.a);
                return;
            case 3:
                ((ltd) ((ltd) ((ltd) ThemeBuilderActivity.m.d()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/builder/ThemeBuilderActivity$1$1", "onFailure", (char) 173, "ThemeBuilderActivity.java")).t("purgeBitmapToCacheFile failed.");
                ((epl) this.a).a.v();
                ((epl) this.a).c();
                return;
            case 4:
                ((ltd) ((ltd) ((ltd) etq.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsPreviewManager$1", "onFailure", (char) 251, "ThemeDetailsPreviewManager.java")).t("get current input method entry failed.");
                return;
            case 5:
                ((ltd) ((ltd) ((ltd) ett.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeIndicesSuperpacksManager$1$1", "onFailure", (char) 193, "ThemeIndicesSuperpacksManager.java")).t("getSuperpackManifest()");
                return;
            case 6:
                ((ltd) ((ltd) ((ltd) ett.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeIndicesSuperpacksManager$1", "onFailure", (char) 202, "ThemeIndicesSuperpacksManager.java")).t("getRegisteredVersion()");
                return;
            case 7:
                ((ltd) ((ltd) ((ltd) ewm.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/examplestoreservice/EkhoExampleStoreSource$1", "onFailure", 'P', "EkhoExampleStoreSource.java")).t("startQuery() failed.");
                this.a.a(13, th.getMessage());
                return;
            case 8:
                ((ltd) ((ltd) ((ltd) eyf.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksManager$1", "onFailure", (char) 232, "SanityCheckEvalSuperpacksManager.java")).t("triggerSync() : Failure");
                ((eyf) this.a).f.set(kcu.J(th));
                return;
            case 9:
                ((ltd) ((ltd) ((ltd) faa.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/translate/TwsTranslator$2", "onFailure", (char) 272, "TwsTranslator.java")).t("Exception while doTranslate");
                return;
            case 10:
                ((ltd) ((ltd) ((ltd) fax.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationIntroDialog$3", "onFailure", (char) 308, "VoiceDonationIntroDialog.java")).t("Failed to send audit record when the user opt-in voice donation");
                fax faxVar = (fax) this.a;
                if (faxVar.e) {
                    final Context context = faxVar.getContext();
                    fax faxVar2 = (fax) this.a;
                    final IBinder iBinder = faxVar2.c;
                    final int i = faxVar2.d;
                    hsk b = hsx.b();
                    if (b == null) {
                        ((ltd) ((ltd) fas.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationErrorToast", "show", 30, "VoiceDonationErrorToast.java")).t("No service. Cannot show voice donation error toast.");
                        return;
                    }
                    View G = b.G();
                    if (G == null) {
                        ((ltd) ((ltd) fas.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationErrorToast", "show", 36, "VoiceDonationErrorToast.java")).t("keyboardBody is null. Cannot show voice donation error toast.");
                        return;
                    } else {
                        gyc.b.execute(new fal(jdg.f(hyq.g(G, b.y()), "voice_donation_error_toast", context.getString(R.string.f187930_resource_name_obfuscated_res_0x7f14118e), context.getString(R.string.f187880_resource_name_obfuscated_res_0x7f141189), context.getString(R.string.f187870_resource_name_obfuscated_res_0x7f141188), new View.OnClickListener() { // from class: far
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                fbf.j(context, iBinder, i, true);
                                hkp.b("voice_donation_error_toast", false);
                            }
                        }).a(), 4));
                        return;
                    }
                }
                ker.p(faxVar.getContext(), R.string.f187930_resource_name_obfuscated_res_0x7f14118e, new Object[0]);
                return;
            case 11:
                ((ltd) ((ltd) ((ltd) fbf.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager$2", "onFailure", (char) 478, "VoiceDonationPromoManager.java")).t("Failed to send audit record when the user opt-out voice donation");
                ker.p((Context) this.a, R.string.f187940_resource_name_obfuscated_res_0x7f14118f, new Object[0]);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((ltd) ((ltd) ((ltd) fby.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceInputManager$1", "onFailure", 347, "VoiceInputManager.java")).w("resumeRecognition(%s) : Failed to log voice start.", this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((ltd) ((ltd) ((ltd) fej.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper$1", "onFailure", '\\', "SodaRecognizerWrapper.java")).t("startRecognition() : Task failed.");
                this.a.j(1);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((ltd) ((ltd) ((ltd) feo.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$1", "onFailure", 346, "SpeechPackManager.java")).w("cancelDownloadsAndDeletePacks() : Failed to release %s", ((feo) this.a).e);
                return;
            case 15:
                ((ltd) ((ltd) ((ltd) feo.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$4", "onFailure", 651, "SpeechPackManager.java")).w("cancelRunningDownloads() : Failed to stop running downloads for %s", ((feo) this.a).e);
                return;
            case 16:
                ((ltd) ((ltd) ((ltd) fgf.a.d()).i(th)).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3SpeechRecognizer$1", "onFailure", '\\', "S3SpeechRecognizer.java")).t("Recognition task failed.");
                this.a.j(3);
                return;
            case 17:
                ((ltd) ((ltd) gic.a.b()).k("com/google/android/libraries/assistant/soda/SodaAudioPusher$1", "onFailure", 125, "SodaAudioPusher.java")).w("Failed with: %s", th.getMessage());
                ((gic) this.a).f.n(th);
                ((gic) this.a).a();
                return;
            case 18:
                if (th instanceof blb) {
                    ((gkw) this.a).c.c(new bln((blb) th));
                } else if (th instanceof bmd) {
                    ((gkw) this.a).c.c(new bln((bmd) th));
                } else {
                    ((gkw) this.a).c.n(th);
                }
                ((gkw) this.a).a();
                return;
            case 19:
                ((hrx) this.a).B.set(null);
                ((ltd) ((ltd) ((ltd) hrx.a.d()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$3", "onFailure", (char) 520, "InputMethodEntryManager.java")).t("Failed to load ImeListDef");
                return;
            default:
                if (((hrx) this.a).C.getAndSet(null) == null) {
                    return;
                }
                ((ltd) ((ltd) ((ltd) hrx.a.d()).i(th)).k("com/google/android/libraries/inputmethod/inputmethodentry/InputMethodEntryManager$4", "onFailure", (char) 548, "InputMethodEntryManager.java")).t("Failed to load global ime defs.");
                ((hrx) this.a).R(llp.q());
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143, types: [hsa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v52, types: [fwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [eym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [hit, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.view.View] */
    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        fgu fguVar;
        fgw fgwVar;
        int i = 3;
        int i2 = 0;
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                ieh j = ieh.j();
                ctd ctdVar = ctd.SEARCH_EMOJI_DATA_ERROR;
                Object[] objArr = new Object[2];
                objArr[0] = this.a;
                if (num != null) {
                    i2 = num.intValue();
                }
                objArr[1] = Integer.valueOf(i2);
                j.e(ctdVar, objArr);
                return;
            case 1:
                fis fisVar = (fis) obj;
                int i3 = fisVar.a;
                if (i3 != 0) {
                    i = i3 != 1 ? i3 != 2 ? 0 : 2 : 1;
                }
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    if (i3 == 1) {
                        fguVar = (fgu) fisVar.b;
                    } else {
                        fguVar = fgu.e;
                    }
                    ((ltd) ((ltd) duz.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient$1", "onSuccess", 132, "NgaGrpcClient.java")).y("Handshake done; eligibility: %s config_eligibility: %s", fguVar.a, fguVar.b);
                    duz duzVar = (duz) this.a;
                    duzVar.h(duzVar.d, dzg.h(fguVar));
                    return;
                } else if (i4 == 1) {
                    if (i3 == 2) {
                        fgwVar = (fgw) fisVar.b;
                    } else {
                        fgwVar = fgw.f;
                    }
                    ((ltd) ((ltd) duz.a.b()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient$1", "onSuccess", 140, "NgaGrpcClient.java")).z("Handshake done; eligibility: %s locale_config_eligibility: %s", fgwVar.a, Collections.unmodifiableMap(new nfz(fgwVar.c, fgw.g)));
                    duz duzVar2 = (duz) this.a;
                    duzVar2.h(duzVar2.d, fgwVar);
                    return;
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    ((ltd) ((ltd) duz.a.c()).k("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaGrpcClient$1", "onSuccess", 146, "NgaGrpcClient.java")).t("Handshake failed: eligibility_message not set.");
                    ((duz) this.a).a();
                    return;
                }
            case 2:
                byy byyVar = (byy) obj;
                ((eoh) this.a).f.set(false);
                ((eoh) this.a).g.set(false);
                if (byyVar != null) {
                    Object obj2 = this.a;
                    Collection<juc> g = byyVar.g();
                    HashSet hashSet = new HashSet();
                    for (juc jucVar : g) {
                        eoh eohVar = (eoh) obj2;
                        eof eofVar = new eof(eohVar, jucVar);
                        eog a = eog.a(eofVar.a, eofVar.b);
                        hashSet.add(a);
                        eof eofVar2 = (eof) eohVar.b.get(a);
                        if (eofVar2 == null || eofVar2.d().equals(eofVar.d())) {
                            if (eofVar2 != null) {
                                eofVar2.close();
                            }
                            eohVar.b.put(a, eofVar);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    eoh eohVar2 = (eoh) obj2;
                    for (eog eogVar : eohVar2.b.keySet()) {
                        if (!hashSet.contains(eogVar)) {
                            arrayList.add(eogVar);
                        }
                    }
                    int size = arrayList.size();
                    while (i2 < size) {
                        eof eofVar3 = (eof) eohVar2.b.remove((eog) arrayList.get(i2));
                        if (eofVar3 != null) {
                            eofVar3.close();
                        }
                        i2++;
                    }
                }
                eoh.d((eoh) this.a);
                ((eoh) this.a).d.set(System.currentTimeMillis());
                ((eoh) this.a).e.set(0L);
                synchronized (((eoh) this.a).d) {
                    ((eoh) this.a).d.notifyAll();
                }
                return;
            case 3:
                gyc.b.execute(new elr(this, (lym) obj, 5, (byte[]) null));
                return;
            case 4:
                hqt hqtVar = (hqt) obj;
                if (hqtVar == null) {
                    return;
                }
                iav g2 = hqtVar.g();
                if (g2 == null) {
                    ((ltd) ((ltd) etq.a.c()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsPreviewManager$1", "onSuccess", 241, "ThemeDetailsPreviewManager.java")).w("no imeDef found for %s", hqtVar.i());
                    return;
                } else {
                    this.a.a(g2, hqtVar);
                    return;
                }
            case 5:
                ((ett) ((eay) this.a).a).f.set((jqm) obj);
                return;
            case 6:
                Integer num2 = (Integer) obj;
                if (num2 == null || num2.intValue() == -1) {
                    return;
                }
                ((ett) this.a).g.set(num2.intValue());
                kcu.U(((ett) this.a).d.d("theme_indices", num2.intValue()), new eay(this, 5, null), ((ett) this.a).e);
                return;
            case 7:
                this.a.b((fwh) obj);
                return;
            case 8:
                ((ltd) ((ltd) eyf.a.b()).k("com/google/android/apps/inputmethod/libs/trainingcache/replaycache/sanitycheckeval/superpacks/SanityCheckEvalSuperpacksManager$1", "onSuccess", 225, "SanityCheckEvalSuperpacksManager.java")).t("triggerSync() : Success");
                ((eyf) this.a).f.set(kcu.K((jre) obj));
                return;
            case 9:
                this.a.a((ezr) obj);
                return;
            case 10:
                Status status = (Status) obj;
                ((ltd) ((ltd) fax.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationIntroDialog$3", "onSuccess", 295, "VoiceDonationIntroDialog.java")).t("user opt-in voice donation");
                Context context = ((fax) this.a).getContext();
                fay.f(context, true);
                ino.M(context).i("voice_donation_opt_in_timestamp", System.currentTimeMillis());
                fay.e(context, false);
                if (!((fax) this.a).e) {
                    return;
                }
                hsk b = hsx.b();
                if (b == null) {
                    ((ltd) ((ltd) faq.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationConfirmationBanner", "showVoiceConfirmationBanner", 34, "VoiceDonationConfirmationBanner.java")).t("No service. Cannot show voice donation confirmation banner.");
                    return;
                }
                ViewGroup L = b.L(ice.HEADER);
                if (L == null) {
                    ((ltd) ((ltd) faq.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationConfirmationBanner", "showVoiceConfirmationBanner", 40, "VoiceDonationConfirmationBanner.java")).t("keyboardHeader is null. Cannot show voice donation confirmation banner.");
                    return;
                }
                ?? findViewById = L.findViewById(R.id.f56120_resource_name_obfuscated_res_0x7f0b0258);
                hky a2 = hlf.a();
                a2.p("voice_donation_confirm_banner");
                a2.m = 1;
                a2.s(R.layout.f146990_resource_name_obfuscated_res_0x7f0e0608);
                a2.m(3000L);
                a2.k(true);
                a2.i(true);
                a2.g(context.getString(R.string.f187740_resource_name_obfuscated_res_0x7f14117b));
                a2.a = fcc.b;
                if (findViewById != 0) {
                    L = findViewById;
                }
                a2.c = L;
                a2.d = bwe.e;
                gyc.b.execute(new fal(a2.a(), 3));
                return;
            case 11:
                Status status2 = (Status) obj;
                fay.f((Context) this.a, false);
                ino.M((Context) this.a).i("voice_donation_opt_out_timestamp", System.currentTimeMillis());
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Void r0 = (Void) obj;
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Void r02 = (Void) obj;
                ((ltd) ((ltd) fej.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SodaRecognizerWrapper$1", "onSuccess", 87, "SodaRecognizerWrapper.java")).t("startRecognition() : Exited successfully.");
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r03 = (Void) obj;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$1", "onSuccess", 341, "SpeechPackManager.java")).w("cancelDownloadsAndDeletePacks() : Released %s", ((feo) this.a).e);
                return;
            case 15:
                Void r04 = (Void) obj;
                ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$4", "onSuccess", 645, "SpeechPackManager.java")).w("cancelRunningDownloads() : Stopped running downloads for  %s", ((feo) this.a).e);
                return;
            case 16:
                Void r05 = (Void) obj;
                return;
            case 17:
                Void r06 = (Void) obj;
                ((gic) this.a).f.c(null);
                ((gic) this.a).a();
                return;
            case 18:
                nwo nwoVar = (nwo) obj;
                try {
                    bmq bmqVar = ((gkw) this.a).a.r;
                    int i5 = nwoVar.a;
                    int[] iArr = bmqVar.b;
                    while (i2 < 4) {
                        if (iArr[i2] == i5) {
                            Object obj3 = this.a;
                            ((gkw) obj3).c.c(new bmj(nwoVar, ((gkw) obj3).b, null));
                            return;
                        }
                        i2++;
                    }
                    if (nwoVar.c()) {
                        jdg.u(nwoVar.b("Location", null));
                        throw new bmg(nwoVar, null);
                    }
                    throw new bmd(nwoVar, null);
                } catch (bmd e) {
                    a(e);
                    return;
                }
            case 19:
                kdr kdrVar = (kdr) obj;
                if (((hrx) this.a).B.getAndSet(null) == null) {
                    return;
                }
                ((hrx) this.a).P = kdrVar;
                ((hrx) this.a).R.h(new jfk());
                ((hrx) this.a).R.h(new jfm());
                ((hrx) this.a).R.h(new jfw());
                ((hrx) this.a).R.h(new jft());
                ?? r07 = this.a;
                hrx hrxVar = (hrx) r07;
                hrxVar.u = new hsb(r07, hrxVar.P, ((hrx) this.a).R, null);
                ((hrx) this.a).o = new hrc(new opu(this, (byte[]) null), kdrVar, llp.o(((hrx) this.a).I), null, null, null, null, null);
                ((hrx) this.a).I = null;
                ijf.j(hrx.d);
                return;
            default:
                llp llpVar = (llp) obj;
                if (((hrx) this.a).C.getAndSet(null) == null) {
                    return;
                }
                ((hrx) this.a).R(llpVar);
                return;
        }
    }
}
