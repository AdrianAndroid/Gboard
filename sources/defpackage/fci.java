package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.CrossProfileBundleCallSender;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: fci  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fci implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fci(fcr fcrVar, int i) {
        this.b = i;
        this.a = fcrVar;
    }

    public /* synthetic */ fci(fdy fdyVar, int i) {
        this.b = i;
        this.a = fdyVar;
    }

    public /* synthetic */ fci(fev fevVar, int i) {
        this.b = i;
        this.a = fevVar;
    }

    public /* synthetic */ fci(ffn ffnVar, int i) {
        this.b = i;
        this.a = ffnVar;
    }

    public /* synthetic */ fci(fgc fgcVar, int i) {
        this.b = i;
        this.a = fgcVar;
    }

    public /* synthetic */ fci(fjk fjkVar, int i) {
        this.b = i;
        this.a = fjkVar;
    }

    public /* synthetic */ fci(fjn fjnVar, int i) {
        this.b = i;
        this.a = fjnVar;
    }

    public fci(fpg fpgVar, int i) {
        this.b = i;
        this.a = fpgVar;
    }

    public /* synthetic */ fci(hlf hlfVar, int i) {
        this.b = i;
        this.a = hlfVar;
    }

    public /* synthetic */ fci(ino inoVar, int i) {
        this.b = i;
        this.a = inoVar;
    }

    public fci(opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = i;
        this.a = opuVar;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [fev, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hkq.b((hlf) this.a);
                return;
            case 1:
                ((aia) this.a).f("ondevice_banner", true);
                ((ltd) ((ltd) fcf.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/VoiceOnDeviceBanner", "lambda$maybeShowOnDeviceBanner$0", 52, "VoiceOnDeviceBanner.java")).t("on-device onboarding banner displayed");
                ieh.j().e(fbm.ON_DEVICE_AUTO_DOWNLOAD_BANNER, new Object[0]);
                return;
            case 2:
                ((fcr) this.a).a.a();
                return;
            case 3:
                ?? r0 = this.a;
                ((ltd) ((ltd) fcu.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/aiai/AiAiRecognitionRunner", "lambda$new$0", 115, "AiAiRecognitionRunner.java")).t("AiAi recognizer initialization failed");
                if (r0 == 0) {
                    return;
                }
                r0.e();
                return;
            case 4:
                fdy fdyVar = (fdy) this.a;
                fdyVar.c.f("has_shown_ondevice_notice", true);
                fdyVar.g.h();
                ((ltd) ((ltd) fdy.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadNotice", "lambda$maybePostNoticeToNoticeManager$0", 109, "OnDevicePackDownloadNotice.java")).t("on-device notice displayed");
                ieh.j().e(fbm.ON_DEVICE_AUTO_DOWNLOAD_NOTICE, new Object[0]);
                return;
            case 5:
                ((fdy) this.a).e.d();
                ((ltd) ((ltd) fdy.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadNotice", "lambda$maybePostNoticeToNoticeManager$1", 116, "OnDevicePackDownloadNotice.java")).t("on-device onboarding banner displayed");
                return;
            case 6:
                ((ffn) this.a).c(true);
                return;
            case 7:
                ((ffn) this.a).c(false);
                return;
            case 8:
                ((ffn) this.a).i = true;
                return;
            case 9:
                ((ffn) this.a).i = false;
                return;
            case 10:
                Object obj = this.a;
                ((ltd) ((ltd) fgc.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/s3/S3NetworkRecognizer", "handleInitializationFailure", 183, "S3NetworkRecognizer.java")).t("S3 recognizer initialization failed");
                fev fevVar = ((fgc) obj).j;
                if (fevVar == null) {
                    return;
                }
                fevVar.e();
                return;
            case 11:
                Object obj2 = this.a;
                Log.i("CrossProfileSender", "Attempting to bind");
                fjn fjnVar = (fjn) obj2;
                ScheduledFuture scheduledFuture = (ScheduledFuture) fjnVar.h.getAndSet(null);
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (!fjnVar.e) {
                    fjnVar.f("Required APIs are unavailable. Binding is not possible.");
                    return;
                } else if (fjnVar.p()) {
                    Log.i("CrossProfileSender", "Already bound");
                    fjnVar.h();
                    return;
                } else if (fjnVar.j.isEmpty()) {
                    fjnVar.f("Not trying to bind");
                    return;
                } else if (!fjnVar.p.a(fjnVar.c)) {
                    fjnVar.f("Permission not granted");
                    return;
                } else if (!fjnVar.o()) {
                    fjnVar.f("No profile available");
                    return;
                } else if (fjnVar.i.get() != null) {
                    Log.i("CrossProfileSender", "Already waiting to bind");
                    return;
                } else {
                    try {
                        ((fjn) obj2).i.set(((fjn) obj2).b.schedule(new fci((fjn) obj2, 12), 1L, TimeUnit.MINUTES));
                        Context context = ((fjn) obj2).c;
                        ComponentName componentName = ((fjn) obj2).d;
                        ServiceConnection serviceConnection = ((fjn) obj2).n;
                        UserHandle a = fjn.a(context, ((fjn) obj2).f);
                        if (a != null) {
                            Intent intent = new Intent();
                            intent.setComponent(componentName);
                            try {
                                if (((Boolean) context.getClass().getMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class).invoke(context, intent, serviceConnection, 1, a)).booleanValue()) {
                                    Log.i("CrossProfileSender", "binder.tryBind returned true, expecting onServiceConnected");
                                    return;
                                }
                                context.unbindService(serviceConnection);
                            } catch (IllegalAccessException e) {
                                e = e;
                                throw new fjy(e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                throw new fjy(e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                throw new fjy(e);
                            }
                        }
                        ((fjn) obj2).f("No profile available, app not installed in other profile, or service not included in manifest");
                        return;
                    } catch (fjy e4) {
                        Log.e("CrossProfileSender", "MissingApiException when trying to bind", e4);
                        fjnVar.g("Missing API", e4, false);
                        return;
                    } catch (fka e5) {
                        Log.e("CrossProfileSender", "Error while trying to bind", e5);
                        fjnVar.g(e5.getMessage(), e5, false);
                        return;
                    }
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((fjn) this.a).f("Timed out while waiting for onServiceConnected");
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj3 = this.a;
                Log.i("CrossProfileSender", "drainAsyncQueue");
                while (true) {
                    fjn fjnVar2 = (fjn) obj3;
                    fjm fjmVar = (fjm) fjnVar2.m.pollFirst();
                    if (fjmVar == null) {
                        return;
                    }
                    fjq fjqVar = new fjq(fjnVar2, fjmVar);
                    try {
                        fju fjuVar = (fju) ((fjn) obj3).g.get();
                        if (fjuVar != null) {
                            Bundle makeBundleCall = new CrossProfileBundleCallSender(fjuVar, fjmVar.a, fjmVar.b, fjqVar).makeBundleCall(fjmVar.c);
                            if (makeBundleCall.containsKey("throwable")) {
                                ((fjn) obj3).i(fjqVar.a);
                                throw new fjz((RuntimeException) fgy.b(makeBundleCall));
                            }
                        } else {
                            Log.w("CrossProfileSender", "OngoingCrossProfileCall: not bound anymore, adding back to queue");
                            ((fjn) obj3).m.add(fjmVar);
                            return;
                        }
                    } catch (fka unused) {
                        Log.w("CrossProfileSender", "OngoingCrossProfileCall: UnavailableProfileException, adding back to queue");
                        fjnVar2.m.add(fjmVar);
                        return;
                    }
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((fjk) this.a).a.g("onBindingDied", null, true);
                return;
            case 15:
                ((fjk) this.a).a.g("onNullBinding", null, true);
                return;
            case 16:
                fjk fjkVar = (fjk) this.a;
                fjkVar.a.m();
                fjkVar.a.k(new fka("Lost connection to other profile"));
                fjkVar.a.n();
                fjkVar.a.d();
                fjkVar.a.c();
                fjkVar.a.b();
                return;
            case 17:
                Object obj4 = this.a;
                Set set = fjn.a;
                fjn fjnVar3 = (fjn) obj4;
                if (fjnVar3.o() && fjnVar3.o != 2) {
                    fjnVar3.n();
                    return;
                } else if (fjnVar3.o() || fjnVar3.o == 1) {
                    return;
                } else {
                    fjnVar3.n();
                    return;
                }
            case 18:
                Object obj5 = this.a;
                Set set2 = fjn.a;
                ((fjn) obj5).e();
                return;
            case 19:
                ((fpg) this.a).h();
                return;
            default:
                fnw fnwVar = ((fpg) ((opu) this.a).a).b;
                fnwVar.f(String.valueOf(fnwVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
        }
    }
}
