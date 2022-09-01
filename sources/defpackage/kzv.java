package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: kzv  reason: default package */
/* loaded from: classes.dex */
final class kzv implements kzx {
    final /* synthetic */ Set a;
    final /* synthetic */ laa b;
    final /* synthetic */ ZipFile c;

    public kzv(Set set, laa laaVar, ZipFile zipFile) {
        this.a = set;
        this.b = laaVar;
        this.c = zipFile;
    }

    @Override // defpackage.kzx
    public final void a(jma jmaVar, File file, boolean z) {
        this.a.add(file);
        if (!z) {
            laa laaVar = this.b;
            Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", laaVar.b, jmaVar.b, laaVar.a.getAbsolutePath(), ((ZipEntry) jmaVar.a).getName(), file.getAbsolutePath()));
            ZipFile zipFile = this.c;
            Object obj = jmaVar.a;
            int i = kzy.b;
            byte[] bArr = new byte[4096];
            if (file.exists()) {
                file.delete();
            }
            InputStream inputStream = zipFile.getInputStream((ZipEntry) obj);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                kzr.l(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream == null) {
                    return;
                }
                inputStream.close();
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        }
    }
}
