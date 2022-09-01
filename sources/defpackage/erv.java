package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: PG */
/* renamed from: erv  reason: default package */
/* loaded from: classes.dex */
public final class erv implements eri {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/theme/core/ZipThemePackage");
    public final eve a;
    private final File c;
    private final eqy d;

    private erv(Context context, File file, eve eveVar) {
        this.c = file;
        this.a = eveVar;
        this.d = eqz.a(context, eveVar.h, eveVar.b);
    }

    public static erv b(Context context, File file) {
        eve h = h(file);
        if (h == null) {
            return null;
        }
        return new erv(context, file, h);
    }

    public static boolean g(File file) {
        eve h = h(file);
        return h != null && h.b <= 3;
    }

    private static eve h(File file) {
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry("metadata.binarypb");
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                eve eveVar = (eve) nfm.x(eve.k, inputStream, nfb.b());
                if (inputStream != null) {
                    inputStream.close();
                }
                zipFile.close();
                return eveVar;
            }
            ZipEntry entry2 = zipFile.getEntry("metadata.json");
            if (entry2 == null) {
                zipFile.close();
                return null;
            }
            InputStream inputStream2 = zipFile.getInputStream(entry2);
            erk erkVar = new erk(new InputStreamReader(inputStream2, lel.b));
            eve a = erkVar.a();
            erkVar.close();
            if (inputStream2 != null) {
                inputStream2.close();
            }
            zipFile.close();
            return a;
        } catch (ngd | IOException unused) {
            return null;
        }
    }

    @Override // defpackage.eri
    public final Bitmap a(String str, int i, int i2) {
        try {
            ZipFile zipFile = new ZipFile(this.c);
            ZipEntry entry = zipFile.getEntry(str);
            if (entry == null) {
                zipFile.close();
                return null;
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            int b2 = eqf.b(inputStream, i, i2);
            if (inputStream != null) {
                inputStream.close();
            }
            InputStream inputStream2 = zipFile.getInputStream(entry);
            Bitmap d = eqf.d(inputStream2, b2);
            if (inputStream2 != null) {
                inputStream2.close();
            }
            zipFile.close();
            return d;
        } catch (IOException e) {
            ((ltd) ((ltd) ((ltd) b.d()).i(e)).k("com/google/android/apps/inputmethod/libs/theme/core/ZipThemePackage", "getBitmap", (char) 168, "ZipThemePackage.java")).t("Failed to get bitmap");
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:187:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da A[SYNTHETIC] */
    @Override // defpackage.eri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.euw c(java.util.Set r26, defpackage.euw r27) {
        /*
            Method dump skipped, instructions count: 2280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erv.c(java.util.Set, euw):euw");
    }

    public final lym d(String str) {
        IOException iOException;
        ZipFile zipFile;
        ZipFile zipFile2;
        File file = this.c;
        ZipFile zipFile3 = null;
        try {
            zipFile2 = new ZipFile(file);
        } catch (IOException e) {
            iOException = e;
            zipFile = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ZipEntry entry = zipFile2.getEntry(str);
            if (entry == null) {
                gvt.a(zipFile2);
                return null;
            }
            ers ersVar = new ers(file, entry);
            gvt.a(zipFile2);
            return ersVar;
        } catch (IOException e2) {
            iOException = e2;
            zipFile = zipFile2;
            try {
                ((ltd) ((ltd) ((ltd) ert.a.d()).i(iOException)).k("com/google/android/apps/inputmethod/libs/theme/core/ZipByteSources", "create", '*', "ZipByteSources.java")).t("Failed to operate .zip file");
                gvt.a(zipFile);
                return null;
            } catch (Throwable th2) {
                zipFile3 = zipFile;
                th = th2;
                gvt.a(zipFile3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            zipFile3 = zipFile2;
            gvt.a(zipFile3);
            throw th;
        }
    }

    @Override // defpackage.eri
    public final eve e() {
        return this.a;
    }

    @Override // defpackage.eri
    public final String f() {
        return "zip_".concat(String.valueOf(this.a.h.isEmpty() ? this.c.getName() : this.a.h));
    }
}
