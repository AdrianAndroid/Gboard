package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fgc  reason: default package */
/* loaded from: classes.dex */
public final class fgc {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/voiceime/s3/S3NetworkRecognizer");
    public final Context b;
    public final gon c;
    public final ffe f;
    public volatile fev j;
    public volatile boolean k;
    volatile goh l;
    volatile fge m;
    int n;
    protected final gnx r;
    public volatile fcp s;
    boolean o = false;
    boolean p = false;
    boolean q = true;
    final opu u = new opu(this);
    final opu t = new opu(this);
    public final bnc d = new bnc();
    public final idk e = ieh.j();
    public final ffx g = ffx.a;
    public final fez h = new fez(gxo.c(5), new fci(this, 10), ((Long) ffa.n.c()).longValue());
    public final lga i = lga.c(ldt.a);

    public fgc(Context context, Executor executor) {
        fgb fgbVar = new fgb(this);
        this.r = fgbVar;
        this.b = context;
        ffy.a.a = new WeakReference(fgbVar);
        this.c = ffy.a.a(context, executor);
        this.f = new ffe(context);
    }

    public final void a(bna bnaVar) {
        fcp fcpVar = this.s;
        fge fgeVar = this.m;
        this.h.c();
        if (this.p || fgeVar == null || fcpVar == null || !fcpVar.e()) {
            return;
        }
        fgeVar.a(bnaVar);
    }
}
