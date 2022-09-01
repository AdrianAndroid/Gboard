package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lap  reason: default package */
/* loaded from: classes.dex */
public final class lap implements lay {
    private final nox a;
    private final nox b;
    private final nox c;

    public lap(nox noxVar, nox noxVar2, nox noxVar3) {
        this.a = noxVar;
        this.b = noxVar2;
        this.c = noxVar3;
    }

    private final lay h() {
        if (this.c.a() == null) {
            return (lay) this.a.a();
        }
        return (lay) this.b.a();
    }

    @Override // defpackage.lay
    public final gen a(List list) {
        return h().a(list);
    }

    @Override // defpackage.lay
    public final gen b(lbb lbbVar) {
        return h().b(lbbVar);
    }

    @Override // defpackage.lay
    public final Set c() {
        return h().c();
    }

    @Override // defpackage.lay
    public final Set d() {
        return h().d();
    }

    @Override // defpackage.lay
    public final void e(hgo hgoVar) {
        h().e(hgoVar);
    }

    @Override // defpackage.lay
    public final void f(hgo hgoVar) {
        h().f(hgoVar);
    }

    @Override // defpackage.lay
    public final boolean g(lbh lbhVar, Activity activity) {
        return h().g(lbhVar, activity);
    }
}
