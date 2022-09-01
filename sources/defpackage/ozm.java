package defpackage;

/* compiled from: PG */
/* renamed from: ozm  reason: default package */
/* loaded from: classes2.dex */
final class ozm extends ozs {
    final /* synthetic */ ozn a;

    public ozm(ozn oznVar) {
        this.a = oznVar;
    }

    @Override // defpackage.ozs
    public final void b(Object obj) {
        try {
            this.a.a.b(obj);
        } finally {
            this.a.b.d();
        }
    }

    @Override // defpackage.ozs
    public final void il(Throwable th) {
        try {
            this.a.a.il(th);
        } finally {
            this.a.b.d();
        }
    }
}
