package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lag  reason: default package */
/* loaded from: classes.dex */
public final class lag implements lad {
    private final /* synthetic */ int a;

    public lag(int i) {
        this.a = i;
    }

    static laf c() {
        return new lah(1);
    }

    public static void d(ClassLoader classLoader, Set set, laf lafVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object f = f(classLoader);
        kcq k = lby.k(f, "nativeLibraryDirectories", List.class);
        synchronized (laq.class) {
            ArrayList arrayList = new ArrayList((Collection) k.k());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            k.l(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] a = lafVar.a(f, new ArrayList(hashSet), arrayList2);
        int i = 0;
        if (!arrayList2.isEmpty()) {
            laj lajVar = new laj("Error in makePathElements");
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(lajVar, (IOException) arrayList2.get(i2));
                } catch (Exception unused) {
                }
            }
            throw lajVar;
        }
        synchronized (laq.class) {
            kcq l = lby.l(f, "nativeLibraryPathElements", Object.class);
            List<Object> asList = Arrays.asList(a);
            Object[] objArr = (Object[]) l.k();
            Object[] objArr2 = (Object[]) Array.newInstance(l.m(), (objArr == null ? 0 : objArr.length) + asList.size());
            if (objArr != null) {
                System.arraycopy(objArr, 0, objArr2, asList.size(), objArr.length);
            }
            for (Object obj : asList) {
                objArr2[i] = obj;
                i++;
            }
            l.l(objArr2);
        }
    }

    public static boolean e(ClassLoader classLoader, File file, File file2, boolean z) {
        return g(classLoader, file, file2, z, "zip", new lai(1));
    }

    static Object f(ClassLoader classLoader) {
        return lby.k(classLoader, "pathList", Object.class).k();
    }

    static boolean g(ClassLoader classLoader, File file, File file2, boolean z, String str, lae laeVar) {
        ArrayList arrayList = new ArrayList();
        Object f = f(classLoader);
        kcq l = lby.l(f, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) l.k());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) lby.k(obj, str, File.class).k());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || laeVar.a(f, file2, file)) {
            l.n(Arrays.asList((Object[]) lby.i(f, Object[].class, List.class, new ArrayList(Collections.singleton(file2)), File.class, file, List.class, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            laj lajVar = new laj("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                IOException iOException = (IOException) arrayList.get(i);
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(lajVar, iOException);
                } catch (Exception unused) {
                }
            }
            lby.l(f, "dexElementsSuppressedExceptions", IOException.class).n(arrayList);
            throw lajVar;
        }
        Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
        return false;
    }

    static void h(ClassLoader classLoader, Set set) {
        d(classLoader, set, new lah(0));
    }

    static boolean i(ClassLoader classLoader, File file, File file2, boolean z) {
        return g(classLoader, file, file2, z, "path", new lai(0));
    }

    @Override // defpackage.lad
    public final void a(ClassLoader classLoader, Set set) {
        int i = this.a;
        if (i == 0) {
            d(classLoader, set, c());
        } else if (i == 1) {
            throw null;
        } else {
            if (i == 2) {
                d(classLoader, set, c());
            } else if (i == 3) {
                d(classLoader, set, c());
            } else if (i == 4) {
                h(classLoader, set);
            } else if (i != 5) {
                h(classLoader, set);
            } else {
                h(classLoader, set);
            }
        }
    }

    @Override // defpackage.lad
    public final boolean b(ClassLoader classLoader, File file, File file2, boolean z) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            if (i == 2) {
                return e(classLoader, file, file2, z);
            }
            if (i == 3) {
                return e(classLoader, file, file2, z);
            }
            if (i == 4) {
                return i(classLoader, file, file2, z);
            }
            return i != 5 ? g(classLoader, file, file2, z, "path", new lai(2)) : i(classLoader, file, file2, z);
        }
        return e(classLoader, file, file2, z);
    }
}
