package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iej  reason: default package */
/* loaded from: classes.dex */
public final class iej {
    private static final ltg c = ltg.j("com/google/android/libraries/inputmethod/metrics/manager/SessionManager");
    public volatile opu b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    public volatile idu a = new idu();

    private final void c() {
        this.a = new idu(this.e);
    }

    private final boolean d(idq idqVar) {
        return this.e.containsKey(idqVar);
    }

    private final opu e() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalArgumentException("delegate has not been set.");
    }

    public final synchronized void a(idq idqVar) {
        idq a = idqVar.a();
        if (a != null) {
            Set set = (Set) this.d.get(a);
            if (set == null) {
                set = new LinkedHashSet();
                this.d.put(a, set);
            }
            set.add(idqVar);
        }
        if (d(idqVar)) {
            ((ltd) ((ltd) c.d()).k("com/google/android/libraries/inputmethod/metrics/manager/SessionManager", "beginSession", 53, "SessionManager.java")).w("Try to begin an already begun session [%s], end it first", idqVar);
            b(idqVar);
        }
        idq a2 = idqVar.a();
        if (a2 != null && !d(a2)) {
            ((ltd) ((ltd) c.c()).k("com/google/android/libraries/inputmethod/metrics/manager/SessionManager", "beginSession", 60, "SessionManager.java")).G("Try to begin a session [%s] whose parent [%s] hasn't begun.", idqVar, a2);
        }
        idqVar.b();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Long l = (Long) this.f.remove(idqVar);
        if (l != null && valueOf.longValue() <= l.longValue()) {
            valueOf = Long.valueOf(l.longValue() + 1);
        }
        this.e.put(idqVar, valueOf);
        c();
        opu e = e();
        long longValue = valueOf.longValue();
        ((ieh) e.a).m(idd.BEGIN_SESSION, this.a, idqVar, Long.valueOf(longValue));
    }

    public final synchronized void b(idq idqVar) {
        Long l = (Long) this.e.get(idqVar);
        if (l == null) {
            ((ltd) ((ltd) c.d()).k("com/google/android/libraries/inputmethod/metrics/manager/SessionManager", "endSession", 88, "SessionManager.java")).w("Try to end a not begun session [%s].", idqVar);
            return;
        }
        Set<idq> set = (Set) this.d.get(idqVar);
        if (set != null && !set.isEmpty()) {
            for (idq idqVar2 : set) {
                if (d(idqVar2)) {
                    ((ltd) ((ltd) c.d()).k("com/google/android/libraries/inputmethod/metrics/manager/SessionManager", "endSession", 96, "SessionManager.java")).G("Child session [%s] is not ended while ending session [%s], ending it now.", idqVar2, this.e);
                    b(idqVar2);
                }
            }
        }
        opu e = e();
        long longValue = l.longValue();
        ((ieh) e.a).m(idd.END_SESSION, this.a, idqVar, Long.valueOf(longValue));
        this.e.remove(idqVar);
        this.f.put(idqVar, l);
        c();
    }
}
