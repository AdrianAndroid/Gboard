package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Printer;
import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksBackgroundJobService;
import com.google.android.apps.inputmethod.libs.dataservice.superpacks.SuperpacksForegroundTaskService;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bzr  reason: default package */
/* loaded from: classes.dex */
public final class bzr implements gzv, bze {
    public static volatile bze d;
    private static volatile mks p;
    private static volatile mks r;
    private static volatile jzm t;
    public final Context g;
    public final idk h;
    public final mkr i;
    public final byt j;
    public hhk m;
    public static final hhl b = hhq.a("superpacks_enable_history_trace", false);
    private static final long n = TimeUnit.SECONDS.toMillis(10);
    public static final ltg c = ltg.j("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl");
    private static final Object o = new Object();
    private static final Object q = new Object();
    private static final Object s = new Object();
    public final Set e = new HashSet();
    public final Map f = new HashMap();
    public final irm l = new bzk(this);
    public final AtomicReference k = new AtomicReference();

    public bzr(Context context, idk idkVar, mkr mkrVar, byt bytVar) {
        this.g = context;
        this.h = idkVar;
        this.i = mkrVar;
        gzt.a.a(this);
        this.j = bytVar;
    }

    public static jzm l(Context context) {
        jzm jzmVar = t;
        if (jzmVar == null) {
            synchronized (s) {
                jzmVar = t;
                if (jzmVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    jyx f = jyy.f();
                    f.c = SuperpacksBackgroundJobService.class;
                    f.b = applicationContext;
                    jyy a = f.a();
                    jyp jypVar = new jyp(applicationContext, SuperpacksForegroundTaskService.class);
                    jyu jyuVar = new jyu();
                    jyuVar.a(jypVar, bzg.b);
                    jyuVar.a(a, bzg.a);
                    Object obj = jyuVar.a;
                    if (obj != null) {
                        jyuVar.b = ((llk) obj).g();
                    } else if (jyuVar.b == null) {
                        jyuVar.b = llp.q();
                    }
                    jzmVar = new jyv((llp) jyuVar.b);
                    t = jzmVar;
                }
            }
        }
        return jzmVar;
    }

    public static mks n() {
        mks mksVar = p;
        if (mksVar == null) {
            synchronized (o) {
                mksVar = p;
                if (mksVar == null) {
                    mksVar = gxp.a().f("sp-control", 11);
                    p = mksVar;
                }
            }
        }
        return mksVar;
    }

    public static mks o() {
        mks mksVar = r;
        if (mksVar == null) {
            synchronized (q) {
                mksVar = r;
                if (mksVar == null) {
                    mksVar = gxp.a().f("sp-download", 11);
                    r = mksVar;
                }
            }
        }
        return mksVar;
    }

    public static String p(String str) {
        return String.format(Locale.US, "keyboard.dataservice.%s", str);
    }

    @Override // defpackage.bze
    public final mko a(String str, Collection collection) {
        return mio.h(mio.h(m(str), new bzh(this, collection, 4), this.i), new bzh(this, str, 5), this.i);
    }

    @Override // defpackage.bze
    public final mko b(String str) {
        return mio.h(m(str), new bxo(this, str, 4), this.i);
    }

    @Override // defpackage.bze
    public final mko c(String str) {
        return mio.h(m(str), new bzh(this, str, 7), this.i);
    }

    @Override // defpackage.bze
    public final mko d(String str, int i) {
        return mio.h(m(str), new bzp(this, str, i), this.i);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        String str;
        jqx jqxVar;
        lyu a;
        if (this.k.get() == null) {
            printer.println("Superpacks not yet setup.");
            return;
        }
        try {
            try {
                jqxVar = (jqx) this.k.get();
                a = lyu.a();
            } catch (IOException e) {
                ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/Superpacks", "getStatusReport", 1404, "Superpacks.java")).w("%s", "IOException triggered when printing the status report.");
                str = "IOException triggered when printing the status report.";
            }
            try {
                StringWriter stringWriter = new StringWriter();
                a.d(stringWriter);
                PrintWriter printWriter = new PrintWriter(stringWriter);
                a.d(printWriter);
                jqxVar.g.hQ(new hlx(jqxVar, printWriter, z, 2)).get();
                str = stringWriter.toString();
                printer.println(str);
                byt bytVar = this.j;
                StringBuilder sb = new StringBuilder();
                sb.append("## FG Report:  ");
                synchronized (bytVar.b) {
                    for (jsr jsrVar : bytVar.b) {
                        sb.append("\n- In progress: ");
                        sb.append(jsrVar);
                    }
                }
                synchronized (bytVar.c) {
                    for (jsr jsrVar2 : bytVar.c) {
                        sb.append("\n- Failed : ");
                        sb.append(jsrVar2);
                    }
                }
                synchronized (bytVar.d) {
                    for (jsr jsrVar3 : bytVar.d) {
                        sb.append("\n- Successful : ");
                        sb.append(jsrVar3);
                    }
                }
                ino K = ino.K(bytVar.e, null);
                sb.append("\n- Failure count: ");
                sb.append(K.D("fg_download_failures"));
                sb.append("\n- Interval start: ");
                sb.append(DateUtils.formatDateTime(bytVar.e, K.I("fg_failure_interval_start"), 17));
                printer.println(sb.toString());
                if (z) {
                    return;
                }
                String str2 = "";
                if (((Boolean) b.c()).booleanValue()) {
                    r();
                    try {
                        str2 = jsf.a.b(n);
                    } catch (IOException | IllegalStateException e2) {
                        ((ltd) ((ltd) ((ltd) c.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "generateHistoryTrace", (char) 822, "SuperpacksManagerImpl.java")).t("generateHistoryTrace()");
                        str2 = "Unable to generate trace";
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                printer.println(str2);
            } catch (Throwable th) {
                try {
                    throw a.b(th);
                } finally {
                    a.close();
                }
            }
        } catch (Throwable th2) {
            ((ltd) ((ltd) c.a(hip.a).i(th2)).k("com/google/android/apps/inputmethod/libs/dataservice/superpacks/SuperpacksManagerImpl", "dump", 802, "SuperpacksManagerImpl.java")).t("Error obtaining Superpacks internal state");
            printer.println("Error obtaining Superpacks internal state");
        }
    }

    @Override // defpackage.bze
    public final mko e(String str, int i, jsv jsvVar) {
        return mio.h(m(str), new bzm(this, str, i, jsvVar), this.i);
    }

    @Override // defpackage.bze
    public final mko f(String str) {
        return mio.h(m(str), new bzh(this, str, 2), this.i);
    }

    @Override // defpackage.bze
    public final mko g(String str, jsq jsqVar) {
        return mio.h(m(str), new bzn(this, str, jsqVar), this.i);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SuperpacksManager";
    }

    @Override // defpackage.bze
    public final mko h(String str, jqk jqkVar, jsq jsqVar) {
        return mio.h(m(str), new bzo(this, str, jqkVar, jsqVar), this.i);
    }

    @Override // defpackage.bze
    public final void i(bzu bzuVar) {
        synchronized (this.f) {
            this.f.put(bzuVar.a, bzuVar);
        }
    }

    @Override // defpackage.bze
    public final void j() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.g.getString(R.string.f174630_resource_name_obfuscated_res_0x7f140c1a), this.g.getString(R.string.f174640_resource_name_obfuscated_res_0x7f140c1b), 2);
        NotificationManager notificationManager = (NotificationManager) this.g.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // defpackage.bze
    public final fen k(String str) {
        bzu bzuVar;
        synchronized (this.f) {
            bzuVar = (bzu) this.f.get(str);
        }
        if (bzuVar == null) {
            return null;
        }
        return bzuVar.g;
    }

    public final mko m(String str) {
        return kcu.P(new bzl(this, str), this.i);
    }

    public final void q(mko mkoVar, String str) {
        kcu.U(mkoVar, new bzj(this, str, str), this.i);
    }

    public final void r() {
        jsf.a.c(this.g, "scheduling", "gc", "manifests", "delight", "bundled_delight");
    }
}
