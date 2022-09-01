package defpackage;

/* compiled from: PG */
/* renamed from: hby  reason: default package */
/* loaded from: classes.dex */
public final class hby {
    public final float a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;

    public hby() {
    }

    public hby(float f, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = z;
        this.h = i6;
    }

    public static hbx a() {
        hbx hbxVar = new hbx();
        hbxVar.b(9);
        hbxVar.c = (short) (hbxVar.c | 192);
        hbxVar.g(-1.0f);
        hbxVar.f(0);
        hbxVar.c(0);
        hbxVar.e(0);
        short s = hbxVar.c;
        hbxVar.b = -1;
        hbxVar.a = true;
        hbxVar.c = (short) (s | 7936);
        return hbxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hby) {
            hby hbyVar = (hby) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hbyVar.a) && this.b == hbyVar.b && this.c == hbyVar.c && this.d == hbyVar.d && this.e == hbyVar.e && this.f == hbyVar.f && this.g == hbyVar.g && this.h == hbyVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * (-721379959)) ^ 1237) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1525764945) ^ 1237) * 1000003) ^ this.h) * 1000003;
    }

    public final String toString() {
        float f = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        boolean z = this.g;
        int i6 = this.h;
        return "EmojiPickerBodyOptions{rows=" + f + ", rowHeight=" + i + ", maxRecentCount=" + i2 + ", poolSize=" + i3 + ", columns=" + i4 + ", minRowsPerCategory=" + i5 + ", emojiIconBackground=0, hideCategoryTitle=false, displayEmojiVariants=" + z + ", emojiPlaceHolderDrawable=0, customEmojiTypeface=0, popupViewController=null, popupWindowFocusable=false, categoryIconMinWidth=" + i6 + ", popupWindowBackgroundDrawable=null}";
    }
}
