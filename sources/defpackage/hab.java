package defpackage;

import android.os.Process;
import android.util.Printer;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: hab  reason: default package */
/* loaded from: classes.dex */
public final class hab implements idm, gzv {
    private final Map b = new HashMap();
    public final idb a = new hac(this);

    public hab() {
        gzt.a.a(this);
    }

    public final Deque a(String str) {
        Deque deque = (Deque) this.b.get(str);
        if (deque == null) {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.b.put(str, arrayDeque);
            return arrayDeque;
        }
        return deque;
    }

    public final void b(int i, String str, String str2) {
        haa a = haa.a(this.a.c, i, str2, 1);
        Deque a2 = a(str);
        a2.add(a);
        if (a2.size() > 100) {
            a2.removeFirst();
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        if (z || !((Boolean) gzy.a.c()).booleanValue()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        lex c = lex.c('\t');
        synchronized (this) {
            for (Map.Entry entry : new TreeMap(this.b).entrySet()) {
                printer.println(((String) entry.getKey()) + " queue:");
                for (haa haaVar : (Deque) entry.getValue()) {
                    printer.println(c.h(simpleDateFormat.format(Long.valueOf(haaVar.a)), Integer.valueOf(Process.myPid()), Long.valueOf(haaVar.b), haaVar.c, Integer.valueOf(haaVar.d)));
                }
                printer.println("");
            }
        }
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "DumpableMetricsProcessor";
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.a.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final boolean s() {
        return false;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return hac.a;
    }
}
