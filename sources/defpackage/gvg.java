package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gvg  reason: default package */
/* loaded from: classes.dex */
public final class gvg implements AutoCloseable, gvk {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/backup/FileBackupFunction");
    private final OutputStream d;
    private ZipOutputStream e;
    private final nfh f = gvq.d.t();
    public final lmh b = lmn.s();
    public long c = 4194304;

    public gvg(OutputStream outputStream) {
        this.d = outputStream;
    }

    public static String a(String str, String str2) {
        return str + "_" + str2;
    }

    @Override // defpackage.gvk
    public final boolean b(String str, String str2, File file) {
        if (!file.exists()) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupFunction", "performBackup", 54, "FileBackupFunction.java")).G("The file(%s) of provider(%s) doesn't exist.", str2, str);
            return false;
        }
        long length = file.length();
        if (length <= this.c) {
            if (this.e == null) {
                ZipOutputStream zipOutputStream = new ZipOutputStream(this.d);
                this.e = zipOutputStream;
                zipOutputStream.setLevel(9);
            }
            ZipOutputStream zipOutputStream2 = this.e;
            ZipEntry zipEntry = new ZipEntry(a(str, str2));
            zipOutputStream2.putNextEntry(zipEntry);
            ltg ltgVar = jan.a;
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 1024);
                    if (read <= 0) {
                        break;
                    }
                    zipOutputStream2.write(bArr, 0, read);
                }
                fileInputStream.close();
                zipOutputStream2.closeEntry();
                this.c -= zipEntry.getCompressedSize();
                lmh lmhVar = this.b;
                nfh nfhVar = this.f;
                nfhVar.b = (nfm) nfhVar.b.N(4);
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                gvq gvqVar = (gvq) nfhVar.b;
                gvq gvqVar2 = gvq.d;
                str2.getClass();
                gvqVar.a |= 1;
                gvqVar.b = str2;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                gvq gvqVar3 = (gvq) nfhVar.b;
                gvqVar3.a |= 2;
                gvqVar3.c = length;
                lmhVar.e(str, (gvq) nfhVar.cz());
                return true;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/backup/FileBackupFunction", "performBackup", 62, "FileBackupFunction.java")).G("The file(%s) of provider(%s) may exceed the backup quota", str2, str);
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ZipOutputStream zipOutputStream = this.e;
        if (zipOutputStream == null) {
            this.d.close();
            return;
        }
        zipOutputStream.close();
        this.e = null;
    }
}
