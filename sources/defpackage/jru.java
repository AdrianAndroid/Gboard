package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: jru  reason: default package */
/* loaded from: classes.dex */
public final class jru {
    public static final jru a = new jru();

    public static final List d(File file, FilenameFilter filenameFilter) {
        File[] fileArr;
        if (!file.isDirectory()) {
            ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 139, "FileUtil.java")).w("isDirectory returned false while listing files for %s", file);
            fileArr = null;
        } else {
            File[] listFiles = filenameFilter != null ? file.listFiles(filenameFilter) : file.listFiles();
            if (listFiles == null) {
                ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/base/FileUtil", "listFiles", 145, "FileUtil.java")).w("Failed to list files for directory %s", file);
            }
            fileArr = listFiles;
        }
        if (fileArr == null || fileArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(fileArr);
    }

    public static final List e(File file) {
        return d(file, null);
    }

    public final long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        long j = 0;
        for (File file2 : e(file)) {
            j += a(file2);
        }
        return j;
    }

    public final boolean b(String str, File file, jxz jxzVar) {
        return c(str, file, jtf.a, jxzVar);
    }

    final boolean c(String str, File file, jtf jtfVar, jxz jxzVar) {
        boolean z;
        ltv ltvVar;
        if (!file.exists()) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (file.isDirectory()) {
            z = true;
            for (File file2 : e(file)) {
                z &= c(str, file2, jtfVar, jxzVar);
            }
        } else {
            z = true;
        }
        String k = jtq.k(str, jtq.g(file));
        try {
            if (jxzVar == jxz.DELETE_FETCHED) {
                lug lugVar = jsh.a;
                ltvVar = lue.b;
            } else {
                ltvVar = (luc) jsh.a.b();
            }
            ((luc) ltvVar.k("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 97, "FileUtil.java")).G("Deleting file %s, reason: %s", k, jxzVar);
        } catch (SecurityException e) {
            ((luc) ((luc) ((luc) jsh.a.d()).i(e)).k("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 106, "FileUtil.java")).w("Security exception thrown when attempting deletion of %s", k);
        }
        if (!file.delete()) {
            ((luc) ((luc) jsh.a.d()).k("com/google/android/libraries/micore/superpacks/base/FileUtil", "deleteFile", 99, "FileUtil.java")).w("Failed to delete %s", k);
            z = false;
        }
        jrz a2 = jsf.a(str);
        a2.e(SystemClock.elapsedRealtime() - elapsedRealtime);
        a2.d(k, Boolean.valueOf(z));
        return z;
    }
}
