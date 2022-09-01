package defpackage;

/* compiled from: PG */
/* renamed from: ojy  reason: default package */
/* loaded from: classes2.dex */
public final class ojy extends okc {
    final /* synthetic */ oku a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojy(ojv ojvVar, oku okuVar, Object obj) {
        super(ojvVar);
        this.a = okuVar;
        this.b = obj;
    }

    @Override // defpackage.ojz
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                this.c = 2;
                oix.c(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.c = 1;
        oix.c(obj);
        oku okuVar = this.a;
        if (!(okuVar instanceof olj) ? !((okuVar instanceof okf) || (okuVar instanceof okq)) : ((olj) okuVar).f() == 2) {
            return okuVar.a(this.b, this);
        }
        ClassCastException classCastException = new ClassCastException(String.valueOf(okuVar.getClass().getName()).concat(" cannot be cast to kotlin.jvm.functions.Function2"));
        oll.h(classCastException, ols.class.getName());
        throw classCastException;
    }
}
