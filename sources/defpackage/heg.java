package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: heg  reason: default package */
/* loaded from: classes.dex */
public final class heg {
    public final hee a;
    public final Bitmap b;

    public heg(hee heeVar, Bitmap bitmap) {
        if (heeVar != null) {
            this.a = heeVar;
            if (bitmap != null) {
                this.b = bitmap;
                return;
            }
            throw new NullPointerException("Null bitmap");
        }
        throw new NullPointerException("Null drawParams");
    }

    public static heg a(hee heeVar, Bitmap bitmap) {
        return new heg(heeVar, bitmap);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof heg) {
            heg hegVar = (heg) obj;
            if (this.a.equals(hegVar.a) && this.b.equals(hegVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return "EmojiViewBitmap{drawParams=" + obj + ", bitmap=" + obj2 + "}";
    }

    public heg() {
    }
}
