package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes3.dex */
abstract class t {
    private static final Comparator a = new c();
    public static final /* synthetic */ int b = 0;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public abstract String b(j$.time.chrono.g gVar, j$.time.temporal.n nVar, long j, x xVar, Locale locale);

    public abstract String c(j$.time.temporal.n nVar, long j, x xVar, Locale locale);
}
