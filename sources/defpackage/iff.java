package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: iff  reason: default package */
/* loaded from: classes.dex */
public final class iff implements gzv {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metricstracker/HealthMetricsTracker");
    private static final Pattern b = Pattern.compile("(?<=Threads:\t)\\d+");
    private final Context c;
    private final ife d;
    private final idk e;
    private final File f;
    private final File g;
    private final Runtime h;

    public iff(Context context, idk idkVar) {
        ife ifdVar;
        this.e = idkVar;
        try {
            ifdVar = new ifc();
        } catch (NoSuchMethodException e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/metricstracker/HealthMetricsTracker", "<init>", 'A', "HealthMetricsTracker.java")).t("Failed to get reference to countInstancesOfClass() by reflection");
            ifdVar = new ifd();
        }
        this.c = context;
        this.d = ifdVar;
        this.f = new File("/proc/self/fd/");
        this.g = new File("/proc/self/status");
        ltg ltgVar = jan.a;
        this.h = Runtime.getRuntime();
    }

    public static void b(ifb ifbVar, SimpleDateFormat simpleDateFormat, Printer printer, boolean z) {
        if (z) {
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = true != ifbVar.s ? "normal" : "slow";
        objArr[1] = simpleDateFormat.format(Long.valueOf(ifbVar.r));
        printer.println(String.format("Tracked health metrics [%s] at %s:", objArr));
        long j = ifbVar.b;
        printer.println("open_file_descriptor_count: " + j);
        long j2 = ifbVar.c;
        printer.println("view_instance_count: " + j2);
        long j3 = ifbVar.d;
        printer.println("context_instance_count: " + j3);
        long j4 = ifbVar.e;
        printer.println("thread_count: " + j4);
        long j5 = ifbVar.f;
        printer.println("files_dir_size: " + j5);
        long j6 = ifbVar.i;
        printer.println("top_level_cache_dir_size: " + j6);
        for (ifa ifaVar : ifbVar.j) {
            String str = ifaVar.b;
            long j7 = ifaVar.c;
            printer.println("subdirectory[" + str + "] size: " + j7);
        }
        long j8 = ifbVar.k;
        printer.println("encrypted_files_dir_size: " + j8);
        long j9 = ifbVar.l;
        printer.println("encrypted_cache_dir_size: " + j9);
        long j10 = ifbVar.m;
        printer.println("available_storage_size_mi_b: " + j10);
        int i = ifbVar.n;
        printer.println("available_storage_pct: " + i);
        long j11 = ifbVar.o;
        printer.println("max_heap_size_mi_b: " + j11);
        long j12 = ifbVar.p;
        printer.println("used_memory_mi_b: " + j12);
        long j13 = ifbVar.q;
        printer.println("available_heap_mi_b: " + j13);
    }

    private final long c(Class cls) {
        try {
            return this.d.a(cls);
        } catch (Exception e) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/inputmethod/metricstracker/HealthMetricsTracker", "getClassInstanceCount", (char) 182, "HealthMetricsTracker.java")).t("Failed to invoke countInstancesOfClass()");
            return -1L;
        }
    }

    private static long d(File file) {
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j += d(file2);
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ifb a(boolean r15) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iff.a(boolean):ifb");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (z) {
            return;
        }
        b(a(false), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US), printer, false);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "HealthMetricsTracker";
    }
}
