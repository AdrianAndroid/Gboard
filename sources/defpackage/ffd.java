package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ffd  reason: default package */
/* loaded from: classes.dex */
public final class ffd {
    public final jav a;
    public final Collection b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ffd() {
    }

    public ffd(jav javVar, Collection collection, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = javVar;
        this.b = collection;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffd) {
            ffd ffdVar = (ffd) obj;
            jav javVar = this.a;
            if (javVar != null ? javVar.equals(ffdVar.a) : ffdVar.a == null) {
                Collection collection = this.b;
                if (collection != null ? collection.equals(ffdVar.b) : ffdVar.b == null) {
                    String str = this.c;
                    if (str != null ? str.equals(ffdVar.c) : ffdVar.c == null) {
                        String str2 = this.d;
                        if (str2 != null ? str2.equals(ffdVar.d) : ffdVar.d == null) {
                            if (this.e == ffdVar.e && this.f == ffdVar.f && this.g == ffdVar.g && this.h == ffdVar.h) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        return "VoiceSessionParams{audioInputStream=null, primaryLanguageTag=" + valueOf + ", secondaryLanguageTags=" + valueOf2 + ", triggerApplicationId=" + str + ", triggerFieldName=" + str2 + ", blockOffensiveWords=" + z + ", autoStarted=" + z2 + ", fallbackAvailable=" + z3 + ", suppressBeepSoundAtRecognitionStart=false, connectOnly=" + z4 + "}";
    }

    public final int hashCode() {
        jav javVar = this.a;
        int i = 0;
        int hashCode = ((javVar == null ? 0 : javVar.hashCode()) ^ (-721379959)) * 1000003;
        Collection collection = this.b;
        int hashCode2 = (hashCode ^ (collection == null ? 0 : collection.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = 1231;
        int i3 = (((((((((hashCode3 ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        if (true != this.h) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }
}
