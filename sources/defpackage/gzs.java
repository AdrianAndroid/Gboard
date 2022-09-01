package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Printer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: gzs  reason: default package */
/* loaded from: classes.dex */
public final class gzs implements gzv {
    private static final lmz a = lmz.u("share_content", "cronet_cache", "okhttp3_cache", "image_manager_disk_cache");
    private final Context b;

    public gzs(Context context) {
        this.b = context;
    }

    private static void a(Printer printer, File file, boolean z) {
        printer.println("Content in directory ".concat(String.valueOf(file.getAbsolutePath())));
        printer.println("Name | Size");
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            printer.println("No files found.");
            return;
        }
        boolean z2 = z || a.contains(file.getName());
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        for (File file2 : lrb.a.e(Arrays.asList(listFiles))) {
            if (file2 != null) {
                if (file2.isDirectory()) {
                    printer.println(String.valueOf(file2.getName()).concat("\t<dir>"));
                    arrayList.add(file2);
                } else {
                    long length = file2.length();
                    i++;
                    j += length;
                    if (!z2) {
                        gzu.a(printer, "%s\t%,d", file2.getName(), Long.valueOf(length));
                    }
                }
            }
        }
        if (z2 && i > 0) {
            gzu.a(printer, "(%d files masked)", Integer.valueOf(i));
        }
        gzu.a(printer, "<total>\t%,d", Long.valueOf(j));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(printer, (File) arrayList.get(i2), z2);
        }
        printer.println("");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (z) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a(printer, this.b.getFilesDir(), false);
        a(printer, this.b.getCacheDir(), false);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        printer.println("DiskUsageDumper completed in " + (elapsedRealtime2 - elapsedRealtime));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DiskUsageDumper";
    }
}
