package defpackage;

import java.io.PrintWriter;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jyd  reason: default package */
/* loaded from: classes.dex */
public final class jyd implements jtb {
    final /* synthetic */ khv a;

    public jyd(khv khvVar, byte[] bArr) {
        this.a = khvVar;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        jti a = jtj.a();
        a.b('|');
        printWriter.println("## Active downloads");
        jth a2 = jtq.a();
        a.a = "id";
        a2.b(a.a());
        a.a = "params";
        a2.b(a.a());
        a2.b = "-Empty-";
        for (Map.Entry entry : this.a.b.entrySet()) {
            a2.c(entry.getKey(), ((jyc) entry.getValue()).b.toString());
        }
        a2.a().m(printWriter);
    }
}
