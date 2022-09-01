package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: PG */
/* renamed from: aez  reason: default package */
/* loaded from: classes.dex */
public final class aez {
    private static final aey a = aey.a;

    public static final void a(an anVar, String str) {
        oll.e(anVar, "fragment");
        aew aewVar = new aew(anVar, str);
        i(aewVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_FRAGMENT_REUSE) || !j(g, anVar.getClass(), aewVar.getClass())) {
            return;
        }
        h(g, aewVar);
    }

    public static final void b(an anVar, ViewGroup viewGroup) {
        oll.e(anVar, "fragment");
        afa afaVar = new afa(anVar, viewGroup);
        i(afaVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_FRAGMENT_TAG_USAGE) || !j(g, anVar.getClass(), afaVar.getClass())) {
            return;
        }
        h(g, afaVar);
    }

    public static final void c(an anVar) {
        afb afbVar = new afb(anVar);
        i(afbVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_TARGET_FRAGMENT_USAGE) || !j(g, anVar.getClass(), afbVar.getClass())) {
            return;
        }
        h(g, afbVar);
    }

    public static final void d(an anVar) {
        afc afcVar = new afc(anVar);
        i(afcVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_TARGET_FRAGMENT_USAGE) || !j(g, anVar.getClass(), afcVar.getClass())) {
            return;
        }
        h(g, afcVar);
    }

    public static final void e(an anVar, an anVar2, int i) {
        afd afdVar = new afd(anVar, anVar2, i);
        i(afdVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_TARGET_FRAGMENT_USAGE) || !j(g, anVar.getClass(), afdVar.getClass())) {
            return;
        }
        h(g, afdVar);
    }

    public static final void f(an anVar, ViewGroup viewGroup) {
        oll.e(anVar, "fragment");
        afg afgVar = new afg(anVar, viewGroup);
        i(afgVar);
        aey g = g(anVar);
        if (!g.b.contains(aex.DETECT_WRONG_FRAGMENT_CONTAINER) || !j(g, anVar.getClass(), afgVar.getClass())) {
            return;
        }
        h(g, afgVar);
    }

    private static final aey g(an anVar) {
        while (anVar != null) {
            if (anVar.ai()) {
                anVar.E();
            }
            anVar = anVar.C;
        }
        return a;
    }

    private static final void h(aey aeyVar, aff affVar) {
        an anVar = affVar.a;
        String name = anVar.getClass().getName();
        if (aeyVar.b.contains(aex.PENALTY_LOG)) {
            oll.a("Policy violation in ", name);
        }
        if (aeyVar.b.contains(aex.PENALTY_DEATH)) {
            bw bwVar = new bw(name, affVar, 15);
            if (anVar.ai()) {
                Handler handler = anVar.E().i.d;
                if (oll.g(handler.getLooper(), Looper.myLooper())) {
                    bwVar.run();
                    return;
                } else {
                    handler.post(bwVar);
                    return;
                }
            }
            bwVar.run();
        }
    }

    private static final void i(aff affVar) {
        if (bi.S(3)) {
            oll.a("StrictMode violation in ", affVar.a.getClass().getName());
        }
    }

    private static final boolean j(aey aeyVar, Class cls, Class cls2) {
        Set set = (Set) aeyVar.c.get(cls);
        if (set == null) {
            return true;
        }
        return (oll.g(cls2.getSuperclass(), aff.class) || !set.contains(cls2.getSuperclass())) && !set.contains(cls2);
    }
}
