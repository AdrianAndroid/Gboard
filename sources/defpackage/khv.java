package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: khv  reason: default package */
/* loaded from: classes.dex */
public final class khv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public khv(jls jlsVar, byte[] bArr) {
        this.d = new jyd(this, null);
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = jlsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final List a(jsz jszVar) {
        ArrayList arrayList = new ArrayList();
        for (jyc jycVar : this.b.values()) {
            if (jycVar.b.equals(jszVar)) {
                arrayList.add(jycVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final void b(jzj jzjVar) {
        jsz jszVar = jzjVar.f;
        if (a(jszVar).isEmpty()) {
            jzjVar.g.run();
            this.c.remove(jszVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final boolean c(String str) {
        return this.b.containsKey(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void d() {
        jtq.z(this.b.values());
    }

    public khv(oiy oiyVar, oiy oiyVar2, oiy oiyVar3, oiy oiyVar4) {
        oiyVar.getClass();
        this.a = oiyVar;
        oiyVar2.getClass();
        this.b = oiyVar2;
        oiyVar3.getClass();
        this.c = oiyVar3;
        this.d = oiyVar4;
    }
}
