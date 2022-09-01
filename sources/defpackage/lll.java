package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lll  reason: default package */
/* loaded from: classes.dex */
public final class lll extends lta {
    private final llp a;

    public lll(llp llpVar, int i) {
        super(llpVar.size(), i);
        this.a = llpVar;
    }

    @Override // defpackage.lta
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
