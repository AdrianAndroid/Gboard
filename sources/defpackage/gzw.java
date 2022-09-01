package defpackage;

import android.util.Printer;

/* compiled from: PG */
/* renamed from: gzw  reason: default package */
/* loaded from: classes.dex */
public final class gzw implements Printer {
    private final int a;
    private final String b;
    private final String c;
    private final Printer d;

    public gzw(Printer printer) {
        boolean z = printer instanceof gzw;
        int i = z ? 1 + ((gzw) printer).a : 1;
        this.a = i;
        String q = jdg.q("  ", i);
        this.b = q;
        this.c = "\n".concat(q);
        this.d = z ? ((gzw) printer).d : printer;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        this.d.println(this.b.concat(String.valueOf(str.replace("\n", this.c))));
    }
}
