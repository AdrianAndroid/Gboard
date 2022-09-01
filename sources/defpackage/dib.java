package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dib  reason: default package */
/* loaded from: classes.dex */
public final class dib {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hint/notice/NoticeManager");
    public hkt b;
    private final LinkedHashMap c;
    private final LinkedHashMap d;
    private final LinkedHashMap e;

    public dib() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.e = linkedHashMap3;
    }

    private final synchronized void f() {
        g(this.e);
        g(this.d);
        g(this.c);
    }

    private static final void g(Map map) {
        Iterator it = map.entrySet().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            hkt hktVar = (hkt) ((Map.Entry) it.next()).getValue();
            long j = hktVar.n == 0 ? hktVar.g : hktVar.h;
            long j2 = hktVar.j;
            if (j2 != 0 && j > 0 && j2 + j < System.currentTimeMillis()) {
                arrayList.add(hktVar);
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/hint/notice/NoticeManager", "pruneTimedOutNotices", 242, "NoticeManager.java")).w("pruneTimedOutNotices(): Removing notice [%s]", hktVar.i);
                it.remove();
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hkt hktVar2 = (hkt) arrayList.get(i);
            Runnable runnable = hktVar2.d;
            if (runnable != null) {
                runnable.run();
            }
            Runnable runnable2 = hktVar2.b;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
    }

    public final synchronized hkt a(Context context) {
        hkt hktVar;
        int i;
        f();
        if (!this.e.isEmpty()) {
            hktVar = (hkt) ((Map.Entry) this.e.entrySet().iterator().next()).getValue();
        } else if (!this.d.isEmpty()) {
            hktVar = (hkt) ((Map.Entry) this.d.entrySet().iterator().next()).getValue();
        } else {
            hktVar = !this.c.isEmpty() ? (hkt) ((Map.Entry) this.c.entrySet().iterator().next()).getValue() : null;
        }
        if (hktVar != null && (i = hktVar.l) != 0) {
            hkr b = hktVar.b();
            b.i(context.getString(i));
            hktVar = b.a();
        }
        this.b = hktVar;
        return hktVar;
    }

    public final synchronized hkt b(String str) {
        hkt hktVar = (hkt) this.e.get(str);
        if (hktVar == null) {
            hktVar = (hkt) this.d.get(str);
        }
        if (hktVar == null) {
            return (hkt) this.c.get(str);
        }
        return hktVar;
    }

    public final void c(hkt hktVar) {
        synchronized (this) {
            hkt hktVar2 = this.b;
            if (hktVar2 != null && hktVar.i.equals(hktVar2.i) && hktVar.m == this.b.m) {
                this.b = hktVar;
            }
            Runnable runnable = hktVar.a;
            if (runnable != null) {
                runnable.run();
            }
            if (hktVar.m == 0) {
                ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/hint/notice/NoticeManager", "post", 141, "NoticeManager.java")).w("Posting notice [%s] to low priority queue", hktVar.i);
                this.c.put(hktVar.i, hktVar);
                this.d.remove(hktVar.i);
                this.e.remove(hktVar.i);
                return;
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/hint/notice/NoticeManager", "post", 154, "NoticeManager.java")).w("Posting notice [%s] to default priority queue", hktVar.i);
            this.d.put(hktVar.i, hktVar);
            this.c.remove(hktVar.i);
            this.e.remove(hktVar.i);
        }
    }

    public final synchronized void d(hkt hktVar) {
        e(hktVar.i);
    }

    public final synchronized void e(String str) {
        hkt hktVar = this.b;
        if (hktVar != null && hktVar.i.equals(str)) {
            this.b = null;
        }
        hkt hktVar2 = (hkt) this.c.remove(str);
        if (hktVar2 == null) {
            hktVar2 = (hkt) this.d.remove(str);
        }
        if (hktVar2 == null) {
            hktVar2 = (hkt) this.e.remove(str);
        }
        if (hktVar2 != null) {
            Runnable runnable = hktVar2.b;
            if (runnable != null) {
                runnable.run();
            }
            ijl.b().g(new dic(str));
        }
    }
}
