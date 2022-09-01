package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: kle  reason: default package */
/* loaded from: classes.dex */
public final class kle {
    public final kjj a;
    public final Uri b;
    public final String c;
    private final String d;
    private final boolean e;

    public kle(kjj kjjVar, String str, String str2, boolean z) {
        this.a = kjjVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        kor a = kos.a(kjjVar.c);
        a.d("phenotype");
        a.e(str2 + "/" + str + ".pb");
        if (z && gkm.e()) {
            a.c("directboot-files");
        }
        this.b = a.a();
    }

    public static llw a(klf klfVar) {
        nem nemVar;
        lls i = llw.i(klfVar.g.size() + 3);
        for (klg klgVar : klfVar.g) {
            int i2 = klgVar.b;
            boolean z = false;
            int i3 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                i.a(klgVar.d, Long.valueOf(i2 == 2 ? ((Long) klgVar.c).longValue() : 0L));
            } else if (i4 == 1) {
                String str = klgVar.d;
                if (i2 == 3) {
                    z = ((Boolean) klgVar.c).booleanValue();
                }
                i.a(str, Boolean.valueOf(z));
            } else if (i4 == 2) {
                i.a(klgVar.d, Double.valueOf(i2 == 4 ? ((Double) klgVar.c).doubleValue() : 0.0d));
            } else if (i4 == 3) {
                i.a(klgVar.d, i2 == 5 ? (String) klgVar.c : "");
            } else if (i4 == 4) {
                String str2 = klgVar.d;
                if (i2 == 6) {
                    nemVar = (nem) klgVar.c;
                } else {
                    nemVar = nem.b;
                }
                i.a(str2, nemVar.D());
            }
        }
        i.a("__phenotype_server_token", klfVar.d);
        i.a("__phenotype_snapshot_token", klfVar.b);
        i.a("__phenotype_configuration_version", Long.valueOf(klfVar.e));
        return i.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mko b(String str) {
        return mio.g(this.a.c().b(this.c, str), kld.a, this.a.e());
    }

    public final mko c(klf klfVar) {
        return kcu.O(new gnq(this, klfVar, 15), this.a.e());
    }
}
