package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: kgn  reason: default package */
/* loaded from: classes.dex */
final class kgn {
    public static final ltg a = ltg.j("com/google/android/libraries/performance/primes/metrics/storage/DirStatsCapture");

    public static boolean a(List list, String str) {
        lta listIterator = ((llp) list).listIterator();
        while (listIterator.hasNext()) {
            if (((Pattern) ((opu) listIterator.next()).a).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
