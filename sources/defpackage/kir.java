package defpackage;

/* compiled from: PG */
/* renamed from: kir  reason: default package */
/* loaded from: classes.dex */
final class kir implements kis {
    private final /* synthetic */ int a;

    public kir(int i) {
        this.a = i;
    }

    @Override // defpackage.kis
    public final /* synthetic */ String a(ngy ngyVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((oos) ((nfh) ngyVar).b).d;
            }
            return ((ony) ((nfh) ngyVar).b).b;
        }
        return ((onc) ((nfh) ngyVar).b).e;
    }

    @Override // defpackage.kis
    public final /* synthetic */ String b(ngy ngyVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((oos) ((nfh) ngyVar).b).c;
            }
            return ((ony) ((nfh) ngyVar).b).d;
        }
        return ((onc) ((nfh) ngyVar).b).d;
    }

    @Override // defpackage.kis
    public final /* synthetic */ void d(ngy ngyVar) {
        int i = this.a;
        if (i == 0) {
            nfh nfhVar = (nfh) ngyVar;
            if (nfhVar.c) {
                nfhVar.cD();
                nfhVar.c = false;
            }
            onc oncVar = (onc) nfhVar.b;
            onc oncVar2 = onc.k;
            oncVar.a &= -5;
            oncVar.d = onc.k.d;
        } else if (i == 1) {
            nfh nfhVar2 = (nfh) ngyVar;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            oos oosVar = (oos) nfhVar2.b;
            oos oosVar2 = oos.u;
            oosVar.a &= -3;
            oosVar.c = oos.u.c;
        } else {
            nfh nfhVar3 = (nfh) ngyVar;
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            ony onyVar = (ony) nfhVar3.b;
            ony onyVar2 = ony.e;
            onyVar.a &= -5;
            onyVar.d = ony.e.d;
        }
    }

    @Override // defpackage.kis
    public final /* synthetic */ void c(ngy ngyVar, Long l) {
        int i = this.a;
        if (i == 0) {
            if (l == null) {
                nfh nfhVar = (nfh) ngyVar;
                if (nfhVar.c) {
                    nfhVar.cD();
                    nfhVar.c = false;
                }
                onc oncVar = (onc) nfhVar.b;
                onc oncVar2 = onc.k;
                oncVar.a &= -3;
                oncVar.c = 0L;
                return;
            }
            long longValue = l.longValue();
            nfh nfhVar2 = (nfh) ngyVar;
            if (nfhVar2.c) {
                nfhVar2.cD();
                nfhVar2.c = false;
            }
            onc oncVar3 = (onc) nfhVar2.b;
            onc oncVar4 = onc.k;
            oncVar3.a |= 2;
            oncVar3.c = longValue;
        } else if (i != 1) {
            if (l == null) {
                nfh nfhVar3 = (nfh) ngyVar;
                if (nfhVar3.c) {
                    nfhVar3.cD();
                    nfhVar3.c = false;
                }
                ony onyVar = (ony) nfhVar3.b;
                ony onyVar2 = ony.e;
                onyVar.a &= -3;
                onyVar.c = 0L;
                return;
            }
            long longValue2 = l.longValue();
            nfh nfhVar4 = (nfh) ngyVar;
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            ony onyVar3 = (ony) nfhVar4.b;
            ony onyVar4 = ony.e;
            onyVar3.a |= 2;
            onyVar3.c = longValue2;
        } else if (l == null) {
            nfh nfhVar5 = (nfh) ngyVar;
            if (nfhVar5.c) {
                nfhVar5.cD();
                nfhVar5.c = false;
            }
            oos oosVar = (oos) nfhVar5.b;
            oos oosVar2 = oos.u;
            oosVar.a &= -2;
            oosVar.b = 0L;
        } else {
            long longValue3 = l.longValue();
            nfh nfhVar6 = (nfh) ngyVar;
            if (nfhVar6.c) {
                nfhVar6.cD();
                nfhVar6.c = false;
            }
            oos oosVar3 = (oos) nfhVar6.b;
            oos oosVar4 = oos.u;
            oosVar3.a |= 1;
            oosVar3.b = longValue3;
        }
    }
}
