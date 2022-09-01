package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cpw  reason: default package */
/* loaded from: classes.dex */
public final class cpw {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    static {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("SELECT emoji, base_variant_emoji, truncated_timestamp_millis, last_event_millis, shares FROM emoji_shares");
        kws.m(sb, arrayList);
    }

    public cpw(irh irhVar) {
        this(irhVar.c(irhVar.getColumnIndexOrThrow("emoji")), irhVar.c(irhVar.getColumnIndexOrThrow("base_variant_emoji")), irhVar.getLong(irhVar.getColumnIndexOrThrow("truncated_timestamp_millis")), irhVar.getLong(irhVar.getColumnIndexOrThrow("last_event_millis")), irhVar.getInt(irhVar.getColumnIndexOrThrow("shares")));
    }

    public cpw(String str, String str2, long j, long j2, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public static llp a(jma jmaVar, jma jmaVar2) {
        irh p = jco.p(jmaVar, jmaVar2);
        try {
            llp b = p.b(cli.m);
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
        if (!(obj instanceof cpw)) {
            return false;
        }
        cpw cpwVar = (cpw) obj;
        return this.a.equals(cpwVar.a) && this.b.equals(cpwVar.b) && this.c == cpwVar.c && this.d == cpwVar.d && this.e == cpwVar.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        lfa S = jdg.S(this);
        S.b("emoji", this.a);
        S.b("baseVariantEmoji", this.b);
        S.g("truncatedTimestamp", this.c);
        S.g("timestamp", this.d);
        S.f("shares", this.e);
        return S.toString();
    }
}
