package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.net.URLDecoder;
import j$.nio.charset.StandardCharsets;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: gwj  reason: default package */
/* loaded from: classes.dex */
public final class gwj {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory");
    private static final gwa c = new gwa();
    private static final AtomicBoolean d = new AtomicBoolean(false);
    public final File b;
    private final String e;
    private final llw f;

    public gwj(File file, String str, Map map) {
        this.b = file;
        this.e = str;
        this.f = lre.m(map);
    }

    public static gwg a(Context context, String str) {
        if (jbe.c(context) && d.compareAndSet(false, true)) {
            gxo.b(10).a(new fqa(context, 18), 10L, TimeUnit.SECONDS);
        }
        return new gwg(jbt.m(context), str, g(context));
    }

    static File b(Context context) {
        return new File(jbt.m(context).getCacheDir(), "auto_clean");
    }

    static File c(Context context) {
        return new File(jbt.m(context).getFilesDir(), "auto_clean");
    }

    static String d(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static void e(Context context) {
        Thread.currentThread();
        jan janVar = jan.b;
        File cacheDir = jbt.m(context).getCacheDir();
        gwh g = g(context);
        f(janVar, context, g, b(context));
        f(janVar, context, g, c(context));
        janVar.e(new File(cacheDir, "mozc.data"));
        janVar.e(new File(cacheDir, "BundledEmojiListLoader"));
        janVar.e(new File(cacheDir, "kb_def"));
        janVar.e(new File(cacheDir, "ThemeBuilderActivity_new_image_cache"));
        janVar.f(cacheDir, gbq.e);
        janVar.f(cacheDir, gbq.f);
    }

    static void f(jan janVar, Context context, gwh gwhVar, File file) {
        ArrayList<File> A = lre.A();
        try {
            File[] listFiles = file.getCanonicalFile().listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    try {
                        A.add(file2.getCanonicalFile());
                    } catch (IOException e) {
                        ((ltd) ((ltd) ((ltd) jan.a.c()).i(e)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 1015, "FileOperationUtils.java")).w("listCanonicalFiles(): failed to get canonical file [%s]", file2.getAbsolutePath());
                    }
                }
            }
        } catch (IOException e2) {
            ((ltd) ((ltd) ((ltd) jan.a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/FileOperationUtils", "listCanonicalFiles", 1003, "FileOperationUtils.java")).w("listCanonicalFiles(): failed to get canonical dir [%s]", file.getAbsolutePath());
        }
        for (File file3 : A) {
            if (file3.isDirectory()) {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                try {
                } catch (IOException e3) {
                    e = e3;
                    ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", (char) 344, "AutoCleanableDirectory.java")).s();
                }
                if (TextUtils.isEmpty(file3.getName())) {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty name."));
                }
                File parentFile = file3.getParentFile();
                if (parentFile != null && (parentFile.equals(b(context)) || parentFile.equals(c(context)))) {
                    List k = lfy.c('|').k(d(file3.getName()));
                    String d2 = d((String) k.get(0));
                    if (TextUtils.isEmpty(d2)) {
                        throw new IOException(String.valueOf(String.valueOf(file3)).concat(" doesn't have a name entry."));
                    }
                    lfy c2 = lfy.c('>');
                    EnumMap enumMap = new EnumMap(gwi.class);
                    for (String str : k.subList(1, k.size())) {
                        List k2 = c2.k(str);
                        if (k2.size() != 2) {
                            throw new IOException(String.valueOf(file3) + " has malformed key-value " + str);
                        }
                        if (TextUtils.isEmpty((CharSequence) k2.get(0))) {
                            throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has empty key."));
                        }
                        try {
                            enumMap.put((EnumMap) gwi.a(jdg.Y((String) k2.get(0))), (gwi) d((String) k2.get(1)));
                        } catch (IllegalArgumentException e4) {
                            ((ltd) ((ltd) ((ltd) a.d()).i(e4)).k("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "fromFile", 238, "AutoCleanableDirectory.java")).w("Key %s is invalid", k2.get(0));
                        }
                    }
                    try {
                        gwj gwjVar = new gwj(file3, d2, enumMap);
                        String str2 = (String) gwjVar.f.get(gwi.OS);
                        if (TextUtils.isEmpty(str2) || gwhVar.a.equals(str2)) {
                            String str3 = (String) gwjVar.f.get(gwi.APP);
                            if (!TextUtils.isEmpty(str3) && !Long.toString(gwhVar.b).equals(str3)) {
                            }
                        }
                        try {
                            janVar.e(file3);
                        } catch (IOException e5) {
                            e = e5;
                            ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/cache/AutoCleanableDirectory", "cleanup", (char) 344, "AutoCleanableDirectory.java")).s();
                        }
                    } catch (IllegalArgumentException e6) {
                        throw new IOException(String.valueOf(String.valueOf(file3)).concat(" has duplicate key."), e6);
                    }
                } else {
                    throw new IOException(String.valueOf(String.valueOf(file3)).concat(" is not located in correct directories."));
                }
            }
        }
    }

    private static gwh g(Context context) {
        return (gwh) c.a(new etm(context, 12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwj)) {
            return false;
        }
        gwj gwjVar = (gwj) obj;
        return Objects.equals(this.b, gwjVar.b) && Objects.equals(this.e, gwjVar.e) && Objects.equals(this.f, gwjVar.f);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.e, this.f);
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("directory", this.b);
        S.b("name", this.e);
        S.b("properties", this.f);
        return S.toString();
    }
}
