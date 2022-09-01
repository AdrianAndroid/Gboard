package defpackage;

import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kts  reason: default package */
/* loaded from: classes.dex */
public final class kts {
    private static final ktr a;
    private static final ktr b;
    private static final Map c;
    private static final Map d;

    static {
        ktp ktpVar = new ktp();
        a = ktpVar;
        ktq ktqVar = new ktq();
        b = ktqVar;
        HashMap hashMap = new HashMap();
        hashMap.put("google", ktpVar);
        hashMap.put("hmd global", ktpVar);
        hashMap.put("infinix", ktpVar);
        hashMap.put("infinix mobility limited", ktpVar);
        hashMap.put("itel", ktpVar);
        hashMap.put("kyocera", ktpVar);
        hashMap.put("lenovo", ktpVar);
        hashMap.put("lge", ktpVar);
        hashMap.put("motorola", ktpVar);
        hashMap.put("nothing", ktpVar);
        hashMap.put("oneplus", ktpVar);
        hashMap.put("oppo", ktpVar);
        hashMap.put("realme", ktpVar);
        hashMap.put("robolectric", ktpVar);
        hashMap.put("samsung", ktqVar);
        hashMap.put("sharp", ktpVar);
        hashMap.put("sony", ktpVar);
        hashMap.put("tcl", ktpVar);
        hashMap.put("tecno", ktpVar);
        hashMap.put("tecno mobile limited", ktpVar);
        hashMap.put("vivo", ktpVar);
        hashMap.put("xiaomi", ktpVar);
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", ktpVar);
        hashMap2.put("jio", ktpVar);
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (li.f()) {
            return true;
        }
        ktr ktrVar = (ktr) c.get(Build.MANUFACTURER.toLowerCase());
        if (ktrVar == null) {
            ktrVar = (ktr) d.get(Build.BRAND.toLowerCase());
        }
        return ktrVar != null && ktrVar.a();
    }
}
