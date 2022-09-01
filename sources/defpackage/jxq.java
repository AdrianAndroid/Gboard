package defpackage;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jxq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jxq implements miy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    private final /* synthetic */ int i;

    public /* synthetic */ jxq(jwz jwzVar, jwy jwyVar, jsr jsrVar, juc jucVar, boolean z, File file, jsr jsrVar2, jsr jsrVar3, int i) {
        this.i = i;
        this.e = jwzVar;
        this.b = jwyVar;
        this.f = jsrVar;
        this.h = jucVar;
        this.a = z;
        this.c = file;
        this.d = jsrVar2;
        this.g = jsrVar3;
    }

    public /* synthetic */ jxq(jxr jxrVar, Set set, boolean z, jvr jvrVar, mkr mkrVar, jvc jvcVar, opu opuVar, jwz jwzVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.i = i;
        this.b = jxrVar;
        this.c = set;
        this.a = z;
        this.d = jvrVar;
        this.e = mkrVar;
        this.f = jvcVar;
        this.h = opuVar;
        this.g = jwzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [jvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [mkr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        jvc jvcVar;
        mkr mkrVar;
        int i;
        mko h;
        if (this.i == 0) {
            Object obj2 = this.b;
            ?? r2 = this.c;
            boolean z = this.a;
            Object obj3 = this.d;
            ?? r13 = this.e;
            ?? r12 = this.f;
            Object obj4 = this.h;
            Object obj5 = this.g;
            Boolean bool = (Boolean) obj;
            if (r2.isEmpty()) {
                return mkk.a;
            }
            final jxr jxrVar = (jxr) obj2;
            List list = jxrVar.b;
            if (((lrl) list).c == 1) {
                jvr jvrVar = (jvr) obj3;
                h = jxrVar.e((Collection) list.get(0), z, jvrVar, r13, r12, (opu) obj4, (jwz) obj5);
                jvcVar = r12;
                mkrVar = r13;
                i = 1;
            } else {
                HashMap hashMap = new HashMap();
                mko K = kcu.K(new HashMap());
                lta listIterator = ((llp) jxrVar.b).listIterator();
                mko mkoVar = K;
                jvc jvcVar2 = r12;
                mkr mkrVar2 = r13;
                while (listIterator.hasNext()) {
                    final Collection collection = (Collection) listIterator.next();
                    final jwz jwzVar = (jwz) obj5;
                    final opu opuVar = (opu) obj4;
                    final jvr jvrVar2 = (jvr) obj3;
                    final mko mkoVar2 = mkoVar;
                    final HashMap hashMap2 = hashMap;
                    HashMap hashMap3 = hashMap;
                    final boolean z2 = z;
                    Object obj6 = obj5;
                    final mkr mkrVar3 = mkrVar2;
                    Object obj7 = obj4;
                    final jvc jvcVar3 = jvcVar2;
                    mkr mkrVar4 = mkrVar2;
                    mkoVar = mio.h(mkoVar, new miy(mkoVar2, hashMap2, jvrVar2, collection, z2, mkrVar3, jvcVar3, opuVar, jwzVar, null, null, null) { // from class: jxo
                        public final /* synthetic */ mko b;
                        public final /* synthetic */ Map c;
                        public final /* synthetic */ jvr d;
                        public final /* synthetic */ Collection e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ mkr g;
                        public final /* synthetic */ jvc h;
                        public final /* synthetic */ jwz i;
                        public final /* synthetic */ opu j;

                        @Override // defpackage.miy
                        public final mko a(Object obj8) {
                            jxr jxrVar2 = jxr.this;
                            mko mkoVar3 = this.b;
                            Map map = this.c;
                            jvr jvrVar3 = this.d;
                            Collection collection2 = this.e;
                            boolean z3 = this.f;
                            mkr mkrVar5 = this.g;
                            jvc jvcVar4 = this.h;
                            opu opuVar2 = this.j;
                            jwz jwzVar2 = this.i;
                            Map map2 = (Map) obj8;
                            if (jxrVar2.d) {
                                lug lugVar = jsh.a;
                                mkoVar3.cancel(true);
                                return kcu.K(new HashMap());
                            }
                            map.putAll(map2);
                            Set<juc> keySet = map2.keySet();
                            lug lugVar2 = jsh.a;
                            keySet.size();
                            for (juc jucVar : keySet) {
                                jsr o = jucVar.o();
                                jsr b = jsi.b(o);
                                jsr a = jsi.a(o, jucVar.k());
                                if (!jxrVar2.c.contains(b)) {
                                    jvrVar3.u(b);
                                }
                                if (!jxrVar2.c.contains(a)) {
                                    jvrVar3.u(a);
                                }
                            }
                            return jxrVar2.e(collection2, z3, jvrVar3, mkrVar5, jvcVar4, opuVar2, jwzVar2);
                        }
                    }, mkrVar4);
                    mkrVar2 = mkrVar4;
                    obj3 = obj3;
                    z = z;
                    obj5 = obj6;
                    hashMap = hashMap3;
                    obj4 = obj7;
                    jvcVar2 = jvcVar2;
                }
                jvcVar = jvcVar2;
                mkrVar = mkrVar2;
                i = 1;
                h = mio.h(mkoVar, new jzh(hashMap, 1), mkrVar);
            }
            return mio.h(h, new kks(jxrVar, jvcVar, mkrVar, i), mkrVar);
        }
        Object obj8 = this.e;
        Object obj9 = this.b;
        Object obj10 = this.f;
        Object obj11 = this.h;
        boolean z3 = this.a;
        Object obj12 = this.c;
        Object obj13 = this.d;
        Object obj14 = this.g;
        jtx jtxVar = (jtx) obj;
        jwy jwyVar = (jwy) obj9;
        ((jrr) jwyVar.c).a();
        jwz jwzVar2 = (jwz) obj8;
        jvr jvrVar3 = jwzVar2.c;
        jdg.u(jtxVar);
        jsr jsrVar = (jsr) obj10;
        jvrVar3.p(jsrVar, jtxVar.a);
        juc jucVar = (juc) obj11;
        jtr e = jucVar.e();
        if (e != null) {
            jwzVar2.c.q(jsrVar, e);
        }
        if (z3) {
            jwzVar2.f((File) obj12, kcu.q(jucVar));
        }
        return jwzVar2.a(jsrVar, (jsr) obj13, (jsr) obj14, jwyVar);
    }
}
