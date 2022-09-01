package defpackage;

import android.util.Printer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iek  reason: default package */
/* loaded from: classes.dex */
public final class iek implements idi, gzv {
    public static volatile iek a;
    final List b = new ArrayList();
    final Map c = new HashMap();
    private final String d = "LATIN_IME";
    private final String e = "GOOGLE_KEYBOARD_COUNTERS";
    private byte[] f;

    public iek() {
        gzt.a.a(this);
    }

    private final synchronized String h() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (Map.Entry entry : this.c.entrySet()) {
            sb.append("\nLocalCounter(");
            sb.append((String) entry.getKey());
            sb.append(")[");
            for (iel ielVar : (List) entry.getValue()) {
                sb.append(ielVar.c);
                sb.append(", ");
            }
            sb.append("]");
        }
        return sb.toString();
    }

    private final synchronized void i(String str, iel ielVar) {
        List list = (List) this.c.get(str);
        if (list == null) {
            list = new ArrayList();
            this.c.put(str, list);
        }
        list.add(ielVar);
    }

    @Override // defpackage.idi
    public final void a() {
    }

    @Override // defpackage.idi
    public final void b(String str, boolean z) {
        i(str, ihm.d(this.e, str, Boolean.valueOf(z), 0, this.f, 4));
    }

    @Override // defpackage.idi
    public final void c(String str) {
        i(str, ihm.d(this.e, str, 1, 0, this.f, 2));
    }

    @Override // defpackage.idi
    public final void d(String str, int i) {
        i(str, ihm.d(this.e, str, Integer.valueOf(i), 0, this.f, 5));
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (!z) {
            printer.println("\nTracked counters:");
            printer.println(h());
        }
    }

    @Override // defpackage.idi
    public final void e(String str, long j) {
        i(str, ihm.d(this.e, str, Long.valueOf(j), 0, this.f, 6));
    }

    @Override // defpackage.idi
    public final void f(mbh mbhVar, int i, long j, long j2) {
        synchronized (this) {
            this.b.add(ihm.d(this.d, null, mbhVar, i, null, 1));
        }
    }

    @Override // defpackage.idi
    public final void g(byte[] bArr) {
        this.f = bArr;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }
}
