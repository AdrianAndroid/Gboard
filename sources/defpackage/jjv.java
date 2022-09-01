package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jjv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jjv implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ jjv(its itsVar, itv itvVar, String str, byte[] bArr, byte[] bArr2, int i) {
        this.f = i;
        this.d = itsVar;
        this.b = itvVar;
        this.a = str;
        this.e = bArr;
        this.c = bArr2;
    }

    public /* synthetic */ jjv(jkk jkkVar, jiq jiqVar, AtomicReference atomicReference, jij jijVar, miy miyVar, int i) {
        this.f = i;
        this.a = jkkVar;
        this.b = jiqVar;
        this.c = atomicReference;
        this.d = jijVar;
        this.e = miyVar;
    }

    public /* synthetic */ jjv(jqx jqxVar, String str, llp llpVar, jqj jqjVar, jve jveVar, int i) {
        this.f = i;
        this.b = jqxVar;
        this.c = str;
        this.e = llpVar;
        this.d = jqjVar;
        this.a = jveVar;
    }

    public /* synthetic */ jjv(jwz jwzVar, jwy jwyVar, juc jucVar, jsr jsrVar, jsr jsrVar2, int i) {
        this.f = i;
        this.c = jwzVar;
        this.e = jwyVar;
        this.a = jucVar;
        this.d = jsrVar;
        this.b = jsrVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        mko g;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                Object obj2 = this.d;
                Object obj3 = this.b;
                Object obj4 = this.a;
                Object obj5 = this.e;
                Object obj6 = this.c;
                Void r15 = (Void) obj;
                synchronized (obj2) {
                    mko mkoVar = ((its) obj2).c;
                    if (mkoVar != null) {
                        g = mio.g(mkh.q(mkoVar), new eiy((itv) obj3, (String) obj4, (byte[]) obj5, (byte[]) obj6, 6), ((its) obj2).b);
                    } else {
                        g = kcu.J(new IllegalArgumentException("storageAdapterFuture is null"));
                    }
                }
                return g;
            } else if (i == 2) {
                Object obj7 = this.b;
                Object obj8 = this.c;
                ?? r2 = this.e;
                Object obj9 = this.d;
                Object obj10 = this.a;
                Void r152 = (Void) obj;
                jqx jqxVar = (jqx) obj7;
                String str = (String) obj8;
                jqd a = jqxVar.d.a(str);
                List h = jqxVar.h(str, r2);
                lug lugVar = jsh.a;
                h.size();
                Collection a2 = a.a(h, ((jqj) obj9).d());
                jpc jpcVar = (jpc) obj9;
                return kcu.K(jre.h(h, a2, obj10 != null ? ((jve) obj10).b : null, jpcVar.c, jpcVar.b));
            } else {
                Object obj11 = this.c;
                Object obj12 = this.e;
                Object obj13 = this.a;
                Object obj14 = this.d;
                Object obj15 = this.b;
                Void r153 = (Void) obj;
                ((jrr) ((jwy) obj12).c).a();
                juc jucVar = (juc) obj13;
                ((jwz) obj11).e(jucVar, (jsr) obj14, (jsr) obj15);
                return jwz.g(jucVar);
            }
        }
        Object obj16 = this.a;
        Object obj17 = this.b;
        Object obj18 = this.c;
        Object obj19 = this.d;
        ?? r10 = this.e;
        jig jigVar = (jig) obj;
        if (jigVar == null) {
            jiq jiqVar = (jiq) obj17;
            jkk jkkVar = (jkk) obj16;
            return jkkVar.m(jkkVar.e(jiqVar, true), new jki(jiqVar, (AtomicReference) obj18, 1));
        }
        ((AtomicReference) obj18).set(jigVar);
        jif jifVar = jigVar.b;
        if (jifVar == null) {
            jifVar = jif.g;
        }
        int i2 = jifVar.f + 1;
        nfh nfhVar = (nfh) jigVar.N(5);
        nfhVar.cG(jigVar);
        nfh nfhVar2 = (nfh) jifVar.N(5);
        nfhVar2.cG(jifVar);
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        jif jifVar2 = (jif) nfhVar2.b;
        jifVar2.a |= 16;
        jifVar2.f = i2;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        jig jigVar2 = (jig) nfhVar.b;
        jif jifVar3 = (jif) nfhVar2.cz();
        jifVar3.getClass();
        jigVar2.b = jifVar3;
        jigVar2.a |= 1;
        jig jigVar3 = (jig) nfhVar.cz();
        boolean z = !((jifVar.a & 8) != 0);
        if (z) {
            long a3 = ((jkk) obj16).d.a();
            jif jifVar4 = jigVar3.b;
            if (jifVar4 == null) {
                jifVar4 = jif.g;
            }
            nfh nfhVar3 = (nfh) jifVar4.N(5);
            nfhVar3.cG(jifVar4);
            if (nfhVar3.c) {
                nfhVar3.cD();
                nfhVar3.c = false;
            }
            jif jifVar5 = (jif) nfhVar3.b;
            jifVar5.a |= 8;
            jifVar5.e = a3;
            jif jifVar6 = (jif) nfhVar3.cz();
            nfh nfhVar4 = (nfh) jigVar3.N(5);
            nfhVar4.cG(jigVar3);
            if (nfhVar4.c) {
                nfhVar4.cD();
                nfhVar4.c = false;
            }
            jig jigVar4 = (jig) nfhVar4.b;
            jifVar6.getClass();
            jigVar4.b = jifVar6;
            jigVar4.a = 1 | jigVar4.a;
            jigVar3 = (jig) nfhVar4.cz();
        }
        nfm nfmVar = (nfm) obj17;
        nfh nfhVar5 = (nfh) nfmVar.N(5);
        nfhVar5.cG(nfmVar);
        if (nfhVar5.c) {
            nfhVar5.cD();
            nfhVar5.c = false;
        }
        jiq jiqVar2 = (jiq) nfhVar5.b;
        jiq jiqVar3 = jiq.f;
        jiqVar2.a |= 8;
        jiqVar2.e = false;
        jkk jkkVar2 = (jkk) obj16;
        return jnd.c(jkkVar2.m(jkkVar2.b.l((jiq) nfhVar5.cz(), jigVar3), new jkh(jkkVar2, z, jigVar3, 2))).b(IOException.class, cex.q, jkkVar2.e).g(new fem(jkkVar2, (jij) obj19, (jiq) obj17, (miy) r10, 13), jkkVar2.e);
    }
}
