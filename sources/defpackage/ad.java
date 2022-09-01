package defpackage;

/* compiled from: PG */
/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
final class ad implements Runnable {
    final /* synthetic */ ai a;

    public ad(ai aiVar) {
        this.a = aiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ai aiVar = this.a;
        aiVar.a.onDismiss(aiVar.d);
    }
}
