package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: juz  reason: default package */
/* loaded from: classes.dex */
public final class juz implements jtb {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;
    private final Object c;

    public juz(jus jusVar, int i) {
        this.b = i;
        this.c = jusVar;
    }

    public juz(jux juxVar, int i) {
        this.b = i;
        this.c = juxVar;
    }

    public juz(jvc jvcVar, int i) {
        this.b = i;
        this.c = jvcVar;
    }

    public juz(jvf jvfVar, int i) {
        this.b = i;
        this.c = jvfVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [jus, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [jvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, jvf] */
    /* JADX WARN: Type inference failed for: r3v15, types: [jvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, jvf] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, jux] */
    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, final boolean z) {
        int i = this.b;
        char c = 2;
        char c2 = 0;
        char c3 = 1;
        if (i != 0) {
            if (i == 1) {
                printWriter.println("## Manifest table");
                jti a2 = jtj.a();
                a2.b('|');
                jth a3 = jtq.a();
                a2.a = "name";
                a3.b(a2.a());
                a2.a = "sync version";
                a3.b(a2.a());
                a3.b = "-Empty-";
                try {
                    for (jtr jtrVar : this.c.b()) {
                        a3.c(jtrVar.b(), Integer.valueOf(jtrVar.a()));
                    }
                    a3.a().m(printWriter);
                    return;
                } catch (IOException e) {
                    printWriter.printf(Locale.US, "Error reading manifest data: %s\n", e);
                    return;
                }
            } else if (i == 2) {
                printWriter.println("## Pending packs table");
                jti a4 = jtj.a();
                a4.b('|');
                jth a5 = jtq.a();
                a4.a = "parent id";
                a5.b(a4.a());
                a4.a = "pending";
                a5.b(a4.a());
                a5.b = "-Empty-";
                try {
                    for (String str : this.c.a()) {
                        a5.c(str, jtq.h(this.c.b(str), new jvd(z, 0)));
                    }
                } catch (IOException e2) {
                    printWriter.printf(Locale.US, "Failed to query pending packs table: %s\n", e2);
                }
                a5.a().m(printWriter);
                return;
            } else {
                printWriter.println("## Selected packs table");
                jti a6 = jtj.a();
                a6.b('|');
                jth a7 = jtq.a();
                a6.a = "name";
                a6.e(20);
                a7.b(a6.a());
                a6.a = "selected";
                a7.b(a6.a());
                a7.b = "-Empty-";
                try {
                    for (String str2 : this.c.b()) {
                        a7.c(str2, jtq.h(this.c.c(str2), new jvd(z, 2)));
                    }
                    a7.a().m(printWriter);
                    return;
                } catch (IOException e3) {
                    printWriter.printf(Locale.US, "Error reading selected packs table: %s\n", e3);
                    return;
                }
            }
        }
        printWriter.println("## Pending download queue:");
        jti a8 = jtj.a();
        a8.b('|');
        jth a9 = jtq.a();
        a8.a = "id";
        a8.d(30);
        a9.b(a8.a());
        a8.a = "p";
        a9.b(a8.a());
        a8.d(40);
        a8.a = "urls";
        a9.b(a8.a());
        a8.a = "start";
        a9.b(a8.a());
        a8.a = "constr.";
        a9.b(a8.a());
        a8.a = "flags";
        a9.b(a8.a());
        a8.d(40);
        a8.a = "path";
        a9.b(a8.a());
        a8.d(40);
        a8.a = "failure";
        a9.b(a8.a());
        a8.a = "next retry";
        a9.b(a8.a());
        a8.a = "retry #";
        a9.b(a8.a());
        a8.a = "exp";
        a9.b(a8.a());
        a9.b = "-There are no pending downloads-";
        try {
            for (juu juuVar : this.c.b(true)) {
                long j = juuVar.e;
                final String str3 = ((jrh) juuVar.f()).a;
                String l = juuVar.l();
                String g = jtq.g(new File(juuVar.k()));
                Object[] objArr = new Object[11];
                if (z) {
                    l = jtq.k(str3, l);
                }
                objArr[c2] = l;
                objArr[c3] = Integer.valueOf(juuVar.a());
                objArr[c] = jtq.h(juuVar.i(), new leq() { // from class: juy
                    @Override // defpackage.leq
                    public final Object a(Object obj) {
                        boolean z2 = z;
                        String str4 = str3;
                        String str5 = (String) obj;
                        int i2 = juz.a;
                        return z2 ? jtq.k(str4, str5) : str5;
                    }
                });
                objArr[3] = jtq.e(juuVar.c());
                objArr[4] = jtq.c(juuVar.q(), juuVar.o(), juuVar.p(), juuVar.n());
                objArr[5] = jtq.m(juuVar.b());
                if (z) {
                    g = jtq.k(str3, g);
                }
                objArr[6] = g;
                objArr[7] = juuVar.d;
                Object obj = "";
                objArr[8] = j != 0 ? jtq.e(j) : obj;
                long j2 = juuVar.f;
                if (j2 != 0) {
                    obj = Long.valueOf(j2);
                }
                objArr[9] = obj;
                objArr[10] = juuVar.d() == 0 ? "never" : jtq.e(juuVar.c() + juuVar.d());
                a9.c(objArr);
                c = 2;
                c2 = 0;
                c3 = 1;
            }
            a9.a().m(printWriter);
        } catch (IOException e4) {
            printWriter.printf(Locale.US, "Error reading selected packs table: %s\n", e4);
        }
    }
}
