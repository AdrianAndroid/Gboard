package com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OnDeviceDownloadNowReceiver extends BroadcastReceiver {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDownloadNowReceiver");

    private static void a(ieh iehVar) {
        iehVar.e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 6);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ieh j = ieh.j();
        j.e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 5);
        String stringExtra = intent.getStringExtra("language_tag");
        if (TextUtils.isEmpty(stringExtra)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDownloadNowReceiver", "onReceive", 36, "OnDeviceDownloadNowReceiver.java")).t("Language tag not provided!");
            a(j);
            return;
        }
        Parcelable.Creator creator = jav.CREATOR;
        try {
            jav f = jav.f(stringExtra);
            feo c = feo.c(context, "speech-packs");
            ((ltd) ((ltd) feo.a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager", "cancelRunningDownloads", 639, "SpeechPackManager.java")).t("cancelRunningDownloads()");
            bze bzeVar = c.c;
            String str = c.e;
            bzr bzrVar = (bzr) bzeVar;
            kcu.U(mio.h(mio.h(mkh.q(bzrVar.m(str)), new bzh(bzrVar, str, 0), bzrVar.i), new bzh(bzrVar, str, 1), bzrVar.i), new eay(c, 15), c.d);
            if (!Objects.equals(f, jav.d)) {
                c.j(f);
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDownloadNowReceiver", "onReceive", 73, "OnDeviceDownloadNowReceiver.java")).t("Language tag was not updated, skipping syncPacksNow()");
            }
        } catch (IllegalArgumentException e) {
            a(j);
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDeviceDownloadNowReceiver", "onReceive", 49, "OnDeviceDownloadNowReceiver.java")).w("Cannot convert provided language string %s to language tag", stringExtra);
        }
    }
}
