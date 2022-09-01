package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iwj  reason: default package */
/* loaded from: classes.dex */
public final class iwj extends ifu {
    final /* synthetic */ iwk a;

    public iwj(iwk iwkVar) {
        this.a = iwkVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        ifv ifvVar = (ifv) ijgVar;
        if (this.a.f) {
            return;
        }
        Set<Class> e = ifvVar.e(iwm.class);
        for (Class cls : e) {
            if (!this.a.b.containsKey(cls)) {
                ifw b = igr.d(this.a.c).b(cls);
                iwm iwmVar = b instanceof iwm ? (iwm) b : null;
                if (iwmVar != null) {
                    ixe ixeVar = this.a.e;
                    if (ixeVar == null) {
                        ((ltd) ((ltd) iwk.a.c()).k("com/google/android/libraries/inputmethod/trainingcache/producer/processormanager/TrainingCacheMetricsProcessorManager$1", "onReceive", 79, "TrainingCacheMetricsProcessorManager.java")).w("Failed to attach processor for %s, because storage writer is null.", cls);
                    } else {
                        idm c = iwmVar.c(ixeVar);
                        this.a.b.put(cls, c);
                        ieh.j().u(c);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.b.entrySet()) {
            if (!e.contains(entry.getKey())) {
                iwk.c((idm) entry.getValue());
                arrayList.add((Class) entry.getKey());
            }
        }
        this.a.b.keySet().removeAll(arrayList);
    }
}
