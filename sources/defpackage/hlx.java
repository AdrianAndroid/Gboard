package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.PowerManager;
import com.google.android.inputmethod.latin.R;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hlx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hlx implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hlx(bov bovVar, hqt hqtVar, boolean z, int i) {
        this.d = i;
        this.c = bovVar;
        this.b = hqtVar;
        this.a = z;
    }

    public /* synthetic */ hlx(hmd hmdVar, hln hlnVar, boolean z, int i) {
        this.d = i;
        this.b = hmdVar;
        this.c = hlnVar;
        this.a = z;
    }

    public /* synthetic */ hlx(jqx jqxVar, PrintWriter printWriter, boolean z, int i) {
        this.d = i;
        this.c = jqxVar;
        this.b = printWriter;
        this.a = z;
    }

    public /* synthetic */ hlx(knn knnVar, String str, boolean z, int i) {
        this.d = i;
        this.c = knnVar;
        this.b = str;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, hqt] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        int i = this.d;
        if (i == 0) {
            return Boolean.valueOf(((hmd) this.b).a.hZ((hln) this.c, this.a));
        } else if (i == 1) {
            Object obj2 = this.c;
            ?? r2 = this.b;
            boolean z = this.a;
            ArrayList arrayList = new ArrayList();
            bov.a(r2.i());
            String p = r2.p();
            iav g = r2.g();
            if (r2.z() || g == null) {
                obj = obj2;
            } else {
                iav e = iav.e(((bov) obj2).a, R.xml.f213010_resource_name_obfuscated_res_0x7f170236, p, r2.b());
                ibv ibvVar = new ibv(g.f);
                for (ibz ibzVar : Collections.singletonList(ibz.a)) {
                    int[] d = e.f.d(ibzVar);
                    ibo iboVar = (ibo) ibvVar.c.get(ibzVar);
                    if (iboVar == null) {
                        ibn a = ibo.a();
                        a.c.d();
                        a.b(d);
                        ibvVar.e(ibzVar, a.a());
                    } else {
                        ibn ibnVar = new ibn(iboVar.a, iboVar.b, iboVar.c);
                        ibnVar.b(d);
                        ibvVar.e(ibzVar, ibnVar.a());
                        obj2 = obj2;
                    }
                }
                obj = obj2;
                ibvVar.h.b(e.f.k.b);
                iat b = iav.b(e);
                b.i(ibvVar.d());
                arrayList.add(b.d());
            }
            bov.a(r2.i());
            if (g == null || !r2.u() || r2.z()) {
                arrayList.add(iav.e(((bov) obj).a, R.xml.f217330_resource_name_obfuscated_res_0x7f1703fb, p, r2.b()));
            }
            if (!z) {
                bov.a(r2.i());
                arrayList.add(iav.e(((bov) obj).a, R.xml.f212510_resource_name_obfuscated_res_0x7f170203, p, r2.b()));
                return llp.o(arrayList);
            }
            if (!r2.u()) {
                bov.a(r2.i());
                arrayList.add(iav.e(((bov) obj).a, R.xml.f220150_resource_name_obfuscated_res_0x7f170521, p, r2.b()));
            }
            return llp.o(arrayList);
        } else if (i == 2) {
            Object obj3 = this.c;
            Object obj4 = this.b;
            boolean z2 = this.a;
            jqx jqxVar = (jqx) obj3;
            jqxVar.j();
            PrintWriter printWriter = (PrintWriter) obj4;
            printWriter.println("# Superpacks status report");
            printWriter.printf(Locale.US, "- manifest keep count: %d\n", Integer.valueOf(jqxVar.j));
            SQLiteDatabase readableDatabase = jqxVar.h.getReadableDatabase();
            if (readableDatabase != null) {
                printWriter.printf(Locale.US, "- db version: %d\n", Integer.valueOf(readableDatabase.getVersion()));
                printWriter.printf(Locale.US, "- db path: %s\n", readableDatabase.getPath());
            } else {
                printWriter.printf(Locale.US, "<no database>\n", new Object[0]);
            }
            try {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                HashSet hashSet = new HashSet();
                for (String str : ((jqx) obj3).c.a()) {
                    hashSet.add(str.replace("-manifest", ""));
                }
                hashSet.addAll(((jqx) obj3).b.b());
                jqb jqbVar = ((jqx) obj3).k;
                HashSet hashSet2 = new HashSet();
                ((jph) jqbVar).d(new jpg(hashSet2, 0));
                hashSet.addAll(hashSet2);
                for (jtr jtrVar : ((jqx) obj3).i.b()) {
                    hashSet.add(jtrVar.b());
                }
                objArr[0] = hashSet;
                ((PrintWriter) obj4).printf(locale, "- all known superpacks: %s\n", objArr);
            } catch (IOException e2) {
                printWriter.printf(Locale.US, "Failed to get all known superpacks: %s\n", e2);
            }
            printWriter.printf(Locale.US, "- network: %s\n", jtq.f(jqxVar.a));
            PowerManager powerManager = (PowerManager) jqxVar.a.getSystemService("power");
            if (powerManager != null) {
                printWriter.printf(Locale.US, "- power save mode: %b\n", Boolean.valueOf(powerManager.isPowerSaveMode()));
            }
            printWriter.println();
            jqxVar.f.e(printWriter, z2);
            printWriter.println();
            jqxVar.e.e(printWriter, z2);
            printWriter.println();
            jqxVar.l.e(printWriter, z2);
            jqxVar.k.e(printWriter, z2);
            printWriter.println();
            ((juk) jqxVar.i).a.e(printWriter, z2);
            printWriter.println();
            ((jvk) jqxVar.b).b.e(printWriter, z2);
            printWriter.println();
            jzg.b.e(printWriter, z2);
            printWriter.println();
            jsf.a.e(printWriter, z2);
            return null;
        } else {
            ((knn) this.c).g.b((String) this.b, this.a);
            return null;
        }
    }
}
