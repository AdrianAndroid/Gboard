package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: gps  reason: default package */
/* loaded from: classes.dex */
public final class gps {
    public final Uri a;

    public gps(Uri uri) {
        this.a = uri;
    }

    public final String a() {
        return this.a.getPath();
    }

    public final gps b(String str) {
        return new gps(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }
}
