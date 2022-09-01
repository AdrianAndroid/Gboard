package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: bxr  reason: default package */
/* loaded from: classes.dex */
public final class bxr {
    public static final bxr a = a().a();
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
    public final float l;
    public final float m;
    public final boolean n;
    public final float o;
    public final boolean p;
    public final float q;
    public final float r;
    public final float s;

    public bxr() {
    }

    public bxr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, float f, float f2, boolean z, float f3, boolean z2, float f4, float f5, float f6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = f;
        this.m = f2;
        this.n = z;
        this.o = f3;
        this.p = z2;
        this.q = f4;
        this.r = f5;
        this.s = f6;
    }

    public static bxq a() {
        bxq bxqVar = new bxq();
        bxqVar.r("");
        bxqVar.k("");
        bxqVar.e("");
        bxqVar.g("");
        bxqVar.p("");
        bxqVar.o("");
        bxqVar.l("");
        bxqVar.h("");
        bxqVar.c("");
        bxqVar.d("");
        bxqVar.s(0.0f);
        bxqVar.b(0.0f);
        bxqVar.i(false);
        bxqVar.q(0.0f);
        bxqVar.j(false);
        bxqVar.n(0.0079365f);
        bxqVar.m(0.0f);
        bxqVar.f(-9.0f);
        return bxqVar;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxr) {
            bxr bxrVar = (bxr) obj;
            if (this.b.equals(bxrVar.b) && this.c.equals(bxrVar.c) && this.d.equals(bxrVar.d) && this.e.equals(bxrVar.e) && this.f.equals(bxrVar.f) && this.g.equals(bxrVar.g) && this.h.equals(bxrVar.h) && this.i.equals(bxrVar.i) && this.j.equals(bxrVar.j) && this.k.equals(bxrVar.k) && Float.floatToIntBits(this.l) == Float.floatToIntBits(bxrVar.l) && Float.floatToIntBits(this.m) == Float.floatToIntBits(bxrVar.m) && this.n == bxrVar.n && Float.floatToIntBits(this.o) == Float.floatToIntBits(bxrVar.o) && this.p == bxrVar.p && Float.floatToIntBits(this.q) == Float.floatToIntBits(bxrVar.q) && Float.floatToIntBits(this.r) == Float.floatToIntBits(bxrVar.r) && Float.floatToIntBits(this.s) == Float.floatToIntBits(bxrVar.s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003;
        if (true == this.p) {
            i = 1231;
        }
        return ((((((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.q)) * 1000003) ^ Float.floatToIntBits(this.r)) * 1000003) ^ Float.floatToIntBits(this.s);
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
        String str9 = this.j;
        String str10 = this.k;
        float f = this.l;
        float f2 = this.m;
        boolean z = this.n;
        float f3 = this.o;
        boolean z2 = this.p;
        float f4 = this.q;
        float f5 = this.r;
        float f6 = this.s;
        return "ConceptPredictorFilePackage{tokenTablePath=" + str + ", modelPath=" + str2 + ", emojiMappingPath=" + str3 + ", ruleBasedPredictionPath=" + str4 + ", conceptTablePath=" + str5 + ", querySetPath=" + str6 + ", queryMappingPath=" + str7 + ", emojiToEntityPath=" + str8 + ", blocklistFilePath=" + str9 + ", conceptDisplayNameFilePath=" + str10 + ", unkThreshold=" + f + ", bitmojiQueryThreshold=" + f2 + ", hasBitmojiQueryThreshold=" + z + ", tenorQueryThreshold=" + f3 + ", hasTenorQueryThreshold=" + z2 + ", queryPredictionSlope=" + f4 + ", queryPredictionIntercept=" + f5 + ", contextualEmojiKitchenThreshold=" + f6 + "}";
    }
}
