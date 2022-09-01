package defpackage;

/* compiled from: PG */
/* renamed from: cdq  reason: default package */
/* loaded from: classes.dex */
final class cdq extends gxu {
    final /* synthetic */ cdr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdq(cdr cdrVar) {
        super("FlagUpdate-SetupLangIdSuperpacksTask");
        this.a = cdrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int c = cdr.c();
        cdr cdrVar = this.a;
        cdrVar.d = cdrVar.e();
        this.a.c.e(cap.LANG_ID_MODEL_UPDATED, Integer.valueOf(c));
    }
}
