package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.Collection$EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: igr  reason: default package */
/* loaded from: classes.dex */
public final class igr implements gzv {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/module/ModuleManager");
    private static volatile igr h;
    public final Context b;
    public ija f;
    public final Map c = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final mkr d = gxo.c(1);
    public final mkr e = gxo.c(19);

    public igr(Context context) {
        this.b = context;
    }

    public static igr d(Context context) {
        igr igrVar = h;
        if (igrVar == null) {
            synchronized (igr.class) {
                igrVar = h;
                if (igrVar == null) {
                    igrVar = new igr(context.getApplicationContext());
                    if (!jai.b.b()) {
                        igrVar.m();
                    }
                    gzt.a.a(igrVar);
                    h = igrVar;
                }
            }
        }
        return igrVar;
    }

    public static void f(lmz lmzVar, boolean z) {
        lsz it = lmzVar.iterator();
        while (it.hasNext()) {
            igq igqVar = (igq) it.next();
            igqVar.n = z;
            igqVar.a();
        }
    }

    public static boolean h(igg iggVar) {
        return Collection$EL.stream(iggVar.e().entrySet()).allMatch(dzj.k);
    }

    public static final igg j(String str) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar == null) {
            return null;
        }
        for (Map.Entry entry : ifvVar.a.entrySet()) {
            if (((Class) entry.getKey()).getName().equals(str)) {
                return ((igk) entry.getValue()).a;
            }
        }
        return null;
    }

    public static final boolean k(Class cls) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        return (ifvVar == null || ifvVar.a.get(cls) == null) ? false : true;
    }

    private static igk l(Class cls) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar == null) {
            cls.getSimpleName();
            return null;
        }
        return ifvVar.d(cls);
    }

    private final synchronized void m() {
        ija a2 = ijf.a(new hvg(this, 17), ino.a);
        this.f = a2;
        a2.e(mjl.a);
    }

    public final ifw a(Class cls) {
        igk l = l(cls);
        if (l == null) {
            cls.getSimpleName();
            return null;
        }
        return (ifw) cls.cast(l.a());
    }

    public final ifw b(Class cls) {
        igk l = l(cls);
        if (l == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/libraries/inputmethod/module/ModuleManager", "loadModule", 453, "ModuleManager.java")).w("Module %s is not available", cls.getSimpleName());
            return null;
        }
        return (ifw) cls.cast(l.b(this.b));
    }

    public final igg c(Class cls) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar == null) {
            return null;
        }
        return ifvVar.c(cls);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Instantiated modules:");
        gzw gzwVar = new gzw(printer);
        ArrayList arrayList = new ArrayList();
        for (igq igqVar : this.c.values()) {
            Class cls = igqVar.a.a.a;
            ifw a2 = a(cls);
            if (a2 == null) {
                arrayList.add(cls);
            } else {
                gzu.b(printer, gzwVar, a2, z);
            }
        }
        printer.println("Uninstantiated modules:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gzwVar.println(((Class) arrayList.get(i)).toString());
        }
    }

    public final Set e(Class... clsArr) {
        ifv ifvVar = (ifv) ijl.b().a(ifv.class);
        if (ifvVar == null) {
            return lrr.a;
        }
        return ifvVar.e(clsArr);
    }

    public final void g(Class cls) {
        igk l = l(cls);
        if (l != null) {
            l.c(true);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ModuleManager";
    }

    public final boolean i(Class cls) {
        igq igqVar = (igq) this.c.get(cls);
        return igqVar != null && igqVar.o && igqVar.q && igqVar.r && igqVar.t;
    }
}
