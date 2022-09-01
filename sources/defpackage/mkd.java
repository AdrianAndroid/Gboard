package defpackage;

/* compiled from: PG */
/* renamed from: mkd  reason: default package */
/* loaded from: classes.dex */
public final class mkd extends mif implements Runnable {
    private mko a;

    public mkd(mko mkoVar) {
        this.a = mkoVar;
    }

    @Override // defpackage.mik
    protected final void a() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mik
    public final String b() {
        mko mkoVar = this.a;
        if (mkoVar != null) {
            return "delegate=[" + mkoVar + "]";
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mko mkoVar = this.a;
        if (mkoVar != null) {
            p(mkoVar);
        }
    }
}
