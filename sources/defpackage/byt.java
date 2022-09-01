package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksForegroundTaskService;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: byt  reason: default package */
/* loaded from: classes.dex */
public final class byt extends jze implements bys {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/ForegroundDownloadTrackerImpl");
    public final Context e;
    private final idk f;
    public final Set b = Collections.synchronizedSet(new HashSet());
    public final List c = Collections.synchronizedList(new ArrayList());
    public final List d = Collections.synchronizedList(new ArrayList());
    private volatile int h = -1;
    private final Executor g = gxo.b(10);

    public byt(Context context) {
        ieh j = ieh.j();
        this.e = context;
        this.f = j;
    }

    private final void j(jtr jtrVar, boolean z) {
        this.f.e(bzs.b, jtrVar == null ? "Unknown" : jtrVar.b(), Boolean.valueOf(z));
    }

    private final void k(jtr jtrVar, int i, boolean z) {
        NotificationManager notificationManager = (NotificationManager) this.e.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        fen k = jtrVar == null ? null : bzd.a(this.e).k(jtrVar.b());
        if (!z && k == null) {
            return;
        }
        uh b = SuperpacksForegroundTaskService.b(this.e);
        if (k != null) {
            b.h(100, i, false);
            String string = k.a.getString(R.string.f188080_resource_name_obfuscated_res_0x7f14119e);
            if (fen.a()) {
                b.f(string);
            } else {
                b.g(string);
                b.f(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf(i)));
            }
        }
        notificationManager.notify(1, b.a());
    }

    private final boolean l(jsr jsrVar) {
        return this.b.contains(jsrVar);
    }

    @Override // defpackage.bys
    public final boolean a() {
        if (jam.y()) {
            return false;
        }
        if (!irv.b()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/ForegroundDownloadTrackerImpl", "canUseForegroundDownload", 263, "ForegroundDownloadTrackerImpl.java")).t("Foreground download is disabled since network is not available.");
            return false;
        }
        ino K = ino.K(this.e, null);
        long I = K.ai("fg_failure_interval_start") ? K.I("fg_failure_interval_start") : 0L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - I >= TimeUnit.HOURS.toMillis(1L)) {
            K.i("fg_failure_interval_start", currentTimeMillis);
            K.h("fg_download_failures", 0);
        }
        return K.D("fg_download_failures") < 2;
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void c(jsr jsrVar, String str, jtr jtrVar, Throwable th) {
        if (!l(jsrVar)) {
            return;
        }
        ino K = ino.K(this.e, null);
        K.h("fg_download_failures", K.D("fg_download_failures") + 1);
        this.b.remove(jsrVar);
        this.c.add(jsrVar);
        this.h = -1;
        j(jtrVar, false);
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void d(jsr jsrVar, String str, jtr jtrVar, long j, long j2) {
        int max;
        if (l(jsrVar) && (max = (int) Math.max(0L, Math.min(100L, (j * 100) / j2))) != this.h) {
            this.h = max;
            k(jtrVar, max, false);
        }
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void e(jsr jsrVar, String str, jtr jtrVar, long j, jsx jsxVar) {
        if (!l(jsrVar)) {
            return;
        }
        this.h = -1;
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void f(jsr jsrVar, String str, jtr jtrVar, long j) {
        if (!l(jsrVar)) {
            return;
        }
        this.b.remove(jsrVar);
        this.d.add(jsrVar);
        this.h = -1;
        j(jtrVar, true);
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void g(jsr jsrVar, boolean z) {
        mko mkoVar;
        if (l(jsrVar) && z && irv.b()) {
            jrh jrhVar = (jrh) jsrVar;
            String str = jrhVar.a;
            String str2 = jrhVar.b;
            NotificationManager notificationManager = (NotificationManager) this.e.getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
            fen k = bzd.a(this.e).k(str);
            if (k == null) {
                ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/ForegroundDownloadTrackerImpl", "updateNotificationWaitForWifi", 366, "ForegroundDownloadTrackerImpl.java")).w("updateNotificationWaitForWifi() cannot find notification updater for superpack %s", str);
                return;
            }
            uh b = SuperpacksForegroundTaskService.b(this.e);
            if (str.equals("speech-packs")) {
                ieh j = ieh.j();
                j.e(fbm.ON_DEVICE_FOREGROUND_AUTO_DOWNLOAD_STATUS, 3);
                String string = k.a.getString(R.string.f188080_resource_name_obfuscated_res_0x7f14119e);
                if (fen.a()) {
                    b.f(string);
                } else {
                    String string2 = k.a.getString(R.string.f188090_resource_name_obfuscated_res_0x7f1411a1);
                    b.g(string);
                    b.f(string2);
                }
                feo feoVar = k.b;
                mkoVar = mio.h(mio.h(feoVar.c.c(feoVar.e), new dvb(feoVar, str2, 12), feoVar.d), new fem(k, str2, j, b, 0), k.b.d);
            } else {
                ((ltd) ((ltd) feo.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/backend/ondevice/SpeechPackManager$SpeechpackNotificationUpdater", "updateNotificationWaitForWifi", 579, "SpeechPackManager.java")).w("Provided superpack name %s does not match on-device superpack name", str);
                mkoVar = mkk.a;
            }
            kcu.U(mkoVar, new cvt(notificationManager, b, str, 1), this.g);
        }
    }

    @Override // defpackage.jze, defpackage.jzd
    public final void h(jsr jsrVar, boolean z) {
        if (!z) {
            return;
        }
        this.b.add(jsrVar);
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void i(String str, jtr jtrVar, jxy jxyVar, long j) {
        this.h = -1;
    }

    @Override // defpackage.jze, defpackage.jwt
    public final void x(jsr jsrVar, String str, jtr jtrVar, long j) {
        if (!l(jsrVar)) {
            return;
        }
        this.h = 0;
        k(jtrVar, 0, true);
    }
}
