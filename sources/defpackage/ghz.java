package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: ghz  reason: default package */
/* loaded from: classes.dex */
public final class ghz implements ghn {
    private final lmu a;
    private final ghn b;
    private final lrh c;
    private final ght d;
    private final lrh e;
    private final ght f;

    public ghz(lmu lmuVar, Map.Entry entry, Map.Entry entry2, ghn ghnVar) {
        this.a = lmuVar;
        this.b = ghnVar;
        this.c = (lrh) entry.getKey();
        this.d = (ght) entry.getValue();
        this.e = (lrh) entry2.getKey();
        this.f = (ght) entry2.getValue();
    }

    @Override // defpackage.ghn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Float f = (Float) obj;
        if (f.floatValue() <= ((Float) this.c.k()).floatValue()) {
            if (!this.c.n() || f.floatValue() > ((Float) this.c.j()).floatValue()) {
                this.b.a(this.d.a(f.floatValue()));
            } else {
                this.b.a(this.d.a(((Float) this.c.j()).floatValue()));
            }
        } else if (f.floatValue() >= ((Float) this.e.j()).floatValue()) {
            if (!this.e.o() || f.floatValue() < ((Float) this.e.k()).floatValue()) {
                this.b.a(this.f.a(f.floatValue()));
            } else {
                this.b.a(this.f.a(((Float) this.e.k()).floatValue()));
            }
        } else {
            ghn ghnVar = this.b;
            lmu lmuVar = this.a;
            int f2 = lvw.f(lmuVar.b, lrh.c(), lkp.g(f), lrb.a, lsj.ANY_PRESENT, lsi.NEXT_LOWER);
            Object obj2 = null;
            if (f2 != -1 && ((lrh) lmuVar.b.get(f2)).a(f)) {
                obj2 = lmuVar.c.get(f2);
            }
            ght ghtVar = (ght) obj2;
            jdg.u(ghtVar);
            ghnVar.a(ghtVar.a(f.floatValue()));
        }
    }
}
