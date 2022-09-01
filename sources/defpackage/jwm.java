package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: jwm  reason: default package */
/* loaded from: classes.dex */
public final class jwm implements kaz {
    private final File a;
    private final File b;
    private final jyw c;

    public jwm(File file, String str, jyw jywVar, byte[] bArr) {
        this.c = jywVar;
        this.a = file;
        this.b = new File(file, str);
    }

    @Override // defpackage.kaz
    public final long a() {
        return this.b.length();
    }

    @Override // defpackage.kaz
    public final void b(InputStream inputStream, long j, long j2) {
        ovn b;
        if (this.a.exists() || this.a.mkdirs()) {
            if (j > this.b.length()) {
                throw new IOException("Given offsetBytes does not correspond with existing data: " + j + ", " + this.b.length());
            }
            long j3 = 0;
            if (j > 0) {
                b = ovb.a(this.b);
            } else {
                b = ovb.b(this.b);
            }
            ovn ovnVar = b;
            out e = oix.e(ovb.f(inputStream));
            jyw jywVar = this.c;
            Object obj = jywVar.b;
            mop mopVar = (mop) obj;
            ((jwr) mopVar.c).i.e.a(new jwp(((juc) mopVar.a).o(), (String) jywVar.a, ((juc) mopVar.a).e(), ((File) mopVar.b).length(), 0));
            try {
                our ourVar = new our();
                long j4 = 0;
                while (!e.C()) {
                    e.b(ourVar, 8192L);
                    long j5 = ourVar.b;
                    if (j5 > j3) {
                        ovnVar.ik(ourVar, j5);
                    }
                    j4 += j5;
                    jyw jywVar2 = this.c;
                    final long j6 = j + j4;
                    final long j7 = j + j2;
                    Object obj2 = jywVar2.b;
                    Object obj3 = jywVar2.a;
                    jls jlsVar = ((jwr) ((mop) obj2).c).i.e;
                    final juc jucVar = (juc) ((mop) obj2).a;
                    final String str = (String) obj3;
                    jlsVar.a(new jnf() { // from class: jwq
                        @Override // defpackage.jnf
                        public final void a(Object obj4) {
                            juc jucVar2 = juc.this;
                            ((jwt) obj4).d(jucVar2.o(), str, jucVar2.e(), j6, j7);
                        }
                    });
                    j3 = 0;
                }
                ovnVar.flush();
                this.b.length();
                lug lugVar = jsh.a;
                this.b.getAbsolutePath();
                try {
                    ovnVar.close();
                } catch (IOException e2) {
                    ((luc) ((luc) ((luc) jsh.a.c()).i(e2)).k("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", '^', "DefaultResponseWriter.java")).t("Error closing download file");
                }
                try {
                    e.close();
                    return;
                } catch (IOException e3) {
                    ((luc) ((luc) ((luc) jsh.a.c()).i(e3)).k("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 'c', "DefaultResponseWriter.java")).t("Error closing buffered source");
                    return;
                }
            } catch (Throwable th) {
                try {
                    ovnVar.close();
                } catch (IOException e4) {
                    ((luc) ((luc) ((luc) jsh.a.c()).i(e4)).k("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", '^', "DefaultResponseWriter.java")).t("Error closing download file");
                }
                try {
                    e.close();
                } catch (IOException e5) {
                    ((luc) ((luc) ((luc) jsh.a.c()).i(e5)).k("com/google/android/libraries/micore/superpacks/packs/DefaultResponseWriter", "writeResponse", 'c', "DefaultResponseWriter.java")).t("Error closing buffered source");
                }
                throw th;
            }
        }
        throw new IOException("Error creating output directory");
    }
}
