package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: lga  reason: default package */
/* loaded from: classes.dex */
public final class lga {
    public boolean a;
    private final lgh b;
    private long c;

    public lga() {
        this.b = lgh.a;
    }

    public lga(lgh lghVar) {
        jdg.Q(lghVar, "ticker");
        this.b = lghVar;
    }

    public static lga b() {
        return new lga();
    }

    public static lga c(lgh lghVar) {
        return new lga(lghVar);
    }

    private final long f() {
        if (this.a) {
            return this.b.a() - this.c;
        }
        return 0L;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }

    public final void d() {
        this.a = false;
    }

    public final void e() {
        jdg.G(!this.a, "This stopwatch is already running.");
        this.a = true;
        this.c = this.b.a();
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long f = f();
        if (TimeUnit.DAYS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(f, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MICROSECONDS.convert(f, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        }
        long convert = TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        StringBuilder sb = new StringBuilder();
        double d = f;
        double d2 = convert;
        Double.isNaN(d);
        Double.isNaN(d2);
        sb.append(lfd.c(d / d2));
        sb.append(" ");
        switch (lfz.a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
