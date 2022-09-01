package defpackage;

/* compiled from: PG */
/* renamed from: bxx  reason: default package */
/* loaded from: classes.dex */
public final class bxx {
    public static final bxx a = a().a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final float g;
    public final boolean h;
    public final float i;
    public final boolean j;
    public final float k;
    public final boolean l;

    public bxx() {
    }

    public bxx(String str, String str2, String str3, String str4, String str5, float f, boolean z, float f2, boolean z2, float f3, boolean z3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = f;
        this.h = z;
        this.i = f2;
        this.j = z2;
        this.k = f3;
        this.l = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxw a() {
        bxw bxwVar = new bxw();
        bxwVar.k("");
        bxwVar.h("");
        bxwVar.c("");
        bxwVar.b("");
        bxwVar.j("");
        bxwVar.l(0.0f);
        bxwVar.f(false);
        bxwVar.i(0.0f);
        bxwVar.e(false);
        bxwVar.g(0.0f);
        bxwVar.d(false);
        return bxwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxx) {
            bxx bxxVar = (bxx) obj;
            if (this.b.equals(bxxVar.b) && this.c.equals(bxxVar.c) && this.d.equals(bxxVar.d) && this.e.equals(bxxVar.e) && this.f.equals(bxxVar.f) && Float.floatToIntBits(this.g) == Float.floatToIntBits(bxxVar.g) && this.h == bxxVar.h && Float.floatToIntBits(this.i) == Float.floatToIntBits(bxxVar.i) && this.j == bxxVar.j && Float.floatToIntBits(this.k) == Float.floatToIntBits(bxxVar.k) && this.l == bxxVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.k)) * 1000003;
        if (true == this.l) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        String str5 = this.f;
        float f = this.g;
        boolean z = this.h;
        float f2 = this.i;
        boolean z2 = this.j;
        float f3 = this.k;
        boolean z3 = this.l;
        return "ExpressiveConceptTriggeringEngineFilePackage{tokenSymbolTablePath=" + str + ", modelPath=" + str2 + ", blocklistPath=" + str3 + ", allowlistPath=" + str4 + ", peopleNamesPath=" + str5 + ", triggeringThreshold=" + f + ", hasTriggeringThreshold=" + z + ", neutralTriggeringWeight=" + f2 + ", hasNeutralTriggeringWeight=" + z2 + ", incompleteSentenceWeight=" + f3 + ", hasIncompleteSentenceWeight=" + z3 + "}";
    }
}
