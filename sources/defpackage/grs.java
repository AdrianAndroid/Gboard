package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: grs  reason: default package */
/* loaded from: classes.dex */
public final class grs extends ifu {
    final /* synthetic */ grt a;

    public grs(grt grtVar) {
        this.a = grtVar;
    }

    @Override // defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        gqh gqhVar;
        ifv ifvVar = (ifv) ijgVar;
        grt grtVar = this.a;
        lmz p = lmz.p(grtVar.b);
        grtVar.b.clear();
        boolean z = false;
        for (Class cls : ifvVar.e(ifw.class)) {
            igg c = ifvVar.c(cls);
            if (c != null && (gqhVar = c.c) != null) {
                String str = gqhVar.a;
                grtVar.b.add(str);
                if (!grtVar.i.containsKey(str)) {
                    grtVar.f(0, c.c, false);
                    z = true;
                }
            }
        }
        lsz it = p.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!grtVar.b.contains(str2)) {
                grtVar.i.remove(str2);
                z = true;
            }
        }
        if (z) {
            grtVar.t();
        }
    }
}
