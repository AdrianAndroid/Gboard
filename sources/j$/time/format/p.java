package j$.time.format;

import j$.time.ZoneOffset;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class p {
    private static final a f = new j$.time.temporal.q() { // from class: j$.time.format.a
        @Override // j$.time.temporal.q
        public final Object a(j$.time.temporal.m mVar) {
            int i = p.g;
            j$.time.n nVar = (j$.time.n) mVar.i(j$.time.temporal.p.g());
            if (nVar == null || (nVar instanceof ZoneOffset)) {
                return null;
            }
            return nVar;
        }
    };
    public static final /* synthetic */ int g = 0;
    private p a;
    private final p b;
    private final ArrayList c;
    private final boolean d;
    private int e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.n nVar = j$.time.temporal.i.a;
        hashMap.put('Q', nVar);
        hashMap.put('q', nVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public p() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    private p(p pVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = pVar;
        this.d = true;
    }

    private int d(g gVar) {
        Objects.a(gVar, "pp");
        p pVar = this.a;
        pVar.getClass();
        pVar.c.add(gVar);
        p pVar2 = this.a;
        pVar2.e = -1;
        return pVar2.c.size() - 1;
    }

    private void k(j jVar) {
        j c;
        w wVar;
        p pVar = this.a;
        int i = pVar.e;
        if (i < 0) {
            pVar.e = d(jVar);
            return;
        }
        j jVar2 = (j) pVar.c.get(i);
        int i2 = jVar.b;
        int i3 = jVar.c;
        if (i2 == i3) {
            wVar = jVar.d;
            if (wVar == w.NOT_NEGATIVE) {
                c = jVar2.d(i3);
                d(jVar.c());
                this.a.e = i;
                this.a.c.set(i, c);
            }
        }
        c = jVar2.c();
        this.a.e = d(jVar);
        this.a.c.set(i, c);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        d(dateTimeFormatter.f());
    }

    public final void b(j$.time.temporal.a aVar) {
        d(new h(aVar));
    }

    public final void c() {
        d(new i());
    }

    public final void e(char c) {
        d(new e(c));
    }

    public final void f(String str) {
        if (!str.isEmpty()) {
            d(str.length() == 1 ? new e(str.charAt(0)) : new m(str));
        }
    }

    public final void g(String str, String str2) {
        d(new k(str, str2));
    }

    public final void h() {
        d(k.e);
    }

    public final void i(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.a(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        x xVar = x.FULL;
        d(new n(aVar, xVar, new b(new s(Collections.singletonMap(xVar, linkedHashMap)))));
    }

    public final p j(j$.time.temporal.n nVar, int i, int i2, w wVar) {
        if (i == i2 && wVar == w.NOT_NEGATIVE) {
            l(nVar, i2);
            return this;
        }
        Objects.a(nVar, "field");
        Objects.a(wVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            k(new j(nVar, i, i2, wVar));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    public final void l(j$.time.temporal.n nVar, int i) {
        Objects.a(nVar, "field");
        if (i >= 1 && i <= 19) {
            k(new j(nVar, i, i, w.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
    }

    public final void m() {
        d(new o(f));
    }

    public final void n() {
        p pVar = this.a;
        if (pVar.b != null) {
            if (pVar.c.size() <= 0) {
                this.a = this.a.b;
                return;
            }
            p pVar2 = this.a;
            f fVar = new f(pVar2.c, pVar2.d);
            this.a = this.a.b;
            d(fVar);
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void o() {
        p pVar = this.a;
        pVar.e = -1;
        this.a = new p(pVar);
    }

    public final void p() {
        d(l.INSENSITIVE);
    }

    public final void q() {
        d(l.SENSITIVE);
    }

    public final void r() {
        d(l.LENIENT);
    }

    public final void s() {
        d(l.STRICT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter t(v vVar, j$.time.chrono.h hVar) {
        Locale locale = Locale.getDefault();
        Objects.a(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        f fVar = new f(this.c, false);
        u uVar = u.a;
        return new DateTimeFormatter(fVar, locale, vVar, hVar);
    }
}
