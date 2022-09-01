package j$.time.format;

import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter f;
    private final f a;
    private final Locale b;
    private final u c;
    private final j$.time.chrono.g d;
    private final j$.time.n e = null;

    static {
        p pVar = new p();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        w wVar = w.EXCEEDS_PAD;
        pVar.j(aVar, 4, 10, wVar);
        pVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        pVar.l(aVar2, 2);
        pVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        pVar.l(aVar3, 2);
        v vVar = v.STRICT;
        j$.time.chrono.h hVar = j$.time.chrono.h.a;
        DateTimeFormatter t = pVar.t(vVar, hVar);
        ISO_LOCAL_DATE = t;
        p pVar2 = new p();
        pVar2.p();
        pVar2.a(t);
        pVar2.h();
        pVar2.t(vVar, hVar);
        p pVar3 = new p();
        pVar3.p();
        pVar3.a(t);
        pVar3.o();
        pVar3.h();
        pVar3.t(vVar, hVar);
        p pVar4 = new p();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        pVar4.l(aVar4, 2);
        pVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        pVar4.l(aVar5, 2);
        pVar4.o();
        pVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        pVar4.l(aVar6, 2);
        pVar4.o();
        pVar4.b(j$.time.temporal.a.NANO_OF_SECOND);
        DateTimeFormatter t2 = pVar4.t(vVar, null);
        p pVar5 = new p();
        pVar5.p();
        pVar5.a(t2);
        pVar5.h();
        pVar5.t(vVar, null);
        p pVar6 = new p();
        pVar6.p();
        pVar6.a(t2);
        pVar6.o();
        pVar6.h();
        pVar6.t(vVar, null);
        p pVar7 = new p();
        pVar7.p();
        pVar7.a(t);
        pVar7.e('T');
        pVar7.a(t2);
        DateTimeFormatter t3 = pVar7.t(vVar, hVar);
        p pVar8 = new p();
        pVar8.p();
        pVar8.a(t3);
        pVar8.r();
        pVar8.h();
        pVar8.s();
        DateTimeFormatter t4 = pVar8.t(vVar, hVar);
        p pVar9 = new p();
        pVar9.a(t4);
        pVar9.o();
        pVar9.e('[');
        pVar9.q();
        pVar9.m();
        pVar9.e(']');
        pVar9.t(vVar, hVar);
        p pVar10 = new p();
        pVar10.a(t3);
        pVar10.o();
        pVar10.h();
        pVar10.o();
        pVar10.e('[');
        pVar10.q();
        pVar10.m();
        pVar10.e(']');
        pVar10.t(vVar, hVar);
        p pVar11 = new p();
        pVar11.p();
        pVar11.j(aVar, 4, 10, wVar);
        pVar11.e('-');
        pVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        pVar11.o();
        pVar11.h();
        pVar11.t(vVar, hVar);
        p pVar12 = new p();
        pVar12.p();
        pVar12.j(j$.time.temporal.i.c, 4, 10, wVar);
        pVar12.f("-W");
        pVar12.l(j$.time.temporal.i.b, 2);
        pVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        pVar12.l(aVar7, 1);
        pVar12.o();
        pVar12.h();
        pVar12.t(vVar, hVar);
        p pVar13 = new p();
        pVar13.p();
        pVar13.c();
        f = pVar13.t(vVar, null);
        p pVar14 = new p();
        pVar14.p();
        pVar14.l(aVar, 4);
        pVar14.l(aVar2, 2);
        pVar14.l(aVar3, 2);
        pVar14.o();
        pVar14.r();
        pVar14.g("+HHMMss", "Z");
        pVar14.s();
        pVar14.t(vVar, hVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        p pVar15 = new p();
        pVar15.p();
        pVar15.r();
        pVar15.o();
        pVar15.i(aVar7, hashMap);
        pVar15.f(", ");
        pVar15.n();
        pVar15.j(aVar3, 1, 2, w.NOT_NEGATIVE);
        pVar15.e(' ');
        pVar15.i(aVar2, hashMap2);
        pVar15.e(' ');
        pVar15.l(aVar, 4);
        pVar15.e(' ');
        pVar15.l(aVar4, 2);
        pVar15.e(':');
        pVar15.l(aVar5, 2);
        pVar15.o();
        pVar15.e(':');
        pVar15.l(aVar6, 2);
        pVar15.n();
        pVar15.e(' ');
        pVar15.g("+HHMM", "GMT");
        pVar15.t(v.SMART, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(f fVar, Locale locale, v vVar, j$.time.chrono.h hVar) {
        u uVar = u.a;
        this.a = fVar;
        this.b = locale;
        this.c = uVar;
        Objects.a(vVar, "resolverStyle");
        this.d = hVar;
    }

    public final String a(j$.time.temporal.m mVar) {
        StringBuilder sb = new StringBuilder(32);
        Objects.a(mVar, "temporal");
        try {
            this.a.a(new r(mVar, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new j$.time.c(e.getMessage(), e);
        }
    }

    public final j$.time.chrono.g b() {
        return this.d;
    }

    public final u c() {
        return this.c;
    }

    public final Locale d() {
        return this.b;
    }

    public final j$.time.n e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f f() {
        return this.a.b();
    }

    public final String toString() {
        String fVar = this.a.toString();
        return fVar.startsWith("[") ? fVar : fVar.substring(1, fVar.length() - 1);
    }
}
