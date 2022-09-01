package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dga  reason: default package */
/* loaded from: classes.dex */
public final class dga extends gxu {
    final /* synthetic */ dgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dga(dgb dgbVar) {
        super("NotifyHWRInitializationFailed");
        this.a = dgbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j.k();
    }
}
