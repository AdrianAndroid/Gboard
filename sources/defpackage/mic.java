package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mic  reason: default package */
/* loaded from: classes.dex */
public final class mic implements Runnable {
    final mik a;
    final mko b;

    public mic(mik mikVar, mko mkoVar) {
        this.a = mikVar;
        this.b = mkoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mik mikVar = this.a;
        mhv mhvVar = mik.i;
        if (mikVar.value != this) {
            return;
        }
        if (!mik.i.f(this.a, this, mik.i(this.b))) {
            return;
        }
        mik.k(this.a);
    }
}
