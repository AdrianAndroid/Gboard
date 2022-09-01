package defpackage;

/* compiled from: PG */
/* renamed from: dhh  reason: default package */
/* loaded from: classes.dex */
final class dhh extends gxu {
    final /* synthetic */ dhj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhh(dhj dhjVar) {
        super("FlagUpdate-HandwritingSuperpacksTask");
        this.a = dhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d();
        this.a.a();
        this.a.e();
    }
}
