package defpackage;

import android.util.Printer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ifv  reason: default package */
/* loaded from: classes.dex */
public class ifv implements ijh {
    public final Map a;

    private ifv(Map map) {
        this.a = map;
    }

    public static ifv b() {
        return (ifv) ijl.b().a(ifv.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Class cls, igk igkVar, boolean z) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar == null) {
            if (!z) {
                return;
            }
            ijl.b().g(new ifv(llw.l(cls, igkVar)));
        } else if (z) {
            ijl b = ijl.b();
            lls i = llw.i(ifvVar.a.size() + 1);
            i.j(ifvVar.a);
            i.a(cls, igkVar);
            b.g(new ifv(i.l()));
        } else if (!ifvVar.a.containsKey(cls)) {
        } else {
            HashMap hashMap = new HashMap(ifvVar.a);
            hashMap.remove(cls);
            ijl.b().g(new ifv(llw.k(hashMap)));
        }
    }

    @Override // defpackage.ijg
    public final boolean a() {
        return true;
    }

    public final igg c(Class cls) {
        igk d = d(cls);
        if (d != null) {
            return d.a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final igk d(Class cls) {
        return (igk) this.a.get(cls);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar != null) {
            for (igk igkVar : ifvVar.a.values()) {
                ifw a = igkVar.a();
                if (a != null) {
                    gzu.a(printer, "interface: %s, tag: %s", igkVar.a.a.getSimpleName(), a.getDumpableTag());
                } else {
                    gzu.a(printer, "interface: %s, not instantiated", igkVar.a.a.getSimpleName());
                }
            }
        }
    }

    public final Set e(Class... clsArr) {
        lmx g = lmz.g();
        for (Map.Entry entry : this.a.entrySet()) {
            Class<?> cls = ((igk) entry.getValue()).a.b;
            int i = 0;
            while (true) {
                if (i <= 0) {
                    if (clsArr[i].isAssignableFrom(cls)) {
                        i++;
                    }
                } else {
                    g.d((Class) entry.getKey());
                    break;
                }
            }
        }
        return g.g();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "AvailableModulesNotification";
    }
}
