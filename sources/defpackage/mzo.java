package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mzo  reason: default package */
/* loaded from: classes2.dex */
public final class mzo extends olm implements okv {
    final /* synthetic */ List a;
    final /* synthetic */ olq b;
    final /* synthetic */ mzp c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzo(List list, olq olqVar, mzp mzpVar, String str) {
        super(3);
        this.a = list;
        this.b = olqVar;
        this.c = mzpVar;
        this.d = str;
    }

    @Override // defpackage.okv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        oll.e(obj2, "<anonymous parameter 1>");
        oll.e(obj3, "e");
        this.a.add(obj);
        olq olqVar = this.b;
        olqVar.a = obj3;
        return mzp.c(this.c, this.a, this.d, olqVar, (mzz) olqVar.a);
    }
}
