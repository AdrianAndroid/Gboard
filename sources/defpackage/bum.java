package defpackage;

/* compiled from: PG */
/* renamed from: bum  reason: default package */
/* loaded from: classes.dex */
public final class bum {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final int g;

    public bum() {
    }

    public bum(String str, String str2, int i, int i2, String str3, long j, int i3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = j;
        this.g = i3;
    }

    public static bul a() {
        bul bulVar = new bul();
        bulVar.a = "";
        bulVar.b = "";
        bulVar.d(0);
        bulVar.b(0);
        bulVar.e("");
        bulVar.c(-1L);
        bulVar.f(0);
        return bulVar;
    }

    public final bul b() {
        return new bul(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bum) {
            bum bumVar = (bum) obj;
            if (this.a.equals(bumVar.a) && this.b.equals(bumVar.b) && this.c == bumVar.c && this.d == bumVar.d && this.e.equals(bumVar.e) && this.f == bumVar.f && this.g == bumVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int i = this.c;
        int i2 = this.d;
        int hashCode3 = this.e.hashCode();
        long j = this.f;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.g;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        String str3 = this.e;
        long j = this.f;
        int i3 = this.g;
        return "ClipItemContent{text=" + str + ", htmlText=" + str2 + ", itemType=" + i + ", entityType=" + i2 + ", uri=" + str3 + ", groupId=" + j + ", viewType=" + i3 + "}";
    }
}
