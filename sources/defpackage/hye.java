package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Printer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: hye  reason: default package */
/* loaded from: classes.dex */
public final class hye implements gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/lethe/CrashDataStore");
    private static final gwa f = new gwa();
    public final SharedPreferences b;
    public final idk c;
    public final jan d;
    public final TreeSet e = new TreeSet(new kp(10));
    private final String g;

    public hye(Context context, SharedPreferences sharedPreferences, idk idkVar, jan janVar) {
        this.b = sharedPreferences;
        this.c = idkVar;
        this.d = janVar;
        this.g = b(context);
        gzt.a.a(this);
    }

    public static String b(Context context) {
        return (String) f.a(new etm(context, 20));
    }

    public final File a() {
        if (TextUtils.isEmpty(this.g)) {
            ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/lethe/CrashDataStore", "getNativeCrashFileInLastStartup", 204, "CrashDataStore.java")).t("Failed to read native crash dir.");
            return null;
        }
        File file = new File(this.g);
        if (!file.exists()) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/lethe/CrashDataStore", "getNativeCrashFileInLastStartup", 209, "CrashDataStore.java")).t("Not found file for native crash.");
            return null;
        }
        File file2 = new File(file, "crash_info");
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public final void c(hyb hybVar) {
        this.e.add(hybVar);
        if (this.e.size() > 5) {
            hyb hybVar2 = (hyb) this.e.first();
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/lethe/CrashDataStore", "saveCrashInMemory", 236, "CrashDataStore.java")).w("Discard saved crash: %s", hybVar2);
            this.e.remove(hybVar2);
        }
    }

    public final void d() {
        nfh t = hyc.b.t();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            hyb hybVar = (hyb) it.next();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            hyc hycVar = (hyc) t.b;
            hybVar.getClass();
            nga ngaVar = hycVar.a;
            if (!ngaVar.c()) {
                hycVar.a = nfm.H(ngaVar);
            }
            hycVar.a.add(hybVar);
        }
        this.b.edit().putString("crash_info", Base64.encodeToString(((hyc) t.cz()).q(), 0)).commit();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        printer.println("Detected crashes:");
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            hyb hybVar = (hyb) it.next();
            lfa T = jdg.T(simpleDateFormat.format(Long.valueOf(hybVar.d)));
            hyd b = hyd.b(hybVar.g);
            if (b == null) {
                b = hyd.JAVA_DEFAULT_EXCEPTION;
            }
            T.b("crash_type", b);
            T.h("foreground_crash", hybVar.b);
            T.h("user_unlocked", hybVar.c);
            T.h("in_flag_safe_mode", hybVar.f);
            T.h("in_decoder_recovery_mode", hybVar.h);
            T.h("cache_cleared", hybVar.j);
            T.f("app_start_counter", hybVar.k);
            printer.println(T.toString());
            for (String str : hybVar.e) {
                printer.println("\t".concat(String.valueOf(str)));
            }
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "CrashDataStore";
    }
}
