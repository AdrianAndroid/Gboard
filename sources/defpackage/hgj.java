package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hgj  reason: default package */
/* loaded from: classes.dex */
public final class hgj implements ifw {
    public static final ltg a = ltg.i();
    public final lay b;
    private Context c;
    private final hgi d = new hgi(this);
    private final Map e = new LinkedHashMap();

    public hgj(lay layVar) {
        oll.e(layVar, "manager");
        this.b = layVar;
    }

    public final synchronized Collection c() {
        Set linkedHashSet;
        Set keySet = this.e.keySet();
        oll.e(keySet, "<this>");
        if (keySet instanceof Collection) {
            int size = keySet.size();
            if (size == 0) {
                linkedHashSet = ojt.a;
            } else if (size == 1) {
                linkedHashSet = nxp.j(keySet instanceof List ? ((List) keySet).get(0) : keySet.iterator().next());
            } else {
                linkedHashSet = new LinkedHashSet(nxp.k(keySet.size()));
                nxp.x(keySet, linkedHashSet);
            }
        } else {
            linkedHashSet = new LinkedHashSet();
            nxp.x(keySet, linkedHashSet);
            int size2 = linkedHashSet.size();
            if (size2 == 0) {
                linkedHashSet = ojt.a;
            } else if (size2 == 1) {
                linkedHashSet = nxp.j(linkedHashSet.iterator().next());
            }
        }
        return linkedHashSet;
    }

    public final synchronized Map d() {
        return this.e;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        Set d = this.b.d();
        new StringBuilder("Installed modules:").append(d);
        printer.println("Installed modules:".concat(d.toString()));
        Set c = this.b.c();
        new StringBuilder("Installed languages:").append(c);
        printer.println("Installed languages:".concat(String.valueOf(c)));
        printer.println("Pending Module Names:".concat(nxp.w(this.e.keySet(), null, null, null, null, 63)));
        Context context = this.c;
        if (context == null) {
            ojh ojhVar = new ojh(null);
            oll.i(ojhVar);
            throw ojhVar;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        String str = "n/a";
        printer.println("splitSourceDirs:".concat(strArr != null ? nxp.E(strArr, null, null, null, null, 63) : str));
        String[] strArr2 = applicationInfo.splitPublicSourceDirs;
        printer.println("splitPublicSourceDirs:".concat(strArr2 != null ? nxp.E(strArr2, null, null, null, null, 63) : str));
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        String[] strArr3 = applicationInfo.splitNames;
        if (strArr3 != null) {
            str = nxp.E(strArr3, null, null, null, null, 63);
        }
        printer.println("splitNames:".concat(str));
    }

    public final synchronized void e() {
        Set d = this.b.d();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : d) {
            if (this.e.keySet().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ((ltd) a.b()).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule", "notifyComponentIfReady", 176, "FeatureSplitObservationModule.kt")).G("Modules: Installed: [%s], Newly installed (notifying): [%s]", d, nxp.w(arrayList, null, null, null, null, 63));
        for (String str : arrayList) {
            ijf.j((iiy) this.e.remove(str));
        }
        if (!arrayList.isEmpty() && this.e.isEmpty()) {
            this.d.g();
        }
        if (!arrayList.isEmpty()) {
            ieh.j().e(hgu.NEWLY_INSTALLED, d);
        }
    }

    public final synchronized boolean f(iiy iiyVar) {
        if (this.e.containsKey("tenoranimation_feature_split")) {
            return true;
        }
        if (ijf.i(iiyVar)) {
            return true;
        }
        Set d = this.b.d();
        if (!d.contains("tenoranimation_feature_split")) {
            return false;
        }
        ((ltd) a.b()).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule", "notifyComponentIfAlreadyInstalled", 137, "FeatureSplitObservationModule.kt")).G("Module %s has already been installed (Installed: %s). Notifying.", "tenoranimation_feature_split", d);
        ijf.j(iiyVar);
        ieh.j().e(hgu.ALREADY_INSTALLED, nxp.n("tenoranimation_feature_split"));
        return true;
    }

    public final synchronized void g(iiy iiyVar) {
        ((ltd) a.b()).j(ltp.e("com/google/android/libraries/inputmethod/featuresplit/FeatureSplitObservationModule", "onSuccessfulInstallRequest", 152, "FeatureSplitObservationModule.kt")).w("deferredInstall(%s) is successfully requested", "tenoranimation_feature_split");
        boolean isEmpty = this.e.isEmpty();
        if (!f(iiyVar)) {
            this.e.put("tenoranimation_feature_split", iiyVar);
            ieh.j().e(hgu.DEFERRED_INSTALL_REQUESTED, nxp.n("tenoranimation_feature_split"));
        }
        if (!isEmpty || this.e.isEmpty()) {
            return;
        }
        this.d.e(gxo.a(19));
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "FeatureSplitObservationModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        oll.e(context, "applicationContext");
        this.c = context;
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
