package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cpm  reason: default package */
/* loaded from: classes.dex */
public final class cpm {
    public final String a;
    public final long b;
    public final long c;
    public final int d;

    static {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("SELECT animated_emoji, truncated_timestamp_millis, last_event_millis, usage FROM animated_emoji_usage");
        kws.m(sb, arrayList);
    }

    public cpm(irh irhVar) {
        String c = irhVar.c(irhVar.getColumnIndexOrThrow("animated_emoji"));
        long j = irhVar.getLong(irhVar.getColumnIndexOrThrow("truncated_timestamp_millis"));
        long j2 = irhVar.getLong(irhVar.getColumnIndexOrThrow("last_event_millis"));
        int i = irhVar.getInt(irhVar.getColumnIndexOrThrow("usage"));
        this.a = c;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public static llp a(jma jmaVar, jma jmaVar2) {
        irh p = jco.p(jmaVar, jmaVar2);
        try {
            llp b = p.b(cli.j);
            p.close();
            return b;
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cpm)) {
            return false;
        }
        cpm cpmVar = (cpm) obj;
        return this.a.equals(cpmVar.a) && this.b == cpmVar.b && this.c == cpmVar.c && this.d == cpmVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("animatedEmoji", this.a);
        S.g("truncatedTimestamp", this.b);
        S.g("timestamp", this.c);
        S.f("usage", this.d);
        return S.toString();
    }
}
