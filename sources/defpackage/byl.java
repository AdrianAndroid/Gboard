package defpackage;

/* compiled from: PG */
/* renamed from: byl  reason: default package */
/* loaded from: classes.dex */
public final class byl {
    public static final byl a = a().a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    private final String v;

    public byl() {
    }

    public byl(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.v = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.s = f6;
        this.t = f7;
        this.u = f8;
    }

    public static byk a() {
        byk bykVar = new byk();
        bykVar.u("");
        bykVar.l("");
        bykVar.d("");
        bykVar.b("");
        bykVar.m("");
        bykVar.f("");
        bykVar.j("");
        bykVar.p("");
        bykVar.o("");
        bykVar.n("");
        bykVar.k("");
        bykVar.e("");
        bykVar.s("");
        bykVar.v(0.0f);
        bykVar.g(1.0f);
        bykVar.c(1.0f);
        bykVar.t(1.0f);
        bykVar.i(1.0f);
        bykVar.r(1.0f);
        bykVar.q(1.0f);
        bykVar.h(-9.0f);
        return bykVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byl) {
            byl bylVar = (byl) obj;
            if (this.b.equals(bylVar.b) && this.c.equals(bylVar.c) && this.d.equals(bylVar.d) && this.e.equals(bylVar.e) && this.f.equals(bylVar.f) && this.g.equals(bylVar.g) && this.h.equals(bylVar.h) && this.i.equals(bylVar.i) && this.v.equals(bylVar.v) && this.j.equals(bylVar.j) && this.k.equals(bylVar.k) && this.l.equals(bylVar.l) && this.m.equals(bylVar.m) && Float.floatToIntBits(this.n) == Float.floatToIntBits(bylVar.n) && Float.floatToIntBits(this.o) == Float.floatToIntBits(bylVar.o) && Float.floatToIntBits(this.p) == Float.floatToIntBits(bylVar.p) && Float.floatToIntBits(this.q) == Float.floatToIntBits(bylVar.q) && Float.floatToIntBits(this.r) == Float.floatToIntBits(bylVar.r) && Float.floatToIntBits(this.s) == Float.floatToIntBits(bylVar.s) && Float.floatToIntBits(this.t) == Float.floatToIntBits(bylVar.t) && Float.floatToIntBits(this.u) == Float.floatToIntBits(bylVar.u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ Float.floatToIntBits(this.n)) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003) ^ Float.floatToIntBits(this.p)) * 1000003) ^ Float.floatToIntBits(this.q)) * 1000003) ^ Float.floatToIntBits(this.r)) * 1000003) ^ Float.floatToIntBits(this.s)) * 1000003) ^ Float.floatToIntBits(this.t)) * 1000003) ^ Float.floatToIntBits(this.u);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.g;
        String str7 = this.h;
        String str8 = this.i;
        String str9 = this.v;
        String str10 = this.j;
        String str11 = this.k;
        String str12 = this.l;
        String str13 = this.m;
        float f = this.n;
        float f2 = this.o;
        float f3 = this.p;
        float f4 = this.q;
        float f5 = this.r;
        float f6 = this.s;
        float f7 = this.t;
        float f8 = this.u;
        return "TransformerExpressionFilePackage{tokenTablePath=" + str + ", modelPath=" + str2 + ", blocklistPath=" + str3 + ", allowlistPath=" + str4 + ", peopleNamesPath=" + str5 + ", conceptTablePath=" + str6 + ", emojiMappingPath=" + str7 + ", ruleBasedPredictionPath=" + str8 + ", querySetPath=" + str9 + ", queryMappingPath=" + str10 + ", emojiToEntityPath=" + str11 + ", conceptDisplayNameFilePath=" + str12 + ", stopwordsPath=" + str13 + ", triggeringThreshold=" + f + ", conceptThreshold=" + f2 + ", bitmojiQueryThreshold=" + f3 + ", tenorQueryThreshold=" + f4 + ", dynamicArtThreshold=" + f5 + ", semanticEmojiThreshold=" + f6 + ", semanticEmojiForSearchThreshold=" + f7 + ", contextualEmojiKitchenThreshold=" + f8 + "}";
    }
}
