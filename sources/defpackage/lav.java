package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: lav  reason: default package */
/* loaded from: classes.dex */
public final class lav {
    private static final jlt c = new jlt("SplitInstallInfoProvider");
    private final Context a;
    private final String b;

    public lav(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static String a(String str) {
        return d(str) ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean d(String str) {
        return str.startsWith("config.");
    }

    public static boolean e(String str) {
        return d(str) || str.contains(".config.");
    }

    private final Bundle g() {
        try {
            ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(this.b, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            c.h("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private final Set h() {
        HashSet hashSet;
        String string;
        HashSet hashSet2 = new HashSet();
        Bundle g = g();
        if (g != null && (string = g.getString("com.android.dynamic.apk.fused.modules")) != null && !string.isEmpty()) {
            Collections.addAll(hashSet2, string.split(",", -1));
            hashSet2.remove("");
            hashSet2.remove("base");
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.b, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            c.h("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            Arrays.toString(strArr);
            Collections.addAll(hashSet2, strArr);
        }
        opu opuVar = (opu) lat.a.get();
        if (opuVar != null) {
            Object obj = opuVar.a;
            AtomicReference atomicReference = kzz.a;
            synchronized (((kzz) obj).c) {
                hashSet = new HashSet(((kzz) obj).c);
            }
            hashSet2.addAll(hashSet);
        }
        return hashSet2;
    }

    public final Set b() {
        HashSet hashSet = new HashSet();
        for (String str : h()) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set c() {
        lbi f = f();
        if (f == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set h = h();
        h.add("");
        Set b = b();
        b.add("");
        for (Map.Entry entry : f.d(b).entrySet()) {
            if (h.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }

    public final lbi f() {
        Bundle g = g();
        if (g == null) {
            c.h("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = g.getInt("com.android.vending.splits");
        if (i == 0) {
            c.h("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            lbi m = laq.m(this.a.getResources().getXml(i), new jlt());
            if (m == null) {
                c.h("Can't parse languages metadata.", new Object[0]);
            }
            return m;
        } catch (Resources.NotFoundException unused) {
            c.h("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
