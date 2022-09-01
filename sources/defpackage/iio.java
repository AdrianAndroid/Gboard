package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.net.PlayServicesCronetProvider;
import j$.time.Duration;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* renamed from: iio  reason: default package */
/* loaded from: classes.dex */
public final class iio implements iid {
    private static final hic d;
    private final iif e;
    private final Executor f;
    private final fws g;
    private static final ltg b = ltg.j("com/google/android/libraries/inputmethod/net/cronet/CronetClient");
    private static final long c = gvu.MEBIBYTES.b(10);
    public static final lgb a = jdg.n(cqg.s);

    static {
        nfh t = njc.b.t();
        t.eg("www.google.com");
        t.eg("www.gstatic.com");
        t.eg("www.googleapis.com");
        t.eg("tenor.googleapis.com");
        t.eg("media.googleusercontent.com");
        t.eg("c.tenor.com");
        t.eg("eyckavatar-pa.googleapis.com");
        t.eg("autopush-eyckavatar-pa.sandbox.googleapis.com");
        t.eg("sticker-pa.googleapis.com");
        t.eg("autopush-sticker-pa.sandbox.googleapis.com");
        d = hhq.k("http_client_cronet_quic_hint_hosts", (njc) t.cz());
    }

    public iio(fws fwsVar, iif iifVar, Executor executor, byte[] bArr, byte[] bArr2) {
        this.g = fwsVar;
        this.f = executor;
        this.e = iifVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Exception a(Exception exc) {
        Throwable cause = exc.getCause();
        return cause instanceof Exception ? (Exception) cause : exc;
    }

    public static Executor b() {
        return gxo.a(10);
    }

    public static CronetEngine e(Context context) {
        String str = "";
        ieh j = ieh.j();
        idn a2 = j.a(iim.a);
        if (!hjk.a()) {
            a2.a();
            j.e(iik.e, 3);
            throw new UnsupportedOperationException("GmsCore is not safe to connect");
        }
        File file = new File(context.getCacheDir(), "cronet_cache");
        if (jan.b.h(file)) {
            CronetEngine cronetEngine = null;
            try {
                try {
                    try {
                        CronetEngine.Builder mo84setUserAgent = new PlayServicesCronetProvider(context).createBuilder().mo77enableHttp2(true).mo80enableQuic(true).mo83setStoragePath(file.getAbsolutePath()).mo78enableHttpCache(3, c).mo84setUserAgent((String) iih.b.a());
                        for (String str2 : ((njc) d.j()).a) {
                            mo84setUserAgent.mo75addQuicHint(str2, 443, 443);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("enable", true);
                            jSONObject2.put("delay_ms", 1500);
                            jSONObject2.put("allow_other_network", true);
                            jSONObject2.put("persist_to_disk", true);
                            jSONObject2.put("max_expired_time_ms", Duration.ofDays(3L).toMillis());
                            jSONObject2.put("use_stale_on_name_not_resolved", true);
                            jSONObject.put("StaleDNS", jSONObject2);
                            if (jSONObject.length() != 0) {
                                str = jSONObject.toString();
                            }
                        } catch (JSONException e) {
                            ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/libraries/inputmethod/net/cronet/CronetClient", "getExperimentalOptions", (char) 209, "CronetClient.java")).t("Failed to create Cronet experimental options");
                        }
                        if (!TextUtils.isEmpty(str)) {
                            ((ExperimentalCronetEngine.Builder) mo84setUserAgent).setExperimentalOptions(str);
                        }
                        cronetEngine = mo84setUserAgent.mo76build();
                        j.e(iik.e, 1);
                        a2.a();
                        if (cronetEngine == null) {
                            j.e(iik.e, 2);
                        }
                        return cronetEngine;
                    } catch (UnsatisfiedLinkError e2) {
                        j.e(iik.e, 5);
                        throw new UnsupportedOperationException("Rare configuration with 64-bit app and 32-bit GmsCore does not support Cronet", e2);
                    }
                } catch (IllegalStateException e3) {
                    j.e(iik.e, 4);
                    throw new UnsupportedOperationException("GmsCore (v9 or prior) does not support Cronet", e3);
                }
            } catch (Throwable th) {
                a2.a();
                if (cronetEngine == null) {
                    j.e(iik.e, 2);
                }
                throw th;
            }
        }
        a2.a();
        j.e(iik.e, 6);
        throw new IllegalStateException("Failed to set up cache dir");
    }

    @Override // defpackage.iid
    public final mko c(iih iihVar) {
        return this.g.g(iihVar, this.e, this.f);
    }

    @Override // defpackage.iid
    public final nuf d(String str, List list) {
        return iiu.a(str, list);
    }
}
