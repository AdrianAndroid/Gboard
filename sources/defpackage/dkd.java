package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.DataManagerImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: dkd  reason: default package */
/* loaded from: classes.dex */
public final class dkd implements djm {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider");
    public final din a;
    private final jan c = jan.b;
    private final File d;

    public dkd(File file, int i, int i2) {
        this.d = file;
        this.a = new din(i2, i);
    }

    private final mpg f(String str) {
        File file = new File(this.d, str);
        if (this.d == null || !this.c.g(file)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadDataScheme", 52, "DownloadDictionaryDataProvider.java")).t("Missing data scheme file from Superpacks");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            try {
                ndt cr = mpg.e.t().cr(bArr, nfb.b());
                String absolutePath = this.d.getAbsolutePath();
                nfh nfhVar = (nfh) cr;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                mpg mpgVar = (mpg) nfhVar.b;
                absolutePath.getClass();
                int i = mpgVar.a | 2;
                mpgVar.a = i;
                mpgVar.d = absolutePath;
                mpgVar.a = i | 1;
                mpgVar.c = "";
                int size = mpgVar.b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mpf mpfVar = (mpf) ((mpg) nfhVar.b).b.get(i2);
                    nfh nfhVar2 = (nfh) mpfVar.N(5);
                    nfhVar2.cG(mpfVar);
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    mpf mpfVar2 = (mpf) nfhVar2.b;
                    mpf mpfVar3 = mpf.c;
                    mpfVar2.b = 5;
                    mpfVar2.a |= 16;
                    if (nfhVar.c) {
                        nfhVar.cD();
                        nfhVar.c = false;
                    }
                    mpg mpgVar2 = (mpg) nfhVar.b;
                    mpf mpfVar4 = (mpf) nfhVar2.cz();
                    mpfVar4.getClass();
                    nga ngaVar = mpgVar2.b;
                    if (!ngaVar.c()) {
                        mpgVar2.b = nfm.H(ngaVar);
                    }
                    mpgVar2.b.set(i2, mpfVar4);
                }
                return (mpg) nfhVar.cz();
            } catch (ngd e) {
                ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadDataScheme", 73, "DownloadDictionaryDataProvider.java")).w("Error parsing data scheme file %s", str);
                return null;
            }
        } catch (FileNotFoundException unused) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadDataScheme", 61, "DownloadDictionaryDataProvider.java")).w("Data scheme file %s not found!", str);
            return null;
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadDataScheme", 64, "DownloadDictionaryDataProvider.java")).w("Failed to read data scheme file %s", str);
            return null;
        }
    }

    @Override // defpackage.djm
    public final din a() {
        return this.a;
    }

    @Override // defpackage.djm
    public final mpo b(String str) {
        File file = new File(this.d, str);
        if (!this.c.g(file)) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadSettingScheme", 93, "DownloadDictionaryDataProvider.java")).w("Missing setting scheme file %s from Superpacks", str);
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                try {
                    return (mpo) nfm.z(mpo.j, bArr, nfb.b());
                } catch (ngd e) {
                    ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadSettingScheme", 113, "DownloadDictionaryDataProvider.java")).w("Error parsing setting scheme file %s", str);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadSettingScheme", 102, "DownloadDictionaryDataProvider.java")).w("Setting scheme file %s not found!", str);
            return null;
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "loadSettingScheme", 105, "DownloadDictionaryDataProvider.java")).w("Failed to read setting scheme file %s", str);
            return null;
        }
    }

    @Override // defpackage.djm
    public final InputStream c(String str) {
        File file = new File(this.d, str);
        if (!file.exists()) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/apps/inputmethod/libs/hmm/superpacks/DownloadDictionaryDataProvider", "openStreamForFile", (char) 138, "DownloadDictionaryDataProvider.java")).t("Cannot open data");
            return null;
        }
    }

    @Override // defpackage.djm
    public final boolean d(String str, DataManagerImpl dataManagerImpl) {
        mpg f = f(str);
        if (f == null) {
            return false;
        }
        return dataManagerImpl.nativeEnrollDataScheme(dataManagerImpl.a, f.q());
    }

    @Override // defpackage.djm
    public final void e(String str, DataManagerImpl dataManagerImpl) {
        mpg f = f(str);
        if (f == null) {
            return;
        }
        dataManagerImpl.nativeWithdrawDataScheme(dataManagerImpl.a, f.q());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkd)) {
            return false;
        }
        dkd dkdVar = (dkd) obj;
        File file = this.d;
        return file != null && file.equals(dkdVar.d) && this.a.a == dkdVar.a.a;
    }

    public final int hashCode() {
        File file = this.d;
        if (file == null) {
            return 0;
        }
        return file.hashCode();
    }
}
