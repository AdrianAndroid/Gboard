package defpackage;

import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: buk  reason: default package */
/* loaded from: classes.dex */
public final class buk {
    public static final buk a = new buk(1);
    public static final buk b = new buk(2);
    public static final buk c = new buk(3);
    public final long d;
    public long e;
    public CharSequence f;
    public bum g;

    private buk(int i) {
        bul a2 = bum.a();
        a2.f(i);
        this.g = a2.a();
        this.d = -1L;
        this.e = -1L;
    }

    public static buj g() {
        return new buj();
    }

    public final int a() {
        switch (this.g.d) {
            case 1:
                return R.drawable.f50420_resource_name_obfuscated_res_0x7f080351;
            case 2:
                return R.drawable.f50240_resource_name_obfuscated_res_0x7f08033d;
            case 3:
                return R.drawable.f50500_resource_name_obfuscated_res_0x7f08035a;
            case 4:
                return R.drawable.f47290_resource_name_obfuscated_res_0x7f0801cd;
            case 5:
            case 11:
            case 17:
                return R.drawable.f50510_resource_name_obfuscated_res_0x7f08035b;
            case 6:
            case 7:
                return R.drawable.f50570_resource_name_obfuscated_res_0x7f080361;
            case 8:
            case 9:
            case 10:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 18:
                return R.drawable.f47310_resource_name_obfuscated_res_0x7f0801cf;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 19:
            case 20:
            case 21:
                return R.drawable.f50490_resource_name_obfuscated_res_0x7f080359;
            default:
                return 0;
        }
    }

    public final int b() {
        switch (this.g.d) {
            case 1:
                return R.string.f182190_resource_name_obfuscated_res_0x7f140f2e;
            case 2:
                return R.string.f150590_resource_name_obfuscated_res_0x7f1401b1;
            case 3:
                return R.string.f159590_resource_name_obfuscated_res_0x7f1405f3;
            case 4:
                return R.string.f159180_resource_name_obfuscated_res_0x7f1405ac;
            case 5:
                return R.string.f147930_resource_name_obfuscated_res_0x7f140047;
            case 6:
                return R.string.f150120_resource_name_obfuscated_res_0x7f140166;
            case 7:
                return R.string.f150140_resource_name_obfuscated_res_0x7f140168;
            case 8:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return R.string.f148210_resource_name_obfuscated_res_0x7f140066;
            case 9:
            case 15:
                return R.string.f149720_resource_name_obfuscated_res_0x7f14013c;
            case 10:
            case 16:
                return R.string.f151690_resource_name_obfuscated_res_0x7f14022f;
            case 11:
            case 17:
                return R.string.f157510_resource_name_obfuscated_res_0x7f1404af;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case 18:
                return R.string.f159380_resource_name_obfuscated_res_0x7f1405d7;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case 19:
            case 20:
            case 21:
                return R.string.f159480_resource_name_obfuscated_res_0x7f1405e8;
            default:
                return 0;
        }
    }

    public final int c() {
        return this.g.d;
    }

    public final int d() {
        return this.g.c;
    }

    public final int e() {
        int i = this.g.c;
        if ((i & 4) == 4) {
            return R.string.f149390_resource_name_obfuscated_res_0x7f140111;
        }
        if ((i & 8) == 8) {
            return R.string.f149410_resource_name_obfuscated_res_0x7f140113;
        }
        if ((i & 16) == 16) {
            return R.string.f149400_resource_name_obfuscated_res_0x7f140112;
        }
        if ((i & 32) != 32) {
            return 0;
        }
        return R.string.f149420_resource_name_obfuscated_res_0x7f140114;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof buk) {
            return Objects.equals(this.g, ((buk) obj).g);
        }
        return false;
    }

    public final int f() {
        return this.g.g;
    }

    public final String h() {
        return this.g.b;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String i() {
        return this.g.a;
    }

    public final String j() {
        return this.g.e;
    }

    public final void k(boolean z) {
        bum bumVar = this.g;
        int i = bumVar.c;
        int i2 = z ? i | 1 : i & (-2);
        bul b2 = bumVar.b();
        b2.d(i2);
        this.g = b2.a();
    }

    public final boolean l() {
        return (this.g.c & 1) == 1;
    }

    public final boolean m() {
        return (this.g.c & 2) == 2;
    }

    public final String toString() {
        long j = this.d;
        long j2 = this.e;
        String valueOf = String.valueOf(this.g);
        return "ClipItem{ id = " + j + ", timestamp = " + j2 + ", clipItemContent = " + valueOf + "}";
    }

    public buk(buj bujVar) {
        this.d = bujVar.a;
        this.g = bujVar.c.a();
        this.e = bujVar.b;
    }
}
