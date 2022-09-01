package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aob  reason: default package */
/* loaded from: classes.dex */
public final class aob implements anl, aoc {
    public final boolean a;
    public final aoh b;
    public final aoh c;
    public final aoh d;
    public final int e;
    private final List f = new ArrayList();

    public aob(aqf aqfVar, aqd aqdVar) {
        this.a = aqdVar.d;
        this.e = aqdVar.e;
        aoh a = aqdVar.a.a();
        this.b = a;
        aoh a2 = aqdVar.b.a();
        this.c = a2;
        aoh a3 = aqdVar.c.a();
        this.d = a3;
        aqfVar.h(a);
        aqfVar.h(a2);
        aqfVar.h(a3);
        a.g(this);
        a2.g(this);
        a3.g(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aoc aocVar) {
        this.f.add(aocVar);
    }

    @Override // defpackage.aoc
    public final void d() {
        for (int i = 0; i < this.f.size(); i++) {
            ((aoc) this.f.get(i)).d();
        }
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
    }

    @Override // defpackage.anl
    public final String g() {
        throw null;
    }
}
