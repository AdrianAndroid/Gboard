package defpackage;

/* compiled from: PG */
/* renamed from: bzi  reason: default package */
/* loaded from: classes.dex */
public final class bzi implements miy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bzi(bzq bzqVar, int i) {
        this.b = i;
        this.a = bzqVar;
    }

    public bzi(bzr bzrVar, int i) {
        this.b = i;
        this.a = bzrVar;
    }

    public bzi(dhe dheVar, int i) {
        this.b = i;
        this.a = dheVar;
    }

    public bzi(dhj dhjVar, int i) {
        this.b = i;
        this.a = dhjVar;
    }

    @Override // defpackage.miy
    public final /* synthetic */ mko a(Object obj) {
        int i = this.b;
        if (i == 0) {
            Void r8 = (Void) obj;
            hhl hhlVar = bzr.b;
            jqx jqxVar = (jqx) ((bzr) this.a).k.get();
            return jqxVar.g.hQ(new jiz(jqxVar, 2));
        } else if (i == 1) {
            Void r82 = (Void) obj;
            hhl hhlVar2 = bzr.b;
            jqx jqxVar2 = (jqx) ((bzr) this.a).k.get();
            return jqxVar2.g.hQ(new gnq(jqxVar2, 11, (byte[]) null));
        } else if (i != 2) {
            if (i == 3) {
                jre jreVar = (jre) obj;
                return ((dhn) this.a).h();
            } else if (i == 4) {
                jqm jqmVar = (jqm) obj;
                Object obj2 = this.a;
                return ((dhe) obj2).k.h(((dhn) obj2).l, jqk.f, jsq.a);
            } else {
                jqm jqmVar2 = (jqm) obj;
                ((ltd) ((ltd) dhj.a.b()).k("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks$2", "apply", 217, "HandwritingOnlineSuperpacks.java")).t("syncPackMapping()");
                Object obj3 = this.a;
                dhj dhjVar = (dhj) obj3;
                bze bzeVar = dhjVar.k;
                String str = ((dhn) obj3).l;
                dhk dhkVar = new dhk(dhjVar, dhjVar.h, ((bzr) bzeVar).j, dhjVar.e);
                jyu g = jsq.g();
                g.e("useForeground", true);
                return bzeVar.h(str, dhkVar, g.b());
            }
        } else {
            Void r83 = (Void) obj;
            bzq bzqVar = (bzq) this.a;
            ((jqx) ((bzq) this.a).f.k.get()).k(bzqVar.b, bzqVar.c);
            jqx jqxVar3 = (jqx) ((bzq) this.a).f.k.get();
            bzq bzqVar2 = (bzq) this.a;
            jtr c = jtr.c(bzqVar2.b, bzqVar2.d);
            jsq jsqVar = jsq.a;
            jsu j = jsv.j();
            j.d(2);
            jyu g2 = jsq.g();
            jql f = jqm.f();
            f.d(((bzq) this.a).b);
            f.e(((bzq) this.a).d);
            lta listIterator = ((llp) ((bzq) this.a).e).listIterator();
            while (listIterator.hasNext()) {
                f.b((juc) listIterator.next());
            }
            g2.e("manifest_instance", f.a());
            j.e(g2.b());
            mko h = mio.h(jqxVar3.e(c, j.a()), new jkg(jqxVar3, c, jsqVar, 19), jqxVar3.g);
            bzq bzqVar3 = (bzq) this.a;
            bzqVar3.f.q(h, bzqVar3.b);
            return h;
        }
    }
}
