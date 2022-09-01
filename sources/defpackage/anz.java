package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: PG */
/* renamed from: anz  reason: default package */
/* loaded from: classes.dex */
public final class anz implements anv, aoc {
    private final boolean b;
    private final amy c;
    private final aoh d;
    private boolean e;
    private final Path a = new Path();
    private final aqr f = new aqr((short[]) null);

    public anz(amy amyVar, aqf aqfVar, aqb aqbVar) {
        this.b = aqbVar.b;
        this.c = amyVar;
        aoh a = aqbVar.a.a();
        this.d = a;
        aqfVar.h(a);
        a.g(this);
    }

    @Override // defpackage.aoc
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            anl anlVar = (anl) list.get(i);
            if (anlVar instanceof aob) {
                aob aobVar = (aob) anlVar;
                if (aobVar.e == 1) {
                    this.f.k(aobVar);
                    aobVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.anl
    public final String g() {
        throw null;
    }

    @Override // defpackage.anv
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set((Path) this.d.e());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.l(this.a);
        this.e = true;
        return this.a;
    }
}
