package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: cqj  reason: default package */
/* loaded from: classes.dex */
final class cqj {
    public final String a;
    public final Uri b;

    public cqj(String str, Uri uri) {
        if (str != null) {
            this.a = str;
            if (uri != null) {
                this.b = uri;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null mimeType");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cqj a(String str, Uri uri) {
        return new cqj(str, uri);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqj) {
            cqj cqjVar = (cqj) obj;
            if (this.a.equals(cqjVar.a) && this.b.equals(cqjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String obj = this.b.toString();
        return "MimeTypeAndUri{mimeType=" + str + ", uri=" + obj + "}";
    }

    public cqj() {
    }
}
