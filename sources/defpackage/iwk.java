package defpackage;

import android.content.Context;
import android.util.Printer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwk  reason: default package */
/* loaded from: classes.dex */
public final class iwk implements iwl {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/producer/processormanager/TrainingCacheMetricsProcessorManager");
    public final Context c;
    public final Executor d;
    public ixe e;
    public boolean f;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ifu g = new iwj(this);

    public iwk(Context context) {
        mks c = gxo.c(11);
        this.c = context;
        this.d = c;
    }

    public static void c(idm idmVar) {
        ieh.j().x(idmVar.getClass());
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Attached training cache metrics processors:");
        for (Map.Entry entry : this.b.entrySet()) {
            printer.println(String.format("provider: %s, processor: %s", entry.getKey(), entry.getValue()));
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TrainingCacheMetricsProcessorManager";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        kcu.U(mio.g(iwy.a.b(), new iul(this, 6), this.d), new ivq(7), this.d);
    }

    @Override // defpackage.ifw
    public final void gn() {
        kcu.U(kcu.N(new ihi(this, 11), this.d), new ivq(8), this.d);
    }
}
