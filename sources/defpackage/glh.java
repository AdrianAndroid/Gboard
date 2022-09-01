package defpackage;

import android.os.Handler;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: glh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class glh implements Executor {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ glh(Handler handler, int i) {
        this.b = i;
        this.a = handler;
    }

    public /* synthetic */ glh(fel felVar, int i, byte[] bArr) {
        this.b = i;
        this.a = felVar;
    }

    public /* synthetic */ glh(glo gloVar, int i) {
        this.b = i;
        this.a = gloVar;
    }

    public /* synthetic */ glh(gnn gnnVar, int i) {
        this.b = i;
        this.a = gnnVar;
    }

    public /* synthetic */ glh(gnp gnpVar, int i) {
        this.b = i;
        this.a = gnpVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [gnn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [gnn, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                Objects.requireNonNull(runnable);
                r0.d(new gky(runnable, 2));
                return;
            case 1:
                ((Handler) this.a).post(runnable);
                return;
            case 2:
                ?? r02 = this.a;
                Objects.requireNonNull(runnable);
                r02.d(new gky(runnable, 2));
                return;
            case 3:
                gnn gnnVar = ((gll) ((fel) this.a).a).c;
                Objects.requireNonNull(runnable);
                gnnVar.d(new gky(runnable, 3));
                return;
            case 4:
                gnn gnnVar2 = ((glo) this.a).c;
                Objects.requireNonNull(runnable);
                gnnVar2.d(new gky(runnable, 4));
                return;
            case 5:
                ?? r03 = this.a;
                Objects.requireNonNull(runnable);
                r03.d(new gky(runnable, 7));
                return;
            case 6:
                ((gnp) this.a).h(runnable);
                return;
            default:
                ((gnp) this.a).g(500L, runnable);
                return;
        }
    }
}
