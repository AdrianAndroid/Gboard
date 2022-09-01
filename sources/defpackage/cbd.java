package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: cbd  reason: default package */
/* loaded from: classes.dex */
public final class cbd {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils");
    public static final Pattern b = Pattern.compile("main_([a-z]+)_?([a-z0-9]+)?_d3_(\\d{8,10}?)");
    public static final cbd c = new cbd(jan.b);
    public int d;
    private final jan h;
    public final Map e = new qo();
    public final CountDownLatch f = new CountDownLatch(1);
    public final AtomicBoolean g = new AtomicBoolean(false);
    private final String i = "/system/usr/share/ime/google/d3_lms";

    public cbd(jan janVar) {
        this.h = janVar;
    }

    public static File a(Context context) {
        String str = true != jbe.c(context) ? "Training" : "Main";
        File filesDir = context.getFilesDir();
        for (int i = 1; filesDir == null && i <= 10; i++) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "getFilesDir", 121, "FileLocationUtils.java")).w("%s process context returned null filesDir. Waiting 100ms before retry.", str);
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
        }
        if (filesDir != null) {
            return filesDir;
        }
        dcb.a(context, context.getString(R.string.f149810_resource_name_obfuscated_res_0x7f140147), context.getString(R.string.f149820_resource_name_obfuscated_res_0x7f140148));
        throw new IllegalStateException(str.concat(" process context returned null filesDir.").concat(" Giving up and exiting Gboard."));
    }

    static String h(Context context) {
        String absolutePath = a(context).getAbsolutePath();
        String str = File.separator;
        return absolutePath + str + "personal";
    }

    public final File b(Context context) {
        return this.h.b(hye.b(context));
    }

    public final File c(Context context) {
        return new File(h(context));
    }

    public final File d(Context context) {
        return this.h.b(h(context));
    }

    public final File e(Context context, boolean z) {
        String str = h(context) + File.separator + "blocklist.restored";
        if (z) {
            return this.h.b(str);
        }
        return new File(str);
    }

    public final File f(Context context, boolean z) {
        String str = h(context) + File.separator + "userhistory.restored";
        if (z) {
            return this.h.b(str);
        }
        return new File(str);
    }

    public final File g(Context context) {
        String h = h(context);
        String str = File.separator;
        return this.h.b(h + str + "userhistory");
    }

    public final String i(Context context) {
        String x = jbt.x(context, R.string.f175290_resource_name_obfuscated_res_0x7f140c5f);
        if (TextUtils.isEmpty(x)) {
            context.getResources().getString(R.string.f175290_resource_name_obfuscated_res_0x7f140c5f);
            return this.i;
        }
        return x;
    }

    public final Map j() {
        try {
            this.f.await();
        } catch (InterruptedException e) {
            ((ltd) ((ltd) a.a(hip.a).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "getBundledLanguageModelResources", 472, "FileLocationUtils.java")).t("thread interrupted");
        }
        return llw.k(this.e);
    }
}
