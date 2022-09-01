package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes3.dex */
public abstract class i {
    public static final n a = g.QUARTER_OF_YEAR;
    public static final n b = g.WEEK_OF_WEEK_BASED_YEAR;
    public static final n c = g.WEEK_BASED_YEAR;

    static {
        g gVar = g.DAY_OF_QUARTER;
        h hVar = h.WEEK_BASED_YEARS;
        h hVar2 = h.WEEK_BASED_YEARS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(m mVar) {
        Objects.a(mVar, "temporal");
        j$.time.chrono.g gVar = (j$.time.chrono.g) mVar.i(p.b);
        j$.time.chrono.h hVar = j$.time.chrono.h.a;
        if (gVar == null) {
            Objects.a(hVar, "defaultObj");
            gVar = hVar;
        }
        return ((j$.time.chrono.a) gVar).equals(hVar);
    }
}
