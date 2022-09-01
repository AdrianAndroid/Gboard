package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jki  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jki implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jki(jiq jiqVar, AtomicReference atomicReference, int i) {
        this.c = i;
        this.a = jiqVar;
        this.b = atomicReference;
    }

    public /* synthetic */ jki(jkk jkkVar, jig jigVar, int i) {
        this.c = i;
        this.b = jkkVar;
        this.a = jigVar;
    }

    public /* synthetic */ jki(jkk jkkVar, miy miyVar, int i) {
        this.c = i;
        this.a = jkkVar;
        this.b = miyVar;
    }

    public /* synthetic */ jki(jkm jkmVar, Comparator comparator, int i) {
        this.c = i;
        this.a = jkmVar;
        this.b = comparator;
    }

    public /* synthetic */ jki(jkm jkmVar, List list, int i) {
        this.c = i;
        this.a = jkmVar;
        this.b = list;
    }

    public /* synthetic */ jki(jkm jkmVar, jig jigVar, int i) {
        this.c = i;
        this.b = jkmVar;
        this.a = jigVar;
    }

    public /* synthetic */ jki(jkm jkmVar, jiq jiqVar, int i) {
        this.c = i;
        this.b = jkmVar;
        this.a = jiqVar;
    }

    public /* synthetic */ jki(jkm jkmVar, jmp jmpVar, int i) {
        this.c = i;
        this.a = jkmVar;
        this.b = jmpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, miy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        switch (this.c) {
            case 0:
                Object obj2 = this.a;
                ?? r1 = this.b;
                ArrayList arrayList = new ArrayList();
                for (jiq jiqVar : (List) obj) {
                    if (!jiqVar.e) {
                        jkk jkkVar = (jkk) obj2;
                        arrayList.add(jkkVar.m(jkkVar.b.g(jiqVar), new cvr(jkkVar, jiqVar, (miy) r1, 15)));
                    }
                }
                return jez.p(arrayList).a(hcb.j, ((jkk) obj2).e);
            case 1:
                Object obj3 = this.a;
                Object obj4 = this.b;
                jig jigVar = (jig) obj;
                if (jigVar == null) {
                    nzv a = jhv.a();
                    a.a = jhu.GROUP_NOT_FOUND_ERROR;
                    a.b = "Nothing to download for file group: ".concat(String.valueOf(((jiq) obj3).b));
                    return kcu.J(a.e());
                }
                ((AtomicReference) obj4).set(jigVar);
                return kcu.K(jigVar);
            case 2:
                Object obj5 = this.b;
                Object obj6 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                jig jigVar2 = (jig) obj6;
                jkk jkkVar2 = (jkk) obj5;
                return jnd.c(jkkVar2.c(jigVar2)).b(jhv.class, new ivo(jigVar2, 18), jkkVar2.e);
            case 3:
                Object obj7 = this.b;
                Object obj8 = this.a;
                lmz lmzVar = (lmz) obj;
                ArrayList arrayList2 = new ArrayList();
                jig jigVar3 = (jig) obj8;
                for (jie jieVar : jigVar3.m) {
                    if (!lre.aE(jieVar)) {
                        int h = ker.h(jigVar3.h);
                        if (h == 0) {
                            h = 1;
                        }
                        jit t = kki.t(jieVar, h);
                        if (!lmzVar.contains(t)) {
                            arrayList2.add(((jkk) obj7).c.a(t));
                        }
                    }
                }
                return jez.p(arrayList2).a(hcb.h, ((jkk) obj7).e);
            case 4:
                Object obj9 = this.a;
                return ((jkm) obj9).o((jmp) this.b, (jmp) obj);
            case 5:
                Object obj10 = this.a;
                return ((jkm) obj10).o((jmp) this.b, (jmp) obj);
            case 6:
                Object obj11 = this.a;
                return ((jkm) obj11).o((jmp) this.b, (jmp) obj);
            case 7:
                Object obj12 = this.b;
                jkm jkmVar = (jkm) obj12;
                return jco.j(jkmVar.n(jkmVar.a.a((jig) this.a)), new jki(jkmVar, (jmp) obj, 5), jkmVar.b);
            case 8:
                Object obj13 = this.a;
                jkm jkmVar2 = (jkm) obj13;
                return jco.j(jkmVar2.n(jkmVar2.a.c()), new jkg(jkmVar2, (jmp) obj, (Comparator) this.b, 7), jkmVar2.b);
            case 9:
                Object obj14 = this.a;
                return ((jkm) obj14).o((jmp) this.b, (jmp) obj);
            case 10:
                Object obj15 = this.a;
                return ((jkm) obj15).o((jmp) this.b, (jmp) obj);
            case 11:
                Object obj16 = this.b;
                jkm jkmVar3 = (jkm) obj16;
                return jco.j(jkmVar3.n(jkmVar3.a.h((jiq) this.a)), new jki(jkmVar3, (jmp) obj, 10), jkmVar3.b);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj17 = this.a;
                return ((jkm) obj17).o((jmp) this.b, (jmp) obj);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj18 = this.a;
                return ((jkm) obj18).o((jmp) this.b, (jmp) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj19 = this.b;
                jkm jkmVar4 = (jkm) obj19;
                return jco.j(jkmVar4.n(jkmVar4.a.i((jiq) this.a)), new jki(jkmVar4, (jmp) obj, 12), jkmVar4.b);
            case 15:
                Object obj20 = this.a;
                jkm jkmVar5 = (jkm) obj20;
                return jco.j(jkmVar5.n(jkmVar5.a.j(this.b)), new jki(jkmVar5, (jmp) obj, 13), jkmVar5.b);
            case 16:
                Object obj21 = this.a;
                return ((jkm) obj21).o((jmp) this.b, (jmp) obj);
            case 17:
                Object obj22 = this.a;
                jkm jkmVar6 = (jkm) obj22;
                return jco.j(jkmVar6.n(jkmVar6.a.d()), new jkg(jkmVar6, (jmp) obj, (Comparator) this.b, 6), jkmVar6.b);
            case 18:
                Object obj23 = this.b;
                jkm jkmVar7 = (jkm) obj23;
                return jco.j(jkmVar7.n(jkmVar7.a.g((jiq) this.a)), new jki(jkmVar7, (jmp) obj, 20), jkmVar7.b);
            case 19:
                Object obj24 = this.a;
                jkm jkmVar8 = (jkm) obj24;
                return jco.j(jkmVar8.n(jkmVar8.a.m(this.b)), new jko(jkmVar8, (jmp) obj, 1), jkmVar8.b);
            default:
                Object obj25 = this.a;
                return ((jkm) obj25).o((jmp) this.b, (jmp) obj);
        }
    }
}
