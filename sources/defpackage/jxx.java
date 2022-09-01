package defpackage;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* compiled from: PG */
/* renamed from: jxx  reason: default package */
/* loaded from: classes.dex */
public final class jxx implements juh {
    private final kcq a;

    private jxx(mkr mkrVar) {
        this.a = kcq.h(mkrVar, "ZipUnpacker");
    }

    public static jxx e(mkr mkrVar) {
        return new jxx(mkrVar);
    }

    public static String f(ZipEntry zipEntry) {
        String h = kez.h(zipEntry);
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        throw new IOException("Cannot unzip file containing entry with empty name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(File file) {
        if (file.isDirectory() || file.mkdirs()) {
            return;
        }
        throw new IOException("Cannot create directory ".concat(String.valueOf(file.getAbsolutePath())));
    }

    public static void h(InputStream inputStream, File file, jxw jxwVar, jrr jrrVar, lfe lfeVar) {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                jrrVar.a();
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    if (lfeVar.a(nextEntry)) {
                        jxwVar.a(file, new jxt(zipInputStream), nextEntry, jrrVar);
                        zipInputStream.closeEntry();
                    }
                } else {
                    zipInputStream.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.juh
    public final mko a(final juc jucVar, final String str, final File file, final File file2) {
        lug lugVar = jsh.a;
        jtq.g(file);
        jtq.g(file2);
        if (!c(str)) {
            throw new IllegalArgumentException("Scheme not supported: ".concat(str));
        }
        return this.a.e(jucVar.o(), new jtn() { // from class: jxs
            @Override // defpackage.jtn
            public final Object a(jrr jrrVar) {
                char c;
                jxw jxuVar;
                File file3 = file;
                juc jucVar2 = jucVar;
                File file4 = file2;
                String str2 = str;
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    int f = jucVar2.n().f("padding_bytes");
                    InputStream c2 = f == 0 ? bufferedInputStream : lyp.c(bufferedInputStream, jucVar2.c() - f);
                    try {
                        Set set = (Set) jucVar2.n().a("slice_prefixes_to_keep");
                        lfe jcfVar = set == null ? lfl.ALWAYS_TRUE : new jcf(set, 4);
                        int hashCode = str2.hashCode();
                        if (hashCode != -281254653) {
                            if (hashCode == 120609 && str2.equals("zip")) {
                                c = 0;
                            }
                            c = 65535;
                        } else {
                            if (str2.equals("zip_zip")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                        if (c == 0) {
                            jxuVar = new jxu();
                        } else if (c != 1) {
                            throw new IllegalArgumentException("Unsupported scheme.");
                        } else {
                            jxuVar = new jxv(new jxu());
                        }
                        jxx.h(c2, file4, jxuVar, jrrVar, jcfVar);
                        c2.close();
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            c2.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            }
        });
    }

    @Override // defpackage.jrs
    public final mko b(jsr jsrVar) {
        lug lugVar = jsh.a;
        return this.a.d(jsrVar);
    }

    @Override // defpackage.juh
    public final boolean c(String str) {
        return "zip".equals(str) || "zip_zip".equals(str);
    }

    @Override // defpackage.jsj
    public final String d() {
        return "ZipUnpacker";
    }
}
