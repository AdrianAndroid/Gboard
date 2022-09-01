package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jwe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jwe implements jtn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jwe(dhs dhsVar, juc jucVar, File file, int i) {
        this.d = i;
        this.a = dhsVar;
        this.c = jucVar;
        this.b = file;
    }

    public /* synthetic */ jwe(juc jucVar, String str, File file, int i) {
        this.d = i;
        this.a = jucVar;
        this.b = str;
        this.c = file;
    }

    @Override // defpackage.jtn
    public final Object a(jrr jrrVar) {
        String substring;
        if (this.d != 0) {
            Object obj = this.a;
            Object obj2 = this.c;
            Object obj3 = this.b;
            jrrVar.a();
            juc jucVar = (juc) obj2;
            jucVar.o();
            if (jucVar.j().equals("manifests")) {
                substring = "handwriting.superpack_manifest.local.json";
            } else {
                String str = (String) jucVar.g().get(0);
                substring = str.substring(str.lastIndexOf(47) + 1);
            }
            dhs dhsVar = (dhs) obj;
            File file = new File(dhsVar.c, substring);
            file.getAbsolutePath();
            File file2 = (File) obj3;
            file2.getAbsolutePath();
            if (!dhsVar.b.g(file)) {
                ((ltd) ((ltd) dhs.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/LocalFileFetcher", "lambda$fetch$0", 99, "LocalFileFetcher.java")).w("Source file '%s' does not exist", file.getAbsolutePath());
                String absolutePath = file.getAbsolutePath();
                throw new IllegalArgumentException("Source file '" + absolutePath + "' does not exist.");
            } else if (!dhsVar.b.c(file, file2)) {
                ((ltd) ((ltd) dhs.a.c()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/LocalFileFetcher", "lambda$fetch$0", 104, "LocalFileFetcher.java")).G("fetch(): Error copying from '%s' to '%s'", file.getAbsolutePath(), file2.getAbsolutePath());
                String absolutePath2 = file.getAbsolutePath();
                throw new IllegalArgumentException("Source file '" + absolutePath2 + "' could not be copied.");
            } else {
                return jtx.a("local://".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
        Object obj4 = this.a;
        Object obj5 = this.b;
        Object obj6 = this.c;
        String str2 = (String) obj5;
        String concat = str2.concat("_checksum");
        juc jucVar2 = (juc) obj4;
        String b = jucVar2.n().b(concat, null);
        if (b == null) {
            throw new jsg(String.format(Locale.US, "Manifest for pack %s is missing expected extra '%s'", obj4, concat));
        }
        jwg t = kcu.t(str2);
        if (t == null) {
            throw new IllegalStateException(String.format(Locale.US, "Unsupported validation scheme %s for pack %s", obj5, obj4));
        }
        FileInputStream fileInputStream = new FileInputStream((File) obj6);
        try {
            String a = t.a(fileInputStream, jrrVar);
            lug lugVar = jsh.a;
            jtq.g((File) obj6);
            fileInputStream.close();
            if (jtq.n(a).equalsIgnoreCase(jtq.n(b))) {
                return null;
            }
            String format = String.format(Locale.US, "Pack %s checksum validation failed, expected: %s, actual: %s", obj4, b, a);
            jucVar2.o();
            throw new jtz(format);
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }
}
