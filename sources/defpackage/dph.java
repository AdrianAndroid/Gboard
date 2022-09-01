package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dph  reason: default package */
/* loaded from: classes.dex */
public final class dph extends gxu {
    final /* synthetic */ dpi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dph(dpi dpiVar) {
        super("LstmExtension.deleteOrphanedFilesRunnable");
        this.a = dpiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bzd.a(this.a.b).f("lstm");
    }
}
