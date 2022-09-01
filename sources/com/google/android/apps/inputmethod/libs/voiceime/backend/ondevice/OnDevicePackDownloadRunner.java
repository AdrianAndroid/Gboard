package com.google.android.apps.inputmethod.libs.voiceime.backend.ondevice;

import android.content.Context;
import android.os.PersistableBundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OnDevicePackDownloadRunner implements isc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadRunner");
    public static final isn b;
    private final ino c;
    private final feo d;

    static {
        isn a2 = iso.a("ondevice_pack_download_task", OnDevicePackDownloadRunner.class.getName());
        a2.m = true;
        a2.k = 3;
        a2.l = true;
        a2.b();
        b = a2;
    }

    public OnDevicePackDownloadRunner(Context context) {
        feo c = feo.c(context, "speech-packs");
        this.c = ino.K(context, null);
        this.d = c;
    }

    @Override // defpackage.isc
    public final isb a(jls jlsVar) {
        return isb.FINISHED;
    }

    @Override // defpackage.isc
    public final mko b(jls jlsVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/OnDevicePackDownloadRunner", "onRunTask", 80, "OnDevicePackDownloadRunner.java")).w("onRunTask() : Tag = %s", jlsVar.b);
        ieh.j().e(fbm.ON_DEVICE_AUTO_DOWNLOAD_STATUS, 1);
        Object obj = jlsVar.a;
        if (obj != null) {
            PersistableBundle persistableBundle = (PersistableBundle) obj;
            if (!lfd.e(persistableBundle.getString("language_tag"))) {
                this.c.f("ondevice_pack_auto_download_started", true);
                this.d.i(jav.f(persistableBundle.getString("language_tag")));
                return isc.o;
            }
        }
        return isc.q;
    }
}
