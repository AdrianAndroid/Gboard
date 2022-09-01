package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ipr  reason: default package */
/* loaded from: classes.dex */
public final class ipr {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/protoxdb/TableSchema");
    public final String b;
    public final ipq c;
    public final SQLiteDatabase d;
    public final llw e;
    public final llw f;
    public final llw g;
    public final llw h;
    public final String[] i;
    public final ngf[] j;
    public volatile boolean k = false;
    public final gjz l;
    private final lmz m;

    public ipr(ipq ipqVar, gjz gjzVar, SQLiteDatabase sQLiteDatabase, llw llwVar, lmz lmzVar, boolean z, byte[] bArr) {
        this.b = ipqVar.a.d();
        this.c = ipqVar;
        this.l = gjzVar;
        this.d = sQLiteDatabase;
        this.f = llwVar;
        llw llwVar2 = ipqVar.b;
        ipj a2 = ipqVar.a.a();
        lls h = llw.h();
        for (String str : a2.d()) {
            ngf c = a2.c(str);
            if (c != null) {
                h.a(str, c);
            }
        }
        llw l = h.l();
        lls h2 = llw.h();
        lsz it = iow.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            h2.a((String) entry.getKey(), iox.a(ioz.a((ngf) entry.getValue()), TextUtils.equals((CharSequence) entry.getKey(), "_id_"), false));
        }
        f(h2, llwVar, false);
        f(h2, llwVar2, false);
        f(h2, l, true);
        this.g = h2.l();
        llw llwVar3 = iow.a;
        int i = ((lrq) llwVar3).d + ((lrq) llwVar).d + ((lrq) ipqVar.b).d;
        String[] strArr = new String[i];
        this.i = strArr;
        ngf[] ngfVarArr = new ngf[i];
        this.j = ngfVarArr;
        e(strArr, ngfVarArr, ipqVar.b, e(strArr, ngfVarArr, llwVar, e(strArr, ngfVarArr, llwVar3, 0)));
        lls h3 = llw.h();
        for (String str2 : ipqVar.a.a().d()) {
            ngf c2 = ipqVar.a.a().c(str2);
            if (c2 != null) {
                h3.a(str2, c2);
            }
        }
        llw l2 = h3.l();
        this.e = l2;
        HashSet l3 = lvw.l();
        if (z) {
            l3.addAll(l2.keySet());
            l3.addAll(ipqVar.b.keySet());
        }
        l3.addAll(lmzVar);
        l3.remove(ipqVar.d);
        l3.remove("_id_");
        this.m = lmz.p(l3);
        lls h4 = llw.h();
        for (int i2 = 0; i2 < i; i2++) {
            h4.a(this.i[i2], this.j[i2]);
        }
        h4.j(this.e);
        this.h = h4.l();
        lls h5 = llw.h();
        h5.j(llwVar);
        h5.j(ipqVar.b);
        h5.l();
    }

    public static void c(ContentValues contentValues, Map map, ipv ipvVar, boolean z) {
        for (Map.Entry entry : ((llw) map).entrySet()) {
            if (z || ipvVar.c((String) entry.getKey(), (ngf) entry.getValue())) {
                ngf ngfVar = ngf.VOID;
                switch (((ngf) entry.getValue()).ordinal()) {
                    case 1:
                        contentValues.put((String) entry.getKey(), Integer.valueOf(ipvVar.h((String) entry.getKey())));
                        continue;
                    case 2:
                        contentValues.put((String) entry.getKey(), Long.valueOf(ipvVar.a((String) entry.getKey(), 0L)));
                        continue;
                    case 3:
                        contentValues.put((String) entry.getKey(), Float.valueOf(ipvVar.g((String) entry.getKey())));
                        continue;
                    case 4:
                        contentValues.put((String) entry.getKey(), Double.valueOf(ipvVar.e((String) entry.getKey())));
                        continue;
                    case 5:
                        contentValues.put((String) entry.getKey(), Boolean.valueOf(ipvVar.d((String) entry.getKey())));
                        continue;
                    case 6:
                        contentValues.put((String) entry.getKey(), ipvVar.i((String) entry.getKey()));
                        continue;
                    case 7:
                        contentValues.put((String) entry.getKey(), ipvVar.b((String) entry.getKey(), nem.b).D());
                        continue;
                    case 8:
                        contentValues.put((String) entry.getKey(), Integer.valueOf(ipvVar.f((String) entry.getKey())));
                        continue;
                }
            }
        }
    }

    private static int e(String[] strArr, ngf[] ngfVarArr, llw llwVar, int i) {
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            strArr[i] = (String) entry.getKey();
            ngfVarArr[i] = (ngf) entry.getValue();
            i++;
        }
        return i;
    }

    private static void f(lls llsVar, llw llwVar, boolean z) {
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            llsVar.a((String) entry.getKey(), iox.a(ioz.a((ngf) entry.getValue()), false, z));
        }
    }

    public final void a() {
        lmz c = ipf.c(this.d, this.b, false);
        lsz it = lvw.i(this.m, c).iterator();
        while (it.hasNext()) {
            ipf.f(this.d, this.b, (String) it.next(), false);
        }
        lsz it2 = lvw.i(c, this.m).iterator();
        while (it2.hasNext()) {
            ipf.h(this.d, this.b, (String) it2.next());
        }
    }

    public final void b() {
        ipf.g(this.d, this.b, this.g);
        if (!TextUtils.isEmpty(this.c.d)) {
            ipf.f(this.d, this.b, this.c.d, true);
        }
        lsz it = this.m.iterator();
        while (it.hasNext()) {
            ipf.f(this.d, this.b, (String) it.next(), false);
        }
    }

    public final void d() {
        int i = this.c.e.c;
        if (i <= 0) {
            return;
        }
        ipf.k(this.d, this.b, i);
    }
}
