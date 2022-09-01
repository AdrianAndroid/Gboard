package defpackage;

/* compiled from: PG */
/* renamed from: chr  reason: default package */
/* loaded from: classes.dex */
public final class chr {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public chr() {
    }

    public chr(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chr) {
            chr chrVar = (chr) obj;
            if (this.a == chrVar.a && this.b == chrVar.b && this.c == chrVar.c && this.d == chrVar.d && this.e == chrVar.e && this.f == chrVar.f && this.g == chrVar.g && this.h == chrVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.h ^ ((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        int i6 = this.g;
        int i7 = this.h;
        return "BackupMetadata{fileSize=" + j + ", favStickerPack=" + i + ", emojiShare=" + i2 + ", emoticonShare=" + i3 + ", gifShare=" + i4 + ", stickerShare=" + i5 + ", bitmojiShare=" + i6 + ", contentSuggestionShare=" + i7 + "}";
    }
}
