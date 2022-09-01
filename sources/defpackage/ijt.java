package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.permissions.PermissionsActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ijt  reason: default package */
/* loaded from: classes.dex */
public final class ijt implements inm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager");
    private static ijt g;
    public final Context b;
    public final ino c;
    public volatile Activity f;
    private volatile boolean i;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    private final SparseArray h = new SparseArray();
    public final SparseArray e = new SparseArray();
    private final AtomicInteger j = new AtomicInteger(0);

    private ijt(Context context) {
        this.b = context;
        this.c = ino.M(context);
    }

    public static ijt e(Context context) {
        ijt ijtVar;
        synchronized (ijt.class) {
            if (g == null) {
                ijt ijtVar2 = new ijt(context.getApplicationContext());
                g = ijtVar2;
                ijtVar2.c.W(ijtVar2);
            }
            ijtVar = g;
        }
        return ijtVar;
    }

    private static void s(String str, ijr ijrVar, boolean z) {
        Iterator it = ijrVar.c.iterator();
        while (it.hasNext()) {
            ((ijs) it.next()).a(str, z);
        }
    }

    public final int a() {
        return this.j.incrementAndGet();
    }

    public final int c(ty tyVar) {
        int a2 = a();
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "registerResultCallback", 391, "FeaturePermissionsManager.java")).z("RequestCode = %d : Callback = %s", a2, tyVar.getClass().getName());
        synchronized (this.e) {
            this.e.put(a2, tyVar);
        }
        return a2;
    }

    public final ijr d(int i) {
        return (ijr) this.d.get(this.c.p(i));
    }

    public final void f(int i, List list) {
        synchronized (this.h) {
            this.h.put(i, list);
        }
    }

    public final void g() {
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            if (this.c.ak(str) && !ijw.c(this.b, ((ijr) entry.getValue()).b)) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "disableFeaturesWithDeniedPermissions", 780, "FeaturePermissionsManager.java")).w("disableFeaturesWithDeniedPermissions() : Disable %s", str);
                this.c.f(str, false);
            }
        }
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        ijr ijrVar = (ijr) this.d.get(str);
        if (ijrVar == null) {
            return;
        }
        if (!inoVar.ak(str)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onPreferenceChanged", 551, "FeaturePermissionsManager.java")).w("Disable %s", ijrVar);
            s(str, ijrVar, false);
            return;
        }
        ArrayList A = lre.A();
        if (ijw.d(this.b, ijrVar.b, A)) {
            int a2 = a();
            f(a2, lre.D(str));
            r(a2, str, A);
            return;
        }
        s(str, ijrVar, true);
    }

    public final void h(Activity activity) {
        this.f = activity;
        this.i = false;
    }

    public final void i(Activity activity) {
        if (this.f == activity) {
            this.f = null;
        }
    }

    public final void j(int i, String[] strArr, int[] iArr) {
        List<String> list;
        ty tyVar;
        ltg ltgVar = a;
        Integer valueOf = Integer.valueOf(i);
        cae caeVar = new cae(strArr, 15);
        lvw.e(caeVar);
        cae caeVar2 = new cae(iArr, 16);
        lvw.e(caeVar2);
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 416, "FeaturePermissionsManager.java")).J("RequestCode = %d : Permissions = %s : Results = %s", valueOf, caeVar, caeVar2);
        getClass().getSimpleName();
        ijw.e(strArr, iArr);
        synchronized (this.h) {
            list = (List) this.h.get(i);
            if (list != null) {
                this.h.remove(i);
            }
        }
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 427, "FeaturePermissionsManager.java")).w("Features = %s", list);
        if (list == null) {
            synchronized (this.e) {
                tyVar = (ty) this.e.get(i);
            }
            if (tyVar != null) {
                ((ltd) ((ltd) ltgVar.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 466, "FeaturePermissionsManager.java")).w("Callback = %s", tyVar.getClass().getName());
                tyVar.onRequestPermissionsResult(i, strArr, iArr);
                return;
            }
            ((ltd) ((ltd) ltgVar.c()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 474, "FeaturePermissionsManager.java")).u("Invalid request code: %d", i);
            return;
        }
        ArrayList<ijr> A = lre.A();
        for (String str : list) {
            ijr ijrVar = (ijr) this.d.get(str);
            if (ijrVar == null) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 433, "FeaturePermissionsManager.java")).w("Feature %s not found", str);
            } else if (this.c.ak(str)) {
                if (!ijw.c(this.b, ijrVar.b)) {
                    ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 442, "FeaturePermissionsManager.java")).w("%s : Not Granted", str);
                    this.c.f("denied_feature_".concat(String.valueOf(str)), true);
                    this.c.ad(this);
                    this.c.f(str, false);
                    this.c.W(this);
                    A.add(ijrVar);
                } else {
                    ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "onRequestPermissionsResult", 445, "FeaturePermissionsManager.java")).w("%s : Granted", str);
                    this.c.w("denied_feature_".concat(String.valueOf(str)));
                    s(str, ijrVar, true);
                }
            }
        }
        if (A.isEmpty()) {
            return;
        }
        Context context = this.f;
        if (context == null) {
            hsk b = hsx.b();
            if (b == null) {
                ((ltd) ((ltd) a.c()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "showToast", 517, "FeaturePermissionsManager.java")).t("No service, can't show toast!");
                return;
            }
            context = b.D();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(R.string.f176660_resource_name_obfuscated_res_0x7f140ced));
        for (ijr ijrVar2 : A) {
            sb.append('\n');
            sb.append(context.getString(ijrVar2.a));
        }
        ker.o(context, sb.toString());
    }

    public final void k(int i, int i2, String... strArr) {
        String p = this.c.p(i);
        if (this.d.putIfAbsent(p, new ijr(i2, strArr)) != null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "registerFeature", 353, "FeaturePermissionsManager.java")).w("Cannot register feature [%s] more than once", p);
        }
    }

    public final void l(int i, ijs ijsVar) {
        ijr d = d(i);
        if (d == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "registerOnFeatureChangeListener", 717, "FeaturePermissionsManager.java")).u("Feature [%s] is not registered", i);
        } else {
            d.c.add(ijsVar);
        }
    }

    public final boolean m(String str) {
        synchronized (this.h) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                if (((List) this.h.valueAt(i)).contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean n(int i) {
        if (!this.c.aj(i)) {
            return false;
        }
        return o(i);
    }

    public final boolean o(int i) {
        ijr d = d(i);
        if (d == null) {
            ((ltd) a.a(hip.a).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "isFeaturePermissionsGranted", 701, "FeaturePermissionsManager.java")).u("Feature [%s] is not registered", i);
            return false;
        }
        return ijw.c(this.b, d.b);
    }

    public final String[] p() {
        ArrayList A = lre.A();
        for (Map.Entry entry : this.d.entrySet()) {
            if (m((String) entry.getKey())) {
                ijw.d(this.b, ((ijr) entry.getValue()).b, A);
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "getDeniedPermissionsOfFeatures", 767, "FeaturePermissionsManager.java")).w("DeniedPermissions = %s", A);
        return (String[]) A.toArray(new String[0]);
    }

    public final void q(int i, String... strArr) {
        ArrayList A = lre.A();
        if (ijw.d(this.b, strArr, A)) {
            r(i, null, A);
        }
    }

    public final void r(int i, String str, List list) {
        Activity activity = this.f;
        if (activity != null) {
            ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "requestPermissions", 602, "FeaturePermissionsManager.java")).u("RequestCode = %d : Current Activity", i);
            ijr ijrVar = str != null ? (ijr) this.d.get(str) : null;
            if (str != null && ijrVar != null && !ijrVar.c.isEmpty()) {
                String[] strArr = (String[]) list.toArray(new String[0]);
                Iterator it = ijrVar.c.iterator();
                while (it.hasNext()) {
                    ((ijs) it.next()).b();
                }
            }
            ijw.b(activity, i, list);
            return;
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/permissions/FeaturePermissionsManager", "requestPermissions", 607, "FeaturePermissionsManager.java")).u("RequestCode = %d : No Activity", i);
        Object b = hsx.b();
        if (b == null) {
            b = this.b;
        }
        this.i = true;
        Context context = (Context) b;
        Intent intent = new Intent(context.getApplicationContext(), PermissionsActivity.class);
        intent.putExtra("requested_permissions", (String[]) list.toArray(new String[0]));
        intent.putExtra("request_code", i);
        if (str != null) {
            intent.putExtra("feature_key", str);
        }
        intent.addFlags(268468224);
        context.startActivity(intent);
    }
}
