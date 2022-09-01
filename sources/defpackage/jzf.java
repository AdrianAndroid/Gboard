package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: jzf  reason: default package */
/* loaded from: classes.dex */
public final class jzf implements jtb {
    public static final /* synthetic */ jzf a = new jzf(1);
    private final /* synthetic */ int b;

    public jzf(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jtb, java.lang.Object] */
    @Override // defpackage.jtb
    public final void e(PrintWriter printWriter, boolean z) {
        if (this.b == 0) {
            synchronized (jzg.a) {
                jzg.c.d.e(printWriter, z);
            }
            return;
        }
        int i = jta.a;
    }
}
