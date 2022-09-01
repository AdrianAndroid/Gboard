package defpackage;

/* compiled from: PG */
/* renamed from: gro  reason: default package */
/* loaded from: classes.dex */
public final class gro implements grz {
    public final /* synthetic */ grt a;

    public gro(grt grtVar) {
        this.a = grtVar;
    }

    @Override // defpackage.grz
    public final void a(String str, int i) {
        grt grtVar = this.a;
        llp c = grtVar.f.c();
        int size = c.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i2 < i && i4 < size; i4++) {
            String str2 = (String) c.get(i4);
            if (!str2.equals(str)) {
                if (grtVar.u(str2)) {
                    i2++;
                }
                i3++;
            }
        }
        grh grhVar = grtVar.f;
        grhVar.e.remove(str);
        grhVar.e.add(i3, str);
        grhVar.j();
        grh.i(grhVar.c, grhVar.e);
        grtVar.e.a.e(gsl.ACCESS_POINT_DRAGGED_TO_BAR, str, Integer.valueOf(i));
    }
}
