package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jgj  reason: default package */
/* loaded from: classes.dex */
public final class jgj extends jgm {
    final /* synthetic */ jgk a;

    public jgj(jgk jgkVar) {
        this.a = jgkVar;
    }

    @Override // defpackage.jgm
    public final void a(long j) {
        jgk jgkVar = this.a;
        jgkVar.d++;
        if (jgkVar.a(jgkVar.a) || this.a.a.isStarted()) {
            return;
        }
        jgk jgkVar2 = this.a;
        if (jgkVar2.c != -1 && jgkVar2.d >= 0) {
            return;
        }
        Runnable runnable = jgkVar2.b;
        if (runnable != null) {
            runnable.run();
        }
        this.a.a.start();
    }
}
