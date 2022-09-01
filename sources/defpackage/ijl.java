package defpackage;

import android.text.TextUtils;
import android.util.Printer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijl  reason: default package */
/* loaded from: classes.dex */
public final class ijl implements gzv {
    public static final ijh a = new iji();
    private static volatile ijl d;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    public ijl() {
        gzt.a.a(this);
    }

    public static ijl b() {
        ijl ijlVar = d;
        if (ijlVar == null) {
            synchronized (ijl.class) {
                ijlVar = d;
                if (ijlVar == null) {
                    ijlVar = new ijl();
                    d = ijlVar;
                }
            }
        }
        return ijlVar;
    }

    private static String i(Class cls) {
        String simpleName = cls.getSimpleName();
        return (TextUtils.isEmpty(simpleName) || simpleName.length() > 127) ? "UNKNOWN" : simpleName;
    }

    private final void j(Class cls, ijg ijgVar) {
        Class cls2 = cls;
        do {
            synchronized (cls2) {
                WeakHashMap weakHashMap = (WeakHashMap) this.b.get(cls2);
                if (weakHashMap != null && !weakHashMap.isEmpty()) {
                    int size = weakHashMap.size();
                    ijj[] ijjVarArr = new ijj[size];
                    jls[] jlsVarArr = new jls[size];
                    int i = 0;
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        ijjVarArr[i] = (ijj) entry.getKey();
                        jlsVarArr[i] = (jls) entry.getValue();
                        i++;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        jlsVarArr[i2].o(cls, ijgVar);
                    }
                    for (int i3 = 0; i3 < i; i3++) {
                        jlsVarArr[i3].p(ijjVarArr[i3]);
                    }
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                return;
            }
        } while (ijg.class.isAssignableFrom(cls2));
    }

    public final ijh a(Class cls) {
        return (ijh) this.e.get(cls);
    }

    public final void c(ijj ijjVar, Class cls, Executor executor) {
        synchronized (cls) {
            jls h = h(ijjVar, cls, executor);
            ijh a2 = a(cls);
            if (a2 != null) {
                h.o(cls, a2);
                h.p(ijjVar);
            }
        }
    }

    public final void d(ijj ijjVar, Class cls) {
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) this.b.get(cls);
            if (weakHashMap != null) {
                jls jlsVar = (jls) weakHashMap.remove(ijjVar);
                if (jlsVar != null) {
                    synchronized (jlsVar.b) {
                        ((ArrayDeque) jlsVar.b).clear();
                    }
                }
                if (weakHashMap.isEmpty()) {
                    this.b.remove(cls);
                }
            }
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Sticky notifications:");
        gzw gzwVar = new gzw(printer);
        for (Map.Entry entry : this.e.entrySet()) {
            gzu.b(printer, gzwVar, (ijh) entry.getValue(), z);
        }
    }

    public final boolean e(Class cls) {
        boolean z;
        i(cls);
        synchronized (cls) {
            if (this.e.remove(cls) != null) {
                j(cls, a);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean f(Class cls) {
        return this.b.containsKey(cls);
    }

    public final boolean g(ijg ijgVar) {
        boolean z;
        Class<?> cls = ijgVar.getClass();
        i(cls);
        synchronized (cls) {
            z = true;
            if (ijgVar instanceof ijh) {
                if (this.e.put(cls, (ijh) ijgVar) != ijgVar) {
                    j(cls, ijgVar);
                } else {
                    z = false;
                }
            } else {
                j(cls, ijgVar);
            }
        }
        return z;
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "NotificationCenter";
    }

    public final jls h(ijj ijjVar, Class cls, Executor executor) {
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) this.b.get(cls);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.b.put(cls, weakHashMap);
            } else {
                jls jlsVar = (jls) weakHashMap.get(ijjVar);
                if (jlsVar != null) {
                    return jlsVar;
                }
            }
            Class<?> cls2 = ijjVar.getClass();
            String simpleName = cls2.getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                String name = cls2.getName();
                simpleName = TextUtils.isEmpty(name) ? "UNKNOWN" : name.substring(name.lastIndexOf(".") + 1);
            }
            String str = i(cls) + "->" + simpleName;
            if (str.length() > 127) {
                str.substring(0, 127);
            }
            jls jlsVar2 = new jls(executor, (byte[]) null);
            weakHashMap.put(ijjVar, jlsVar2);
            WeakHashMap weakHashMap2 = (WeakHashMap) this.c.get(cls);
            if (weakHashMap2 != null) {
                lsz it = llw.k(weakHashMap2).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    ((Executor) entry.getValue()).execute(new idx(entry, ijjVar, 6));
                }
            }
            return jlsVar2;
        }
    }
}
