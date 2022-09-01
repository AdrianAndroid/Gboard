package defpackage;

/* compiled from: PG */
/* renamed from: olo  reason: default package */
/* loaded from: classes2.dex */
public final class olo extends olp implements omd, ome {
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olo(Class cls, String str, String str2, int i) {
        super(a, cls, str, str2);
        this.e = i;
    }

    @Override // defpackage.okq
    public final Object a(Object obj) {
        return this.e != 0 ? b().g() : b().g();
    }

    @Override // defpackage.omd
    public final omc b() {
        return this.e != 0 ? ((olo) i()).b() : ((omd) i()).b();
    }

    @Override // defpackage.ole
    protected final void h() {
        if (this.e != 0) {
            int i = olr.a;
        } else {
            int i2 = olr.a;
        }
    }
}
