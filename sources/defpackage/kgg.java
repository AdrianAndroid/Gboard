package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kgg  reason: default package */
/* loaded from: classes.dex */
public final class kgg {
    public final oiy f;
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector");
    public static final Pattern b = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern c = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern g = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-_]+)");
    public static final Pattern e = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    static {
        lmz.u("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    }

    public kgg(oiy oiyVar) {
        this.f = oiyVar;
    }
}
