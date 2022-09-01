package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: bxu  reason: default package */
/* loaded from: classes.dex */
public final class bxu {
    public static final bxu a = a().a();
    public final String b;
    public final String c;
    public final int d;
    private final String e;
    private final float f;
    private final float g;
    private final boolean h;

    public bxu() {
    }

    public bxu(String str, String str2, String str3, float f, float f2, boolean z, int i) {
        this.e = str;
        this.b = str2;
        this.c = str3;
        this.f = f;
        this.g = f2;
        this.h = z;
        this.d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxt a() {
        bxt bxtVar = new bxt();
        bxtVar.c("");
        bxtVar.e("");
        bxtVar.b("");
        bxtVar.h(0);
        bxtVar.g(0.0f);
        bxtVar.f(1.0f);
        bxtVar.d(true);
        return bxtVar;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(this.b) && this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxu) {
            bxu bxuVar = (bxu) obj;
            if (this.e.equals(bxuVar.e) && this.b.equals(bxuVar.b) && this.c.equals(bxuVar.c) && Float.floatToIntBits(this.f) == Float.floatToIntBits(bxuVar.f) && Float.floatToIntBits(this.g) == Float.floatToIntBits(bxuVar.g) && this.h == bxuVar.h && this.d == bxuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.e;
        String str2 = this.b;
        String str3 = this.c;
        float f = this.f;
        float f2 = this.g;
        boolean z = this.h;
        int i = this.d;
        return "ExpressiveConceptEngineFilePackage{emojiMappingPath=" + str + ", modelPath=" + str2 + ", blocklistPath=" + str3 + ", threshold=" + f + ", scalingFactor=" + f2 + ", isQrnnModel=" + z + ", version=" + i + "}";
    }
}
