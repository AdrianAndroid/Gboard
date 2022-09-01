package defpackage;

import j$.util.Objects;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cup  reason: default package */
/* loaded from: classes.dex */
public final class cup extends fe {
    public cup(List list, List list2) {
        super(list, list2);
    }

    private static boolean f(cuq cuqVar, cuq cuqVar2) {
        return Objects.equals(cuqVar.a, cuqVar2.a);
    }

    @Override // defpackage.fe
    public final boolean c(int i, int i2) {
        cuq cuqVar = (cuq) this.a.get(i);
        cuq cuqVar2 = (cuq) this.b.get(i2);
        return f(cuqVar, cuqVar2) && Objects.equals(cuqVar.b, cuqVar2.b);
    }

    @Override // defpackage.fe
    public final boolean d(int i, int i2) {
        return f((cuq) this.a.get(i), (cuq) this.b.get(i2));
    }

    @Override // defpackage.fe
    public final Object e(int i) {
        return ((cuq) this.b.get(i)).b;
    }
}
