package defpackage;

/* compiled from: PG */
/* renamed from: agl  reason: default package */
/* loaded from: classes.dex */
public final class agl implements Runnable {
    final afo a;
    private boolean b = false;
    private final afq c;

    public agl(afq afqVar, afo afoVar) {
        this.c = afqVar;
        this.a = afoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.b) {
            this.c.c(this.a);
            this.b = true;
        }
    }
}
