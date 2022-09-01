package j$.time;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class n implements Serializable {
    static {
        Map.Entry[] entryArr = {j$.desugar.sun.nio.fs.a.f("ACT", "Australia/Darwin"), j$.desugar.sun.nio.fs.a.f("AET", "Australia/Sydney"), j$.desugar.sun.nio.fs.a.f("AGT", "America/Argentina/Buenos_Aires"), j$.desugar.sun.nio.fs.a.f("ART", "Africa/Cairo"), j$.desugar.sun.nio.fs.a.f("AST", "America/Anchorage"), j$.desugar.sun.nio.fs.a.f("BET", "America/Sao_Paulo"), j$.desugar.sun.nio.fs.a.f("BST", "Asia/Dhaka"), j$.desugar.sun.nio.fs.a.f("CAT", "Africa/Harare"), j$.desugar.sun.nio.fs.a.f("CNT", "America/St_Johns"), j$.desugar.sun.nio.fs.a.f("CST", "America/Chicago"), j$.desugar.sun.nio.fs.a.f("CTT", "Asia/Shanghai"), j$.desugar.sun.nio.fs.a.f("EAT", "Africa/Addis_Ababa"), j$.desugar.sun.nio.fs.a.f("ECT", "Europe/Paris"), j$.desugar.sun.nio.fs.a.f("IET", "America/Indiana/Indianapolis"), j$.desugar.sun.nio.fs.a.f("IST", "Asia/Kolkata"), j$.desugar.sun.nio.fs.a.f("JST", "Asia/Tokyo"), j$.desugar.sun.nio.fs.a.f("MIT", "Pacific/Apia"), j$.desugar.sun.nio.fs.a.f("NET", "Asia/Yerevan"), j$.desugar.sun.nio.fs.a.f("NST", "Pacific/Auckland"), j$.desugar.sun.nio.fs.a.f("PLT", "Asia/Karachi"), j$.desugar.sun.nio.fs.a.f("PNT", "America/Phoenix"), j$.desugar.sun.nio.fs.a.f("PRT", "America/Puerto_Rico"), j$.desugar.sun.nio.fs.a.f("PST", "America/Los_Angeles"), j$.desugar.sun.nio.fs.a.f("SST", "Pacific/Guadalcanal"), j$.desugar.sun.nio.fs.a.f("VST", "Asia/Ho_Chi_Minh"), j$.desugar.sun.nio.fs.a.f("EST", "-05:00"), j$.desugar.sun.nio.fs.a.f("MST", "-07:00"), j$.desugar.sun.nio.fs.a.f("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        if (getClass() == ZoneOffset.class || getClass() == o.class) {
            return;
        }
        throw new AssertionError("Invalid subclass");
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String j();

    public abstract String toString();
}
