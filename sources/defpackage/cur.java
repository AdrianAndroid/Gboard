package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;

/* compiled from: PG */
/* renamed from: cur  reason: default package */
/* loaded from: classes.dex */
public final class cur {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/recyclerview/RecyclerViewUtils");

    public static boolean a(ly lyVar) {
        if (lyVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/recyclerview/RecyclerViewUtils", "isAtTopOfList", 75, "RecyclerViewUtils.java")).t("Received null LayoutManager");
            return false;
        } else if (lyVar instanceof StaggeredGridLayoutManager) {
            if (lyVar.au() == 0 || lyVar.as() == 0) {
                return true;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) lyVar;
            int[] iArr = new int[staggeredGridLayoutManager.a];
            for (int i = 0; i < staggeredGridLayoutManager.a; i++) {
                no noVar = staggeredGridLayoutManager.b[i];
                iArr[i] = noVar.f.e ? noVar.d(noVar.a.size() - 1, -1, false) : noVar.d(0, noVar.a.size(), false);
            }
            int i2 = iArr[0];
            if (i2 == -1) {
                return true;
            }
            return i2 == 0 && lyVar.U(0).getTop() >= 0;
        } else if (lyVar instanceof LinearLayoutManager) {
            return lyVar.au() == 0 || lyVar.as() == 0 || (((LinearLayoutManager) lyVar).M() == 0 && lyVar.U(0).getTop() >= 0);
        } else {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/recyclerview/RecyclerViewUtils", "isAtTopOfList", 98, "RecyclerViewUtils.java")).w("Received LayoutManager of unsupported type %s", lyVar.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean b(ly lyVar) {
        int O;
        if (lyVar == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/recyclerview/RecyclerViewUtils", "isNearEndOfList", 42, "RecyclerViewUtils.java")).t("Received null LayoutManager");
            return false;
        }
        int as = lyVar.as();
        int au = lyVar.au();
        if (lyVar instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) lyVar;
            int[] iArr = new int[staggeredGridLayoutManager.a];
            for (int i = 0; i < staggeredGridLayoutManager.a; i++) {
                no noVar = staggeredGridLayoutManager.b[i];
                iArr[i] = noVar.f.e ? noVar.d(0, noVar.a.size(), false) : noVar.d(noVar.a.size() - 1, -1, false);
            }
            O = mhq.k(iArr);
        } else if (lyVar instanceof LinearLayoutManager) {
            O = ((LinearLayoutManager) lyVar).O();
        } else {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/expression/recyclerview/RecyclerViewUtils", "isNearEndOfList", 58, "RecyclerViewUtils.java")).w("Received LayoutManager of unsupported type %s", lyVar.getClass().getSimpleName());
            return false;
        }
        if (O == -1) {
            O = 0;
        }
        return au > 0 && (as + O) + 5 >= au;
    }
}
