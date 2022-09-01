package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: iey  reason: default package */
/* loaded from: classes.dex */
public final class iey extends ifu {
    final /* synthetic */ iez a;

    public iey(iez iezVar) {
        this.a = iezVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        ifv ifvVar = (ifv) ijgVar;
        if (this.a.d == null) {
            ((ltd) ((ltd) iez.a.c()).k("com/google/android/libraries/inputmethod/metricsprocessormanager/MetricsProcessorProviderManager$2", "onReceive", 119, "MetricsProcessorProviderManager.java")).t("Clearcut is not ready yet");
            return;
        }
        Set<Class> e = ifvVar.e(idp.class);
        ArrayList arrayList = new ArrayList();
        for (Class cls : e) {
            if (!this.a.b.containsKey(cls)) {
                ifw b = igr.d(this.a.c).b(cls);
                idp idpVar = b instanceof idp ? (idp) b : null;
                if (idpVar != null) {
                    iez iezVar = this.a;
                    Collection<idj> d = idpVar.d(iezVar.c, iezVar.d);
                    if (!d.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(d.size());
                        arrayList.addAll(d);
                        for (idj idjVar : d) {
                            arrayList2.add(idjVar.getClass());
                        }
                        this.a.b.put(cls, arrayList2);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.a.f.v(arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry : this.a.b.entrySet()) {
            if (!e.contains(entry.getKey())) {
                arrayList3.addAll((Collection) entry.getValue());
                arrayList4.add((Class) entry.getKey());
            }
        }
        if (arrayList4.isEmpty()) {
            return;
        }
        this.a.d.a();
        this.a.f.y(arrayList3);
        this.a.b.keySet().removeAll(arrayList4);
    }
}
