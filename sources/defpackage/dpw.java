package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Printer;
import android.view.inputmethod.EditorInfo;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dpw  reason: default package */
/* loaded from: classes.dex */
public final class dpw implements idm, gzv {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor");
    public final Context b;
    public final ino c;
    public final idi d;
    public ibz e;
    public jav f;
    public int g;
    public int h;
    public int i;
    private final mks k;
    private final Queue l = lks.a(5);
    public final AtomicReference j = new AtomicReference();
    private final dpv m = new dpv(this);
    private final idb n = new dpx(this);

    public dpw(Context context, idi idiVar, ino inoVar, mks mksVar) {
        this.b = context;
        this.c = inoVar;
        this.d = idiVar;
        this.k = mksVar;
        gzt.a.a(this);
    }

    public final void A(boolean z) {
        this.d.b("Experiment.ReceiveBroadcast", z);
    }

    public final void B() {
        this.f = null;
        this.e = null;
    }

    public final void C() {
        this.d.d(dda.GESTURE_INPUT_STARTED.Y, 20);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void D(ifb ifbVar) {
        char c;
        String str;
        if (ifbVar == null) {
            return;
        }
        String str2 = true != ifbVar.s ? "Health." : "HealthSlow.";
        this.d.e(str2.concat("Leaks.FileDescriptorCount"), ifbVar.b);
        this.d.e(str2.concat("Leaks.ViewInstanceCount"), ifbVar.c);
        this.d.e(str2.concat("Leaks.ContextInstanceCount"), ifbVar.d);
        this.d.e(str2.concat("Leaks.ThreadCount"), ifbVar.e);
        this.d.e(str2.concat("Storage.FilesDirSize"), ifbVar.f);
        this.d.e(str2.concat("Storage.TopLevelCacheSize"), ifbVar.i);
        this.d.e(str2.concat("Storage.DatabasesDirSize"), ifbVar.g);
        this.d.e(str2.concat("Storage.NoBackupFilesDirSize"), ifbVar.h);
        for (ifa ifaVar : ifbVar.j) {
            idi idiVar = this.d;
            String str3 = ifaVar.b;
            switch (str3.hashCode()) {
                case -1897523141:
                    if (str3.equals("staging")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1703024929:
                    if (str3.equals("superpacks")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -982898751:
                    if (str3.equals("emoji_search")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -450004177:
                    if (str3.equals("metadata")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 114967:
                    if (str3.equals("tmp")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 94416770:
                    if (str3.equals("cache")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 443164224:
                    if (str3.equals("personal")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1312704747:
                    if (str3.equals("downloads")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1754761712:
                    if (str3.equals("nativecrash")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str = "Storage.EmojiSearchDirSize";
                    break;
                case 1:
                    str = "Storage.PersonalDirSize";
                    break;
                case 2:
                    str = "Storage.CacheDirSize";
                    break;
                case 3:
                    str = "Storage.NativeCrashDirSize";
                    break;
                case 4:
                    str = "Storage.SuperpacksDirSize";
                    break;
                case 5:
                    str = "Storage.MetadataDirSize";
                    break;
                case 6:
                    str = "Storage.DownloadsDirSize";
                    break;
                case 7:
                    str = "Storage.TmpDirSize";
                    break;
                case '\b':
                    str = "Storage.StagingDirSize";
                    break;
                default:
                    str = "Storage.UnknownFile";
                    break;
            }
            idiVar.e(str2.concat(str), ifaVar.c);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.d.e(str2.concat("Storage.EncryptedFilesDirSize"), ifbVar.k);
            this.d.e(str2.concat("Storage.EncryptedCacheDirSize"), ifbVar.l);
        }
        this.d.e(str2.concat("Storage.AvailableStorageMiB"), ifbVar.m);
        this.d.d(str2.concat("Storage.AvailableStoragePct"), ifbVar.n);
        this.d.e(str2.concat("Memory.MaxHeapSize"), ifbVar.o);
        this.d.e("Health.Memory.Usage", ifbVar.p);
        this.d.e(str2.concat("Memory.AvailableInHeap"), ifbVar.q);
        this.l.add(ifbVar);
    }

    public final void E(String str) {
        this.d.c(String.format("Input.showSystemImePicker.%s", str));
    }

    public final void F(int i) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.d.d(b, i);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processIntegerHistogramMetrics", 408, "LatinCommonCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void G(String str, int i) {
        if (str != null) {
            this.d.d(str, i);
        }
    }

    public final void H() {
        this.d.d("KeyCorrection.exceptions", 1);
    }

    public final void I() {
        this.d.d("KeyCorrection.operations", 2);
    }

    public final void J() {
        this.d.d("KeyCorrection.operations", 1);
    }

    public final void K(long j) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.d.e(b, j);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processLongHistogramMetrics", 455, "LatinCommonCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void L(String str, long j) {
        if (str != null) {
            this.d.e(str, j);
        }
    }

    public final void M(mrx mrxVar, mti mtiVar, int i) {
        mti mtiVar2 = mti.UNKNOWN_CALL;
        mrx mrxVar2 = mrx.UNKNOWN;
        int ordinal = mrxVar.ordinal();
        if (ordinal == 1) {
            this.d.d("Crash.Delight5Decoder.segmentationFault", mtiVar.ar);
        } else if (ordinal == 2) {
            this.d.d("Crash.Delight5Decoder.abort", mtiVar.ar);
        } else if (ordinal == 3) {
            this.d.d("Crash.Delight5Decoder.anr", mtiVar.ar);
        } else {
            this.d.d("Crash.Delight5Decoder.unknown", mtiVar.ar);
        }
        int ordinal2 = mtiVar.ordinal();
        if (ordinal2 == 8) {
            this.d.d("Crash.Delight5Decoder.LmOperations.loadLanguageModel", i);
        } else if (ordinal2 == 9) {
            this.d.d("Crash.Delight5Decoder.LmOperations.unloadLanguageModel", i);
        } else if (ordinal2 == 37) {
            this.d.d("Crash.Delight5Decoder.LmOperations.pruneDynamicLmIfNeeded", i);
        } else if (ordinal2 == 39) {
            this.d.d("Crash.Delight5Decoder.LmOperations.getDynamicLmStats", i);
        } else {
            switch (ordinal2) {
                case 30:
                    this.d.d("Crash.Delight5Decoder.LmOperations.openDynamicLm", i);
                    return;
                case 31:
                    this.d.d("Crash.Delight5Decoder.LmOperations.closeDynamicLm", i);
                    return;
                case 32:
                    this.d.d("Crash.Delight5Decoder.LmOperations.flushDynamicLm", i);
                    return;
                case 33:
                    this.d.d("Crash.Delight5Decoder.LmOperations.clearDynamicLm", i);
                    return;
                default:
                    return;
            }
        }
    }

    public final void N(boolean z) {
        this.d.b("IMS.onStartInput", z);
    }

    public final void O(boolean z) {
        this.d.b("IMS.onStartInputView", z);
    }

    public final void P(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.d("RuntimePermisson.Accepted", dpy.d(str));
        }
    }

    public final void Q(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d.d("RuntimePermisson.Requested", dpy.d(str));
        }
    }

    public final void R() {
        this.i++;
    }

    public final void S(Throwable th) {
        int i;
        if (th == null) {
            return;
        }
        ido idoVar = this.n.b;
        if (idoVar == idd.UI_THREAD_VIOLATION) {
            i = 1;
        } else if (idoVar == idd.METRICS_PROCESSOR_CRASH_INIT) {
            i = 4;
        } else if (idoVar == idd.METRICS_PROCESSOR_CRASH_ON_ATTACHED) {
            i = 5;
        } else if (idoVar == idd.METRICS_PROCESSOR_CRASH_PROCESS) {
            i = 6;
        } else if (idoVar == idd.KEYBOARD_TYPE_EMPTY) {
            i = 7;
        } else if (idoVar == idd.NATIVE_LIB_LOAD_FAILED) {
            i = 11;
        } else if (idoVar == idd.INVALID_KEYBOARD_DEF_FROM_CACHE) {
            i = 13;
        } else if (idoVar == idd.INVALID_KEYBOARD_DEF_FROM_XML) {
            i = 14;
        } else {
            i = idoVar == hqh.b ? 15 : idoVar == idd.BACKGROUND_CRASH ? 100 : 0;
        }
        this.d.d("Feedback.SilentCrashReports", i);
    }

    public final void T(long j) {
        jav javVar = this.f;
        if (javVar != null) {
            if ("hi".equals(javVar.g) && j == 0) {
                this.d.d("Input.actionPerSubCategory", 1);
                j = 0;
            }
            if (j == 0) {
                return;
            }
            this.d.d("Input.actionPerSubCategory", dpy.e(j));
        }
    }

    public final void U(boolean z, String str) {
        this.d.b("SuperDelight.BundledMetadataFetch", z);
        if (!z) {
            idi idiVar = this.d;
            Object[] objArr = new Object[1];
            if (true == TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            objArr[0] = str;
            idiVar.c(String.format("SuperDelight.BundledMetadataFetch.Failure.%s", objArr));
        }
    }

    public final void V(String str) {
        this.d.c(String.format(Locale.US, "SuperDelight.Merge.NoInputMethodEntries.%s", str));
    }

    public final void W(String str) {
        this.d.c(String.format(Locale.US, "SuperDelight.Sync.NoInputMethodEntries.%s", str));
    }

    public final void X(boolean z, String str) {
        this.d.b("SuperDelight.ResourceFetch", z);
        if (!z) {
            idi idiVar = this.d;
            Object[] objArr = new Object[1];
            if (true == TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            objArr[0] = str;
            idiVar.c(String.format("SuperDelight.ResourceFetch.Failure.%s", objArr));
        }
    }

    public final void Y(boolean z, boolean z2) {
        if (z2) {
            this.d.b("SuperDelight.ReSync", z);
        } else {
            this.d.b("SuperDelight.Sync", z);
        }
    }

    public final void Z(boolean z, String str) {
        this.d.b("SuperDelight.Unpack", z);
        if (!z) {
            idi idiVar = this.d;
            Object[] objArr = new Object[1];
            if (true == TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            objArr[0] = str;
            idiVar.c(String.format("SuperDelight.Unpack.Failure.%s", objArr));
        }
    }

    public final void a(String str, int i) {
        this.d.d(i == 0 ? "AccessPoints.DraggedPosition1" : i == 1 ? "AccessPoints.DraggedPosition2" : i == 2 ? "AccessPoints.DraggedPosition3" : i == 3 ? "AccessPoints.DraggedPosition4" : "AccessPoints.DraggedPositionUnknown", dqc.b(this.b, str) - 1);
    }

    public final void aa(Throwable th) {
        int i;
        if (th == null) {
            return;
        }
        ido idoVar = this.n.b;
        if (idoVar == bzs.d) {
            i = 1;
        } else {
            i = idoVar == bzs.e ? 2 : idoVar == bzs.f ? 3 : 0;
        }
        this.d.d("Superpacks.Errors", i);
    }

    public final void ab(String str, boolean z) {
        if (TextUtils.equals(str, "hmmdictionary")) {
            this.d.b("Superpacks.Foreground.Hmm", z);
        } else if (TextUtils.equals(str, "delight")) {
            this.d.b("Superpacks.Foreground.Delight", z);
        } else if (TextUtils.equals(str, "emoji")) {
            this.d.b("Superpacks.Foreground.Emoji", z);
        } else if (TextUtils.equals(str, "content_cache")) {
            this.d.b("Superpacks.Foreground.ContentCache", z);
        } else if (TextUtils.equals(str, "theme_indices")) {
            this.d.b("Superpacks.Foreground.ThemeIndices", z);
        } else if (str.contains("themes_")) {
            this.d.b("Superpacks.Foreground.PackagedThemes", z);
        } else if (TextUtils.equals(str, "handwriting_recognition")) {
            this.d.b("Superpacks.Foreground.Handwriting", z);
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processSuperpacksForegroundDownload", 1062, "LatinCommonCountersMetricsProcessor.java")).w("processSuperpacksForegroundDownload(): undesired %s", str);
            this.d.b("Superpacks.Foreground.Unknown", z);
        }
    }

    public final void ac(String str) {
        this.d.c(String.format("Input.switchToNextLanguage.%s", str));
    }

    public final void ad(String str, int i) {
        this.d.d("AbandonRequest.".concat(String.valueOf(str)), i);
    }

    public final void ae(ibz ibzVar, jav javVar) {
        ibz ibzVar2 = this.e;
        if (ibzVar2 != null && ibzVar2 != ibzVar) {
            this.d.d("Input.switchKeyboard", dpy.h(ibzVar2, ibzVar) - 1);
        }
        this.e = ibzVar;
        this.f = javVar;
    }

    public final void af(boolean z) {
        this.d.b("IMS.onStartInput", z);
    }

    public final void ag(EditorInfo editorInfo, boolean z) {
        this.d.b("IMS.onStartInputView", z);
        if (editorInfo == null || ham.ag(this.b, editorInfo)) {
            this.d.b("LanguageModel.Delightful", false);
            return;
        }
        hrx.y(this.b);
        hqt b = hqp.b();
        if (b == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "maybeReportDelightProblem", 643, "LatinCommonCountersMetricsProcessor.java")).t("No current IME. Maybe the manager is still loading XML.");
        } else if (!b.p().equals("handwriting")) {
            String str = b.h().g;
            if (str == null || str.equals("ja") || str.equals("ko") || str.equals("zh")) {
                this.d.b("LanguageModel.Delightful", false);
                return;
            }
            this.d.b("LanguageModel.Delightful", true);
            synchronized (this.j) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) this.j.get();
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.j.set(this.k.a(this.m, 3L, TimeUnit.SECONDS));
            }
        } else {
            this.d.b("LanguageModel.Delightful", false);
        }
    }

    public final void ah() {
        int i = this.g;
        if (i != 0) {
            this.d.e("ContentDataManager.Contacts.doInBackground", i);
            this.g = 0;
        }
        int i2 = this.i;
        if (i2 != 0) {
            this.d.e("ContentDataManager.Shortcuts.doInBackground", i2);
            this.i = 0;
        }
        int i3 = this.h;
        if (i3 != 0) {
            this.d.e("ContentDataManager.Emails.doInBackground", i3);
            this.h = 0;
        }
    }

    public final void b(gsj gsjVar) {
        this.d.d(true != gsjVar.b ? "AccessPoints.ClickedInExpandedPanel" : "Input.AccessPoints.clicked", dqc.b(this.b, gsjVar.a) - 1);
    }

    public final void c(boolean z) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.d.b(b, z);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processBoolHistogramMetrics", 324, "LatinCommonCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void d(String str, boolean z) {
        if (str != null) {
            this.d.b(str, z);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        for (ifb ifbVar : this.l) {
            iff.b(ifbVar, simpleDateFormat, printer, z);
        }
        ino K = ino.K(this.b, "delight_problem");
        String Q = K.Q("lm_loaded");
        String Q2 = K.Q("lm_missing");
        if (!TextUtils.isEmpty(Q) || !TextUtils.isEmpty(Q2)) {
            printer.println("[Language Model Status]:");
            printer.println("loaded lm logs:");
            printer.println(Q);
            printer.println("missing lm logs:");
            printer.println(Q2);
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    public final void g(boolean z, boolean z2) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            this.d.d(idoVar.b(), (true != z ? 3 : 5) + (!z2 ? 1 : 0));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "LatinCommonCountersMetricsProcessor";
    }

    public final void h(boolean z, boolean z2, boolean z3, boolean z4) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            int i = 0;
            int i2 = (true != z ? 0 : 8) | (true != z2 ? 0 : 4);
            if (true == z3) {
                i = 2;
            }
            this.d.d(idoVar.b(), i2 | i | (z4 ? 1 : 0));
        }
    }

    public final void i() {
        int i;
        ido idoVar = this.n.b;
        if (idoVar == gpv.a) {
            i = 0;
        } else if (idoVar == idd.VIEW_NOT_ATTACHED_TO_WINDOW_CRASH) {
            i = 1;
        } else {
            i = idoVar == hhv.CONCURRENT_MODIFICATION_EXCEPTION_WHEN_NOTIFY_OBSERVERS ? 12 : -1;
        }
        if (i != -1) {
            this.d.d("CaughtCrash.Type", i);
        }
    }

    public final void j() {
        this.g++;
    }

    public final void k(String str) {
        if (str != null) {
            this.d.c(str);
        }
    }

    public final void l() {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.d.c(b);
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processCounterMetrics", 284, "LatinCommonCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }

    public final void m(hyd hydVar) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            this.d.d(idoVar.b(), hydVar.h);
        }
    }

    public final void n(String str) {
        this.d.c("Crash.".concat(String.valueOf(str)));
    }

    public final void o(String str) {
        if (TextUtils.equals(str, "e")) {
            this.d.d("Decoder.initInYoutubeSearch", 2);
        } else if (TextUtils.equals(str, "c")) {
            this.d.d("Decoder.initInYoutubeSearch", 1);
        } else {
            this.d.d("Decoder.initInYoutubeSearch", 0);
        }
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.n.b(idoVar, iduVar, j, j2, objArr);
    }

    public final void q() {
        this.d.c("Decoder.LoadMainLanguageModel.Failure");
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
        return dpx.a;
    }

    public final void u(boolean z, boolean z2, int i, int i2) {
        String str = true != z ? "TypingSlow.Candidate." : "TypingSlow.Text.";
        if (z2) {
            this.d.d(str.concat("Asked"), i);
        }
        this.d.d(str.concat("Detected"), i2);
    }

    public final void v() {
        this.d.d("DualCandidatesViewController.selectCandidate", 1);
    }

    public final void w() {
        this.d.d("DualCandidatesViewController.selectCandidate", 0);
    }

    public final void x(String str, long j, int i, int i2, int i3, long j2) {
        this.d.e(String.format("%s.%s.%s", "DynamicLm", str, "dictionarySize"), j);
        this.d.e(String.format("%s.%s.%s", "DynamicLm", str, "unigramCount"), i);
        this.d.e(String.format("%s.%s.%s", "DynamicLm", str, "ngramCount"), i2);
        this.d.e(String.format("%s.%s.%s", "DynamicLm", str, "sumUnigramCounts"), i3);
        this.d.e(String.format("%s.%s.%s", "DynamicLm", str, "createdBeforeDays"), TimeUnit.SECONDS.toDays(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j2));
    }

    public final void y() {
        this.h++;
    }

    public final void z(nfp nfpVar) {
        ido idoVar = this.n.b;
        if (idoVar != null) {
            String b = idoVar.b();
            if (!lfd.e(b)) {
                this.d.d(b, nfpVar.a());
            } else {
                ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/metricsprocessor/LatinCommonCountersMetricsProcessor", "processEnumLiteHistogramMetrics", 434, "LatinCommonCountersMetricsProcessor.java")).w("Failed to find counter name for metrics type: %s.", idoVar);
            }
        }
    }
}
