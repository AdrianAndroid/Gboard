package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* compiled from: PG */
/* renamed from: jxu  reason: default package */
/* loaded from: classes.dex */
final class jxu implements jxw {
    @Override // defpackage.jxw
    public final void a(File file, InputStream inputStream, ZipEntry zipEntry, jrr jrrVar) {
        File file2 = new File(file, jxx.f(zipEntry));
        if (zipEntry.isDirectory()) {
            jxx.g(file2);
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile == null) {
            throw new IOException("Parent of entry is null");
        }
        jxx.g(parentFile);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            lyp.b(inputStream, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
