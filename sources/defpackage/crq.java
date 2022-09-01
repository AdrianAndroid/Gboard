package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: crq  reason: default package */
/* loaded from: classes.dex */
public final class crq {
    public final Uri a;
    public final File b;

    public crq() {
    }

    public crq(Uri uri, File file) {
        this.a = uri;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crq) {
            crq crqVar = (crq) obj;
            if (this.a.equals(crqVar.a) && this.b.equals(crqVar.b)) {
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
        return "UriFile{uri=" + obj + ", file=" + obj2 + "}";
    }
}
