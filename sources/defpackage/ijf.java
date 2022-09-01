package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijf  reason: default package */
/* loaded from: classes.dex */
public final class ijf {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager");
    private static final Map c = new ConcurrentHashMap();
    public static final Map b = new ConcurrentHashMap();

    private ijf() {
    }

    public static ija a(Runnable runnable, iiy iiyVar) {
        return new ije(true, runnable, null, iiyVar.getClass());
    }

    public static ija b(Runnable runnable, iiy... iiyVarArr) {
        int length = iiyVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return a(runnable, iiyVarArr[0]);
            }
            return new ijc(true, runnable, null, iiyVarArr);
        }
        throw new IllegalArgumentException("tagObjects is empty");
    }

    public static ija c(Runnable runnable, Runnable runnable2, iiy iiyVar) {
        return new ije(false, runnable, runnable2, iiyVar.getClass());
    }

    public static ija d(Runnable runnable, Runnable runnable2, iiy... iiyVarArr) {
        int length = iiyVarArr.length;
        if (length != 0) {
            if (length == 1) {
                return c(runnable, runnable2, iiyVarArr[0]);
            }
            return new ijc(false, runnable, runnable2, iiyVarArr);
        }
        throw new IllegalArgumentException("tagObjects is empty");
    }

    public static Executor e(Executor executor) {
        return gxp.d(executor) ? executor : kcu.E(executor);
    }

    public static void f(iiy... iiyVarArr) {
        for (int i = 0; i < 3; i++) {
            ijl.b().e(iiyVarArr[i].getClass());
        }
    }

    public static void g(String str, iiy iiyVar) {
        synchronized (ijf.class) {
            Class<?> cls = iiyVar.getClass();
            Map map = c;
            ijk ijkVar = (ijk) map.get(str);
            Map map2 = b;
            ijk ijkVar2 = (ijk) map2.get(cls);
            if (ijkVar == null && ijkVar2 == null) {
                ijk ijkVar3 = new ijk(str, iiyVar);
                map.put(str, ijkVar3);
                map2.put(cls, ijkVar3);
            } else if (ijkVar != ijkVar2 || (ijkVar2 != null && ijkVar2.b != iiyVar)) {
                throw new IllegalArgumentException(str + " component is already registered with a different value.");
            }
        }
    }

    public static boolean h(iiy... iiyVarArr) {
        for (iiy iiyVar : iiyVarArr) {
            if (!i(iiyVar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(iiy iiyVar) {
        return ijl.b().a(iiyVar.getClass()) == iiyVar;
    }

    public static boolean j(iiy iiyVar) {
        return ijl.b().g(iiyVar);
    }

    public static boolean k(iiy iiyVar) {
        return ijl.b().e(iiyVar.getClass());
    }
}
