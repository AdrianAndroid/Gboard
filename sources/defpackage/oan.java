package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: oan  reason: default package */
/* loaded from: classes2.dex */
public final class oan implements nui {
    private final /* synthetic */ int a;

    public oan(int i) {
        this.a = i;
    }

    @Override // defpackage.nui
    public final /* synthetic */ Object a(String str) {
        if (this.a != 0) {
            return str;
        }
        jdg.w(str.length() > 0, "empty timeout");
        jdg.w(str.length() <= 9, "bad timeout format");
        long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
        char charAt = str.charAt(str.length() - 1);
        if (charAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
        }
        if (charAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
        }
        if (charAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
        }
        if (charAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
        }
        if (charAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
        }
        if (charAt == 'n') {
            return Long.valueOf(parseLong);
        }
        throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
    }

    @Override // defpackage.nui
    public final /* synthetic */ String b(Object obj) {
        if (this.a == 0) {
            Long l = (Long) obj;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l.longValue() < 100000000) {
                new StringBuilder().append(l);
                return String.valueOf(l).concat("n");
            } else if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            } else if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            } else if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + "S";
            } else if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            } else {
                return timeUnit.toHours(l.longValue()) + "H";
            }
        }
        return (String) obj;
    }
}
