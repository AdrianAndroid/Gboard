package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iez  reason: default package */
/* loaded from: classes.dex */
public final class iez implements iex {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/metricsprocessormanager/MetricsProcessorProviderManager");
    public final HashMap b = new HashMap();
    public final Context c;
    public idi d;
    public ifu e;
    public final ieh f;
    private iea g;

    public iez(Context context) {
        ieh j = ieh.j();
        this.c = context;
        this.f = j;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Attached IProcessorProviders:");
        for (Map.Entry entry : this.b.entrySet()) {
            printer.println(String.format("provider: %s, processors: %s", entry.getKey(), entry.getValue()));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "MetricsProcessorProviderManager";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        if (this.g == null) {
            iea ieaVar = new iea(this, 0);
            this.g = ieaVar;
            ijl.b().c(ieaVar, ieb.class, gyc.b);
        }
    }

    @Override // defpackage.ifw
    public final void gn() {
        ArrayList arrayList = new ArrayList();
        for (Collection collection : this.b.values()) {
            arrayList.addAll(collection);
        }
        this.f.y(arrayList);
        this.b.clear();
        iea ieaVar = this.g;
        if (ieaVar != null) {
            ijl.b().d(ieaVar, ieb.class);
            this.g = null;
        }
        ifu ifuVar = this.e;
        if (ifuVar != null) {
            ifuVar.d();
            this.e = null;
        }
    }
}
