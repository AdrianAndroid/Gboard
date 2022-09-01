package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: bzh  reason: default package */
/* loaded from: classes.dex */
public final class bzh implements miy {
    final /* synthetic */ bzr a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bzh(bzr bzrVar, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = "bundled_delight";
    }

    public bzh(bzr bzrVar, String str, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = str;
    }

    public bzh(bzr bzrVar, Collection collection, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = collection;
    }

    public bzh(bzr bzrVar, jqd jqdVar, int i) {
        this.c = i;
        this.a = bzrVar;
        this.b = jqdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, jqd] */
    @Override // defpackage.miy
    public final /* synthetic */ mko a(Object obj) {
        switch (this.c) {
            case 0:
                Void r7 = (Void) obj;
                this.a.h.e(irk.STATE_REACHED, bzr.p((String) this.b), 4);
                jqx jqxVar = (jqx) this.a.k.get();
                return kcu.P(new dus(jqxVar, (String) this.b, 12), jqxVar.g);
            case 1:
                hhl hhlVar = bzr.b;
                this.a.h.e(irk.STATE_REACHED, bzr.p((String) this.b), 5);
                return kcu.K((Void) obj);
            case 2:
                Void r72 = (Void) obj;
                Object obj2 = this.b;
                lug lugVar = jsh.a;
                return ((jqx) this.a.k.get()).d((String) obj2, true);
            case 3:
                this.a.h.e(irk.STATE_REACHED, bzr.p((String) this.b), 8);
                return kcu.K((Void) obj);
            case 4:
                Void r73 = (Void) obj;
                hhl hhlVar2 = bzr.b;
                jqx jqxVar2 = (jqx) this.a.k.get();
                return jqxVar2.g.hQ(new gnq(jqxVar2, (Collection) this.b, 12));
            case 5:
                this.a.h.e(irk.STATE_REACHED, bzr.p((String) this.b), 7);
                return kcu.K((Void) obj);
            case 6:
                Void r74 = (Void) obj;
                ?? r0 = this.b;
                lug lugVar2 = jsh.a;
                ((jqx) this.a.k.get()).d.f(r0);
                return kcu.K(null);
            default:
                Void r75 = (Void) obj;
                jqx jqxVar3 = (jqx) this.a.k.get();
                Object obj3 = this.b;
                jqxVar3.j();
                String str = (String) obj3;
                int a = jqxVar3.i.a(str);
                if (jqxVar3.a(str, a, "getSyncVersion") == null) {
                    a = -1;
                }
                return kcu.K(Integer.valueOf(a));
        }
    }
}
