package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqi  reason: default package */
/* loaded from: classes.dex */
public final class cqi extends cqp {
    public final int a;
    public final int b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final Uri f;
    public final String g;
    public final String h;
    public final Uri i;
    public final lfb j;
    public final String k;
    public final String l;
    public final mbr m;
    public final iil n;
    public final int o;
    public final llw p;
    public final llw q;
    private volatile transient Uri u;

    public cqi(int i, int i2, String str, Uri uri, Uri uri2, Uri uri3, String str2, String str3, Uri uri4, lfb lfbVar, String str4, String str5, mbr mbrVar, iil iilVar, int i3, llw llwVar, llw llwVar2) {
        this.a = i;
        this.b = i2;
        if (str != null) {
            this.c = str;
            this.d = uri;
            if (uri2 != null) {
                this.e = uri2;
                if (uri3 != null) {
                    this.f = uri3;
                    this.g = str2;
                    this.h = str3;
                    this.i = uri4;
                    if (lfbVar != null) {
                        this.j = lfbVar;
                        this.k = str4;
                        if (str5 != null) {
                            this.l = str5;
                            if (mbrVar != null) {
                                this.m = mbrVar;
                                if (iilVar != null) {
                                    this.n = iilVar;
                                    this.o = i3;
                                    if (llwVar != null) {
                                        this.p = llwVar;
                                        if (llwVar2 != null) {
                                            this.q = llwVar2;
                                            return;
                                        }
                                        throw new NullPointerException("Null shareableUris");
                                    }
                                    throw new NullPointerException("Null localFiles");
                                }
                                throw new NullPointerException("Null networkRequestFeature");
                            }
                            throw new NullPointerException("Null contentType");
                        }
                        throw new NullPointerException("Null tag");
                    }
                    throw new NullPointerException("Null sponsoredData");
                }
                throw new NullPointerException("Null loggableImageUri");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cqp
    public final int a() {
        return this.o;
    }

    @Override // defpackage.cqp
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cqp
    public final int c() {
        return this.a;
    }

    @Override // defpackage.cqp
    public final Uri d() {
        return this.e;
    }

    @Override // defpackage.cqp
    public final Uri e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        String str;
        String str2;
        Uri uri2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqp) {
            cqp cqpVar = (cqp) obj;
            if (this.a == cqpVar.c() && this.b == cqpVar.b() && this.c.equals(cqpVar.o()) && ((uri = this.d) != null ? uri.equals(cqpVar.g()) : cqpVar.g() == null) && this.e.equals(cqpVar.d()) && this.f.equals(cqpVar.e()) && ((str = this.g) != null ? str.equals(cqpVar.q()) : cqpVar.q() == null) && ((str2 = this.h) != null ? str2.equals(cqpVar.p()) : cqpVar.p() == null) && ((uri2 = this.i) != null ? uri2.equals(cqpVar.f()) : cqpVar.f() == null) && this.j.equals(cqpVar.j()) && ((str3 = this.k) != null ? str3.equals(cqpVar.n()) : cqpVar.n() == null) && this.l.equals(cqpVar.r()) && this.m.equals(cqpVar.m()) && this.n.equals(cqpVar.i()) && this.o == cqpVar.a() && lre.z(this.p, cqpVar.k()) && this.q.equals(cqpVar.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqp
    public final Uri f() {
        return this.i;
    }

    @Override // defpackage.cqp
    public final Uri g() {
        return this.d;
    }

    @Override // defpackage.cqp
    public final cqo h() {
        return new cqo(this);
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003;
        Uri uri = this.d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (uri == null ? 0 : uri.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.h;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Uri uri2 = this.i;
        int hashCode5 = (((hashCode4 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003;
        String str3 = this.k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((((((hashCode5 ^ i) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.cqp
    public final iil i() {
        return this.n;
    }

    @Override // defpackage.cqp
    public final lfb j() {
        return this.j;
    }

    @Override // defpackage.cqp
    public final llw k() {
        return this.p;
    }

    @Override // defpackage.cqp
    public final llw l() {
        return this.q;
    }

    @Override // defpackage.cqp
    public final mbr m() {
        return this.m;
    }

    @Override // defpackage.cqp
    public final String n() {
        return this.k;
    }

    @Override // defpackage.cqp
    public final String o() {
        return this.c;
    }

    @Override // defpackage.cqp
    public final String p() {
        return this.h;
    }

    @Override // defpackage.cqp
    public final String q() {
        return this.g;
    }

    @Override // defpackage.cqp
    public final String r() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x015a, code lost:
        if (r5 > 6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x007d, code lost:
        if (r4.intValue() >= 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x02a0, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0020, B:12:0x028f, B:15:0x0296, B:16:0x029d, B:18:0x003d, B:21:0x0054, B:22:0x0057, B:23:0x027e, B:24:0x028b, B:25:0x005b, B:27:0x0064, B:32:0x0095, B:33:0x00aa, B:35:0x00b6, B:36:0x00c2, B:38:0x00cc, B:40:0x00d6, B:42:0x00ed, B:44:0x00ef, B:46:0x0104, B:48:0x010e, B:50:0x011a, B:51:0x0136, B:53:0x013d, B:54:0x0140, B:57:0x015c, B:60:0x0164, B:62:0x0170, B:65:0x0183, B:67:0x01ae, B:68:0x01b7, B:70:0x01c7, B:71:0x01cf, B:74:0x01d7, B:75:0x01e0, B:77:0x014a, B:80:0x01e1, B:83:0x01f4, B:85:0x0203, B:87:0x0211, B:88:0x0216, B:90:0x0221, B:91:0x0232, B:93:0x0245, B:95:0x024b, B:97:0x0250, B:98:0x0255, B:99:0x0227, B:101:0x022d, B:106:0x0121, B:108:0x0127, B:110:0x0133, B:111:0x0268, B:112:0x026f, B:117:0x0278, B:118:0x027d, B:114:0x0271, B:115:0x0276, B:119:0x00df, B:121:0x00e5, B:122:0x00bf, B:124:0x006b, B:127:0x0079, B:129:0x0083, B:130:0x008c, B:131:0x00a0, B:132:0x028c, B:133:0x028d, B:134:0x029e), top: B:4:0x0005, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.cqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri s() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqi.s():android.net.Uri");
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String obj = this.e.toString();
        String obj2 = this.f.toString();
        String str2 = this.g;
        String str3 = this.h;
        String valueOf2 = String.valueOf(this.i);
        String obj3 = this.j.toString();
        String str4 = this.k;
        String str5 = this.l;
        String obj4 = this.m.toString();
        String obj5 = this.n.toString();
        int i3 = this.o;
        String p = lre.p(this.p);
        String obj6 = this.q.toString();
        return "Image{width=" + i + ", height=" + i2 + ", id=" + str + ", thumbnailUri=" + valueOf + ", imageUri=" + obj + ", loggableImageUri=" + obj2 + ", referralUrl=" + str2 + ", referralHost=" + str3 + ", proxyUri=" + valueOf2 + ", sponsoredData=" + obj3 + ", contentDescription=" + str4 + ", tag=" + str5 + ", contentType=" + obj4 + ", networkRequestFeature=" + obj5 + ", backgroundColor=" + i3 + ", localFiles=" + p + ", shareableUris=" + obj6 + "}";
    }
}
