package defpackage;

/* compiled from: PG */
/* renamed from: omx  reason: default package */
/* loaded from: classes2.dex */
public final class omx extends olm implements okq {
    final /* synthetic */ CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omx(CharSequence charSequence) {
        super(1);
        this.a = charSequence;
    }

    @Override // defpackage.okq
    public final /* synthetic */ Object a(Object obj) {
        olw olwVar = (olw) obj;
        oll.e(olwVar, "it");
        CharSequence charSequence = this.a;
        oll.e(olwVar, "range");
        return charSequence.subSequence(Integer.valueOf(olwVar.a).intValue(), Integer.valueOf(olwVar.b).intValue() + 1).toString();
    }
}
