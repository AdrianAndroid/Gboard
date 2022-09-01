package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: osq  reason: default package */
/* loaded from: classes2.dex */
public final class osq extends oqq {
    final /* synthetic */ int a;
    final /* synthetic */ osz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osq(osz oszVar, Object[] objArr, int i) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.c = oszVar;
        this.a = i;
    }

    @Override // defpackage.oqq
    public final void b() {
        synchronized (this.c) {
            this.c.r.remove(Integer.valueOf(this.a));
        }
    }
}
