package defpackage;

/* compiled from: PG */
/* renamed from: aum  reason: default package */
/* loaded from: classes.dex */
final class aum implements bet {
    private final rj a;

    public aum(rj rjVar) {
        this.a = rjVar;
    }

    @Override // defpackage.bet
    public final boolean b(Object obj, bfh bfhVar, boolean z) {
        try {
            this.a.c(new aqq(obj));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }

    @Override // defpackage.bet
    public final boolean fi(axd axdVar, bfh bfhVar, boolean z) {
        rj rjVar = this.a;
        Throwable th = axdVar;
        if (axdVar == null) {
            th = new RuntimeException("Unknown error");
        }
        rjVar.d(th);
        return true;
    }
}
