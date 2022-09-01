package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dre  reason: default package */
/* loaded from: classes.dex */
public final class dre implements gyg {
    public static volatile dre a;
    private static final lug e = lug.i("MozcShortcutsData");
    private static final lek f = lej.b;
    public final gyk b;
    public final dsg c;
    public volatile byte[] d;
    private final Executor g;
    private final List h = new ArrayList();
    private int i;

    public dre(Executor executor, gyk gykVar, dsg dsgVar) {
        this.g = executor;
        this.b = gykVar;
        this.c = dsgVar;
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f.h(str);
    }

    private final void f(Object[] objArr, String str, String str2) {
        String e2 = e((String) gyk.m(objArr, str));
        String e3 = e((String) gyk.m(objArr, str2));
        if (true != drl.c(e3)) {
            e3 = e2;
        }
        if (!drl.d(e2) || !drl.c(e3)) {
            return;
        }
        int d = gyk.d(objArr);
        long e4 = gyk.e(objArr);
        boolean C = gyk.C(objArr);
        if (d > this.i) {
            this.i = d;
        }
        this.h.add(new gyn(new drk(e3, e2, ""), d, e4, C));
    }

    @Override // defpackage.gyg
    public final void b() {
        this.h.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        this.h.size();
        ArrayList arrayList = new ArrayList(this.h);
        int i = this.i;
        this.h.clear();
        ((luc) ((luc) e.b()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcContactsDataHandler", "endProcess", 180, "MozcContactsDataHandler.java")).t("Scheduling import task");
        this.g.execute(new ov(this, arrayList, i, 3));
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        String A = gyk.A(objArr);
        if ("vnd.android.cursor.item/email_v2".equals(A)) {
            String e2 = e((String) gyk.m(objArr, "data1"));
            if (TextUtils.isEmpty(e2) || !leb.a.j(e2)) {
                return;
            }
            int d = gyk.d(objArr);
            long e3 = gyk.e(objArr);
            boolean C = gyk.C(objArr);
            if (d > this.i) {
                this.i = d;
            }
            this.h.add(new gyn(new drk(e2, e2, ""), d, e3, C));
        } else if (!"vnd.android.cursor.item/name".equals(A)) {
        } else {
            f(objArr, "data3", "data9");
            f(objArr, "data5", "data8");
            f(objArr, "data2", "data7");
        }
    }

    @Override // defpackage.gyg
    public final void g() {
        this.h.clear();
        this.i = 0;
    }
}
