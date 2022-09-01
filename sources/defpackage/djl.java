package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: djl  reason: default package */
/* loaded from: classes.dex */
public final class djl {
    private static final lug d = lug.i("HMMOEM");
    public final File c;
    private final Context f;
    public final qv a = new qv();
    private final qv e = new qv();
    public final qv b = new qv();

    public djl() {
        Context a = guw.a();
        this.f = a;
        File file = new File(a.getFilesDir(), "hmmoemdata");
        this.c = file;
        String x = jbt.x(a, R.string.f175290_resource_name_obfuscated_res_0x7f140c5f);
        File file2 = new File(true == TextUtils.isEmpty(x) ? "/system/usr/share/ime/google/d3_lms" : x);
        c(true, file);
        c(false, file2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        Integer num = (Integer) this.e.get(str.toLowerCase(Locale.US));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File b(File file, File file2) {
        file2.mkdirs();
        ((luc) ((luc) d.b()).k("com/google/android/apps/inputmethod/libs/hmm/OemDataManager", "unpackToDir", 161, "OemDataManager.java")).G("unzipping %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        jxx e = jxx.e(kcu.C());
        jub p = juc.p();
        p.l("dummy");
        p.m("HMMOEM");
        juc a = p.a();
        try {
            File cacheDir = this.f.getCacheDir();
            String name = file.getName();
            File file3 = new File(cacheDir, name + ".tmp");
            file3.delete();
            e.a(a, "zip", file, file3).get(30L, TimeUnit.SECONDS);
            file3.renameTo(file2);
            return file2;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((luc) ((luc) d.c()).k("com/google/android/apps/inputmethod/libs/hmm/OemDataManager", "unpackToDir", 172, "OemDataManager.java")).G("error unzipping %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
            return null;
        }
    }

    private final void c(boolean z, File file) {
        String str = true != z ? ".zip" : "";
        String str2 = ".+_\\d{10}";
        if (!z) {
            str2 = str2.concat(str);
        }
        File[] listFiles = file.listFiles(new lza(str2));
        if (listFiles == null || (r1 = listFiles.length) == 0) {
            return;
        }
        int length = str.length();
        for (File file2 : listFiles) {
            if (file2.isDirectory() == z) {
                String name = file2.getName();
                String lowerCase = name.substring(0, (name.length() - 11) - length).toLowerCase(Locale.US);
                int parseInt = Integer.parseInt(name.substring((name.length() - 10) - length, name.length() - length));
                ((luc) ((luc) d.b()).k("com/google/android/apps/inputmethod/libs/hmm/OemDataManager", "scanForOemData", 89, "OemDataManager.java")).w("found oem data: %s", file2.getAbsolutePath());
                Integer num = (Integer) this.e.get(lowerCase);
                if (parseInt > (num == null ? 0 : num.intValue())) {
                    File file3 = (File) this.a.get(lowerCase);
                    if (file3 != null) {
                        file3.delete();
                        this.a.remove(lowerCase);
                    }
                    this.e.put(lowerCase, Integer.valueOf(parseInt));
                    if (z) {
                        this.a.put(lowerCase, file2);
                    } else {
                        this.b.put(lowerCase, file2);
                    }
                }
            }
        }
    }
}
