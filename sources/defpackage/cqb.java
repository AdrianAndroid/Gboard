package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cqb  reason: default package */
/* loaded from: classes.dex */
public final class cqb {
    public final String a;
    public final long b;
    public final long c;
    public final int d;

    static {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("SELECT emoticon, truncated_timestamp_millis, last_event_millis, shares FROM emoticon_shares");
        kws.m(sb, arrayList);
    }

    public cqb(irh irhVar) {
        this(irhVar.c(irhVar.getColumnIndexOrThrow("emoticon")), irhVar.getLong(irhVar.getColumnIndexOrThrow("truncated_timestamp_millis")), irhVar.getLong(irhVar.getColumnIndexOrThrow("last_event_millis")), irhVar.getInt(irhVar.getColumnIndexOrThrow("shares")));
    }

    public cqb(String str, long j, long j2, int i) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public static llp a(jma jmaVar, jma jmaVar2) {
        irh p = jco.p(jmaVar, jmaVar2);
        try {
            llp b = p.b(cli.q);
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
        if (!(obj instanceof cqb)) {
            return false;
        }
        cqb cqbVar = (cqb) obj;
        return this.a.equals(cqbVar.a) && this.b == cqbVar.b && this.c == cqbVar.c && this.d == cqbVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("emoticon", this.a);
        S.g("truncatedTimestamp", this.b);
        S.g("timestamp", this.c);
        S.f("shares", this.d);
        return S.toString();
    }
}
