package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: anu  reason: default package */
/* loaded from: classes.dex */
public final class anu implements anv, ans {
    private final Path a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List d = new ArrayList();
    private final apu e;

    public anu(apu apuVar) {
        this.e = apuVar;
    }

    private final void a(Path.Op op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            anv anvVar = (anv) this.d.get(size);
            if (anvVar instanceof anm) {
                anm anmVar = (anm) anvVar;
                List j = anmVar.j();
                int size2 = j.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        Path i = ((anv) j.get(size2)).i();
                        i.transform(anmVar.h());
                        this.b.addPath(i);
                    }
                }
            } else {
                this.b.addPath(anvVar.i());
            }
        }
        anv anvVar2 = (anv) this.d.get(0);
        if (anvVar2 instanceof anm) {
            anm anmVar2 = (anm) anvVar2;
            List j2 = anmVar2.j();
            for (int i2 = 0; i2 < j2.size(); i2++) {
                Path i3 = ((anv) j2.get(i2)).i();
                i3.transform(anmVar2.h());
                this.a.addPath(i3);
            }
        } else {
            this.a.set(anvVar2.i());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // defpackage.anl
    public final void f(List list, List list2) {
        for (int i = 0; i < this.d.size(); i++) {
            ((anv) this.d.get(i)).f(list, list2);
        }
    }

    @Override // defpackage.anl
    public final String g() {
        throw null;
    }

    @Override // defpackage.ans
    public final void h(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            anl anlVar = (anl) listIterator.previous();
            if (anlVar instanceof anv) {
                this.d.add((anv) anlVar);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.anv
    public final Path i() {
        this.c.reset();
        apu apuVar = this.e;
        if (apuVar.a) {
            return this.c;
        }
        int i = apuVar.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                this.c.addPath(((anv) this.d.get(i3)).i());
            }
        } else if (i2 == 1) {
            a(Path.Op.UNION);
        } else if (i2 == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 3) {
            a(Path.Op.INTERSECT);
        } else if (i2 == 4) {
            a(Path.Op.XOR);
        }
        return this.c;
    }
}
