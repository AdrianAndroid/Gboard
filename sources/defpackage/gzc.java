package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gzc  reason: default package */
/* loaded from: classes.dex */
public final class gzc implements gzv {
    public boolean d;
    private boolean i;
    private final mkr j;
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/datafilemanager/DataFileManager");
    private static final llp f = llp.q();
    private static final llw g = lrq.b;
    public static final gzc b = new gzc();
    public final Map c = new HashMap();
    private final Map h = new HashMap();
    mko e = mkk.a;

    private gzc() {
        mks c = gxo.c(10);
        this.j = c;
        gzt.a.a(this);
    }

    private final synchronized Object f(Map map, Object obj, Object obj2, leq leqVar) {
        return g((Map) g(map, obj, fxd.m), obj2, leqVar);
    }

    private final synchronized Object g(Map map, Object obj, leq leqVar) {
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            Object a2 = leqVar.a(null);
            map.put(obj, a2);
            return a2;
        }
        return obj2;
    }

    private static Object h(Map map, Object obj, Object obj2) {
        Map map2 = (Map) map.get(obj);
        if (map2 == null) {
            return null;
        }
        return map2.get(obj2);
    }

    private final synchronized Set i(gzf gzfVar) {
        HashSet hashSet;
        hashSet = new HashSet();
        List list = (List) h(this.h, gzfVar.b, gzfVar.c);
        if (list != null) {
            hashSet.addAll(list);
        }
        List list2 = (List) h(this.h, gzfVar.b, "");
        if (list2 != null) {
            hashSet.addAll(list2);
        }
        return hashSet;
    }

    private final synchronized void j() {
        FileInputStream openFileInput;
        if (!this.i) {
            try {
                openFileInput = guw.a().openFileInput("data_file_manager.pb");
            } catch (IOException e) {
                ieh.j().e(gzd.READ, false);
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/libraries/inputmethod/datafilemanager/DataFileManager", "readFromDisk", (char) 376, "DataFileManager.java")).t("error reading data manager entries");
            }
            try {
                gze gzeVar = (gze) nfm.x(gze.b, openFileInput, nfb.b());
                for (int i = 0; i < gzeVar.a.size(); i++) {
                    gzf gzfVar = (gzf) gzeVar.a.get(i);
                    ((List) f(this.c, gzfVar.b, gzfVar.c, fxd.p)).add(gzfVar);
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                ieh.j().e(gzd.READ, true);
                this.i = true;
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                }
                throw th;
            }
        }
    }

    private final synchronized void k(Context context) {
        if (!this.d) {
            this.d = true;
            this.e = mio.g(this.e, new fyn(this, context, 6), this.j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    private final synchronized void l(List list, List list2) {
        HashMap hashMap = new HashMap();
        fxd fxdVar = fxd.q;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gzf gzfVar = (gzf) it.next();
            for (gzg gzgVar : i(gzfVar)) {
                ((ArrayList) ((ijk) g(hashMap, gzgVar, fxdVar)).a).add(gzfVar);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gzf gzfVar2 = (gzf) it2.next();
            for (gzg gzgVar2 : i(gzfVar2)) {
                ((ArrayList) ((ijk) g(hashMap, gzgVar2, fxdVar)).b).add(gzfVar2);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ?? r1 = ((ijk) entry.getValue()).a;
            Object obj = ((ijk) entry.getValue()).b;
            ((gzg) entry.getKey()).a(r1);
        }
    }

    private final synchronized boolean m(Context context, gzf gzfVar) {
        List<gzf> list = (List) f(this.c, gzfVar.b, gzfVar.c, fxd.o);
        for (gzf gzfVar2 : list) {
            if (n(gzfVar2, gzfVar)) {
                ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/datafilemanager/DataFileManager", "addDataWithoutNotify", 163, "DataFileManager.java")).w("data %s already exists", gzfVar2.c);
                return false;
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/datafilemanager/DataFileManager", "addDataWithoutNotify", 167, "DataFileManager.java")).G("adding data %s %s", gzfVar.c, gzfVar.i);
        list.add(gzfVar);
        k(context);
        return true;
    }

    private static final boolean n(gzf gzfVar, gzf gzfVar2) {
        return TextUtils.equals(gzfVar.d, gzfVar2.d) && gzfVar.f == gzfVar2.f && gzfVar.e == gzfVar2.e && gzfVar.g == gzfVar2.g && TextUtils.equals(gzfVar.h, gzfVar2.h);
    }

    private final synchronized boolean o(Context context, gzf gzfVar) {
        List list = (List) h(this.c, gzfVar.b, gzfVar.c);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (n((gzf) list.get(i), gzfVar)) {
                    list.remove(i);
                    k(context);
                    ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/datafilemanager/DataFileManager", "removeDataWithoutNotify", 200, "DataFileManager.java")).G("removing data %s %s", gzfVar.c, gzfVar.i);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final synchronized void a(Context context, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gzf gzfVar = (gzf) it.next();
            if (m(context, gzfVar)) {
                arrayList.add(gzfVar);
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            gzf gzfVar2 = (gzf) it2.next();
            if (o(context, gzfVar2)) {
                arrayList2.add(gzfVar2);
            }
        }
        l(arrayList, arrayList2);
    }

    public final synchronized List b(String str) {
        Map map = (Map) this.c.get(str);
        if (map == null) {
            return f;
        }
        llk e = llp.e();
        for (List list : map.values()) {
            e.j(list);
        }
        return e.g();
    }

    public final synchronized llp c(String str, String str2) {
        j();
        Map map = (Map) this.c.get(str);
        if (map == null) {
            return f;
        }
        List list = (List) map.get(str2);
        return list == null ? f : llp.o(list);
    }

    public final synchronized llw d() {
        Map map;
        j();
        map = (Map) this.c.get("delight_apps");
        return map == null ? g : llw.k(map);
    }

    @Override // defpackage.gzv
    public final synchronized void dump(Printer printer, boolean z) {
        for (Map.Entry entry : this.c.entrySet()) {
            printer.println(String.valueOf((String) entry.getKey()).concat(":"));
            for (List<gzf> list : ((Map) entry.getValue()).values()) {
                for (gzf gzfVar : list) {
                    Object[] objArr = new Object[4];
                    objArr[0] = gzfVar.c;
                    objArr[1] = gzfVar.h;
                    objArr[2] = gzfVar.i;
                    String str = gzfVar.d;
                    String parent = guw.a().getFilesDir().getParent();
                    if (parent != null && str.startsWith(parent)) {
                        str = "APPDATA/".concat(String.valueOf(str.substring(parent.length())));
                    }
                    objArr[3] = str;
                    printer.println(String.format("%s\t%s\t%s\t%s", objArr));
                }
            }
        }
    }

    public final synchronized void e(String str, gzg gzgVar) {
        ((List) f(this.h, str, "", fxd.n)).add(gzgVar);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DataFileManager";
    }
}
