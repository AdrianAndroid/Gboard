package defpackage;

import java.io.File;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jww  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jww implements miy {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ jww(jkk jkkVar, jiq jiqVar, jie jieVar, jit jitVar, jij jijVar, jig jigVar, int i) {
        this.g = i;
        this.a = jkkVar;
        this.e = jiqVar;
        this.b = jieVar;
        this.d = jitVar;
        this.f = jijVar;
        this.c = jigVar;
    }

    public /* synthetic */ jww(jwz jwzVar, jsr jsrVar, jsr jsrVar2, jwy jwyVar, jsr jsrVar3, juc jucVar, int i) {
        this.g = i;
        this.a = jwzVar;
        this.b = jsrVar;
        this.c = jsrVar2;
        this.d = jwyVar;
        this.f = jsrVar3;
        this.e = jucVar;
    }

    public /* synthetic */ jww(jwz jwzVar, jsr jsrVar, jsr jsrVar2, jwy jwyVar, juc jucVar, jsr jsrVar3, int i) {
        this.g = i;
        this.a = jwzVar;
        this.b = jsrVar;
        this.c = jsrVar2;
        this.d = jwyVar;
        this.e = jucVar;
        this.f = jsrVar3;
    }

    public /* synthetic */ jww(jwz jwzVar, jwy jwyVar, Iterator it, juc jucVar, File file, jsr jsrVar, int i) {
        this.g = i;
        this.e = jwzVar;
        this.f = jwyVar;
        this.a = it;
        this.c = jucVar;
        this.d = file;
        this.b = jsrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Iterator, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        int i = this.g;
        if (i == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            Object obj4 = this.c;
            Object obj5 = this.d;
            Object obj6 = this.e;
            Object obj7 = this.f;
            Void r8 = (Void) obj;
            jwy jwyVar = (jwy) obj5;
            Object obj8 = jwyVar.a;
            jwz jwzVar = (jwz) obj2;
            jsr jsrVar = (jsr) obj3;
            File g = jwzVar.c.g(jsrVar);
            jsr jsrVar2 = (jsr) obj4;
            File g2 = jwzVar.c.g(jsrVar2);
            jwv jwvVar = (jwv) obj8;
            juh e = jwvVar.e();
            jdg.u(e);
            String str = jwvVar.b().b;
            lug lugVar = jsh.c;
            jtq.g(g);
            jtq.g(g2);
            lwm.s(e);
            juc f = jwvVar.d().f();
            jsr o = f.o();
            jsf.a(((jrh) obj3).a).a(((jrh) o).b, "unpack", new Object[0]);
            jdg.u(str);
            return mio.h(kcu.L(mio.h(mhu.h(e.a(f, str, g, g2), Throwable.class, new fem(jwzVar, jsrVar, o, f, 20), jwzVar.b), new jww(jwzVar, jsrVar, o, jwyVar, jsrVar2, f, 2), jwzVar.b)), new jjv(jwzVar, jwyVar, (juc) obj6, jsrVar2, (jsr) obj7, 3), jwzVar.b);
        } else if (i == 1) {
            Object obj9 = this.a;
            Object obj10 = this.e;
            Object obj11 = this.b;
            Object obj12 = this.d;
            Object obj13 = this.f;
            Object obj14 = this.c;
            Void r7 = (Void) obj;
            try {
                jit jitVar = (jit) obj12;
                jie jieVar = (jie) obj11;
                jiq jiqVar = (jiq) obj10;
                mko e2 = ((jkk) obj9).c.e(jiqVar, jieVar, jitVar, (jij) obj13, ((jig) obj14).n, ((jig) obj14).o);
                jkk jkkVar = (jkk) obj9;
                return jkkVar.m(e2, new fem(jkkVar, (jig) obj14, (jie) obj11, (jit) obj12, 6));
            } catch (RuntimeException e3) {
                nzv a = jhv.a();
                a.a = jhu.UNKNOWN_ERROR;
                a.c = e3;
                return kcu.J(a.e());
            }
        } else if (i == 2) {
            Object obj15 = this.a;
            Object obj16 = this.b;
            Object obj17 = this.c;
            Object obj18 = this.d;
            Object obj19 = this.f;
            Object obj20 = this.e;
            Void r9 = (Void) obj;
            jsf.a(((jrh) obj16).a).b(((jrh) obj17).b, "unpack_end", new Object[0]);
            ((jrr) ((jwy) obj18).c).a();
            jsr jsrVar3 = (jsr) obj16;
            jwz jwzVar2 = (jwz) obj15;
            jwzVar2.d(jsrVar3, (jsr) obj19, (juc) obj20);
            return kcu.K(null);
        } else {
            Object obj21 = this.e;
            Object obj22 = this.f;
            ?? r6 = this.a;
            Object obj23 = this.c;
            Object obj24 = this.d;
            Object obj25 = this.b;
            Void r82 = (Void) obj;
            jwy jwyVar2 = (jwy) obj22;
            ((jrr) jwyVar2.c).a();
            if (r6.hasNext()) {
                File file = (File) obj24;
                return ((jwz) obj21).c(r6, (juc) obj23, file, (jsr) obj25, jwyVar2);
            }
            return kcu.K(null);
        }
    }
}
