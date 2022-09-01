package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jur  reason: default package */
/* loaded from: classes.dex */
public final class jur implements jtb {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object e;

    public jur(File file, jru jruVar, int i) {
        this.b = i;
        this.c = file;
        this.e = jruVar;
    }

    public jur(juq juqVar, opu opuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = i;
        this.c = juqVar;
        this.e = opuVar;
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        char c = 0;
        if (this.b == 0) {
            printWriter.println("## File metadata table");
            jti a2 = jtj.a();
            a2.b('|');
            jth a3 = jtq.a();
            a2.a = "name";
            a3.b(a2.a());
            a2.a = "gcp";
            a3.b(a2.a());
            a2.a = "state";
            a3.b(a2.a());
            a2.a = "last";
            a3.b(a2.a());
            a2.a = "source";
            a3.b(a2.a());
            a2.a = "superpack";
            a3.b(a2.a());
            a2.a = "val";
            a3.b(a2.a());
            a2.a = "res";
            a3.b(a2.a());
            a3.b = "-There are no file metadata entries-";
            try {
                for (jup jupVar : ((jvg) this.c).d(null)) {
                    long e = jupVar.e();
                    String b = jupVar.f().b();
                    String h = jupVar.h();
                    Object obj = "";
                    if (h == null) {
                        h = obj;
                    }
                    Object[] objArr = new Object[8];
                    objArr[c] = z ? jupVar.f().f() : jupVar.f().toString();
                    objArr[1] = Integer.valueOf(jupVar.a());
                    objArr[2] = ((jqx) ((opu) this.e).a).f.s(jupVar.f().b()) ? obj : jtq.l(jupVar.b());
                    objArr[3] = jtq.e(jupVar.d());
                    if (z) {
                        h = jtq.k(b, h);
                    }
                    objArr[4] = h;
                    objArr[5] = b;
                    objArr[6] = jupVar.c() == 0 ? obj : Integer.valueOf(jupVar.c());
                    objArr[7] = z ? jtq.j(b, Long.valueOf(e)) : Long.valueOf(e);
                    a3.c(objArr);
                    c = 0;
                }
            } catch (IOException e2) {
                printWriter.printf(Locale.US, "Error reading metadata table: %s\n", e2);
            }
            a3.a().m(printWriter);
            return;
        }
        printWriter.println("## File status report");
        printWriter.printf(Locale.US, "- root dir: %s\n", ((File) this.c).getAbsolutePath());
        if (((File) this.c).exists()) {
            for (File file : jru.d((File) this.c, exs.e)) {
                printWriter.println();
                String name = file.getName();
                printWriter.println("### ".concat(String.valueOf(name)));
                jti a4 = jtj.a();
                a4.b('|');
                jth a5 = jtq.a();
                a4.a = "file";
                a5.b(a4.a());
                a4.a = "last modified";
                a5.b(a4.a());
                a4.a = "size";
                a5.b(a4.a());
                a5.b = "-There are no files in this directory-";
                for (File file2 : jru.e(file)) {
                    long a6 = ((jru) this.e).a(file2);
                    String name2 = file2.getName();
                    Object[] objArr2 = new Object[3];
                    if (z) {
                        name2 = jtq.k(name, name2);
                    }
                    objArr2[0] = name2;
                    objArr2[1] = jtq.e(file2.lastModified());
                    objArr2[2] = z ? jtq.j(name, Long.valueOf(a6)) : Long.valueOf(a6);
                    a5.c(objArr2);
                }
                a5.a().m(printWriter);
            }
            return;
        }
        printWriter.println("<root dir does not exist>");
    }
}
