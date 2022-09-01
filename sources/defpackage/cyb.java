package defpackage;

/* compiled from: PG */
/* renamed from: cyb  reason: default package */
/* loaded from: classes.dex */
final class cyb {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public cyb() {
    }

    public cyb(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyb) {
            cyb cybVar = (cyb) obj;
            if (this.a.equals(cybVar.a) && this.b.equals(cybVar.b) && this.c == cybVar.c && this.d == cybVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        return "ImageConfig{thumbnailUrlPrefix=" + str + ", thumbnailAlternativeUrlPrefix=" + str2 + ", enableTenorSponsoredGif=" + z + ", enableSponsoredGifCampaignManagerReporting=" + z2 + "}";
    }
}
