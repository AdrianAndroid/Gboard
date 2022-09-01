package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: oqv  reason: default package */
/* loaded from: classes2.dex */
public final class oqv {
    public final Object a;
    public final Object b;

    public oqv(Context context, String str) {
        context = Build.VERSION.SDK_INT >= 24 ? uv.b(context) : context;
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.a = sharedPreferences;
        if (!sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            try {
                Context context2 = context;
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return;
                }
                Context context3 = context;
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                    return;
                }
                applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                return;
            }
        }
        sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
    }

    public oqv(lun lunVar, lum lumVar) {
        this.a = lunVar;
        this.b = lumVar;
    }

    public oqv(nuq nuqVar, nvm nvmVar) {
        this.a = nuqVar;
        this.b = nvmVar;
    }

    public oqv(oek oekVar, nvm nvmVar) {
        this.b = oekVar;
        this.a = nvmVar;
    }

    public oqv(oqi oqiVar, oql oqlVar) {
        this.a = oqiVar;
        this.b = oqlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        if (r3.b().e == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.oql r3, defpackage.oqi r4) {
        /*
            int r0 = r3.c
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L52
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L52
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L52
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L52
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L52
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L52
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L2f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L52
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L52
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L52
            switch(r0) {
                case 300: goto L52;
                case 301: goto L52;
                case 302: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L51
        L2f:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto L52
            ope r0 = r3.b()
            int r0 = r0.d
            r1 = -1
            if (r0 != r1) goto L52
            ope r0 = r3.b()
            boolean r0 = r0.f
            if (r0 != 0) goto L52
            ope r0 = r3.b()
            boolean r0 = r0.e
            if (r0 == 0) goto L51
            goto L52
        L51:
            return r2
        L52:
            ope r3 = r3.b()
            boolean r3 = r3.c
            if (r3 != 0) goto L64
            ope r3 = r4.b()
            boolean r3 = r3.c
            if (r3 != 0) goto L64
            r3 = 1
            return r3
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqv.a(oql, oqi):boolean");
    }

    public static oqv b(ohx ohxVar, nsb nsbVar) {
        return ohxVar.a(nsbVar, nsa.a.d(oig.b, oid.FUTURE));
    }

    public final boolean c() {
        return ((Logger) this.a).isLoggable((Level) this.b);
    }

    public final void d(int i, int i2, our ourVar, int i3, boolean z) {
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String l = l(ourVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logData", ofb.b(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + l);
        }
    }

    public final void e(int i, int i2, ohf ohfVar, ouu ouuVar) {
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String valueOf = String.valueOf(ohfVar);
            int b = ouuVar.b();
            our ourVar = new our();
            ourVar.I(ouuVar);
            String l = l(ourVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", ofb.b(i) + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + valueOf + " length=" + b + " bytes=" + l);
        }
    }

    public final void f(int i, long j) {
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", ofb.b(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void g(int i, int i2, ohf ohfVar) {
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String valueOf = String.valueOf(ohfVar);
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", ofb.b(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + valueOf);
        }
    }

    public final void h(int i, ohq ohqVar) {
        ogi[] values;
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            String b = ofb.b(i);
            EnumMap enumMap = new EnumMap(ogi.class);
            for (ogi ogiVar : ogi.values()) {
                int i2 = ogiVar.g;
                if (ohqVar.c(i2)) {
                    enumMap.put((EnumMap) ogiVar, (ogi) Integer.valueOf(ohqVar.a(i2)));
                }
            }
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", b + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    public final void i(int i, int i2, long j) {
        if (c()) {
            Object obj = this.a;
            Object obj2 = this.b;
            Logger logger = (Logger) obj;
            logger.logp((Level) obj2, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", ofb.b(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    public final void j() {
        ((nvy) this.a).b = true;
        this.b.cancel(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void k(nuq nuqVar) {
        this.b.add(nuqVar);
    }

    private static String l(our ourVar) {
        long j = ourVar.b;
        return j <= 64 ? ourVar.t().d() : ourVar.u((int) Math.min(j, 64L)).d().concat("...");
    }

    public oqv(nvu nvuVar, Object obj) {
        jdg.Q(nvuVar, "status");
        this.a = nvuVar;
        this.b = obj;
    }

    public oqv(nvo nvoVar, Map map) {
        this.a = nvoVar;
        this.b = Collections.unmodifiableMap(new HashMap(map));
    }

    public oqv(byte[] bArr) {
        this.b = new ArrayList();
        this.a = "java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService";
    }

    public oqv(nvy nvyVar, ScheduledFuture scheduledFuture) {
        this.a = nvyVar;
        jdg.Q(scheduledFuture, "future");
        this.b = scheduledFuture;
    }

    oqv() {
        throw null;
    }

    public oqv(llw llwVar) {
        this.b = nwg.a();
        this.a = llwVar;
    }

    public oqv(nue nueVar) {
        jdg.Q(nueVar, "registry");
        this.a = nueVar;
        this.b = "pick_first";
    }

    public oqv(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        jdg.Q(level, "level");
        this.b = level;
        jdg.Q(logger, "logger");
        this.a = logger;
    }

    public oqv(nsb nsbVar, nsa nsaVar) {
        jdg.Q(nsbVar, "channel");
        this.b = nsbVar;
        this.a = nsaVar;
    }
}
