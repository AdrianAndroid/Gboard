package defpackage;

import android.content.Context;
import j$.util.Objects;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gvf  reason: default package */
/* loaded from: classes.dex */
public final class gvf {
    private static final ltg a = ltg.j("com/google/android/libraries/inputmethod/backup/BackupUtils");

    public static gvp a(Context context) {
        File c = c(context);
        if (!c.exists()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/backup/BackupUtils", "parseBackupData", 208, "BackupUtils.java")).t("The backup data file doesn't exist after restore.");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(c);
            gvp gvpVar = (gvp) nfm.x(gvp.b, fileInputStream, nfb.b());
            fileInputStream.close();
            return gvpVar;
        } catch (IOException | SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/backup/BackupUtils", "parseBackupData", (char) 217, "BackupUtils.java")).t("Failed to parse backup data");
            return null;
        }
    }

    public static llw b(Context context, Class cls) {
        hjg.p();
        igr d = igr.d(context);
        n();
        lls h = llw.h();
        for (Class cls2 : d.e(cls)) {
            Object cast = cls.cast(d.b(cls2));
            if (cast != null) {
                h.a(cls2, cast);
            }
        }
        return h.l();
    }

    public static File c(Context context) {
        return new File(d(context), "backup_tmp_data");
    }

    public static File d(Context context) {
        return new File(context.getFilesDir(), "reserved_for_backup_files");
    }

    public static File e(Context context) {
        return new File(d(context), "backup_tmp_file");
    }

    public static File f(Context context, String str, String str2) {
        return new File(d(context), String.format("restore_tmp_%s_%s", str, jbs.a(str2)));
    }

    public static String g() {
        String str = File.separator;
        return "reserved_for_backup_files" + str + "backup_tmp_data";
    }

    public static String h() {
        String str = File.separator;
        return "reserved_for_backup_files" + str + "backup_tmp_file";
    }

    public static String i() {
        return ino.L().P();
    }

    public static void j(Context context) {
        k(c(context));
    }

    public static void k(File file) {
        try {
            jan.b.e(file);
        } catch (SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/backup/BackupUtils", "deleteFile", 191, "BackupUtils.java")).w("Failed to delete file %s", file);
        }
    }

    public static void l(File file, FileFilter fileFilter) {
        try {
            jan.b.f(file, fileFilter);
        } catch (SecurityException e) {
            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/backup/BackupUtils", "deleteFile", 200, "BackupUtils.java")).w("Failed to delete file in %s", file);
        }
    }

    public static void m(Context context, Collection collection) {
        igr d = igr.d(context);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d.g((Class) it.next());
        }
    }

    public static void n() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i < 3) {
                try {
                    if (hjg.r()) {
                        return;
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    gyc gycVar = gyc.b;
                    Objects.requireNonNull(countDownLatch);
                    gycVar.execute(new hvg(countDownLatch, 14));
                    countDownLatch.await(10L, TimeUnit.SECONDS);
                    return;
                } catch (InterruptedException e) {
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/backup/BackupUtils", "waitingAvailableModulesReady", 'c', "BackupUtils.java")).t("Failed to wait for module manager initialization");
                    i = i2;
                }
            } else {
                return;
            }
        }
    }
}
