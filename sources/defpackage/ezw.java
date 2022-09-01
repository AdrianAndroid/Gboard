package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: ezw  reason: default package */
/* loaded from: classes.dex */
final class ezw implements eyl {
    final /* synthetic */ ezx a;

    public ezw(ezx ezxVar) {
        this.a = ezxVar;
    }

    @Override // defpackage.eyl
    public final void a(Map map, Map map2) {
        String str;
        ltg ltgVar = ezx.i;
        map.size();
        if (!map.isEmpty()) {
            this.a.n.b.e(map);
        }
        map2.size();
        if (!map2.isEmpty()) {
            this.a.n.c.e(map2);
        }
        ezx ezxVar = this.a;
        if (ezxVar.y && (str = ezxVar.w) != null && ezxVar.x != null) {
            ezxVar.n.b.f(str);
            ezx ezxVar2 = this.a;
            ezxVar2.n.c.f(ezxVar2.x);
        }
        this.a.aa(false);
    }
}
