package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kzr  reason: default package */
/* loaded from: classes.dex */
public final class kzr {
    private final long a;
    private final Context b;
    private File c;

    public kzr(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static String h(String str) {
        return String.valueOf(str).concat(".apk");
    }

    public static void k(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                k(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
    }

    public static void l(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean m(File file) {
        return !file.canWrite();
    }

    public static void n(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
            return;
        }
        file.mkdirs();
        if (!file.isDirectory()) {
            throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    private final File o() {
        if (this.c == null) {
            Context context = this.b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = context.getFilesDir();
        }
        File file = new File(this.c, "splitcompat");
        n(file);
        return file;
    }

    public final File b() {
        File file = new File(g(), "native-libraries");
        n(file);
        return file;
    }

    public final File c(String str) {
        File a = a(b(), str);
        n(a);
        return a;
    }

    public final File d() {
        File file = new File(g(), "unverified-splits");
        n(file);
        return file;
    }

    public final File e() {
        File file = new File(g(), "verified-splits");
        n(file);
        return file;
    }

    public final File f(String str) {
        return a(e(), h(str));
    }

    public final File g() {
        File file = new File(o(), Long.toString(this.a));
        n(file);
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set i() {
        String name;
        File e = e();
        HashSet hashSet = new HashSet();
        File[] listFiles = e.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && m(file)) {
                    hashSet.add(new laa(file, file.getName().substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final void j() {
        File o = o();
        String[] list = o.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(o, str);
                    file.toString();
                    k(file);
                }
            }
        }
    }
}
