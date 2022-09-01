package defpackage;

/* compiled from: PG */
/* renamed from: dfz  reason: default package */
/* loaded from: classes.dex */
final class dfz extends gxu {
    final /* synthetic */ boolean a;
    final /* synthetic */ dgb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfz(dgb dgbVar, boolean z) {
        super("NotifyHWRecognizerLoaded");
        this.b = dgbVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.o(this.a);
    }
}
