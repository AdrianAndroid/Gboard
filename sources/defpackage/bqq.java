package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiOrGifExtension;
import com.google.android.apps.inputmethod.libs.expression.extension.IEmojiSearchExtension;
import com.google.android.inputmethod.latin.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bqq  reason: default package */
/* loaded from: classes.dex */
public final class bqq implements idm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor");
    private static final String f = IEmojiSearchExtension.class.getName();
    private static final String g = IEmojiOrGifExtension.class.getName();
    private static final long h = TimeUnit.HOURS.toMillis(24);
    private static final lmz i = lmz.w("hi", "mr", "bn", "te", "ta", "ml", "ur", "gu", "kn");
    private static final llw j;
    public final ino b;
    public final idi c;
    ibz d;
    jav e;
    private final Context k;
    private long l;
    private final idb m = new bqr(this);

    static {
        lls i2 = llw.i(16);
        i2.a("qwerty", 1);
        i2.a("qwertz", 1);
        i2.a("azerty", 1);
        i2.a("dvorak", 1);
        i2.a("colemak", 1);
        i2.a("pcqwerty", 1);
        i2.a("hindi", 2);
        i2.a("marathi_india", 2);
        i2.a("bengali_india", 2);
        i2.a("telugu_india", 2);
        i2.a("tamil", 2);
        i2.a("malayalam_india", 2);
        i2.a("urdu_in", 2);
        i2.a("gujarati", 2);
        i2.a("kannada_india", 2);
        i2.a("handwriting", 3);
        j = i2.l();
    }

    public bqq(Context context, idi idiVar, ino inoVar) {
        this.k = context;
        this.b = inoVar;
        this.c = idiVar;
    }

    public static int a(hqt hqtVar, boolean z) {
        int i2 = 0;
        int intValue = "Latn".equals(hqtVar.i().i) ? 0 : ((Integer) jdg.U((Integer) j.get(hqtVar.p()), 2)).intValue();
        if (true == z) {
            i2 = 100;
        }
        return intValue + i2;
    }

    public static int b(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 12;
            }
            if (i2 == 3) {
                return 13;
            }
            if (i2 == 4) {
                return 14;
            }
            if (i2 == 5) {
                return 15;
            }
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "getRateUsEventEnumValue", 624, "LatinCountersMetricsProcessor.java")).u("Unknown event type %d.", i2);
            return -1;
        }
        return 11;
    }

    public static String c(jav javVar) {
        String str = javVar.g;
        return (str == null || !i.contains(str)) ? "other" : javVar.g;
    }

    public static void d(Context context, ieh iehVar, idi idiVar) {
        try {
            iehVar.u(new bqq(context, idiVar, ino.M(context)));
        } catch (RuntimeException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "addToMetricsManager", (char) 158, "LatinCountersMetricsProcessor.java")).t("Failed to create LatinCountersMetricsProcessor");
            iehVar.e(idd.METRICS_PROCESSOR_CRASH_INIT, e);
        }
    }

    public static void q(ieh iehVar) {
        iehVar.x(bqq.class);
    }

    public static final void v(int i2) {
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processCrankClientNativeCommunicationError", 528, "LatinCountersMetricsProcessor.java")).u("processCrankClientNativeCommunicationError(): %d", i2);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    public final void g(int i2) {
        this.c.d("BackupAgent.event", i2);
    }

    public final void h(int i2) {
        this.c.d("BackupAgent.compressionRatioPercent", i2);
    }

    public final void i(boolean z) {
        ido idoVar = this.m.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.c.b(b, z);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processBoolHistogramMetrics", 244, "LatinCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void j() {
        ido idoVar = this.m.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.c.c(b);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processCounterMetrics", 222, "LatinCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.b("DownloadablePackage.success", true);
        if (str.startsWith("emoji_search_")) {
            this.c.b("SearchEmoji.metadata.download", true);
        } else if (!str.equals(this.k.getString(R.string.f159210_resource_name_obfuscated_res_0x7f1405b1)) && !str.equals(this.k.getString(R.string.f159220_resource_name_obfuscated_res_0x7f1405b2))) {
        } else {
            this.c.b("Mozc.LanguageModel.Download", true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d4, code lost:
        if (r2 == (-10018)) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.hfd r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqq.l(hfd):void");
    }

    public final void m(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return;
        }
        hdl c = hdn.instance.c(editorInfo);
        this.c.b("Emoji.Compat.ActivateWithMetaVersion", c.b());
        if (!c.b()) {
            return;
        }
        this.c.d("Emoji.Compat.MetaVersion", c.a());
        this.c.b("Emoji.Compat.ReplaceAll", c.c);
    }

    public final void n(int i2) {
        ido idoVar = this.m.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.c.d(b, i2);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processIntegerHistogramMetrics", 284, "LatinCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void o(long j2) {
        ido idoVar = this.m.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.c.e(b, j2);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/latin/metrics/LatinCountersMetricsProcessor", "processLongHistogramMetrics", 340, "LatinCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j2, long j3, Object... objArr) {
        this.l = j2;
        this.m.b(idoVar, iduVar, j2, j3, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return bqr.a;
    }

    public final int u() {
        if (!this.b.x(R.string.f162150_resource_name_obfuscated_res_0x7f1406f8, false)) {
            return 5;
        }
        long o = this.b.o(R.string.f162090_resource_name_obfuscated_res_0x7f1406f2, 0L);
        if (o == 0) {
            return 6;
        }
        return this.l - o <= h ? 7 : 8;
    }

    public final void w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.b("DownloadablePackage.success", false);
        if (str.startsWith("emoji_search_")) {
            this.c.b("SearchEmoji.metadata.download", false);
        } else if (!str.equals(this.k.getString(R.string.f159210_resource_name_obfuscated_res_0x7f1405b1)) && !str.equals(this.k.getString(R.string.f159220_resource_name_obfuscated_res_0x7f1405b2))) {
        } else {
            this.c.b("Mozc.LanguageModel.Download", false);
        }
    }
}
