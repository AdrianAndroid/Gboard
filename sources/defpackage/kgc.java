package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kgc  reason: default package */
/* loaded from: classes.dex */
public final class kgc {
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");
    public final oiy b;
    public final Context c;

    static {
        jdg.n(jgf.f);
    }

    public kgc(oiy oiyVar, Context context) {
        this.b = oiyVar;
        this.c = context;
    }

    public static /* synthetic */ lfb a() {
        try {
            return lfb.g(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
        } catch (Error e) {
            e = e;
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).t("MemoryInfo.getOtherPss(which) failure");
            return ldu.a;
        } catch (NoSuchMethodException unused) {
            return ldu.a;
        } catch (Exception e2) {
            e = e2;
            ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "lambda$static$0", '^', "MemoryUsageCapture.java")).t("MemoryInfo.getOtherPss(which) failure");
            return ldu.a;
        }
    }

    public static Long b(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (!matcher.find()) {
                return null;
            }
            String group = matcher.group(1);
            jez.X(group);
            return Long.valueOf(Long.parseLong(group));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
