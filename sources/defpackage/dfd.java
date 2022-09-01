package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfd  reason: default package */
/* loaded from: classes.dex */
public final class dfd implements Runnable {
    final ict[] a;
    final /* synthetic */ der b;
    final /* synthetic */ dfh c;

    public dfd(dfh dfhVar, der derVar) {
        this.c = dfhVar;
        this.b = derVar;
        this.a = dfhVar.w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.B = this.b.a(this.a);
        dfh dfhVar = this.c;
        if (dfhVar.B >= 0) {
            dfhVar.x();
        }
    }
}
