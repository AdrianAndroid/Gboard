package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lda  reason: default package */
/* loaded from: classes.dex */
public final class lda implements Runnable {
    final /* synthetic */ lcx a;
    final /* synthetic */ Runnable b;

    public lda(lcx lcxVar, Runnable runnable) {
        this.a = lcxVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lcx lcxVar = this.a;
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        String obj = this.b.toString();
        return "propagating=[" + obj + "]";
    }
}
