package defpackage;

/* compiled from: PG */
/* renamed from: cpn  reason: default package */
/* loaded from: classes.dex */
final class cpn extends cpv {
    private final String a;
    private final String b;
    private final long c;
    private final long d;

    public cpn(String str, String str2, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.cpv
    public final long b() {
        return this.c;
    }

    @Override // defpackage.cpv
    public final long c() {
        return this.d;
    }

    @Override // defpackage.cpv
    public final String d() {
        return this.b;
    }

    @Override // defpackage.cpv
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpv) {
            cpv cpvVar = (cpv) obj;
            if (this.a.equals(cpvVar.e()) && this.b.equals(cpvVar.d()) && this.c == cpvVar.b() && this.d == cpvVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        long j2 = this.d;
        return "EmojiSharesHistoryChangedNotification{emoji=" + str + ", baseVariantEmoji=" + str2 + ", timestamp=" + j + ", truncatedTimestamp=" + j2 + "}";
    }
}
