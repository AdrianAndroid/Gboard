package defpackage;

/* compiled from: PG */
/* renamed from: hbu  reason: default package */
/* loaded from: classes.dex */
public final class hbu {
    public final int a;
    public final int b;

    public hbu() {
    }

    public hbu(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbu) {
            hbu hbuVar = (hbu) obj;
            if (this.a == hbuVar.a && this.b == hbuVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1525764945) ^ 1237) * 1000003;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return "EmojiListOptions{rowHeight=" + i + ", columns=" + i2 + ", emojiIconBackground=0, emojiPlaceHolderDrawable=0, popupViewController=null, popupWindowFocusable=false, popupWindowBackgroundDrawable=null}";
    }
}
