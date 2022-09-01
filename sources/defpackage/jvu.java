package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jvu  reason: default package */
/* loaded from: classes.dex */
public final class jvu implements jtb {
    public static final /* synthetic */ int b = 0;
    public final Map a = new HashMap();
    private final leq c;
    private final opu e;

    public jvu(opu opuVar, leq leqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = opuVar;
        this.c = leqVar;
    }

    public final void a(File file, int i) {
        opu opuVar = this.e;
        File parentFile = file.getParentFile();
        jdg.u(parentFile);
        jsr d = jsr.d(parentFile.getName(), file.getName());
        try {
            jtr c = ((jvr) opuVar.a).c(d);
            ((jvr) opuVar.a).j.g(c != null ? ((jrn) c).a : null);
        } catch (IOException e) {
            ((luc) ((luc) ((luc) jsh.a.c()).i(e)).k("com/google/android/libraries/micore/superpacks/gc/FileManager$FileRefTableListener", "onFileRefChanged", 1489, "FileManager.java")).w("Failed to delete released file %s", file);
        }
        ((jvr) opuVar.a).n.a(new jvq(d, i, 0));
    }

    public final boolean b(File file) {
        boolean containsKey;
        synchronized (this.a) {
            containsKey = this.a.containsKey(file);
        }
        return containsKey;
    }

    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        jti a = jtj.a();
        a.b('|');
        printWriter.println("## Referenced files");
        jth a2 = jtq.a();
        a.a = "namespace";
        a2.b(a.a());
        a.a = "file name";
        a2.b(a.a());
        a.a = "ref count";
        a2.b(a.a());
        a2.b = "-There are no referenced files-";
        synchronized (this.a) {
            for (jvt jvtVar : this.a.values()) {
                synchronized (jvtVar.b) {
                    File file = jvtVar.a;
                    String name = file.getName();
                    Object a3 = this.c.a(file);
                    if (a3 == null) {
                        a3 = "";
                    }
                    Object[] objArr = new Object[3];
                    objArr[0] = a3;
                    if (z) {
                        name = jtq.k((String) a3, name);
                    }
                    objArr[1] = name;
                    objArr[2] = Integer.valueOf(jvtVar.c);
                    a2.c(objArr);
                }
            }
        }
        a2.a().m(printWriter);
    }
}
