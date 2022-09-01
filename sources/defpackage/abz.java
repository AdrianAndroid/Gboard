package defpackage;

import android.content.ClipDescription;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: abz  reason: default package */
/* loaded from: classes.dex */
public final class abz implements aca {
    private final Uri a;
    private final ClipDescription b;
    private final Uri c;

    public abz(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = uri;
        this.b = clipDescription;
        this.c = uri2;
    }

    @Override // defpackage.aca
    public final ClipDescription a() {
        return this.b;
    }

    @Override // defpackage.aca
    public final Uri b() {
        return this.a;
    }

    @Override // defpackage.aca
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.aca
    public final Object d() {
        return null;
    }

    @Override // defpackage.aca
    public final void e() {
    }
}
